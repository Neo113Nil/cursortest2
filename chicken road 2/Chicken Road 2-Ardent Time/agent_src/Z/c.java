package Z;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final W.b f1844a;

    /* renamed from: b, reason: collision with root package name */
    public final Z.b f1845b;

    /* renamed from: c, reason: collision with root package name */
    public final Z.b f1846c;

    public c(W.b bVar, Z.b bVar2, Z.b bVar3) {
        this.f1844a = bVar;
        this.f1845b = bVar2;
        this.f1846c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            throw new java.lang.IllegalArgumentException("Bounds must be non zero");
        }
        if (bVar.f1805a != 0 && bVar.f1806b != 0) {
            throw new java.lang.IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Z.c.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        Z.c cVar = (Z.c) obj;
        return kotlin.jvm.internal.i.a(this.f1844a, cVar.f1844a) && kotlin.jvm.internal.i.a(this.f1845b, cVar.f1845b) && kotlin.jvm.internal.i.a(this.f1846c, cVar.f1846c);
    }

    public final int hashCode() {
        return this.f1846c.hashCode() + ((this.f1845b.hashCode() + (this.f1844a.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return Z.c.class.getSimpleName() + " { " + this.f1844a + ", type=" + this.f1845b + ", state=" + this.f1846c + " }";
    }
}
