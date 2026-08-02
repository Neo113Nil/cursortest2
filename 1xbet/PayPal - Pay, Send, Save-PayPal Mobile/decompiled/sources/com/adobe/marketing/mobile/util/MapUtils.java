package com.adobe.marketing.mobile.util;

/* loaded from: classes3.dex */
public final class MapUtils {
    private MapUtils() {
    }

    public static boolean isNullOrEmpty(java.util.Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static void putIfNotEmpty(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str, java.lang.Object obj) {
        boolean isEmpty;
        if (map == null || str == null || obj == null) {
            return;
        }
        if (obj instanceof java.lang.String) {
            isEmpty = ((java.lang.String) obj).isEmpty();
        } else if (obj instanceof java.util.Map) {
            isEmpty = ((java.util.Map) obj).isEmpty();
        } else {
            if (obj instanceof java.util.Collection) {
                isEmpty = ((java.util.Collection) obj).isEmpty();
            }
            map.put(str, obj);
        }
        if (isEmpty) {
            return;
        }
        map.put(str, obj);
    }
}
