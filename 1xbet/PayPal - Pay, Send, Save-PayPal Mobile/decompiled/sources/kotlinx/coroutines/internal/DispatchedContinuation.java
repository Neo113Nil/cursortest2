package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0012\u001a\n\u0018\u00010\u0013j\u0004\u0018\u0001`\u0014H\u0016¢\u0006\u0002\u0010\u0015J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020!H\u0000¢\u0006\u0002\b$J\u0015\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001aH\u0000¢\u0006\u0002\b&J\u001b\u0010'\u001a\u0004\u0018\u00010(2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030)H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0002\b-J\u000f\u0010.\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\b/J\u001b\u00103\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0002\u00106J\u001e\u00107\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b8\u00106J\u0018\u00109\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\b;J\u001e\u0010<\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b=\u00106J\u001f\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00028\u0000H\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020EH\u0016R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0016\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0018X\u0082\u0004R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0012\u0010?\u001a\u00020@X\u0096\u0005¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "countOrElement", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "tryReleaseClaimedContinuation", "", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "postponeCancellation", "cause", "postponeCancellation$kotlinx_coroutines_core", "takeState", "takeState$kotlinx_coroutines_core", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeCancellableWith", "resumeCancellableWith$kotlinx_coroutines_core", "resumeCancelled", "state", "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "dispatchYield", "context", "Lkotlin/coroutines/CoroutineContext;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.DispatchedContinuation.class, java.lang.Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation$volatile;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, kotlin.coroutines.Continuation<? super T> continuation) {
        super(-1);
        kotlinx.coroutines.internal.Symbol symbol;
        this.dispatcher = coroutineDispatcher;
        this.continuation = continuation;
        symbol = kotlinx.coroutines.internal.DispatchedContinuationKt.getHighSpeedVideoFpsRanges;
        this._state = symbol;
        this.countOrElement = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(getGetHighSpeedVideoSizes());
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        kotlinx.coroutines.CancellableContinuationImpl<?> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        if (highSpeedVideoFpsRanges != null) {
            highSpeedVideoFpsRanges.detachChild$kotlinx_coroutines_core();
        }
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final java.lang.Object takeState$kotlinx_coroutines_core() {
        kotlinx.coroutines.internal.Symbol symbol;
        kotlinx.coroutines.internal.Symbol symbol2;
        java.lang.Object obj = this._state;
        if (kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()) {
            symbol2 = kotlinx.coroutines.internal.DispatchedContinuationKt.getHighSpeedVideoFpsRanges;
            if (obj == symbol2) {
                throw new java.lang.AssertionError();
            }
        }
        symbol = kotlinx.coroutines.internal.DispatchedContinuationKt.getHighSpeedVideoFpsRanges;
        this._state = symbol;
        return obj;
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public final kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object result) {
        kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes;
        java.lang.Object updateThreadContext;
        java.lang.Object state = kotlinx.coroutines.CompletionStateKt.toState(result);
        if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(this.dispatcher, getGetHighSpeedVideoSizes())) {
            this._state = state;
            this.resumeMode = 0;
            kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(this.dispatcher, getGetHighSpeedVideoSizes(), this);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 0;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            getHighSpeedVideoSizes = getGetHighSpeedVideoSizes();
            updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes, this.countOrElement);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.continuation.resumeWith(result);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent()) {
            }
        } finally {
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
        }
    }

    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object result) {
        java.lang.Object state = kotlinx.coroutines.CompletionStateKt.toState(result);
        if (kotlinx.coroutines.internal.DispatchedContinuationKt.safeIsDispatchNeeded(this.dispatcher, getGetHighSpeedVideoSizes())) {
            this._state = state;
            this.resumeMode = 1;
            kotlinx.coroutines.internal.DispatchedContinuationKt.safeDispatch(this.dispatcher, getGetHighSpeedVideoSizes(), this);
            return;
        }
        kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED();
        kotlinx.coroutines.EventLoop eventLoop$kotlinx_coroutines_core = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            this._state = state;
            this.resumeMode = 1;
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(this);
            return;
        }
        kotlinx.coroutines.internal.DispatchedContinuation<T> dispatchedContinuation = this;
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getGetHighSpeedVideoSizes().get(kotlinx.coroutines.Job.INSTANCE);
            if (job != null && !job.isActive()) {
                java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
                cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
            } else {
                kotlin.coroutines.Continuation<T> continuation = this.continuation;
                java.lang.Object obj = this.countOrElement;
                kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = continuation.getGetHighSpeedVideoSizes();
                java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes, obj);
                kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, getHighSpeedVideoSizes, updateThreadContext) : null;
                try {
                    this.continuation.resumeWith(result);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                } finally {
                    if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                        kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
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

    public final boolean resumeCancelled$kotlinx_coroutines_core(java.lang.Object state) {
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) getGetHighSpeedVideoSizes().get(kotlinx.coroutines.Job.INSTANCE);
        if (job == null || job.isActive()) {
            return false;
        }
        java.util.concurrent.CancellationException cancellationException = job.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(cancellationException)));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(java.lang.Object result) {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        java.lang.Object obj = this.countOrElement;
        kotlin.coroutines.CoroutineContext getHighSpeedVideoSizes = continuation.getGetHighSpeedVideoSizes();
        java.lang.Object updateThreadContext = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(getHighSpeedVideoSizes, obj);
        kotlinx.coroutines.UndispatchedCoroutine<?> updateUndispatchedCompletion = updateThreadContext != kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS ? kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(continuation, getHighSpeedVideoSizes, updateThreadContext) : null;
        try {
            this.continuation.resumeWith(result);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } finally {
            if (updateUndispatchedCompletion == null || updateUndispatchedCompletion.clearThreadContext()) {
                kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(getHighSpeedVideoSizes, updateThreadContext);
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(kotlin.coroutines.CoroutineContext context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DispatchedContinuation[");
        sb.append(this.dispatcher);
        sb.append(", ");
        sb.append(kotlinx.coroutines.DebugStringsKt.toDebugString(this.continuation));
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getHighSpeedVideoFpsRanges() {
        java.lang.Object obj = getHighSpeedVideoFpsRanges.get(this);
        if (obj instanceof kotlinx.coroutines.CancellableContinuationImpl) {
            return (kotlinx.coroutines.CancellableContinuationImpl) obj;
        }
        return null;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (getHighSpeedVideoFpsRanges.get(this) == kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                getHighSpeedVideoFpsRanges.set(this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.CancellableContinuationImpl) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, obj, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                    return (kotlinx.coroutines.CancellableContinuationImpl) obj;
                }
            } else if (obj != kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException("Inconsistent state ".concat(java.lang.String.valueOf(obj)).toString());
            }
        }
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return getHighSpeedVideoFpsRanges.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(java.lang.Throwable cause) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
        while (true) {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED)) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED, cause)) {
                    return true;
                }
            } else {
                if (obj instanceof java.lang.Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(kotlinx.coroutines.CancellableContinuation<?> continuation) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = getHighSpeedVideoFpsRanges;
        do {
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED) {
                if (!(obj instanceof java.lang.Throwable)) {
                    throw new java.lang.IllegalStateException("Inconsistent state ".concat(java.lang.String.valueOf(obj)).toString());
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, obj, null)) {
                    return (java.lang.Throwable) obj;
                }
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, this, kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED, continuation));
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoSizes() {
        return this.continuation.getGetHighSpeedVideoSizes();
    }
}
