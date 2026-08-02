package z;

/* renamed from: z.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2689M implements InterfaceC2692P {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2692P f21490a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2692P f21491b;

    public C2689M(InterfaceC2692P interfaceC2692P, InterfaceC2692P interfaceC2692P2) {
        this.f21490a = interfaceC2692P;
        this.f21491b = interfaceC2692P2;
    }

    @Override // z.InterfaceC2692P
    public final int a(x0.Q q5) {
        return Math.max(this.f21490a.a(q5), this.f21491b.a(q5));
    }

    @Override // z.InterfaceC2692P
    public final int b(x0.Q q5, W0.m mVar) {
        return Math.max(this.f21490a.b(q5, mVar), this.f21491b.b(q5, mVar));
    }

    @Override // z.InterfaceC2692P
    public final int c(x0.Q q5, W0.m mVar) {
        return Math.max(this.f21490a.c(q5, mVar), this.f21491b.c(q5, mVar));
    }

    @Override // z.InterfaceC2692P
    public final int d(x0.Q q5) {
        return Math.max(this.f21490a.d(q5), this.f21491b.d(q5));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2689M)) {
            return false;
        }
        C2689M c2689m = (C2689M) obj;
        return kotlin.jvm.internal.l.a(c2689m.f21490a, this.f21490a) && kotlin.jvm.internal.l.a(c2689m.f21491b, this.f21491b);
    }

    public final int hashCode() {
        return (this.f21491b.hashCode() * 31) + this.f21490a.hashCode();
    }

    public final String toString() {
        return "(" + this.f21490a + " ∪ " + this.f21491b + ')';
    }
}
