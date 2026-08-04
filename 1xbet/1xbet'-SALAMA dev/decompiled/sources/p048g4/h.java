package p048g4;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f13210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13211b;

    public h(q qVar, boolean z4) {
        this.f13210a = qVar;
        this.f13211b = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f13210a.equals(this.f13210a) && hVar.f13211b == this.f13211b;
    }

    public final int hashCode() {
        return ((this.f13210a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f13211b).hashCode();
    }
}
