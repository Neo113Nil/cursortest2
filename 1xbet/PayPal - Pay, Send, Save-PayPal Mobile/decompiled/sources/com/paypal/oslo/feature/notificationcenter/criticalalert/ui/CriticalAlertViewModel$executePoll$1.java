package com.paypal.oslo.feature.notificationcenter.criticalalert.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel", f = "CriticalAlertViewModel.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE}, m = "executePoll", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, com.visa.cbp.getCertUsage.getAppPrgrmIDAID}, s = {}, v = 2)
/* loaded from: classes13.dex */
final class CriticalAlertViewModel$executePoll$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CriticalAlertViewModel$executePoll$1(com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel criticalAlertViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.notificationcenter.criticalalert.ui.CriticalAlertViewModel$executePoll$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = criticalAlertViewModel;
    }
}
