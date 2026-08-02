package u4;

/* loaded from: classes.dex */
public final class e extends RuntimeException {

    /* renamed from: k, reason: collision with root package name */
    public final transient a4.h f20085k;

    public e(a4.h hVar) {
        this.f20085k = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f20085k.toString();
    }
}
