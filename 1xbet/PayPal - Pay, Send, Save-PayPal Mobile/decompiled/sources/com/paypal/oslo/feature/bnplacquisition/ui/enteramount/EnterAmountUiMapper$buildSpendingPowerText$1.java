package com.paypal.oslo.feature.bnplacquisition.ui.enteramount;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper", f = "EnterAmountUiMapper.kt", i = {0, 0, 0, 0, 0}, l = {126}, m = "buildSpendingPowerText", n = {"spendingPower", "currencyCode", "amountValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "$i$a$-let-EnterAmountUiMapper$buildSpendingPowerText$2"}, nl = {127}, s = {"L$0", "L$1", "L$2", "D$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class EnterAmountUiMapper$buildSpendingPowerText$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    double getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.buildSpendingPowerText(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EnterAmountUiMapper$buildSpendingPowerText$1(com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper enterAmountUiMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplacquisition.ui.enteramount.EnterAmountUiMapper$buildSpendingPowerText$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = enterAmountUiMapper;
    }
}
