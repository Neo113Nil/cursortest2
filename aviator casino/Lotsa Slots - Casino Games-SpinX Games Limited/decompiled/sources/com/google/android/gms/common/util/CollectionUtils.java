package com.google.android.gms.common.util;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class CollectionUtils {
    private CollectionUtils() {
    }

    public static boolean isEmpty(java.util.Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf() {
        return java.util.Collections.emptyList();
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3) {
        java.util.Map zzb = zzb(3, false);
        zzb.put(k, v);
        zzb.put(k2, v2);
        zzb.put(k3, v3);
        return java.util.Collections.unmodifiableMap(zzb);
    }

    public static <K, V> java.util.Map<K, V> mapOfKeyValueArrays(K[] kArr, V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(length).length() + 44 + java.lang.String.valueOf(length2).length());
            sb.append("Key and values array lengths not equal: ");
            sb.append(length);
            sb.append(" != ");
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (length == 0) {
            return java.util.Collections.emptyMap();
        }
        if (length == 1) {
            return java.util.Collections.singletonMap(kArr[0], vArr[0]);
        }
        java.util.Map zzb = zzb(length, false);
        for (int i = 0; i < kArr.length; i++) {
            zzb.put(kArr[i], vArr[i]);
        }
        return java.util.Collections.unmodifiableMap(zzb);
    }

    public static <T> java.util.Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new androidx.collection.ArraySet() : zza(i, true);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T t, T t2, T t3) {
        java.util.Set zza = zza(3, false);
        zza.add(t);
        zza.add(t2);
        zza.add(t3);
        return java.util.Collections.unmodifiableSet(zza);
    }

    private static java.util.Map zzb(int i, boolean z) {
        return i <= 256 ? new androidx.collection.ArrayMap(i) : new java.util.HashMap(i, 1.0f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T t) {
        return java.util.Collections.singletonList(t);
    }

    private static java.util.Set zza(int i, boolean z) {
        if (i <= (true != z ? 256 : 128)) {
            return new androidx.collection.ArraySet(i);
        }
        return new java.util.HashSet(i, true != z ? 1.0f : 0.75f);
    }

    @java.lang.Deprecated
    public static <T> java.util.List<T> listOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptyList();
        }
        if (length == 1) {
            return java.util.Collections.singletonList(tArr[0]);
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(tArr));
    }

    public static <K, V> java.util.Map<K, V> mapOf(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        java.util.Map zzb = zzb(6, false);
        zzb.put(k, v);
        zzb.put(k2, v2);
        zzb.put(k3, v3);
        zzb.put(k4, v4);
        zzb.put(k5, v5);
        zzb.put(k6, v6);
        return java.util.Collections.unmodifiableMap(zzb);
    }

    @java.lang.Deprecated
    public static <T> java.util.Set<T> setOf(T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return java.util.Collections.emptySet();
        }
        if (length == 1) {
            return java.util.Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            java.util.Set zza = zza(2, false);
            zza.add(t);
            zza.add(t2);
            return java.util.Collections.unmodifiableSet(zza);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length == 4) {
            T t3 = tArr[0];
            T t4 = tArr[1];
            T t5 = tArr[2];
            T t6 = tArr[3];
            java.util.Set zza2 = zza(4, false);
            zza2.add(t3);
            zza2.add(t4);
            zza2.add(t5);
            zza2.add(t6);
            return java.util.Collections.unmodifiableSet(zza2);
        }
        java.util.Set zza3 = zza(length, false);
        java.util.Collections.addAll(zza3, tArr);
        return java.util.Collections.unmodifiableSet(zza3);
    }
}
