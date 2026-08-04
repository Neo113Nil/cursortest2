package I1;

import C1.C0095a;
import E4.y;
import F1.d;
import F1.e;
import F1.h;
import F1.o;
import Y4.D;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f3504c = new y();

    public a(o oVar, int i7) {
        this.f3502a = oVar;
        this.f3503b = i7;
    }

    public final long a(h hVar) throws EOFException, InterruptedIOException {
        long j;
        y yVar;
        o oVar;
        boolean zH;
        int iF;
        while (true) {
            long jD = hVar.d();
            j = hVar.f2533c;
            long j3 = j - 6;
            yVar = this.f3504c;
            oVar = this.f3502a;
            if (jD >= j3) {
                break;
            }
            long jD2 = hVar.d();
            byte[] bArr = new byte[2];
            hVar.c(bArr, 0, 2, false);
            int i7 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
            int i8 = this.f3503b;
            if (i7 != i8) {
                hVar.f2536f = 0;
                hVar.b((int) (jD2 - hVar.f2534d), false);
                zH = false;
            } else {
                C0095a c0095a = new C0095a(16);
                System.arraycopy(bArr, 0, (byte[]) c0095a.f1465c, 0, 2);
                byte[] bArr2 = (byte[]) c0095a.f1465c;
                int i9 = 0;
                for (int i10 = 2; i9 < 14 && (iF = hVar.f(bArr2, i10 + i9, 14 - i9)) != -1; i10 = 2) {
                    i9 += iF;
                }
                c0095a.C(i9);
                hVar.f2536f = 0;
                hVar.b((int) (jD2 - hVar.f2534d), false);
                zH = D.h(c0095a, oVar, i8, yVar);
            }
            if (zH) {
                break;
            }
            hVar.b(1, false);
        }
        if (hVar.d() < j - 6) {
            return yVar.f2247a;
        }
        hVar.b((int) (j - hVar.d()), false);
        return oVar.j;
    }

    @Override // F1.e
    public final d b(h hVar, long j) throws EOFException, InterruptedIOException {
        long j3 = hVar.f2534d;
        long jA = a(hVar);
        long jD = hVar.d();
        hVar.b(Math.max(6, this.f3502a.f2551c), false);
        long jA2 = a(hVar);
        long jD2 = hVar.d();
        if (jA > j || jA2 <= j) {
            return jA2 <= j ? new d(-2, jA2, jD2) : new d(-1, jA, j3);
        }
        return new d(0, -9223372036854775807L, jD);
    }
}
