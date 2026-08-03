package j;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0912c implements java.util.Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f7926a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f7927b;

    /* renamed from: c, reason: collision with root package name */
    public j.C0912c f7928c;

    /* renamed from: d, reason: collision with root package name */
    public j.C0912c f7929d;

    public C0912c(java.lang.Object obj, java.lang.Object obj2) {
        this.f7926a = obj;
        this.f7927b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j.C0912c)) {
            return false;
        }
        j.C0912c c0912c = (j.C0912c) obj;
        return this.f7926a.equals(c0912c.f7926a) && this.f7927b.equals(c0912c.f7927b);
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.f7926a;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        return this.f7927b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f7926a.hashCode() ^ this.f7927b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("An entry modification is not supported");
    }

    public final java.lang.String toString() {
        return this.f7926a + "=" + this.f7927b;
    }
}
