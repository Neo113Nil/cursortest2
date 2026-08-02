package com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase", f = "PasskeyDeleteUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {73}, m = "invoke", n = {"passkeyCredentialId", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "passkeyDeleteRequest", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-PasskeyDeleteUseCase$invoke$2"}, nl = {81}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class PasskeyDeleteUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    int getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase getOutputSizes;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputFormats |= Integer.MIN_VALUE;
        return this.getOutputSizes.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PasskeyDeleteUseCase$invoke$1(com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase passkeyDeleteUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.passkey.management.deletion.domain.usecase.PasskeyDeleteUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = passkeyDeleteUseCase;
    }
}
