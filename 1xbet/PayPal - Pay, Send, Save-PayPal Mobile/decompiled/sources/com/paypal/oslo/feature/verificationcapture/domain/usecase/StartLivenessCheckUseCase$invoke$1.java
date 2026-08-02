package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase", f = "StartLivenessCheckUseCase.kt", i = {0, 0, 0, 0}, l = {51}, m = "invoke-yxL6bBk", n = {"activityContext", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "entityId", "isWebFlow"}, nl = {-1}, s = {"L$0", "L$1", "L$2", "Z$0"}, v = 2)
/* loaded from: classes15.dex */
final class StartLivenessCheckUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    boolean getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase getInputSizeshNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getHighSpeedVideoFpsRanges |= Integer.MIN_VALUE;
        java.lang.Object m20620invokeyxL6bBk = this.getInputSizeshNQ4ISI.m20620invokeyxL6bBk(null, false, null, null, this);
        return m20620invokeyxL6bBk == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m20620invokeyxL6bBk : kotlin.Result.m23435boximpl(m20620invokeyxL6bBk);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StartLivenessCheckUseCase$invoke$1(com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase startLivenessCheckUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.usecase.StartLivenessCheckUseCase$invoke$1> continuation) {
        super(continuation);
        this.getInputSizeshNQ4ISI = startLivenessCheckUseCase;
    }
}
