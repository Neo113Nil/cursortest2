package v4;

/* loaded from: classes2.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final p f17193c = new p(c.f17169b, j.f17184e);

    /* renamed from: d, reason: collision with root package name */
    public static final p f17194d = new p(c.f17170c, r.f17197u);

    /* renamed from: a, reason: collision with root package name */
    public final c f17195a;

    /* renamed from: b, reason: collision with root package name */
    public final r f17196b;

    public p(c cVar, r rVar) {
        this.f17195a = cVar;
        this.f17196b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f17195a.equals(pVar.f17195a) && this.f17196b.equals(pVar.f17196b);
    }

    public final int hashCode() {
        return this.f17196b.hashCode() + (this.f17195a.f17173a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f17195a + ", node=" + this.f17196b + '}';
    }
}
