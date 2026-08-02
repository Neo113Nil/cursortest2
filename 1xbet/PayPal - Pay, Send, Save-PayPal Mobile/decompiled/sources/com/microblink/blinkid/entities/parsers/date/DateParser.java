package com.microblink.blinkid.entities.parsers.date;

/* loaded from: classes9.dex */
public final class DateParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.date.DateParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.date.DateParser> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.date.DateParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.date.DateParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.date.DateParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.date.DateParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.date.DateParser.Result result = new com.microblink.blinkid.entities.parsers.date.DateParser.Result(com.microblink.blinkid.entities.parsers.date.DateParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.date.DateParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.date.DateParser.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native com.microblink.blinkid.results.date.Date dateNativeGet(long j);

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

        public final com.microblink.blinkid.results.date.Date getDate() {
            return dateNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getDate().getOriginalDateString().toString();
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
        public final com.microblink.blinkid.entities.parsers.date.DateParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.date.DateParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.date.DateParser>() { // from class: com.microblink.blinkid.entities.parsers.date.DateParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.date.DateParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.date.DateParser(parcel, com.microblink.blinkid.entities.parsers.date.DateParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.date.DateParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.date.DateParser[i];
            }
        };
    }

    /* synthetic */ DateParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native int[] dateFormatsNativeGet(long j);

    private static native void dateFormatsNativeSet(long j, int[] iArr);

    private static native char[] dateSeparatorCharsNativeGet(long j);

    private static native void dateSeparatorCharsNativeSet(long j, char[] cArr);

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
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.date.DateParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be DateParser");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.parsers.date.DateFormat[] getDateFormats() {
        int[] dateFormatsNativeGet = dateFormatsNativeGet(getNativeContext());
        com.microblink.blinkid.entities.parsers.date.DateFormat[] dateFormatArr = new com.microblink.blinkid.entities.parsers.date.DateFormat[dateFormatsNativeGet.length];
        for (int i = 0; i < dateFormatsNativeGet.length; i++) {
            dateFormatArr[i] = com.microblink.blinkid.entities.parsers.date.DateFormat.values()[dateFormatsNativeGet[i]];
        }
        return dateFormatArr;
    }

    public final char[] getDateSeparatorChars() {
        return dateSeparatorCharsNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setDateFormats(com.microblink.blinkid.entities.parsers.date.DateFormat[] dateFormatArr) {
        int[] iArr = dateFormatArr == null ? new int[0] : new int[dateFormatArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = dateFormatArr[i].ordinal();
        }
        dateFormatsNativeSet(getNativeContext(), iArr);
    }

    public final void setDateSeparatorChars(char[] cArr) {
        dateSeparatorCharsNativeSet(getNativeContext(), cArr);
    }

    public DateParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.date.DateParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private DateParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.date.DateParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.date.DateParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.date.DateParser(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private DateParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.date.DateParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
