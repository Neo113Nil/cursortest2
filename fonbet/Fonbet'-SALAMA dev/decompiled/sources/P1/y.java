package P1;

import C0.J;
import C1.C0095a;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.zzbbd;
import v2.AbstractC1664a;
import w1.C1722m0;
import w1.V0;

/* loaded from: classes.dex */
public final class y implements F1.k {

    /* renamed from: e, reason: collision with root package name */
    public boolean f5394e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5395f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5396g;

    /* renamed from: h, reason: collision with root package name */
    public long f5397h;

    /* renamed from: i, reason: collision with root package name */
    public I1.b f5398i;
    public F1.m j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5399k;

    /* renamed from: a, reason: collision with root package name */
    public final v2.s f5390a = new v2.s(0);

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f5392c = new C0095a(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f5391b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final w f5393d = new w(0);

    @Override // F1.k
    public final boolean a(F1.l lVar) {
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

    /* JADX WARN: Removed duplicated region for block: B:104:0x0270  */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(F1.l lVar, E4.y yVar) {
        int i7;
        long j;
        h jVar;
        long j3;
        AbstractC1664a.i(this.j);
        long j7 = ((F1.h) lVar).f2533c;
        int i8 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        int i9 = 1;
        long j8 = -9223372036854775807L;
        w wVar = this.f5393d;
        if (i8 != 0 && !wVar.f5377d) {
            boolean z4 = wVar.f5379f;
            C0095a c0095a = wVar.f5376c;
            if (!z4) {
                F1.h hVar = (F1.h) lVar;
                long j9 = hVar.f2533c;
                int min = (int) Math.min(20000L, j9);
                long j10 = j9 - min;
                if (hVar.f2534d != j10) {
                    yVar.f2247a = j10;
                } else {
                    c0095a.A(min);
                    hVar.f2536f = 0;
                    hVar.c((byte[]) c0095a.f1465c, 0, min, false);
                    int i10 = c0095a.f1463a;
                    int i11 = c0095a.f1464b - 4;
                    while (true) {
                        if (i11 < i10) {
                            break;
                        }
                        if (w.b(i11, (byte[]) c0095a.f1465c) == 442) {
                            c0095a.D(i11 + 4);
                            long c3 = w.c(c0095a);
                            if (c3 != -9223372036854775807L) {
                                j8 = c3;
                                break;
                            }
                        }
                        i11--;
                    }
                    wVar.f5381h = j8;
                    wVar.f5379f = true;
                    i9 = 0;
                }
            } else {
                if (wVar.f5381h == -9223372036854775807L) {
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                if (wVar.f5378e) {
                    long j11 = wVar.f5380g;
                    if (j11 == -9223372036854775807L) {
                        wVar.a((F1.h) lVar);
                        return 0;
                    }
                    v2.s sVar = wVar.f5375b;
                    long b7 = sVar.b(wVar.f5381h) - sVar.b(j11);
                    wVar.f5382i = b7;
                    if (b7 < 0) {
                        Log.w("PsDurationReader", "Invalid duration: " + wVar.f5382i + ". Using TIME_UNSET instead.");
                        wVar.f5382i = -9223372036854775807L;
                    }
                    wVar.a((F1.h) lVar);
                    return 0;
                }
                F1.h hVar2 = (F1.h) lVar;
                int min2 = (int) Math.min(20000L, hVar2.f2533c);
                long j12 = 0;
                if (hVar2.f2534d != j12) {
                    yVar.f2247a = j12;
                } else {
                    c0095a.A(min2);
                    hVar2.f2536f = 0;
                    hVar2.c((byte[]) c0095a.f1465c, 0, min2, false);
                    int i12 = c0095a.f1463a;
                    int i13 = c0095a.f1464b;
                    while (true) {
                        if (i12 >= i13 - 3) {
                            j3 = -9223372036854775807L;
                            break;
                        }
                        if (w.b(i12, (byte[]) c0095a.f1465c) == 442) {
                            c0095a.D(i12 + 4);
                            j3 = w.c(c0095a);
                            if (j3 != -9223372036854775807L) {
                                break;
                            }
                        }
                        i12++;
                    }
                    wVar.f5380g = j3;
                    wVar.f5378e = true;
                    i9 = 0;
                }
            }
            return i9;
        }
        if (this.f5399k) {
            i7 = i8;
            j = j7;
        } else {
            this.f5399k = true;
            long j13 = wVar.f5382i;
            if (j13 != -9223372036854775807L) {
                i7 = i8;
                j = j7;
                I1.b bVar = new I1.b(new C1722m0(3), new V0(wVar.f5375b), j13, j13 + 1, 0L, j7, 188L, zzbbd.zzq.zzf);
                this.f5398i = bVar;
                this.j.m(bVar.f3505a);
            } else {
                i7 = i8;
                j = j7;
                this.j.m(new F1.n(j13));
            }
        }
        I1.b bVar2 = this.f5398i;
        if (bVar2 != null && bVar2.f3507c != null) {
            return bVar2.b((F1.h) lVar, yVar);
        }
        F1.h hVar3 = (F1.h) lVar;
        hVar3.f2536f = 0;
        long d7 = i7 != 0 ? j - hVar3.d() : -1L;
        if (d7 != -1 && d7 < 4) {
            return -1;
        }
        C0095a c0095a2 = this.f5392c;
        if (!hVar3.c((byte[]) c0095a2.f1465c, 0, 4, true)) {
            return -1;
        }
        c0095a2.D(0);
        int g3 = c0095a2.g();
        if (g3 == 441) {
            return -1;
        }
        if (g3 == 442) {
            hVar3.c((byte[]) c0095a2.f1465c, 0, 10, false);
            c0095a2.D(9);
            hVar3.q((c0095a2.t() & 7) + 14);
            return 0;
        }
        if (g3 == 443) {
            hVar3.c((byte[]) c0095a2.f1465c, 0, 2, false);
            c0095a2.D(0);
            hVar3.q(c0095a2.y() + 6);
            return 0;
        }
        if (((g3 & (-256)) >> 8) != 1) {
            hVar3.q(1);
            return 0;
        }
        int i14 = g3 & 255;
        SparseArray sparseArray = this.f5391b;
        x xVar = (x) sparseArray.get(i14);
        if (!this.f5394e) {
            if (xVar == null) {
                h hVar4 = null;
                if (i14 == 189) {
                    jVar = new C0371b(null, 0);
                    this.f5395f = true;
                    this.f5397h = hVar3.f2534d;
                } else if ((g3 & 224) == 192) {
                    jVar = new t(null);
                    this.f5395f = true;
                    this.f5397h = hVar3.f2534d;
                } else {
                    if ((g3 & 240) == 224) {
                        jVar = new j(null);
                        this.f5396g = true;
                        this.f5397h = hVar3.f2534d;
                    }
                    if (hVar4 != null) {
                        hVar4.c(this.j, new J(i14, 256));
                        xVar = new x(hVar4, this.f5390a);
                        sparseArray.put(i14, xVar);
                    }
                }
                hVar4 = jVar;
                if (hVar4 != null) {
                }
            }
            if (hVar3.f2534d > ((this.f5395f && this.f5396g) ? this.f5397h + 8192 : 1048576L)) {
                this.f5394e = true;
                this.j.n();
            }
        }
        hVar3.c((byte[]) c0095a2.f1465c, 0, 2, false);
        c0095a2.D(0);
        int y4 = c0095a2.y() + 6;
        if (xVar == null) {
            hVar3.q(y4);
        } else {
            c0095a2.A(y4);
            hVar3.a((byte[]) c0095a2.f1465c, 0, y4, false);
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
                xVar2.r(1);
                xVar2.r(1);
                long i15 = (xVar2.i(3) << 30) | (xVar2.i(15) << 15) | xVar2.i(15);
                xVar2.r(1);
                boolean z7 = xVar.f5388f;
                v2.s sVar2 = xVar.f5384b;
                if (!z7 && xVar.f5387e) {
                    xVar2.r(4);
                    xVar2.r(1);
                    xVar2.r(1);
                    xVar2.r(1);
                    sVar2.b((xVar2.i(3) << 30) | (xVar2.i(15) << 15) | xVar2.i(15));
                    xVar.f5388f = true;
                }
                xVar.f5389g = sVar2.b(i15);
            }
            long j14 = xVar.f5389g;
            h hVar5 = xVar.f5383a;
            hVar5.e(4, j14);
            hVar5.a(c0095a2);
            hVar5.d();
            c0095a2.C(((byte[]) c0095a2.f1465c).length);
        }
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        long j7;
        v2.s sVar = this.f5390a;
        synchronized (sVar) {
            j7 = sVar.f17150b;
        }
        boolean z4 = j7 == -9223372036854775807L;
        if (!z4) {
            long c3 = sVar.c();
            z4 = (c3 == -9223372036854775807L || c3 == 0 || c3 == j3) ? false : true;
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
