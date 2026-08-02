package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0001\u001a\u00020\u0000H\u0086@¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "yield", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class YieldKt {
    public static final java.lang.Object yield(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj;
        kotlin.coroutines.CoroutineContext getInputFormats = continuation.getGetInputFormats();
        kotlinx.coroutines.JobKt.ensureActive(getInputFormats);
        kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = intercepted instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) intercepted : null;
        if (dispatchedContinuation == null) {
            obj = kotlin.Unit.INSTANCE;
        } else {
            if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, getInputFormats)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(getInputFormats, kotlin.Unit.INSTANCE);
            } else {
                kotlinx.coroutines.YieldContext yieldContext = new kotlinx.coroutines.YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(getInputFormats.plus(yieldContext), kotlin.Unit.INSTANCE);
                if (yieldContext.dispatcherWasUnconfined && !kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation)) {
                    obj = kotlin.Unit.INSTANCE;
                }
            }
            obj = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }
}
