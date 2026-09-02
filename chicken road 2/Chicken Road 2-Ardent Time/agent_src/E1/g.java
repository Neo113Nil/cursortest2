package E1;

/* loaded from: classes.dex */
public final class g extends java.lang.RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient k1.i f273a;

    public g(k1.i iVar) {
        this.f273a = iVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final java.lang.String getLocalizedMessage() {
        return this.f273a.toString();
    }
}
