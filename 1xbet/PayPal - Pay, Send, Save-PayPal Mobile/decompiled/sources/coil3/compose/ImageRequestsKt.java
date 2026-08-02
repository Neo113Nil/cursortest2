package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\"\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\b8G¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\"!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\u00020\r8G¢\u0006\f\u0012\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u000f\"\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001b\u0010\u0007\u001a\u00020\u0001*\u00020\b8G¢\u0006\f\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0014\u0010\n\"!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e*\u00020\r8G¢\u0006\f\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u000e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012"}, d2 = {"Lcoil3/request/ImageRequest$Builder;", "", "enable", "useExistingImageAsPlaceholder", "(Lcoil3/request/ImageRequest$Builder;Z)Lcoil3/request/ImageRequest$Builder;", "Lcoil3/ImageLoader$Builder;", "(Lcoil3/ImageLoader$Builder;Z)Lcoil3/ImageLoader$Builder;", "preferEndFirstIntrinsicSize", "Lcoil3/request/ImageRequest;", "getUseExistingImageAsPlaceholder", "(Lcoil3/request/ImageRequest;)Z", "getUseExistingImageAsPlaceholder$annotations", "(Lcoil3/request/ImageRequest;)V", "Lcoil3/Extras$Key$Companion;", "Lcoil3/Extras$Key;", "(Lcoil3/Extras$Key$Companion;)Lcoil3/Extras$Key;", "(Lcoil3/Extras$Key$Companion;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/Extras$Key;", "getHighSpeedVideoFpsRanges", "getPreferEndFirstIntrinsicSize", "getPreferEndFirstIntrinsicSize$annotations", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageRequestsKt {
    private static final coil3.Extras.Key<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;
    private static final coil3.Extras.Key<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(coil3.Extras.Key.Companion companion) {
    }

    public static /* synthetic */ void getPreferEndFirstIntrinsicSize$annotations(coil3.view.ImageRequest imageRequest) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(coil3.Extras.Key.Companion companion) {
    }

    public static /* synthetic */ void getUseExistingImageAsPlaceholder$annotations(coil3.view.ImageRequest imageRequest) {
    }

    public static final coil3.request.ImageRequest.Builder useExistingImageAsPlaceholder(coil3.request.ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(getHighResolutionOutputSizeshNQ4ISI, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final coil3.ImageLoader.Builder useExistingImageAsPlaceholder(coil3.ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(getHighResolutionOutputSizeshNQ4ISI, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getUseExistingImageAsPlaceholder(coil3.view.ImageRequest imageRequest) {
        return ((java.lang.Boolean) coil3.ExtrasKt.getExtra(imageRequest, getHighResolutionOutputSizeshNQ4ISI)).booleanValue();
    }

    public static final coil3.Extras.Key<java.lang.Boolean> getUseExistingImageAsPlaceholder(coil3.Extras.Key.Companion companion) {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        getHighResolutionOutputSizeshNQ4ISI = new coil3.Extras.Key<>(bool);
        getHighSpeedVideoFpsRangesFor = new coil3.Extras.Key<>(bool);
    }

    public static final coil3.request.ImageRequest.Builder preferEndFirstIntrinsicSize(coil3.request.ImageRequest.Builder builder, boolean z) {
        builder.getExtras().set(getHighSpeedVideoFpsRangesFor, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final coil3.ImageLoader.Builder preferEndFirstIntrinsicSize(coil3.ImageLoader.Builder builder, boolean z) {
        builder.getExtras().set(getHighSpeedVideoFpsRangesFor, java.lang.Boolean.valueOf(z));
        return builder;
    }

    public static final boolean getPreferEndFirstIntrinsicSize(coil3.view.ImageRequest imageRequest) {
        return ((java.lang.Boolean) coil3.ExtrasKt.getExtra(imageRequest, getHighSpeedVideoFpsRangesFor)).booleanValue();
    }

    public static final coil3.Extras.Key<java.lang.Boolean> getPreferEndFirstIntrinsicSize(coil3.Extras.Key.Companion companion) {
        return getHighSpeedVideoFpsRangesFor;
    }
}
