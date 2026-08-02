package com.microblink.blinkid.entities.recognizers.blinkid.germany;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class GermanyIdBackRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String addressCityNativeGet(long j);

        private static native java.lang.String addressHouseNumberNativeGet(long j);

        private static native java.lang.String addressStreetNativeGet(long j);

        private static native java.lang.String addressZipCodeNativeGet(long j);

        private static native java.lang.String authorityNativeGet(long j);

        private static native java.lang.String colourOfEyesNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfIssueNativeGet(long j);

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native java.lang.String fullAddressNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native java.lang.String heightNativeGet(long j);

        private static native long mrzResultNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAddressCity() {
            return addressCityNativeGet(getNativeContext());
        }

        public final java.lang.String getAddressHouseNumber() {
            return addressHouseNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getAddressStreet() {
            return addressStreetNativeGet(getNativeContext());
        }

        public final java.lang.String getAddressZipCode() {
            return addressZipCodeNativeGet(getNativeContext());
        }

        public final java.lang.String getAuthority() {
            return authorityNativeGet(getNativeContext());
        }

        @java.lang.Deprecated
        public final java.lang.String getColourOfEyes() {
            return colourOfEyesNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfIssue() {
            return dateOfIssueNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult
        public final byte[] getEncodedFullDocumentImage() {
            return encodedFullDocumentImageNativeGet(getNativeContext());
        }

        public final java.lang.String getFullAddress() {
            return fullAddressNativeGet(getNativeContext());
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
        public final java.lang.String getHeight() {
            return heightNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult getMrzResult() {
            long mrzResultNativeGet = mrzResultNativeGet(getNativeContext());
            if (mrzResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult(mrzResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for mrzResult");
        }

        public final java.lang.String toString() {
            return "Germany Id Back Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer[i];
            }
        };
    }

    /* synthetic */ GermanyIdBackRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractAddressNativeGet(long j);

    private static native void extractAddressNativeSet(long j, boolean z);

    private static native boolean extractAuthorityNativeGet(long j);

    private static native void extractAuthorityNativeSet(long j, boolean z);

    private static native boolean extractColourOfEyesNativeGet(long j);

    private static native void extractColourOfEyesNativeSet(long j, boolean z);

    private static native boolean extractDateOfIssueNativeGet(long j);

    private static native void extractDateOfIssueNativeSet(long j, boolean z);

    private static native boolean extractHeightNativeGet(long j);

    private static native void extractHeightNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be GermanyIdBackRecognizer");
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

    public final void setExtractAuthority(boolean z) {
        extractAuthorityNativeSet(getNativeContext(), z);
    }

    public final void setExtractColourOfEyes(boolean z) {
        extractColourOfEyesNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfIssue(boolean z) {
        extractDateOfIssueNativeSet(getNativeContext(), z);
    }

    public final void setExtractHeight(boolean z) {
        extractHeightNativeSet(getNativeContext(), z);
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

    public final boolean shouldExtractAuthority() {
        return extractAuthorityNativeGet(getNativeContext());
    }

    public final boolean shouldExtractColourOfEyes() {
        return extractColourOfEyesNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfIssue() {
        return extractDateOfIssueNativeGet(getNativeContext());
    }

    public final boolean shouldExtractHeight() {
        return extractHeightNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public GermanyIdBackRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private GermanyIdBackRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private GermanyIdBackRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.germany.GermanyIdBackRecognizer(nativeCopy(getNativeContext()));
    }
}
