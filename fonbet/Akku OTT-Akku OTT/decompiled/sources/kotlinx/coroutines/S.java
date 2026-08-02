package kotlinx.coroutines;

import kotlin.SubclassOptInRequired;
import kotlin.coroutines.Continuation;

@SubclassOptInRequired(markerClass = InterfaceC1114u0.class)
/* loaded from: classes5.dex */
public interface S<T> extends InterfaceC1120x0 {
    Object await(Continuation<? super T> continuation);

    T getCompleted();

    Throwable getCompletionExceptionOrNull();

    kotlinx.coroutines.selects.c<T> getOnAwait();
}
