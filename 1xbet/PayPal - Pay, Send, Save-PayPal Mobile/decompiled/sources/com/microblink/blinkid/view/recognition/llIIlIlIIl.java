package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class llIIlIlIIl implements com.microblink.blinkid.view.BaseCameraView.VisiblePartUpdateListener {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIlIlIIl;

    public llIIlIlIIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.llIIlIlIIl = recognizerRunnerView;
    }

    @Override // com.microblink.blinkid.view.BaseCameraView.VisiblePartUpdateListener
    public final void onVisiblePartUpdated(android.graphics.RectF rectF) {
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback;
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback2;
        ilIllIlllI = this.llIIlIlIIl.getHighSpeedVideoSizesFor;
        if (ilIllIlllI != null) {
            if (com.microblink.blinkid.view.recognition.RecognizerRunnerView.getInputFormats(this.llIIlIlIIl)) {
                recognitionProcessCallback2 = this.llIIlIlIIl.getOutputMinFrameDuration;
                recognitionProcessCallback2.setVisiblePartRelativeDestination(com.microblink.blinkid.geometry.Rectangle.fromRectF(rectF));
            } else {
                recognitionProcessCallback = this.llIIlIlIIl.getOutputMinFrameDuration;
                recognitionProcessCallback.setVisiblePartRelativeDestination(null);
            }
        }
    }
}
