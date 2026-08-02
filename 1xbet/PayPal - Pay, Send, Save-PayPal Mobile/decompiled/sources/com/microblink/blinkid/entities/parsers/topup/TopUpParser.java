package com.microblink.blinkid.entities.parsers.topup;

/* loaded from: classes9.dex */
public final class TopUpParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.topup.TopUpParser> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result result = new com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result(com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result[i];
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

        private static native java.lang.String topUpNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getTopUp() {
            return topUpNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getTopUp();
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result, com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.topup.TopUpParser>() { // from class: com.microblink.blinkid.entities.parsers.topup.TopUpParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.topup.TopUpParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.topup.TopUpParser(parcel, com.microblink.blinkid.entities.parsers.topup.TopUpParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.topup.TopUpParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.topup.TopUpParser[i];
            }
        };
    }

    /* synthetic */ TopUpParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean allowNoPrefixNativeGet(long j);

    private static native void allowNoPrefixNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native void prefixAndUssdCodeLengthNativeSet(long j, java.lang.String str, int i);

    private static native boolean returnCodeWithoutPrefixNativeGet(long j);

    private static native void returnCodeWithoutPrefixNativeSet(long j, boolean z);

    private static native void topUpPresetNativeSet(long j, int i);

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void clearResult() {
        nativeConsumeResult(getNativeContext(), 0L);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.topup.TopUpParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be TopUpParser");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setAllowNoPrefix(boolean z) {
        allowNoPrefixNativeSet(getNativeContext(), z);
    }

    public final void setPrefixAndUssdCodeLength(java.lang.String str, int i) {
        prefixAndUssdCodeLengthNativeSet(getNativeContext(), str, i);
    }

    public final void setReturnCodeWithoutPrefix(boolean z) {
        returnCodeWithoutPrefixNativeSet(getNativeContext(), z);
    }

    public final void setTopUpPreset(com.microblink.blinkid.entities.parsers.topup.TopUpPreset topUpPreset) {
        topUpPresetNativeSet(getNativeContext(), topUpPreset.ordinal());
    }

    public final boolean shouldAllowNoPrefix() {
        return allowNoPrefixNativeGet(getNativeContext());
    }

    public final boolean shouldReturnCodeWithoutPrefix() {
        return returnCodeWithoutPrefixNativeGet(getNativeContext());
    }

    public TopUpParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private TopUpParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.topup.TopUpParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.topup.TopUpParser(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private TopUpParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.topup.TopUpParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
