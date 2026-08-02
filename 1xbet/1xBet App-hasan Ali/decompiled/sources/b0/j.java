package b0;

import a3.AbstractC0467k;

/* loaded from: classes.dex */
public final class j implements p {

    /* renamed from: k, reason: collision with root package name */
    public final p f7157k;

    /* renamed from: l, reason: collision with root package name */
    public final p f7158l;

    public j(p pVar, p pVar2) {
        this.f7157k = pVar;
        this.f7158l = pVar2;
    }

    @Override // b0.p
    public final /* synthetic */ p c(p pVar) {
        return AbstractC0467k.d(this, pVar);
    }

    @Override // b0.p
    public final Object d(i4.e eVar, Object obj) {
        return this.f7158l.d(eVar, this.f7157k.d(eVar, obj));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return kotlin.jvm.internal.l.a(this.f7157k, jVar.f7157k) && kotlin.jvm.internal.l.a(this.f7158l, jVar.f7158l);
    }

    public final int hashCode() {
        return (this.f7158l.hashCode() * 31) + this.f7157k.hashCode();
    }

    @Override // b0.p
    public final boolean j(i4.c cVar) {
        return this.f7157k.j(cVar) && this.f7158l.j(cVar);
    }

    public final String toString() {
        return L1.a.p(new StringBuilder("["), (String) d(i.f7156l, ""), ']');
    }
}
