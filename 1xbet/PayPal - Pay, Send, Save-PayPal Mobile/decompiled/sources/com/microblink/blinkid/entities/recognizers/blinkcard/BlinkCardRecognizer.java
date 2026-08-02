package com.microblink.blinkid.entities.recognizers.blinkcard;

/* loaded from: classes9.dex */
public final class BlinkCardRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer> CREATOR;
    private com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback Camera2StreamConfigurationMap;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String cardNumberNativeGet(long j);

        private static native java.lang.String cardNumberPrefixNativeGet(long j);

        private static native boolean cardNumberValidNativeGet(long j);

        private static native java.lang.String cvvNativeGet(long j);

        private static native long documentLivenessCheckNativeGet(long j);

        private static native byte[] encodedFirstSideFullDocumentImageNativeGet(long j);

        private static native byte[] encodedSecondSideFullDocumentImageNativeGet(long j);

        private static native com.microblink.blinkid.results.date.Date expiryDateNativeGet(long j);

        private static native boolean firstSideAnonymizedNativeGet(long j);

        private static native boolean firstSideBlurredNativeGet(long j);

        private static native long firstSideFullDocumentImageNativeGet(long j);

        private static native java.lang.String ibanNativeGet(long j);

        private static native int issuerNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String ownerNativeGet(long j);

        private static native int processingStatusNativeGet(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        private static native boolean secondSideAnonymizedNativeGet(long j);

        private static native boolean secondSideBlurredNativeGet(long j);

        private static native long secondSideFullDocumentImageNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getCardNumber() {
            return cardNumberNativeGet(getNativeContext());
        }

        public final java.lang.String getCardNumberPrefix() {
            return cardNumberPrefixNativeGet(getNativeContext());
        }

        public final java.lang.String getCvv() {
            return cvvNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckResult getDocumentLivenessCheck() {
            long documentLivenessCheckNativeGet = documentLivenessCheckNativeGet(getNativeContext());
            if (documentLivenessCheckNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkcard.DocumentLivenessCheckResult(documentLivenessCheckNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for documentLivenessCheck");
        }

        public final byte[] getEncodedFirstSideFullDocumentImage() {
            return encodedFirstSideFullDocumentImageNativeGet(getNativeContext());
        }

        public final byte[] getEncodedSecondSideFullDocumentImage() {
            return encodedSecondSideFullDocumentImageNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getExpiryDate() {
            return expiryDateNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.image.Image getFirstSideFullDocumentImage() {
            long firstSideFullDocumentImageNativeGet = firstSideFullDocumentImageNativeGet(getNativeContext());
            if (firstSideFullDocumentImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(firstSideFullDocumentImageNativeGet, true, this);
            }
            return null;
        }

        public final java.lang.String getIban() {
            return ibanNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkcard.Issuer getIssuer() {
            int issuerNativeGet = issuerNativeGet(getNativeContext());
            if (issuerNativeGet == -1) {
                return null;
            }
            return com.microblink.blinkid.entities.recognizers.blinkcard.Issuer.values()[issuerNativeGet];
        }

        public final java.lang.String getOwner() {
            return ownerNativeGet(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus getProcessingStatus() {
            return com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardProcessingStatus.values()[processingStatusNativeGet(getNativeContext())];
        }

        public final com.microblink.blinkid.image.Image getSecondSideFullDocumentImage() {
            long secondSideFullDocumentImageNativeGet = secondSideFullDocumentImageNativeGet(getNativeContext());
            if (secondSideFullDocumentImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(secondSideFullDocumentImageNativeGet, true, this);
            }
            return null;
        }

        public final boolean isCardNumberValid() {
            return cardNumberValidNativeGet(getNativeContext());
        }

        public final boolean isFirstSideAnonymized() {
            return firstSideAnonymizedNativeGet(getNativeContext());
        }

        public final boolean isFirstSideBlurred() {
            return firstSideBlurredNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final boolean isSecondSideAnonymized() {
            return secondSideAnonymizedNativeGet(getNativeContext());
        }

        public final boolean isSecondSideBlurred() {
            return secondSideBlurredNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "BlinkCard Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String CardNumber = "cardNumber";
        public static final java.lang.String CardNumberPrefix = "cardNumberPrefix";
        public static final java.lang.String CardNumberValid = "cardNumberValid";
        public static final java.lang.String Cvv = "cvv";
        public static final java.lang.String DocumentLivenessCheck = "documentLivenessCheck";
        public static final java.lang.String EncodedFirstSideFullDocumentImage = "encodedFirstSideFullDocumentImage";
        public static final java.lang.String EncodedSecondSideFullDocumentImage = "encodedSecondSideFullDocumentImage";
        public static final java.lang.String ExpiryDate = "expiryDate";
        public static final java.lang.String FirstSideAnonymized = "firstSideAnonymized";
        public static final java.lang.String FirstSideBlurred = "firstSideBlurred";
        public static final java.lang.String FirstSideFullDocumentImage = "firstSideFullDocumentImage";
        public static final java.lang.String Iban = "iban";
        public static final java.lang.String Owner = "owner";
        public static final java.lang.String ProcessingStatus = "processingStatus";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
        public static final java.lang.String SecondSideAnonymized = "secondSideAnonymized";
        public static final java.lang.String SecondSideBlurred = "secondSideBlurred";
        public static final java.lang.String SecondSideFullDocumentImage = "secondSideFullDocumentImage";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer[i];
            }
        };
    }

    /* synthetic */ BlinkCardRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean allowBlurFilterNativeGet(long j);

    private static native void allowBlurFilterNativeSet(long j, boolean z);

    private static native boolean allowInvalidCardNumberNativeGet(long j);

    private static native void allowInvalidCardNumberNativeSet(long j, boolean z);

    private static native int[] anonymizationSettingsNativeGet(long j);

    private static native void anonymizationSettingsNativeSet(long j, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractCvvNativeGet(long j);

    private static native void extractCvvNativeSet(long j, boolean z);

    private static native boolean extractExpiryDateNativeGet(long j);

    private static native void extractExpiryDateNativeSet(long j, boolean z);

    private static native boolean extractIbanNativeGet(long j);

    private static native void extractIbanNativeSet(long j, boolean z);

    private static native boolean extractOwnerNativeGet(long j);

    private static native void extractOwnerNativeSet(long j, boolean z);

    private static native int fullDocumentImageDpiNativeGet(long j);

    private static native void fullDocumentImageDpiNativeSet(long j, int i);

    private static native float[] fullDocumentImageExtensionFactorsNativeGet(long j);

    private static native void fullDocumentImageExtensionFactorsNativeSet(long j, float[] fArr);

    private static native float handDocumentOverlapThresholdNativeGet(long j);

    private static native void handDocumentOverlapThresholdNativeSet(long j, float f);

    private static native float handScaleThresholdNativeGet(long j);

    private static native void handScaleThresholdNativeSet(long j, float f);

    private static native void livenessStatusCallbackNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback nativeLivenessStatusCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native float paddingEdgeNativeGet(long j);

    private static native void paddingEdgeNativeSet(long j, float f);

    private static native int photocopyAnalysisMatchLevelNativeGet(long j);

    private static native void photocopyAnalysisMatchLevelNativeSet(long j, int i);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    private static native int screenAnalysisMatchLevelNativeGet(long j);

    private static native void screenAnalysisMatchLevelNativeSet(long j, int i);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be BlinkCardRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationSettings getAnonymizationSettings() {
        int[] anonymizationSettingsNativeGet = anonymizationSettingsNativeGet(getNativeContext());
        com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationSettings blinkCardAnonymizationSettings = new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationSettings();
        if (anonymizationSettingsNativeGet.length == 7) {
            blinkCardAnonymizationSettings.setCardNumberAnonymizationSettings(new com.microblink.blinkid.entities.recognizers.blinkcard.CardNumberAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.values()[anonymizationSettingsNativeGet[0]], anonymizationSettingsNativeGet[1], anonymizationSettingsNativeGet[2]));
            blinkCardAnonymizationSettings.setCardNumberPrefixAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.values()[anonymizationSettingsNativeGet[3]]);
            blinkCardAnonymizationSettings.setCvvAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.values()[anonymizationSettingsNativeGet[4]]);
            blinkCardAnonymizationSettings.setIbanAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.values()[anonymizationSettingsNativeGet[5]]);
            blinkCardAnonymizationSettings.setOwnerAnonymizationMode(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationMode.values()[anonymizationSettingsNativeGet[6]]);
        }
        return blinkCardAnonymizationSettings;
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer
    public final com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult getCombinedResult() {
        return (com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult) getResult();
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions
    public final int getFullDocumentImageDpi() {
        return fullDocumentImageDpiNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions
    public final com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors getFullDocumentImageExtensionFactors() {
        return com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors.createFromArray(fullDocumentImageExtensionFactorsNativeGet(getNativeContext()));
    }

    public final float getHandDocumentOverlapThreshold() {
        return handDocumentOverlapThresholdNativeGet(getNativeContext());
    }

    public final float getHandScaleThreshold() {
        return handScaleThresholdNativeGet(getNativeContext());
    }

    public final float getPaddingEdge() {
        return paddingEdgeNativeGet(getNativeContext());
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel getPhotocopyAnalysisMatchLevel() {
        return com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel.values()[photocopyAnalysisMatchLevelNativeGet(getNativeContext())];
    }

    public final com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel getScreenAnalysisMatchLevel() {
        return com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel.values()[screenAnalysisMatchLevelNativeGet(getNativeContext())];
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(android.os.Parcel parcel) {
        com.microblink.blinkid.entities.recognizers.blinkcard.LivenessStatusCallback livenessStatusCallback = (com.microblink.blinkid.entities.recognizers.blinkcard.LivenessStatusCallback) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback.class.getClassLoader());
        this.Camera2StreamConfigurationMap = null;
        if (livenessStatusCallback != null) {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback(livenessStatusCallback);
        }
        livenessStatusCallbackNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
        super.llIIlIlIIl(parcel);
    }

    public final void setAllowBlurFilter(boolean z) {
        allowBlurFilterNativeSet(getNativeContext(), z);
    }

    public final void setAllowInvalidCardNumber(boolean z) {
        allowInvalidCardNumberNativeSet(getNativeContext(), z);
    }

    public final void setAnonymizationSettings(com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardAnonymizationSettings blinkCardAnonymizationSettings) {
        anonymizationSettingsNativeSet(getNativeContext(), blinkCardAnonymizationSettings.getCardNumberAnonymizationSettings().anonymizationMode.ordinal(), blinkCardAnonymizationSettings.getCardNumberAnonymizationSettings().prefixDigitsVisible, blinkCardAnonymizationSettings.getCardNumberAnonymizationSettings().suffixDigitsVisible, blinkCardAnonymizationSettings.getCardNumberPrefixAnonymizationMode().ordinal(), blinkCardAnonymizationSettings.getCvvAnonymizationMode().ordinal(), blinkCardAnonymizationSettings.getIbanAnonymizationMode().ordinal(), blinkCardAnonymizationSettings.getOwnerAnonymizationMode().ordinal(), blinkCardAnonymizationSettings.getFallbackAnonymization());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setExtractCvv(boolean z) {
        extractCvvNativeSet(getNativeContext(), z);
    }

    public final void setExtractExpiryDate(boolean z) {
        extractExpiryDateNativeSet(getNativeContext(), z);
    }

    public final void setExtractIban(boolean z) {
        extractIbanNativeSet(getNativeContext(), z);
    }

    public final void setExtractOwner(boolean z) {
        extractOwnerNativeSet(getNativeContext(), z);
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

    public final void setHandDocumentOverlapThreshold(float f) {
        handDocumentOverlapThresholdNativeSet(getNativeContext(), f);
    }

    public final void setHandScaleThreshold(float f) {
        handScaleThresholdNativeSet(getNativeContext(), f);
    }

    public final void setLivenessStatusCallback(com.microblink.blinkid.entities.recognizers.blinkcard.LivenessStatusCallback livenessStatusCallback) {
        com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback nativeLivenessStatusCallback = this.Camera2StreamConfigurationMap;
        if (nativeLivenessStatusCallback != null) {
            nativeLivenessStatusCallback.getHighSpeedVideoFpsRangesFor = livenessStatusCallback;
        } else {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback(livenessStatusCallback);
            livenessStatusCallbackNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
        }
    }

    public final void setPaddingEdge(float f) {
        paddingEdgeNativeSet(getNativeContext(), f);
    }

    public final void setPhotocopyAnalysisMatchLevel(com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel matchLevel) {
        photocopyAnalysisMatchLevelNativeSet(getNativeContext(), matchLevel.ordinal());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final void setReturnFullDocumentImage(boolean z) {
        returnFullDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setScreenAnalysisMatchLevel(com.microblink.blinkid.entities.recognizers.blinkcard.MatchLevel matchLevel) {
        screenAnalysisMatchLevelNativeSet(getNativeContext(), matchLevel.ordinal());
    }

    public final boolean shouldAllowBlurFilter() {
        return allowBlurFilterNativeGet(getNativeContext());
    }

    public final boolean shouldAllowInvalidCardNumber() {
        return allowInvalidCardNumberNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final boolean shouldEncodeFullDocumentImage() {
        return encodeFullDocumentImageNativeGet(getNativeContext());
    }

    public final boolean shouldExtractCvv() {
        return extractCvvNativeGet(getNativeContext());
    }

    public final boolean shouldExtractExpiryDate() {
        return extractExpiryDateNativeGet(getNativeContext());
    }

    public final boolean shouldExtractIban() {
        return extractIbanNativeGet(getNativeContext());
    }

    public final boolean shouldExtractOwner() {
        return extractOwnerNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.blinkcard.NativeLivenessStatusCallback nativeLivenessStatusCallback = this.Camera2StreamConfigurationMap;
        if (nativeLivenessStatusCallback != null) {
            parcel.writeParcelable(nativeLivenessStatusCallback.getHighSpeedVideoFpsRangesFor, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        super.writeToParcel(parcel, i);
    }

    public BlinkCardRecognizer() {
        this(nativeConstruct());
    }

    private BlinkCardRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private BlinkCardRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }
}
