package x0;

/* renamed from: x0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2625k implements N {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f21009k;

    /* renamed from: l, reason: collision with root package name */
    public final N f21010l;

    /* renamed from: m, reason: collision with root package name */
    public final Enum f21011m;

    /* renamed from: n, reason: collision with root package name */
    public final Enum f21012n;

    public /* synthetic */ C2625k(N n5, Enum r22, Enum r32, int i) {
        this.f21009k = i;
        this.f21010l = n5;
        this.f21011m = r22;
        this.f21012n = r32;
    }

    @Override // x0.N
    public final int L(int i) {
        switch (this.f21009k) {
        }
        return this.f21010l.L(i);
    }

    @Override // x0.N
    public final int T(int i) {
        switch (this.f21009k) {
        }
        return this.f21010l.T(i);
    }

    @Override // x0.N
    public final int U(int i) {
        switch (this.f21009k) {
        }
        return this.f21010l.U(i);
    }

    @Override // x0.N
    public final Z e(long j5) {
        switch (this.f21009k) {
            case 0:
                EnumC2634u enumC2634u = EnumC2634u.f21057k;
                EnumC2633t enumC2633t = (EnumC2633t) this.f21011m;
                EnumC2634u enumC2634u2 = (EnumC2634u) this.f21012n;
                EnumC2633t enumC2633t2 = EnumC2633t.f21055l;
                N n5 = this.f21010l;
                if (enumC2634u2 == enumC2634u) {
                    return new C2627m(enumC2633t == enumC2633t2 ? n5.T(W0.a.g(j5)) : n5.L(W0.a.g(j5)), W0.a.c(j5) ? W0.a.g(j5) : 32767, 0);
                }
                return new C2627m(W0.a.d(j5) ? W0.a.h(j5) : 32767, enumC2633t == enumC2633t2 ? n5.f(W0.a.h(j5)) : n5.U(W0.a.h(j5)), 0);
            case 1:
                T t5 = T.f20963k;
                S s2 = (S) this.f21011m;
                T t6 = (T) this.f21012n;
                S s5 = S.f20961l;
                N n6 = this.f21010l;
                if (t6 == t5) {
                    return new C2627m(s2 == s5 ? n6.T(W0.a.g(j5)) : n6.L(W0.a.g(j5)), W0.a.c(j5) ? W0.a.g(j5) : 32767, 1);
                }
                return new C2627m(W0.a.d(j5) ? W0.a.h(j5) : 32767, s2 == s5 ? n6.f(W0.a.h(j5)) : n6.U(W0.a.h(j5)), 1);
            default:
                z0.h0 h0Var = z0.h0.f21826k;
                z0.g0 g0Var = (z0.g0) this.f21011m;
                z0.h0 h0Var2 = (z0.h0) this.f21012n;
                z0.g0 g0Var2 = z0.g0.f21819l;
                N n7 = this.f21010l;
                if (h0Var2 == h0Var) {
                    return new C2627m(g0Var == g0Var2 ? n7.T(W0.a.g(j5)) : n7.L(W0.a.g(j5)), W0.a.c(j5) ? W0.a.g(j5) : 32767, 2);
                }
                return new C2627m(W0.a.d(j5) ? W0.a.h(j5) : 32767, g0Var == g0Var2 ? n7.f(W0.a.h(j5)) : n7.U(W0.a.h(j5)), 2);
        }
    }

    @Override // x0.N
    public final int f(int i) {
        switch (this.f21009k) {
        }
        return this.f21010l.f(i);
    }

    @Override // x0.N
    public final Object k() {
        switch (this.f21009k) {
        }
        return this.f21010l.k();
    }
}
