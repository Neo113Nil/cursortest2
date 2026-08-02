package com.datadog.trace.util;

/* loaded from: classes3.dex */
public final class CollectionUtils {
    public static <T> java.util.Set<T> tryMakeImmutableSet(java.util.Collection<T> collection) {
        return new java.util.HashSet(collection);
    }

    public static <T> java.util.List<T> tryMakeImmutableList(java.util.Collection<T> collection) {
        return new java.util.ArrayList(collection);
    }

    public static <K, V> java.util.Map<K, V> tryMakeImmutableMap(java.util.Map<K, V> map) {
        return new java.util.HashMap(map);
    }
}
