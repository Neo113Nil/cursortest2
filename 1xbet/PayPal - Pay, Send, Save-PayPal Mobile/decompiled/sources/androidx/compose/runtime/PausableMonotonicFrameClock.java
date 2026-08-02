package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0017\u0010\r\u001a\u0013\u0012\t\u0012\u00070\u000b¢\u0006\u0002\b\f\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "<init>", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_PAUSE, "()V", "resume", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroidx/compose/runtime/Latch;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/Latch;", "getHighResolutionOutputSizeshNQ4ISI", "", "isPaused", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PausableMonotonicFrameClock implements androidx.compose.runtime.MonotonicFrameClock {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.Latch getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.Latch();
    private final androidx.compose.runtime.MonotonicFrameClock getHighSpeedVideoSizes;

    public PausableMonotonicFrameClock(androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock) {
        this.getHighSpeedVideoSizes = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <R> R fold(R r, kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.CoroutineContext.Element, ? extends R> function2) {
        return (R) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.fold(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ <E extends kotlin.coroutines.CoroutineContext.Element> E get(kotlin.coroutines.CoroutineContext.Key<E> key) {
        return (E) androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext minusKey(kotlin.coroutines.CoroutineContext.Key<?> key) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final /* bridge */ kotlin.coroutines.CoroutineContext plus(kotlin.coroutines.CoroutineContext coroutineContext) {
        return androidx.compose.runtime.MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final boolean isPaused() {
        return !this.getHighResolutionOutputSizeshNQ4ISI.isOpen();
    }

    public final void pause() {
        this.getHighResolutionOutputSizeshNQ4ISI.closeLatch();
    }

    public final void resume() {
        this.getHighResolutionOutputSizeshNQ4ISI.openLatch();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7.await(r0) != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        if (continuation instanceof androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            if ((pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.runtime.Latch latch = this.getHighResolutionOutputSizeshNQ4ISI;
                    pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRangesFor = function1;
                    pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    function1 = (kotlin.jvm.functions.Function1) pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock = this.getHighSpeedVideoSizes;
                pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRangesFor = null;
                pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges = 2;
                java.lang.Object withFrameNanos = monotonicFrameClock.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
                return withFrameNanos != coroutine_suspended ? coroutine_suspended : withFrameNanos;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new androidx.compose.runtime.PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        java.lang.Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        androidx.compose.runtime.MonotonicFrameClock monotonicFrameClock2 = this.getHighSpeedVideoSizes;
        pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRangesFor = null;
        pausableMonotonicFrameClock$withFrameNanos$1.getHighSpeedVideoFpsRanges = 2;
        java.lang.Object withFrameNanos2 = monotonicFrameClock2.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        if (withFrameNanos2 != coroutine_suspended2) {
        }
    }
}
