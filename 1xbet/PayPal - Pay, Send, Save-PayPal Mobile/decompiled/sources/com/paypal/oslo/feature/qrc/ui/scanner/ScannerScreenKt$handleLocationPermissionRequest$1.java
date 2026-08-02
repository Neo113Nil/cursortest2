package com.paypal.oslo.feature.qrc.ui.scanner;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt", f = "ScannerScreen.kt", i = {0, 0, 0, 0, 0}, l = {748}, m = "handleLocationPermissionRequest", n = {"permissionController", "context", "getLocationFn", "onEvent", "onPermissionDenied"}, nl = {755}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* loaded from: classes14.dex */
final class ScannerScreenKt$handleLocationPermissionRequest$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    java.lang.Object getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    /* synthetic */ java.lang.Object getOutputFormats;
    int getOutputMinFrameDuration;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getOutputMinFrameDuration |= Integer.MIN_VALUE;
        return com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt.handleLocationPermissionRequest(null, null, null, null, null, this);
    }

    ScannerScreenKt$handleLocationPermissionRequest$1(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.ui.scanner.ScannerScreenKt$handleLocationPermissionRequest$1> continuation) {
        super(continuation);
    }
}
