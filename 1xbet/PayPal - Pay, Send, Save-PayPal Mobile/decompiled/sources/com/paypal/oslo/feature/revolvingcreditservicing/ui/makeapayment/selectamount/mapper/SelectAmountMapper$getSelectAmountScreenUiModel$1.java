package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper", f = "SelectAmountMapper.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {67, 72, 73, 77}, m = "getSelectAmountScreenUiModel", n = {"paymentOptions", "creditProductIdentifier", "selectedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "generalErrorMessage", "maxAmount", "paymentOptions", "creditProductIdentifier", "selectedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "generalErrorMessage", "maxAmount", "paymentOptions", "creditProductIdentifier", "selectedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "generalErrorMessage", "maxAmount", "paymentOptions", "creditProductIdentifier", "selectedAmount", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.SELECTED_OPTION, "generalErrorMessage", "maxAmount"}, nl = {71, 73, 66, 78}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes14.dex */
final class SelectAmountMapper$getSelectAmountScreenUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    int getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper getOutputMinFrameDurationlomOqCM;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.getSelectAmountScreenUiModel(null, null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectAmountMapper$getSelectAmountScreenUiModel$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$getSelectAmountScreenUiModel$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = selectAmountMapper;
    }
}
