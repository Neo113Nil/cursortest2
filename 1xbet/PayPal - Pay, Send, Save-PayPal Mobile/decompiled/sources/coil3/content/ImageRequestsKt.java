package coil3.content;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0015\u0010\u0003\u001a\u00020\u0001*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0011\"\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014\"\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u001a\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014\"\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001f\"\u001d\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0013*\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014\"\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0016"}, d2 = {"Lcoil3/request/ImageRequest$Builder;", "", "method", "httpMethod", "(Lcoil3/request/ImageRequest$Builder;Ljava/lang/String;)Lcoil3/request/ImageRequest$Builder;", "Lcoil3/network/NetworkHeaders;", "headers", "httpHeaders", "(Lcoil3/request/ImageRequest$Builder;Lcoil3/network/NetworkHeaders;)Lcoil3/request/ImageRequest$Builder;", "Lcoil3/network/NetworkRequestBody;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.BODY, "httpBody", "(Lcoil3/request/ImageRequest$Builder;Lcoil3/network/NetworkRequestBody;)Lcoil3/request/ImageRequest$Builder;", "Lcoil3/request/ImageRequest;", "getHttpMethod", "(Lcoil3/request/ImageRequest;)Ljava/lang/String;", "Lcoil3/request/Options;", "(Lcoil3/request/Options;)Ljava/lang/String;", "Lcoil3/Extras$Key$Companion;", "Lcoil3/Extras$Key;", "(Lcoil3/Extras$Key$Companion;)Lcoil3/Extras$Key;", "getHighSpeedVideoSizes", "Lcoil3/Extras$Key;", "Camera2StreamConfigurationMap", "getHttpHeaders", "(Lcoil3/request/ImageRequest;)Lcoil3/network/NetworkHeaders;", "(Lcoil3/request/Options;)Lcoil3/network/NetworkHeaders;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHttpBody", "(Lcoil3/request/ImageRequest;)Lcoil3/network/NetworkRequestBody;", "(Lcoil3/request/Options;)Lcoil3/network/NetworkRequestBody;", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageRequestsKt {
    private static final coil3.Extras.Key<java.lang.String> getHighSpeedVideoSizes = new coil3.Extras.Key<>("GET");
    private static final coil3.Extras.Key<coil3.content.NetworkHeaders> getHighSpeedVideoFpsRangesFor = new coil3.Extras.Key<>(coil3.content.NetworkHeaders.EMPTY);
    private static final coil3.Extras.Key<coil3.content.NetworkRequestBody> getHighSpeedVideoFpsRanges = new coil3.Extras.Key<>(null);

    public static final coil3.request.ImageRequest.Builder httpMethod(coil3.request.ImageRequest.Builder builder, java.lang.String str) {
        coil3.Extras.Builder extras = builder.getExtras();
        coil3.Extras.Key<java.lang.String> key = getHighSpeedVideoSizes;
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
        extras.set(key, upperCase);
        return builder;
    }

    public static final java.lang.String getHttpMethod(coil3.view.ImageRequest imageRequest) {
        return (java.lang.String) coil3.ExtrasKt.getExtra(imageRequest, getHighSpeedVideoSizes);
    }

    public static final java.lang.String getHttpMethod(coil3.view.Options options) {
        return (java.lang.String) coil3.ExtrasKt.getExtra(options, getHighSpeedVideoSizes);
    }

    public static final coil3.Extras.Key<java.lang.String> getHttpMethod(coil3.Extras.Key.Companion companion) {
        return getHighSpeedVideoSizes;
    }

    public static final coil3.request.ImageRequest.Builder httpHeaders(coil3.request.ImageRequest.Builder builder, coil3.content.NetworkHeaders networkHeaders) {
        builder.getExtras().set(getHighSpeedVideoFpsRangesFor, networkHeaders);
        return builder;
    }

    public static final coil3.content.NetworkHeaders getHttpHeaders(coil3.view.ImageRequest imageRequest) {
        return (coil3.content.NetworkHeaders) coil3.ExtrasKt.getExtra(imageRequest, getHighSpeedVideoFpsRangesFor);
    }

    public static final coil3.content.NetworkHeaders getHttpHeaders(coil3.view.Options options) {
        return (coil3.content.NetworkHeaders) coil3.ExtrasKt.getExtra(options, getHighSpeedVideoFpsRangesFor);
    }

    public static final coil3.Extras.Key<coil3.content.NetworkHeaders> getHttpHeaders(coil3.Extras.Key.Companion companion) {
        return getHighSpeedVideoFpsRangesFor;
    }

    public static final coil3.request.ImageRequest.Builder httpBody(coil3.request.ImageRequest.Builder builder, coil3.content.NetworkRequestBody networkRequestBody) {
        builder.getExtras().set(getHighSpeedVideoFpsRanges, networkRequestBody);
        return builder;
    }

    public static final coil3.content.NetworkRequestBody getHttpBody(coil3.view.ImageRequest imageRequest) {
        return (coil3.content.NetworkRequestBody) coil3.ExtrasKt.getExtra(imageRequest, getHighSpeedVideoFpsRanges);
    }

    public static final coil3.content.NetworkRequestBody getHttpBody(coil3.view.Options options) {
        return (coil3.content.NetworkRequestBody) coil3.ExtrasKt.getExtra(options, getHighSpeedVideoFpsRanges);
    }

    public static final coil3.Extras.Key<coil3.content.NetworkRequestBody> getHttpBody(coil3.Extras.Key.Companion companion) {
        return getHighSpeedVideoFpsRanges;
    }
}
