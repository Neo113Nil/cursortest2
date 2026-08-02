package com.paypal.oslo.feature.subscriptions.hub.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl", f = "SubscriptionsHubRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {83}, m = "getConsumerAgreements", n = {"cursor", "input", "suggestedMerchantsInput", "incentivesInput"}, nl = {91}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes15.dex */
final class SubscriptionsHubRepositoryImpl$getConsumerAgreements$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoFpsRangesFor;
        this.getOutputFormats = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        highSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration.getHighSpeedVideoFpsRangesFor((java.lang.String) null, (kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.subscriptions.shared.domain.error.SubscriptionsError, com.paypal.oslo.feature.subscriptions.hub.domain.repository.SubscriptionsWithIncentives>>) this);
        return highSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubscriptionsHubRepositoryImpl$getConsumerAgreements$1(com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl subscriptionsHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.hub.data.repository.SubscriptionsHubRepositoryImpl$getConsumerAgreements$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = subscriptionsHubRepositoryImpl;
    }
}
