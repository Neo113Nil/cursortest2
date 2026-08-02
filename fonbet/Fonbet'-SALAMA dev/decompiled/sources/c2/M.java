package c2;

import java.io.IOException;
import w1.V0;

/* loaded from: classes.dex */
public final class M implements W {

    /* renamed from: a, reason: collision with root package name */
    public final int f10199a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10200b;

    public M(O o7, int i7) {
        this.f10200b = o7;
        this.f10199a = i7;
    }

    @Override // c2.W
    public final boolean b() {
        O o7 = this.f10200b;
        return !o7.x() && o7.f10212I[this.f10199a].s(o7.f10231a0);
    }

    @Override // c2.W
    public final void c() {
        O o7 = this.f10200b;
        o7.f10212I[this.f10199a].u();
        int u4 = o7.f10235d.u(o7.f10221R);
        u2.K k7 = o7.f10204A;
        IOException iOException = k7.f16727c;
        if (iOException != null) {
            throw iOException;
        }
        u2.G g3 = k7.f16726b;
        if (g3 != null) {
            if (u4 == Integer.MIN_VALUE) {
                u4 = g3.f16713a;
            }
            IOException iOException2 = g3.f16717e;
            if (iOException2 != null && g3.f16718f > u4) {
                throw iOException2;
            }
        }
    }

    @Override // c2.W
    public final int d(long j) {
        O o7 = this.f10200b;
        if (o7.x()) {
            return 0;
        }
        int i7 = this.f10199a;
        o7.j(i7);
        V v6 = o7.f10212I[i7];
        int p5 = v6.p(j, o7.f10231a0);
        v6.A(p5);
        if (p5 != 0) {
            return p5;
        }
        o7.s(i7);
        return p5;
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        O o7 = this.f10200b;
        if (o7.x()) {
            return -3;
        }
        int i8 = this.f10199a;
        o7.j(i8);
        int x4 = o7.f10212I[i8].x(v02, hVar, i7, o7.f10231a0);
        if (x4 == -3) {
            o7.s(i8);
        }
        return x4;
    }
}
