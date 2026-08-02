package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase", f = "ValidateDocumentIdUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {59}, m = "invoke", n = {"documentId", "docIdConfig", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "docType", "countryCode", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-ValidateDocumentIdUseCase$invoke$2"}, nl = {61}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class ValidateDocumentIdUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase getOutputMinFrameDurationlomOqCM;
    int getOutputSizes;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizes |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.invoke(null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateDocumentIdUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase validateDocumentIdUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = validateDocumentIdUseCase;
    }
}
