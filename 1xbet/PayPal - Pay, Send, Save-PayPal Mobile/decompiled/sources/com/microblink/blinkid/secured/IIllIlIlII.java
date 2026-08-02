package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIllIlIlII implements android.hardware.Camera.AutoFocusCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lllllIIIlI llIIlIlIIl;

    public IIllIlIlII(com.microblink.blinkid.secured.lllllIIIlI llllliiili) {
        this.llIIlIlIIl = llllliiili;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, android.hardware.Camera camera) {
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl;
        com.microblink.blinkid.util.Log.v(this.llIIlIlIIl, "Full autofocus cycle completed with success: {}", java.lang.Boolean.valueOf(z));
        com.microblink.blinkid.secured.lllllIIIlI llllliiili = this.llIIlIlIIl;
        llllliiili.IllIIIIllI = false;
        llllliiili.IllIIIllII = false;
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = llllliiili.llIIlIIlll;
        if (ilIlIlllIl != null && (IlIllIlIIl = ilIlIlllIl.IlIllIlIIl()) != null && ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.lllIIIlIlI)) {
            com.microblink.blinkid.util.Log.i(this.llIIlIlIIl, "This is a device with untrusty focus. We will assume that focus has succeeded!", new java.lang.Object[0]);
            z = true;
        }
        com.microblink.blinkid.secured.lllllIIIlI llllliiili2 = this.llIIlIlIIl;
        com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener = llllliiili2.IlIllIlIIl;
        if (autofocusListener != null) {
            autofocusListener.onAutofocusStopped(llllliiili2.llIIIlllll);
            com.microblink.blinkid.secured.lllllIIIlI llllliiili3 = this.llIIlIlIIl;
            llllliiili3.lIlIIIIlIl = z;
            if (!z) {
                llllliiili3.IlIllIlIIl.onAutofocusFailed();
            }
        }
        if (this.llIIlIlIIl.llIIlIlIIl != null) {
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                parameters.setFocusMode("continuous-picture");
                camera.setParameters(parameters);
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this.llIIlIlIIl, e, "Failed to transfer camera back into continuous autofocus mode! This is a device issue!", new java.lang.Object[0]);
            }
        }
    }
}
