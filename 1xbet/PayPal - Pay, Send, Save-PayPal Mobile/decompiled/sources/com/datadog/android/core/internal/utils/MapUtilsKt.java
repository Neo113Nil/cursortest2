package com.datadog.android.core.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a=\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00060\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"K", "V", "", "orEmpty", "(Ljava/util/Map;)Ljava/util/Map;", "", "Lkotlin/Pair;", "toMutableMap", "(Ljava/lang/Iterable;)Ljava/util/Map;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MapUtilsKt {
    public static final <K, V> java.util.Map<K, V> toMutableMap(java.lang.Iterable<? extends kotlin.Pair<? extends K, ? extends V>> iterable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iterable, "");
        return kotlin.collections.MapsKt.toMap(iterable, new java.util.LinkedHashMap());
    }

    public static final <K, V> java.util.Map<K, V> orEmpty(java.util.Map<K, V> map) {
        return map == null ? new java.util.LinkedHashMap() : map;
    }
}
