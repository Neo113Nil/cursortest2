package com.microblink.blinkid.entities.parsers.raw;

/* loaded from: classes9.dex */
public final class RawParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.raw.RawParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.raw.RawParser> CREATOR;
    private com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions getHighSpeedVideoFpsRanges;

    /* renamed from: com.microblink.blinkid.entities.parsers.raw.RawParser$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2).length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.raw.RawParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.raw.RawParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.raw.RawParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.raw.RawParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.raw.RawParser.Result result = new com.microblink.blinkid.entities.parsers.raw.RawParser.Result(com.microblink.blinkid.entities.parsers.raw.RawParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.raw.RawParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.raw.RawParser.Result[i];
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

        private static native java.lang.String rawTextNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getRawText() {
            return rawTextNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getRawText();
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
        public final com.microblink.blinkid.entities.parsers.raw.RawParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.raw.RawParser.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.raw.RawParser>() { // from class: com.microblink.blinkid.entities.parsers.raw.RawParser.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.raw.RawParser createFromParcel(android.os.Parcel parcel) {
                return new com.microblink.blinkid.entities.parsers.raw.RawParser(parcel, com.microblink.blinkid.entities.parsers.raw.RawParser.nativeConstruct());
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.raw.RawParser[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.raw.RawParser[i];
            }
        };
    }

    /* synthetic */ RawParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native long nativeCopy(long j);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native long ocrEngineOptionsNativeGet(long j);

    private static native void ocrEngineOptionsNativeSet(long j, long j2, int i);

    private static native int ocrEngineOptionsTypeNativeGet(long j);

    private static native boolean useSieveNativeGet(long j);

    private static native void useSieveNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void clearResult() {
        nativeConsumeResult(getNativeContext(), 0L);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.parsers.raw.RawParser)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be RawParser");
            }
            nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
        }
    }

    public final com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions getOcrEngineOptions() {
        if (this.getHighSpeedVideoFpsRanges == null) {
            int llIIlIlIIl = com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2)[ocrEngineOptionsTypeNativeGet(getNativeContext())]);
            if (llIIlIlIIl == 0) {
                this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions(ocrEngineOptionsNativeGet(getNativeContext()), this);
            } else if (llIIlIlIIl == 1) {
                this.getHighSpeedVideoFpsRanges = new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions(ocrEngineOptionsNativeGet(getNativeContext()), this);
            }
        }
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setOcrEngineOptions(com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions abstractOCREngineOptions) {
        this.getHighSpeedVideoFpsRanges = null;
        ocrEngineOptionsNativeSet(getNativeContext(), abstractOCREngineOptions.getNativeContext(), com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(abstractOCREngineOptions instanceof com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions ? 1 : 2));
    }

    public final void setUseSieve(boolean z) {
        if (z && com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2)[ocrEngineOptionsTypeNativeGet(getNativeContext())] != 2) {
            throw new java.lang.IllegalArgumentException("Unable to enable sieve when not using BlinkOCREngineOptions!");
        }
        useSieveNativeSet(getNativeContext(), z);
    }

    public final boolean shouldUseSieve() {
        return useSieveNativeGet(getNativeContext());
    }

    public RawParser() {
        this(nativeConstruct());
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.raw.RawParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private RawParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.raw.RawParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.raw.RawParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.raw.RawParser(nativeCopy(getNativeContext()));
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private RawParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.raw.RawParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
