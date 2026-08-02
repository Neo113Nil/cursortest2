package com.paypal.oslo.feature.home.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository", f = "RealHomeFeedRepository.kt", i = {0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE}, m = "fetchHomeFeed", n = {"query"}, nl = {445}, s = {"L$0"}, v = 2)
/* loaded from: classes5.dex */
final class RealHomeFeedRepository$fetchHomeFeed$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Camera2StreamConfigurationMap;
        this.getHighSpeedVideoSizes = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap((kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.core.network.graphql.error.CallError, ? extends java.util.List<? extends com.paypal.oslo.feature.home.domain.model.Section<?>>>>) this);
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHomeFeedRepository$fetchHomeFeed$1(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository realHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$fetchHomeFeed$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = realHomeFeedRepository;
    }
}
