package com.microblink.blinkid.entities.recognizers.blinkid.eudl;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class EudlRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String addressNativeGet(long j);

        private static native java.lang.String birthDataNativeGet(long j);

        private static native int countryNativeGet(long j);

        private static native java.lang.String driverNumberNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date expiryDateNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native java.lang.String firstNameNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date issueDateNativeGet(long j);

        private static native java.lang.String issuingAuthorityNativeGet(long j);

        private static native java.lang.String lastNameNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String personalNumberNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAddress() {
            return addressNativeGet(getNativeContext());
        }

        public final java.lang.String getBirthData() {
            return birthDataNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry getCountry() {
            int countryNativeGet = countryNativeGet(getNativeContext());
            if (countryNativeGet == -1) {
                return null;
            }
            return com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry.values()[countryNativeGet];
        }

        public final java.lang.String getDriverNumber() {
            return driverNumberNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult
        public final byte[] getEncodedFaceImage() {
            return encodedFaceImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult
        public final byte[] getEncodedFullDocumentImage() {
            return encodedFullDocumentImageNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getExpiryDate() {
            return expiryDateNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult
        public final com.microblink.blinkid.image.Image getFaceImage() {
            long faceImageNativeGet = faceImageNativeGet(getNativeContext());
            if (faceImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(faceImageNativeGet, true, this);
            }
            return null;
        }

        public final java.lang.String getFirstName() {
            return firstNameNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentImage() {
            long fullDocumentImageNativeGet = fullDocumentImageNativeGet(getNativeContext());
            if (fullDocumentImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentImageNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.results.date.Date getIssueDate() {
            return issueDateNativeGet(getNativeContext());
        }

        public final java.lang.String getIssuingAuthority() {
            return issuingAuthorityNativeGet(getNativeContext());
        }

        public final java.lang.String getLastName() {
            return lastNameNativeGet(getNativeContext());
        }

        public final java.lang.String getPersonalNumber() {
            return personalNumberNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "EUDL";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer[i];
            }
        };
    }

    /* synthetic */ EudlRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native int countryNativeGet(long j);

    private static native void countryNativeSet(long j, int i);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractAddressNativeGet(long j);

    private static native void extractAddressNativeSet(long j, boolean z);

    private static native boolean extractDateOfExpiryNativeGet(long j);

    private static native void extractDateOfExpiryNativeSet(long j, boolean z);

    private static native boolean extractDateOfIssueNativeGet(long j);

    private static native void extractDateOfIssueNativeSet(long j, boolean z);

    private static native boolean extractIssuingAuthorityNativeGet(long j);

    private static native void extractIssuingAuthorityNativeSet(long j, boolean z);

    private static native boolean extractPersonalNumberNativeGet(long j);

    private static native void extractPersonalNumberNativeSet(long j, boolean z);

    private static native int faceImageDpiNativeGet(long j);

    private static native void faceImageDpiNativeSet(long j, int i);

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

    private static native boolean returnFaceImageNativeGet(long j);

    private static native void returnFaceImageNativeSet(long j, boolean z);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be EudlRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry getCountry() {
        return com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry.values()[countryNativeGet(getNativeContext())];
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions
    public final int getFaceImageDpi() {
        return faceImageDpiNativeGet(getNativeContext());
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

    public final void setCountry(com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry eudlCountry) {
        countryNativeSet(getNativeContext(), eudlCountry.ordinal());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions
    public final void setEncodeFaceImage(boolean z) {
        encodeFaceImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setExtractAddress(boolean z) {
        extractAddressNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfExpiry(boolean z) {
        extractDateOfExpiryNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfIssue(boolean z) {
        extractDateOfIssueNativeSet(getNativeContext(), z);
    }

    public final void setExtractIssuingAuthority(boolean z) {
        extractIssuingAuthorityNativeSet(getNativeContext(), z);
    }

    public final void setExtractPersonalNumber(boolean z) {
        extractPersonalNumberNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions
    public final void setFaceImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        faceImageDpiNativeSet(getNativeContext(), i);
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final void setReturnFaceImage(boolean z) {
        returnFaceImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final void setReturnFullDocumentImage(boolean z) {
        returnFullDocumentImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions
    public final boolean shouldEncodeFaceImage() {
        return encodeFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final boolean shouldEncodeFullDocumentImage() {
        return encodeFullDocumentImageNativeGet(getNativeContext());
    }

    public final boolean shouldExtractAddress() {
        return extractAddressNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfExpiry() {
        return extractDateOfExpiryNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfIssue() {
        return extractDateOfIssueNativeGet(getNativeContext());
    }

    public final boolean shouldExtractIssuingAuthority() {
        return extractIssuingAuthorityNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPersonalNumber() {
        return extractPersonalNumberNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final boolean shouldReturnFaceImage() {
        return returnFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public EudlRecognizer(com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlCountry eudlCountry) {
        this(nativeConstruct());
        setCountry(eudlCountry);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    public EudlRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer(nativeCopy(getNativeContext()));
    }

    private EudlRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private EudlRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.eudl.EudlRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
