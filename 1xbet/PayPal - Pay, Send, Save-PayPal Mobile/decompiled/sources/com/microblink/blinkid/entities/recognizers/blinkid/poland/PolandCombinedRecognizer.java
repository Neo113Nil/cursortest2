package com.microblink.blinkid.entities.recognizers.blinkid.poland;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class PolandCombinedRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult, com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

        private static native int documentDataMatchNativeGet(long j);

        private static native java.lang.String documentNumberNativeGet(long j);

        private static native byte[] encodedBackFullDocumentImageNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFrontFullDocumentImageNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native java.lang.String familyNameNativeGet(long j);

        private static native long fullDocumentBackImageNativeGet(long j);

        private static native long fullDocumentFrontImageNativeGet(long j);

        private static native java.lang.String givenNamesNativeGet(long j);

        private static native java.lang.String issuedByNativeGet(long j);

        private static native boolean mrzVerifiedNativeGet(long j);

        private static native java.lang.String nationalityNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String parentsGivenNamesNativeGet(long j);

        private static native java.lang.String personalNumberNativeGet(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        private static native java.lang.String surnameNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfBirth() {
            return dateOfBirthNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getDateOfExpiry() {
            return dateOfExpiryNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult
        public final com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState getDocumentDataMatch() {
            return com.microblink.blinkid.entities.recognizers.blinkid.DataMatchState.values()[documentDataMatchNativeGet(getNativeContext())];
        }

        public final java.lang.String getDocumentNumber() {
            return documentNumberNativeGet(getNativeContext());
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

        public final java.lang.String getFamilyName() {
            return familyNameNativeGet(getNativeContext());
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

        public final java.lang.String getGivenNames() {
            return givenNamesNativeGet(getNativeContext());
        }

        public final java.lang.String getIssuedBy() {
            return issuedByNativeGet(getNativeContext());
        }

        public final java.lang.String getNationality() {
            return nationalityNativeGet(getNativeContext());
        }

        public final java.lang.String getParentsGivenNames() {
            return parentsGivenNamesNativeGet(getNativeContext());
        }

        public final java.lang.String getPersonalNumber() {
            return personalNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        public final java.lang.String getSurname() {
            return surnameNativeGet(getNativeContext());
        }

        public final boolean isMrzVerified() {
            return mrzVerifiedNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Poland Combined Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String DateOfBirth = "dateOfBirth";
        public static final java.lang.String DateOfExpiry = "dateOfExpiry";
        public static final java.lang.String DocumentDataMatch = "documentDataMatch";
        public static final java.lang.String DocumentNumber = "documentNumber";
        public static final java.lang.String EncodedBackFullDocumentImage = "encodedBackFullDocumentImage";
        public static final java.lang.String EncodedFaceImage = "encodedFaceImage";
        public static final java.lang.String EncodedFrontFullDocumentImage = "encodedFrontFullDocumentImage";
        public static final java.lang.String FaceImage = "faceImage";
        public static final java.lang.String FamilyName = "familyName";
        public static final java.lang.String FullDocumentBackImage = "fullDocumentBackImage";
        public static final java.lang.String FullDocumentFrontImage = "fullDocumentFrontImage";
        public static final java.lang.String GivenNames = "givenNames";
        public static final java.lang.String IssuedBy = "issuedBy";
        public static final java.lang.String MrzVerified = "mrzVerified";
        public static final java.lang.String Nationality = "nationality";
        public static final java.lang.String ParentsGivenNames = "parentsGivenNames";
        public static final java.lang.String PersonalNumber = "personalNumber";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
        public static final java.lang.String Sex = "sex";
        public static final java.lang.String Surname = "surname";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer[i];
            }
        };
    }

    /* synthetic */ PolandCombinedRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractDateOfBirthNativeGet(long j);

    private static native void extractDateOfBirthNativeSet(long j, boolean z);

    private static native boolean extractFamilyNameNativeGet(long j);

    private static native void extractFamilyNameNativeSet(long j, boolean z);

    private static native boolean extractGivenNamesNativeGet(long j);

    private static native void extractGivenNamesNativeSet(long j, boolean z);

    private static native boolean extractParentsGivenNamesNativeGet(long j);

    private static native void extractParentsGivenNamesNativeSet(long j, boolean z);

    private static native boolean extractSexNativeGet(long j);

    private static native void extractSexNativeSet(long j, boolean z);

    private static native boolean extractSurnameNativeGet(long j);

    private static native void extractSurnameNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be PolandCombinedRecognizer");
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

    public final void setExtractDateOfBirth(boolean z) {
        extractDateOfBirthNativeSet(getNativeContext(), z);
    }

    public final void setExtractFamilyName(boolean z) {
        extractFamilyNameNativeSet(getNativeContext(), z);
    }

    public final void setExtractGivenNames(boolean z) {
        extractGivenNamesNativeSet(getNativeContext(), z);
    }

    public final void setExtractParentsGivenNames(boolean z) {
        extractParentsGivenNamesNativeSet(getNativeContext(), z);
    }

    public final void setExtractSex(boolean z) {
        extractSexNativeSet(getNativeContext(), z);
    }

    public final void setExtractSurname(boolean z) {
        extractSurnameNativeSet(getNativeContext(), z);
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

    public final boolean shouldExtractDateOfBirth() {
        return extractDateOfBirthNativeGet(getNativeContext());
    }

    public final boolean shouldExtractFamilyName() {
        return extractFamilyNameNativeGet(getNativeContext());
    }

    public final boolean shouldExtractGivenNames() {
        return extractGivenNamesNativeGet(getNativeContext());
    }

    public final boolean shouldExtractParentsGivenNames() {
        return extractParentsGivenNamesNativeGet(getNativeContext());
    }

    public final boolean shouldExtractSex() {
        return extractSexNativeGet(getNativeContext());
    }

    public final boolean shouldExtractSurname() {
        return extractSurnameNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final boolean shouldReturnFaceImage() {
        return returnFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public PolandCombinedRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private PolandCombinedRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private PolandCombinedRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.poland.PolandCombinedRecognizer(nativeCopy(getNativeContext()));
    }
}
