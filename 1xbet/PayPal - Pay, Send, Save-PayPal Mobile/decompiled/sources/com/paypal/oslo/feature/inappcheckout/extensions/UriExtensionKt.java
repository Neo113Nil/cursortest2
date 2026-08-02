package com.paypal.oslo.feature.inappcheckout.extensions;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"&\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006*\u00020\u00008AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroid/net/Uri;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "buildIntent", "(Landroid/net/Uri;Landroid/content/Context;)Landroid/content/Intent;", "", "", "getQueryParameters", "(Landroid/net/Uri;)Ljava/util/Map;", "queryParameters"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class UriExtensionKt {
    public static final java.util.Map<java.lang.String, java.lang.String> getQueryParameters(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        java.util.Set<java.lang.String> set = queryParameterNames;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(set, 10)), 16));
        for (java.lang.Object obj : set) {
            linkedHashMap.put(obj, uri.getQueryParameter((java.lang.String) obj));
        }
        return linkedHashMap;
    }

    public static final android.content.Intent buildIntent(android.net.Uri uri, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        return com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory.buildIntent$default(com.paypal.oslo.feature.inappcheckout.features.switchback.SwitchBackIntentFactory.INSTANCE, context, uri, false, 4, null);
    }
}
