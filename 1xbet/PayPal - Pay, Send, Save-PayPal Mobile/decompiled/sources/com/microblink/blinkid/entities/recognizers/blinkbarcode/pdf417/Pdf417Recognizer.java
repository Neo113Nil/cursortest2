package com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public final class Pdf417Recognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result(com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native int barcodeTypeNativeGet(long j);

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native byte[] rawBytesNativeGet(long j);

        private static native java.lang.String stringDataNativeGet(long j);

        private static native boolean uncertainNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType getBarcodeType() {
            return com.microblink.blinkid.entities.recognizers.blinkbarcode.BarcodeType.values()[barcodeTypeNativeGet(getNativeContext())];
        }

        public final byte[] getRawData() {
            return rawBytesNativeGet(getNativeContext());
        }

        public final java.lang.String getStringData() {
            return stringDataNativeGet(getNativeContext());
        }

        public final boolean isUncertain() {
            return uncertainNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(getBarcodeType().name());
            sb.append("\n\n");
            sb.append(getStringData());
            return sb.toString();
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
        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer[i];
            }
        };
    }

    /* synthetic */ Pdf417Recognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native boolean nullQuietZoneAllowedNativeGet(long j);

    private static native void nullQuietZoneAllowedNativeSet(long j, boolean z);

    private static native boolean shouldScanInverseNativeGet(long j);

    private static native void shouldScanInverseNativeSet(long j, boolean z);

    private static native boolean uncertainDecodingNativeGet(long j);

    private static native void uncertainDecodingNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be Pdf417Recognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final boolean isNullQuietZoneAllowed() {
        return nullQuietZoneAllowedNativeGet(getNativeContext());
    }

    public final boolean isScanInverse() {
        return shouldScanInverseNativeGet(getNativeContext());
    }

    public final boolean isScanUncertain() {
        return uncertainDecodingNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setNullQuietZoneAllowed(boolean z) {
        nullQuietZoneAllowedNativeSet(getNativeContext(), z);
    }

    public final void setScanInverse(boolean z) {
        shouldScanInverseNativeSet(getNativeContext(), z);
    }

    public final void setScanUncertain(boolean z) {
        uncertainDecodingNativeSet(getNativeContext(), z);
    }

    public Pdf417Recognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private Pdf417Recognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private Pdf417Recognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkbarcode.pdf417.Pdf417Recognizer(nativeCopy(getNativeContext()));
    }
}
