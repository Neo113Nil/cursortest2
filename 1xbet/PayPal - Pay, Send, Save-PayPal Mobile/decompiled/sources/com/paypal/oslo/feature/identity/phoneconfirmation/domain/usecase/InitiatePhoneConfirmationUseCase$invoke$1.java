package com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase", f = "InitiatePhoneConfirmationUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {59}, m = "invoke", n = {"input", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-InitiatePhoneConfirmationUseCase$invoke$2"}, nl = {67}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes13.dex */
final class InitiatePhoneConfirmationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitiatePhoneConfirmationUseCase$invoke$1(com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase initiatePhoneConfirmationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.phoneconfirmation.domain.usecase.InitiatePhoneConfirmationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = initiatePhoneConfirmationUseCase;
    }
}
