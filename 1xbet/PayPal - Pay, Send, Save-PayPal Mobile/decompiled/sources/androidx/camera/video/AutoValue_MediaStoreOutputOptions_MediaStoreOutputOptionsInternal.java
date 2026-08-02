package androidx.camera.video;

/* loaded from: classes6.dex */
final class AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal extends androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal {
    private final android.content.ContentResolver Camera2StreamConfigurationMap;
    private final android.net.Uri getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRanges;
    private final android.content.ContentValues getHighSpeedVideoFpsRangesFor;
    private final long getHighSpeedVideoSizes;
    private final android.location.Location getInputFormats;

    /* synthetic */ AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long j, long j2, android.location.Location location, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues, byte b) {
        this(j, j2, location, contentResolver, uri, contentValues);
    }

    private AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(long j, long j2, android.location.Location location, android.content.ContentResolver contentResolver, android.net.Uri uri, android.content.ContentValues contentValues) {
        this.getHighSpeedVideoFpsRanges = j;
        this.getHighSpeedVideoSizes = j2;
        this.getInputFormats = location;
        this.Camera2StreamConfigurationMap = contentResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = uri;
        this.getHighSpeedVideoFpsRangesFor = contentValues;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final long getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal
    final android.location.Location getHighSpeedVideoFpsRangesFor() {
        return this.getInputFormats;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final android.content.ContentResolver getHighSpeedVideoFpsRanges() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final android.net.Uri getHighSpeedVideoSizes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal
    final android.content.ContentValues getInputFormats() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MediaStoreOutputOptionsInternal{fileSizeLimit=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", durationLimitMillis=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", location=");
        sb.append(this.getInputFormats);
        sb.append(", contentResolver=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", collectionUri=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", contentValues=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal)) {
            return false;
        }
        androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal = (androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal) obj;
        if (this.getHighSpeedVideoFpsRanges != mediaStoreOutputOptionsInternal.Camera2StreamConfigurationMap() || this.getHighSpeedVideoSizes != mediaStoreOutputOptionsInternal.getHighResolutionOutputSizeshNQ4ISI()) {
            return false;
        }
        android.location.Location location = this.getInputFormats;
        if (location == null) {
            if (mediaStoreOutputOptionsInternal.getHighSpeedVideoFpsRangesFor() != null) {
                return false;
            }
        } else if (!location.equals(mediaStoreOutputOptionsInternal.getHighSpeedVideoFpsRangesFor())) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.equals(mediaStoreOutputOptionsInternal.getHighSpeedVideoFpsRanges()) && this.getHighResolutionOutputSizeshNQ4ISI.equals(mediaStoreOutputOptionsInternal.getHighSpeedVideoSizes()) && this.getHighSpeedVideoFpsRangesFor.equals(mediaStoreOutputOptionsInternal.getInputFormats());
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoFpsRanges;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.getHighSpeedVideoSizes;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        android.location.Location location = this.getInputFormats;
        return ((((((((((i ^ 1000003) * 1000003) ^ i2) * 1000003) ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.Camera2StreamConfigurationMap.hashCode()) * 1000003) ^ this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 1000003) ^ this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    static final class Builder extends androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder {
        private android.content.ContentResolver Camera2StreamConfigurationMap;
        private java.lang.Long getHighResolutionOutputSizeshNQ4ISI;
        private android.content.ContentValues getHighSpeedVideoFpsRanges;
        private android.net.Uri getHighSpeedVideoFpsRangesFor;
        private java.lang.Long getHighSpeedVideoSizes;
        private android.location.Location getOutputFormats;

        Builder() {
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoFpsRangesFor(android.content.ContentResolver contentResolver) {
            if (contentResolver == null) {
                throw new java.lang.NullPointerException("Null contentResolver");
            }
            this.Camera2StreamConfigurationMap = contentResolver;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder Camera2StreamConfigurationMap(android.net.Uri uri) {
            if (uri == null) {
                throw new java.lang.NullPointerException("Null collectionUri");
            }
            this.getHighSpeedVideoFpsRangesFor = uri;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoFpsRanges(android.content.ContentValues contentValues) {
            if (contentValues == null) {
                throw new java.lang.NullPointerException("Null contentValues");
            }
            this.getHighSpeedVideoFpsRanges = contentValues;
            return this;
        }

        @Override // androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder
        final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal getHighSpeedVideoFpsRanges() {
            java.lang.String str;
            if (this.getHighResolutionOutputSizeshNQ4ISI != null) {
                str = "";
            } else {
                str = " fileSizeLimit";
            }
            if (this.getHighSpeedVideoSizes == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" durationLimitMillis");
                str = sb.toString();
            }
            if (this.Camera2StreamConfigurationMap == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" contentResolver");
                str = sb2.toString();
            }
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                sb3.append(str);
                sb3.append(" collectionUri");
                str = sb3.toString();
            }
            if (this.getHighSpeedVideoFpsRanges == null) {
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(str);
                sb4.append(" contentValues");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal(this.getHighResolutionOutputSizeshNQ4ISI.longValue(), this.getHighSpeedVideoSizes.longValue(), this.getOutputFormats, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, (byte) 0);
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder Camera2StreamConfigurationMap(long j) {
            this.getHighSpeedVideoSizes = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighResolutionOutputSizeshNQ4ISI(long j) {
            this.getHighResolutionOutputSizeshNQ4ISI = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder
        final /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoSizes(android.location.Location location) {
            this.getOutputFormats = location;
            return this;
        }
    }
}
