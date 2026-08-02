package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH ¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\fH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8!X \u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", "T", "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "", "resumeMode", "<init>", "(I)V", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "state", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "run", "()V", "exception", "handleFatalException$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", com.visa.cbp.getEncExpo.warmup, "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DispatchedTask<T> extends kotlinx.coroutines.scheduling.Task {
    public int resumeMode;

    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
    }

    public abstract kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(java.lang.Object state) {
        return state;
    }

    public abstract java.lang.Object takeState$kotlinx_coroutines_core();

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public java.lang.Throwable getExceptionalResult$kotlinx_coroutines_core(java.lang.Object state) {
        kotlinx.coroutines.CompletedExceptionally completedExceptionally = state instanceof kotlinx.coroutines.CompletedExceptionally ? (kotlinx.coroutines.CompletedExceptionally) state : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.concurrent.CancellationException cancellationException;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED() && this.resumeMode == -1) {
            throw new java.lang.AssertionError();
        }
        try {
            kotlin.coroutines.Continuation<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            kotlin.jvm.internal.Intrinsics.checkNotNull(delegate$kotlinx_coroutines_core, "");
            kotlinx.coroutines.internal.DispatchedContinuation dispatchedContinuation = (kotlinx.coroutines.internal.DispatchedContinuation) delegate$kotlinx_coroutines_core;
            kotlin.coroutines.Continuation<T> continuation = dispatchedContinuation.continuation;
            java.lang.Object obj = dispatchedContinuation.countOrElement;
            kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = continuation.getGetHighSpeedVideoSizes();
            java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes, obj);
            kotlinx.coroutines.Job job = null;
            kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, getHighSpeedVideoSizes, updateThreadContext) : null;
            try {
                kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes2 = continuation.getGetHighSpeedVideoSizes();
                java.lang.Object takeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                java.lang.Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null && kotlinx.coroutines.DispatchedTaskKt.isCancellableMode(this.resumeMode)) {
                    job = (kotlinx.coroutines.Job) getHighSpeedVideoSizes2.get(kotlinx.coroutines.Job.INSTANCE);
                }
                if (job != null && !job.isActive()) {
                    java.util.concurrent.CancellationException cancellationException2 = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core, cancellationException2);
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    if (kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES() && (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame)) {
                        cancellationException = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(cancellationException2, (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation);
                        continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                    }
                    cancellationException = cancellationException2;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(exceptionalResult$kotlinx_coroutines_core)));
                } else {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m23436constructorimpl(getSuccessfulResult$kotlinx_coroutines_core(takeState$kotlinx_coroutines_core)));
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            } finally {
                if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                    kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
                }
            }
        } catch (kotlinx.coroutines.DispatchException e) {
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getGetHighSpeedVideoSizes(), e.getCause());
        } catch (java.lang.Throwable th) {
            handleFatalException$kotlinx_coroutines_core(th);
        }
    }

    public final void handleFatalException$kotlinx_coroutines_core(java.lang.Throwable exception) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Fatal exception in coroutines machinery for ");
        sb.append(this);
        sb.append(". Please read KDoc to 'handleFatalException' method and report this incident to maintainers");
        kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getGetHighSpeedVideoSizes(), new kotlinx.coroutines.CoroutinesInternalError(sb.toString(), exception));
    }
}
