package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper", f = "SelectAmountMapper.kt", i = {0}, l = {192}, m = "formatCurrency", n = {"amount"}, nl = {192}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class SelectAmountMapper$formatCurrency$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap(null, this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectAmountMapper$formatCurrency$1(com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper selectAmountMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.selectamount.mapper.SelectAmountMapper$formatCurrency$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = selectAmountMapper;
    }
}
