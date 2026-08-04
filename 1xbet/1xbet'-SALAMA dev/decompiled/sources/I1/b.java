package I1;

import E4.y;
import F1.d;
import F1.e;
import F1.h;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.a f3505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f3506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public F1.b f3507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3508d;

    public b(F1.c cVar, e eVar, long j, long j3, long j7, long j8, long j9, int i7) {
        this.f3506b = eVar;
        this.f3508d = i7;
        this.f3505a = new F1.a(cVar, j, j3, j7, j8, j9);
    }

    public static int a(int i7, byte[] bArr) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }

    public static int c(h hVar, long j, y yVar) {
        if (j == hVar.f2534d) {
            return 0;
        }
        yVar.f2247a = j;
        return 1;
    }

    public final int b(h hVar, y yVar) {
        while (true) {
            F1.b bVar = this.f3507c;
            p151v2.a.i(bVar);
            long j = bVar.f2511f;
            long j3 = bVar.f2512g;
            long j7 = bVar.f2513h;
            long j8 = j3 - j;
            long j9 = this.f3508d;
            e eVar = this.f3506b;
            if (j8 <= j9) {
                this.f3507c = null;
                eVar.g();
                return c(hVar, j, yVar);
            }
            long j10 = j7 - hVar.f2534d;
            if (j10 < 0 || j10 > 262144) {
                return c(hVar, j7, yVar);
            }
            hVar.q((int) j10);
            hVar.f2536f = 0;
            d dVarB = eVar.b(hVar, bVar.f2507b);
            int i7 = dVarB.f2515a;
            if (i7 == -3) {
                this.f3507c = null;
                eVar.g();
                return c(hVar, j7, yVar);
            }
            long j11 = dVarB.f2516b;
            long j12 = dVarB.f2517c;
            if (i7 == -2) {
                bVar.f2509d = j11;
                bVar.f2511f = j12;
                bVar.f2513h = F1.b.a(bVar.f2507b, j11, bVar.f2510e, j12, bVar.f2512g, bVar.f2508c);
            } else {
                if (i7 != -1) {
                    if (i7 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long j13 = j12 - hVar.f2534d;
                    if (j13 >= 0 && j13 <= 262144) {
                        hVar.q((int) j13);
                    }
                    this.f3507c = null;
                    eVar.g();
                    return c(hVar, j12, yVar);
                }
                bVar.f2510e = j11;
                bVar.f2512g = j12;
                bVar.f2513h = F1.b.a(bVar.f2507b, bVar.f2509d, j11, bVar.f2511f, j12, bVar.f2508c);
            }
        }
    }

    public final void d(long j) {
        F1.b bVar = this.f3507c;
        if (bVar == null || bVar.f2506a != j) {
            F1.a aVar = this.f3505a;
            this.f3507c = new F1.b(j, aVar.f2500a.c(j), aVar.f2502c, aVar.f2503d, aVar.f2504e, aVar.f2505f);
        }
    }
}
