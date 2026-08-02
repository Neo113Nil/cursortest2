package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl", f = "BusinessesHubRepositoryImpl.kt", i = {0, 0, 0, 0, 0}, l = {73}, m = "getConsumerAgreements", n = {"cursor", "input", "suggestedMerchantsInput", "incentivesInput", "query"}, nl = {81}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes15.dex */
final class BusinessesHubRepositoryImpl$getConsumerAgreements$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl getHighSpeedVideoSizesFor;
    int getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highSpeedVideoSizes;
        this.getOutputMinFrameDuration = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        highSpeedVideoSizes = this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes(null, this);
        return highSpeedVideoSizes;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessesHubRepositoryImpl$getConsumerAgreements$1(com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl businessesHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getConsumerAgreements$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = businessesHubRepositoryImpl;
    }
}
