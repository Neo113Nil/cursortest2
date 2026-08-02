package com.microblink.blinkid.entities.recognizers.blinkid.malaysia;

@java.lang.Deprecated
/* loaded from: classes10.dex */
public final class MalaysiaMyKadFrontRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result> implements com.microblink.blinkid.entities.settings.GlareDetectorOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FaceImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFaceImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.FullDocumentImageOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.dpi.FullDocumentImageDpiOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.FullDocumentImageExtensionOptions, com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.encode.EncodeFullDocumentImagesOptions {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result implements com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FullDocumentImageResult, com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.results.date.Date birthDateNativeGet(long j);

        private static native java.lang.String cityNativeGet(long j);

        private static native byte[] encodedFaceImageNativeGet(long j);

        private static native byte[] encodedFullDocumentImageNativeGet(long j);

        private static native long faceImageNativeGet(long j);

        private static native java.lang.String fullAddressNativeGet(long j);

        private static native long fullDocumentImageNativeGet(long j);

        private static native java.lang.String fullNameNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String nricNativeGet(long j);

        private static native java.lang.String ownerStateNativeGet(long j);

        private static native java.lang.String religionNativeGet(long j);

        private static native java.lang.String sexNativeGet(long j);

        private static native java.lang.String streetNativeGet(long j);

        private static native java.lang.String zipcodeNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.results.date.Date getBirthDate() {
            return birthDateNativeGet(getNativeContext());
        }

        public final java.lang.String getCity() {
            return cityNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFaceImageResult
        public final byte[] getEncodedFaceImage() {
            return encodedFaceImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.EncodedFullDocumentImageResult
        public final byte[] getEncodedFullDocumentImage() {
            return encodedFullDocumentImageNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.recognizers.blinkid.imageresult.FaceImageResult
        public final com.microblink.blinkid.image.Image getFaceImage() {
            long faceImageNativeGet = faceImageNativeGet(getNativeContext());
            if (faceImageNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(faceImageNativeGet, true, this);
            }
            return null;
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

        public final java.lang.String getFullName() {
            return fullNameNativeGet(getNativeContext());
        }

        public final java.lang.String getNric() {
            return nricNativeGet(getNativeContext());
        }

        public final java.lang.String getOwnerState() {
            return ownerStateNativeGet(getNativeContext());
        }

        public final java.lang.String getReligion() {
            return religionNativeGet(getNativeContext());
        }

        public final java.lang.String getSex() {
            return sexNativeGet(getNativeContext());
        }

        public final java.lang.String getStreet() {
            return streetNativeGet(getNativeContext());
        }

        public final java.lang.String getZipcode() {
            return zipcodeNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return "Malaysia My Kad Front Recognizer";
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
        public final com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer[i];
            }
        };
    }

    /* synthetic */ MalaysiaMyKadFrontRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectGlareNativeGet(long j);

    private static native void detectGlareNativeSet(long j, boolean z);

    private static native boolean encodeFaceImageNativeGet(long j);

    private static native void encodeFaceImageNativeSet(long j, boolean z);

    private static native boolean encodeFullDocumentImageNativeGet(long j);

    private static native void encodeFullDocumentImageNativeSet(long j, boolean z);

    private static native boolean extractFullNameAndAddressNativeGet(long j);

    private static native void extractFullNameAndAddressNativeSet(long j, boolean z);

    private static native boolean extractReligionNativeGet(long j);

    private static native void extractReligionNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be MalaysiaMyKadFrontRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
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

    public final void setExtractFullNameAndAddress(boolean z) {
        extractFullNameAndAddressNativeSet(getNativeContext(), z);
    }

    public final void setExtractReligion(boolean z) {
        extractReligionNativeSet(getNativeContext(), z);
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

    public final boolean shouldExtractFullNameAndAddress() {
        return extractFullNameAndAddressNativeGet(getNativeContext());
    }

    public final boolean shouldExtractReligion() {
        return extractReligionNativeGet(getNativeContext());
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

    public MalaysiaMyKadFrontRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private MalaysiaMyKadFrontRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private MalaysiaMyKadFrontRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkid.malaysia.MalaysiaMyKadFrontRecognizer(nativeCopy(getNativeContext()));
    }
}
