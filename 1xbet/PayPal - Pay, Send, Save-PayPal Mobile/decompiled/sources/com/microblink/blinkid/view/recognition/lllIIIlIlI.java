package com.microblink.blinkid.view.recognition;

/* loaded from: classes.dex */
public final class lllIIIlIlI implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.view.recognition.IlIllIlllI IlIllIlIIl;
    public final /* synthetic */ java.lang.String llIIlIlIIl;

    public lllIIIlIlI(com.microblink.blinkid.view.recognition.IlIllIlllI ilIllIlllI, java.lang.String str) {
        this.IlIllIlIIl = ilIllIlllI;
        this.llIIlIlIIl = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView.getHighSpeedVideoFpsRangesFor(this.IlIllIlIIl.llIIlIlIIl, this.llIIlIlIIl);
    }
}
