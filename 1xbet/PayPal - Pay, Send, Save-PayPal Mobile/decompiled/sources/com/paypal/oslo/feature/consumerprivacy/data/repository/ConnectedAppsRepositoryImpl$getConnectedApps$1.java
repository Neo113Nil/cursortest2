package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl", f = "ConnectedAppsRepositoryImpl.kt", i = {}, l = {37}, m = "getConnectedApps", n = {}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {}, v = 2)
/* loaded from: classes11.dex */
final class ConnectedAppsRepositoryImpl$getConnectedApps$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getHighResolutionOutputSizeshNQ4ISI.getConnectedApps(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsRepositoryImpl$getConnectedApps$1(com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl connectedAppsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$getConnectedApps$1> continuation) {
        super(continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = connectedAppsRepositoryImpl;
    }
}
