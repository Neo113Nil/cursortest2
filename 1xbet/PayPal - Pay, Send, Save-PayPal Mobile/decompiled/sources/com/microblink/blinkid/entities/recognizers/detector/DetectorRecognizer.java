package com.microblink.blinkid.entities.recognizers.detector;

/* loaded from: classes10.dex */
public final class DetectorRecognizer extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer<com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer> CREATOR;
    private final com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector getHighResolutionOutputSizeshNQ4ISI;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result(com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result.nativeConstruct(), (byte) 0);
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result[i];
            }
        };

        private Result(long j) {
            super(j);
        }

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

        Result(long j, byte b) {
            super(j);
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
        public final com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result(nativeCopy(getNativeContext()));
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(getNativeContext());
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector quadWithSizeDetector = (com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector) parcel.readParcelable(com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.class.getClassLoader());
                return new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer(parcel, com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.nativeConstruct(quadWithSizeDetector.getNativeContext()), quadWithSizeDetector, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer[i];
            }
        };
    }

    /* synthetic */ DetectorRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector quadWithSizeDetector, byte b) {
        this(parcel, j, quadWithSizeDetector);
    }

    private static native boolean allowFlippedNativeGet(long j);

    private static native void allowFlippedNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct(long j);

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native void nativeSetTemplatingClasses(long j, long[] jArr);

    private static native boolean useGlareDetectorNativeGet(long j);

    private static native void useGlareDetectorNativeSet(long j, boolean z);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer, com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        super.consumeResultFrom(entity);
        if (this == entity) {
            return;
        }
        if (!(entity instanceof com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer)) {
            throw new java.lang.IllegalArgumentException("Parameter type has to be DetectorRecognizer");
        }
        com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer detectorRecognizer = (com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer) entity;
        this.getHighResolutionOutputSizeshNQ4ISI.consumeResultFrom(detectorRecognizer.getHighResolutionOutputSizeshNQ4ISI);
        nativeConsumeResult(getNativeContext(), ((com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result) detectorRecognizer.getResult()).getNativeContext());
    }

    public final com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector<?> getDetector() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean isAllowFlippedRecognition() {
        return allowFlippedNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer
    public final void llIIlIlIIl(long[] jArr) {
        nativeSetTemplatingClasses(getNativeContext(), jArr);
    }

    public final void setAllowFlippedRecognition(boolean z) {
        allowFlippedNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final void setDetectGlare(boolean z) {
        useGlareDetectorNativeSet(getNativeContext(), z);
    }

    @Override // com.microblink.blinkid.entities.settings.GlareDetectorOptions
    public final boolean shouldDetectGlare() {
        return useGlareDetectorNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.templating.TemplatingRecognizer, com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        super.writeToParcel(parcel, i);
    }

    public DetectorRecognizer(com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector<?> quadWithSizeDetector) {
        this(nativeConstruct(quadWithSizeDetector.getNativeContext()), quadWithSizeDetector);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private DetectorRecognizer(long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector quadWithSizeDetector) {
        super(j, new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j), (byte) 0));
        this.getHighResolutionOutputSizeshNQ4ISI = quadWithSizeDetector;
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer mo10869clone() {
        throw new java.lang.UnsupportedOperationException("DetectorRecognizer does not support cloning!");
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private DetectorRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector quadWithSizeDetector) {
        super(j, new com.microblink.blinkid.entities.recognizers.detector.DetectorRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j), (byte) 0), parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = quadWithSizeDetector;
    }
}
