package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository", f = "PayPalMockLocalCardDataRepository.kt", i = {0, 1, 1, 1}, l = {150, 151}, m = "deleteTermsAndConditions", n = {"id", "id", "it", "$i$a$-let-PayPalMockLocalCardDataRepository$deleteTermsAndConditions$2"}, nl = {151, 152}, s = {"L$0", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockLocalCardDataRepository$deleteTermsAndConditions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getInputFormats.deleteTermsAndConditions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockLocalCardDataRepository$deleteTermsAndConditions$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository payPalMockLocalCardDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository$deleteTermsAndConditions$1> continuation) {
        super(continuation);
        this.getInputFormats = payPalMockLocalCardDataRepository;
    }
}
