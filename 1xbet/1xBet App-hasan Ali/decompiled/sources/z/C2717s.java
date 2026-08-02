package z;

import java.util.List;
import r3.AbstractC2349a;
import x0.InterfaceC2632s;
import x0.Z;

/* renamed from: z.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2717s implements x0.O, InterfaceC2683G {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2704f f21567a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.f f21568b;

    public C2717s(InterfaceC2704f interfaceC2704f, b0.f fVar) {
        this.f21567a = interfaceC2704f;
        this.f21568b = fVar;
    }

    @Override // x0.O
    public final int a(InterfaceC2632s interfaceC2632s, List list, int i) {
        int K = interfaceC2632s.K(this.f21567a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        float f = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            x0.N n5 = (x0.N) list.get(i7);
            float d5 = AbstractC2701c.d(AbstractC2701c.c(n5));
            int U4 = n5.U(i);
            if (d5 == 0.0f) {
                i6 += U4;
            } else if (d5 > 0.0f) {
                f += d5;
                i5 = Math.max(i5, Math.round(U4 / d5));
            }
        }
        return ((list.size() - 1) * K) + Math.round(i5 * f) + i6;
    }

    @Override // x0.O
    public final int b(InterfaceC2632s interfaceC2632s, List list, int i) {
        int K = interfaceC2632s.K(this.f21567a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * K, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            x0.N n5 = (x0.N) list.get(i6);
            float d5 = AbstractC2701c.d(AbstractC2701c.c(n5));
            if (d5 == 0.0f) {
                int min2 = Math.min(n5.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i5 = Math.max(i5, n5.L(min2));
            } else if (d5 > 0.0f) {
                f += d5;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            x0.N n6 = (x0.N) list.get(i7);
            float d6 = AbstractC2701c.d(AbstractC2701c.c(n6));
            if (d6 > 0.0f) {
                i5 = Math.max(i5, n6.L(round != Integer.MAX_VALUE ? Math.round(round * d6) : Integer.MAX_VALUE));
            }
        }
        return i5;
    }

    @Override // x0.O
    public final x0.P c(x0.Q q5, List list, long j5) {
        return AbstractC2701c.e(this, W0.a.i(j5), W0.a.j(j5), W0.a.g(j5), W0.a.h(j5), q5.K(this.f21567a.a()), q5, list, new Z[list.size()], list.size());
    }

    @Override // z.InterfaceC2683G
    public final void d(int i, x0.Q q5, int[] iArr, int[] iArr2) {
        this.f21567a.c(i, q5, iArr, iArr2);
    }

    @Override // z.InterfaceC2683G
    public final int e(Z z3) {
        return z3.f20974l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2717s)) {
            return false;
        }
        C2717s c2717s = (C2717s) obj;
        return kotlin.jvm.internal.l.a(this.f21567a, c2717s.f21567a) && this.f21568b.equals(c2717s.f21568b);
    }

    @Override // z.InterfaceC2683G
    public final long f(int i, int i5, int i6, boolean z3) {
        return !z3 ? W0.b.a(0, i6, i, i5) : AbstractC2349a.t(0, i6, i, i5);
    }

    @Override // z.InterfaceC2683G
    public final x0.P g(Z[] zArr, x0.Q q5, int[] iArr, int i, int i5) {
        return q5.i(i5, i, X3.w.f6091k, new g0.v(zArr, this, i5, q5, iArr));
    }

    @Override // x0.O
    public final int h(InterfaceC2632s interfaceC2632s, List list, int i) {
        int K = interfaceC2632s.K(this.f21567a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        float f = 0.0f;
        for (int i7 = 0; i7 < size; i7++) {
            x0.N n5 = (x0.N) list.get(i7);
            float d5 = AbstractC2701c.d(AbstractC2701c.c(n5));
            int f5 = n5.f(i);
            if (d5 == 0.0f) {
                i6 += f5;
            } else if (d5 > 0.0f) {
                f += d5;
                i5 = Math.max(i5, Math.round(f5 / d5));
            }
        }
        return ((list.size() - 1) * K) + Math.round(i5 * f) + i6;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f21568b.f7152a) + (this.f21567a.hashCode() * 31);
    }

    @Override // z.InterfaceC2683G
    public final int i(Z z3) {
        return z3.f20973k;
    }

    @Override // x0.O
    public final int j(InterfaceC2632s interfaceC2632s, List list, int i) {
        int K = interfaceC2632s.K(this.f21567a.a());
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * K, i);
        int size = list.size();
        int i5 = 0;
        float f = 0.0f;
        for (int i6 = 0; i6 < size; i6++) {
            x0.N n5 = (x0.N) list.get(i6);
            float d5 = AbstractC2701c.d(AbstractC2701c.c(n5));
            if (d5 == 0.0f) {
                int min2 = Math.min(n5.f(Integer.MAX_VALUE), i == Integer.MAX_VALUE ? Integer.MAX_VALUE : i - min);
                min += min2;
                i5 = Math.max(i5, n5.T(min2));
            } else if (d5 > 0.0f) {
                f += d5;
            }
        }
        int round = f == 0.0f ? 0 : i == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(i - min, 0) / f);
        int size2 = list.size();
        for (int i7 = 0; i7 < size2; i7++) {
            x0.N n6 = (x0.N) list.get(i7);
            float d6 = AbstractC2701c.d(AbstractC2701c.c(n6));
            if (d6 > 0.0f) {
                i5 = Math.max(i5, n6.T(round != Integer.MAX_VALUE ? Math.round(round * d6) : Integer.MAX_VALUE));
            }
        }
        return i5;
    }

    public final String toString() {
        return "ColumnMeasurePolicy(verticalArrangement=" + this.f21567a + ", horizontalAlignment=" + this.f21568b + ')';
    }
}
