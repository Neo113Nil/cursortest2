package com.microblink.blinkid.entities.recognizers.blinkid.mrtd;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class MrtdCombinedRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result> implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer> CREATOR;
    private com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback Camera2StreamConfigurationMap;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult, com.microblink.blinkid.entities.recognizers.blinkid.CombinedDataMatchResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.CombinedFullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedCombinedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native int documentDataMatchNativeGet(long j);

        private static native byte[] encodedBackFullDocumentImageNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFrontFullDocumentImageNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native long fullDocumentBackImageNativeGet(long j);

        private static native long fullDocumentFrontImageNativeGet(long j);

        private static native long mrzResultNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native boolean scanningFirstSideDoneNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
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

        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult getMrzResult() {
            long mrzResultNativeGet = mrzResultNativeGet(getNativeContext());
            if (mrzResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult(mrzResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for mrzResult");
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult
        public final boolean isScanningFirstSideDone() {
            return scanningFirstSideDoneNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Mrtd Combined Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    public static final class VerificationConstants {
        public static final java.lang.String DocumentDataMatch = "documentDataMatch";
        public static final java.lang.String EncodedBackFullDocumentImage = "encodedBackFullDocumentImage";
        public static final java.lang.String EncodedFaceImage = "encodedFaceImage";
        public static final java.lang.String EncodedFrontFullDocumentImage = "encodedFrontFullDocumentImage";
        public static final java.lang.String FaceImage = "faceImage";
        public static final java.lang.String FullDocumentBackImage = "fullDocumentBackImage";
        public static final java.lang.String FullDocumentFrontImage = "fullDocumentFrontImage";
        public static final java.lang.String MrzResult = "mrzResult";
        public static final java.lang.String ScanningFirstSideDone = "scanningFirstSideDone";
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer[i];
            }
        };
    }

    /* synthetic */ MrtdCombinedRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean allowSpecialCharactersNativeGet(long j);

    private static native void allowSpecialCharactersNativeSet(long j, boolean z);

    private static native boolean allowUnparsedResultsNativeGet(long j);

    private static native void allowUnparsedResultsNativeSet(long j, boolean z);

    private static native boolean allowUnverifiedResultsNativeGet(long j);

    private static native void allowUnverifiedResultsNativeSet(long j, boolean z);

    private static native int detectorTypeNativeGet(long j);

    private static native void detectorTypeNativeSet(long j, int i);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native int faceImageDpiNativeGet(long j);

    private static native void faceImageDpiNativeSet(long j, int i);

    private static native int fullDocumentImageDpiNativeGet(long j);

    private static native void fullDocumentImageDpiNativeSet(long j, int i);

    private static native float[] fullDocumentImageExtensionFactorsNativeGet(long j);

    private static native void fullDocumentImageExtensionFactorsNativeSet(long j, float[] fArr);

    private static native void mrzFilterNativeSet(long j, com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback mrzFilterCallback);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native int numStableDetectionsThresholdNativeGet(long j);

    private static native void numStableDetectionsThresholdNativeSet(long j, int i);

    private static native boolean returnFaceImageNativeGet(long j);

    private static native void returnFaceImageNativeSet(long j, boolean z);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be MrtdCombinedRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.CombinedRecognizer
    public final com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult getCombinedResult() {
        return (com.microblink.blinkid.entities.recognizers.blinkid.CombinedResult) getResult();
    }

    public final com.microblink.blinkid.entities.recognizers.blinkid.documentface.DocumentFaceDetectorType getDetectorType() {
        return com.microblink.blinkid.entities.recognizers.blinkid.documentface.DocumentFaceDetectorType.values()[detectorTypeNativeGet(getNativeContext())];
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

    public final int getNumStableDetectionsThreshold() {
        return numStableDetectionsThresholdNativeGet(getNativeContext());
    }

    public final boolean isAllowSpecialCharacters() {
        return allowSpecialCharactersNativeGet(getNativeContext());
    }

    public final boolean isAllowUnparsedResults() {
        return allowUnparsedResultsNativeGet(getNativeContext());
    }

    public final boolean isAllowUnverifiedResults() {
        return allowUnverifiedResultsNativeGet(getNativeContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(android.os.Parcel parcel) {
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter mrzFilter = (com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter.class.getClassLoader());
        this.Camera2StreamConfigurationMap = null;
        if (mrzFilter != null) {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback(mrzFilter, ((com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result) getResult()).getMrzResult());
        }
        mrzFilterNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
        super.llIIlIlIIl(parcel);
    }

    public final void setAllowSpecialCharacters(boolean z) {
        allowSpecialCharactersNativeSet(getNativeContext(), z);
    }

    public final void setAllowUnparsedResults(boolean z) {
        allowUnparsedResultsNativeSet(getNativeContext(), z);
    }

    public final void setAllowUnverifiedResults(boolean z) {
        allowUnverifiedResultsNativeSet(getNativeContext(), z);
    }

    public final void setDetectorType(com.microblink.blinkid.entities.recognizers.blinkid.documentface.DocumentFaceDetectorType documentFaceDetectorType) {
        detectorTypeNativeSet(getNativeContext(), documentFaceDetectorType.ordinal());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions
    public final void setEncodeFaceImage(boolean z) {
        encodeFaceImageNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void setMRZFilter(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter mrzFilter) {
        if (mrzFilter != null) {
            this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback(mrzFilter, ((com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result) getResult()).getMrzResult());
        } else {
            this.Camera2StreamConfigurationMap = null;
        }
        mrzFilterNativeSet(getNativeContext(), this.Camera2StreamConfigurationMap);
    }

    public final void setNumStableDetectionsThreshold(int i) {
        numStableDetectionsThresholdNativeSet(getNativeContext(), i);
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

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions
    public final boolean shouldReturnFaceImage() {
        return returnFaceImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback mrzFilterCallback = this.Camera2StreamConfigurationMap;
        if (mrzFilterCallback != null) {
            parcel.writeParcelable(mrzFilterCallback.getHighResolutionOutputSizeshNQ4ISI, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        super.writeToParcel(parcel, i);
    }

    public MrtdCombinedRecognizer() {
        this(nativeConstruct());
    }

    private MrtdCombinedRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private MrtdCombinedRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdCombinedRecognizer(nativeCopy(getNativeContext()));
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
