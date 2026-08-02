package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl", f = "ConnectedAppsRepositoryImpl.kt", i = {0, 0}, l = {85}, m = "deactivateAuthConsent", n = {"grantIds", "input"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes11.dex */
final class ConnectedAppsRepositoryImpl$deactivateAuthConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl getHighSpeedVideoFpsRangesFor;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRangesFor.deactivateAuthConsent(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsRepositoryImpl$deactivateAuthConsent$1(com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl connectedAppsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deactivateAuthConsent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRangesFor = connectedAppsRepositoryImpl;
    }
}
