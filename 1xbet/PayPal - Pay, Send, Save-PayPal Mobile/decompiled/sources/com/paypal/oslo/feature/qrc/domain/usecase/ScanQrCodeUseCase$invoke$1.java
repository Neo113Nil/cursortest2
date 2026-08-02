package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase", f = "ScanQrCodeUseCase.kt", i = {0, 1, 1, 1, 1, 1}, l = {41, 48}, m = "invoke", n = {"scannedData", "scannedData", "this_$iv", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, "$i$f$fold", "$i$a$-fold-ScanQrCodeUseCase$invoke$3"}, nl = {42, 75}, s = {"L$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes14.dex */
final class ScanQrCodeUseCase$invoke$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;
    final /* synthetic */ com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    /* synthetic */ java.lang.Object getOutputFormats;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.getOutputFormats = obj;
        this.getInputSizeshNQ4ISI |= Integer.MIN_VALUE;
        return this.getHighSpeedVideoSizesFor.invoke(null, this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScanQrCodeUseCase$invoke$1(com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase scanQrCodeUseCase, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.qrc.domain.usecase.ScanQrCodeUseCase$invoke$1> continuation) {
        super(continuation);
        this.getHighSpeedVideoSizesFor = scanQrCodeUseCase;
    }
}
