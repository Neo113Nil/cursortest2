package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001fB\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u00032\f\b\u0002\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0015\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001b8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "timeNanos", "sendFrame", "(J)V", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cancellationException", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/util/concurrent/CancellationException;)V", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/internal/AwaiterQueue;", "Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", "Landroidx/compose/runtime/internal/AwaiterQueue;", "", "getHasAwaiters", "()Z", "hasAwaiters", "FrameAwaiter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BroadcastFrameClock implements androidx.compose.runtime.MonotonicFrameClock {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AwaiterQueue<androidx.compose.runtime.BroadcastFrameClock.FrameAwaiter<?>> getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    public BroadcastFrameClock(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoSizes = new androidx.compose.runtime.internal.AwaiterQueue<>();
    }

    public /* synthetic */ BroadcastFrameClock(kotlin.jvm.functions.Function0 function0, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function0);
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

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R$\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/runtime/BroadcastFrameClock$FrameAwaiter;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;", "Lkotlin/Function1;", "", "p0", "Lkotlinx/coroutines/CancellableContinuation;", "p1", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/CancellableContinuation;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "resumeWithException", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "(J)V", "Lkotlinx/coroutines/CancellableContinuation;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class FrameAwaiter<R> extends androidx.compose.runtime.internal.AwaiterQueue.Awaiter {
        private kotlinx.coroutines.CancellableContinuation<? super R> getHighSpeedVideoFpsRangesFor;
        private kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> getHighSpeedVideoSizes;

        public FrameAwaiter(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation) {
            this.getHighSpeedVideoFpsRangesFor = cancellableContinuation;
            this.getHighSpeedVideoSizes = function1;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public final void cancel() {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRangesFor = null;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public final void resumeWithException(java.lang.Throwable p0) {
            kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation = this.getHighSpeedVideoFpsRangesFor;
            if (cancellableContinuation != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(p0)));
            }
        }

        public final void getHighSpeedVideoFpsRangesFor(long p0) {
            kotlinx.coroutines.CancellableContinuation<? super R> cancellableContinuation;
            java.lang.Object m23436constructorimpl;
            kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1 = this.getHighSpeedVideoSizes;
            if (function1 == null || (cancellableContinuation = this.getHighSpeedVideoFpsRangesFor) == null) {
                return;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                androidx.compose.runtime.BroadcastFrameClock.FrameAwaiter<R> frameAwaiter = this;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(function1.invoke(java.lang.Long.valueOf(p0)));
            } catch (java.lang.Throwable th) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
            }
            cancellableContinuation.resumeWith(m23436constructorimpl);
        }
    }

    public final boolean getHasAwaiters() {
        return this.getHighSpeedVideoSizes.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(long j, androidx.compose.runtime.BroadcastFrameClock.FrameAwaiter frameAwaiter) {
        frameAwaiter.getHighSpeedVideoFpsRangesFor(j);
        return kotlin.Unit.INSTANCE;
    }

    public final void sendFrame(final long timeNanos) {
        this.getHighSpeedVideoSizes.flushAndDispatchAwaiters(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.BroadcastFrameClock$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit highSpeedVideoFpsRanges;
                highSpeedVideoFpsRanges = androidx.compose.runtime.BroadcastFrameClock.getHighSpeedVideoFpsRanges(timeNanos, (androidx.compose.runtime.BroadcastFrameClock.FrameAwaiter) obj);
                return highSpeedVideoFpsRanges;
            }
        });
    }

    public static /* synthetic */ void cancel$default(androidx.compose.runtime.BroadcastFrameClock broadcastFrameClock, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new java.util.concurrent.CancellationException("clock cancelled");
        }
        broadcastFrameClock.cancel(cancellationException);
    }

    public final void cancel(java.util.concurrent.CancellationException cancellationException) {
        this.getHighSpeedVideoSizes.fail(cancellationException);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    public final <R> java.lang.Object withFrameNanos(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> function1, kotlin.coroutines.Continuation<? super R> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        final androidx.compose.runtime.CancellationHandle addAwaiter = this.getHighSpeedVideoSizes.addAwaiter(new androidx.compose.runtime.BroadcastFrameClock.FrameAwaiter(function1, cancellableContinuationImpl2), this.Camera2StreamConfigurationMap);
        cancellableContinuationImpl2.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.runtime.BroadcastFrameClock$withFrameNanos$2$1
            private void getHighSpeedVideoFpsRangesFor() {
                androidx.compose.runtime.CancellationHandle.this.cancel();
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                getHighSpeedVideoFpsRangesFor();
                return kotlin.Unit.INSTANCE;
            }
        });
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BroadcastFrameClock() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
