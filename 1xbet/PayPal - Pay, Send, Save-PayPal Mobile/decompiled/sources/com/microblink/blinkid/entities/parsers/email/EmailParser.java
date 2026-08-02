package com.microblink.blinkid.entities.parsers.email;

/* loaded from: classes9.dex */
public final class EmailParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.email.EmailParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.email.EmailParser> CREATOR;

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.email.EmailParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.email.EmailParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.email.EmailParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.email.EmailParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.email.EmailParser.Result result = new com.microblink.blinkid.entities.parsers.email.EmailParser.Result(com.microblink.blinkid.entities.parsers.email.EmailParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.email.EmailParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.email.EmailParser.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native java.lang.String emailNativeGet(long j);

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

        public final java.lang.String getEmail() {
            return emailNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getEmail();
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
        public final com.microblink.blinkid.entities.parsers.email.EmailParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.email.EmailParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.email.EmailParser>() { // from class: com.microblink.blinkid.entities.parsers.email.EmailParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.email.EmailParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.email.EmailParser(parcel, com.microblink.blinkid.entities.parsers.email.EmailParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.email.EmailParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.email.EmailParser[i];
            }
        };
    }

    /* synthetic */ EmailParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void clearResult() {
        nativeConsumeResult(getNativeContext(), 0L);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.email.EmailParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be EmailParser");
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

    public EmailParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.email.EmailParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    private EmailParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.email.EmailParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.email.EmailParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.email.EmailParser(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private EmailParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.email.EmailParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
