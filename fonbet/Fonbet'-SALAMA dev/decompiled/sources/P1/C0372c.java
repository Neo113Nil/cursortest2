package P1;

import C0.J;
import C1.C0095a;

/* renamed from: P1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372c implements F1.k {

    /* renamed from: a, reason: collision with root package name */
    public final C0371b f5158a = new C0371b(null, 1);

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f5159b = new C0095a(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f5160c;

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        F1.h hVar;
        int i7;
        C0095a c0095a = new C0095a(10);
        int i8 = 0;
        while (true) {
            hVar = (F1.h) lVar;
            hVar.c((byte[]) c0095a.f1465c, 0, 10, false);
            c0095a.D(0);
            if (c0095a.v() != 4801587) {
                break;
            }
            c0095a.E(3);
            int s7 = c0095a.s();
            i8 += s7 + 10;
            hVar.b(s7, false);
        }
        hVar.f2536f = 0;
        hVar.b(i8, false);
        int i9 = 0;
        int i10 = i8;
        while (true) {
            int i11 = 7;
            hVar.c((byte[]) c0095a.f1465c, 0, 7, false);
            c0095a.D(0);
            int y4 = c0095a.y();
            if (y4 == 44096 || y4 == 44097) {
                i9++;
                if (i9 >= 4) {
                    return true;
                }
                byte[] bArr = (byte[]) c0095a.f1465c;
                if (bArr.length < 7) {
                    i7 = -1;
                } else {
                    int i12 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i12 == 65535) {
                        i12 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i11 = 4;
                    }
                    if (y4 == 44097) {
                        i11 += 2;
                    }
                    i7 = i12 + i11;
                }
                if (i7 == -1) {
                    return false;
                }
                hVar.b(i7 - 7, false);
            } else {
                hVar.f2536f = 0;
                i10++;
                if (i10 - i8 >= 8192) {
                    return false;
                }
                hVar.b(i10, false);
                i9 = 0;
            }
        }
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.f5158a.c(mVar, new J(0, 1));
        mVar.n();
        mVar.m(new F1.n(-9223372036854775807L));
    }

    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) {
        C0095a c0095a = this.f5159b;
        int read = ((F1.h) lVar).read((byte[]) c0095a.f1465c, 0, 16384);
        if (read == -1) {
            return -1;
        }
        c0095a.D(0);
        c0095a.C(read);
        boolean z4 = this.f5160c;
        C0371b c0371b = this.f5158a;
        if (!z4) {
            c0371b.e(4, 0L);
            this.f5160c = true;
        }
        c0371b.a(c0095a);
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        this.f5160c = false;
        this.f5158a.b();
    }

    @Override // F1.k
    public final void release() {
    }
}
