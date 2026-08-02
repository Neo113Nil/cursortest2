package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl", f = "AccountVisibilityRepositoryImpl.kt", i = {0}, l = {141}, m = "updateAllowVenmoDiscovery", n = {"allowVenmoDiscovery"}, nl = {161}, s = {"Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.Camera2StreamConfigurationMap.updateAllowVenmoDiscovery(false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1(com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl accountVisibilityRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.AccountVisibilityRepositoryImpl$updateAllowVenmoDiscovery$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = accountVisibilityRepositoryImpl;
    }
}
