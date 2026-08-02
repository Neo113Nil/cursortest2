package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider", f = "CameraProvider.kt", i = {0, 0, 0, 0}, l = {81}, m = "initialize", n = {"context", "lifecycleOwner", "onSurfaceRequest", "onBarcodeAnalyzed"}, nl = {83}, s = {"L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes14.dex */
final class CameraXProvider$initialize$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getHighSpeedVideoSizesFor = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getOutputMinFrameDuration.initialize(null, null, null, null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraXProvider$initialize$1(com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider cameraXProvider, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.scanner.CameraXProvider$initialize$1> continuation) {
        super(continuation);
        this.getOutputMinFrameDuration = cameraXProvider;
    }
}
