package M;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final D.d f3372a;

    /* renamed from: b, reason: collision with root package name */
    public final D.d f3373b;

    /* renamed from: c, reason: collision with root package name */
    public final D.d f3374c;

    /* renamed from: d, reason: collision with root package name */
    public final D.d f3375d;

    /* renamed from: e, reason: collision with root package name */
    public final D.d f3376e;

    public k0() {
        D.d dVar = j0.f3361a;
        D.d dVar2 = j0.f3362b;
        D.d dVar3 = j0.f3363c;
        D.d dVar4 = j0.f3364d;
        D.d dVar5 = j0.f3365e;
        this.f3372a = dVar;
        this.f3373b = dVar2;
        this.f3374c = dVar3;
        this.f3375d = dVar4;
        this.f3376e = dVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.l.a(this.f3372a, k0Var.f3372a) && kotlin.jvm.internal.l.a(this.f3373b, k0Var.f3373b) && kotlin.jvm.internal.l.a(this.f3374c, k0Var.f3374c) && kotlin.jvm.internal.l.a(this.f3375d, k0Var.f3375d) && kotlin.jvm.internal.l.a(this.f3376e, k0Var.f3376e);
    }

    public final int hashCode() {
        return this.f3376e.hashCode() + ((this.f3375d.hashCode() + ((this.f3374c.hashCode() + ((this.f3373b.hashCode() + (this.f3372a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f3372a + ", small=" + this.f3373b + ", medium=" + this.f3374c + ", large=" + this.f3375d + ", extraLarge=" + this.f3376e + ')';
    }
}
