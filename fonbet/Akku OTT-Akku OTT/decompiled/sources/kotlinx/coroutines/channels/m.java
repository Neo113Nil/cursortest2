package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.PublishedApi;

/* loaded from: classes5.dex */
public final class m {
    @PublishedApi
    public static final void a(v<?> vVar, Throwable th) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was consumed, consumer had failed");
            cancellationException.initCause(th);
        }
        vVar.cancel(cancellationException);
    }
}
