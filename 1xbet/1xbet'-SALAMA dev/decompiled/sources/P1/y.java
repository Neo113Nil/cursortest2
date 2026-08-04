package P1;

import C0.J;
import C1.C0095a;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbd;
import java.io.EOFException;
import java.io.InterruptedIOException;
import p155w1.C1013m0;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class y implements F1.k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5395f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5396g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f5397h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public I1.b f5398i;
    public F1.m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5399k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p151v2.s f5390a = new p151v2.s(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5392c = new C0095a(4096);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f5391b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f5393d = new w(0);

    @Override // F1.k
    public final boolean a(F1.l lVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        F1.h hVar = (F1.h) lVar;
        hVar.c(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        hVar.b(bArr[13] & 7, false);
        hVar.c(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        this.j = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0270  */
    @Override // F1.k
    public final int f(F1.l lVar, E4.y yVar) throws EOFException, InterruptedIOException {
        h jVar;
        long jC;
        p151v2.a.i(this.j);
        long j = ((F1.h) lVar).f2533c;
        int i7 = 1;
        long j3 = -9223372036854775807L;
        w wVar = this.f5393d;
        if (j != -1 && !wVar.f5377d) {
            boolean z4 = wVar.f5379f;
            C0095a c0095a = wVar.f5376c;
            if (!z4) {
                F1.h hVar = (F1.h) lVar;
                long j7 = hVar.f2533c;
                int iMin = (int) Math.min(20000L, j7);
                long j8 = j7 - ((long) iMin);
                if (hVar.f2534d != j8) {
                    yVar.f2247a = j8;
                } else {
                    c0095a.A(iMin);
                    hVar.f2536f = 0;
                    hVar.c((byte[]) c0095a.f1465c, 0, iMin, false);
                    int i8 = c0095a.f1463a;
                    for (int i9 = c0095a.f1464b - 4; i9 >= i8; i9--) {
                        if (w.b(i9, (byte[]) c0095a.f1465c) == 442) {
                            c0095a.D(i9 + 4);
                            long jC2 = w.c(c0095a);
                            if (jC2 != -9223372036854775807L) {
                                j3 = jC2;
                                break;
                            }
                        }
                    }
                    wVar.f5381h = j3;
                    wVar.f5379f = true;
                    i7 = 0;
                }
            } else {
                if (wVar.f5381h == -9223372036854775807L) {
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                if (wVar.f5378e) {
                    long j9 = wVar.f5380g;
                    if (j9 == -9223372036854775807L) {
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    p151v2.s sVar = wVar.f5375b;
                    long jB = sVar.b(wVar.f5381h) - sVar.b(j9);
                    wVar.f5382i = jB;
                    if (jB < 0) {
                        Log.w("PsDurationReader", "Invalid duration: " + wVar.f5382i + ". Using TIME_UNSET instead.");
                        wVar.f5382i = -9223372036854775807L;
                    }
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                F1.h hVar2 = (F1.h) lVar;
                int iMin2 = (int) Math.min(20000L, hVar2.f2533c);
                long j10 = 0;
                if (hVar2.f2534d != j10) {
                    yVar.f2247a = j10;
                } else {
                    c0095a.A(iMin2);
                    hVar2.f2536f = 0;
                    hVar2.c((byte[]) c0095a.f1465c, 0, iMin2, false);
                    int i10 = c0095a.f1463a;
                    int i11 = c0095a.f1464b;
                    while (true) {
                        if (i10 >= i11 - 3) {
                            jC = -9223372036854775807L;
                            break;
                        }
                        if (w.b(i10, (byte[]) c0095a.f1465c) == 442) {
                            c0095a.D(i10 + 4);
                            jC = w.c(c0095a);
                            if (jC != -9223372036854775807L) {
                                break;
                            }
                        }
                        i10++;
                    }
                    wVar.f5380g = jC;
                    wVar.f5378e = true;
                    i7 = 0;
                }
            }
            return i7;
        }
        if (!this.f5399k) {
            this.f5399k = true;
            long j11 = wVar.f5382i;
            if (j11 != -9223372036854775807L) {
                I1.b bVar = new I1.b(new C1013m0(3), new V0(wVar.f5375b), j11, j11 + 1, 0L, j, 188L, zzbbd.zzq.zzf);
                this.f5398i = bVar;
                this.j.m(bVar.f3505a);
            } else {
                this.j.m(new F1.n(j11));
            }
        }
        I1.b bVar2 = this.f5398i;
        if (bVar2 != null && bVar2.f3507c != null) {
            return bVar2.b((F1.h) lVar, yVar);
        }
        F1.h hVar3 = (F1.h) lVar;
        hVar3.f2536f = 0;
        long jD = j != -1 ? j - hVar3.d() : -1L;
        if (jD != -1 && jD < 4) {
            return -1;
        }
        C0095a c0095a2 = this.f5392c;
        if (!hVar3.c((byte[]) c0095a2.f1465c, 0, 4, true)) {
            return -1;
        }
        c0095a2.D(0);
        int iG = c0095a2.g();
        if (iG == 441) {
            return -1;
        }
        if (iG == 442) {
            hVar3.c((byte[]) c0095a2.f1465c, 0, 10, false);
            c0095a2.D(9);
            hVar3.q((c0095a2.t() & 7) + 14);
            return 0;
        }
        if (iG == 443) {
            hVar3.c((byte[]) c0095a2.f1465c, 0, 2, false);
            c0095a2.D(0);
            hVar3.q(c0095a2.y() + 6);
            return 0;
        }
        if (((iG & (-256)) >> 8) != 1) {
            hVar3.q(1);
            return 0;
        }
        int i12 = iG & 255;
        SparseArray sparseArray = this.f5391b;
        x xVar = (x) sparseArray.get(i12);
        if (!this.f5394e) {
            if (xVar == null) {
                h hVar4 = null;
                if (i12 == 189) {
                    jVar = new C0371b(null, 0);
                    this.f5395f = true;
                    this.f5397h = hVar3.f2534d;
                } else if ((iG & 224) == 192) {
                    jVar = new t(null);
                    this.f5395f = true;
                    this.f5397h = hVar3.f2534d;
                } else if ((iG & 240) == 224) {
                    jVar = new j(null);
                    this.f5396g = true;
                    this.f5397h = hVar3.f2534d;
                } else if (hVar4 != null) {
                    hVar4.c(this.j, new J(i12, 256));
                    xVar = new x(hVar4, this.f5390a);
                    sparseArray.put(i12, xVar);
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                    hVar4.c(this.j, new J(i12, 256));
                    xVar = new x(hVar4, this.f5390a);
                    sparseArray.put(i12, xVar);
                }
            }
            if (hVar3.f2534d > ((this.f5395f && this.f5396g) ? this.f5397h + 8192 : 1048576L)) {
                this.f5394e = true;
                this.j.n();
            }
        }
        hVar3.c((byte[]) c0095a2.f1465c, 0, 2, false);
        c0095a2.D(0);
        int iY = c0095a2.y() + 6;
        if (xVar == null) {
            hVar3.q(iY);
        } else {
            c0095a2.A(iY);
            hVar3.a((byte[]) c0095a2.f1465c, 0, iY, false);
            c0095a2.D(6);
            F1.x xVar2 = xVar.f5385c;
            c0095a2.f(xVar2.f2586d, 0, 3);
            xVar2.o(0);
            xVar2.r(8);
            xVar.f5386d = xVar2.h();
            xVar.f5387e = xVar2.h();
            xVar2.r(6);
            c0095a2.f(xVar2.f2586d, 0, xVar2.i(8));
            xVar2.o(0);
            xVar.f5389g = 0L;
            if (xVar.f5386d) {
                xVar2.r(4);
                long jI = ((long) xVar2.i(3)) << 30;
                xVar2.r(1);
                long jI2 = jI | ((long) (xVar2.i(15) << 15));
                xVar2.r(1);
                long jI3 = jI2 | ((long) xVar2.i(15));
                xVar2.r(1);
                boolean z7 = xVar.f5388f;
                p151v2.s sVar2 = xVar.f5384b;
                if (!z7 && xVar.f5387e) {
                    xVar2.r(4);
                    long jI4 = ((long) xVar2.i(3)) << 30;
                    xVar2.r(1);
                    long jI5 = jI4 | ((long) (xVar2.i(15) << 15));
                    xVar2.r(1);
                    long jI6 = jI5 | ((long) xVar2.i(15));
                    xVar2.r(1);
                    sVar2.b(jI6);
                    xVar.f5388f = true;
                }
                xVar.f5389g = sVar2.b(jI3);
            }
            long j12 = xVar.f5389g;
            h hVar5 = xVar.f5383a;
            hVar5.e(4, j12);
            hVar5.a(c0095a2);
            hVar5.d();
            c0095a2.C(((byte[]) c0095a2.f1465c).length);
        }
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        long j7;
        p151v2.s sVar = this.f5390a;
        synchronized (sVar) {
            j7 = sVar.f17156b;
        }
        boolean z4 = j7 == -9223372036854775807L;
        if (!z4) {
            long jC = sVar.c();
            z4 = (jC == -9223372036854775807L || jC == 0 || jC == j3) ? false : true;
        }
        if (z4) {
            sVar.d(j3);
        }
        I1.b bVar = this.f5398i;
        if (bVar != null) {
            bVar.d(j3);
        }
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f5391b;
            if (i7 >= sparseArray.size()) {
                return;
            }
            x xVar = (x) sparseArray.valueAt(i7);
            xVar.f5388f = false;
            xVar.f5383a.b();
            i7++;
        }
    }

    @Override // F1.k
    public final void release() {
    }
}
