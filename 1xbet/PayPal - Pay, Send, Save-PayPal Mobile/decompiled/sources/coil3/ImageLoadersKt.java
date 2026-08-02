package coil3;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\"\u0018\u0010\t\u001a\u00020\u0007*\u00020\u000b8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Lcoil3/ImageLoader;", "ImageLoader", "(Landroid/content/Context;)Lcoil3/ImageLoader;", "Lcoil3/ImageLoader$Builder;", "", "enable", "serviceLoaderEnabled", "(Lcoil3/ImageLoader$Builder;Z)Lcoil3/ImageLoader$Builder;", "Lcoil3/RealImageLoader$Options;", "getServiceLoaderEnabled", "(Lcoil3/RealImageLoader$Options;)Z", "Lcoil3/Extras$Key;", "getHighSpeedVideoFpsRanges", "Lcoil3/Extras$Key;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ImageLoadersKt {
    private static final coil3.Extras.Key<java.lang.Boolean> getHighSpeedVideoFpsRanges = new coil3.Extras.Key<>(java.lang.Boolean.TRUE);

    public static final coil3.ImageLoader ImageLoader(android.content.Context context) {
        return new coil3.ImageLoader.Builder(context).build();
    }

    public static final coil3.ImageLoader.Builder serviceLoaderEnabled(coil3.ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(getHighSpeedVideoFpsRanges, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getServiceLoaderEnabled(coil3.RealImageLoader.Options options) {
        return ((java.lang.Boolean) coil3.ExtrasKt.getOrDefault(options.getDefaults().getExtras(), getHighSpeedVideoFpsRanges)).booleanValue();
    }
}
