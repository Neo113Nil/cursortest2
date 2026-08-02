package kotlinx.coroutines.flow.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00068\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0012\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lkotlinx/coroutines/flow/internal/StackFrameContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "p0", "Lkotlin/coroutines/CoroutineContext;", "p1", "<init>", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Result;", "", "resumeWith", "(Ljava/lang/Object;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/getHighResolutionOutputSizeshNQ4ISI;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getHighSpeedVideoSizes", "Lkotlin/coroutines/Continuation;", "getHighSpeedVideoFpsRanges", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getHighSpeedVideoFpsRangesFor", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class StackFrameContinuation<T> implements kotlin.coroutines.Continuation<T>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.coroutines.CoroutineContext getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.coroutines.Continuation<T> getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    /* renamed from: getStackTraceElement */
    public final java.lang.StackTraceElement getGetHighResolutionOutputSizeshNQ4ISI() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StackFrameContinuation(kotlin.coroutines.Continuation<? super T> continuation, kotlin.coroutines.CoroutineContext coroutineContext) {
        this.getHighSpeedVideoFpsRanges = continuation;
        this.getHighSpeedVideoFpsRangesFor = coroutineContext;
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext, reason: from getter */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.getHighSpeedVideoFpsRanges;
        if (continuation instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame) {
            return (kotlin.coroutines.jvm.internal.CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(java.lang.Object p0) {
        this.getHighSpeedVideoFpsRanges.resumeWith(p0);
    }
}
