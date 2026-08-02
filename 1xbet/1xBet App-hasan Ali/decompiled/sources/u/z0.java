package u;

/* loaded from: classes.dex */
public final class z0 implements InterfaceC2476x {

    /* renamed from: a, reason: collision with root package name */
    public final int f19972a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19973b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2477y f19974c;

    public z0(int i, int i5, InterfaceC2477y interfaceC2477y) {
        this.f19972a = i;
        this.f19973b = i5;
        this.f19974c = interfaceC2477y;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        return new F4.y(this.f19972a, this.f19973b, this.f19974c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z0) {
            z0 z0Var = (z0) obj;
            if (z0Var.f19972a == this.f19972a && z0Var.f19973b == this.f19973b && kotlin.jvm.internal.l.a(z0Var.f19974c, this.f19974c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f19974c.hashCode() + (this.f19972a * 31)) * 31) + this.f19973b;
    }

    @Override // u.InterfaceC2476x, u.InterfaceC2464k
    public final D0 a(A0 a02) {
        return new F4.y(this.f19972a, this.f19973b, this.f19974c);
    }
}
