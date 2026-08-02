package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public final class IIIlIIllII implements com.microblink.blinkid.secured.IIIIllIlIl {
    public final /* synthetic */ com.microblink.blinkid.recognition.NativeRecognizerWrapper IlIllIlIIl;
    public com.microblink.blinkid.secured.lIllIlIlII llIIlIlIIl;

    public IIIlIIllII(com.microblink.blinkid.recognition.NativeRecognizerWrapper nativeRecognizerWrapper) {
        this.IlIllIlIIl = nativeRecognizerWrapper;
    }

    @Override // com.microblink.blinkid.secured.IIIIllIlIl
    public final int llIIlIlIIl(com.microblink.blinkid.recognition.callback.RecognitionProcessCallback recognitionProcessCallback) {
        int recognize;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Recognizing frame ID ");
        sb.append(this.llIIlIlIIl.IllIIIIllI());
        com.microblink.blinkid.util.Log.v(this, sb.toString(), new java.lang.Object[0]);
        recognize = com.microblink.blinkid.recognition.NativeRecognizerWrapper.recognize(this.IlIllIlIIl.lllIlIlIIl, this.llIIlIlIIl.llIIlIlIIl(), recognitionProcessCallback.getNativeContext(), recognitionProcessCallback.getCancelDelegate().llIIlIlIIl);
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Finished recognizing frame ID ");
        sb2.append(this.llIIlIlIIl.IllIIIIllI());
        com.microblink.blinkid.util.Log.v(this, sb2.toString(), new java.lang.Object[0]);
        this.llIIlIlIIl.IlIllIlIIl();
        return recognize;
    }
}
