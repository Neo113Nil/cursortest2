package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIlllIlIlI implements com.microblink.blinkid.hardware.accelerometer.ShakeCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.lIllIIlIIl llIIlIlIIl;

    public lIlllIlIlI(com.microblink.blinkid.secured.lIllIIlIIl lilliiliil) {
        this.llIIlIlIIl = lilliiliil;
    }

    public final void IlIllIlIIl() {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.llIIlIlIIl.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            ilIllIIlIl.IIlIIIllIl();
            if (!ilIllIIlIl.lIlIIIIlIl() || this.llIIlIlIIl.IIlIIIllIl.lllIIIlIlI) {
                ilIllIIlIl.lIIIIIllll();
            }
            ilIllIIlIl.llIIlIlIIl(false);
        }
    }

    public final /* synthetic */ void llIIlIlIIl() {
        com.microblink.blinkid.secured.IlIllIIlIl ilIllIIlIl = this.llIIlIlIIl.lIIIIIlIlI;
        if (ilIllIIlIl != null) {
            ilIllIIlIl.llIIIlllll();
        }
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStarted() {
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.llIIlIlIIl;
        com.microblink.blinkid.util.Log.v(this, "shaking started, this = {}, focus manager: {}, camera queue: {}", this, lilliiliil.lIIIIIlIlI, lilliiliil.lllllIlIll);
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil2 = this.llIIlIlIIl;
        if (lilliiliil2.lIIIIIlIlI != null) {
            lilliiliil2.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIlllIlIlI$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIlllIlIlI.this.llIIlIlIIl();
                }
            });
        }
        com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback = this.llIIlIlIIl.lIIIIIllll;
        if (shakeCallback != null) {
            shakeCallback.onShakingStarted();
        }
        com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback2 = this.llIIlIlIIl.lllIIIlIlI;
        if (shakeCallback2 != null) {
            shakeCallback2.onShakingStarted();
        }
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStopped() {
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil = this.llIIlIlIIl;
        com.microblink.blinkid.util.Log.v(this, "shaking stopped, this = {}, focus manager: {}, camera queue: {}", this, lilliiliil.lIIIIIlIlI, lilliiliil.lllllIlIll);
        com.microblink.blinkid.secured.lIllIIlIIl lilliiliil2 = this.llIIlIlIIl;
        if (lilliiliil2.lIIIIIlIlI != null) {
            lilliiliil2.lllllIlIll.llIIlIlIIl(new java.lang.Runnable() { // from class: com.microblink.blinkid.secured.lIlllIlIlI$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    com.microblink.blinkid.secured.lIlllIlIlI.this.IlIllIlIIl();
                }
            });
        }
        com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback = this.llIIlIlIIl.lIIIIIllll;
        if (shakeCallback != null) {
            shakeCallback.onShakingStopped();
        }
        com.microblink.blinkid.hardware.accelerometer.ShakeCallback shakeCallback2 = this.llIIlIlIIl.lllIIIlIlI;
        if (shakeCallback2 != null) {
            shakeCallback2.onShakingStopped();
        }
    }
}
