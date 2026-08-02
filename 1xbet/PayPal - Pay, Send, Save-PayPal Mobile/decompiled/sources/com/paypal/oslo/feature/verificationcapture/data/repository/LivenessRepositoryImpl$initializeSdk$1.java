package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl", f = "LivenessRepositoryImpl.kt", i = {0, 0, 0}, l = {60}, m = "initializeSdk-BWLJW6A", n = {"deviceKeyIdentifier", "productionKey", "licenseExpirationDate"}, nl = {65}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes5.dex */
final class LivenessRepositoryImpl$initializeSdk$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl getInputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.getHighSpeedVideoSizes |= Integer.MIN_VALUE;
        java.lang.Object mo20598initializeSdkBWLJW6A = this.getInputFormats.mo20598initializeSdkBWLJW6A(null, null, null, this);
        return mo20598initializeSdkBWLJW6A == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo20598initializeSdkBWLJW6A : kotlin.Result.m23435boximpl(mo20598initializeSdkBWLJW6A);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LivenessRepositoryImpl$initializeSdk$1(com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl livenessRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$initializeSdk$1> continuation) {
        super(continuation);
        this.getInputFormats = livenessRepositoryImpl;
    }
}
