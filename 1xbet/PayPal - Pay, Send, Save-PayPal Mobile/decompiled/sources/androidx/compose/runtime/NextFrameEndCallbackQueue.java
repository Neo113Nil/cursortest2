package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001 B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00032\f\b\u0002\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/runtime/NextFrameEndCallbackQueue;", "", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "action", "Landroidx/compose/runtime/CancellationHandle;", "scheduleFrameEndCallback", "(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", "markFrameStarted", "()V", "markFrameComplete", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/getHighSpeedVideoFpsRangesFor;", "cancellationException", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/util/concurrent/CancellationException;)V", "Landroidx/compose/runtime/internal/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AwaiterQueue;", "Landroidx/compose/runtime/NextFrameEndCallbackQueue$NextFrameEndAwaiter;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/internal/AwaiterQueue;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function0;", "", "getHasAwaiters", "()Z", "hasAwaiters", "NextFrameEndAwaiter"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NextFrameEndCallbackQueue {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.AtomicBoolean.m5420constructorimpl(false);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AwaiterQueue<androidx.compose.runtime.NextFrameEndCallbackQueue.NextFrameEndAwaiter> getHighResolutionOutputSizeshNQ4ISI = new androidx.compose.runtime.internal.AwaiterQueue<>();

    public NextFrameEndCallbackQueue(final kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.runtime.NextFrameEndCallbackQueue$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.runtime.NextFrameEndCallbackQueue.m5252$r8$lambda$9ALo4eigf1mKRXmzxAti1f6Zlo(androidx.compose.runtime.NextFrameEndCallbackQueue.this, function0);
            }
        };
    }

    public final boolean getHasAwaiters() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHasAwaiters();
    }

    public final androidx.compose.runtime.CancellationHandle scheduleFrameEndCallback(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        return this.getHighResolutionOutputSizeshNQ4ISI.addAwaiter(new androidx.compose.runtime.NextFrameEndCallbackQueue.NextFrameEndAwaiter(action), this.Camera2StreamConfigurationMap);
    }

    public final void markFrameStarted() {
        androidx.compose.runtime.internal.AtomicBoolean.m5427setimpl(this.getHighSpeedVideoFpsRanges, true);
    }

    public final void markFrameComplete() {
        androidx.compose.runtime.internal.AtomicBoolean.m5427setimpl(this.getHighSpeedVideoFpsRanges, false);
        this.getHighResolutionOutputSizeshNQ4ISI.flushAndDispatchAwaiters(new kotlin.jvm.functions.Function1() { // from class: androidx.compose.runtime.NextFrameEndCallbackQueue$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.runtime.NextFrameEndCallbackQueue.$r8$lambda$hUi_6ZKEwEwv09ptnTOeBGv4jSM((androidx.compose.runtime.NextFrameEndCallbackQueue.NextFrameEndAwaiter) obj);
            }
        });
    }

    public static /* synthetic */ void cancel$default(androidx.compose.runtime.NextFrameEndCallbackQueue nextFrameEndCallbackQueue, java.util.concurrent.CancellationException cancellationException, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cancellationException = new java.util.concurrent.CancellationException("scheduler cancelled");
        }
        nextFrameEndCallbackQueue.cancel(cancellationException);
    }

    public final void cancel(java.util.concurrent.CancellationException cancellationException) {
        this.getHighResolutionOutputSizeshNQ4ISI.fail(cancellationException);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/runtime/NextFrameEndCallbackQueue$NextFrameEndAwaiter;", "Landroidx/compose/runtime/internal/AwaiterQueue$Awaiter;", "Lkotlin/Function0;", "", "p0", "<init>", "(Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "", "resumeWithException", "(Ljava/lang/Throwable;)V", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class NextFrameEndAwaiter extends androidx.compose.runtime.internal.AwaiterQueue.Awaiter {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoSizes;

        public NextFrameEndAwaiter(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
            this.getHighSpeedVideoSizes = function0;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public final void cancel() {
            this.getHighSpeedVideoSizes = null;
        }

        @Override // androidx.compose.runtime.internal.AwaiterQueue.Awaiter
        public final void resumeWithException(java.lang.Throwable p0) {
            throw p0;
        }
    }

    /* renamed from: $r8$lambda$9ALo4eig-f1mKRXmzxAti1f6Zlo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m5252$r8$lambda$9ALo4eigf1mKRXmzxAti1f6Zlo(androidx.compose.runtime.NextFrameEndCallbackQueue nextFrameEndCallbackQueue, kotlin.jvm.functions.Function0 function0) {
        if (!androidx.compose.runtime.internal.AtomicBoolean.m5424getimpl(nextFrameEndCallbackQueue.getHighSpeedVideoFpsRanges)) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hUi_6ZKEwEwv09ptnTOeBGv4jSM(androidx.compose.runtime.NextFrameEndCallbackQueue.NextFrameEndAwaiter nextFrameEndAwaiter) {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = nextFrameEndAwaiter.getHighSpeedVideoSizes;
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
