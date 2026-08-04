package B4;

/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public T f1103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1104f = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1099a = "firestore.googleapis.com";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1100b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1101c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1102d = 104857600;

    public final K a() {
        if (this.f1100b || !this.f1099a.equals("firestore.googleapis.com")) {
            return new K(this);
        }
        throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
    }

    public final void b(T t7) {
        if (this.f1104f) {
            throw new IllegalStateException("Deprecated setPersistenceEnabled() or setCacheSizeBytes() is already used, remove those first.");
        }
        if (!(t7 instanceof U) && !(t7 instanceof W)) {
            throw new IllegalArgumentException("Only MemoryCacheSettings and PersistentCacheSettings are accepted");
        }
        this.f1103e = t7;
    }
}
