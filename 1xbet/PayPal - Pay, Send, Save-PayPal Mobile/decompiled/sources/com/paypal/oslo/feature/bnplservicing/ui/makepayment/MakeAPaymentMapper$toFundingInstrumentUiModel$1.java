package com.paypal.oslo.feature.bnplservicing.ui.makepayment;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper", f = "MakeAPaymentMapper.kt", i = {0, 0, 0, 0}, l = {135}, m = "toFundingInstrumentUiModel", n = {"$this$toFundingInstrumentUiModel", "amount", "isAutopayFiInvalid", "$i$a$-let-MakeAPaymentMapper$toFundingInstrumentUiModel$formattedBalance$1"}, nl = {134}, s = {"L$0", "L$1", "Z$0", "I$0"}, v = 2)
/* loaded from: classes11.dex */
final class MakeAPaymentMapper$toFundingInstrumentUiModel$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRanges;
        this.getOutputMinFrameDuration = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        highSpeedVideoFpsRanges = this.getHighSpeedVideoSizesFor.getHighSpeedVideoFpsRanges(null, false, this);
        return highSpeedVideoFpsRanges;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MakeAPaymentMapper$toFundingInstrumentUiModel$1(com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper makeAPaymentMapper, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.ui.makepayment.MakeAPaymentMapper$toFundingInstrumentUiModel$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = makeAPaymentMapper;
    }
}
