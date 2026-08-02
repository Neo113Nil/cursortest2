package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class IlIlIIlllI implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper IlIllIlIIl;
    public final /* synthetic */ boolean llIIlIlIIl;

    public IlIlIIlllI(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, boolean z) {
        this.IlIllIlIIl = nativeRecognizerWrapper;
        this.llIIlIlIIl = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.IlIllIlIIl.IIlIIIllIl.get()) {
            return;
        }
        com.microblink.blinkid.util.Log.d(com.microblink.blinkid.recognition.NativeRecognizerWrapper.class, "RESETTING RECOGNIZERS", new java.lang.Object[0]);
        com.microblink.blinkid.recognition.NativeRecognizerWrapper.resetRecognizers(this.IlIllIlIIl.lllIlIlIIl, this.llIIlIlIIl);
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.IlIllIlIIl;
        java.util.Timer timer = nativeRecognizerWrapper.IllIIIllII;
        if (timer != null) {
            timer.cancel();
        }
        nativeRecognizerWrapper.IlIllIlIIl = false;
        nativeRecognizerWrapper.IllIIIllII = null;
        if (this.llIIlIlIIl) {
            com.microblink.blinkid.secured.llIIIllIlI llIIlIlIIl = com.microblink.blinkid.secured.llIIIllIlI.llIIlIlIIl();
            com.microblink.blinkid.secured.IIlIIlIIIl iIlIIlIIIl = llIIlIlIIl.IlIllIlIIl;
            if (iIlIIlIIIl == null) {
                throw new java.lang.IllegalStateException("PingManager.setup wasn't called and pingExtras instance is null.");
            }
            llIIlIlIIl.IllIIIllII = true;
            iIlIIlIIIl.llIIlIlIIl.clear();
            iIlIIlIIIl.IlIllIlIIl.clear();
        }
    }
}
