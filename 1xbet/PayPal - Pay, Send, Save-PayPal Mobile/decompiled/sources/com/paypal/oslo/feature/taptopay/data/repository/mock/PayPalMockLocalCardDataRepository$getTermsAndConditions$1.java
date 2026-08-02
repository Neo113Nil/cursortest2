package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository", f = "PayPalMockLocalCardDataRepository.kt", i = {0, 1, 1, 1}, l = {144, 145}, m = "getTermsAndConditions", n = {"id", "id", "it", "$i$a$-let-PayPalMockLocalCardDataRepository$getTermsAndConditions$2"}, nl = {145, 144}, s = {"L$0", "L$0", "L$1", "I$0"}, v = 2)
/* loaded from: classes5.dex */
final class PayPalMockLocalCardDataRepository$getTermsAndConditions$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.getTermsAndConditions(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PayPalMockLocalCardDataRepository$getTermsAndConditions$1(com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository payPalMockLocalCardDataRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.data.repository.mock.PayPalMockLocalCardDataRepository$getTermsAndConditions$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = payPalMockLocalCardDataRepository;
    }
}
