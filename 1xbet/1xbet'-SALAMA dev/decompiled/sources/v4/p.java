package v4;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p f17199c = new p(c.f17175b, j.f17190e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p f17200d = new p(c.f17176c, r.f17203u);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f17202b;

    public p(c cVar, r rVar) {
        this.f17201a = cVar;
        this.f17202b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f17201a.equals(pVar.f17201a) && this.f17202b.equals(pVar.f17202b);
    }

    public final int hashCode() {
        return this.f17202b.hashCode() + (this.f17201a.f17179a.hashCode() * 31);
    }

    public final String toString() {
        return "NamedNode{name=" + this.f17201a + ", node=" + this.f17202b + '}';
    }
}
