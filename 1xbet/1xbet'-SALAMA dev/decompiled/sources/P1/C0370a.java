package P1;

import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: P1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0370a implements F1.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0371b f5143a = new C0371b(null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f5144b = new C0095a(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5145c;

    @Override // F1.k
    public final boolean a(F1.l lVar) throws EOFException, InterruptedIOException {
        F1.h hVar;
        int iB;
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
            int iS = c0095a.s();
            i7 += iS + 10;
            hVar.b(iS, false);
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
                    iB = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iB = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b7 = bArr[4];
                    iB = AbstractC0096b.b((b7 & 192) >> 6, b7 & 63);
                }
                if (iB == -1) {
                    return false;
                }
                hVar.b(iB - 6, false);
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
    public final int f(F1.l lVar, E4.y yVar) throws EOFException, InterruptedIOException {
        C0095a c0095a = this.f5144b;
        int i7 = ((F1.h) lVar).read((byte[]) c0095a.f1465c, 0, 2786);
        if (i7 == -1) {
            return -1;
        }
        c0095a.D(0);
        c0095a.C(i7);
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
