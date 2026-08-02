package com.microblink.blinkid.entities.recognizers.framegrabber;

/* loaded from: classes10.dex */
public final class FrameGrabberRecognizer extends com.microblink.blinkid.entities.recognizers.Recognizer<com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result> {
    public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer> CREATOR;
    private final com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback getHighResolutionOutputSizeshNQ4ISI;

    public static final class NativeCallback {
        private com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback getHighSpeedVideoFpsRangesFor;

        NativeCallback(com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback frameCallback) {
            this.getHighSpeedVideoFpsRangesFor = frameCallback;
        }
    }

    public static final class Result extends com.microblink.blinkid.entities.recognizers.Recognizer.Result {
        public static final android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result> CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result>() { // from class: com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result result = new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result(com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result.nativeConstruct());
                result.llIIlIlIIl(parcel);
                return result;
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result[i];
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

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final byte[] IlIllIlIIl() {
            return nativeSerialize(getNativeContext());
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
        public final com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result mo10870clone() {
            return new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result(nativeCopy(getNativeContext()));
        }
    }

    static {
        com.microblink.blinkid.secured.lIIllllIIl.llIIlIlIIl();
        CREATOR = new android.os.Parcelable.Creator<com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer>() { // from class: com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer createFromParcel(android.os.Parcel parcel) {
                com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback = new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback((com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback) parcel.readParcelable(com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.class.getClassLoader()));
                return new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer(parcel, com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.nativeConstruct(nativeCallback), nativeCallback, (byte) 0);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer[] newArray(int i) {
                return new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer[i];
            }
        };
    }

    /* synthetic */ FrameGrabberRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback, byte b) {
        this(parcel, j, nativeCallback);
    }

    private static native boolean grabFocusedFramesNativeGet(long j);

    private static native void grabFocusedFramesNativeSet(long j, boolean z);

    private static native boolean grabUnfocusedFramesNativeGet(long j);

    private static native void grabUnfocusedFramesNativeSet(long j, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nativeConstruct(com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback);

    private static native long nativeCopy(long j, com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback);

    private static native void nativeDeserialize(long j, byte[] bArr);

    private static native void nativeDestruct(long j);

    private static native byte[] nativeSerialize(long j);

    @Override // com.microblink.blinkid.entities.Entity
    public final void consumeResultFrom(com.microblink.blinkid.entities.Entity entity) {
    }

    public final com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback getFrameCallback() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
    }

    public final void setFrameCallback(com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback frameCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor = frameCallback;
    }

    public final void setGrabFocusedFrames(boolean z) {
        grabFocusedFramesNativeSet(getNativeContext(), z);
    }

    public final void setGrabUnfocusedFrames(boolean z) {
        grabUnfocusedFramesNativeSet(getNativeContext(), z);
    }

    public final boolean shouldGrabFocusedFrames() {
        return grabFocusedFramesNativeGet(getNativeContext());
    }

    public final boolean shouldGrabUnfocusedFrames() {
        return grabUnfocusedFramesNativeGet(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.Entity, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor, i);
        super.writeToParcel(parcel, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FrameGrabberRecognizer(com.microblink.blinkid.entities.recognizers.framegrabber.FrameCallback frameCallback) {
        this(nativeConstruct(r0), r0);
        com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback = new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback(frameCallback);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(long j) {
        nativeDestruct(j);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final byte[] llIIlIlIIl() {
        return nativeSerialize(getNativeContext());
    }

    private FrameGrabberRecognizer(long j, com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback) {
        super(j, new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)));
        this.getHighResolutionOutputSizeshNQ4ISI = nativeCallback;
    }

    @Override // com.microblink.blinkid.entities.recognizers.Recognizer, com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public final com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer mo10869clone() {
        com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback = new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback(this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor);
        return new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer(nativeCopy(getNativeContext(), nativeCallback), nativeCallback);
    }

    @Override // com.microblink.blinkid.entities.Entity
    public final void llIIlIlIIl(byte[] bArr) {
        nativeDeserialize(getNativeContext(), bArr);
    }

    private FrameGrabberRecognizer(android.os.Parcel parcel, long j, com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.NativeCallback nativeCallback) {
        super(j, new com.microblink.blinkid.entities.recognizers.framegrabber.FrameGrabberRecognizer.Result(com.microblink.blinkid.entities.Entity.nativeGetNativeResultContext(j)), parcel);
        this.getHighResolutionOutputSizeshNQ4ISI = nativeCallback;
    }
}
