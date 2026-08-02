package com.paypal.oslo.feature.subscriptions.details.data.repository.mock;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository", f = "MockSubscriptionsDetailsRepository.kt", i = {0, 0}, l = {32}, m = "getConsumerAgreement", n = {"id", "agreementType"}, nl = {33}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class MockSubscriptionsDetailsRepository$getConsumerAgreement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizes.getConsumerAgreement(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MockSubscriptionsDetailsRepository$getConsumerAgreement$1(com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository mockSubscriptionsDetailsRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.data.repository.mock.MockSubscriptionsDetailsRepository$getConsumerAgreement$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = mockSubscriptionsDetailsRepository;
    }
}
