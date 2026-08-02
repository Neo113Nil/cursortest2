package com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/taxdocuments/navigation/DeeplinkNavigationHandler;", "", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "deeplinkResolver", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "", "url", "", "navigate", "(Ljava/lang/String;)Z", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/deeplink/DeeplinkResolver;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeeplinkNavigationHandler {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.deeplink.DeeplinkResolver getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoSizes;

    @javax.inject.Inject
    public DeeplinkNavigationHandler(com.paypal.oslo.core.deeplink.DeeplinkResolver deeplinkResolver, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deeplinkResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = deeplinkResolver;
        this.getHighSpeedVideoSizes = appNavigator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0053, code lost:
    
        if (r10 == null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean navigate(java.lang.String url) {
        java.lang.String concat;
        java.lang.String query;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        boolean z = false;
        if (!kotlin.text.StringsKt.startsWith$default(url, androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR, false, 2, (java.lang.Object) null)) {
            android.net.Uri parse = android.net.Uri.parse(url);
            java.lang.String path = parse.getPath();
            if (path != null) {
                java.lang.String str = path.length() > 0 ? path : null;
                if (str != null) {
                    concat = str;
                    query = parse.getQuery();
                    if (query != null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(concat);
                        sb.append(com.datadog.android.core.internal.CoreFeature.DEFAULT_APP_VERSION);
                        sb.append(query);
                        url = sb.toString();
                    }
                    url = concat;
                }
            }
            java.lang.String host = parse.getHost();
            concat = androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR.concat(java.lang.String.valueOf(host != null ? host : ""));
            query = parse.getQuery();
            if (query != null) {
            }
            url = concat;
        }
        arrow.core.Either<com.paypal.oslo.core.deeplink.DeeplinkResolver.Error, androidx.navigation3.runtime.NavKey> resolve = this.getHighResolutionOutputSizeshNQ4ISI.resolve(url);
        if (resolve.isRight()) {
            final androidx.navigation3.runtime.NavKey navKey = (androidx.navigation3.runtime.NavKey) ((arrow.core.Either.Right) resolve).getValue();
            this.getHighSpeedVideoSizes.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.taxanddocumentcenter.ui.taxdocuments.navigation.DeeplinkNavigationHandler.$r8$lambda$DxR2BAbvtdBuVCMa1brv5Tpc6sg(androidx.navigation3.runtime.NavKey.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
                }
            });
            z = true;
        }
        if (!resolve.isLeft()) {
            return z;
        }
        com.paypal.oslo.core.deeplink.DeeplinkResolver.Error error = (com.paypal.oslo.core.deeplink.DeeplinkResolver.Error) ((arrow.core.Either.Left) resolve).getValue();
        if (error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Malformed deeplink path", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.MalformedPath) error).getPath())), null, 4, null);
            return z;
        }
        if (!(error instanceof com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.taxanddocumentcenter.LoggerKt.log, "Unrecognized deeplink path - destination not registered", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", ((com.paypal.oslo.core.deeplink.DeeplinkResolver.Error.UnrecognizedPath) error).getPath())), null, 4, null);
        return z;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DxR2BAbvtdBuVCMa1brv5Tpc6sg(androidx.navigation3.runtime.NavKey navKey, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(navKey);
        return kotlin.Unit.INSTANCE;
    }
}
