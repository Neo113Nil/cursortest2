package com.paypal.oslo.feature.subscriptions.businesseshub.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl", f = "BusinessesHubRepositoryImpl.kt", i = {}, l = {51}, m = "getLinkedBusinesses", n = {}, nl = {-1}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class BusinessesHubRepositoryImpl$getLinkedBusinesses$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.getLinkedBusinesses(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BusinessesHubRepositoryImpl$getLinkedBusinesses$1(com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl businessesHubRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.subscriptions.businesseshub.data.repository.BusinessesHubRepositoryImpl$getLinkedBusinesses$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = businessesHubRepositoryImpl;
    }
}
