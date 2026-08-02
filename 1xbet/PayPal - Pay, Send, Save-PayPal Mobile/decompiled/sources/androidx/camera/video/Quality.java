package androidx.camera.video;

/* loaded from: classes.dex */
public class Quality {
    private static final java.util.Set<androidx.camera.video.Quality> Camera2StreamConfigurationMap;
    public static final androidx.camera.video.Quality FHD;
    public static final androidx.camera.video.Quality HD;
    public static final androidx.camera.video.Quality HIGHEST;
    public static final androidx.camera.video.Quality LOWEST;
    public static final int QUALITY_SOURCE_HIGH_SPEED = 2;
    public static final int QUALITY_SOURCE_REGULAR = 1;
    public static final androidx.camera.video.Quality SD;
    public static final androidx.camera.video.Quality UHD;
    static final androidx.camera.video.Quality getHighSpeedVideoFpsRanges;
    private static final java.util.List<androidx.camera.video.Quality> getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface QualitySource {
    }

    /* synthetic */ Quality(byte b) {
        this();
    }

    private Quality() {
    }

    static {
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap2 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(4, 2002, "SD", java.util.Collections.unmodifiableList(java.util.Arrays.asList(new android.util.Size(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND), new android.util.Size(640, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND))));
        SD = Camera2StreamConfigurationMap2;
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap3 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(5, androidx.media3.common.PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, "HD", java.util.Collections.singletonList(new android.util.Size(1280, com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.FaceCaptureManager.IDEAL_CAPTURE_HEIGHT)));
        HD = Camera2StreamConfigurationMap3;
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap4 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(6, androidx.media3.common.PlaybackException.ERROR_CODE_IO_BAD_HTTP_STATUS, "FHD", java.util.Collections.singletonList(new android.util.Size(1920, 1080)));
        FHD = Camera2StreamConfigurationMap4;
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap5 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(8, androidx.media3.common.PlaybackException.ERROR_CODE_IO_FILE_NOT_FOUND, "UHD", java.util.Collections.singletonList(new android.util.Size(3840, 2160)));
        UHD = Camera2StreamConfigurationMap5;
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap6 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(0, 2000, "LOWEST", java.util.Collections.emptyList());
        LOWEST = Camera2StreamConfigurationMap6;
        androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap7 = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(1, 2001, "HIGHEST", java.util.Collections.emptyList());
        HIGHEST = Camera2StreamConfigurationMap7;
        getHighSpeedVideoFpsRanges = androidx.camera.video.Quality.ConstantQuality.Camera2StreamConfigurationMap(-1, -1, "NONE", java.util.Collections.emptyList());
        Camera2StreamConfigurationMap = new java.util.HashSet(java.util.Arrays.asList(Camera2StreamConfigurationMap6, Camera2StreamConfigurationMap7, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap5));
        getHighSpeedVideoFpsRangesFor = java.util.Arrays.asList(Camera2StreamConfigurationMap5, Camera2StreamConfigurationMap4, Camera2StreamConfigurationMap3, Camera2StreamConfigurationMap2);
    }

    static boolean getHighSpeedVideoFpsRangesFor(androidx.camera.video.Quality quality) {
        return Camera2StreamConfigurationMap.contains(quality);
    }

    public static java.util.List<androidx.camera.video.Quality> getSortedQualities() {
        return new java.util.ArrayList(getHighSpeedVideoFpsRangesFor);
    }

    /* loaded from: classes6.dex */
    public static abstract class ConstantQuality extends androidx.camera.video.Quality {
        abstract int Camera2StreamConfigurationMap();

        abstract int getHighResolutionOutputSizeshNQ4ISI();

        public abstract java.lang.String getName();

        public abstract java.util.List<android.util.Size> getTypicalSizes();

        public ConstantQuality() {
            super((byte) 0);
        }

        static androidx.camera.video.Quality.ConstantQuality Camera2StreamConfigurationMap(int i, int i2, java.lang.String str, java.util.List<android.util.Size> list) {
            return new androidx.camera.video.AutoValue_Quality_ConstantQuality(i, i2, str, list);
        }

        public int getQualityValue(int i) {
            if (i == 1) {
                return Camera2StreamConfigurationMap();
            }
            if (i == 2) {
                return getHighResolutionOutputSizeshNQ4ISI();
            }
            throw new java.lang.AssertionError("Unknown quality source: ".concat(java.lang.String.valueOf(i)));
        }
    }
}
