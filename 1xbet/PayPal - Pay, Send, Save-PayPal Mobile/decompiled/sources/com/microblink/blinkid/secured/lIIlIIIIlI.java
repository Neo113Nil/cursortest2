package com.microblink.blinkid.secured;

/* loaded from: classes.dex */
public final class lIIlIIIIlI implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.secured.llIllIlIII IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle llIIlIlIIl;

    public lIIlIIIIlI(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.secured.llIllIlIII llilliliii) {
        this.IllIIIllII = nativeRecognizerWrapper;
        this.llIIlIlIIl = recognizerBundle;
        this.IlIllIlIIl = llilliliii;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(this.IllIIIllII, this.llIIlIlIIl, this.IlIllIlIIl);
    }
}
