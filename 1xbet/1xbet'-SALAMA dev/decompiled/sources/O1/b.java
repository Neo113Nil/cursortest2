package O1;

import F1.s;
import java.io.EOFException;
import java.io.IOException;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f4921A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f4922B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public long f4923C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f4924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f4927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4929f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4930x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f4931y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f4932z;

    public b(j jVar, long j, long j3, long j7, long j8, boolean z4) {
        p151v2.a.f(j >= 0 && j3 > j);
        this.f4927d = jVar;
        this.f4925b = j;
        this.f4926c = j3;
        if (j7 == j3 - j || z4) {
            this.f4929f = j8;
            this.f4928e = 4;
        } else {
            this.f4928e = 0;
        }
        this.f4924a = new g();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // O1.h
    public final long b(F1.h hVar) throws IOException {
        ?? r7;
        long jK;
        long j;
        int i7 = this.f4928e;
        long j3 = this.f4926c;
        g gVar = this.f4924a;
        if (i7 == 0) {
            long j7 = hVar.f2534d;
            this.f4930x = j7;
            this.f4928e = 1;
            long j8 = j3 - 65307;
            if (j8 > j7) {
                return j8;
            }
            r7 = 0;
        } else if (i7 != 1) {
            if (i7 == 2) {
                long j9 = this.f4932z;
                long j10 = this.f4921A;
                if (j9 == j10) {
                    gVar = gVar;
                    j = -1;
                    jK = -1;
                } else {
                    long j11 = hVar.f2534d;
                    if (gVar.b(hVar, j10)) {
                        gVar.a(hVar, false);
                        hVar.f2536f = 0;
                        long j12 = this.f4931y;
                        long j13 = gVar.f4948b;
                        long j14 = j12 - j13;
                        int i8 = gVar.f4950d + gVar.f4951e;
                        if (0 > j14 || j14 >= 72000) {
                            if (j14 < 0) {
                                this.f4921A = j11;
                                this.f4923C = j13;
                            } else {
                                this.f4932z = hVar.f2534d + ((long) i8);
                                this.f4922B = j13;
                            }
                            long j15 = this.f4921A;
                            long j16 = this.f4932z;
                            if (j15 - j16 < 100000) {
                                this.f4921A = j16;
                                jK = j16;
                            } else {
                                jK = t.k((((j15 - j16) * j14) / (this.f4923C - this.f4922B)) + (hVar.f2534d - (((long) i8) * (j14 <= 0 ? 2L : 1L))), j16, j15 - 1);
                            }
                            j = -1;
                        } else {
                            gVar = gVar;
                            j = -1;
                            jK = -1;
                        }
                    } else {
                        long j17 = this.f4932z;
                        if (j17 == j11) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jK = j17;
                    }
                    j = -1;
                }
                if (jK != j) {
                    return jK;
                }
                this.f4928e = 3;
            } else {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j = -1;
                gVar = gVar;
            }
            g gVar2 = gVar;
            while (true) {
                gVar2.b(hVar, j);
                gVar2.a(hVar, false);
                if (gVar2.f4948b > this.f4931y) {
                    hVar.f2536f = 0;
                    this.f4928e = 4;
                    return -(this.f4922B + 2);
                }
                hVar.q(gVar2.f4950d + gVar2.f4951e);
                this.f4932z = hVar.f2534d;
                this.f4922B = gVar2.f4948b;
                j = -1;
            }
        } else {
            r7 = 0;
        }
        gVar.f4947a = r7;
        gVar.f4948b = 0L;
        gVar.f4949c = r7;
        gVar.f4950d = r7;
        gVar.f4951e = r7;
        if (!gVar.b(hVar, -1L)) {
            throw new EOFException();
        }
        gVar.a(hVar, r7);
        hVar.q(gVar.f4950d + gVar.f4951e);
        long j18 = gVar.f4948b;
        while ((gVar.f4947a & 4) != 4 && gVar.b(hVar, -1L) && hVar.f2534d < j3 && gVar.a(hVar, true)) {
            try {
                hVar.q(gVar.f4950d + gVar.f4951e);
                j18 = gVar.f4948b;
            } catch (EOFException unused) {
            }
        }
        this.f4929f = j18;
        this.f4928e = 4;
        return this.f4930x;
    }

    @Override // O1.h
    public final s e() {
        if (this.f4929f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // O1.h
    public final void f(long j) {
        this.f4931y = t.k(j, 0L, this.f4929f - 1);
        this.f4928e = 2;
        this.f4932z = this.f4925b;
        this.f4921A = this.f4926c;
        this.f4922B = 0L;
        this.f4923C = this.f4929f;
    }
}
