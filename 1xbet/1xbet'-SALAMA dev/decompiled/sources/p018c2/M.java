package p018c2;

import D1.h;
import java.io.IOException;
import p146u2.G;
import p146u2.K;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class M implements W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10200b;

    public M(O o7, int i7) {
        this.f10200b = o7;
        this.f10199a = i7;
    }

    @Override // p018c2.W
    public final boolean b() {
        O o7 = this.f10200b;
        return !o7.x() && o7.f10212I[this.f10199a].s(o7.f10231a0);
    }

    @Override // p018c2.W
    public final void c() throws IOException {
        O o7 = this.f10200b;
        o7.f10212I[this.f10199a].u();
        int iU = o7.f10235d.u(o7.f10221R);
        K k7 = o7.f10204A;
        IOException iOException = k7.f16733c;
        if (iOException != null) {
            throw iOException;
        }
        G g3 = k7.f16732b;
        if (g3 != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = g3.f16719a;
            }
            IOException iOException2 = g3.f16723e;
            if (iOException2 != null && g3.f16724f > iU) {
                throw iOException2;
            }
        }
    }

    @Override // p018c2.W
    public final int d(long j) {
        O o7 = this.f10200b;
        if (o7.x()) {
            return 0;
        }
        int i7 = this.f10199a;
        o7.j(i7);
        V v6 = o7.f10212I[i7];
        int iP = v6.p(j, o7.f10231a0);
        v6.A(iP);
        if (iP != 0) {
            return iP;
        }
        o7.s(i7);
        return iP;
    }

    @Override // p018c2.W
    public final int e(V0 v6, h hVar, int i7) {
        O o7 = this.f10200b;
        if (o7.x()) {
            return -3;
        }
        int i8 = this.f10199a;
        o7.j(i8);
        int iX = o7.f10212I[i8].x(v6, hVar, i7, o7.f10231a0);
        if (iX == -3) {
            o7.s(i8);
        }
        return iX;
    }
}
