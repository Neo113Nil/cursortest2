package com.microblink.blinkid.entities.detectors;

/* loaded from: classes9.dex */
public abstract class Detector<R extends com.microblink.blinkid.entities.detectors.Detector.Result> extends com.microblink.blinkid.entities.Entity<R> {
    public static final java.lang.String CLASS_NAME = "com.microblink.blinkid.entities.detectors.Detector";

    public static abstract class Result extends com.microblink.blinkid.entities.Entity.Result {

        public enum DetectionCode {
            FAIL,
            FALLBACK,
            SUCCESS
        }

        public Result(long j) {
            super(j);
        }

        protected static native int nativeGetDetectionCode(long j);

        private static native int nativeGetDetectionStatus(long j);

        public final com.microblink.blinkid.entities.detectors.Detector.Result.DetectionCode getDetectionCode() {
            int nativeGetDetectionCode = nativeGetDetectionCode(getNativeContext());
            return nativeGetDetectionCode > com.microblink.blinkid.entities.detectors.Detector.Result.DetectionCode.values().length ? com.microblink.blinkid.entities.detectors.Detector.Result.DetectionCode.SUCCESS : com.microblink.blinkid.entities.detectors.Detector.Result.DetectionCode.values()[nativeGetDetectionCode];
        }

        public final com.microblink.blinkid.view.recognition.DetectionStatus getDetectionStatus() {
            return com.microblink.blinkid.view.recognition.DetectionStatus.values()[nativeGetDetectionStatus(getNativeContext())];
        }

        @Override // com.microblink.blinkid.entities.Entity.Result
        public final boolean llIIlIlIIl() {
            return false;
        }
    }

    public Detector(long j, com.microblink.blinkid.entities.detectors.quad.QuadDetector.Result result) {
        super(j, result);
    }

    public Detector(long j, com.microblink.blinkid.entities.detectors.quad.QuadDetector.Result result, android.os.Parcel parcel) {
        super(j, result, parcel);
    }
}
