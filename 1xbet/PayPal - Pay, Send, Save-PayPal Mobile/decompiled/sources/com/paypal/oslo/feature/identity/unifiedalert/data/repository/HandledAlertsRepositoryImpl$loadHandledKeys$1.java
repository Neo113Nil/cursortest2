package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl", f = "HandledAlertsRepositoryImpl.kt", i = {}, l = {60}, m = "loadHandledKeys", n = {}, nl = {61}, s = {}, v = 2)
/* loaded from: classes5.dex */
final class HandledAlertsRepositoryImpl$loadHandledKeys$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl Camera2StreamConfigurationMap;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandledAlertsRepositoryImpl$loadHandledKeys$1(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl handledAlertsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$loadHandledKeys$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = handledAlertsRepositoryImpl;
    }
}
