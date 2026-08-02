package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIIIlllll implements android.hardware.Camera.AutoFocusCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lIlIIIIlIl llIIlIlIIl;

    public llIIIlllll(com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil) {
        this.llIIlIlIIl = liliiiilil;
    }

    public final void llIIlIlIIl(java.lang.String str) {
        android.hardware.Camera camera = this.llIIlIlIIl.llIIlIlIIl;
        if (camera != null) {
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                java.util.List<java.lang.String> supportedFocusModes = parameters.getSupportedFocusModes();
                java.lang.String focusMode = parameters.getFocusMode();
                if (supportedFocusModes == null || !supportedFocusModes.contains(str) || str.equals(focusMode)) {
                    return;
                }
                parameters.setFocusMode(str);
                com.microblink.blinkid.util.Log.d(this.llIIlIlIIl, "Setting focus mode to {}", str);
                try {
                    this.llIIlIlIIl.llIIlIlIIl.setParameters(parameters);
                } catch (java.lang.RuntimeException e) {
                    com.microblink.blinkid.util.Log.e(this.llIIlIlIIl, e, "Setting new camera parameters failed!", new java.lang.Object[0]);
                }
            } catch (java.lang.RuntimeException e2) {
                com.microblink.blinkid.util.Log.w(this, e2, "Failed to get camera parameters! Cannot set focus mode!", new java.lang.Object[0]);
            }
        }
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public final void onAutoFocus(boolean z, android.hardware.Camera camera) {
        com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener;
        android.hardware.Camera camera2;
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil = this.llIIlIlIIl;
        com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener2 = liliiiilil.llIIlIIlll;
        if (autofocusListener2 != null) {
            autofocusListener2.onAutofocusStopped(liliiiilil.IIlIIIllIl);
        }
        this.llIIlIlIIl.IllIIIllII = false;
        this.llIIlIlIIl.lllIIIlIlI--;
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil2 = this.llIIlIlIIl;
        com.microblink.blinkid.util.Log.i(liliiiilil2, "Autofocus request ended with {}. Request count: {}", java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(liliiiilil2.lllIIIlIlI));
        com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl = this.llIIlIlIIl.lIIIIIllll;
        com.microblink.blinkid.secured.IllllIIIIl IlIllIlIIl = ilIlIlllIl.IlIllIlIIl();
        if (IlIllIlIIl != null && ilIlIlllIl.llIIlIlIIl(IlIllIlIIl.lllIIIlIlI)) {
            com.microblink.blinkid.util.Log.i(this.llIIlIlIIl, "This is a device with untrusty focus. We will assume that focus has succeeded!", new java.lang.Object[0]);
            z = true;
        }
        this.llIIlIlIIl.IlIllIlIIl = z;
        boolean z2 = this.llIIlIlIIl.IlIllIlIIl;
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil3 = this.llIIlIlIIl;
        int i = liliiiilil3.lIlIIIIlIl;
        if (z) {
            java.util.Timer timer = liliiiilil3.llIIIlllll;
            if (timer != null) {
                timer.cancel();
            }
            java.util.Timer timer2 = new java.util.Timer();
            liliiiilil3.llIIIlllll = timer2;
            timer2.schedule(new com.microblink.blinkid.secured.IllIIIllII(liliiiilil3), 3000L);
            com.microblink.blinkid.util.Log.v(liliiiilil3, "focus timer set", new java.lang.Object[0]);
            this.llIIlIlIIl.lIlIIIIlIl = 0;
            return;
        }
        if (liliiiilil3.IllIIIIllI) {
            return;
        }
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil4 = this.llIIlIlIIl;
        int i2 = liliiiilil4.lIlIIIIlIl + 1;
        liliiiilil4.lIlIIIIlIl = i2;
        if (i2 % 2 == 0 && (camera2 = liliiiilil4.llIIlIlIIl) != null) {
            try {
                java.lang.String focusMode = camera2.getParameters().getFocusMode();
                if ("macro".equals(focusMode)) {
                    llIIlIlIIl(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO);
                } else if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(focusMode)) {
                    llIIlIlIIl("macro");
                }
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Failed to get camera parameters. Cannot toggle autofocus mode!", new java.lang.Object[0]);
            }
        }
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil5 = this.llIIlIlIIl;
        if (liliiiilil5.lIlIIIIlIl == 4 && (autofocusListener = liliiiilil5.llIIlIIlll) != null) {
            autofocusListener.onAutofocusFailed();
        }
        com.microblink.blinkid.secured.lIlIIIIlIl liliiiilil6 = this.llIIlIlIIl;
        java.util.Timer timer3 = liliiiilil6.llIIIlllll;
        if (timer3 != null) {
            timer3.cancel();
        }
        java.util.Timer timer4 = new java.util.Timer();
        liliiiilil6.llIIIlllll = timer4;
        timer4.schedule(new com.microblink.blinkid.secured.IllIIIllII(liliiiilil6), 3000L);
        com.microblink.blinkid.util.Log.v(liliiiilil6, "focus timer set", new java.lang.Object[0]);
    }
}
