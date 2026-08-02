package com.microblink.blinkid.entities.ocrengine.deep;

/* loaded from: classes9.dex */
public final class DeepOCREngineOptions extends com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions<com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions> {
    public static android.os.Parcelable.Creator<com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions>() { // from class: com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions[] newArray(int i) {
            return new com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions[i];
        }
    };

    public DeepOCREngineOptions() {
        super(nativeConstruct(), (java.lang.Object) null);
    }

    private static native long nativeConstruct();

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native float nativeGetMaximalLineHeight(long j);

    private static native float nativeGetMinimalCharHeight(long j);

    private static native float nativeGetMinimalLineHeight(long j);

    private static native int nativeGetOCRModel(long j);

    private static native byte[] nativeSerialize(long j);

    private static native void nativeSetMaximalLineHeight(long j, float f);

    private static native void nativeSetMinimalCharHeight(long j, float f);

    private static native void nativeSetMinimalLineHeight(long j, float f);

    private static native void nativeSetOCRModel(long j, int i);

    public final float getMaximumLineHeight() {
        return nativeGetMaximalLineHeight(this.llIIlIlIIl);
    }

    public final float getMinimumCharHeight() {
        return nativeGetMinimalCharHeight(this.llIIlIlIIl);
    }

    public final float getMinimumLineHeight() {
        return nativeGetMinimalLineHeight(this.llIIlIlIIl);
    }

    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel getOCRModel() {
        int nativeGetOCRModel = nativeGetOCRModel(this.llIIlIlIIl);
        if (nativeGetOCRModel < 0 || nativeGetOCRModel >= com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel.values().length) {
            throw new java.lang.IllegalStateException("Unknown Deep OCR model!");
        }
        return com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel.values()[nativeGetOCRModel];
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions setMaximumLineHeight(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument %s must be in range <0, 1>, given value is: %f", "maximumLineHeight", java.lang.Float.valueOf(f)));
        }
        nativeSetMaximalLineHeight(this.llIIlIlIIl, f);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions setMinimumCharHeight(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument %s must be in range <0, 1>, given value is: %f", "minimumCharHeight", java.lang.Float.valueOf(f)));
        }
        nativeSetMinimalCharHeight(this.llIIlIlIIl, f);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions setMinimumLineHeight(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument %s must be in range <0, 1>, given value is: %f", "minimumLineHeight", java.lang.Float.valueOf(f)));
        }
        nativeSetMinimalLineHeight(this.llIIlIlIIl, f);
        return this;
    }

    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions setOCRModel(com.microblink.blinkid.entities.ocrengine.deep.DeepOCRModel deepOCRModel) {
        nativeSetOCRModel(this.llIIlIlIIl, deepOCRModel.ordinal());
        return this;
    }

    public DeepOCREngineOptions(long j, java.lang.Object obj) {
        super(j, obj);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions m10871clone() {
        return new com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions(nativeCopy(this.llIIlIlIIl), null);
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(this.llIIlIlIIl);
    }

    DeepOCREngineOptions(android.os.Parcel parcel) {
        super(nativeConstruct(), parcel);
    }

    @Override // com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(this.llIIlIlIIl, bArr);
    }
}
