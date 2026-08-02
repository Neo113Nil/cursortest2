package coil3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0003\u001a\u00020\u0001*\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0018\u0010\u0007\u001a\u00020\u0005*\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0016\"\u0018\u0010\u000f\u001a\u00020\r*\u00020\u00118AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\"\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016"}, d2 = {"Lcoil3/ImageLoader$Builder;", "", "maxParallelism", "bitmapFactoryMaxParallelism", "(Lcoil3/ImageLoader$Builder;I)Lcoil3/ImageLoader$Builder;", "Lcoil3/decode/ExifOrientationStrategy;", "strategy", "bitmapFactoryExifOrientationStrategy", "(Lcoil3/ImageLoader$Builder;Lcoil3/decode/ExifOrientationStrategy;)Lcoil3/ImageLoader$Builder;", "", "enabled", "imageDecoderEnabled", "(Lcoil3/ImageLoader$Builder;Z)Lcoil3/ImageLoader$Builder;", "", "percent", "memoryCacheMaxSizePercentWhileInBackground", "(Lcoil3/ImageLoader$Builder;D)Lcoil3/ImageLoader$Builder;", "Lcoil3/RealImageLoader$Options;", "getBitmapFactoryMaxParallelism", "(Lcoil3/RealImageLoader$Options;)I", "Lcoil3/Extras$Key;", "getHighSpeedVideoFpsRanges", "Lcoil3/Extras$Key;", "getHighResolutionOutputSizeshNQ4ISI", "getBitmapFactoryExifOrientationStrategy", "(Lcoil3/RealImageLoader$Options;)Lcoil3/decode/ExifOrientationStrategy;", "getHighSpeedVideoFpsRangesFor", "getImageDecoderEnabled", "(Lcoil3/RealImageLoader$Options;)Z", "getHighSpeedVideoSizes", "getMemoryCacheMaxSizePercentWhileInBackground", "(Lcoil3/RealImageLoader$Options;)D", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoaders_androidKt {
    private static final coil3.Extras.Key<java.lang.Integer> getHighSpeedVideoFpsRanges = new coil3.Extras.Key<>(4);
    private static final coil3.Extras.Key<coil3.graphics.ExifOrientationStrategy> getHighResolutionOutputSizeshNQ4ISI = new coil3.Extras.Key<>(coil3.graphics.ExifOrientationStrategy.RESPECT_PERFORMANCE);
    private static final coil3.Extras.Key<java.lang.Boolean> getHighSpeedVideoSizes = new coil3.Extras.Key<>(java.lang.Boolean.TRUE);
    private static final coil3.Extras.Key<java.lang.Double> Camera2StreamConfigurationMap = new coil3.Extras.Key<>(java.lang.Double.valueOf(1.0d));

    public static final coil3.ImageLoader.Builder bitmapFactoryMaxParallelism(coil3.ImageLoader.Builder builder, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("maxParallelism must be > 0.".toString());
        }
        builder.getExtras().set(getHighSpeedVideoFpsRanges, java.lang.Integer.valueOf(i));
        return builder;
    }

    public static final int getBitmapFactoryMaxParallelism(coil3.RealImageLoader.Options options) {
        return ((java.lang.Number) coil3.ExtrasKt.getOrDefault(options.getDefaults().getExtras(), getHighSpeedVideoFpsRanges)).intValue();
    }

    public static final coil3.ImageLoader.Builder bitmapFactoryExifOrientationStrategy(coil3.ImageLoader.Builder builder, coil3.graphics.ExifOrientationStrategy exifOrientationStrategy) {
        builder.getExtras().set(getHighResolutionOutputSizeshNQ4ISI, exifOrientationStrategy);
        return builder;
    }

    public static final coil3.graphics.ExifOrientationStrategy getBitmapFactoryExifOrientationStrategy(coil3.RealImageLoader.Options options) {
        return (coil3.graphics.ExifOrientationStrategy) coil3.ExtrasKt.getOrDefault(options.getDefaults().getExtras(), getHighResolutionOutputSizeshNQ4ISI);
    }

    public static final coil3.ImageLoader.Builder imageDecoderEnabled(coil3.ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(getHighSpeedVideoSizes, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getImageDecoderEnabled(coil3.RealImageLoader.Options options) {
        return ((java.lang.Boolean) coil3.ExtrasKt.getOrDefault(options.getDefaults().getExtras(), getHighSpeedVideoSizes)).booleanValue();
    }

    public static final coil3.ImageLoader.Builder memoryCacheMaxSizePercentWhileInBackground(coil3.ImageLoader.Builder builder, double d) {
        if (0.0d > d || d > 1.0d) {
            throw new java.lang.IllegalArgumentException("percent must be in the range [0.0, 1.0].".toString());
        }
        builder.getExtras().set(Camera2StreamConfigurationMap, java.lang.Double.valueOf(d));
        return builder;
    }

    public static final double getMemoryCacheMaxSizePercentWhileInBackground(coil3.RealImageLoader.Options options) {
        return ((java.lang.Number) coil3.ExtrasKt.getOrDefault(options.getDefaults().getExtras(), Camera2StreamConfigurationMap)).doubleValue();
    }
}
