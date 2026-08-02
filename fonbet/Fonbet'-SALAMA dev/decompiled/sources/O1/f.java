package O1;

import C1.C0095a;
import com.google.android.gms.common.internal.w;
import java.io.EOFException;
import u2.C1645w;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;

/* loaded from: classes.dex */
public final class f implements InterfaceC1635l {

    /* renamed from: a, reason: collision with root package name */
    public int f4942a;

    /* renamed from: b, reason: collision with root package name */
    public int f4943b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4944c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f4945d;

    /* renamed from: e, reason: collision with root package name */
    public Object f4946e;

    public f(int i7) {
        switch (i7) {
            case 1:
                this.f4945d = new w(20);
                this.f4942a = 8000;
                this.f4943b = 8000;
                break;
            default:
                this.f4945d = new g();
                this.f4946e = new C0095a(new byte[65025], 0);
                this.f4942a = -1;
                break;
        }
    }

    @Override // u2.InterfaceC1635l
    public InterfaceC1636m a() {
        return new C1645w((String) this.f4946e, this.f4942a, this.f4943b, this.f4944c, (w) this.f4945d);
    }

    public int b(int i7) {
        int i8;
        int i9 = 0;
        this.f4943b = 0;
        do {
            int i10 = this.f4943b;
            int i11 = i7 + i10;
            g gVar = (g) this.f4945d;
            if (i11 >= gVar.f4949c) {
                break;
            }
            int[] iArr = gVar.f4952f;
            this.f4943b = i10 + 1;
            i8 = iArr[i10 + i7];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public boolean c(F1.h hVar) {
        int i7;
        AbstractC1664a.h(hVar != null);
        boolean z4 = this.f4944c;
        C0095a c0095a = (C0095a) this.f4946e;
        if (z4) {
            this.f4944c = false;
            c0095a.A(0);
        }
        while (!this.f4944c) {
            int i8 = this.f4942a;
            g gVar = (g) this.f4945d;
            if (i8 < 0) {
                if (gVar.b(hVar, -1L) && gVar.a(hVar, true)) {
                    int i9 = gVar.f4950d;
                    if ((gVar.f4947a & 1) == 1 && c0095a.f1464b == 0) {
                        i9 += b(0);
                        i7 = this.f4943b;
                    } else {
                        i7 = 0;
                    }
                    try {
                        hVar.q(i9);
                        this.f4942a = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int b7 = b(this.f4942a);
            int i10 = this.f4942a + this.f4943b;
            if (b7 > 0) {
                c0095a.e(c0095a.f1464b + b7);
                try {
                    hVar.a((byte[]) c0095a.f1465c, c0095a.f1464b, b7, false);
                    c0095a.C(c0095a.f1464b + b7);
                    this.f4944c = gVar.f4952f[i10 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i10 == gVar.f4949c) {
                i10 = -1;
            }
            this.f4942a = i10;
        }
        return true;
    }
}
