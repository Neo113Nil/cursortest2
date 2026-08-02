package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal extends androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal {
    private final long Camera2StreamConfigurationMap;
    private final long getHighSpeedVideoFpsRanges;
    private final android.location.Location getHighSpeedVideoFpsRangesFor;
    private final android.os.ParcelFileDescriptor getHighSpeedVideoSizes;

    /* synthetic */ AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(long j, long j2, android.location.Location location, android.os.ParcelFileDescriptor parcelFileDescriptor, byte b) {
        this(j, j2, location, parcelFileDescriptor);
    }

    private AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(long j, long j2, android.location.Location location, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.getHighSpeedVideoFpsRanges = j;
        this.Camera2StreamConfigurationMap = j2;
        this.getHighSpeedVideoFpsRangesFor = location;
        this.getHighSpeedVideoSizes = parcelFileDescriptor;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final android.location.Location getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal
    final android.os.ParcelFileDescriptor getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FileDescriptorOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", durationLimitMillis=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", location=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", parcelFileDescriptor=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal)) {
            return false;
        }
        androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal fileDescriptorOutputOptionsInternal = (androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal) obj;
        if (this.getHighSpeedVideoFpsRanges != fileDescriptorOutputOptionsInternal.Camera2StreamConfigurationMap() || this.Camera2StreamConfigurationMap != fileDescriptorOutputOptionsInternal.getHighResolutionOutputSizeshNQ4ISI()) {
            return false;
        }
        android.location.Location location = this.getHighSpeedVideoFpsRangesFor;
        if (location == null) {
            if (fileDescriptorOutputOptionsInternal.getHighSpeedVideoFpsRangesFor() != null) {
                return false;
            }
        } else if (!location.equals(fileDescriptorOutputOptionsInternal.getHighSpeedVideoFpsRangesFor())) {
            return false;
        }
        return this.getHighSpeedVideoSizes.equals(fileDescriptorOutputOptionsInternal.getHighSpeedVideoFpsRanges());
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoFpsRanges;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.Camera2StreamConfigurationMap;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        android.location.Location location = this.getHighSpeedVideoFpsRangesFor;
        return ((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.getHighSpeedVideoSizes.hashCode();
    }

    static final class Builder extends androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder {
        private android.location.Location Camera2StreamConfigurationMap;
        private android.os.ParcelFileDescriptor getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.Long getHighSpeedVideoFpsRanges;
        private java.lang.Long getHighSpeedVideoFpsRangesFor;

        Builder() {
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder getHighSpeedVideoFpsRangesFor(android.os.ParcelFileDescriptor parcelFileDescriptor) {
            if (parcelFileDescriptor == null) {
                throw new java.lang.NullPointerException("Null parcelFileDescriptor");
            }
            this.getHighResolutionOutputSizeshNQ4ISI = parcelFileDescriptor;
            return this;
        }

        @Override // androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder
        final androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal Camera2StreamConfigurationMap() {
            java.lang.String str;
            if (this.getHighSpeedVideoFpsRangesFor != null) {
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
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" parcelFileDescriptor");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.AutoValue_FileDescriptorOutputOptions_FileDescriptorOutputOptionsInternal(this.getHighSpeedVideoFpsRangesFor.longValue(), this.getHighSpeedVideoFpsRanges.longValue(), this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, (byte) 0);
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder Camera2StreamConfigurationMap(long j) {
            this.getHighSpeedVideoFpsRanges = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* bridge */ /* synthetic */ androidx.camera.video.FileDescriptorOutputOptions.FileDescriptorOutputOptionsInternal.Builder getHighSpeedVideoSizes(android.location.Location location) {
            this.Camera2StreamConfigurationMap = location;
            return this;
        }
    }
}
