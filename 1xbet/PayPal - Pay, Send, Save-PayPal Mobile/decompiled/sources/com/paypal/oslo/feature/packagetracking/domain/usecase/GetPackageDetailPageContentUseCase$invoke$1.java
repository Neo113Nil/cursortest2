package com.paypal.oslo.feature.packagetracking.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase", f = "GetPackageDetailPageContentUseCase.kt", i = {0, 0, 0}, l = {50}, m = "invoke", n = {"carrierId", "trackingNumber", "transactionNumber"}, nl = {54}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes13.dex */
final class GetPackageDetailPageContentUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoFpsRangesFor = obj;
        this.Camera2StreamConfigurationMap |= Integer.MIN_VALUE;
        return this.getOutputFormats.invoke(null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GetPackageDetailPageContentUseCase$invoke$1(com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase getPackageDetailPageContentUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.packagetracking.domain.usecase.GetPackageDetailPageContentUseCase$invoke$1> continuation) {
        super(continuation);
        this.getOutputFormats = getPackageDetailPageContentUseCase;
    }
}
