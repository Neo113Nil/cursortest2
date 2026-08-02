package com.microblink.blinkid.entities.ocrengine.legacy;

/* loaded from: classes9.dex */
public final class BlinkOCREngineOptions extends com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions<com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions>() { // from class: com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions[] newArray(int i) {
            return new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions[i];
        }
    };

    public BlinkOCREngineOptions() {
        super(nativeConstruct(), (java.lang.Object) null);
    }

    private static native void nativeAddCharIntervalToWhitelist(long j, int i, int i2, int i3);

    private static native void nativeAddCharToWhitelist(long j, int i, int i2);

    private static native void nativeClearWhitelist(long j);

    private static native long nativeConstruct();

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native int nativeGetDocumentType(long j);

    private static native int nativeGetMaximalLineHeight(long j);

    private static native int nativeGetMinimalCharHeight(long j);

    private static native int nativeGetMinimalLineHeight(long j);

    private static native boolean nativeIsAdvancedImageProcessingEnabled(long j);

    private static native boolean nativeIsCasePostprocessorEnabled(long j);

    private static native boolean nativeIsCutoffCharFilterEnabled(long j);

    private static native boolean nativeIsDetectFlippedTextEnabled(long j);

    private static native boolean nativeIsNoisePostprocessingEnabled(long j);

    private static native boolean nativeIsRatioPostprocessorEnabled(long j);

    private static native boolean nativeIsWordProcessingEnabled(long j);

    private static native byte[] nativeSerialize(long j);

    private static native void nativeSetAdvancedImageProcessingEnabled(long j, boolean z);

    private static native boolean nativeSetCasePostprocessorEnabled(long j, boolean z);

    private static native void nativeSetCutoffCharFilterEnabled(long j, boolean z);

    private static native void nativeSetDetectFlippedTextEnabled(long j, boolean z);

    private static native void nativeSetDocumentType(long j, int i);

    private static native void nativeSetMaximalLineHeight(long j, int i);

    private static native void nativeSetMinimalCharHeight(long j, int i);

    private static native void nativeSetMinimalLineHeight(long j, int i);

    private static native void nativeSetNoisePostprocessingEnabled(long j, boolean z);

    private static native void nativeSetRatioPostprocessorEnabled(long j, boolean z);

    private static native void nativeSetWordProcessingEnabled(long j, boolean z);

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addAllDigitsToWhitelist(com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        return addCharIntervalToWhitelist(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9', ocrFont);
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addCharIntervalToWhitelist(char c, char c2, com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        char min = (char) java.lang.Math.min((int) c, (int) c2);
        char max = (char) java.lang.Math.max((int) c, (int) c2);
        int ordinal = ocrFont.ordinal();
        if (ocrFont == com.microblink.blinkid.results.ocr.OcrFont.OCR_FONT_ANY) {
            ordinal = -1;
        }
        nativeAddCharIntervalToWhitelist(this.llIIlIlIIl, min, max, ordinal);
        while (min <= max) {
            addCharToWhitelist(min, ocrFont);
            min = (char) (min + 1);
        }
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addCharToWhitelist(com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCRCharKey blinkOCRCharKey) {
        int ordinal = blinkOCRCharKey.getFont().ordinal();
        if (blinkOCRCharKey.getFont() == com.microblink.blinkid.results.ocr.OcrFont.OCR_FONT_ANY) {
            ordinal = -1;
        }
        nativeAddCharToWhitelist(this.llIIlIlIIl, blinkOCRCharKey.getKey(), ordinal);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addLowercaseCharsToWhitelist(com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        return addCharIntervalToWhitelist('a', io.ktor.util.date.GMTDateParser.ZONE, ocrFont);
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addUppercaseCharsToWhitelist(com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        return addCharIntervalToWhitelist('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO, ocrFont);
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions allowAllCharsAndAllFonts() {
        nativeClearWhitelist(this.llIIlIlIIl);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.OcrDocumentType getDocumentType() {
        int nativeGetDocumentType = nativeGetDocumentType(this.llIIlIlIIl);
        if (nativeGetDocumentType < 0 || nativeGetDocumentType >= com.microblink.blinkid.entities.ocrengine.legacy.OcrDocumentType.values().length) {
            throw new java.lang.IllegalStateException("Unknown OCR document type!");
        }
        return com.microblink.blinkid.entities.ocrengine.legacy.OcrDocumentType.values()[nativeGetDocumentType];
    }

    public final int getMaximumLineHeight() {
        return nativeGetMaximalLineHeight(this.llIIlIlIIl);
    }

    public final int getMinimumCharHeight() {
        return nativeGetMinimalCharHeight(this.llIIlIlIIl);
    }

    public final int getMinimumLineHeight() {
        return nativeGetMinimalLineHeight(this.llIIlIlIIl);
    }

    public final boolean isCasePostprocessorEnabled() {
        return nativeIsCasePostprocessorEnabled(this.llIIlIlIIl);
    }

    public final boolean isCutoffCharFilterEnabled() {
        return nativeIsCutoffCharFilterEnabled(this.llIIlIlIIl);
    }

    public final boolean isDetectFlippedTextEnabled() {
        return nativeIsDetectFlippedTextEnabled(this.llIIlIlIIl);
    }

    public final boolean isImageProcessingEnabled() {
        return nativeIsAdvancedImageProcessingEnabled(this.llIIlIlIIl);
    }

    public final boolean isNoisePostprocessingEnabled() {
        return nativeIsNoisePostprocessingEnabled(this.llIIlIlIIl);
    }

    public final boolean isRatioPostprocessorEnabled() {
        return nativeIsRatioPostprocessorEnabled(this.llIIlIlIIl);
    }

    public final boolean isWordProcessingEnabled() {
        return nativeIsWordProcessingEnabled(this.llIIlIlIIl);
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setCasePostprocessorEnabled(boolean z) {
        nativeSetCasePostprocessorEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setCutoffCharFilterEnabled(boolean z) {
        nativeSetCutoffCharFilterEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setDetectFlippedTextEnabled(boolean z) {
        nativeSetDetectFlippedTextEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setDocumentType(com.microblink.blinkid.entities.ocrengine.legacy.OcrDocumentType ocrDocumentType) {
        nativeSetDocumentType(this.llIIlIlIIl, ocrDocumentType.ordinal());
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setImageProcessingEnabled(boolean z) {
        nativeSetAdvancedImageProcessingEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setMaximumLineHeight(int i) {
        nativeSetMaximalLineHeight(this.llIIlIlIIl, i);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setMinimumCharHeight(int i) {
        nativeSetMinimalCharHeight(this.llIIlIlIIl, i);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setMinimumLineHeight(int i) {
        nativeSetMinimalLineHeight(this.llIIlIlIIl, i);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setNoisePostprocessingEnabled(boolean z) {
        nativeSetNoisePostprocessingEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setRatioPostprocessorEnabled(boolean z) {
        nativeSetRatioPostprocessorEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions setWordProcessingEnabled(boolean z) {
        nativeSetWordProcessingEnabled(this.llIIlIlIIl, z);
        return this;
    }

    public BlinkOCREngineOptions(long j, java.lang.Object obj) {
        super(j, obj);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions m10872clone() {
        return new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions(nativeCopy(this.llIIlIlIIl), null);
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(this.llIIlIlIIl);
    }

    BlinkOCREngineOptions(android.os.Parcel parcel) {
        super(nativeConstruct(), parcel);
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(this.llIIlIlIIl, bArr);
    }

    public final com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions addCharToWhitelist(char c, com.microblink.blinkid.results.ocr.OcrFont ocrFont) {
        addCharToWhitelist(new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCRCharKey(c, ocrFont));
        return this;
    }
}
