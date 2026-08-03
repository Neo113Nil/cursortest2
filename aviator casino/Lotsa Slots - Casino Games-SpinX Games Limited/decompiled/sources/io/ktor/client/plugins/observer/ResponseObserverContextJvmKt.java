package io.ktor.client.plugins.observer;

/* compiled from: ResponseObserverContextJvm.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0080@¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/coroutines/CoroutineContext;", "getResponseObserverContext", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResponseObserverContextJvmKt {
    public static final java.lang.Object getResponseObserverContext(kotlin.coroutines.Continuation<? super kotlin.coroutines.CoroutineContext> continuation) {
        kotlin.coroutines.CoroutineContext coroutineContext = (kotlinx.coroutines.slf4j.MDCContext) continuation.getContext().get(kotlinx.coroutines.slf4j.MDCContext.INSTANCE);
        if (coroutineContext == null) {
            coroutineContext = kotlin.coroutines.EmptyCoroutineContext.INSTANCE;
        }
        return coroutineContext;
    }
}
