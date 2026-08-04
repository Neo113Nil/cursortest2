package O1;

import C1.C0095a;
import com.google.android.gms.common.internal.w;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p146u2.C0963w;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;

/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0953l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f4945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
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

    @Override // p146u2.InterfaceC0953l
    public InterfaceC0954m a() {
        return new C0963w((String) this.f4946e, this.f4942a, this.f4943b, this.f4944c, (w) this.f4945d);
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

    public boolean c(F1.h hVar) throws InterruptedIOException {
        int i7;
        p151v2.a.h(hVar != null);
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
                    int iB = gVar.f4950d;
                    if ((gVar.f4947a & 1) == 1 && c0095a.f1464b == 0) {
                        iB += b(0);
                        i7 = this.f4943b;
                    } else {
                        i7 = 0;
                    }
                    try {
                        hVar.q(iB);
                        this.f4942a = i7;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int iB2 = b(this.f4942a);
            int i9 = this.f4942a + this.f4943b;
            if (iB2 > 0) {
                c0095a.e(c0095a.f1464b + iB2);
                try {
                    hVar.a((byte[]) c0095a.f1465c, c0095a.f1464b, iB2, false);
                    c0095a.C(c0095a.f1464b + iB2);
                    this.f4944c = gVar.f4952f[i9 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i9 == gVar.f4949c) {
                i9 = -1;
            }
            this.f4942a = i9;
        }
        return true;
    }
}
