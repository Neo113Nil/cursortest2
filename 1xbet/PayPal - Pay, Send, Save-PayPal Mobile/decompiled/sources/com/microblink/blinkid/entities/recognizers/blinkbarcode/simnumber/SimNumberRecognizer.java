package com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber;

/* loaded from: classes9.dex */
public final class SimNumberRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result[i];
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

        private static native java.lang.String simNumberNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getSimNumber() {
            return simNumberNativeGet(getNativeContext());
        }

        public final java.lang.String toString() {
            return getSimNumber();
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
        public final com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer[i];
            }
        };
    }

    /* synthetic */ SimNumberRecognizer(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be SimNumberRecognizer");
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

    public SimNumberRecognizer() {
        this(nativeConstruct());
    }

    private SimNumberRecognizer(long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private SimNumberRecognizer(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer mo10869clone() {
        return new com.microblink.blinkid.entities.recognizers.blinkbarcode.simnumber.SimNumberRecognizer(nativeConstruct());
    }
}
