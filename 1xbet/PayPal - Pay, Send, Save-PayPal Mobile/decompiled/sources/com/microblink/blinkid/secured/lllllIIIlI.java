package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lllllIIIlI implements com.microblink.blinkid.secured.IlIllIIlIl {
    public final boolean IIlIIIllIl;
    public com.microblink.blinkid.hardware.camera.AutofocusListener IlIllIlIIl;
    public com.microblink.blinkid.secured.IlIlIlllIl llIIlIIlll;
    public android.hardware.Camera llIIlIlIIl;
    public boolean IllIIIllII = false;
    public android.graphics.Rect[] llIIIlllll = null;
    public boolean IllIIIIllI = false;
    public boolean lIlIIIIlIl = false;

    public lllllIIIlI(com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener, com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl, boolean z) {
        this.IlIllIlIIl = autofocusListener;
        this.llIIlIIlll = ilIlIlllIl;
        if (ilIlIlllIl.llIIlIlIIl == null) {
            throw new java.lang.IllegalArgumentException("Device manager needs to have device lists loaded");
        }
        this.IIlIIIllIl = z;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IIlIIIllIl() {
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean IlIllIlIIl() {
        return this.lIlIIIIlIl;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IllIIIIllI() {
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IllIIIllII() {
        android.hardware.Camera camera = this.llIIlIlIIl;
        if (camera == null || !this.IllIIIIllI) {
            return;
        }
        try {
            camera.cancelAutoFocus();
            android.hardware.Camera.Parameters parameters = this.llIIlIlIIl.getParameters();
            parameters.setFocusMode("continuous-picture");
            this.llIIlIlIIl.setParameters(parameters);
        } catch (java.lang.RuntimeException e) {
            com.microblink.blinkid.util.Log.w(this, e, "Failed to resume continuous autofocus because attempt to modify camera parameters failed or because autofocus cancelling has failed.", new java.lang.Object[0]);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void dispose() {
        this.llIIlIlIIl = null;
        this.IlIllIlIIl = null;
        this.llIIIlllll = null;
        this.llIIlIIlll = null;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void lIIIIIllll() {
        this.lIlIIIIlIl = false;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean lIlIIIIlIl() {
        return true;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIIlllll() {
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean llIIlIIlll() {
        com.microblink.blinkid.util.Log.v(this, "Focus in progress: {}, full autofocus in progress: {}", java.lang.Boolean.valueOf(this.IllIIIllII), java.lang.Boolean.valueOf(this.IllIIIIllI));
        return this.IllIIIllII || this.IllIIIIllI;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean llIIlIlIIl() {
        return true;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIlIlIIl(boolean z) {
        if ((!z && this.lIlIIIIlIl) || this.IllIIIIllI || this.llIIlIlIIl == null) {
            return;
        }
        com.microblink.blinkid.util.Log.v(this, "Performing full autofocus cycle", new java.lang.Object[0]);
        try {
            com.microblink.blinkid.secured.IlllIlllll illlIlllll = new com.microblink.blinkid.secured.IlllIlllll(this.llIIlIlIIl);
            if (this.IIlIIIllIl) {
                illlIlllll.llIIlIlIIl(com.microblink.blinkid.secured.IlllIlllll.llIIIlllll);
            } else {
                illlIlllll.llIIlIlIIl(com.microblink.blinkid.secured.IlllIlllll.IllIIIIllI);
            }
            try {
                this.llIIlIlIIl.setParameters(illlIlllll.llIIlIlIIl);
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Failed to transfer camera into autofocus mode from continuous autofocus. Focus may fail! This is a device issue!", new java.lang.Object[0]);
            }
            com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener = this.IlIllIlIIl;
            if (autofocusListener != null) {
                autofocusListener.onAutofocusStarted(this.llIIIlllll);
            }
            this.IllIIIIllI = true;
            this.IllIIIllII = true;
            try {
                this.llIIlIlIIl.autoFocus(new com.microblink.blinkid.secured.IIllIlIlII(this));
            } catch (java.lang.RuntimeException e2) {
                com.microblink.blinkid.util.Log.w(this, e2, "A runtime exception occurred while attempting to perform autofocus", new java.lang.Object[0]);
                this.IllIIIIllI = false;
                this.IllIIIllII = false;
                this.lIlIIIIlIl = false;
                com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener2 = this.IlIllIlIIl;
                if (autofocusListener2 != null) {
                    autofocusListener2.onAutofocusStopped(this.llIIIlllll);
                }
                android.hardware.Camera camera = this.llIIlIlIIl;
                if (camera != null) {
                    try {
                        android.hardware.Camera.Parameters parameters = camera.getParameters();
                        parameters.setFocusMode("continuous-picture");
                        this.llIIlIlIIl.setParameters(parameters);
                    } catch (java.lang.RuntimeException e3) {
                        com.microblink.blinkid.util.Log.w(this, e3, "Failed to transfer camera back into continuous autofocus mode! This is a device issue!", new java.lang.Object[0]);
                    }
                }
            }
        } catch (java.lang.RuntimeException e4) {
            com.microblink.blinkid.util.Log.w(this, e4, "Failed to obtain parameters from camera! Cannot perform autofocus cycle.", new java.lang.Object[0]);
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIlIlIIl(android.hardware.Camera camera) {
        if (camera == null) {
            return;
        }
        this.llIIlIlIIl = camera;
        camera.setAutoFocusMoveCallback(new com.microblink.blinkid.secured.lllIIlIlII(this));
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIlIlIIl(android.graphics.Rect[] rectArr) {
        android.hardware.Camera camera = this.llIIlIlIIl;
        if (camera != null) {
            try {
                android.hardware.Camera.Parameters parameters = camera.getParameters();
                if (rectArr == null) {
                    parameters.setMeteringAreas(null);
                    parameters.setFocusAreas(null);
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (int i = 0; i < parameters.getMaxNumFocusAreas() && i < rectArr.length; i++) {
                        com.microblink.blinkid.util.Log.d(this, "Adding focus area {}", rectArr[i]);
                        arrayList.add(new android.hardware.Camera.Area(rectArr[i], 1000));
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    for (int i2 = 0; i2 < parameters.getMaxNumMeteringAreas() && i2 < rectArr.length; i2++) {
                        com.microblink.blinkid.util.Log.d(this, "Adding metering area {}", rectArr[i2]);
                        arrayList2.add(new android.hardware.Camera.Area(rectArr[i2], 1000));
                    }
                    parameters.setMeteringAreas(arrayList2);
                    parameters.setFocusAreas(arrayList);
                }
                try {
                    this.llIIlIlIIl.setParameters(parameters);
                    this.llIIIlllll = rectArr;
                    return;
                } catch (java.lang.RuntimeException unused) {
                    com.microblink.blinkid.util.Log.e(this, "Failed to apply new camera parameters!", new java.lang.Object[0]);
                    return;
                }
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Failed to obtain camera paremeters. Cannot set metering areas!", new java.lang.Object[0]);
                return;
            }
        }
        com.microblink.blinkid.util.Log.w(this, "Cannot set focus area, camera is null", new java.lang.Object[0]);
    }
}
