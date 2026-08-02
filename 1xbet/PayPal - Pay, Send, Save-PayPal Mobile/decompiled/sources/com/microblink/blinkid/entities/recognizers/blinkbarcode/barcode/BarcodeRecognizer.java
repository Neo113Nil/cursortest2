package com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode;

/* loaded from: classes9.dex */
public final class BarcodeRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result[i];
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
        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer[i];
            }
        };
    }

    /* synthetic */ BarcodeRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean autoScaleDetectionNativeGet(long j);

    private static native void autoScaleDetectionNativeSet(long j, boolean z);

    private static native boolean code128NativeGet(long j);

    private static native void code128NativeSet(long j, boolean z);

    private static native boolean code39NativeGet(long j);

    private static native void code39NativeSet(long j, boolean z);

    private static native boolean ean13NativeGet(long j);

    private static native void ean13NativeSet(long j, boolean z);

    private static native boolean ean8NativeGet(long j);

    private static native void ean8NativeSet(long j, boolean z);

    private static native boolean itfNativeGet(long j);

    private static native void itfNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native boolean nullQuietZoneAllowedNativeGet(long j);

    private static native void nullQuietZoneAllowedNativeSet(long j, boolean z);

    private static native boolean pdf417NativeGet(long j);

    private static native void pdf417NativeSet(long j, boolean z);

    private static native boolean qrcodeNativeGet(long j);

    private static native void qrcodeNativeSet(long j, boolean z);

    private static native boolean readAsExtendedDataNativeGet(long j);

    private static native void readAsExtendedDataNativeSet(long j, boolean z);

    private static native boolean shouldScanInverseNativeGet(long j);

    private static native void shouldScanInverseNativeSet(long j, boolean z);

    private static native boolean slowerThoroughScanNativeGet(long j);

    private static native void slowerThoroughScanNativeSet(long j, boolean z);

    private static native boolean uncertainDecodingNativeGet(long j);

    private static native void uncertainDecodingNativeSet(long j, boolean z);

    private static native boolean upcaNativeGet(long j);

    private static native void upcaNativeSet(long j, boolean z);

    private static native boolean upceNativeGet(long j);

    private static native void upceNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be BarcodeRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final boolean isAutoScaleDetection() {
        return autoScaleDetectionNativeGet(getNativeContext());
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

    public final boolean isSlowerThoroughScan() {
        return slowerThoroughScanNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setAutoScaleDetection(boolean z) {
        autoScaleDetectionNativeSet(getNativeContext(), z);
    }

    public final void setNullQuietZoneAllowed(boolean z) {
        nullQuietZoneAllowedNativeSet(getNativeContext(), z);
    }

    public final void setReadCode39AsExtendedData(boolean z) {
        readAsExtendedDataNativeSet(getNativeContext(), z);
    }

    public final void setScanCode128(boolean z) {
        code128NativeSet(getNativeContext(), z);
    }

    public final void setScanCode39(boolean z) {
        code39NativeSet(getNativeContext(), z);
    }

    public final void setScanEan13(boolean z) {
        ean13NativeSet(getNativeContext(), z);
    }

    public final void setScanEan8(boolean z) {
        ean8NativeSet(getNativeContext(), z);
    }

    public final void setScanInverse(boolean z) {
        shouldScanInverseNativeSet(getNativeContext(), z);
    }

    public final void setScanItf(boolean z) {
        itfNativeSet(getNativeContext(), z);
    }

    public final void setScanPdf417(boolean z) {
        pdf417NativeSet(getNativeContext(), z);
    }

    public final void setScanQrCode(boolean z) {
        qrcodeNativeSet(getNativeContext(), z);
    }

    public final void setScanUncertain(boolean z) {
        uncertainDecodingNativeSet(getNativeContext(), z);
    }

    public final void setScanUpca(boolean z) {
        upcaNativeSet(getNativeContext(), z);
    }

    public final void setScanUpce(boolean z) {
        upceNativeSet(getNativeContext(), z);
    }

    public final void setSlowerThoroughScan(boolean z) {
        slowerThoroughScanNativeSet(getNativeContext(), z);
    }

    public final boolean shouldReadCode39AsExtendedData() {
        return readAsExtendedDataNativeGet(getNativeContext());
    }

    public final boolean shouldScanCode128() {
        return code128NativeGet(getNativeContext());
    }

    public final boolean shouldScanCode39() {
        return code39NativeGet(getNativeContext());
    }

    public final boolean shouldScanEan13() {
        return ean13NativeGet(getNativeContext());
    }

    public final boolean shouldScanEan8() {
        return ean8NativeGet(getNativeContext());
    }

    public final boolean shouldScanItf() {
        return itfNativeGet(getNativeContext());
    }

    public final boolean shouldScanPdf417() {
        return pdf417NativeGet(getNativeContext());
    }

    public final boolean shouldScanQrCode() {
        return qrcodeNativeGet(getNativeContext());
    }

    public final boolean shouldScanUpca() {
        return upcaNativeGet(getNativeContext());
    }

    public final boolean shouldScanUpce() {
        return upceNativeGet(getNativeContext());
    }

    public BarcodeRecognizer() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private BarcodeRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private BarcodeRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkbarcode.barcode.BarcodeRecognizer(nativeCopy(getNativeContext()));
    }
}
