package com.microblink.blinkid.entities.recognizers.successframe;

/* loaded from: classes10.dex */
public final class SuccessFrameGrabberRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer> CREATOR;
    private final com.microblink.blinkid.entities.recognizers.Recognizer getHighResolutionOutputSizeshNQ4ISI;

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result(com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result.nativeConstruct(), (com.microblink.blinkid.entities.recognizers.Recognizer.Result) parcel.readParcelable(getClass().getClassLoader()));
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result[i];
            }
        };
        private final com.microblink.blinkid.entities.recognizers.Recognizer.Result getHighResolutionOutputSizeshNQ4ISI;

        protected Result(long j, com.microblink.blinkid.entities.recognizers.Recognizer.Result result) {
            super(j);
            this.getHighResolutionOutputSizeshNQ4ISI = result;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static native long nativeConstruct();

        private static native long nativeCopy(long j);

        private static native void nativeDeserialize(long j, byte[] bArr);

        private static native void nativeDestruct(long j);

        private static native byte[] nativeSerialize(long j);

        private static native long successFrameNativeGet(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
        }

        public final com.microblink.blinkid.entities.recognizers.Recognizer.Result getSlaveResult() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final com.microblink.blinkid.image.Image getSuccessFrame() {
            long successFrameNativeGet = successFrameNativeGet(getNativeContext());
            if (successFrameNativeGet != 0) {
                return com.microblink.blinkid.image.ImageBuilder.buildImageFromNativeContext(successFrameNativeGet, true, this);
            }
            return null;
        }

        public final java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI.toString();
        }

        @Override // com.microblink.blinkid.entities.Entity.Result, android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            if (this.IlIllIlIIl == null) {
                parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
            }
            super.writeToParcel(parcel, i);
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
        public final com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result(nativeCopy(getNativeContext()), this.getHighResolutionOutputSizeshNQ4ISI.mo10870clone());
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.Recognizer recognizer = (com.microblink.blinkid.entities.recognizers.Recognizer) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.class.getClassLoader());
                return new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer(parcel, com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.nativeConstruct(recognizer.getNativeContext()), recognizer, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer[i];
            }
        };
    }

    /* synthetic */ SuccessFrameGrabberRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.recognizers.Recognizer recognizer, byte b) {
        this(parcel, j, recognizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct(long j);

    private static native void nativeConsumeResult(long j, long j2);

    private static native void nativeDestruct(long j);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
        if (this == entity) {
            return;
        }
        if (!(entity instanceof com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer)) {
            throw new java.lang.IllegalArgumentException("Parameter type has to be SuccessFrameGrabberRecognizer");
        }
        com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer successFrameGrabberRecognizer = (com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer) entity;
        nativeConsumeResult(getNativeContext(), ((com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result) successFrameGrabberRecognizer.getResult()).getNativeContext());
        this.getHighResolutionOutputSizeshNQ4ISI.consumeResultFrom(successFrameGrabberRecognizer.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.microblink.blinkid.entities.recognizers.Recognizer<?> getSlaveRecognizer() {
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
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI, i);
        super.writeToParcel(parcel, i);
    }

    public SuccessFrameGrabberRecognizer(com.microblink.blinkid.entities.recognizers.Recognizer<?> recognizer) {
        this(recognizer, nativeConstruct(recognizer.getNativeContext()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SuccessFrameGrabberRecognizer(com.microblink.blinkid.entities.recognizers.Recognizer recognizer, long j) {
        super(j, new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j), (com.microblink.blinkid.entities.recognizers.Recognizer.Result) recognizer.getResult()));
        this.getHighResolutionOutputSizeshNQ4ISI = recognizer;
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer mo10869clone() {
        throw new java.lang.IllegalStateException("SuccessFrameGrabber recognizer does not support cloning!");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SuccessFrameGrabberRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.recognizers.Recognizer recognizer) {
        super(j, new com.microblink.blinkid.entities.recognizers.successframe.SuccessFrameGrabberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j), (com.microblink.blinkid.entities.recognizers.Recognizer.Result) recognizer.getResult()), parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = recognizer;
    }
}
