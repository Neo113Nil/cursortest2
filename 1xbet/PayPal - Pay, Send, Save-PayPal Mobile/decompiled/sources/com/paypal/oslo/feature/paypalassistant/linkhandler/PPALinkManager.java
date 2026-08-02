package com.paypal.oslo.feature.paypalassistant.linkhandler;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/linkhandler/PPALinkManager;", "Lcom/paypal/oslo/feature/paypalassistant/api/linkhandler/LinkManager;", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/WebSchemeHandler;", "webViewHandler", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/FallbackSchemeHandler;", "fallbackHandler", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "<init>", "(Lcom/paypal/oslo/feature/paypalassistant/linkhandler/WebSchemeHandler;Lcom/paypal/oslo/feature/paypalassistant/linkhandler/FallbackSchemeHandler;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "url", "", "onLinkClick", "(Ljava/lang/String;)V", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/WebSchemeHandler;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/FallbackSchemeHandler;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/SchemeHandler;", "getHighSpeedVideoSizes", "Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PPALinkManager implements com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public PPALinkManager(com.paypal.oslo.feature.paypalassistant.linkhandler.WebSchemeHandler webSchemeHandler, com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler fallbackSchemeHandler, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webSchemeHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fallbackSchemeHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = webSchemeHandler;
        this.Camera2StreamConfigurationMap = fallbackSchemeHandler;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf(webSchemeHandler);
    }

    @Override // com.paypal.oslo.feature.paypalassistant.api.linkhandler.LinkManager
    public final void onLinkClick(final java.lang.String url) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(url);
        if (highSpeedVideoFpsRangesFor != null) {
            java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler) obj).getSupportedSchemes().contains(highSpeedVideoFpsRangesFor)) {
                        break;
                    }
                }
            }
            com.paypal.oslo.feature.paypalassistant.linkhandler.FallbackSchemeHandler fallbackSchemeHandler = (com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler) obj;
            if (fallbackSchemeHandler == null) {
                fallbackSchemeHandler = this.Camera2StreamConfigurationMap;
            }
            if (fallbackSchemeHandler.handleLink(url) && this.getHighResolutionOutputSizeshNQ4ISI.getSupportedSchemes().contains(highSpeedVideoFpsRangesFor)) {
                this.getHighSpeedVideoFpsRanges.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.paypalassistant.linkhandler.PPALinkManager.$r8$lambda$E9NjD0uEwo3OVznsywWwldb3lEE(url, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj2);
                    }
                });
            }
        }
    }

    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String p0) {
        try {
            java.lang.String scheme = android.net.Uri.parse(p0).getScheme();
            if (scheme != null) {
                java.util.Locale locale = java.util.Locale.ROOT;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
                java.lang.String lowerCase = scheme.toLowerCase(locale);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (lowerCase != null) {
                    return lowerCase;
                }
            }
            return "";
        } catch (java.lang.IllegalArgumentException e) {
            com.paypal.oslo.feature.paypalassistant.LoggerKt.log.w("Failed to parse URL scheme", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e.getMessage())), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", p0)));
            return null;
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$E9NjD0uEwo3OVznsywWwldb3lEE(java.lang.String str, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.paypalassistant.api.navigation.PPAWebViewDestination(str));
        return kotlin.Unit.INSTANCE;
    }
}
