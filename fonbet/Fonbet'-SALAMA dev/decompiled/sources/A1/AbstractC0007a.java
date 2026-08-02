package A1;

import android.util.Pair;

/* renamed from: A1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0007a extends R0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f315b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.Z f316c;

    public AbstractC0007a(c2.Z z4) {
        this.f316c = z4;
        this.f315b = z4.f10294b.length;
    }

    @Override // A1.R0
    public final int a(boolean z4) {
        if (this.f315b == 0) {
            return -1;
        }
        int i7 = 0;
        if (z4) {
            int[] iArr = this.f316c.f10294b;
            i7 = iArr.length > 0 ? iArr[0] : -1;
        }
        while (y(i7).p()) {
            i7 = w(i7, z4);
            if (i7 == -1) {
                return -1;
            }
        }
        return y(i7).a(z4) + v(i7);
    }

    @Override // A1.R0
    public final int b(Object obj) {
        int b7;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q7 = q(obj2);
        if (q7 == -1 || (b7 = y(q7).b(obj3)) == -1) {
            return -1;
        }
        return u(q7) + b7;
    }

    @Override // A1.R0
    public final int c(boolean z4) {
        int i7;
        int i8 = this.f315b;
        if (i8 == 0) {
            return -1;
        }
        if (z4) {
            int[] iArr = this.f316c.f10294b;
            i7 = iArr.length > 0 ? iArr[iArr.length - 1] : -1;
        } else {
            i7 = i8 - 1;
        }
        while (y(i7).p()) {
            i7 = x(i7, z4);
            if (i7 == -1) {
                return -1;
            }
        }
        return y(i7).c(z4) + v(i7);
    }

    @Override // A1.R0
    public final int e(int i7, int i8, boolean z4) {
        int s7 = s(i7);
        int v6 = v(s7);
        int e7 = y(s7).e(i7 - v6, i8 == 2 ? 0 : i8, z4);
        if (e7 != -1) {
            return v6 + e7;
        }
        int w7 = w(s7, z4);
        while (w7 != -1 && y(w7).p()) {
            w7 = w(w7, z4);
        }
        if (w7 != -1) {
            return y(w7).a(z4) + v(w7);
        }
        if (i8 == 2) {
            return a(z4);
        }
        return -1;
    }

    @Override // A1.R0
    public final P0 f(int i7, P0 p02, boolean z4) {
        int r7 = r(i7);
        int v6 = v(r7);
        y(r7).f(i7 - u(r7), p02, z4);
        p02.f188c += v6;
        if (z4) {
            Object t7 = t(r7);
            Object obj = p02.f187b;
            obj.getClass();
            p02.f187b = Pair.create(t7, obj);
        }
        return p02;
    }

    @Override // A1.R0
    public final P0 g(Object obj, P0 p02) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q7 = q(obj2);
        int v6 = v(q7);
        y(q7).g(obj3, p02);
        p02.f188c += v6;
        p02.f187b = obj;
        return p02;
    }

    @Override // A1.R0
    public final int k(int i7, int i8, boolean z4) {
        int s7 = s(i7);
        int v6 = v(s7);
        int k7 = y(s7).k(i7 - v6, i8 == 2 ? 0 : i8, z4);
        if (k7 != -1) {
            return v6 + k7;
        }
        int x4 = x(s7, z4);
        while (x4 != -1 && y(x4).p()) {
            x4 = x(x4, z4);
        }
        if (x4 != -1) {
            return y(x4).c(z4) + v(x4);
        }
        if (i8 == 2) {
            return c(z4);
        }
        return -1;
    }

    @Override // A1.R0
    public final Object l(int i7) {
        int r7 = r(i7);
        return Pair.create(t(r7), y(r7).l(i7 - u(r7)));
    }

    @Override // A1.R0
    public final Q0 m(int i7, Q0 q02, long j) {
        int s7 = s(i7);
        int v6 = v(s7);
        int u4 = u(s7);
        y(s7).m(i7 - v6, q02, j);
        Object t7 = t(s7);
        if (!Q0.f200I.equals(q02.f211a)) {
            t7 = Pair.create(t7, q02.f211a);
        }
        q02.f211a = t7;
        q02.f208F += u4;
        q02.f209G += u4;
        return q02;
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
        c2.Z z7 = this.f316c;
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
        c2.Z z7 = this.f316c;
        int i8 = z7.f10295c[i7] - 1;
        if (i8 >= 0) {
            return z7.f10294b[i8];
        }
        return -1;
    }

    public abstract R0 y(int i7);
}
