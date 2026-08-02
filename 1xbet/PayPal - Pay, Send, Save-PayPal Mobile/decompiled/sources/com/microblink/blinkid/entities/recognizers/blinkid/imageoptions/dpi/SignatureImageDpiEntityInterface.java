package com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi;

/* loaded from: classes10.dex */
public class SignatureImageDpiEntityInterface implements com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiEntityInterface";

    private static native int signatureImageDpiNativeGet(long j);

    private static native void signatureImageDpiNativeSet(long j, int i);

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public int getSignatureImageDpi() {
        return signatureImageDpiNativeGet(0L);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public void setSignatureImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        signatureImageDpiNativeSet(0L, i);
    }
}
