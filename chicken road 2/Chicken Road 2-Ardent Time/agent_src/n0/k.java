package n0;

/* loaded from: classes.dex */
public final class k extends java.lang.UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final m0.d f8095a;

    public k(m0.d dVar) {
        this.f8095a = dVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        return "Missing ".concat(java.lang.String.valueOf(this.f8095a));
    }
}
