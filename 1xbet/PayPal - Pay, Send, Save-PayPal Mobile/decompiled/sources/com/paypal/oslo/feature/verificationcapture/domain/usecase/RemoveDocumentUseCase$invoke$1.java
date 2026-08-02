package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase", f = "RemoveDocumentUseCase.kt", i = {0}, l = {40}, m = "invoke-gIAlu-s", n = {"documentId"}, nl = {-1}, s = {"L$0"}, v = 2)
/* loaded from: classes15.dex */
final class RemoveDocumentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = obj;
        this.getHighResolutionOutputSizeshNQ4ISI |= Integer.MIN_VALUE;
        java.lang.Object m20618invokegIAlus = this.getHighSpeedVideoSizes.m20618invokegIAlus(null, this);
        return m20618invokegIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m20618invokegIAlus : kotlin.Result.m23435boximpl(m20618invokegIAlus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoveDocumentUseCase$invoke$1(com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase removeDocumentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.usecase.RemoveDocumentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizes = removeDocumentUseCase;
    }
}
