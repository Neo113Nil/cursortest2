package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper", f = "FundingInstrumentUiModelMapper.kt", i = {0, 0, 0}, l = {91}, m = "paymentMethodDetails", n = {"fundingInstrument", "it", "$i$a$-let-FundingInstrumentUiModelMapper$paymentMethodDetails$3"}, nl = {91}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes14.dex */
final class FundingInstrumentUiModelMapper$paymentMethodDetails$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputFormats.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingInstrumentUiModelMapper$paymentMethodDetails$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$paymentMethodDetails$1> continuation) {
        super(continuation);
        this.getOutputFormats = fundingInstrumentUiModelMapper;
    }
}
