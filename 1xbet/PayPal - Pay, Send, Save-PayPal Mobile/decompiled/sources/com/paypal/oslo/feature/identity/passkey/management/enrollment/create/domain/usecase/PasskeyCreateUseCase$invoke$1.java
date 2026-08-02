package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase", f = "PasskeyCreateUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {109, 112, 115, 118, 126}, m = "invoke", n = {"activityContext", "passkeyFlowVariant", "publicCredential", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$invoke$2", "activityContext", "passkeyFlowVariant", "publicCredential", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$invoke$2", "activityContext", "passkeyFlowVariant", "publicCredential", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "userEmail", "userDisplayName", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$invoke$2", "activityContext", "passkeyFlowVariant", "publicCredential", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "userEmail", "userDisplayName", "enrollmentOption", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$invoke$2", "activityContext", "passkeyFlowVariant", "publicCredential", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "userEmail", "userDisplayName", "enrollmentOption", "attestation", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyCreateUseCase$invoke$2"}, nl = {112, 115, 118, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyCreateUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    java.lang.Object getOutputStallDuration;
    int getOutputStallDurationlomOqCM;
    /* synthetic */ java.lang.Object getValidOutputFormatsForInputhNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase toString;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getValidOutputFormatsForInputhNQ4ISI = obj;
        this.getOutputStallDurationlomOqCM |= Integer.MIN_VALUE;
        return this.toString.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyCreateUseCase$invoke$1(com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase passkeyCreateUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.enrollment.create.domain.usecase.PasskeyCreateUseCase$invoke$1> continuation) {
        super(continuation);
        this.toString = passkeyCreateUseCase;
    }
}
