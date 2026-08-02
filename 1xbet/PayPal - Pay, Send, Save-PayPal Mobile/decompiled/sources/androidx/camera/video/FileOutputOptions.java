package androidx.camera.video;

/* loaded from: classes6.dex */
public final class FileOutputOptions extends androidx.camera.video.OutputOptions {
    private final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal getHighSpeedVideoFpsRanges;

    FileOutputOptions(androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal) {
        super(fileOutputOptionsInternal);
        this.getHighSpeedVideoFpsRanges = fileOutputOptionsInternal;
    }

    public final java.io.File getFile() {
        return this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRanges.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.camera.video.FileOutputOptions) {
            return this.getHighSpeedVideoFpsRanges.equals(((androidx.camera.video.FileOutputOptions) obj).getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRanges.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.FileOutputOptions, androidx.camera.video.FileOutputOptions.Builder> {
        private final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setDurationLimitMillis(long j) {
            return super.setDurationLimitMillis(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setFileSizeLimit(long j) {
            return super.setFileSizeLimit(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.Builder setLocation(android.location.Location location) {
            return super.setLocation(location);
        }

        public Builder(java.io.File file) {
            super(new androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal.Builder());
            androidx.core.util.Preconditions.checkNotNull(file, "File can't be null.");
            androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder builder = (androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor = builder;
            builder.getHighResolutionOutputSizeshNQ4ISI(file);
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final androidx.camera.video.FileOutputOptions m1023build() {
            return new androidx.camera.video.FileOutputOptions(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor());
        }
    }

    static abstract class FileOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {
        abstract java.io.File getHighSpeedVideoFpsRanges();

        FileOutputOptionsInternal() {
        }

        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder> {
            abstract androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder getHighResolutionOutputSizeshNQ4ISI(java.io.File file);

            abstract androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal getHighSpeedVideoFpsRangesFor();

            Builder() {
            }
        }
    }
}
