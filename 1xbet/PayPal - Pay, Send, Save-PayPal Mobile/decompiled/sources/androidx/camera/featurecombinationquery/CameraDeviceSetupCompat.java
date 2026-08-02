package androidx.camera.featurecombinationquery;

/* loaded from: classes.dex */
public interface CameraDeviceSetupCompat {
    androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupported(android.hardware.camera2.params.SessionConfiguration sessionConfiguration) throws android.hardware.camera2.CameraAccessException;

    androidx.camera.featurecombinationquery.CameraDeviceSetupCompat.SupportQueryResult isSessionConfigurationSupportedLegacy(androidx.camera.featurecombinationquery.SessionConfigurationLegacy sessionConfigurationLegacy);

    /* loaded from: classes6.dex */
    public static final class SupportQueryResult {
        public static final int RESULT_SUPPORTED = 1;
        public static final int RESULT_UNDEFINED = 0;
        public static final int RESULT_UNSUPPORTED = 2;
        public static final int SOURCE_ANDROID_FRAMEWORK = 2;
        public static final int SOURCE_PLAY_SERVICES = 1;
        public static final int SOURCE_UNDEFINED = 0;
        private final long getHighResolutionOutputSizeshNQ4ISI;
        private final int getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface Supported {
        }

        public SupportQueryResult(int i, int i2, long j) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighResolutionOutputSizeshNQ4ISI = j;
        }

        public final int getSupported() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final int getSource() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final long getTimestampMillis() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
