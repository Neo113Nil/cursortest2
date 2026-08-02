package com.paypal.oslo.feature.helpcenter.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl", f = "SearchArticlesRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {103}, m = "executeSearchQuery", n = {"input", "query", "graphqlQuery", "apolloCall"}, nl = {104}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes5.dex */
final class SearchArticlesRepositoryImpl$executeSearchQuery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl.access$executeSearchQuery(this.getHighSpeedVideoSizesFor, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchArticlesRepositoryImpl$executeSearchQuery$1(com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl searchArticlesRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.data.repository.SearchArticlesRepositoryImpl$executeSearchQuery$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = searchArticlesRepositoryImpl;
    }
}
