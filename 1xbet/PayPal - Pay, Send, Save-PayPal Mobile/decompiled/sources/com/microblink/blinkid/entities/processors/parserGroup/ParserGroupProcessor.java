package com.microblink.blinkid.entities.processors.parserGroup;

/* loaded from: classes9.dex */
public class ParserGroupProcessor extends com.microblink.blinkid.entities.processors.Processor<com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor>() { // from class: com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor createFromParcel(android.os.Parcel parcel) {
            android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.class.getClassLoader());
            int length = readParcelableArray.length;
            com.microblink.blinkid.entities.parsers.Parser[] parserArr = new com.microblink.blinkid.entities.parsers.Parser[length];
            for (int i = 0; i < length; i++) {
                parserArr[i] = (com.microblink.blinkid.entities.parsers.Parser) readParcelableArray[i];
            }
            return new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor(parcel, com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.nativeConstruct(), parserArr, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor[] newArray(int i) {
            return new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor[i];
        }
    };
    private final com.microblink.blinkid.entities.parsers.Parser[] getHighSpeedVideoFpsRanges;

    public static final class Result extends com.microblink.blinkid.entities.processors.Processor.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result>() { // from class: com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result result = new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result(com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native long ocrResultNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.results.ocr.OcrResult getOcrResult() {
            long ocrResultNativeGet = ocrResultNativeGet(getNativeContext());
            if (ocrResultNativeGet != 0) {
                return new com.microblink.blinkid.results.ocr.OcrResult(ocrResultNativeGet, this);
            }
            return null;
        }

        public final java.lang.String toString() {
            com.microblink.blinkid.entities.Entity entity = this.IlIllIlIIl;
            if (entity == null || !(entity instanceof com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor)) {
                return super.toString();
            }
            com.microblink.blinkid.entities.parsers.Parser[] parsers = ((com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) entity).getParsers();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (com.microblink.blinkid.entities.parsers.Parser parser : parsers) {
                sb.append(parser.getResult().toString());
                sb.append('\n');
            }
            return sb.toString();
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(byte[] bArr) {
            nativeDeserialize(getNativeContext(), bArr);
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public final com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result mo10870clone() {
            return new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result(nativeCopy(getNativeContext()));
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final void llIIlIlIIl(long j) {
            nativeDestruct(j);
        }
    }

    /* synthetic */ ParserGroupProcessor(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.parsers.Parser[] parserArr, byte b) {
        this(parcel, j, parserArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    public static native void nativeSetParsers(long j, long[] jArr);

    @Override // com.microblink.blinkid.entities.Entity
    public void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be ParserGroupProcessor");
            }
            com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor parserGroupProcessor = (com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor) entity;
            nativeConsumeResult(getNativeContext(), entity.getNativeContext());
            int length = parserGroupProcessor.getHighSpeedVideoFpsRanges.length;
            com.microblink.blinkid.entities.parsers.Parser[] parserArr = this.getHighSpeedVideoFpsRanges;
            if (length != parserArr.length) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible ParserGroupProcessor!");
            }
            int length2 = parserArr.length;
            for (int i = 0; i < length2; i++) {
                this.getHighSpeedVideoFpsRanges[i].consumeResultFrom(parserGroupProcessor.getHighSpeedVideoFpsRanges[i]);
            }
        }
    }

    public com.microblink.blinkid.entities.parsers.Parser[] getParsers() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return null;
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelableArray(this.getHighSpeedVideoFpsRanges, i);
        super.writeToParcel(parcel, i);
    }

    public ParserGroupProcessor(com.microblink.blinkid.entities.parsers.Parser... parserArr) {
        this(nativeConstruct(), parserArr);
    }

    private ParserGroupProcessor(long j, com.microblink.blinkid.entities.parsers.Parser[] parserArr) {
        super(j, new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
        if (parserArr.length != 0) {
            for (com.microblink.blinkid.entities.parsers.Parser parser : parserArr) {
                if (parser == null) {
                    throw new java.lang.NullPointerException("It is not allowed to pass null parser to ParserGroupProcessor.");
                }
            }
            this.getHighSpeedVideoFpsRanges = parserArr;
            long nativeContext = getNativeContext();
            int length = parserArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = this.getHighSpeedVideoFpsRanges[i].getNativeContext();
            }
            nativeSetParsers(nativeContext, jArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("At least one parser must be passed to ParserGroupProcessor.");
    }

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor mo10869clone() {
        throw new java.lang.UnsupportedOperationException("ParserGroupProcessor does not support cloning!");
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    private ParserGroupProcessor(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.parsers.Parser[] parserArr) {
        super(j, new com.microblink.blinkid.entities.processors.parserGroup.ParserGroupProcessor.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
        this.getHighSpeedVideoFpsRanges = parserArr;
        long nativeContext = getNativeContext();
        int length = parserArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = this.getHighSpeedVideoFpsRanges[i].getNativeContext();
        }
        nativeSetParsers(nativeContext, jArr);
    }
}
