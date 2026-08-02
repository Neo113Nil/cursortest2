package com.microblink.blinkid.entities.recognizers.blinkid.austria;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class AustriaCombinedRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult, com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedSignatureImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.results.date.Date dateOfBirthNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfExpiryNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date dateOfIssuanceNativeGet(long j);

        private static native int documentDataMatchNativeGet(long j);

        private static native java.lang.String documentNumberNativeGet(long j);

        private static native byte[] encodedBackFullDocumentImageNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFrontFullDocumentImageNativeGet(long j);

        private static native byte[] encodedSignatureImageNativeGet(long j);

        private static native java.lang.String eyeColourNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native long fullDocumentBackImageNativeGet(long j);

        private static native long fullDocumentFrontImageNativeGet(long j);

        private static native java.lang.String givenNameNativeGet(long j);

        private static native java.lang.String heightNativeGet(long j);

        private static native java.lang.String issuingAuthorityNativeGet(long j);

        private static native boolean mrtdVerifiedNativeGet(long j);

        private static native java.lang.String nationalityNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String placeOfBirthNativeGet(long j);

        private static native java.lang.String principalResidenceNativeGet(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        private static native long signatureImageNativeGet(long j);

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

        public final com.microblink.blinkid.results.date.Date getDateOfIssuance() {
            return dateOfIssuanceNativeGet(getNativeContext());
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

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedSignatureImageResult
        public final byte[] getEncodedSignatureImage() {
            return encodedSignatureImageNativeGet(getNativeContext());
        }

        public final java.lang.String getEyeColour() {
            return eyeColourNativeGet(getNativeContext());
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

        public final java.lang.String getGivenName() {
            return givenNameNativeGet(getNativeContext());
        }

        public final java.lang.String getHeight() {
            return heightNativeGet(getNativeContext());
        }

        public final java.lang.String getIssuingAuthority() {
            return issuingAuthorityNativeGet(getNativeContext());
        }

        public final java.lang.String getNationality() {
            return nationalityNativeGet(getNativeContext());
        }

        public final java.lang.String getPlaceOfBirth() {
            return placeOfBirthNativeGet(getNativeContext());
        }

        public final java.lang.String getPrincipalResidence() {
            return principalResidenceNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.SignatureImageResult
        public final com.microblink.blinkid.image.Image getSignatureImage() {
            long signatureImageNativeGet = signatureImageNativeGet(getNativeContext());
            if (signatureImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(signatureImageNativeGet, true, this);
            }
            return null;
        }

        public final java.lang.String getSurname() {
            return surnameNativeGet(getNativeContext());
        }

        public final boolean isMrtdVerified() {
            return mrtdVerifiedNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Austria Combined Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String DateOfBirth = "dateOfBirth";
        public static final java.lang.String DateOfExpiry = "dateOfExpiry";
        public static final java.lang.String DateOfIssuance = "dateOfIssuance";
        public static final java.lang.String DocumentDataMatch = "documentDataMatch";
        public static final java.lang.String DocumentNumber = "documentNumber";
        public static final java.lang.String EncodedBackFullDocumentImage = "encodedBackFullDocumentImage";
        public static final java.lang.String EncodedFaceImage = "encodedFaceImage";
        public static final java.lang.String EncodedFrontFullDocumentImage = "encodedFrontFullDocumentImage";
        public static final java.lang.String EncodedSignatureImage = "encodedSignatureImage";
        public static final java.lang.String EyeColour = "eyeColour";
        public static final java.lang.String FaceImage = "faceImage";
        public static final java.lang.String FullDocumentBackImage = "fullDocumentBackImage";
        public static final java.lang.String FullDocumentFrontImage = "fullDocumentFrontImage";
        public static final java.lang.String GivenName = "givenName";
        public static final java.lang.String Height = "height";
        public static final java.lang.String IssuingAuthority = "issuingAuthority";
        public static final java.lang.String MrtdVerified = "mrtdVerified";
        public static final java.lang.String Nationality = "nationality";
        public static final java.lang.String PlaceOfBirth = "placeOfBirth";
        public static final java.lang.String PrincipalResidence = "principalResidence";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
        public static final java.lang.String Sex = "sex";
        public static final java.lang.String SignatureImage = "signatureImage";
        public static final java.lang.String Surname = "surname";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer[i];
            }
        };
    }

    /* synthetic */ AustriaCombinedRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean encodeSignatureImageNativeGet(long j);

    private static native void encodeSignatureImageNativeSet(long j, boolean z);

    private static native boolean extractDateOfBirthNativeGet(long j);

    private static native void extractDateOfBirthNativeSet(long j, boolean z);

    private static native boolean extractDateOfExpiryNativeGet(long j);

    private static native void extractDateOfExpiryNativeSet(long j, boolean z);

    private static native boolean extractDateOfIssuanceNativeGet(long j);

    private static native void extractDateOfIssuanceNativeSet(long j, boolean z);

    private static native boolean extractDateOfIssueNativeGet(long j);

    private static native void extractDateOfIssueNativeSet(long j, boolean z);

    private static native boolean extractGivenNameNativeGet(long j);

    private static native void extractGivenNameNativeSet(long j, boolean z);

    private static native boolean extractHeightNativeGet(long j);

    private static native void extractHeightNativeSet(long j, boolean z);

    private static native boolean extractIssuingAuthorityNativeGet(long j);

    private static native void extractIssuingAuthorityNativeSet(long j, boolean z);

    private static native boolean extractNationalityNativeGet(long j);

    private static native void extractNationalityNativeSet(long j, boolean z);

    private static native boolean extractPassportNumberNativeGet(long j);

    private static native void extractPassportNumberNativeSet(long j, boolean z);

    private static native boolean extractPlaceOfBirthNativeGet(long j);

    private static native void extractPlaceOfBirthNativeSet(long j, boolean z);

    private static native boolean extractPrincipalResidenceNativeGet(long j);

    private static native void extractPrincipalResidenceNativeSet(long j, boolean z);

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

    private static native boolean returnSignatureImageNativeGet(long j);

    private static native void returnSignatureImageNativeSet(long j, boolean z);

    private static native int signatureImageDpiNativeGet(long j);

    private static native void signatureImageDpiNativeSet(long j, int i);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be AustriaCombinedRecognizer");
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public final int getSignatureImageDpi() {
        return signatureImageDpiNativeGet(getNativeContext());
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions
    public final void setEncodeSignatureImage(boolean z) {
        encodeSignatureImageNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfBirth(boolean z) {
        extractDateOfBirthNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfExpiry(boolean z) {
        extractDateOfExpiryNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfIssuance(boolean z) {
        extractDateOfIssuanceNativeSet(getNativeContext(), z);
    }

    public final void setExtractDateOfIssue(boolean z) {
        extractDateOfIssueNativeSet(getNativeContext(), z);
    }

    public final void setExtractGivenName(boolean z) {
        extractGivenNameNativeSet(getNativeContext(), z);
    }

    public final void setExtractHeight(boolean z) {
        extractHeightNativeSet(getNativeContext(), z);
    }

    public final void setExtractIssuingAuthority(boolean z) {
        extractIssuingAuthorityNativeSet(getNativeContext(), z);
    }

    public final void setExtractNationality(boolean z) {
        extractNationalityNativeSet(getNativeContext(), z);
    }

    public final void setExtractPassportNumber(boolean z) {
        extractPassportNumberNativeSet(getNativeContext(), z);
    }

    public final void setExtractPlaceOfBirth(boolean z) {
        extractPlaceOfBirthNativeSet(getNativeContext(), z);
    }

    public final void setExtractPrincipalResidence(boolean z) {
        extractPrincipalResidenceNativeSet(getNativeContext(), z);
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions
    public final void setReturnSignatureImage(boolean z) {
        returnSignatureImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.SignatureImageDpiOptions
    public final void setSignatureImageDpi(int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.DpiOptionsUtils.checkDpiRange(i);
        signatureImageDpiNativeSet(getNativeContext(), i);
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeSignatureImageOptions
    public final boolean shouldEncodeSignatureImage() {
        return encodeSignatureImageNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfBirth() {
        return extractDateOfBirthNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfExpiry() {
        return extractDateOfExpiryNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfIssuance() {
        return extractDateOfIssuanceNativeGet(getNativeContext());
    }

    public final boolean shouldExtractDateOfIssue() {
        return extractDateOfIssueNativeGet(getNativeContext());
    }

    public final boolean shouldExtractGivenName() {
        return extractGivenNameNativeGet(getNativeContext());
    }

    public final boolean shouldExtractHeight() {
        return extractHeightNativeGet(getNativeContext());
    }

    public final boolean shouldExtractIssuingAuthority() {
        return extractIssuingAuthorityNativeGet(getNativeContext());
    }

    public final boolean shouldExtractNationality() {
        return extractNationalityNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPassportNumber() {
        return extractPassportNumberNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPlaceOfBirth() {
        return extractPlaceOfBirthNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPrincipalResidence() {
        return extractPrincipalResidenceNativeGet(getNativeContext());
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.SignatureImageOptions
    public final boolean shouldReturnSignatureImage() {
        return returnSignatureImageNativeGet(getNativeContext());
    }

    public AustriaCombinedRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private AustriaCombinedRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private AustriaCombinedRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.austria.AustriaCombinedRecognizer(nativeCopy(getNativeContext()));
    }
}
