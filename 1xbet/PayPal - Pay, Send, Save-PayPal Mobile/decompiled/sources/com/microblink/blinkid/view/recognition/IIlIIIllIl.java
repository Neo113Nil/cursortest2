package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class IIlIIIllIl extends com.microblink.blinkid.view.CameraViewGroup.CameraViewGroupOrientationChangeListener {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView IllIIIllII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IIlIIIllIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        super(recognizerRunnerView);
        this.IllIIIllII = recognizerRunnerView;
    }

    @Override // com.microblink.blinkid.view.CameraViewGroup.CameraViewGroupOrientationChangeListener, com.microblink.blinkid.view.BaseCameraView.BaseOrientationChangeListener, com.microblink.blinkid.hardware.orientation.OrientationChangeListener
    public final void onOrientationChange(com.microblink.blinkid.hardware.orientation.Orientation orientation) {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper;
        boolean llIIlIlIIl;
        boolean z;
        com.microblink.blinkid.geometry.Rectangle rectangle;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback;
        com.microblink.blinkid.geometry.Rectangle rectangle2;
        super.onOrientationChange(orientation);
        nativeRecognizerWrapper = this.IllIIIllII.coroutineCreation;
        if (nativeRecognizerWrapper == null || orientation == com.microblink.blinkid.hardware.orientation.Orientation.ORIENTATION_UNKNOWN) {
            return;
        }
        llIIlIlIIl = this.IllIIIllII.llIIlIlIIl(orientation);
        if (llIIlIlIIl) {
            z = this.IllIIIllII.getHighSpeedVideoFpsRangesFor;
            if (z) {
                rectangle = this.IllIIIllII.getInputSizeshNQ4ISI;
                if (rectangle != null) {
                    this.IllIIIllII.getHighSpeedVideoSizes(orientation);
                    recognitionProcessCallback = this.IllIIIllII.getOutputMinFrameDuration;
                    rectangle2 = this.IllIIIllII.toString;
                    recognitionProcessCallback.setScanningRegion(rectangle2);
                }
            }
        }
    }
}
