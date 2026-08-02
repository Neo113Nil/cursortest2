package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper", f = "FundingInstrumentUiModelMapper.kt", i = {0, 0, 0}, l = {136}, m = "paymentMethodDetailsFromEligible", n = {"eligibleInstrument", "it", "$i$a$-let-FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$3"}, nl = {136}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getOutputMinFrameDuration.getHighResolutionOutputSizeshNQ4ISI(null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetailsFromEligible$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = fundingInstrumentUiModelMapper;
    }
}
