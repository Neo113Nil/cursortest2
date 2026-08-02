package E;

import h0.C1988b;
import h0.C1989c;
import x0.InterfaceC2637x;

/* loaded from: classes.dex */
public final class F0 {

    /* renamed from: a, reason: collision with root package name */
    public final K0.L f1029a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2637x f1030b = null;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC2637x f1031c;

    public F0(K0.L l5, InterfaceC2637x interfaceC2637x) {
        this.f1029a = l5;
        this.f1031c = interfaceC2637x;
    }

    public final long a(long j5) {
        C1989c c1989c;
        InterfaceC2637x interfaceC2637x = this.f1030b;
        C1989c c1989c2 = C1989c.f17192e;
        if (interfaceC2637x != null) {
            if (interfaceC2637x.F()) {
                InterfaceC2637x interfaceC2637x2 = this.f1031c;
                c1989c = interfaceC2637x2 != null ? interfaceC2637x2.s(interfaceC2637x, true) : null;
            } else {
                c1989c = c1989c2;
            }
            if (c1989c != null) {
                c1989c2 = c1989c;
            }
        }
        float d5 = C1988b.d(j5);
        float f = c1989c2.f17193a;
        if (d5 >= f) {
            float d6 = C1988b.d(j5);
            f = c1989c2.f17195c;
            if (d6 <= f) {
                f = C1988b.d(j5);
            }
        }
        float e3 = C1988b.e(j5);
        float f5 = c1989c2.f17194b;
        if (e3 >= f5) {
            float e5 = C1988b.e(j5);
            f5 = c1989c2.f17196d;
            if (e5 <= f5) {
                f5 = C1988b.e(j5);
            }
        }
        return G4.d.d(f, f5);
    }

    public final int b(long j5, boolean z3) {
        if (z3) {
            j5 = a(j5);
        }
        return this.f1029a.f2793b.e(d(j5));
    }

    public final boolean c(long j5) {
        long d5 = d(a(j5));
        float e3 = C1988b.e(d5);
        K0.L l5 = this.f1029a;
        int c5 = l5.f2793b.c(e3);
        return C1988b.d(d5) >= l5.f(c5) && C1988b.d(d5) <= l5.g(c5);
    }

    public final long d(long j5) {
        InterfaceC2637x interfaceC2637x;
        InterfaceC2637x interfaceC2637x2 = this.f1030b;
        if (interfaceC2637x2 == null) {
            return j5;
        }
        if (!interfaceC2637x2.F()) {
            interfaceC2637x2 = null;
        }
        if (interfaceC2637x2 == null || (interfaceC2637x = this.f1031c) == null) {
            return j5;
        }
        InterfaceC2637x interfaceC2637x3 = interfaceC2637x.F() ? interfaceC2637x : null;
        return interfaceC2637x3 == null ? j5 : interfaceC2637x2.o(interfaceC2637x3, j5);
    }

    public final long e(long j5) {
        InterfaceC2637x interfaceC2637x;
        InterfaceC2637x interfaceC2637x2 = this.f1030b;
        if (interfaceC2637x2 == null) {
            return j5;
        }
        if (!interfaceC2637x2.F()) {
            interfaceC2637x2 = null;
        }
        if (interfaceC2637x2 == null || (interfaceC2637x = this.f1031c) == null) {
            return j5;
        }
        InterfaceC2637x interfaceC2637x3 = interfaceC2637x.F() ? interfaceC2637x : null;
        return interfaceC2637x3 == null ? j5 : interfaceC2637x3.o(interfaceC2637x2, j5);
    }
}
