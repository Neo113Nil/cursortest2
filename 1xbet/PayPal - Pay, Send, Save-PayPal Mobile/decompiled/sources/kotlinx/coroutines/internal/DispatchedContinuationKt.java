package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u0010\u001a\u00020\u0006\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\"\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00158\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "runnable", "", "safeDispatch", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "", "safeIsDispatchNeeded", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/CoroutineContext;)Z", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/Result;", "result", "resumeCancellableWith", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "yieldUndispatched", "(Lkotlinx/coroutines/internal/DispatchedContinuation;)Z", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/internal/Symbol;", "getHighSpeedVideoSizes", "REUSABLE_CLAIMED"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DispatchedContinuationKt {
    private static final kotlinx.coroutines.internal.Symbol getHighSpeedVideoFpsRanges = new kotlinx.coroutines.internal.Symbol("UNDEFINED");
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = new kotlinx.coroutines.internal.Symbol("REUSABLE_CLAIMED");

    public static final void safeDispatch(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.CoroutineContext coroutineContext, java.lang.Runnable runnable) {
        try {
            coroutineDispatcher.dispatch(coroutineContext, runnable);
        } catch (java.lang.Throwable th) {
            throw new kotlinx.coroutines.DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final boolean safeIsDispatchNeeded(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.CoroutineContext coroutineContext) {
        try {
            return coroutineDispatcher.isDispatchNeeded(coroutineContext);
        } catch (java.lang.Throwable th) {
            throw new kotlinx.coroutines.DispatchException(th, coroutineDispatcher, coroutineContext);
        }
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> continuation, java.lang.Object obj) {
        if (!(continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            continuation.resumeWith(obj);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
        java.lang.Object state = kotlinx.coroutines.CompletionStateKt.toState(obj);
        if (safeIsDispatchNeeded(dispatchedContinuation.dispatcher, dispatchedContinuation.getContext())) {
            dispatchedContinuation._state = state;
            dispatchedContinuation.resumeMode = 1;
            safeDispatch(dispatchedContinuation.dispatcher, dispatchedContinuation.getContext(), dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = state;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) dispatchedContinuation.getContext().get(kotlinx.coroutines.Job.INSTANCE);
            if (job != null && !job.isActive()) {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                dispatchedContinuation.cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                dispatchedContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
            } else {
                kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
                java.lang.Object obj2 = dispatchedContinuation.countOrElement;
                kotlin.coroutines.CoroutineContext context = continuation2.getContext();
                java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(context, obj2);
                kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation2, context, updateThreadContext) : null;
                try {
                    dispatchedContinuation.continuation.resumeWith(obj);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(context, updateThreadContext);
                    }
                }
            }
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final boolean yieldUndispatched(kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> dispatchedContinuation) {
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedQueueEmpty()) {
            return false;
        }
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            dispatchedContinuation._state = unit;
            dispatchedContinuation.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedContinuation);
            return true;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> dispatchedContinuation2 = dispatchedContinuation;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            dispatchedContinuation.run();
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
