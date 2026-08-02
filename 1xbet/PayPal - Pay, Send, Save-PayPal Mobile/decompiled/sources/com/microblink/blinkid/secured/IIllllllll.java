package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIllllllll implements com.microblink.blinkid.hardware.accelerometer.ShakeCallback {
    public final /* synthetic */ com.microblink.blinkid.secured.IlIIIlIIIl llIIlIlIIl;

    public IIllllllll(com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl) {
        this.llIIlIlIIl = ilIIIlIIIl;
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStarted() {
        com.microblink.blinkid.util.Log.v(this, "Shaking started", new java.lang.Object[0]);
        this.llIIlIlIIl.IllIIlIIII.onShakingStarted();
        this.llIIlIlIIl.lllIlIlIIl.onShakingStarted();
    }

    @Override // com.microblink.blinkid.hardware.accelerometer.ShakeCallback
    public final void onShakingStopped() {
        com.microblink.blinkid.util.Log.v(this, "Shaking stopped", new java.lang.Object[0]);
        this.llIIlIlIIl.IllIIlIIII.onShakingStopped();
        this.llIIlIlIIl.lllIlIlIIl.onShakingStopped();
        com.microblink.blinkid.secured.IlIIIlIIIl ilIIIlIIIl = this.llIIlIlIIl;
        com.microblink.blinkid.secured.lIIlllIIlI liillliili = ilIIIlIIIl.IlIllIlIIl;
        if (liillliili == null || !liillliili.lllIIIlIlI) {
            return;
        }
        ilIIIlIIIl.lIIIIIllll();
    }
}
