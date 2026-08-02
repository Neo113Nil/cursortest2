package com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension;

/* loaded from: classes10.dex */
public class FullDocumentImageExtensionEntityInterface implements com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionEntityInterface";

    private static native float[] fullDocumentImageExtensionFactorsNativeGet(long j);

    private static native void fullDocumentImageExtensionFactorsNativeSet(long j, float[] fArr);

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors getFullDocumentImageExtensionFactors() {
        return com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors.createFromArray(fullDocumentImageExtensionFactorsNativeGet(0L));
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public void setFullDocumentImageExtensionFactors(com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors imageExtensionFactors) {
        fullDocumentImageExtensionFactorsNativeSet(0L, imageExtensionFactors.serializeToArray());
    }
}
