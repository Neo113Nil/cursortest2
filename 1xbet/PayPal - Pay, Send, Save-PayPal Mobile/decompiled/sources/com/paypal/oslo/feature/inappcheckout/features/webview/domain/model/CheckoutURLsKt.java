package com.paypal.oslo.feature.inappcheckout.features.webview.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/net/Uri;", "", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "addQueryParam", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CheckoutURLsKt {
    public static final android.net.Uri addQueryParam(android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.isBlank(str) || (str3 = str2) == null || kotlin.text.StringsKt.isBlank(str3)) {
            return uri;
        }
        java.lang.String obj = uri.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        if (kotlin.text.StringsKt.isBlank(obj)) {
            return uri;
        }
        android.net.Uri build = uri.buildUpon().appendQueryParameter(str, str2).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
