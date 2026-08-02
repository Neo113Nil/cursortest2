package com.microblink.blinkid.view.blinkcard;

/* loaded from: classes10.dex */
public final class IllIIIIllI implements android.view.View.OnFocusChangeListener {
    public final /* synthetic */ com.microblink.blinkid.view.blinkcard.LabeledEditText llIIlIlIIl;

    public IllIIIIllI(com.microblink.blinkid.view.blinkcard.LabeledEditText labeledEditText) {
        this.llIIlIlIIl = labeledEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        if (!z) {
            com.microblink.blinkid.view.blinkcard.LabeledEditText.getHighResolutionOutputSizeshNQ4ISI(this.llIIlIlIIl);
        } else {
            if (com.microblink.blinkid.view.blinkcard.LabeledEditText.getInputSizeshNQ4ISI(this.llIIlIlIIl)) {
                return;
            }
            com.microblink.blinkid.view.blinkcard.LabeledEditText.getHighSpeedVideoSizes(this.llIIlIlIIl);
        }
    }
}
