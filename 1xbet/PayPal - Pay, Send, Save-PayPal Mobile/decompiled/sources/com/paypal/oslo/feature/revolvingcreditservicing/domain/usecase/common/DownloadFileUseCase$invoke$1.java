package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase", f = "DownloadFileUseCase.kt", i = {0, 0, 0, 0, 0, 0}, l = {54}, m = "invoke", n = {"url", "source", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "headers", "request", "isAuthRequired"}, nl = {55}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0"}, v = 2)
/* loaded from: classes14.dex */
final class DownloadFileUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase getHighSpeedVideoSizesFor;
    int getInputFormats;
    /* synthetic */ java.lang.Object getOutputFormats;
    boolean getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputFormats |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, false, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DownloadFileUseCase$invoke$1(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase downloadFileUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.common.DownloadFileUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = downloadFileUseCase;
    }
}
