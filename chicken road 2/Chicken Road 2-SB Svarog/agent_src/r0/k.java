package r0;

import m0.AbstractC0062t;

/* loaded from: classes.dex */
public final /* synthetic */ class k extends g0.c implements f0.a, j0.a {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1180h;

    public k(l lVar) {
        super(lVar, AbstractC0062t.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.f1180h = false;
    }

    @Override // f0.a
    public final Object a() {
        return this.f534c.getClass().getSimpleName();
    }

    public final j0.a c() {
        if (this.f1180h) {
            return this;
        }
        j0.a aVar = this.f533b;
        if (aVar != null) {
            return aVar;
        }
        g0.l.f547a.getClass();
        this.f533b = this;
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return b().equals(kVar.b()) && this.f536e.equals(kVar.f536e) && this.f537f.equals(kVar.f537f) && this.f534c.equals(kVar.f534c);
        }
        if (obj instanceof k) {
            return obj.equals(c());
        }
        return false;
    }

    public final int hashCode() {
        return this.f537f.hashCode() + ((this.f536e.hashCode() + (b().hashCode() * 31)) * 31);
    }

    public final String toString() {
        j0.a c2 = c();
        if (c2 != this) {
            return c2.toString();
        }
        return "property " + this.f536e + " (Kotlin reflection is not available)";
    }
}
