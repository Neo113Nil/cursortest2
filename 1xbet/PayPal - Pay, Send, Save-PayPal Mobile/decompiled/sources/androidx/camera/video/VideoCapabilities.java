package androidx.camera.video;

/* loaded from: classes6.dex */
public interface VideoCapabilities {
    public static final androidx.camera.video.VideoCapabilities EMPTY = new androidx.camera.video.VideoCapabilities() { // from class: androidx.camera.video.VideoCapabilities.1
        @Override // androidx.camera.video.VideoCapabilities
        public boolean isQualitySupported(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
            return false;
        }

        @Override // androidx.camera.video.VideoCapabilities
        public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
            return new java.util.HashSet();
        }

        @Override // androidx.camera.video.VideoCapabilities
        public java.util.List<androidx.camera.video.Quality> getSupportedQualities(androidx.camera.core.DynamicRange dynamicRange) {
            return new java.util.ArrayList();
        }
    };

    default android.util.Size getResolution(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange) {
        return null;
    }

    java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges();

    java.util.List<androidx.camera.video.Quality> getSupportedQualities(androidx.camera.core.DynamicRange dynamicRange);

    boolean isQualitySupported(androidx.camera.video.Quality quality, androidx.camera.core.DynamicRange dynamicRange);

    default boolean isStabilizationSupported() {
        return false;
    }
}
