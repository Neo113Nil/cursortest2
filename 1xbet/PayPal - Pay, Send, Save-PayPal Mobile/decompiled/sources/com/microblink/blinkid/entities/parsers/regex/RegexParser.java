package com.microblink.blinkid.entities.parsers.regex;

/* loaded from: classes9.dex */
public final class RegexParser extends com.microblink.blinkid.entities.parsers.Parser<com.microblink.blinkid.entities.parsers.regex.RegexParser.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.regex.RegexParser> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.regex.RegexParser>() { // from class: com.microblink.blinkid.entities.parsers.regex.RegexParser.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.parsers.regex.RegexParser createFromParcel(android.os.Parcel parcel) {
            return new com.microblink.blinkid.entities.parsers.regex.RegexParser(parcel, com.microblink.blinkid.entities.parsers.regex.RegexParser.nativeConstruct());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.regex.RegexParser[] newArray(int i) {
            return new com.microblink.blinkid.entities.parsers.regex.RegexParser[i];
        }
    };
    private com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions Camera2StreamConfigurationMap;

    /* renamed from: com.microblink.blinkid.entities.parsers.regex.RegexParser$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2).length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[0] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[1] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public static final class Result extends com.microblink.blinkid.entities.parsers.Parser.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.regex.RegexParser.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.parsers.regex.RegexParser.Result>() { // from class: com.microblink.blinkid.entities.parsers.regex.RegexParser.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.parsers.regex.RegexParser.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.parsers.regex.RegexParser.Result result = new com.microblink.blinkid.entities.parsers.regex.RegexParser.Result(com.microblink.blinkid.entities.parsers.regex.RegexParser.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.parsers.regex.RegexParser.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.parsers.regex.RegexParser.Result[i];
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

        private static native java.lang.String parsedStringNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String getParsedString() {
            return parsedStringNativeGet(getNativeContext());
        }

        @Override // com.microblink.blinkid.entities.parsers.Parser.Result
        public final java.lang.String toString() {
            return getParsedString();
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
        public final com.microblink.blinkid.entities.parsers.regex.RegexParser.Result mo10870clone() {
            return new com.microblink.blinkid.entities.parsers.regex.RegexParser.Result(nativeCopy(getNativeContext()));
        }
    }

    /* synthetic */ RegexParser(android.os.Parcel parcel, long j) {
        this(j, parcel);
    }

    private static native boolean endWithWhitespaceNativeGet(long j);

    private static native void endWithWhitespaceNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    private static native long ocrEngineOptionsNativeGet(long j);

    private static native void ocrEngineOptionsNativeSet(long j, long j2, int i);

    private static native int ocrEngineOptionsTypeNativeGet(long j);

    private static native java.lang.String regexNativeGet(long j);

    private static native java.lang.String regexNativeSet(long j, java.lang.String str);

    private static native boolean startWithWhitespaceNativeGet(long j);

    private static native void startWithWhitespaceNativeSet(long j, boolean z);

    private static native boolean useSieveNativeGet(long j);

    private static native void useSieveNativeSet(long j, boolean z);

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void clearResult() {
        nativeConsumeResult(getNativeContext(), 0L);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this == entity) {
            return;
        }
        if (!(entity instanceof com.microblink.blinkid.entities.parsers.regex.RegexParser)) {
            throw new java.lang.IllegalArgumentException("Parameter type has to be RegexParser");
        }
        nativeConsumeResult(getNativeContext(), entity.getResult().getNativeContext());
    }

    public final com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions getOcrEngineOptions() {
        if (this.Camera2StreamConfigurationMap == null) {
            int llIIlIlIIl = com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2)[ocrEngineOptionsTypeNativeGet(getNativeContext())]);
            if (llIIlIlIIl == 0) {
                this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions(ocrEngineOptionsNativeGet(getNativeContext()), this);
            } else if (llIIlIlIIl == 1) {
                this.Camera2StreamConfigurationMap = new com.microblink.blinkid.entities.ocrengine.legacy.BlinkOCREngineOptions(ocrEngineOptionsNativeGet(getNativeContext()), this);
            }
        }
        return this.Camera2StreamConfigurationMap;
    }

    public final java.lang.String getRegex() {
        return regexNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    public final void setEndWithWhitespace(boolean z) {
        endWithWhitespaceNativeSet(getNativeContext(), z);
    }

    public final void setOcrEngineOptions(com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions abstractOCREngineOptions) {
        this.Camera2StreamConfigurationMap = null;
        ocrEngineOptionsNativeSet(getNativeContext(), abstractOCREngineOptions.getNativeContext(), com.microblink.blinkid.secured.llIlIIIIIl.llIIlIlIIl(abstractOCREngineOptions instanceof com.microblink.blinkid.entities.ocrengine.deep.DeepOCREngineOptions ? 1 : 2));
    }

    public final void setRegex(java.lang.String str) {
        java.lang.String regexNativeSet = regexNativeSet(getNativeContext(), str);
        if (regexNativeSet != null) {
            throw new java.lang.IllegalArgumentException("Failed to set regex due to error: ".concat(regexNativeSet));
        }
    }

    public final void setStartWithWhitespace(boolean z) {
        startWithWhitespaceNativeSet(getNativeContext(), z);
    }

    public final void setUseSieve(boolean z) {
        if (z && com.microblink.blinkid.secured.llIlIIIIIl.IlIllIlIIl(2)[ocrEngineOptionsTypeNativeGet(getNativeContext())] != 2) {
            throw new java.lang.IllegalArgumentException("Unable to enable sieve when not using BlinkOCREngineOptions!");
        }
        useSieveNativeSet(getNativeContext(), z);
    }

    public final boolean shouldEndWithWhitespace() {
        return endWithWhitespaceNativeGet(getNativeContext());
    }

    public final boolean shouldStartWithWhitespace() {
        return startWithWhitespaceNativeGet(getNativeContext());
    }

    public final boolean shouldUseSieve() {
        return useSieveNativeGet(getNativeContext());
    }

    public RegexParser(java.lang.String str) {
        this(nativeConstruct());
        setRegex(str);
    }

    @Override // com.microblink.blinkid.entities.parsers.Parser
    public final void consumeResult(com.microblink.blinkid.entities.parsers.regex.RegexParser.Result result) {
        if (getResult() != result) {
            nativeConsumeResult(getNativeContext(), result.getNativeContext());
        }
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.parsers.regex.RegexParser mo10869clone() {
        return new com.microblink.blinkid.entities.parsers.regex.RegexParser(getRegex(), getOcrEngineOptions());
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    public RegexParser(java.lang.String str, com.microblink.blinkid.entities.ocrengine.AbstractOCREngineOptions abstractOCREngineOptions) {
        this(nativeConstruct());
        setOcrEngineOptions(abstractOCREngineOptions);
        setRegex(str);
    }

    private RegexParser(long j) {
        super(j, new com.microblink.blinkid.entities.parsers.regex.RegexParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
    }

    private RegexParser(long j, android.os.Parcel parcel) {
        super(j, new com.microblink.blinkid.entities.parsers.regex.RegexParser.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
    }
}
