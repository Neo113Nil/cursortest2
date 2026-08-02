package u;

/* loaded from: classes.dex */
public final class q0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f19897a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f19898b;

    public q0(Object obj, Object obj2) {
        this.f19897a = obj;
        this.f19898b = obj2;
    }

    @Override // u.p0
    public final boolean a(Enum r22, Enum r32) {
        return r22.equals(b()) && r32.equals(c());
    }

    @Override // u.p0
    public final Object b() {
        return this.f19897a;
    }

    @Override // u.p0
    public final Object c() {
        return this.f19898b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (kotlin.jvm.internal.l.a(this.f19897a, p0Var.b())) {
            return kotlin.jvm.internal.l.a(this.f19898b, p0Var.c());
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f19897a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.f19898b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
