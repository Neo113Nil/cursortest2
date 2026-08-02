package kotlin.coroutines;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \"*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\"B!\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0010\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0016\u0010!\u001a\u0004\u0018\u00010\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 "}, d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "", "initialResult", "<init>", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "(Lkotlin/coroutines/Continuation;)V", "Lkotlin/Result;", "result", "", "resumeWith", "(Ljava/lang/Object;)V", "getOrThrow", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "Ljava/lang/Object;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SafeContinuation<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final kotlin.coroutines.SafeContinuation.Companion Companion = new kotlin.coroutines.SafeContinuation.Companion(null);
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.coroutines.SafeContinuation<?>, java.lang.Object> getHighSpeedVideoSizes = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlin.coroutines.SafeContinuation.class, java.lang.Object.class, "result");

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<T> getHighSpeedVideoSizes;
    private volatile java.lang.Object result;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeContinuation(kotlin.coroutines.Continuation<? super T> continuation, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
        this.getHighSpeedVideoSizes = continuation;
        this.result = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeContinuation(kotlin.coroutines.Continuation<? super T> continuation) {
        this(continuation, kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(continuation, "");
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes.getGetHighSpeedVideoSizes();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003RP\u0010\b\u001a>\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u0001*\u001e\u0012\u0010\u0012\u000e\u0012\u0002\b\u0003*\u0006\u0012\u0002\b\u00030\u00050\u0005\u0012\b\u0012\u0006*\u00020\u00010\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/coroutines/SafeContinuation$Companion;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/SafeContinuation;", "getHighSpeedVideoSizes", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object result) {
        while (true) {
            java.lang.Object obj = this.result;
            if (obj == kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED) {
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED, result)) {
                    return;
                }
            } else {
                if (obj != kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED(), kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED)) {
                    this.getHighSpeedVideoSizes.resumeWith(result);
                    return;
                }
            }
        }
    }

    public final java.lang.Object getOrThrow() {
        java.lang.Object obj = this.result;
        if (obj == kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED) {
            if (androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoSizes, this, kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED, kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED())) {
                return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            }
            obj = this.result;
        }
        if (obj == kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED) {
            return kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (obj instanceof kotlin.Result.Failure) {
            throw ((kotlin.Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.getHighSpeedVideoSizes;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SafeContinuation for ");
        sb.append(this.getHighSpeedVideoSizes);
        return sb.toString();
    }
}
