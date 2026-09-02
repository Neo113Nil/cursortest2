package O;

/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: a, reason: collision with root package name */
    public final N.d f274a;

    public k(N.d dVar) {
        this.f274a = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f274a));
    }
}
