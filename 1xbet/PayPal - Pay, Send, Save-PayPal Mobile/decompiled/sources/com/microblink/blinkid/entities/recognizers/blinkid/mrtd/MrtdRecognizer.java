package com.microblink.blinkid.entities.recognizers.blinkid.mrtd;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class MrtdRecognizer extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer> CREATOR;
    private com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback getHighSpeedVideoFpsRanges;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native long mrzOcrResultNativeGet(long j);

        private static native long mrzResultNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native int nativeGetClassID(long j);

        private static native byte[] nativeSerialize(long j);

        private static native void nativeSetNativeClass(long j, int i);

        @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result
        public final int IlIllIlIIl(long j) {
            return nativeGetClassID(j);
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult
        public final byte[] getEncodedFullDocumentImage() {
            return encodedFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult
        public final com.microblink.blinkid.image.Image getFullDocumentImage() {
            long fullDocumentImageNativeGet = fullDocumentImageNativeGet(getNativeContext());
            if (fullDocumentImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(fullDocumentImageNativeGet, true, this);
            }
            return null;
        }

        public final com.microblink.blinkid.results.ocr.OcrResult getMrzOcrResult() {
            long mrzOcrResultNativeGet = mrzOcrResultNativeGet(getNativeContext());
            if (mrzOcrResultNativeGet != 0) {
                return new com.microblink.blinkid.results.ocr.OcrResult(mrzOcrResultNativeGet, this);
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

        public final java.lang.String toString() {
            return getMrzResult().toString();
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result
        public final void llIIlIlIIl(long j, int i) {
            nativeSetNativeClass(j, i);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.recognizers.Recognizer.Result, com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result(nativeCopy(getNativeContext()));
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer[i];
            }
        };
    }

    /* synthetic */ MrtdRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean allowSpecialCharactersNativeGet(long j);

    private static native void allowSpecialCharactersNativeSet(long j, boolean z);

    private static native boolean allowUnparsedResultsNativeGet(long j);

    private static native void allowUnparsedResultsNativeSet(long j, boolean z);

    private static native boolean allowUnverifiedResultsNativeGet(long j);

    private static native void allowUnverifiedResultsNativeSet(long j, boolean z);

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

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

    private static native void nativeSetTemplatingClasses(long j, long[] jArr);

    private static native boolean returnFullDocumentImageNativeGet(long j);

    private static native void returnFullDocumentImageNativeSet(long j, boolean z);

    private static native long[] specificationsNativeGet(long j);

    private static native void specificationsNativeSet(long j, long[] jArr);

    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer, com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        super.consumeResultFrom(entity);
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be MrtdRecognizer");
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

    public final com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[] getSpecifications() {
        long[] specificationsNativeGet = specificationsNativeGet(getNativeContext());
        com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[] mrtdSpecificationArr = new com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[specificationsNativeGet.length];
        for (int i = 0; i < specificationsNativeGet.length; i++) {
            mrtdSpecificationArr[i] = new com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification(specificationsNativeGet[i]);
        }
        return mrtdSpecificationArr;
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

    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer
    public final void llIIlIlIIl(long[] jArr) {
        nativeSetTemplatingClasses(getNativeContext(), jArr);
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

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final void setDetectGlare(boolean z) {
        detectGlareNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final void setEncodeFullDocumentImage(boolean z) {
        encodeFullDocumentImageNativeSet(getNativeContext(), z);
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
            this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback(mrzFilter, ((com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result) getResult()).getMrzResult());
        } else {
            this.getHighSpeedVideoFpsRanges = null;
        }
        mrzFilterNativeSet(getNativeContext(), this.getHighSpeedVideoFpsRanges);
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final void setReturnFullDocumentImage(boolean z) {
        returnFullDocumentImageNativeSet(getNativeContext(), z);
    }

    public final void setSpecifications(com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification... mrtdSpecificationArr) {
        if (mrtdSpecificationArr == null || mrtdSpecificationArr.length == 0) {
            specificationsNativeSet(getNativeContext(), null);
            return;
        }
        long[] jArr = new long[mrtdSpecificationArr.length];
        for (int i = 0; i < mrtdSpecificationArr.length; i++) {
            jArr[i] = mrtdSpecificationArr[i].getNativeContext();
        }
        specificationsNativeSet(getNativeContext(), jArr);
    }

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final boolean shouldDetectGlare() {
        return detectGlareNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions
    public final boolean shouldEncodeFullDocumentImage() {
        return encodeFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer, com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback mrzFilterCallback = this.getHighSpeedVideoFpsRanges;
        if (mrzFilterCallback != null) {
            parcel.writeParcelable(mrzFilterCallback.getHighResolutionOutputSizeshNQ4ISI, i);
        } else {
            parcel.writeParcelable(null, i);
        }
        super.writeToParcel(parcel, i);
    }

    public MrtdRecognizer() {
        this(nativeConstruct());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer, com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(android.os.Parcel parcel) {
        com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter mrzFilter = (com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilter.class.getClassLoader());
        this.getHighSpeedVideoFpsRanges = null;
        if (mrzFilter != null) {
            this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzFilterCallback(mrzFilter, ((com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result) getResult()).getMrzResult());
        }
        mrzFilterNativeSet(getNativeContext(), this.getHighSpeedVideoFpsRanges);
        super.llIIlIlIIl(parcel);
    }

    private MrtdRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private MrtdRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrtdRecognizer(nativeCopy(getNativeContext()));
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
