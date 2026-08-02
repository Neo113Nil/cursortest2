package k3;

/* loaded from: classes.dex */
public final class k extends UnsupportedOperationException {

    /* renamed from: k, reason: collision with root package name */
    public final j3.d f17598k;

    public k(j3.d dVar) {
        this.f17598k = dVar;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.f17598k));
    }
}
