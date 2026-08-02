package com.microblink.blinkid.entities.recognizers.blinkbarcode.vin;

/* loaded from: classes9.dex */
public final class VinRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native java.lang.String vinNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getVin() {
            return vinNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return getVin();
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
        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer[i];
            }
        };
    }

    /* synthetic */ VinRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be VinRecognizer");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return null;
    }

    public VinRecognizer() {
        this(nativeConstruct());
    }

    private VinRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private VinRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkbarcode.vin.VinRecognizer(nativeConstruct());
    }
}
