package androidx.camera.video;

/* loaded from: classes6.dex */
public final class MediaStoreOutputOptions extends androidx.camera.video.OutputOptions {
    public static final android.content.ContentValues EMPTY_CONTENT_VALUES = new android.content.ContentValues();
    private final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal getHighSpeedVideoFpsRangesFor;

    MediaStoreOutputOptions(androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal mediaStoreOutputOptionsInternal) {
        super(mediaStoreOutputOptionsInternal);
        this.getHighSpeedVideoFpsRangesFor = mediaStoreOutputOptionsInternal;
    }

    public final android.content.ContentResolver getContentResolver() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
    }

    public final android.net.Uri getCollectionUri() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
    }

    public final android.content.ContentValues getContentValues() {
        return this.getHighSpeedVideoFpsRangesFor.getInputFormats();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoFpsRangesFor.toString().replaceFirst("MediaStoreOutputOptionsInternal", "MediaStoreOutputOptions");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.camera.video.MediaStoreOutputOptions) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((androidx.camera.video.MediaStoreOutputOptions) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public static final class Builder extends androidx.camera.video.OutputOptions.Builder<androidx.camera.video.MediaStoreOutputOptions, androidx.camera.video.MediaStoreOutputOptions.Builder> {
        private final androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoSizes;

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setDurationLimitMillis(long j) {
            return super.setDurationLimitMillis(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setFileSizeLimit(long j) {
            return super.setFileSizeLimit(j);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.camera.video.MediaStoreOutputOptions$Builder, java.lang.Object] */
        @Override // androidx.camera.video.OutputOptions.Builder
        public final /* bridge */ /* synthetic */ androidx.camera.video.MediaStoreOutputOptions.Builder setLocation(android.location.Location location) {
            return super.setLocation(location);
        }

        public Builder(android.content.ContentResolver contentResolver, android.net.Uri uri) {
            super(new androidx.camera.video.AutoValue_MediaStoreOutputOptions_MediaStoreOutputOptionsInternal.Builder());
            androidx.core.util.Preconditions.checkNotNull(contentResolver, "Content resolver can't be null.");
            androidx.core.util.Preconditions.checkNotNull(uri, "Collection Uri can't be null.");
            androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder builder = (androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder) this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = builder;
            builder.getHighSpeedVideoFpsRangesFor(contentResolver).Camera2StreamConfigurationMap(uri).getHighSpeedVideoFpsRanges(androidx.camera.video.MediaStoreOutputOptions.EMPTY_CONTENT_VALUES);
        }

        public final androidx.camera.video.MediaStoreOutputOptions.Builder setContentValues(android.content.ContentValues contentValues) {
            androidx.core.util.Preconditions.checkNotNull(contentValues, "Content values can't be null.");
            this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(contentValues);
            return this;
        }

        /* renamed from: build, reason: merged with bridge method [inline-methods] */
        public final androidx.camera.video.MediaStoreOutputOptions m1024build() {
            return new androidx.camera.video.MediaStoreOutputOptions(this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges());
        }
    }

    static abstract class MediaStoreOutputOptionsInternal extends androidx.camera.video.OutputOptions.OutputOptionsInternal {
        abstract android.content.ContentResolver getHighSpeedVideoFpsRanges();

        abstract android.net.Uri getHighSpeedVideoSizes();

        abstract android.content.ContentValues getInputFormats();

        MediaStoreOutputOptionsInternal() {
        }

        static abstract class Builder extends androidx.camera.video.OutputOptions.OutputOptionsInternal.Builder<androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder> {
            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder Camera2StreamConfigurationMap(android.net.Uri uri);

            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoFpsRanges(android.content.ContentValues contentValues);

            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal getHighSpeedVideoFpsRanges();

            abstract androidx.camera.video.MediaStoreOutputOptions.MediaStoreOutputOptionsInternal.Builder getHighSpeedVideoFpsRangesFor(android.content.ContentResolver contentResolver);

            Builder() {
            }
        }
    }
}
