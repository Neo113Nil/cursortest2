package com.ironsource;

/* loaded from: classes5.dex */
public final class P5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.ironsource.P5 f5920a = new com.ironsource.P5();
    public static final java.lang.String b = "ext_";

    private P5() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> a(android.os.Bundle bundle) {
        java.util.Set<java.lang.String> keySet = bundle != null ? bundle.keySet() : null;
        if (keySet == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(keySet, 10)), 16));
        for (java.lang.String str : keySet) {
            java.lang.String str2 = b + str;
            java.lang.Object obj = bundle.get(str);
            kotlin.Pair pair = kotlin.TuplesKt.to(str2, obj instanceof java.lang.Iterable ? kotlin.collections.CollectionsKt.joinToString$default((java.lang.Iterable) obj, ", ", null, null, 0, null, null, 62, null) : obj == null ? null : obj.toString());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }
}
