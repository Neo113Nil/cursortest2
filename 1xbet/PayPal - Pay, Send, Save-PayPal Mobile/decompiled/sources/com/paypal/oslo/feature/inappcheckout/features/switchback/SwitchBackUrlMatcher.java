package com.paypal.oslo.feature.inappcheckout.features.switchback;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\f\u0010\u0012\u001a\u00020\u000e*\u00020\u000eH\u0002R\u0018\u0010\u000f\u001a\u00020\u000e*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/features/switchback/SwitchBackUrlMatcher;", "", "<init>", "()V", "determineSwitchBackType", "Lcom/paypal/oslo/feature/inappcheckout/features/switchback/model/SwitchBackToMerchantType;", "loadedUrl", "Landroid/net/Uri;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.CHECKOUT_URLS_KEY, "Lcom/paypal/oslo/feature/inappcheckout/features/webview/domain/model/CheckoutURLs;", "matchesWith", "", "origin", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "pathWithTrailingSlash", "getPathWithTrailingSlash", "(Landroid/net/Uri;)Ljava/lang/String;", "ensureTrailingSlash", "inappcheckout_prodRelease", "didLoadCancelUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SwitchBackUrlMatcher {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SwitchBackUrlMatcher() {
    }

    public final com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType determineSwitchBackType(final android.net.Uri loadedUrl, final com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.CheckoutURLs checkoutURLs) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadedUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkoutURLs, "");
        boolean matchesWith = matchesWith(loadedUrl, checkoutURLs.getReturnUrl());
        kotlin.Lazy lazy = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                boolean matchesWith2;
                matchesWith2 = com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackUrlMatcher.this.matchesWith(loadedUrl, checkoutURLs.getCancelUrl());
                return java.lang.Boolean.valueOf(matchesWith2);
            }
        });
        java.util.Set<java.lang.String> queryParameterNames = loadedUrl.getQueryParameterNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        java.util.Set<java.lang.String> set = queryParameterNames;
        boolean z = false;
        if (!(set instanceof java.util.Collection) || !set.isEmpty()) {
            java.util.Iterator<T> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.String) it.next(), com.paypal.oslo.feature.inappcheckout.features.webview.domain.model.QueryKey.PayerId.getValue())) {
                    z = true;
                    break;
                }
            }
        }
        if (matchesWith && z) {
            return com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType.Resume;
        }
        if (((java.lang.Boolean) lazy.getValue()).booleanValue()) {
            return com.paypal.oslo.feature.inappcheckout.features.switchback.model.SwitchBackToMerchantType.Cancel;
        }
        return null;
    }

    public final boolean matchesWith(android.net.Uri origin, java.lang.String target) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(origin, "");
        java.lang.String str = target;
        if (str == null || kotlin.text.StringsKt.isBlank(str)) {
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(target);
        return kotlin.jvm.internal.Intrinsics.areEqual(origin.getScheme(), parse.getScheme()) && kotlin.jvm.internal.Intrinsics.areEqual(origin.getAuthority(), parse.getAuthority()) && kotlin.jvm.internal.Intrinsics.areEqual(getHighSpeedVideoFpsRanges(origin), getHighSpeedVideoFpsRanges(parse));
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(android.net.Uri uri) {
        java.lang.String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String decode = android.net.Uri.decode(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decode);
        if (kotlin.text.StringsKt.endsWith$default(path, decode, false, 2, (java.lang.Object) null)) {
            return path;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(path);
        sb.append(decode);
        return sb.toString();
    }
}
