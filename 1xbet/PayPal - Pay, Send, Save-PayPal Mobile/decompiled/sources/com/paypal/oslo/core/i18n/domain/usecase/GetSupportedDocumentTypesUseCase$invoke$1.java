package com.paypal.oslo.core.i18n.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase", f = "GetSupportedDocumentTypesUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {50}, m = "invoke-n_l99Nk", n = {"countryCode", "raise$iv$iv$iv", "$this$invoke_n_l99Nk_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-GetSupportedDocumentTypesUseCase$invoke$2"}, nl = {52}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes10.dex */
final class GetSupportedDocumentTypesUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    java.lang.Object getHighSpeedVideoSizesFor;
    /* synthetic */ java.lang.Object getInputFormats;
    int getInputSizeshNQ4ISI;
    java.lang.Object getOutputFormats;
    java.lang.Object getOutputMinFrameDuration;
    final /* synthetic */ com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase getOutputSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputSizes.m11564invoken_l99Nk(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetSupportedDocumentTypesUseCase$invoke$1(com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase getSupportedDocumentTypesUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.core.i18n.domain.usecase.GetSupportedDocumentTypesUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputSizes = getSupportedDocumentTypesUseCase;
    }
}
