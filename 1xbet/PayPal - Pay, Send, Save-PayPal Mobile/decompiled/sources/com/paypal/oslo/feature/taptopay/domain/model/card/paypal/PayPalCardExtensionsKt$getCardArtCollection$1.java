package com.paypal.oslo.feature.taptopay.domain.model.card.paypal;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt", f = "PayPalCardExtensions.kt", i = {0, 0}, l = {54}, m = "getCardArtCollection", n = {"paypalCardId", "payPalGetCardArtUseCase"}, nl = {71}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class PayPalCardExtensionsKt$getCardArtCollection$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt.getHighResolutionOutputSizeshNQ4ISI(null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    PayPalCardExtensionsKt$getCardArtCollection$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalCardExtensionsKt$getCardArtCollection$1> continuation) {
        super(continuation);
    }
}
