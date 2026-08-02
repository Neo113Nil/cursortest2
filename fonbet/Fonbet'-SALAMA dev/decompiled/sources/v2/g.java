package v2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f17105a;

    /* renamed from: b, reason: collision with root package name */
    public B3.g f17106b = new B3.g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f17107c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17108d;

    public g(Object obj) {
        this.f17105a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        return this.f17105a.equals(((g) obj).f17105a);
    }

    public final int hashCode() {
        return this.f17105a.hashCode();
    }
}
