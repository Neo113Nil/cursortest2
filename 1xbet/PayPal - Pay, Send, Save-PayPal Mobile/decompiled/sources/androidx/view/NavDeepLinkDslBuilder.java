package androidx.view;

@androidx.view.NavDeepLinkDsl
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B:\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u001b\u0010\f\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\r\u0012\u000b\u0012\u0002\b\u00030\n¢\u0006\u0002\b\u000b0\b¢\u0006\u0004\b\u0002\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR.\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001e"}, d2 = {"Landroidx/navigation/NavDeepLinkDslBuilder;", "", "<init>", "()V", "", "basePath", "Lkotlin/reflect/KClass;", "route", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "typeMap", "(Ljava/lang/String;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "Landroidx/navigation/NavDeepLink;", "build$navigation_common_release", "()Landroidx/navigation/NavDeepLink;", "Landroidx/navigation/NavDeepLink$Builder;", "Camera2StreamConfigurationMap", "Landroidx/navigation/NavDeepLink$Builder;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lkotlin/reflect/KClass;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "uriPattern", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "setUriPattern", "(Ljava/lang/String;)V", "p", "action", "getAction", "setAction", com.datadog.android.sessionreplay.internal.processor.EnrichedResource.MIME_TYPE, "getMimeType", "setMimeType"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavDeepLinkDslBuilder {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.navigation.NavDeepLink.Builder getHighSpeedVideoFpsRangesFor;
    private java.lang.String action;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private java.util.Map<kotlin.reflect.KType, ? extends androidx.view.NavType<?>> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlin.reflect.KClass<?> getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.String mimeType;
    private java.lang.String uriPattern;

    public NavDeepLinkDslBuilder() {
        this.getHighSpeedVideoFpsRangesFor = new androidx.navigation.NavDeepLink.Builder();
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.emptyMap();
    }

    public NavDeepLinkDslBuilder(java.lang.String str, kotlin.reflect.KClass<?> kClass, java.util.Map<kotlin.reflect.KType, androidx.view.NavType<?>> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoFpsRangesFor = new androidx.navigation.NavDeepLink.Builder();
        this.Camera2StreamConfigurationMap = kotlin.collections.MapsKt.emptyMap();
        if (str.length() <= 0) {
            throw new java.lang.IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty".toString());
        }
        this.uriPattern = androidx.view.serialization.RouteSerializerKt.generateRoutePattern(kotlinx.serialization.SerializersKt.serializer(kClass), map, str);
        this.getHighResolutionOutputSizeshNQ4ISI = kClass;
        this.Camera2StreamConfigurationMap = map;
    }

    public final java.lang.String getUriPattern() {
        return this.uriPattern;
    }

    public final void setUriPattern(java.lang.String str) {
        this.uriPattern = str;
    }

    public final java.lang.String getAction() {
        return this.action;
    }

    public final void setAction(java.lang.String str) {
        if (str != null && str.length() == 0) {
            throw new java.lang.IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.action = str;
    }

    public final java.lang.String getMimeType() {
        return this.mimeType;
    }

    public final void setMimeType(java.lang.String str) {
        this.mimeType = str;
    }

    public final androidx.view.NavDeepLink build$navigation_common_release() {
        androidx.navigation.NavDeepLink.Builder builder = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str = this.uriPattern;
        if (str == null && this.action == null && this.mimeType == null) {
            throw new java.lang.IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
        }
        if (str != null) {
            builder.setUriPattern(str);
        }
        java.lang.String str2 = this.action;
        if (str2 != null) {
            builder.setAction(str2);
        }
        java.lang.String str3 = this.mimeType;
        if (str3 != null) {
            builder.setMimeType(str3);
        }
        return builder.build();
    }
}
