package com.paypal.oslo.feature.bnplservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository", f = "MockMakeAPaymentRepository.kt", i = {0}, l = {60}, m = "postMakeAPayment", n = {"input"}, nl = {61}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class MockMakeAPaymentRepository$postMakeAPayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.postMakeAPayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockMakeAPaymentRepository$postMakeAPayment$1(com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository mockMakeAPaymentRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockMakeAPaymentRepository$postMakeAPayment$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockMakeAPaymentRepository;
    }
}
