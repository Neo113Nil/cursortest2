package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository", f = "PayPalMockLocalCardDataRepository.kt", i = {}, l = {126}, m = "getCardIdGroups", n = {}, nl = {183}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockLocalCardDataRepository$getCardIdGroups$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getCardIdGroups(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockLocalCardDataRepository$getCardIdGroups$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository payPalMockLocalCardDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository$getCardIdGroups$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = payPalMockLocalCardDataRepository;
    }
}
