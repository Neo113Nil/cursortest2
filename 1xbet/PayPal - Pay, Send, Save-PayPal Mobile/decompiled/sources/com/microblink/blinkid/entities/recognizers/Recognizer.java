package com.microblink.blinkid.entities.recognizers;

/* loaded from: classes.dex */
public abstract class Recognizer<T extends com.microblink.blinkid.entities.recognizers.Recognizer.Result> extends com.microblink.blinkid.entities.Entity<T> implements com.microblink.blinkid.entities.util.JsonizableEntity {

    /* loaded from: classes9.dex */
    public static abstract class Result extends com.microblink.blinkid.entities.Entity.Result {

        public enum State {
            Empty,
            Uncertain,
            Valid,
            StageValid
        }

        public Result(long j) {
            super(j);
        }

        private static native int nativeGetState(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public abstract com.microblink.blinkid.entities.recognizers.Recognizer.Result mo10870clone();

        public com.microblink.blinkid.entities.recognizers.Recognizer.Result.State getResultState() {
            return com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.values()[nativeGetState(getNativeContext())];
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final boolean llIIlIlIIl() {
            return getResultState() == com.microblink.blinkid.entities.recognizers.Recognizer.Result.State.Empty;
        }
    }

    public Recognizer(long j, com.microblink.blinkid.entities.recognizers.Recognizer.Result result) {
        super(j, result);
    }

    private static native java.lang.String nativeGetType(long j);

    private static native boolean nativeIsExcludedFromPing(long j);

    private static native boolean nativeRequiresAutofocus(long j);

    private static native boolean nativeRequiresLandscapeMode(long j);

    protected static native com.microblink.blinkid.entities.recognizers.SignedPayload signedJsonNativeGet(long j);

    @Override // com.microblink.blinkid.entities.Entity
    /* renamed from: clone */
    public abstract com.microblink.blinkid.entities.recognizers.Recognizer mo10869clone();

    public java.lang.String getName() {
        return nativeGetType(getNativeContext());
    }

    public boolean isExcludedFromPing() {
        return nativeIsExcludedFromPing(getNativeContext());
    }

    public boolean requiresAutofocus() {
        return nativeRequiresAutofocus(getNativeContext());
    }

    public boolean requiresLandscapeMode() {
        return nativeRequiresLandscapeMode(getNativeContext());
    }

    @Override // com.microblink.blinkid.entities.util.JsonizableEntity
    public com.microblink.blinkid.entities.recognizers.SignedPayload toSignedJson() {
        return signedJsonNativeGet(getNativeContext());
    }

    public Recognizer(long j, com.microblink.blinkid.entities.recognizers.Recognizer.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
