package com.paypal.oslo.feature.subscriptions.details.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl", f = "SubscriptionDetailsRepositoryImpl.kt", i = {0, 0}, l = {44}, m = "getConsumerAgreement", n = {"id", "agreementType"}, nl = {48}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.getConsumerAgreement(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1(com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl subscriptionDetailsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.details.data.repository.SubscriptionDetailsRepositoryImpl$getConsumerAgreement$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = subscriptionDetailsRepositoryImpl;
    }
}
