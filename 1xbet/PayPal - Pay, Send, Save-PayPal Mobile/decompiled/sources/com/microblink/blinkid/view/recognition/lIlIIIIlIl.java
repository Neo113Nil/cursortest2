package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class lIlIIIIlIl {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIlIlIIl;

    public lIlIIIIlIl(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.llIIlIlIIl = recognizerRunnerView;
    }

    public final com.microblink.blinkid.view.recognition.IlIllIlllI IlIllIlIIl() {
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI;
        ilIllIlllI = this.llIIlIlIIl.getHighSpeedVideoSizesFor;
        return ilIllIlllI;
    }

    public final com.microblink.blinkid.secured.lIllIlIlII IllIIIIllI() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        java.util.concurrent.atomic.AtomicReference atomicReference;
        atomicBoolean = this.llIIlIlIIl.getOutputMinFrameDurationlomOqCM;
        if (atomicBoolean.get()) {
            return null;
        }
        atomicReference = this.llIIlIlIIl.getValidOutputFormatsForInputhNQ4ISI;
        return (com.microblink.blinkid.secured.lIllIlIlII) atomicReference.getAndSet(null);
    }

    public final com.microblink.blinkid.recognition.callback.RecognitionProcessCallback IllIIIllII() {
        com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback;
        recognitionProcessCallback = this.llIIlIlIIl.getOutputMinFrameDuration;
        return recognitionProcessCallback;
    }

    public final com.microblink.blinkid.entities.recognizers.RecognizerBundle llIIIlllll() {
        com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle;
        recognizerBundle = this.llIIlIlIIl.getOutputStallDuration;
        return recognizerBundle;
    }

    public final com.microblink.blinkid.view.recognition.IlIllIlllI llIIlIlIIl() {
        com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI;
        ilIllIlllI = this.llIIlIlIIl.getHighSpeedVideoSizesFor;
        return ilIllIlllI;
    }
}
