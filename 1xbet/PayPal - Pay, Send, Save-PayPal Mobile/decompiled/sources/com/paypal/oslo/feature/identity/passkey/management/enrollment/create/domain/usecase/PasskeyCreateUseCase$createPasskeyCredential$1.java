package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase", f = "PasskeyCreateUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_QUESTION_VALUE}, m = "createPasskeyCredential", n = {"activityContext", "enrollmentOption", "userEmail", "userDisplayName", "raise$iv$iv$iv", "$this$createPasskeyCredential_u24lambda_u240", "bindChallenge", "request", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$createPasskeyCredential$2"}, nl = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyCreateUseCase$createPasskeyCredential$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    java.lang.Object getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputStallDuration;
    java.lang.Object getOutputStallDurationlomOqCM;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase getValidOutputFormatsForInputhNQ4ISI;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object highResolutionOutputSizeshNQ4ISI;
        this.getOutputStallDuration = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        highResolutionOutputSizeshNQ4ISI = this.getValidOutputFormatsForInputhNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(null, null, null, null, this);
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyCreateUseCase$createPasskeyCredential$1(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$createPasskeyCredential$1> continuation) {
        super(continuation);
        this.getValidOutputFormatsForInputhNQ4ISI = passkeyCreateUseCase;
    }
}
