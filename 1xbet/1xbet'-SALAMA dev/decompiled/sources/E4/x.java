package E4;

/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H4.h f2246b;

    public x(w wVar, H4.h hVar) {
        this.f2245a = wVar;
        this.f2246b = hVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2245a.equals(xVar.f2245a) && this.f2246b.equals(xVar.f2246b);
    }

    public final int hashCode() {
        return this.f2246b.f3318a.hashCode() + ((this.f2245a.hashCode() + 2077) * 31);
    }
}
