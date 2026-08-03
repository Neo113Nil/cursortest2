package kotlinx.coroutines;

/* compiled from: Yield.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"yield", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class YieldKt {
    public static final java.lang.Object yield(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object coroutine_suspended;
        kotlin.coroutines.CoroutineContext context = continuation.getContext();
        kotlinx.coroutines.JobKt.ensureActive(context);
        kotlin.coroutines.Continuation intercepted = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation);
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = intercepted instanceof kotlinx.coroutines.internal.DispatchedContinuation ? (kotlinx.coroutines.internal.DispatchedContinuation) intercepted : null;
        if (dispatchedContinuation == null) {
            coroutine_suspended = kotlin.Unit.INSTANCE;
        } else {
            if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(dispatchedContinuation.dispatcher, context)) {
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context, kotlin.Unit.INSTANCE);
            } else {
                kotlinx.coroutines.YieldContext yieldContext = new kotlinx.coroutines.YieldContext();
                dispatchedContinuation.dispatchYield$kotlinx_coroutines_core(context.plus(yieldContext), kotlin.Unit.INSTANCE);
                if (yieldContext.dispatcherWasUnconfined) {
                    coroutine_suspended = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(dispatchedContinuation) ? kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() : kotlin.Unit.INSTANCE;
                }
            }
            coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return coroutine_suspended == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? coroutine_suspended : kotlin.Unit.INSTANCE;
    }
}
