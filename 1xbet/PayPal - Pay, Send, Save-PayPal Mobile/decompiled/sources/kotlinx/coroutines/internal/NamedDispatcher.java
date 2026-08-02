package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016H\u0097A¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00162\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\u0006\u0010\t\u001a\u00020\bH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010 \u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00162\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eH\u0096\u0001¢\u0006\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%"}, d2 = {"Lkotlinx/coroutines/internal/NamedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "dispatcher", "", "name", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/String;)V", "Lkotlin/coroutines/CoroutineContext;", "context", "", "isDispatchNeeded", "(Lkotlin/coroutines/CoroutineContext;)Z", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/getHighSpeedVideoSizes;", "block", "", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "", "time", "delay", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnTimeout", "(JLjava/lang/Runnable;Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineDispatcher;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NamedDispatcher extends kotlinx.coroutines.CoroutineDispatcher implements kotlinx.coroutines.Delay {
    private final kotlinx.coroutines.CoroutineDispatcher getHighResolutionOutputSizeshNQ4ISI;
    private final /* synthetic */ kotlinx.coroutines.Delay getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, java.lang.String str) {
        kotlinx.coroutines.Delay delay = coroutineDispatcher instanceof kotlinx.coroutines.Delay ? (kotlinx.coroutines.Delay) coroutineDispatcher : null;
        this.getHighSpeedVideoFpsRangesFor = delay == null ? kotlinx.coroutines.DefaultExecutorKt.getDefaultDelay() : delay;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineDispatcher;
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext context) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isDispatchNeeded(context);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatch(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        this.getHighResolutionOutputSizeshNQ4ISI.dispatch(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(kotlin.coroutines.CoroutineContext context, java.lang.Runnable block) {
        this.getHighResolutionOutputSizeshNQ4ISI.dispatchYield(context, block);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: toString, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlinx.coroutines.Delay
    public final void scheduleResumeAfterDelay(long timeMillis, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRangesFor.scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // kotlinx.coroutines.Delay
    public final kotlinx.coroutines.DisposableHandle invokeOnTimeout(long timeMillis, java.lang.Runnable block, kotlin.coroutines.CoroutineContext context) {
        return this.getHighSpeedVideoFpsRangesFor.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public final java.lang.Object delay(long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.delay(j, continuation);
    }
}
