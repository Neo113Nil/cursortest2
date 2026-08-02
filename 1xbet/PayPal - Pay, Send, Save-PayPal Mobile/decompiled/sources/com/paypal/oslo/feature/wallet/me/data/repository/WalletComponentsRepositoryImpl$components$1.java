package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl", f = "WalletComponentsRepositoryImpl.kt", i = {0, 0, 0}, l = {59}, m = "components", n = {"placementId", "filters", "query"}, nl = {65}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes16.dex */
final class WalletComponentsRepositoryImpl$components$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getInputSizeshNQ4ISI.components(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WalletComponentsRepositoryImpl$components$1(com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl walletComponentsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.wallet.me.data.repository.WalletComponentsRepositoryImpl$components$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = walletComponentsRepositoryImpl;
    }
}
