package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class lllIlIIlIl extends java.util.TimerTask {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper llIIlIlIIl;

    public lllIlIIlIl(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.llIIlIlIIl = nativeRecognizerWrapper;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.llIIlIlIIl.IlIllIlIIl = true;
        this.llIIlIlIIl.IllIIIllII = null;
    }
}
