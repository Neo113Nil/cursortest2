package androidx.camera.video;

/* loaded from: classes6.dex */
public class FallbackStrategy {
    static final androidx.camera.video.FallbackStrategy getHighSpeedVideoSizes = new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy(androidx.camera.video.Quality.getHighSpeedVideoFpsRanges, 0);

    /* synthetic */ FallbackStrategy(byte b) {
        this();
    }

    private FallbackStrategy() {
    }

    public static androidx.camera.video.FallbackStrategy higherQualityOrLowerThan(androidx.camera.video.Quality quality) {
        return new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy(quality, 1);
    }

    public static androidx.camera.video.FallbackStrategy higherQualityThan(androidx.camera.video.Quality quality) {
        return new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy(quality, 2);
    }

    public static androidx.camera.video.FallbackStrategy lowerQualityOrHigherThan(androidx.camera.video.Quality quality) {
        return new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy(quality, 3);
    }

    public static androidx.camera.video.FallbackStrategy lowerQualityThan(androidx.camera.video.Quality quality) {
        return new androidx.camera.video.AutoValue_FallbackStrategy_RuleStrategy(quality, 4);
    }

    static abstract class RuleStrategy extends androidx.camera.video.FallbackStrategy {
        abstract androidx.camera.video.Quality getHighSpeedVideoFpsRangesFor();

        abstract int getHighSpeedVideoSizes();

        RuleStrategy() {
            super((byte) 0);
        }
    }
}
