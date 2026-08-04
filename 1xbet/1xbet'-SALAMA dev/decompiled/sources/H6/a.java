package H6;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient G6.h f3423a;

    public a(G6.h hVar) {
        super("Flow was aborted, no more elements needed");
        this.f3423a = hVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
