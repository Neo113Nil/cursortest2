package com.microblink.blinkid.entities.parsers.iban;

/* loaded from: classes9.dex */
public final class IbanParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.iban.IbanParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.iban.IbanParser> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.iban.IbanParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.iban.IbanParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.iban.IbanParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.iban.IbanParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.iban.IbanParser.Result result = new com.microblink.blinkid.entities.parsers.iban.IbanParser.Result(com.microblink.blinkid.entities.parsers.iban.IbanParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.iban.IbanParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.iban.IbanParser.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String ibanNativeGet(long j);

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

        public final java.lang.String getIban() {
            return ibanNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getIban();
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
        public final com.microblink.blinkid.entities.parsers.iban.IbanParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.iban.IbanParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.iban.IbanParser>() { // from class: com.microblink.blinkid.entities.parsers.iban.IbanParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.iban.IbanParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.iban.IbanParser(parcel, com.microblink.blinkid.entities.parsers.iban.IbanParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.iban.IbanParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.iban.IbanParser[i];
            }
        };
    }

    /* synthetic */ IbanParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean alwaysReturnPrefixNativeGet(long j);

    private static native void alwaysReturnPrefixNativeSet(long j, boolean z);

    private static native java.lang.String[] countryCodeWhitelistNativeGet(long j);

    private static native void countryCodeWhitelistNativeSet(long j, java.lang.String[] strArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void clearResult() {
        nativeConsumeResult(getNativeContext(), 0L);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.iban.IbanParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be IbanParser");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final java.lang.String[] getCountryCodeWhitelist() {
        return countryCodeWhitelistNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setAlwaysReturnPrefix(boolean z) {
        alwaysReturnPrefixNativeSet(getNativeContext(), z);
    }

    public final void setCountryCodeWhitelist(java.lang.String[] strArr) {
        countryCodeWhitelistNativeSet(getNativeContext(), strArr);
    }

    public final boolean shouldAlwaysReturnPrefix() {
        return alwaysReturnPrefixNativeGet(getNativeContext());
    }

    public IbanParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.iban.IbanParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private IbanParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.iban.IbanParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.iban.IbanParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.iban.IbanParser(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private IbanParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.iban.IbanParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
