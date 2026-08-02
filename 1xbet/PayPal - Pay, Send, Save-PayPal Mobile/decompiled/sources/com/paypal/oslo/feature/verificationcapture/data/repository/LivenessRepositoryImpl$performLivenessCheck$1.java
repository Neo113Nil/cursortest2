package com.paypal.oslo.feature.verificationcapture.data.repository;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl", f = "LivenessRepositoryImpl.kt", i = {0, 0, 0, 0}, l = {38}, m = "performLivenessCheck-yxL6bBk", n = {"activityContext", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "isWebFlow"}, nl = {43}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes5.dex */
final class LivenessRepositoryImpl$performLivenessCheck$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl getInputFormats;
    /* synthetic */ java.lang.Object getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputMinFrameDuration = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        java.lang.Object mo20599performLivenessCheckyxL6bBk = this.getInputFormats.mo20599performLivenessCheckyxL6bBk(null, false, null, null, this);
        return mo20599performLivenessCheckyxL6bBk == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? mo20599performLivenessCheckyxL6bBk : kotlin.Result.m23435boximpl(mo20599performLivenessCheckyxL6bBk);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LivenessRepositoryImpl$performLivenessCheck$1(com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl livenessRepositoryImpl, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.data.repository.LivenessRepositoryImpl$performLivenessCheck$1> continuation) {
        super(continuation);
        this.getInputFormats = livenessRepositoryImpl;
    }
}
