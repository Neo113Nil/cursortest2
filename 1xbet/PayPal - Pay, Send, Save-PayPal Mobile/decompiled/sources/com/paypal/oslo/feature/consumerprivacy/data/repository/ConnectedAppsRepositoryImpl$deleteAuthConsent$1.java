package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl", f = "ConnectedAppsRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {60}, m = "deleteAuthConsent", n = {"consentId", "appName", "category", "input"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes11.dex */
final class ConnectedAppsRepositoryImpl$deleteAuthConsent$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputSizeshNQ4ISI = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.deleteAuthConsent(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsRepositoryImpl$deleteAuthConsent$1(com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl connectedAppsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$deleteAuthConsent$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = connectedAppsRepositoryImpl;
    }
}
