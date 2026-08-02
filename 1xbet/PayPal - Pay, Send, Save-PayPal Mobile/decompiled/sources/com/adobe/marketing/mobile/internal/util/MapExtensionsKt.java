package com.adobe.marketing.mobile.internal.util;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\u001aC\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a3\u0010\u000b\u001a\u00020\n*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a!\u0010\r\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000f\u001a\u00020\u0001*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"", "", "", "prefix", "", "flattenListAndArray", "flattening", "(Ljava/util/Map;Ljava/lang/String;Z)Ljava/util/Map;", "", "masks", "", "fnv1a32", "(Ljava/util/Map;[Ljava/lang/String;)J", "prettify", "(Ljava/util/Map;)Ljava/lang/String;", "serializeToQueryString"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class MapExtensionsKt {
    public static /* synthetic */ long fnv1a32$default(java.util.Map map, java.lang.String[] strArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            strArr = null;
        }
        return fnv1a32(map, strArr);
    }

    public static final /* synthetic */ long fnv1a32(java.util.Map map, java.lang.String[] strArr) {
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.Unit unit = null;
        java.util.Map flattening$default = flattening$default(map, null, false, 3, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (strArr != null) {
            for (java.lang.Comparable comparable : kotlin.collections.ArraysKt.sortedArray(strArr)) {
                java.lang.String str = (java.lang.String) comparable;
                if (str.length() > 0 && (obj = flattening$default.get(str)) != null && (!(obj instanceof java.lang.String) || ((java.lang.CharSequence) obj).length() != 0)) {
                    sb.append(str);
                    sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb.append(java.lang.String.valueOf(flattening$default.get(str)));
                }
            }
            unit = kotlin.Unit.INSTANCE;
        }
        if (unit == null) {
            for (java.util.Map.Entry entry : kotlin.collections.MapsKt.toSortedMap(flattening$default).entrySet()) {
                java.lang.Object value = entry.getValue();
                if (value != null && (!(value instanceof java.lang.String) || ((java.lang.CharSequence) value).length() != 0)) {
                    sb.append((java.lang.String) entry.getKey());
                    sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                    sb.append(java.lang.String.valueOf(entry.getValue()));
                }
            }
        }
        return com.adobe.marketing.mobile.internal.util.StringExtensionsKt.fnv1a32(sb.toString());
    }

    public static /* synthetic */ java.util.Map flattening$default(java.util.Map map, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return flattening(map, str, z);
    }

    public static final /* synthetic */ java.util.Map flattening(java.util.Map map, java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
            str = sb.toString();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append((java.lang.String) entry.getKey());
            java.lang.String obj = sb2.toString();
            java.lang.Object value = entry.getValue();
            if (value instanceof java.util.Map) {
                java.util.Map map2 = (java.util.Map) value;
                if (com.adobe.marketing.mobile.internal.util.SetExtensionsKt.isAllString(map2.keySet())) {
                    linkedHashMap.putAll(flattening(map2, obj, z));
                }
            }
            if ((value instanceof java.util.List) && z) {
                linkedHashMap.putAll(com.adobe.marketing.mobile.internal.util.ListExtensionsKt.flattening((java.util.List) value, obj));
            } else if ((value instanceof java.lang.Object[]) && z) {
                linkedHashMap.putAll(com.adobe.marketing.mobile.internal.util.ListExtensionsKt.flattening((java.lang.Object[]) value, obj));
            } else {
                linkedHashMap.put(obj, value);
            }
        }
        return linkedHashMap;
    }

    public static final /* synthetic */ java.lang.String serializeToQueryString(java.util.Map map) {
        java.lang.String urlEncode;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.lang.Object value = entry.getValue();
            java.lang.String urlEncode2 = com.adobe.marketing.mobile.internal.util.UrlEncoder.urlEncode(str);
            if (urlEncode2 != null) {
                java.lang.String str2 = null;
                if (value instanceof java.util.List) {
                    urlEncode = com.adobe.marketing.mobile.internal.util.UrlEncoder.urlEncode(kotlin.collections.CollectionsKt.joinToString$default((java.lang.Iterable) value, ",", null, null, 0, null, null, 62, null));
                } else {
                    urlEncode = com.adobe.marketing.mobile.internal.util.UrlEncoder.urlEncode(value != null ? value.toString() : null);
                }
                java.lang.String str3 = urlEncode2;
                if (str3 != null && !kotlin.text.StringsKt.isBlank(str3) && urlEncode != null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("&");
                    sb2.append(urlEncode2);
                    sb2.append('=');
                    sb2.append(urlEncode);
                    str2 = sb2.toString();
                }
                if (str2 != null) {
                    sb.append(str2);
                }
            }
        }
        if (sb.length() > 0) {
            return sb.substring(1).toString();
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public static final java.lang.String prettify(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        try {
            java.lang.String jSONObject = new org.json.JSONObject(map).toString(4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
            return jSONObject;
        } catch (java.lang.Exception unused) {
            return map.toString();
        }
    }
}
