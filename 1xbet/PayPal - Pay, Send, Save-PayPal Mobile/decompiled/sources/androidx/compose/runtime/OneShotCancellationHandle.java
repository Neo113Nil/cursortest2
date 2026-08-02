package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/OneShotCancellationHandle;", "Landroidx/compose/runtime/CancellationHandle;", "Lkotlin/Function0;", "", "action", "<init>", "(Lkotlin/jvm/functions/Function0;)V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "getHighSpeedVideoFpsRanges", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Landroidx/compose/runtime/internal/AtomicBoolean;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OneShotCancellationHandle implements androidx.compose.runtime.CancellationHandle {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoSizes = androidx.compose.runtime.internal.AtomicBoolean.m5420constructorimpl(false);

    public OneShotCancellationHandle(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.Camera2StreamConfigurationMap = function0;
    }

    @Override // androidx.compose.runtime.CancellationHandle
    public final void cancel() {
        if (androidx.compose.runtime.internal.AtomicBoolean.m5425getAndSetimpl(this.getHighSpeedVideoSizes, true)) {
            return;
        }
        this.Camera2StreamConfigurationMap.invoke();
    }
}
