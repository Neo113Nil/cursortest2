package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public interface v<E> {
    Object a(kotlinx.coroutines.flow.internal.n nVar);

    void cancel(CancellationException cancellationException);

    Object d(ContinuationImpl continuationImpl);

    Object e();

    i<E> iterator();
}
