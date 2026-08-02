package com.microblink.blinkid.entities.recognizers.blinkid.morocco;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class MoroccoIdBackRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String addressNativeGet(long j);

        private static native java.lang.String civilStatusNumberNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

        private static native java.lang.String documentNumberNativeGet(long j);

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native java.lang.String fathersNameNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native java.lang.String mothersNameNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String sexNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAddress() {
            return addressNativeGet(getNativeContext());
        }

        public final java.lang.String getCivilStatusNumber() {
            return civilStatusNumberNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfExpiry() {
            return dateOfExpiryNativeGet(getNativeContext());
        }

        public final java.lang.String getDocumentNumber() {
            return documentNumberNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult
        public final byte[] getEncodedFullDocumentImage() {
            return encodedFullDocumentImageNativeGet(getNativeContext());
        }

        @java.lang.Deprecated
        public final java.lang.String getFathersName() {
            return fathersNameNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentImage() {
            long fullDocumentImageNativeGet = fullDocumentImageNativeGet(getNativeContext());
            if (fullDocumentImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentImageNativeGet, true, this);
            }
            return null;
        }

        @java.lang.Deprecated
        public final java.lang.String getMothersName() {
            return mothersNameNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Morocco Id Back Recognizer";
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }

        @Override // com.microblink.blinkid.entities.recognizers.Recognizer.Result, com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer[i];
            }
        };
    }

    /* synthetic */ MoroccoIdBackRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractAddressNativeGet(long j);

    private static native void extractAddressNativeSet(long j, boolean z);

    private static native boolean extractCivilStatusNumberNativeGet(long j);

    private static native void extractCivilStatusNumberNativeSet(long j, boolean z);

    private static native boolean extractDateOfExpiryNativeGet(long j);

    private static native void extractDateOfExpiryNativeSet(long j, boolean z);

    private static native boolean extractFathersNameNativeGet(long j);

    private static native void extractFathersNameNativeSet(long j, boolean z);

    private static native boolean extractMothersNameNativeGet(long j);

    private static native void extractMothersNameNativeSet(long j, boolean z);

    private static native boolean extractSexNativeGet(long j);

    private static native void extractSexNativeSet(long j, boolean z);

    private static native int fullDocumentImageDpiNativeGet(long j);

    private static native void fullDocumentImageDpiNativeSet(long j, int i);

    private static native float[] fullDocumentImageExtensionFactorsNativeGet(long j);

    private static native void fullDocumentImageExtensionFactorsNativeSet(long j, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be MoroccoIdBackRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions
    public final int getFullDocumentImageDpi() {
        return fullDocumentImageDpiNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public final com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors getFullDocumentImageExtensionFactors() {
        return com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors.createFromArray(fullDocumentImageExtensionFactorsNativeGet(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final void setDetectGlare(boolean z) {
        detectGlareNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setExtractAddress(boolean z) {
        extractAddressNativeSet(getNativeContext(), z);
    }

    public final void setExtractCivilStatusNumber(boolean z) {
        extractCivilStatusNumberNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfExpiry(boolean z) {
        extractDateOfExpiryNativeSet(getNativeContext(), z);
    }

    public final void setExtractFathersName(boolean z) {
        extractFathersNameNativeSet(getNativeContext(), z);
    }

    public final void setExtractMothersName(boolean z) {
        extractMothersNameNativeSet(getNativeContext(), z);
    }

    public final void setExtractSex(boolean z) {
        extractSexNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions
    public final void setFullDocumentImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        fullDocumentImageDpiNativeSet(getNativeContext(), i);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public final void setFullDocumentImageExtensionFactors(com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors imageExtensionFactors) {
        fullDocumentImageExtensionFactorsNativeSet(getNativeContext(), imageExtensionFactors.serializeToArray());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final void setReturnFullDocumentImage(boolean z) {
        returnFullDocumentImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final boolean shouldDetectGlare() {
        return detectGlareNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final boolean shouldEncodeFullDocumentImage() {
        return encodeFullDocumentImageNativeGet(getNativeContext());
    }

    public final boolean shouldExtractAddress() {
        return extractAddressNativeGet(getNativeContext());
    }

    public final boolean shouldExtractCivilStatusNumber() {
        return extractCivilStatusNumberNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfExpiry() {
        return extractDateOfExpiryNativeGet(getNativeContext());
    }

    public final boolean shouldExtractFathersName() {
        return extractFathersNameNativeGet(getNativeContext());
    }

    public final boolean shouldExtractMothersName() {
        return extractMothersNameNativeGet(getNativeContext());
    }

    public final boolean shouldExtractSex() {
        return extractSexNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public MoroccoIdBackRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private MoroccoIdBackRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private MoroccoIdBackRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.morocco.MoroccoIdBackRecognizer(nativeCopy(getNativeContext()));
    }
}
