package t0;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class l extends CancellationException {
    public l(long j5) {
        super("Timed out waiting for " + j5 + " ms");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(q.f19498b);
        return this;
    }
}
