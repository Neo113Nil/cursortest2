package com.microblink.blinkid.entities.parsers;

/* loaded from: classes9.dex */
public abstract class Parser<T extends com.microblink.blinkid.entities.parsers.Parser.Result> extends com.microblink.blinkid.entities.Entity<T> {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.parsers.Parser";

    public static abstract class Result extends com.microblink.blinkid.entities.Entity.Result {

        public enum State {
            Empty,
            Uncertain,
            Valid
        }

        public Result(long j) {
            super(j);
        }

        private static native int nativeGetState(long j);

        @Override // com.microblink.blinkid.entities.Entity.Result
        /* renamed from: clone */
        public abstract com.microblink.blinkid.entities.parsers.Parser.Result mo10870clone();

        public com.microblink.blinkid.entities.parsers.Parser.Result.State getResultState() {
            return com.microblink.blinkid.entities.parsers.Parser.Result.State.values()[nativeGetState(getNativeContext())];
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final boolean llIIlIlIIl() {
            return getResultState() == com.microblink.blinkid.entities.parsers.Parser.Result.State.Empty;
        }

        public java.lang.String toString() {
            throw new java.lang.UnsupportedOperationException("toString must be overridden in all concrete parser results!");
        }
    }

    public Parser(long j, com.microblink.blinkid.entities.parsers.Parser.Result result) {
        super(j, result);
    }

    private static native int nativeGetPriority(long j);

    private static native boolean requiredNativeGet(long j);

    private static native void requiredNativeSet(long j, boolean z);

    public abstract void clearResult();

    public abstract void consumeResult(T t);

    public int getPriority() {
        return nativeGetPriority(getNativeContext());
    }

    public boolean isRequired() {
        return requiredNativeGet(getNativeContext());
    }

    public void setRequired(boolean z) {
        requiredNativeSet(getNativeContext(), z);
    }

    public Parser(long j, com.microblink.blinkid.entities.parsers.Parser.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
