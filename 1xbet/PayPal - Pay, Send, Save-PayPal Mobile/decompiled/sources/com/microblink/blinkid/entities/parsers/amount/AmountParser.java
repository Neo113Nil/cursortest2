package com.microblink.blinkid.entities.parsers.amount;

/* loaded from: classes9.dex */
public final class AmountParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.amount.AmountParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.amount.AmountParser> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.amount.AmountParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.amount.AmountParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.amount.AmountParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.amount.AmountParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.amount.AmountParser.Result result = new com.microblink.blinkid.entities.parsers.amount.AmountParser.Result(com.microblink.blinkid.entities.parsers.amount.AmountParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.amount.AmountParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.amount.AmountParser.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String amountNativeGet(long j);

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

        public final java.lang.String getAmount() {
            return amountNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getAmount();
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
        public final com.microblink.blinkid.entities.parsers.amount.AmountParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.amount.AmountParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.amount.AmountParser>() { // from class: com.microblink.blinkid.entities.parsers.amount.AmountParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.amount.AmountParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.amount.AmountParser(parcel, com.microblink.blinkid.entities.parsers.amount.AmountParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.amount.AmountParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.amount.AmountParser[i];
            }
        };
    }

    /* synthetic */ AmountParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean allowMissingDecimalsNativeGet(long j);

    private static native void allowMissingDecimalsNativeSet(long j, boolean z);

    private static native boolean allowNegativeAmountsNativeGet(long j);

    private static native void allowNegativeAmountsNativeSet(long j, boolean z);

    private static native boolean allowSpaceSeparatorsNativeGet(long j);

    private static native void allowSpaceSeparatorsNativeSet(long j, boolean z);

    private static native boolean arabicIndicModeNativeGet(long j);

    private static native void arabicIndicModeNativeSet(long j, boolean z);

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
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.amount.AmountParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be AmountParser");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final boolean isArabicIndicMode() {
        return arabicIndicModeNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setAllowMissingDecimals(boolean z) {
        allowMissingDecimalsNativeSet(getNativeContext(), z);
    }

    public final void setAllowNegativeAmounts(boolean z) {
        allowNegativeAmountsNativeSet(getNativeContext(), z);
    }

    public final void setAllowSpaceSeparators(boolean z) {
        allowSpaceSeparatorsNativeSet(getNativeContext(), z);
    }

    public final void setArabicIndicMode(boolean z) {
        arabicIndicModeNativeSet(getNativeContext(), z);
    }

    public final boolean shouldAllowMissingDecimals() {
        return allowMissingDecimalsNativeGet(getNativeContext());
    }

    public final boolean shouldAllowNegativeAmounts() {
        return allowNegativeAmountsNativeGet(getNativeContext());
    }

    public final boolean shouldAllowSpaceSeparators() {
        return allowSpaceSeparatorsNativeGet(getNativeContext());
    }

    public AmountParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.amount.AmountParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private AmountParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.amount.AmountParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.amount.AmountParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.amount.AmountParser(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private AmountParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.amount.AmountParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
