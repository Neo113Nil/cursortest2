package A1;

import android.util.Pair;

/* JADX INFO: renamed from: A1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0007a extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p018c2.Z f316c;

    public AbstractC0007a(p018c2.Z z4) {
        this.f316c = z4;
        this.f315b = z4.f10294b.length;
    }

    @Override // A1.R0
    public final int a(boolean z4) {
        if (this.f315b == 0) {
            return -1;
        }
        int iW = 0;
        if (z4) {
            int[] iArr = this.f316c.f10294b;
            iW = iArr.length > 0 ? iArr[0] : -1;
        }
        while (y(iW).p()) {
            iW = w(iW, z4);
            if (iW == -1) {
                return -1;
            }
        }
        return y(iW).a(z4) + v(iW);
    }

    @Override // A1.R0
    public final int b(Object obj) {
        int iB;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        if (iQ == -1 || (iB = y(iQ).b(obj3)) == -1) {
            return -1;
        }
        return u(iQ) + iB;
    }

    @Override // A1.R0
    public final int c(boolean z4) {
        int iX;
        int i7 = this.f315b;
        if (i7 == 0) {
            return -1;
        }
        if (z4) {
            int[] iArr = this.f316c.f10294b;
            iX = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            iX = i7 - 1;
        }
        while (y(iX).p()) {
            iX = x(iX, z4);
            if (iX == -1) {
                return -1;
            }
        }
        return y(iX).c(z4) + v(iX);
    }

    @Override // A1.R0
    public final int e(int i7, int i8, boolean z4) {
        int iS = s(i7);
        int iV = v(iS);
        int iE = y(iS).e(i7 - iV, i8 == 2 ? 0 : i8, z4);
        if (iE != -1) {
            return iV + iE;
        }
        int iW = w(iS, z4);
        while (iW != -1 && y(iW).p()) {
            iW = w(iW, z4);
        }
        if (iW != -1) {
            return y(iW).a(z4) + v(iW);
        }
        if (i8 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p5, boolean z4) {
        int iR = r(i7);
        int iV = v(iR);
        y(iR).f(i7 - u(iR), p5, z4);
        p5.f188c += iV;
        if (z4) {
            Object objT = t(iR);
            Object obj = p5.f187b;
            obj.getClass();
            p5.f187b = Pair.create(objT, obj);
        }
        return p5;
    }

    @Override // A1.R0
    public final P0 g(Object obj, P0 p5) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iQ = q(obj2);
        int iV = v(iQ);
        y(iQ).g(obj3, p5);
        p5.f188c += iV;
        p5.f187b = obj;
        return p5;
    }

    @Override // A1.R0
    public final int k(int i7, int i8, boolean z4) {
        int iS = s(i7);
        int iV = v(iS);
        int iK = y(iS).k(i7 - iV, i8 == 2 ? 0 : i8, z4);
        if (iK != -1) {
            return iV + iK;
        }
        int iX = x(iS, z4);
        while (iX != -1 && y(iX).p()) {
            iX = x(iX, z4);
        }
        if (iX != -1) {
            return y(iX).c(z4) + v(iX);
        }
        if (i8 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        int iR = r(i7);
        return Pair.create(t(iR), y(iR).l(i7 - u(iR)));
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q1, long j) {
        int iS = s(i7);
        int iV = v(iS);
        int iU = u(iS);
        y(iS).m(i7 - iV, q1, j);
        Object objT = t(iS);
        if (!Q0.f200I.equals(q1.f211a)) {
            objT = Pair.create(objT, q1.f211a);
        }
        q1.f211a = objT;
        q1.f208F += iU;
        q1.f209G += iU;
        return q1;
    }

    public abstract int q(Object obj);

    public abstract int r(int i7);

    public abstract int s(int i7);

    public abstract Object t(int i7);

    public abstract int u(int i7);

    public abstract int v(int i7);

    public final int w(int i7, boolean z4) {
        if (!z4) {
            if (i7 < this.f315b - 1) {
                return i7 + 1;
            }
            return -1;
        }
        p018c2.Z z7 = this.f316c;
        int i8 = z7.f10295c[i7] + 1;
        int[] iArr = z7.f10294b;
        if (i8 < iArr.length) {
            return iArr[i8];
        }
        return -1;
    }

    public final int x(int i7, boolean z4) {
        if (!z4) {
            if (i7 > 0) {
                return i7 - 1;
            }
            return -1;
        }
        p018c2.Z z7 = this.f316c;
        int i8 = z7.f10295c[i7] - 1;
        if (i8 >= 0) {
            return z7.f10294b[i8];
        }
        return -1;
    }

    public abstract R0 y(int i7);
}
