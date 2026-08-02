package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class lIIlIIIlII implements com.microblink.blinkid.secured.IIIIllIlIl {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper IlIllIlIIl;
    public java.lang.String llIIlIlIIl;

    public lIIlIIIlII(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.IlIllIlIIl = nativeRecognizerWrapper;
    }

    @Override // com.microblink.blinkid.secured.IIIIllIlIl
    public final int llIIlIlIIl(com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback) {
        int recognizeString;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recognizing from string ");
        sb.append(this.llIIlIlIIl);
        com.microblink.blinkid.util.Log.v(this, sb.toString(), new java.lang.Object[0]);
        recognizeString = com.microblink.blinkid.recognition.NativeRecognizerWrapper.recognizeString(this.IlIllIlIIl.lllIlIlIIl, this.llIIlIlIIl, recognitionProcessCallback.getNativeContext());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Finished recognizing from string ");
        sb2.append(this.llIIlIlIIl);
        com.microblink.blinkid.util.Log.v(this, sb2.toString(), new java.lang.Object[0]);
        return recognizeString;
    }
}
