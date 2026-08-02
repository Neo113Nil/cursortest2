package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllIIlIlII implements android.hardware.Camera.AutoFocusMoveCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lllllIIIlI llIIlIlIIl;

    public lllIIlIlII(com.microblink.blinkid.secured.lllllIIIlI llllliiili) {
        this.llIIlIlIIl = llllliiili;
    }

    @Override // android.hardware.Camera.AutoFocusMoveCallback
    public final void onAutoFocusMoving(boolean z, android.hardware.Camera camera) {
        com.microblink.blinkid.util.Log.d(this.llIIlIlIIl, "Autofocus move callback start: {}", java.lang.Boolean.valueOf(z));
        com.microblink.blinkid.secured.lllllIIIlI llllliiili = this.llIIlIlIIl;
        llllliiili.IllIIIllII = z;
        com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener = llllliiili.IlIllIlIIl;
        if (autofocusListener != null) {
            if (z) {
                autofocusListener.onAutofocusStarted(llllliiili.llIIIlllll);
                this.llIIlIlIIl.lIlIIIIlIl = false;
            } else {
                autofocusListener.onAutofocusStopped(llllliiili.llIIIlllll);
                this.llIIlIlIIl.lIlIIIIlIl = true;
            }
        }
    }
}
