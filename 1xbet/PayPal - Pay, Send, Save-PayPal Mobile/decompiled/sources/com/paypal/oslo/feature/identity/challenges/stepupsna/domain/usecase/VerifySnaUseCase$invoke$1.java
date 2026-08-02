package com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase", f = "VerifySnaUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {56, 75}, m = "invoke", n = {com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "evUrl", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifySnaUseCase$invoke$2", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "evUrl", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "phoneNumber", "challengeId", "input", "verifyId", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-VerifySnaUseCase$invoke$2"}, nl = {57, 76}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class VerifySnaUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    int getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase toString;
    /* synthetic */ java.lang.Object unwrapAs;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.unwrapAs = obj;
        this.getOutputStallDuration |= Integer.MIN_VALUE;
        return this.toString.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerifySnaUseCase$invoke$1(com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase verifySnaUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.challenges.stepupsna.domain.usecase.VerifySnaUseCase$invoke$1> continuation) {
        super(continuation);
        this.toString = verifySnaUseCase;
    }
}
