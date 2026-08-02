package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel", f = "PayModeViewModel.kt", i = {0, 0, 1, 1, 1, 1}, l = {317, 325}, m = "validateAndGetDefaultCard", n = {"cardList", "activeCards", "cardList", "activeCards", "defaultCard", "$i$a$-also-PayModeViewModel$validateAndGetDefaultCard$3"}, nl = {318, com.visa.cbp.getCertUsage.getAppPrgrmIDAID}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "I$0"}, v = 2)
/* loaded from: classes15.dex */
final class PayModeViewModel$validateAndGetDefaultCard$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getOutputMinFrameDuration.Camera2StreamConfigurationMap((java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>) null, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayModeViewModel$validateAndGetDefaultCard$1(com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel payModeViewModel, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PayModeViewModel$validateAndGetDefaultCard$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = payModeViewModel;
    }
}
