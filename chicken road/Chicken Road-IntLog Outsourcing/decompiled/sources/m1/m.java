package m1;

/* loaded from: classes.dex */
public final class m extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final l1.d f11137a;

    public m(l1.d dVar) {
        this.f11137a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f11137a));
    }
}
