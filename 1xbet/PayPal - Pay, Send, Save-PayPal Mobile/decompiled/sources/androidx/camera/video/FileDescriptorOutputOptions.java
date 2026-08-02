package androidx.camera.video;

/* loaded from: classes6.dex */
public final class FileDescriptorOutputOptions extends androidx.camera.video.OutputOptions {
    private final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal getHighSpeedVideoSizes;

    FileDescriptorOutputOptions(androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal) {
        super(fileDescriptorOutputOptionsInternal);
        this.getHighSpeedVideoSizes = fileDescriptorOutputOptionsInternal;
    }

    public final android.os.ParcelFileDescriptor getParcelFileDescriptor() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString().replaceFirst("FileDescriptorOutputOptionsInternal", "FileDescriptorOutputOptions");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.camera.video.FileDescriptorOutputOptions) {
            return this.getHighSpeedVideoSizes.equals(((androidx.camera.video.FileDescriptorOutputOptions) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.FileDescriptorOutputOptions, androidx.camera.video.FileDescriptorOutputOptions.Builder> {
        private final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder getHighSpeedVideoSizes;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setDurationLimitMillis(long j) {
            return super.setDurationLimitMillis(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setFileSizeLimit(long j) {
            return super.setFileSizeLimit(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.FileDescriptorOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.Builder setLocation(android.location.Location location) {
            return super.setLocation(location);
        }

        public Builder(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            super(new androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal.Builder());
            androidx.core.util.Preconditions.checkNotNull(parcelFileDescriptor, "File descriptor can't be null.");
            androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder builder = (androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = builder;
            builder.getHighSpeedVideoFpsRangesFor(parcelFileDescriptor);
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final androidx.camera.video.FileDescriptorOutputOptions m1022build() {
            return new androidx.camera.video.FileDescriptorOutputOptions(this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap());
        }
    }

    static abstract class FileDescriptorOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {
        abstract android.os.ParcelFileDescriptor getHighSpeedVideoFpsRanges();

        FileDescriptorOutputOptionsInternal() {
        }

        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder> {
            abstract androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal Camera2StreamConfigurationMap();

            abstract androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder getHighSpeedVideoFpsRangesFor(android.os.ParcelFileDescriptor parcelFileDescriptor);

            Builder() {
            }
        }
    }
}
