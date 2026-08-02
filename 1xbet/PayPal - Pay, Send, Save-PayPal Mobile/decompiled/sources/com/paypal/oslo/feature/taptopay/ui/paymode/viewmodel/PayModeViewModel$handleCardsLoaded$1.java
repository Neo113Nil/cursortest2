package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel", f = "PayModeViewModel.kt", i = {0, 0, 1, 1, 1}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 256}, m = "handleCardsLoaded", n = {"cardList", "initialPaymentState", "cardList", "initialPaymentState", "validatedCard"}, nl = {251, 257}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$handleCardsLoaded$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel.access$handleCardsLoaded(this.getInputSizeshNQ4ISI, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$handleCardsLoaded$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$handleCardsLoaded$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = payModeViewModel;
    }
}
