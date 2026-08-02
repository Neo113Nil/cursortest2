package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIlIlIlIlI implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper IlIllIlIIl;
    public final /* synthetic */ java.util.concurrent.CountDownLatch llIIlIlIIl;

    public IIlIlIlIlI(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, java.util.concurrent.CountDownLatch countDownLatch) {
        this.IlIllIlIIl = nativeRecognizerWrapper;
        this.llIIlIlIIl = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.IlIllIlIIl;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2 = com.microblink.blinkid.recognition.NativeRecognizerWrapper.IllIIlIIII;
        nativeRecognizerWrapper.IlIllIlIIl();
        this.llIIlIlIIl.countDown();
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
