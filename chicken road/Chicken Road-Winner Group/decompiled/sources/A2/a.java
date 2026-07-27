package A2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class a extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient z2.e f90a;

    public a(z2.e eVar) {
        super("Flow was aborted, no more elements needed");
        this.f90a = eVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
