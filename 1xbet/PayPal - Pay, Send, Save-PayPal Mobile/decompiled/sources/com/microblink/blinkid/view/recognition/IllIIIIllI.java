package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class IllIIIIllI implements android.content.DialogInterface.OnClickListener {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.RecognizerRunnerView llIIlIlIIl;

    public IllIIIIllI(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        this.llIIlIlIIl = recognizerRunnerView;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        atomicBoolean = this.llIIlIlIIl.getOutputStallDurationlomOqCM;
        atomicBoolean.set(false);
        com.microblink.blinkid.view.recognition.RecognizerRunnerView.getOutputSizeshNQ4ISI(this.llIIlIlIIl);
    }
}
