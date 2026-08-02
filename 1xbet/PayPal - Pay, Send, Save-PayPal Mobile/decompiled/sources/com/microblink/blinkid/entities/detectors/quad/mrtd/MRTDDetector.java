package com.microblink.blinkid.entities.detectors.quad.mrtd;

/* loaded from: classes9.dex */
public final class MRTDDetector extends com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector<com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result>() { // from class: com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result result = new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result(com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native float mrzPhysicalHeightInInchesNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native void nativeGetMRZLocation(long j, float[] fArr);

        private static native byte[] nativeSerialize(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.geometry.Quadrilateral getMRZLocation() {
            float[] fArr = new float[8];
            nativeGetMRZLocation(getNativeContext(), fArr);
            return new com.microblink.blinkid.geometry.Quadrilateral(fArr);
        }

        public final float getMrzPhysicalHeightInInches() {
            return mrzPhysicalHeightInInchesNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.detectors.quad.QuadDetector.Result
        public final java.lang.String toString() {
            return getMRZLocation().toString();
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result mo10870clone() {
            return new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result(nativeCopy(getNativeContext()));
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector>() { // from class: com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector(parcel, com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector[] newArray(int i) {
                return new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector[i];
            }
        };
    }

    /* synthetic */ MRTDDetector(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean detectFullDocumentNativeGet(long j);

    private static native void detectFullDocumentNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native long[] specificationsNativeGet(long j);

    private static native void specificationsNativeSet(long j, long[] jArr);

    private static native boolean useCardDetectorNativeGet(long j);

    private static native void useCardDetectorNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be MRTDDetector");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[] getSpecifications() {
        long[] specificationsNativeGet = specificationsNativeGet(getNativeContext());
        com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[] mrtdSpecificationArr = new com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification[specificationsNativeGet.length];
        for (int i = 0; i < specificationsNativeGet.length; i++) {
            mrtdSpecificationArr[i] = new com.microblink.blinkid.entities.detectors.quad.mrtd.MrtdSpecification(specificationsNativeGet[i]);
        }
        return mrtdSpecificationArr;
    }

    public final boolean isDetectFullDocument() {
        return detectFullDocumentNativeGet(getNativeContext());
    }

    public final boolean isUseCardDetector() {
        return useCardDetectorNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setDetectFullDocument(boolean z) {
        detectFullDocumentNativeSet(getNativeContext(), z);
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

    public final void setUseCardDetector(boolean z) {
        useCardDetectorNativeSet(getNativeContext(), z);
    }

    public MRTDDetector() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private MRTDDetector(long j) {
        super(j, new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector mo10869clone() {
        return new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private MRTDDetector(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.detectors.quad.mrtd.MRTDDetector.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
