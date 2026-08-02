package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIllllllI implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.recognition.callback.RecognitionProcessCallback IllIIIIllI;
    public final /* synthetic */ com.microblink.blinkid.secured.llIllIlIII IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.secured.lIIllllIII lIlIIIIlIl;
    public final /* synthetic */ com.microblink.blinkid.secured.lIllIlIlII llIIIlllll;
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper llIIlIIlll;
    public final /* synthetic */ boolean llIIlIlIIl;

    public IIIllllllI(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, boolean z, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle, com.microblink.blinkid.secured.llIllIlIII llilliliii, com.microblink.blinkid.secured.lIllIlIlII lillililii, com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback, com.microblink.blinkid.secured.lIIllllIII liilllliii) {
        this.llIIlIIlll = nativeRecognizerWrapper;
        this.llIIlIlIIl = z;
        this.IlIllIlIIl = recognizerBundle;
        this.IllIIIllII = llilliliii;
        this.llIIIlllll = lillililii;
        this.IllIIIIllI = recognitionProcessCallback;
        this.lIlIIIIlIl = liilllliii;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.microblink.blinkid.secured.IIlIIIIllI iIlIIIIllI = (com.microblink.blinkid.secured.IIlIIIIllI) this.llIIlIIlll.llIIlIlIIl.get();
        if (iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.READY || iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.DISPATCH_READY || (this.llIIlIlIIl && iIlIIIIllI == com.microblink.blinkid.secured.IIlIIIIllI.DONE)) {
            if (!this.IlIllIlIIl.equals(this.llIIlIIlll.llIIlIIlll)) {
                com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(this.llIIlIIlll, this.IlIllIlIIl, this.IllIIIllII);
                com.microblink.blinkid.recognition.NativeRecognizerWrapper.resetRecognizers(this.llIIlIIlll.lllIlIlIIl, true);
            }
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper = this.llIIlIIlll;
            com.microblink.blinkid.secured.IIIlIIllII iIIlIIllII = nativeRecognizerWrapper.lIIIIIllll;
            iIIlIIllII.llIIlIlIIl = this.llIIIlllll;
            com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(nativeRecognizerWrapper, iIIlIIllII, this.IllIIIIllI, this.lIlIIIIlIl);
        }
    }
}
