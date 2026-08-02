package com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper", f = "PayLaterHubOverviewMapper.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3}, l = {86, 87, 89, 91}, m = "toUiModel", n = {"overview", "vccCreditAccountId", "planListLimit", "overview", "vccCreditAccountId", "planListLimit", "overview", "vccCreditAccountId", "it", "planListLimit", "$i$a$-let-PayLaterHubOverviewMapper$toUiModel$2", "overview", "vccCreditAccountId", "planListLimit"}, nl = {87, 88, 88, 92}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class PayLaterHubOverviewMapper$toUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    /* synthetic */ java.lang.Object getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizeshNQ4ISI = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.toUiModel(null, 0, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayLaterHubOverviewMapper$toUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper payLaterHubOverviewMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.paylaterhub.utils.mapper.PayLaterHubOverviewMapper$toUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = payLaterHubOverviewMapper;
    }
}
