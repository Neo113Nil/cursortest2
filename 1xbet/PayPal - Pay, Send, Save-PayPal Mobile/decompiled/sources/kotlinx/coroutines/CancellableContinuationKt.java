package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a2\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00040\u0007H\u0086H¢\u0006\u0004\b\t\u0010\n\u001a2\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0004\u0012\u00020\u00040\u0007H\u0080H¢\u0006\u0004\b\f\u0010\n\u001a)\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"T", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "invokeOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/CancelHandler;)V", "Lkotlin/Function1;", "block", "suspendCancellableCoroutine", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CancellableContinuationImpl;", "suspendCancellableCoroutineReusable", "Lkotlin/coroutines/Continuation;", "delegate", "getOrCreateCancellableContinuation", "(Lkotlin/coroutines/Continuation;)Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlinx/coroutines/DisposableHandle;", "handle", "disposeOnCancellation", "(Lkotlinx/coroutines/CancellableContinuation;Lkotlinx/coroutines/DisposableHandle;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CancellableContinuationKt {
    public static final <T> void invokeOnCancellation(kotlinx.coroutines.CancellableContinuation<? super T> cancellableContinuation, kotlinx.coroutines.CancelHandler cancelHandler) {
        if (!(cancellableContinuation instanceof kotlinx.coroutines.CancellableContinuationImpl)) {
            throw new java.lang.UnsupportedOperationException("third-party implementation of CancellableContinuation is not supported");
        }
        ((kotlinx.coroutines.CancellableContinuationImpl) cancellableContinuation).invokeOnCancellationInternal$kotlinx_coroutines_core(cancelHandler);
    }

    public static final <T> java.lang.Object suspendCancellableCoroutine(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuation<? super T>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        function1.invoke(cancellableContinuationImpl);
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static final <T> java.lang.Object suspendCancellableCoroutineReusable(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.CancellableContinuationImpl<? super T>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super T> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl orCreateCancellableContinuation = getOrCreateCancellableContinuation(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation));
        try {
            function1.invoke(orCreateCancellableContinuation);
            java.lang.Object result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        } catch (java.lang.Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    public static final <T> kotlinx.coroutines.CancellableContinuationImpl<T> getOrCreateCancellableContinuation(kotlin.coroutines.Continuation<? super T> continuation) {
        if (!(continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            return new kotlinx.coroutines.CancellableContinuationImpl<>(continuation, 1);
        }
        kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core = ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).claimReusableCancellableContinuation$kotlinx_coroutines_core();
        if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
            if (!claimReusableCancellableContinuation$kotlinx_coroutines_core.resetStateReusable()) {
                claimReusableCancellableContinuation$kotlinx_coroutines_core = null;
            }
            if (claimReusableCancellableContinuation$kotlinx_coroutines_core != null) {
                return claimReusableCancellableContinuation$kotlinx_coroutines_core;
            }
        }
        return new kotlinx.coroutines.CancellableContinuationImpl<>(continuation, 2);
    }

    public static final void disposeOnCancellation(kotlinx.coroutines.CancellableContinuation<?> cancellableContinuation, kotlinx.coroutines.DisposableHandle disposableHandle) {
        invokeOnCancellation(cancellableContinuation, new kotlinx.coroutines.DisposeOnCancel(disposableHandle));
    }
}
