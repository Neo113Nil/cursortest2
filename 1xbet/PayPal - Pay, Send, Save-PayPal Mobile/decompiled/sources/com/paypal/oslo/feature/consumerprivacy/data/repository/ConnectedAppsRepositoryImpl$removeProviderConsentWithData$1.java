package com.paypal.oslo.feature.consumerprivacy.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl", f = "ConnectedAppsRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {120}, m = "removeProviderConsentWithData", n = {"provider", "consentId", "input", "deleteData"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes11.dex */
final class ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    boolean getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    final /* synthetic */ com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.removeProviderConsentWithData(null, null, false, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1(com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl connectedAppsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl$removeProviderConsentWithData$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = connectedAppsRepositoryImpl;
    }
}
