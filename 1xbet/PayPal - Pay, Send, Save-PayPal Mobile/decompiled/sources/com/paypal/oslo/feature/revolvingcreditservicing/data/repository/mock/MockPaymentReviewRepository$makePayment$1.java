package com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository", f = "MockPaymentReviewRepository.kt", i = {0}, l = {31}, m = "makePayment", n = {"request"}, nl = {34}, s = {"L$0"}, v = 2)
/* loaded from: classes14.dex */
final class MockPaymentReviewRepository$makePayment$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.makePayment(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockPaymentReviewRepository$makePayment$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository mockPaymentReviewRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockPaymentReviewRepository$makePayment$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = mockPaymentReviewRepository;
    }
}
