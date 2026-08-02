package androidx.camera.video;

/* loaded from: classes6.dex */
public abstract class OutputOptions {
    public static final int DURATION_UNLIMITED = 0;
    public static final int FILE_SIZE_UNLIMITED = 0;
    private final androidx.camera.video.OutputOptions.OutputOptionsInternal getHighSpeedVideoSizes;

    OutputOptions(androidx.camera.video.OutputOptions.OutputOptionsInternal outputOptionsInternal) {
        this.getHighSpeedVideoSizes = outputOptionsInternal;
    }

    public long getFileSizeLimit() {
        return this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap();
    }

    public android.location.Location getLocation() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor();
    }

    public long getDurationLimitMillis() {
        return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
    }

    static abstract class Builder<T extends androidx.camera.video.OutputOptions, B> {
        final androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<?> getHighResolutionOutputSizeshNQ4ISI;

        Builder(androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<?> builder) {
            this.getHighResolutionOutputSizeshNQ4ISI = builder;
            builder.getHighResolutionOutputSizeshNQ4ISI(0L);
            builder.Camera2StreamConfigurationMap(0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setFileSizeLimit(long j) {
            androidx.core.util.Preconditions.checkArgument(j >= 0, "The specified file size limit can't be negative.");
            this.getHighResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(j);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setDurationLimitMillis(long j) {
            androidx.core.util.Preconditions.checkArgument(j >= 0, "The specified duration limit can't be negative.");
            this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(j);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public B setLocation(android.location.Location location) {
            if (location != null) {
                androidx.core.util.Preconditions.checkArgument(location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d, "Latitude must be in the range [-90, 90]");
                androidx.core.util.Preconditions.checkArgument(location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d, "Longitude must be in the range [-180, 180]");
            }
            this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoSizes(location);
            return this;
        }
    }

    static abstract class OutputOptionsInternal {
        abstract long Camera2StreamConfigurationMap();

        abstract long getHighResolutionOutputSizeshNQ4ISI();

        abstract android.location.Location getHighSpeedVideoFpsRangesFor();

        OutputOptionsInternal() {
        }

        static abstract class Builder<B> {
            abstract B Camera2StreamConfigurationMap(long j);

            abstract B getHighResolutionOutputSizeshNQ4ISI(long j);

            abstract B getHighSpeedVideoSizes(android.location.Location location);

            Builder() {
            }
        }
    }
}
