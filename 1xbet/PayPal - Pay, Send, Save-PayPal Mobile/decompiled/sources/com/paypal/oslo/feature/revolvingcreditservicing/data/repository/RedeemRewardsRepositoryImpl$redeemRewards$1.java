package com.paypal.oslo.feature.revolvingcreditservicing.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl", f = "RedeemRewardsRepositoryImpl.kt", i = {0, 0}, l = {81}, m = "redeemRewards", n = {"request", "mutation"}, nl = {86}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes14.dex */
final class RedeemRewardsRepositoryImpl$redeemRewards$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.redeemRewards(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedeemRewardsRepositoryImpl$redeemRewards$1(com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl redeemRewardsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.data.repository.RedeemRewardsRepositoryImpl$redeemRewards$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = redeemRewardsRepositoryImpl;
    }
}
