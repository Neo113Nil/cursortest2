package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlIIIIlIl implements com.microblink.blinkid.secured.IlIllIIlIl {
    public volatile boolean IllIIIllII;
    public com.microblink.blinkid.secured.IlIlIlllIl lIIIIIllll;
    public com.microblink.blinkid.hardware.camera.AutofocusListener llIIlIIlll;
    public android.hardware.Camera llIIlIlIIl;
    public volatile boolean IlIllIlIIl = false;
    public java.util.Timer llIIIlllll = null;
    public volatile boolean IllIIIIllI = false;
    public int lIlIIIIlIl = 0;
    public android.graphics.Rect[] IIlIIIllIl = null;
    public volatile int lllIIIlIlI = 0;
    public final com.microblink.blinkid.secured.llIIIlllll IlIllIlllI = new com.microblink.blinkid.secured.llIIIlllll(this);

    public lIlIIIIlIl(com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener, com.microblink.blinkid.secured.IlIlIlllIl ilIlIlllIl) {
        this.llIIlIIlll = autofocusListener;
        this.lIIIIIllll = ilIlIlllIl;
        if (ilIlIlllIl.llIIlIlIIl == null) {
            throw new java.lang.IllegalArgumentException("Device manager needs to have device lists loaded");
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IIlIIIllIl() {
        this.IllIIIIllI = false;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean IlIllIlIIl() {
        return this.IlIllIlIIl;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IllIIIIllI() {
        llIIlIlIIl(false);
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void IllIIIllII() {
        if (this.llIIlIlIIl == null || !this.IllIIIllII) {
            return;
        }
        try {
            this.llIIlIlIIl.cancelAutoFocus();
        } catch (java.lang.RuntimeException e) {
            com.microblink.blinkid.util.Log.w(this, e, "There has been error in cancelling autofocus cycle. This probably a bug in device", new java.lang.Object[0]);
        }
        this.IllIIIllII = false;
        this.lllIIIlIlI--;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void dispose() {
        this.llIIlIlIIl = null;
        java.util.Timer timer = this.llIIIlllll;
        if (timer != null) {
            timer.cancel();
        }
        this.llIIIlllll = null;
        this.llIIlIIlll = null;
        this.IIlIIIllIl = null;
        this.lIIIIIllll = null;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void lIIIIIllll() {
        com.microblink.blinkid.util.Log.v(this, "invalidating focus", new java.lang.Object[0]);
        this.IlIllIlIIl = false;
        java.util.Timer timer = this.llIIIlllll;
        if (timer != null) {
            timer.cancel();
        }
        this.llIIIlllll = null;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean lIlIIIIlIl() {
        return false;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIIlllll() {
        this.IllIIIIllI = true;
        this.IlIllIlIIl = false;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean llIIlIIlll() {
        return this.IllIIIllII;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final boolean llIIlIlIIl() {
        return true;
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIlIlIIl(android.hardware.Camera camera) {
        this.llIIlIlIIl = camera;
        this.IllIIIllII = false;
        java.util.Timer timer = this.llIIIlllll;
        if (timer != null) {
            timer.cancel();
            this.llIIIlllll = null;
        }
    }

    @Override // com.microblink.blinkid.secured.IlIllIIlIl
    public final void llIIlIlIIl(boolean z) {
        if (this.llIIlIlIIl == null || this.IllIIIIllI) {
            return;
        }
        if (!this.IlIllIlIIl || z) {
            if (this.IllIIIllII) {
                com.microblink.blinkid.util.Log.v(this, "Autofocus is in progress...", new java.lang.Object[0]);
                return;
            }
            try {
                this.IllIIIllII = true;
                java.util.Timer timer = this.llIIIlllll;
                if (timer != null) {
                    timer.cancel();
                    this.llIIIlllll = null;
                }
                com.microblink.blinkid.util.Log.d(this, "requesting autofocus...", new java.lang.Object[0]);
                this.lllIIIlIlI++;
                com.microblink.blinkid.util.Log.i(this, "Requests count: {}", java.lang.Integer.valueOf(this.lllIIIlIlI));
                com.microblink.blinkid.hardware.camera.AutofocusListener autofocusListener = this.llIIlIIlll;
                if (autofocusListener != null) {
                    autofocusListener.onAutofocusStarted(this.IIlIIIllIl);
                }
                this.llIIlIlIIl.autoFocus(this.IlIllIlllI);
                com.microblink.blinkid.util.Log.d(this, "request issued", new java.lang.Object[0]);
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Autofocus call failed!", new java.lang.Object[0]);
                this.IlIllIlllI.onAutoFocus(false, this.llIIlIlIIl);
            }
        }
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
                    this.IIlIIIllIl = rectArr;
                    lIIIIIllll();
                    llIIlIlIIl(false);
                    return;
                } catch (java.lang.RuntimeException unused) {
                    com.microblink.blinkid.util.Log.e(this, "Failed to apply new camera parameters!", new java.lang.Object[0]);
                    return;
                }
            } catch (java.lang.RuntimeException e) {
                com.microblink.blinkid.util.Log.w(this, e, "Failed to get camera parameters. Cannot set metering areas!", new java.lang.Object[0]);
                return;
            }
        }
        com.microblink.blinkid.util.Log.w(this, "Cannot set focus area, camera is null", new java.lang.Object[0]);
    }
}
