package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface T0<S> extends CoroutineContext.Element {
    void restoreThreadContext(CoroutineContext coroutineContext, S s);

    S updateThreadContext(CoroutineContext coroutineContext);
}
