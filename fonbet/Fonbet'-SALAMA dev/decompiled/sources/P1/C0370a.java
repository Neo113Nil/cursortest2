package P1;

import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;

/* renamed from: P1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0370a implements F1.k {

    /* renamed from: a, reason: collision with root package name */
    public final C0371b f5143a = new C0371b(null, 0);

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f5144b = new C0095a(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5145c;

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        F1.h hVar;
        int b7;
        C0095a c0095a = new C0095a(10);
        int i7 = 0;
        while (true) {
            hVar = (F1.h) lVar;
            hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
            c0095a.D(0);
            if (c0095a.v() != 4801587) {
                break;
            }
            c0095a.E(3);
            int s7 = c0095a.s();
            i7 += s7 + 10;
            hVar.b(s7, false);
        }
        hVar.f2536f = 0;
        hVar.b(i7, false);
        int i8 = 0;
        int i9 = i7;
        while (true) {
            hVar.c((byte[]) c0095a.f1465c, 0, 6, false);
            c0095a.D(0);
            if (c0095a.y() != 2935) {
                hVar.f2536f = 0;
                i9++;
                if (i9 - i7 >= 8192) {
                    return false;
                }
                hVar.b(i9, false);
                i8 = 0;
            } else {
                i8++;
                if (i8 >= 4) {
                    return true;
                }
                byte[] bArr = (byte[]) c0095a.f1465c;
                if (bArr.length < 6) {
                    b7 = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    b7 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b8 = bArr[4];
                    b7 = AbstractC0096b.b((b8 & 192) >> 6, b8 & 63);
                }
                if (b7 == -1) {
                    return false;
                }
                hVar.b(b7 - 6, false);
            }
        }
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f5143a.c(mVar, new J(0, 1));
        mVar.n();
        mVar.m(new F1.n(-9223372036854775807L));
    }

    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) {
        C0095a c0095a = this.f5144b;
        int read = ((F1.h) lVar).read((byte[]) c0095a.f1465c, 0, 2786);
        if (read == -1) {
            return -1;
        }
        c0095a.D(0);
        c0095a.C(read);
        boolean z4 = this.f5145c;
        C0371b c0371b = this.f5143a;
        if (!z4) {
            c0371b.e(4, 0L);
            this.f5145c = true;
        }
        c0371b.a(c0095a);
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f5145c = false;
        this.f5143a.b();
    }

    @Override // F1.k
    public final void release() {
    }
}
