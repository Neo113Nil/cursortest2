package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl", f = "UnifiedAlertsRemoteRepositoryImpl.kt", i = {0, 0}, l = {61}, m = "fetchAlerts", n = {"input", "query"}, nl = {70}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes5.dex */
final class UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoFpsRanges.fetchAlerts(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1(com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl unifiedAlertsRemoteRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.repository.UnifiedAlertsRemoteRepositoryImpl$fetchAlerts$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoFpsRanges = unifiedAlertsRemoteRepositoryImpl;
    }
}
