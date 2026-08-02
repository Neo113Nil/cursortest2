package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class VideoRecordEvent {
    private final androidx.camera.video.RecordingStats Camera2StreamConfigurationMap;
    private final androidx.camera.video.OutputOptions getHighSpeedVideoFpsRanges;

    VideoRecordEvent(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
        this.getHighSpeedVideoFpsRanges = (androidx.camera.video.OutputOptions) androidx.core.util.Preconditions.checkNotNull(outputOptions);
        this.Camera2StreamConfigurationMap = (androidx.camera.video.RecordingStats) androidx.core.util.Preconditions.checkNotNull(recordingStats);
    }

    public androidx.camera.video.RecordingStats getRecordingStats() {
        return this.Camera2StreamConfigurationMap;
    }

    public androidx.camera.video.OutputOptions getOutputOptions() {
        return this.getHighSpeedVideoFpsRanges;
    }

    static androidx.camera.video.VideoRecordEvent.Start Camera2StreamConfigurationMap(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
        return new androidx.camera.video.VideoRecordEvent.Start(outputOptions, recordingStats);
    }

    public static final class Start extends androidx.camera.video.VideoRecordEvent {
        Start(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    static androidx.camera.video.VideoRecordEvent.Finalize getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats, androidx.camera.video.OutputResults outputResults) {
        return new androidx.camera.video.VideoRecordEvent.Finalize(outputOptions, recordingStats, outputResults, 0, null);
    }

    static androidx.camera.video.VideoRecordEvent.Finalize getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats, androidx.camera.video.OutputResults outputResults, int i, java.lang.Throwable th) {
        androidx.core.util.Preconditions.checkArgument(i != 0, "An error type is required.");
        return new androidx.camera.video.VideoRecordEvent.Finalize(outputOptions, recordingStats, outputResults, i, th);
    }

    public static final class Finalize extends androidx.camera.video.VideoRecordEvent {
        public static final int ERROR_DURATION_LIMIT_REACHED = 9;
        public static final int ERROR_ENCODING_FAILED = 6;
        public static final int ERROR_FILE_SIZE_LIMIT_REACHED = 2;
        public static final int ERROR_INSUFFICIENT_STORAGE = 3;
        public static final int ERROR_INVALID_OUTPUT_OPTIONS = 5;
        public static final int ERROR_NONE = 0;
        public static final int ERROR_NO_VALID_DATA = 8;
        public static final int ERROR_RECORDER_ERROR = 7;
        public static final int ERROR_RECORDING_GARBAGE_COLLECTED = 10;
        public static final int ERROR_SOURCE_INACTIVE = 4;
        public static final int ERROR_UNKNOWN = 1;
        private final java.lang.Throwable Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoFpsRanges;
        private final androidx.camera.video.OutputResults getHighSpeedVideoSizes;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface VideoRecordError {
        }

        Finalize(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats, androidx.camera.video.OutputResults outputResults, int i, java.lang.Throwable th) {
            super(outputOptions, recordingStats);
            this.getHighSpeedVideoSizes = outputResults;
            this.getHighSpeedVideoFpsRanges = i;
            this.Camera2StreamConfigurationMap = th;
        }

        public final androidx.camera.video.OutputResults getOutputResults() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean hasError() {
            return this.getHighSpeedVideoFpsRanges != 0;
        }

        public final int getError() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public final java.lang.Throwable getCause() {
            return this.Camera2StreamConfigurationMap;
        }

        static java.lang.String Camera2StreamConfigurationMap(int i) {
            switch (i) {
                case 0:
                    return "ERROR_NONE";
                case 1:
                    return "ERROR_UNKNOWN";
                case 2:
                    return "ERROR_FILE_SIZE_LIMIT_REACHED";
                case 3:
                    return "ERROR_INSUFFICIENT_STORAGE";
                case 4:
                    return "ERROR_SOURCE_INACTIVE";
                case 5:
                    return "ERROR_INVALID_OUTPUT_OPTIONS";
                case 6:
                    return "ERROR_ENCODING_FAILED";
                case 7:
                    return "ERROR_RECORDER_ERROR";
                case 8:
                    return "ERROR_NO_VALID_DATA";
                case 9:
                    return "ERROR_DURATION_LIMIT_REACHED";
                case 10:
                    return "ERROR_RECORDING_GARBAGE_COLLECTED";
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown(");
                    sb.append(i);
                    sb.append(")");
                    return sb.toString();
            }
        }
    }

    static androidx.camera.video.VideoRecordEvent.Status getHighResolutionOutputSizeshNQ4ISI(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
        return new androidx.camera.video.VideoRecordEvent.Status(outputOptions, recordingStats);
    }

    public static final class Status extends androidx.camera.video.VideoRecordEvent {
        Status(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    static androidx.camera.video.VideoRecordEvent.Pause getHighSpeedVideoSizes(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
        return new androidx.camera.video.VideoRecordEvent.Pause(outputOptions, recordingStats);
    }

    public static final class Pause extends androidx.camera.video.VideoRecordEvent {
        Pause(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }

    static androidx.camera.video.VideoRecordEvent.Resume getHighSpeedVideoFpsRanges(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
        return new androidx.camera.video.VideoRecordEvent.Resume(outputOptions, recordingStats);
    }

    public static final class Resume extends androidx.camera.video.VideoRecordEvent {
        Resume(androidx.camera.video.OutputOptions outputOptions, androidx.camera.video.RecordingStats recordingStats) {
            super(outputOptions, recordingStats);
        }
    }
}
