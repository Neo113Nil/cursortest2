package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u000e\u001a'\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a.\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0011H\u0080\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0017\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u001a\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a\"\u0014\u0010\u001f\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001a\"\u0014\u0010 \u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u001a\"\u0018\u0010!\u001a\u00020\t*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"\"\u0018\u0010#\u001a\u00020\t*\u00020\u00028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\""}, d2 = {"T", "Lkotlinx/coroutines/DispatchedTask;", "", "mode", "", "dispatch", "(Lkotlinx/coroutines/DispatchedTask;I)V", "Lkotlin/coroutines/Continuation;", "delegate", "", "undispatched", "resume", "(Lkotlinx/coroutines/DispatchedTask;Lkotlin/coroutines/Continuation;Z)V", "getHighSpeedVideoFpsRangesFor", "(Lkotlinx/coroutines/DispatchedTask;)V", "Lkotlinx/coroutines/EventLoop;", "eventLoop", "Lkotlin/Function0;", "block", "runUnconfinedEventLoop", "(Lkotlinx/coroutines/DispatchedTask;Lkotlinx/coroutines/EventLoop;Lkotlin/jvm/functions/Function0;)V", "", "exception", "resumeWithStackTrace", "(Lkotlin/coroutines/Continuation;Ljava/lang/Throwable;)V", "MODE_ATOMIC", com.visa.cbp.getEncExpo.warmup, "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "(I)Z", "isReusableMode"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean isReusableMode(int i) {
        return i == 2;
    }

    public static final <T> void dispatch(kotlinx.coroutines.DispatchedTask<? super T> dispatchedTask, int i) {
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && i == -1) {
            throw new java.lang.AssertionError();
        }
        kotlin.coroutines.Continuation<? super T> delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (!z && (delegate$kotlinx_coroutines_core instanceof kotlinx.coroutines.internal.DispatchedContinuation) && isCancellableMode(i) == isCancellableMode(dispatchedTask.resumeMode)) {
            kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) delegate$kotlinx_coroutines_core;
            kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
            kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = dispatchedContinuation.getGetHighSpeedVideoSizes();
            if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, getHighSpeedVideoSizes)) {
                kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(coroutineDispatcher, getHighSpeedVideoSizes, dispatchedTask);
                return;
            } else {
                getHighSpeedVideoFpsRangesFor(dispatchedTask);
                return;
            }
        }
        resume(dispatchedTask, delegate$kotlinx_coroutines_core, z);
    }

    public static final <T> void resume(kotlinx.coroutines.DispatchedTask<? super T> dispatchedTask, kotlin.coroutines.Continuation<? super T> continuation, boolean z) {
        java.lang.Object successfulResult$kotlinx_coroutines_core;
        java.lang.Object takeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = kotlin.ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core);
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            successfulResult$kotlinx_coroutines_core = dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
        }
        java.lang.Object m23436constructorimpl = kotlin.Result.m23436constructorimpl(successfulResult$kotlinx_coroutines_core);
        if (z) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(continuation, "");
            kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) continuation;
            kotlin.coroutines.Continuation<T> continuation2 = dispatchedContinuation.continuation;
            java.lang.Object obj = dispatchedContinuation.countOrElement;
            kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = continuation2.getGetHighSpeedVideoSizes();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes, obj);
            kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation2, getHighSpeedVideoSizes, updateThreadContext) : null;
            try {
                dispatchedContinuation.continuation.resumeWith(m23436constructorimpl);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
                    return;
                }
                return;
            } catch (java.lang.Throwable th) {
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
                }
                throw th;
            }
        }
        continuation.resumeWith(m23436constructorimpl);
    }

    private static final void getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.DispatchedTask<?> dispatchedTask) {
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void runUnconfinedEventLoop(kotlinx.coroutines.DispatchedTask<?> dispatchedTask, kotlinx.coroutines.EventLoop eventLoop, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        eventLoop.incrementUseCount(true);
        try {
            function0.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
        } catch (java.lang.Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th);
            } finally {
                eventLoop.decrementUseCount(true);
            }
        }
    }

    public static final void resumeWithStackTrace(kotlin.coroutines.Continuation<?> continuation, java.lang.Throwable th) {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
            th = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(th, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
        }
        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th)));
    }
}
