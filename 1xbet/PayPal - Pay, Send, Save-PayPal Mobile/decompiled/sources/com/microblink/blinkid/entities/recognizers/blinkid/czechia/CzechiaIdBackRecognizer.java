package com.microblink.blinkid.entities.recognizers.blinkid.czechia;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class CzechiaIdBackRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String authorityNativeGet(long j);

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native long mrzResultNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String permanentStayNativeGet(long j);

        private static native java.lang.String personalNumberNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getAuthority() {
            return authorityNativeGet(getNativeContext());
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

        public final com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult getMrzResult() {
            long mrzResultNativeGet = mrzResultNativeGet(getNativeContext());
            if (mrzResultNativeGet != 0) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.mrtd.MrzResult(mrzResultNativeGet, this);
            }
            throw new java.lang.RuntimeException("Invalid native context for mrzResult");
        }

        public final java.lang.String getPermanentStay() {
            return permanentStayNativeGet(getNativeContext());
        }

        public final java.lang.String getPersonalNumber() {
            return personalNumberNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Czechia Id Back Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer[i];
            }
        };
    }

    /* synthetic */ CzechiaIdBackRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractAuthorityNativeGet(long j);

    private static native void extractAuthorityNativeSet(long j, boolean z);

    private static native boolean extractPermanentStayNativeGet(long j);

    private static native void extractPermanentStayNativeSet(long j, boolean z);

    private static native boolean extractPersonalNumberNativeGet(long j);

    private static native void extractPersonalNumberNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be CzechiaIdBackRecognizer");
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

    public final void setExtractAuthority(boolean z) {
        extractAuthorityNativeSet(getNativeContext(), z);
    }

    public final void setExtractPermanentStay(boolean z) {
        extractPermanentStayNativeSet(getNativeContext(), z);
    }

    public final void setExtractPersonalNumber(boolean z) {
        extractPersonalNumberNativeSet(getNativeContext(), z);
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

    public final boolean shouldExtractAuthority() {
        return extractAuthorityNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPermanentStay() {
        return extractPermanentStayNativeGet(getNativeContext());
    }

    public final boolean shouldExtractPersonalNumber() {
        return extractPersonalNumberNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions
    public final boolean shouldReturnFullDocumentImage() {
        return returnFullDocumentImageNativeGet(getNativeContext());
    }

    public CzechiaIdBackRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private CzechiaIdBackRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private CzechiaIdBackRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.czechia.CzechiaIdBackRecognizer(nativeCopy(getNativeContext()));
    }
}
