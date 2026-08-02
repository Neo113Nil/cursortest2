package com.microblink.blinkid.entities.recognizers.blinkid.singapore;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class SingaporeCombinedRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult, com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.results.date.Date addressChangeDateNativeGet(long j);

        private static native java.lang.String addressNativeGet(long j);

        private static native java.lang.String bloodGroupNativeGet(long j);

        private static native java.lang.String countryOfBirthNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfIssueNativeGet(long j);

        private static native int documentDataMatchNativeGet(long j);

        private static native byte[] encodedBackFullDocumentImageNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFrontFullDocumentImageNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native long fullDocumentBackImageNativeGet(long j);

        private static native long fullDocumentFrontImageNativeGet(long j);

        private static native java.lang.String identityCardNumberNativeGet(long j);

        private static native java.lang.String nameNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String raceNativeGet(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAddress() {
            return addressNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getAddressChangeDate() {
            return addressChangeDateNativeGet(getNativeContext());
        }

        public final java.lang.String getBloodGroup() {
            return bloodGroupNativeGet(getNativeContext());
        }

        public final java.lang.String getCountryOfBirth() {
            return countryOfBirthNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfBirth() {
            return dateOfBirthNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfIssue() {
            return dateOfIssueNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult
        public final com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getDocumentDataMatch() {
            return com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[documentDataMatchNativeGet(getNativeContext())];
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult
        public final byte[] getEncodedBackFullDocumentImage() {
            return encodedBackFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult
        public final byte[] getEncodedFaceImage() {
            return encodedFaceImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult
        public final byte[] getEncodedFrontFullDocumentImage() {
            return encodedFrontFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult
        public final com.microblink.blinkid.image.Image getFaceImage() {
            long faceImageNativeGet = faceImageNativeGet(getNativeContext());
            if (faceImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(faceImageNativeGet, true, this);
            }
            return null;
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentBackImage() {
            long fullDocumentBackImageNativeGet = fullDocumentBackImageNativeGet(getNativeContext());
            if (fullDocumentBackImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentBackImageNativeGet, true, this);
            }
            return null;
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentFrontImage() {
            long fullDocumentFrontImageNativeGet = fullDocumentFrontImageNativeGet(getNativeContext());
            if (fullDocumentFrontImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentFrontImageNativeGet, true, this);
            }
            return null;
        }

        public final java.lang.String getIdentityCardNumber() {
            return identityCardNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getName() {
            return nameNativeGet(getNativeContext());
        }

        public final java.lang.String getRace() {
            return raceNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Singapore Id Combined Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String Address = "address";
        public static final java.lang.String AddressChangeDate = "addressChangeDate";
        public static final java.lang.String BloodGroup = "bloodGroup";
        public static final java.lang.String CountryOfBirth = "countryOfBirth";
        public static final java.lang.String DateOfBirth = "dateOfBirth";
        public static final java.lang.String DateOfIssue = "dateOfIssue";
        public static final java.lang.String DocumentDataMatch = "documentDataMatch";
        public static final java.lang.String EncodedBackFullDocumentImage = "encodedBackFullDocumentImage";
        public static final java.lang.String EncodedFaceImage = "encodedFaceImage";
        public static final java.lang.String EncodedFrontFullDocumentImage = "encodedFrontFullDocumentImage";
        public static final java.lang.String FaceImage = "faceImage";
        public static final java.lang.String FullDocumentBackImage = "fullDocumentBackImage";
        public static final java.lang.String FullDocumentFrontImage = "fullDocumentFrontImage";
        public static final java.lang.String IdentityCardNumber = "identityCardNumber";
        public static final java.lang.String Name = "name";
        public static final java.lang.String Race = "race";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
        public static final java.lang.String Sex = "sex";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer[i];
            }
        };
    }

    /* synthetic */ SingaporeCombinedRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractAddressChangeDateNativeGet(long j);

    private static native void extractAddressChangeDateNativeSet(long j, boolean z);

    private static native boolean extractAddressNativeGet(long j);

    private static native void extractAddressNativeSet(long j, boolean z);

    private static native boolean extractBloodGroupNativeGet(long j);

    private static native void extractBloodGroupNativeSet(long j, boolean z);

    private static native boolean extractCountryOfBirthNativeGet(long j);

    private static native void extractCountryOfBirthNativeSet(long j, boolean z);

    private static native boolean extractDateOfBirthNativeGet(long j);

    private static native void extractDateOfBirthNativeSet(long j, boolean z);

    private static native boolean extractDateOfIssueNativeGet(long j);

    private static native void extractDateOfIssueNativeSet(long j, boolean z);

    private static native boolean extractNameNativeGet(long j);

    private static native void extractNameNativeSet(long j, boolean z);

    private static native boolean extractRaceNativeGet(long j);

    private static native void extractRaceNativeSet(long j, boolean z);

    private static native boolean extractSexNativeGet(long j);

    private static native void extractSexNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be SingaporeCombinedRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer
    public final com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult getCombinedResult() {
        return (com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult) getResult();
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

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final void setDetectGlare(boolean z) {
        detectGlareNativeSet(getNativeContext(), z);
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

    public final void setExtractAddressChangeDate(boolean z) {
        extractAddressChangeDateNativeSet(getNativeContext(), z);
    }

    public final void setExtractBloodGroup(boolean z) {
        extractBloodGroupNativeSet(getNativeContext(), z);
    }

    public final void setExtractCountryOfBirth(boolean z) {
        extractCountryOfBirthNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfBirth(boolean z) {
        extractDateOfBirthNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfIssue(boolean z) {
        extractDateOfIssueNativeSet(getNativeContext(), z);
    }

    public final void setExtractName(boolean z) {
        extractNameNativeSet(getNativeContext(), z);
    }

    public final void setExtractRace(boolean z) {
        extractRaceNativeSet(getNativeContext(), z);
    }

    public final void setExtractSex(boolean z) {
        extractSexNativeSet(getNativeContext(), z);
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

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final boolean shouldDetectGlare() {
        return detectGlareNativeGet(getNativeContext());
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

    public final boolean shouldExtractAddressChangeDate() {
        return extractAddressChangeDateNativeGet(getNativeContext());
    }

    public final boolean shouldExtractBloodGroup() {
        return extractBloodGroupNativeGet(getNativeContext());
    }

    public final boolean shouldExtractCountryOfBirth() {
        return extractCountryOfBirthNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfBirth() {
        return extractDateOfBirthNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfIssue() {
        return extractDateOfIssueNativeGet(getNativeContext());
    }

    public final boolean shouldExtractName() {
        return extractNameNativeGet(getNativeContext());
    }

    public final boolean shouldExtractRace() {
        return extractRaceNativeGet(getNativeContext());
    }

    public final boolean shouldExtractSex() {
        return extractSexNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final boolean shouldReturnFaceImage() {
        return returnFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public SingaporeCombinedRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private SingaporeCombinedRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private SingaporeCombinedRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.singapore.SingaporeCombinedRecognizer(nativeCopy(getNativeContext()));
    }
}
