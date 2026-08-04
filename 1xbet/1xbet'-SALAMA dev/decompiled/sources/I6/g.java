package I6;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient p065i6.i f3728a;

    public g(p065i6.i iVar) {
        this.f3728a = iVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3728a.toString();
    }
}
