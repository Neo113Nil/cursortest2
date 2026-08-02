package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIIlIlIII implements java.lang.Runnable {
    public final /* synthetic */ com.microblink.blinkid.secured.llIllIlIII IlIllIlIIl;
    public final /* synthetic */ com.microblink.blinkid.entities.recognizers.RecognizerBundle IllIIIllII;
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper llIIIlllll;
    public final /* synthetic */ android.content.Context llIIlIlIIl;

    public IIIIlIlIII(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper, android.content.Context context, com.microblink.blinkid.secured.llIllIlIII llilliliii, com.microblink.blinkid.entities.recognizers.RecognizerBundle recognizerBundle) {
        this.llIIIlllll = nativeRecognizerWrapper;
        this.llIIlIlIIl = context;
        this.IlIllIlIIl = llilliliii;
        this.IllIIIllII = recognizerBundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long initNativeRecognizers;
        com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper;
        try {
            (com.microblink.blinkid.licence.LicenceManager.llIIlIlIIl() ? com.microblink.blinkid.secured.lllllllIll.llIIlIlIIl : com.microblink.blinkid.secured.IlIIlIIIll.llIIlIlIIl).llIIlIlIIl(this.llIIlIlIIl);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper2 = this.llIIIlllll;
            com.microblink.blinkid.util.Log.d(nativeRecognizerWrapper2, "Initializing library from state: {}", ((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper2.llIIlIlIIl.get()).name());
            if (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(this.llIIIlllll.llIIlIlIIl, com.microblink.blinkid.secured.IIlIIIIllI.PRE_INIT, com.microblink.blinkid.secured.IIlIIIIllI.INITIALIZING)) {
                com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper3 = this.llIIIlllll;
                com.microblink.blinkid.util.Log.w(nativeRecognizerWrapper3, "Library is already initialized (state: {})", ((com.microblink.blinkid.secured.IIlIIIIllI) nativeRecognizerWrapper3.llIIlIlIIl.get()).name());
                return;
            }
            com.microblink.blinkid.util.Log.v(this.llIIIlllll, "Calling native init...", new java.lang.Object[0]);
            com.microblink.blinkid.util.Log.i(this, "Native context ptr: {}", java.lang.Long.valueOf(this.llIIIlllll.lllIlIlIIl));
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper4 = this.llIIIlllll;
            initNativeRecognizers = com.microblink.blinkid.recognition.NativeRecognizerWrapper.initNativeRecognizers(nativeRecognizerWrapper4.lllIlIlIIl, com.microblink.blinkid.recognition.NativeRecognizerWrapper.llIIlIlIIl(this.IllIIIllII.getRecognizers()), this.IllIIIllII.shouldAllowMultipleScanResultsOnSingleImage(), com.microblink.blinkid.util.FileLog.getLogFolder(this.llIIlIlIIl), "microblink");
            nativeRecognizerWrapper4.llIIIlllll = new com.microblink.blinkid.settings.NativeLibraryInfo(initNativeRecognizers);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper5 = this.llIIIlllll;
            nativeRecognizerWrapper5.llIIlIIlll = this.IllIIIllII;
            if (nativeRecognizerWrapper5.llIIIlllll.IlIllIlIIl()) {
                com.microblink.blinkid.util.Log.d(this.llIIIlllll, "Native library has initialized.", new java.lang.Object[0]);
                this.llIIIlllll.IllIIIllII();
                return;
            }
            com.microblink.blinkid.util.Log.e(this.llIIIlllll, "Failed to initialize native library!", new java.lang.Object[0]);
            com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper6 = this.llIIIlllll;
            com.microblink.blinkid.util.Log.e(nativeRecognizerWrapper6, "Reason: {}", nativeRecognizerWrapper6.llIIIlllll.llIIlIlIIl());
            synchronized (this.llIIIlllll) {
                nativeRecognizerWrapper = this.llIIIlllll;
                nativeRecognizerWrapper.IlIllIlllI = 0;
            }
            nativeRecognizerWrapper.IlIllIlIIl();
            this.IlIllIlIIl.onRecognizerError(new com.microblink.blinkid.recognition.RecognizerError(this.llIIIlllll.llIIIlllll.llIIlIlIIl()));
        } catch (java.lang.Exception e) {
            this.IlIllIlIIl.onRecognizerError(e);
        }
    }
}
