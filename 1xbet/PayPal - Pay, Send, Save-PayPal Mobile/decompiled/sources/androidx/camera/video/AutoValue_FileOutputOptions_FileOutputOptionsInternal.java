package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_FileOutputOptions_FileOutputOptionsInternal extends androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal {
    private final java.io.File getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final long getHighSpeedVideoFpsRangesFor;
    private final android.location.Location getHighSpeedVideoSizes;

    /* synthetic */ AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j, long j2, android.location.Location location, java.io.File file, byte b) {
        this(j, j2, location, file);
    }

    private AutoValue_FileOutputOptions_FileOutputOptionsInternal(long j, long j2, android.location.Location location, java.io.File file) {
        this.getHighSpeedVideoFpsRangesFor = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighSpeedVideoSizes = location;
        this.getHighResolutionOutputSizeshNQ4ISI = file;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final android.location.Location getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal
    final java.io.File getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FileOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", durationLimitMillis=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", location=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", file=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal)) {
            return false;
        }
        androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal fileOutputOptionsInternal = (androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal) obj;
        if (this.getHighSpeedVideoFpsRangesFor != fileOutputOptionsInternal.Camera2StreamConfigurationMap() || this.getHighSpeedVideoFpsRanges != fileOutputOptionsInternal.getHighResolutionOutputSizeshNQ4ISI()) {
            return false;
        }
        android.location.Location location = this.getHighSpeedVideoSizes;
        if (location == null) {
            if (fileOutputOptionsInternal.getHighSpeedVideoFpsRangesFor() != null) {
                return false;
            }
        } else if (!location.equals(fileOutputOptionsInternal.getHighSpeedVideoFpsRangesFor())) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI.equals(fileOutputOptionsInternal.getHighSpeedVideoFpsRanges());
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.getHighSpeedVideoFpsRanges;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        android.location.Location location = this.getHighSpeedVideoSizes;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    static final class Builder extends androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder {
        private android.location.Location Camera2StreamConfigurationMap;
        private java.lang.Long getHighSpeedVideoFpsRanges;
        private java.io.File getHighSpeedVideoFpsRangesFor;
        private java.lang.Long getHighSpeedVideoSizes;

        Builder() {
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder getHighResolutionOutputSizeshNQ4ISI(java.io.File file) {
            if (file == null) {
                throw new java.lang.NullPointerException("Null file");
            }
            this.getHighSpeedVideoFpsRangesFor = file;
            return this;
        }

        @Override // androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder
        final androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal getHighSpeedVideoFpsRangesFor() {
            java.lang.String str;
            if (this.getHighSpeedVideoSizes != null) {
                str = "";
            } else {
                str = " fileSizeLimit";
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" durationLimitMillis");
                str = sb.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" file");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.AutoValue_FileOutputOptions_FileOutputOptionsInternal(this.getHighSpeedVideoSizes.longValue(), this.getHighSpeedVideoFpsRanges.longValue(), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder Camera2StreamConfigurationMap(long j) {
            this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* bridge */ /* synthetic */ androidx.camera.video.FileOutputOptions.FileOutputOptionsInternal.Builder getHighSpeedVideoSizes(android.location.Location location) {
            this.Camera2StreamConfigurationMap = location;
            return this;
        }
    }
}
