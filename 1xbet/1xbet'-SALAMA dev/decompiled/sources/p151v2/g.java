package p151v2;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public B3.g f17112b = new B3.g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17114d;

    public g(Object obj) {
        this.f17111a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return this.f17111a.equals(((g) obj).f17111a);
    }

    public final int hashCode() {
        return this.f17111a.hashCode();
    }
}
