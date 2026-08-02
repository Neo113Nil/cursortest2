package com.microblink.blinkid.entities.recognizers.blinkinput;

/* loaded from: classes10.dex */
public final class BlinkInputRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer createFromParcel(android.os.Parcel parcel) {
            android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.class.getClassLoader());
            int length = readParcelableArray.length;
            com.microblink.blinkid.entities.processors.Processor[] processorArr = new com.microblink.blinkid.entities.processors.Processor[length];
            for (int i = 0; i < length; i++) {
                processorArr[i] = (com.microblink.blinkid.entities.processors.Processor) readParcelableArray[i];
            }
            return new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer(parcel, com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.nativeConstruct(), processorArr, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer[] newArray(int i) {
            return new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer[i];
        }
    };
    private final com.microblink.blinkid.entities.processors.Processor[] getHighResolutionOutputSizeshNQ4ISI;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result(com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result[i];
            }
        };

        protected Result(long j) {
            super(j);
        }

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final java.lang.String toString() {
            com.microblink.blinkid.entities.Entity entity = this.IlIllIlIIl;
            if (entity == null || !(entity instanceof com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer)) {
                return super.toString();
            }
            com.microblink.blinkid.entities.processors.Processor[] processors = ((com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer) entity).getProcessors();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            for (com.microblink.blinkid.entities.processors.Processor processor : processors) {
                sb.append(processor.getResult().toString());
                sb.append('\n');
            }
            return sb.toString();
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
        public final com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    /* synthetic */ BlinkInputRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.processors.Processor[] processorArr, byte b) {
        this(parcel, j, processorArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct();

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    public static native void nativeSetProcessors(long j, long[] jArr);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this != entity) {
            if (!(entity instanceof com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer)) {
                throw new java.lang.IllegalArgumentException("Parameter type has to be BlinkInputRecognizer");
            }
            com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer blinkInputRecognizer = (com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer) entity;
            nativeConsumeResult(getNativeContext(), ((com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result) blinkInputRecognizer.getResult()).getNativeContext());
            int length = blinkInputRecognizer.getHighResolutionOutputSizeshNQ4ISI.length;
            com.microblink.blinkid.entities.processors.Processor[] processorArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (length != processorArr.length) {
                throw new java.lang.IllegalStateException("Consuming result from incompatible BlinkInputRecognizer!");
            }
            int length2 = processorArr.length;
            for (int i = 0; i < length2; i++) {
                this.getHighResolutionOutputSizeshNQ4ISI[i].consumeResultFrom(blinkInputRecognizer.getHighResolutionOutputSizeshNQ4ISI[i]);
            }
        }
    }

    public final com.microblink.blinkid.entities.processors.Processor[] getProcessors() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return null;
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelableArray(this.getHighResolutionOutputSizeshNQ4ISI, i);
        super.writeToParcel(parcel, i);
    }

    public BlinkInputRecognizer(com.microblink.blinkid.entities.processors.Processor... processorArr) {
        this(nativeConstruct(), processorArr);
    }

    private BlinkInputRecognizer(long j, com.microblink.blinkid.entities.processors.Processor[] processorArr) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
        if (processorArr.length != 0) {
            for (com.microblink.blinkid.entities.processors.Processor processor : processorArr) {
                if (processor == null) {
                    throw new java.lang.NullPointerException("It is not allowed to pass null processor to BlinkInputRecognizer.");
                }
            }
            this.getHighResolutionOutputSizeshNQ4ISI = processorArr;
            long nativeContext = getNativeContext();
            int length = processorArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = this.getHighResolutionOutputSizeshNQ4ISI[i].getNativeContext();
            }
            nativeSetProcessors(nativeContext, jArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("At least one processor must be passed to BlinkInputRecognizer.");
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer mo10869clone() {
        throw new java.lang.UnsupportedOperationException("BlinkInput recognizer does not support cloning!");
    }

    private BlinkInputRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.processors.Processor[] processorArr) {
        super(j, new com.microblink.blinkid.entities.recognizers.blinkinput.BlinkInputRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = processorArr;
        long nativeContext = getNativeContext();
        int length = processorArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = this.getHighResolutionOutputSizeshNQ4ISI[i].getNativeContext();
        }
        nativeSetProcessors(nativeContext, jArr);
    }
}
