package com.microblink.blinkid.entities.detectors.quad.document;

/* loaded from: classes9.dex */
public final class DocumentDetector extends com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector<com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector>() { // from class: com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(parcel, com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.nativeConstruct());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector[] newArray(int i) {
            return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector[i];
        }
    };

    public static final class Result extends com.microblink.blinkid.entities.detectors.quad.QuadWithSizeDetector.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result>() { // from class: com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result(com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native double aspectRatioNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final double getAspectRatio() {
            return aspectRatioNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result mo10870clone() {
            return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result(nativeCopy(getNativeContext()));
        }
    }

    /* synthetic */ DocumentDetector(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native int numStableDetectionsThresholdNativeGet(long j);

    private static native void numStableDetectionsThresholdNativeSet(long j, int i);

    private static native long[] specificationsNativeGet(long j);

    private static native void specificationsNativeSet(long j, long[] jArr);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this == entity) {
            return;
        }
        if (!(entity instanceof com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector)) {
            throw new java.lang.IllegalArgumentException("Parameter type has to be DocumentDetector");
        }
        nativeConsumeResult(getNativeContext(), ((com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result) ((com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector) entity).getResult()).getNativeContext());
    }

    public final com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification[] getDocumentSpecifications() {
        long[] specificationsNativeGet = specificationsNativeGet(getNativeContext());
        com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification[] documentSpecificationArr = new com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification[specificationsNativeGet.length];
        for (int i = 0; i < specificationsNativeGet.length; i++) {
            documentSpecificationArr[i] = new com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification(specificationsNativeGet[i], false);
        }
        return documentSpecificationArr;
    }

    public final int getNumStableDetectionsThreshold() {
        return numStableDetectionsThresholdNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(getNativeContext());
    }

    public final void setNumStableDetectionsThreshold(int i) {
        if (i <= 0 || i > 255) {
            throw new java.lang.IllegalArgumentException("Minimum number of stable detections cannot be less than 1 and more than 255");
        }
        numStableDetectionsThresholdNativeSet(getNativeContext(), i);
    }

    public DocumentDetector(com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification... documentSpecificationArr) {
        this(nativeConstruct(), documentSpecificationArr);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private DocumentDetector(long j, com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification[] documentSpecificationArr) {
        super(j, new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
        if (documentSpecificationArr.length != 0) {
            long[] jArr = new long[documentSpecificationArr.length];
            for (int i = 0; i < documentSpecificationArr.length; i++) {
                com.microblink.blinkid.entities.detectors.quad.document.DocumentSpecification documentSpecification = documentSpecificationArr[i];
                if (documentSpecification != null) {
                    jArr[i] = documentSpecification.llIIlIlIIl;
                } else {
                    throw new java.lang.NullPointerException("It is not allowed to pass null specification to DocumentDetector!");
                }
            }
            specificationsNativeSet(j, jArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("At least one specification is required!");
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector mo10869clone() {
        return new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private DocumentDetector(long j) {
        super(j, new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private DocumentDetector(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.detectors.quad.document.DocumentDetector.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
