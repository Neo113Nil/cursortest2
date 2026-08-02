package com.paypal.oslo.feature.identity.unifiedalert.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl", f = "HandledAlertsRepositoryImpl.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {47, 53}, m = "addHandledAlert", n = {"documentId", "userId", "key", "expiresAtEpoch", "documentId", "userId", "key", org.jose4j.jwk.JsonWebKeySet.JWK_SET_MEMBER_NAME, "expiresAtEpoch"}, nl = {48, 54}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0"}, v = 2)
/* loaded from: classes5.dex */
final class HandledAlertsRepositoryImpl$addHandledAlert$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    long getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    int getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl getOutputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getOutputFormats.addHandledAlert(null, null, 0L, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HandledAlertsRepositoryImpl$addHandledAlert$1(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl handledAlertsRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl$addHandledAlert$1> continuation) {
        super(continuation);
        this.getOutputFormats = handledAlertsRepositoryImpl;
    }
}
