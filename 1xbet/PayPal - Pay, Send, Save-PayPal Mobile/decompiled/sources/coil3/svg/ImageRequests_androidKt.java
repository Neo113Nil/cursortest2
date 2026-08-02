package coil3.svg;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\b\"\u001d\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n*\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000b\"\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcoil3/request/ImageRequest$Builder;", "", "css", "(Lcoil3/request/ImageRequest$Builder;Ljava/lang/String;)Lcoil3/request/ImageRequest$Builder;", "Lcoil3/request/ImageRequest;", "getCss", "(Lcoil3/request/ImageRequest;)Ljava/lang/String;", "Lcoil3/request/Options;", "(Lcoil3/request/Options;)Ljava/lang/String;", "Lcoil3/Extras$Key$Companion;", "Lcoil3/Extras$Key;", "(Lcoil3/Extras$Key$Companion;)Lcoil3/Extras$Key;", "getHighSpeedVideoSizes", "Lcoil3/Extras$Key;", "getHighSpeedVideoFpsRangesFor"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageRequests_androidKt {
    private static final coil3.Extras.Key<java.lang.String> getHighSpeedVideoSizes = new coil3.Extras.Key<>(null);

    public static final coil3.request.ImageRequest.Builder css(coil3.request.ImageRequest.Builder builder, java.lang.String str) {
        builder.memoryCacheKeyExtra("coil#css", str);
        builder.getExtras().set(getHighSpeedVideoSizes, str);
        return builder;
    }

    public static final java.lang.String getCss(coil3.view.ImageRequest imageRequest) {
        return (java.lang.String) coil3.ExtrasKt.getExtra(imageRequest, getHighSpeedVideoSizes);
    }

    public static final java.lang.String getCss(coil3.view.Options options) {
        return (java.lang.String) coil3.ExtrasKt.getExtra(options, getHighSpeedVideoSizes);
    }

    public static final coil3.Extras.Key<java.lang.String> getCss(coil3.Extras.Key.Companion companion) {
        return getHighSpeedVideoSizes;
    }
}
