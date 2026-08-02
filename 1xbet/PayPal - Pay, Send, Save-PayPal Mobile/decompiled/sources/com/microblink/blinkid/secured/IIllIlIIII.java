package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class IIllIlIIII implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper llIIlIlIIl;

    public IIllIlIIII(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.llIIlIlIIl = nativeRecognizerWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.llIIlIlIIl.llIIlIlIIl.get() == com.microblink.blinkid.secured.IIlIIIIllI.DONE) {
            this.llIIlIlIIl.IllIIIllII();
        }
    }
}
