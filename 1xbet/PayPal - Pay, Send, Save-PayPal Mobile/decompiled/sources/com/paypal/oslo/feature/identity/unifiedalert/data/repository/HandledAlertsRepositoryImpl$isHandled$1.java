package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl", f = "HandledAlertsRepositoryImpl.kt", i = {0, 0, 0}, l = {39}, m = "isHandled", n = {"documentId", "userId", "expiresAtEpoch"}, nl = {-1}, s = {"L$0", "L$1", "J$0"}, v = 2)
/* loaded from: classes5.dex */
final class HandledAlertsRepositoryImpl$isHandled$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    long getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.isHandled(null, null, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandledAlertsRepositoryImpl$isHandled$1(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl handledAlertsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$isHandled$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = handledAlertsRepositoryImpl;
    }
}
