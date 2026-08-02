package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase", f = "NameValidationUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {94}, m = "invoke", n = {"nameInput", "nameConfiguration", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "locale", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-NameValidationUseCase$invoke$2"}, nl = {95}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class NameValidationUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    java.lang.Object getInputFormats;
    java.lang.Object getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    /* synthetic */ java.lang.Object getOutputSizes;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputSizes = obj;
        this.getHighSpeedVideoSizesFor |= Integer.MIN_VALUE;
        return this.getOutputStallDurationlomOqCM.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NameValidationUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase nameValidationUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.NameValidationUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputStallDurationlomOqCM = nameValidationUseCase;
    }
}
