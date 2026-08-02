package com.paypal.oslo.feature.balance.data.usecase.nba;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl", f = "GetNbaRecommendationsUseCaseImpl.kt", i = {0}, l = {37}, m = "invoke", n = {"surface"}, nl = {38}, s = {"L$0"}, v = 2)
/* loaded from: classes11.dex */
final class GetNbaRecommendationsUseCaseImpl$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetNbaRecommendationsUseCaseImpl$invoke$1(com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl getNbaRecommendationsUseCaseImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.balance.data.usecase.nba.GetNbaRecommendationsUseCaseImpl$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = getNbaRecommendationsUseCaseImpl;
    }
}
