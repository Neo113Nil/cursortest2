package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class llIlllIIll implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.secured.llIllIlIII IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.secured.lIIllllIII IllIIIIllI;
    public final /* synthetic */ java.lang.String IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper lIlIIIIlIl;
    public final /* synthetic */ com.microblink.blinkid.recognition.callback.RecognitionProcessCallback llIIIlllll;
    public final /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle llIIlIlIIl;

    public llIlllIIll(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.secured.llIllIlIII llilliliii, java.lang.String str, com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback, com.microblink.blinkid.secured.lIIllllIII liilllliii) {
        this.lIlIIIIlIl = nativeRecognizerWrapper;
        this.llIIlIlIIl = recognizerBundle;
        this.IlIllIlIIl = llilliliii;
        this.IllIIIllII = str;
        this.llIIIlllll = recognitionProcessCallback;
        this.IllIIIIllI = liilllliii;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.secured.IIlIIIIllI iIlIIIIllI = (com.microblink.blinkid.secured.IIlIIIIllI) this.lIlIIIIlIl.llIIlIlIIl.get();
        if (iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.READY || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.DISPATCH_READY || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.DONE) {
            if (!this.llIIlIlIIl.equals(this.lIlIIIIlIl.llIIlIIlll)) {
                com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(this.lIlIIIIlIl, this.llIIlIlIIl, this.IlIllIlIIl);
                com.microblink.blinkid.recognition.NativeRecognizerWrapper.resetRecognizers(this.lIlIIIIlIl.lllIlIlIIl, true);
            }
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.lIlIIIIlIl;
            com.microblink.blinkid.secured.lIIlIIIlII liiliiilii = nativeRecognizerWrapper.lllIIIlIlI;
            liiliiilii.llIIlIlIIl = this.IllIIIllII;
            com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(nativeRecognizerWrapper, liiliiilii, this.llIIIlllll, this.IllIIIIllI);
        }
    }
}
