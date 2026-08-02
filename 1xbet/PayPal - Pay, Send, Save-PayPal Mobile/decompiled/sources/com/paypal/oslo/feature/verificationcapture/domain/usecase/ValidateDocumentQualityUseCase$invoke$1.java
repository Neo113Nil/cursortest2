package com.paypal.oslo.feature.verificationcapture.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase", f = "ValidateDocumentQualityUseCase.kt", i = {0, 0}, l = {54}, m = "invoke-gIAlu-s", n = {"file", "formatIssue"}, nl = {-1}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes15.dex */
final class ValidateDocumentQualityUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRanges = obj;
        this.getHighSpeedVideoFpsRangesFor |= Integer.MIN_VALUE;
        java.lang.Object m20621invokegIAlus = this.Camera2StreamConfigurationMap.m20621invokegIAlus(null, this);
        return m20621invokegIAlus == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? m20621invokegIAlus : kotlin.Result.m23435boximpl(m20621invokegIAlus);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidateDocumentQualityUseCase$invoke$1(com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase validateDocumentQualityUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.verificationcapture.domain.usecase.ValidateDocumentQualityUseCase$invoke$1> continuation) {
        super(continuation);
        this.Camera2StreamConfigurationMap = validateDocumentQualityUseCase;
    }
}
