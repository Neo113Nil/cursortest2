package com.paypal.oslo.feature.home.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository", f = "RealHomeFeedRepository.kt", i = {}, l = {207}, m = "fetchAccountSnapshot", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class RealHomeFeedRepository$fetchAccountSnapshot$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.fetchAccountSnapshot(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RealHomeFeedRepository$fetchAccountSnapshot$1(com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository realHomeFeedRepository, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.home.data.repository.RealHomeFeedRepository$fetchAccountSnapshot$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = realHomeFeedRepository;
    }
}
