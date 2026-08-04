package O1;

import A1.C0045t0;
import C1.C0095a;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f4952f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0095a f4953g = new C0095a(255);

    public final boolean a(F1.h hVar, boolean z4) throws C0045t0, EOFException {
        boolean zC;
        boolean zC2;
        this.f4947a = 0;
        this.f4948b = 0L;
        this.f4949c = 0;
        this.f4950d = 0;
        this.f4951e = 0;
        C0095a c0095a = this.f4953g;
        c0095a.A(27);
        try {
            zC = hVar.c((byte[]) c0095a.f1465c, 0, 27, z4);
        } catch (EOFException e7) {
            if (!z4) {
                throw e7;
            }
            zC = false;
        }
        if (!zC || c0095a.u() != 1332176723) {
            return false;
        }
        if (c0095a.t() != 0) {
            if (z4) {
                return false;
            }
            throw C0045t0.c("unsupported bit stream revision");
        }
        this.f4947a = c0095a.t();
        this.f4948b = c0095a.j();
        c0095a.k();
        c0095a.k();
        c0095a.k();
        int iT = c0095a.t();
        this.f4949c = iT;
        this.f4950d = iT + 27;
        c0095a.A(iT);
        try {
            zC2 = hVar.c((byte[]) c0095a.f1465c, 0, this.f4949c, z4);
        } catch (EOFException e8) {
            if (!z4) {
                throw e8;
            }
            zC2 = false;
        }
        if (!zC2) {
            return false;
        }
        for (int i7 = 0; i7 < this.f4949c; i7++) {
            int iT2 = c0095a.t();
            this.f4952f[i7] = iT2;
            this.f4951e += iT2;
        }
        return true;
    }

    public final boolean b(F1.h hVar, long j) throws EOFException, InterruptedIOException {
        boolean zC;
        int iMin;
        p151v2.a.f(hVar.f2534d == hVar.d());
        C0095a c0095a = this.f4953g;
        c0095a.A(4);
        while (true) {
            if (j != -1 && hVar.f2534d + 4 >= j) {
                break;
            }
            try {
                zC = hVar.c((byte[]) c0095a.f1465c, 0, 4, true);
            } catch (EOFException unused) {
                zC = false;
            }
            if (!zC) {
                break;
            }
            c0095a.D(0);
            if (c0095a.u() == 1332176723) {
                hVar.f2536f = 0;
                return true;
            }
            hVar.q(1);
        }
        do {
            if (j != -1 && hVar.f2534d >= j) {
                break;
            }
            iMin = Math.min(hVar.f2537x, 1);
            hVar.i(iMin);
            if (iMin == 0) {
                byte[] bArr = hVar.f2531a;
                iMin = hVar.g(bArr, 0, Math.min(1, bArr.length), 0, true);
            }
            if (iMin != -1) {
                hVar.f2534d += (long) iMin;
            }
        } while (iMin != -1);
        return false;
    }
}
