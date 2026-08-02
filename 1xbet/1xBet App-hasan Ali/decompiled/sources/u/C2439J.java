package u;

/* renamed from: u.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2439J {

    /* renamed from: a, reason: collision with root package name */
    public final Float f19683a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC2477y f19684b;

    public C2439J(Float f, InterfaceC2477y interfaceC2477y) {
        this.f19683a = f;
        this.f19684b = interfaceC2477y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2439J)) {
            return false;
        }
        C2439J c2439j = (C2439J) obj;
        return c2439j.f19683a.equals(this.f19683a) && kotlin.jvm.internal.l.a(c2439j.f19684b, this.f19684b);
    }

    public final int hashCode() {
        return this.f19684b.hashCode() + (this.f19683a.hashCode() * 961);
    }
}
