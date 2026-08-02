package z;

/* renamed from: z.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2719u implements InterfaceC2692P {

    /* renamed from: a, reason: collision with root package name */
    public final C2699a f21570a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2692P f21571b;

    public C2719u(C2699a c2699a, InterfaceC2692P interfaceC2692P) {
        this.f21570a = c2699a;
        this.f21571b = interfaceC2692P;
    }

    @Override // z.InterfaceC2692P
    public final int a(x0.Q q5) {
        int a5 = this.f21570a.e().f17074b - this.f21571b.a(q5);
        if (a5 < 0) {
            return 0;
        }
        return a5;
    }

    @Override // z.InterfaceC2692P
    public final int b(x0.Q q5, W0.m mVar) {
        int b3 = this.f21570a.e().f17073a - this.f21571b.b(q5, mVar);
        if (b3 < 0) {
            return 0;
        }
        return b3;
    }

    @Override // z.InterfaceC2692P
    public final int c(x0.Q q5, W0.m mVar) {
        int c5 = this.f21570a.e().f17075c - this.f21571b.c(q5, mVar);
        if (c5 < 0) {
            return 0;
        }
        return c5;
    }

    @Override // z.InterfaceC2692P
    public final int d(x0.Q q5) {
        int d5 = this.f21570a.e().f17076d - this.f21571b.d(q5);
        if (d5 < 0) {
            return 0;
        }
        return d5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2719u)) {
            return false;
        }
        C2719u c2719u = (C2719u) obj;
        return kotlin.jvm.internal.l.a(c2719u.f21570a, this.f21570a) && kotlin.jvm.internal.l.a(c2719u.f21571b, this.f21571b);
    }

    public final int hashCode() {
        return this.f21571b.hashCode() + (this.f21570a.hashCode() * 31);
    }

    public final String toString() {
        return "(" + this.f21570a + " - " + this.f21571b + ')';
    }
}
