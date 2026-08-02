package com.paypal.oslo.feature.inappcheckout.domain.model;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroid/content/Intent;", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/DeepLinkData;", "toDeepLinkData", "(Landroid/content/Intent;)Lcom/paypal/oslo/feature/inappcheckout/domain/model/DeepLinkData;", "Landroid/net/Uri;", "uri", "", "", "", "generateNonPiiQueryParamsMap", "(Landroid/net/Uri;)Ljava/util/Map;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DeepLinkDataKt {
    public static final com.paypal.oslo.feature.inappcheckout.domain.model.DeepLinkData toDeepLinkData(android.content.Intent intent) {
        java.util.Set<java.lang.String> set;
        java.util.Map<java.lang.String, java.lang.Object> map;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
        java.util.Set<java.lang.String> emptySet = kotlin.collections.SetsKt.emptySet();
        java.util.Map<java.lang.String, java.lang.Object> emptyMap = kotlin.collections.MapsKt.emptyMap();
        android.net.Uri data = intent.getData();
        boolean z4 = false;
        if (data != null) {
            java.lang.String obj2 = data.toString();
            java.lang.String scheme = data.getScheme();
            java.lang.String host = data.getHost();
            java.lang.String path = data.getPath();
            boolean isOpaque = data.isOpaque();
            if (data.isOpaque()) {
                obj = data.toString();
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.Object) scheme);
                sb.append("://");
                sb.append((java.lang.Object) host);
                sb.append((java.lang.Object) path);
                obj = sb.toString();
            }
            boolean z5 = kotlin.jvm.internal.Intrinsics.areEqual(scheme, "http") || kotlin.jvm.internal.Intrinsics.areEqual(scheme, "https");
            if (!z5 && !isOpaque) {
                z4 = true;
            }
            if (!data.isOpaque()) {
                emptySet = data.getQueryParameterNames();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emptySet, "");
                emptyMap = generateNonPiiQueryParamsMap(data);
            }
            set = emptySet;
            map = emptyMap;
            z2 = z4;
            z3 = isOpaque;
            z = z5;
            str3 = host;
            str5 = obj;
            str = obj2;
            str4 = path;
            str2 = scheme;
        } else {
            set = emptySet;
            map = emptyMap;
            z = false;
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
        }
        return new com.paypal.oslo.feature.inappcheckout.domain.model.DeepLinkData(str, str2, str3, str4, str5, false, z, z2, false, false, false, z3, false, set, map, 32, null);
    }

    public static final java.util.Map<java.lang.String, java.lang.Object> generateNonPiiQueryParamsMap(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        java.util.Set<java.lang.String> queryParameterNames = uri.getQueryParameterNames();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(queryParameterNames, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : queryParameterNames) {
            if (com.paypal.oslo.feature.inappcheckout.domain.model.DeepLinkData.INSTANCE.getTrackableQueryParamsSet().contains((java.lang.String) obj)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10)), 16));
        for (java.lang.Object obj2 : arrayList2) {
            linkedHashMap.put(obj2, uri.getQueryParameter((java.lang.String) obj2));
        }
        return linkedHashMap;
    }
}
