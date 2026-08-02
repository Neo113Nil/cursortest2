package com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase", f = "DownloadDocumentUseCase.kt", i = {0, 0, 0}, l = {72}, m = "invoke", n = {"url", "absoluteUrl", "request"}, nl = {-1}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes15.dex */
final class DownloadDocumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getInputFormats;
    final /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getInputFormats = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadDocumentUseCase$invoke$1(com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase downloadDocumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taxanddocumentcenter.domain.usecase.DownloadDocumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = downloadDocumentUseCase;
    }
}
