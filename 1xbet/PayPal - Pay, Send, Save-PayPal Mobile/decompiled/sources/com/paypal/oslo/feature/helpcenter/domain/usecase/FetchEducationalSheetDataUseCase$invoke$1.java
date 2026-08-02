package com.paypal.oslo.feature.helpcenter.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase", f = "FetchEducationalSheetDataUseCase.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {32, 41}, m = "invoke", n = {"productReferenceId", "pageReferenceId", "fieldReferenceId", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FetchEducationalSheetDataUseCase$invoke$2", "productReferenceId", "pageReferenceId", "fieldReferenceId", "raise$iv$iv$iv", "$this$invoke_u24lambda_u240", "ipsArticles", "primaryIpsArticle", "$i$f$either", "$i$f$_foldOrThrow", "$i$f$_fold", "$i$a$-either-FetchEducationalSheetDataUseCase$invoke$2"}, nl = {36, 42}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "I$0", "I$1", "I$2", "I$3"}, v = 2)
/* loaded from: classes12.dex */
final class FetchEducationalSheetDataUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
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
    final /* synthetic */ com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase getOutputMinFrameDurationlomOqCM;
    java.lang.Object getOutputSizes;
    int getOutputSizeshNQ4ISI;
    java.lang.Object getOutputStallDuration;
    /* synthetic */ java.lang.Object getOutputStallDurationlomOqCM;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputStallDurationlomOqCM = obj;
        this.getOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDurationlomOqCM.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FetchEducationalSheetDataUseCase$invoke$1(com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase fetchEducationalSheetDataUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.helpcenter.domain.usecase.FetchEducationalSheetDataUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDurationlomOqCM = fetchEducationalSheetDataUseCase;
    }
}
