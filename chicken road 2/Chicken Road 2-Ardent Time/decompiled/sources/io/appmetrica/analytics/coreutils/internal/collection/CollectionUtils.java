package io.appmetrica.analytics.coreutils.internal.collection;

/* loaded from: classes.dex */
public final class CollectionUtils {
    public static final io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils INSTANCE = new io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(java.util.Collection<? extends java.lang.Object> collection, java.util.Collection<? extends java.lang.Object> collection2) {
        java.util.HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof java.util.HashSet) {
            hashSet = (java.util.HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof java.util.HashSet) {
            hashSet = (java.util.HashSet) collection2;
        } else {
            java.util.HashSet hashSet2 = new java.util.HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        java.util.Iterator<? extends java.lang.Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <T> java.util.List<T> arrayListCopyOfNullableCollection(java.util.Collection<? extends T> collection) {
        if (collection != null) {
            return i1.AbstractC0190i.X(collection);
        }
        return null;
    }

    public static final java.util.Map<java.lang.String, byte[]> bundleToMap(android.os.Bundle bundle) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (bundle != null) {
            for (java.lang.String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }

    public static final <T> java.util.Map<java.lang.String, T> convertMapKeysToLowerCase(java.util.Map<java.lang.String, ? extends T> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(i1.AbstractC0203v.E(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(((java.lang.String) entry.getKey()).toLowerCase(java.util.Locale.getDefault()), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> java.util.Map<K, V> copyOf(java.util.Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new java.util.HashMap(map);
    }

    public static final java.util.List<java.lang.String> createSortedListWithoutRepetitions(java.lang.String... strArr) {
        java.lang.String[] strArr2 = strArr;
        kotlin.jvm.internal.i.e(strArr2, "<this>");
        java.util.TreeSet treeSet = new java.util.TreeSet();
        i1.AbstractC0189h.Q(strArr2, treeSet);
        return unmodifiableListCopy(treeSet);
    }

    public static final <T> T getFirstOrNull(java.util.List<? extends T> list) {
        if (list != null) {
            return (T) i1.AbstractC0190i.N(list);
        }
        return null;
    }

    public static final <T> T getFromMapIgnoreCase(java.util.Map<java.lang.String, ? extends T> map, java.lang.String str) {
        T t;
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            java.util.Map.Entry entry = (java.util.Map.Entry) t;
            java.lang.CharSequence charSequence = (java.lang.CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0 && y1.o.G((java.lang.String) entry.getKey(), str)) {
                break;
            }
        }
        java.util.Map.Entry entry2 = (java.util.Map.Entry) t;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    public static final <K, V> java.util.List<java.util.Map.Entry<K, V>> getListFromMap(java.util.Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator<java.util.Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new java.util.AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> getMapFromList(java.util.List<? extends java.util.Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new java.util.LinkedHashMap();
        }
        int E2 = i1.AbstractC0203v.E(i1.AbstractC0192k.K(list));
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> java.util.Map<K, V> getMapFromListOrNull(java.util.List<? extends java.util.Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        int E2 = i1.AbstractC0203v.E(i1.AbstractC0192k.K(list));
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrDefault(java.util.Map<K, ? extends V> map, K k2, V v2) {
        V v3 = map.get(k2);
        return v3 == null ? v2 : v3;
    }

    public static final java.util.Set<java.lang.Integer> hashSetFromIntArray(int[] iArr) {
        kotlin.jvm.internal.i.e(iArr, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet(i1.AbstractC0203v.E(iArr.length));
        for (int i2 : iArr) {
            hashSet.add(java.lang.Integer.valueOf(i2));
        }
        return hashSet;
    }

    public static final boolean isNullOrEmpty(java.util.Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final <K, V> java.util.Map<K, V> mapCopyOfNullableMap(java.util.Map<K, ? extends V> map) {
        if (map != null) {
            return i1.AbstractC0202u.K(map);
        }
        return null;
    }

    public static final android.os.Bundle mapToBundle(java.util.Map<java.lang.String, byte[]> map) {
        android.os.Bundle bundle = new android.os.Bundle(map.size());
        for (java.util.Map.Entry<java.lang.String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final <T> java.util.Set<T> merge(java.util.Set<T> set, java.util.Set<? extends T> set2) {
        set.addAll(set2);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.List<T> nullIfEmptyList(java.util.List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(java.util.Map<K, V> map, K k2, V v2) {
        if (k2 == null || v2 == null) {
            return;
        }
        map.put(k2, v2);
    }

    public static final java.util.List<java.lang.Integer> toIntList(int[] iArr) {
        return i1.AbstractC0189h.R(iArr);
    }

    public static final <T> java.util.List<T> unmodifiableListCopy(java.util.Collection<? extends T> collection) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(collection));
    }

    public static final <K, V> java.util.Map<K, V> unmodifiableMapCopy(java.util.Map<K, ? extends V> map) {
        return java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
    }

    public static final <K, V> java.util.Map<K, V> unmodifiableSameOrderMapCopy(java.util.Map<K, ? extends V> map) {
        return java.util.Collections.unmodifiableMap(new java.util.LinkedHashMap(map));
    }

    public static final <T> java.util.Set<T> unmodifiableSetOf(T... tArr) {
        kotlin.jvm.internal.i.e(tArr, "<this>");
        java.util.HashSet hashSet = new java.util.HashSet(i1.AbstractC0203v.E(tArr.length));
        i1.AbstractC0189h.Q(tArr, hashSet);
        return java.util.Collections.unmodifiableSet(hashSet);
    }
}
