package com.microblink.blinkid.entities.processors;

/* loaded from: classes9.dex */
public abstract class Processor<T extends com.microblink.blinkid.entities.processors.Processor.Result> extends com.microblink.blinkid.entities.Entity<T> {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.processors.Processor";

    public static abstract class Result extends com.microblink.blinkid.entities.Entity.Result {

        public enum State {
            Empty,
            Invalid,
            Valid
        }

        public Result(long j) {
            super(j);
        }

        private static native int nativeGetState(long j);

        public com.microblink.blinkid.entities.processors.Processor.Result.State getResultState() {
            return com.microblink.blinkid.entities.processors.Processor.Result.State.values()[nativeGetState(getNativeContext())];
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final boolean llIIlIlIIl() {
            return getResultState() == com.microblink.blinkid.entities.processors.Processor.Result.State.Empty;
        }
    }

    public Processor(long j, com.microblink.blinkid.entities.processors.Processor.Result result) {
        super(j, result);
    }

    public Processor(long j, com.microblink.blinkid.entities.processors.Processor.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
