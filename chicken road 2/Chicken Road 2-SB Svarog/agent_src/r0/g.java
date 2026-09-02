package r0;

/* loaded from: classes.dex */
public final class g extends RuntimeException {

    /* renamed from: b, reason: collision with root package name */
    public final transient Y.i f1167b;

    public g(Y.i iVar) {
        this.f1167b = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f1167b.toString();
    }
}
