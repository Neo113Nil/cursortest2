package com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper", f = "AutopayOverviewToAutopayMapper.kt", i = {0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "createBalanceWithBackupUiModel", n = {"balance", "bank", "eligibleInstruments"}, nl = {211}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes14.dex */
final class AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(null, null, null, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper autopayOverviewToAutopayMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.autopay.viewmodel.AutopayOverviewToAutopayMapper$createBalanceWithBackupUiModel$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = autopayOverviewToAutopayMapper;
    }
}
