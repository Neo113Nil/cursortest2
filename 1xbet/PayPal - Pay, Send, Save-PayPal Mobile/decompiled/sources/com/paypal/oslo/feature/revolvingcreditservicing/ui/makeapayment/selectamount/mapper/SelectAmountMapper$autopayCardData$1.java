package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper", f = "SelectAmountMapper.kt", i = {0, 0, 1, 1, 1, 1, 1, 1}, l = {142, 179}, m = "autopayCardData", n = {"paymentOptions", "creditProductIdentifier", "paymentOptions", "creditProductIdentifier", "formattedAutopayCustomAmount", "formattingLocale", "autopayRowUiModel", "title"}, nl = {145, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, v = 2)
/* loaded from: classes14.dex */
final class SelectAmountMapper$autopayCardData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getInputFormats;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getInputSizeshNQ4ISI = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getOutputMinFrameDuration.getHighSpeedVideoSizes(null, null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectAmountMapper$autopayCardData$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$autopayCardData$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = selectAmountMapper;
    }
}
