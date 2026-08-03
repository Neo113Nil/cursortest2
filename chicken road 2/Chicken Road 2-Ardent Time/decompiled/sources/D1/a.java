package D1;

/* loaded from: classes.dex */
public final class a extends java.util.concurrent.CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient C1.e f219a;

    public a(C1.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f219a = eVar;
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable fillInStackTrace() {
        setStackTrace(new java.lang.StackTraceElement[0]);
        return this;
    }
}
