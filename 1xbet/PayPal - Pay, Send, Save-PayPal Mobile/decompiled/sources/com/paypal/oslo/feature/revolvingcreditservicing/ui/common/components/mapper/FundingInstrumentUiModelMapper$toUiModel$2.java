package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper", f = "FundingInstrumentUiModelMapper.kt", i = {0}, l = {52}, m = "toUiModel$revolvingcredit_servicing_prodRelease", n = {"eligibleInstrument"}, nl = {53}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class FundingInstrumentUiModelMapper$toUiModel$2 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.toUiModel$revolvingcredit_servicing_prodRelease(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FundingInstrumentUiModelMapper$toUiModel$2(com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper fundingInstrumentUiModelMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.FundingInstrumentUiModelMapper$toUiModel$2> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = fundingInstrumentUiModelMapper;
    }
}
