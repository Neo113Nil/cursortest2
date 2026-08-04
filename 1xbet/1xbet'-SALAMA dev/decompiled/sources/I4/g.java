package I4;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.j f3668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f3669b;

    public g(H4.j jVar, q qVar) {
        this.f3668a = jVar;
        this.f3669b = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f3668a.equals(gVar.f3668a)) {
            return this.f3669b.equals(gVar.f3669b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3669b.hashCode() + (this.f3668a.hashCode() * 31);
    }
}
