package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/LivenessTimerManager;", "", "", "durationMs", "tickIntervalMs", "Lkotlin/Function0;", "", "onTick", "onFinish", "<init>", "(JJLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "isRunning", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "Landroid/os/CountDownTimer;", "getHighSpeedVideoSizes", "Landroid/os/CountDownTimer;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LivenessTimerManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;
    private final kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    private android.os.CountDownTimer getHighSpeedVideoSizes;

    public LivenessTimerManager(long j, long j2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighResolutionOutputSizeshNQ4ISI = function0;
        this.getHighSpeedVideoFpsRangesFor = function02;
    }

    public /* synthetic */ LivenessTimerManager(long j, long j2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? 200L : j2, (i & 4) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.LivenessTimerManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function0, (i & 8) != 0 ? new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.LivenessTimerManager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                kotlin.Unit unit;
                unit = kotlin.Unit.INSTANCE;
                return unit;
            }
        } : function02);
    }

    public final boolean isRunning() {
        return this.getHighSpeedVideoSizes != null;
    }

    public final void start() {
        if (isRunning()) {
            return;
        }
        final long j = this.getHighSpeedVideoFpsRanges;
        final long j2 = this.Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = new android.os.CountDownTimer(j, j2) { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.LivenessTimerManager$start$1
            @Override // android.os.CountDownTimer
            public final void onTick(long millisUntilFinished) {
                kotlin.jvm.functions.Function0 function0;
                function0 = com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.LivenessTimerManager.this.getHighResolutionOutputSizeshNQ4ISI;
                function0.invoke();
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                while (true) {
                    com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.LivenessTimerManager.this.getHighSpeedVideoSizes = null;
                }
            }
        }.start();
    }

    public final void cancel() {
        android.os.CountDownTimer countDownTimer = this.getHighSpeedVideoSizes;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.getHighSpeedVideoSizes = null;
    }
}
