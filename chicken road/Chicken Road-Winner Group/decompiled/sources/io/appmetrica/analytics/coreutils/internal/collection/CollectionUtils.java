package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import e2.AbstractC0290e;
import e2.AbstractC0292g;
import e2.AbstractC0294i;
import e2.p;
import e2.r;
import e2.s;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class CollectionUtils {
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    public static final boolean areCollectionsEqual(Collection<? extends Object> collection, Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final <T> List<T> arrayListCopyOfNullableCollection(Collection<? extends T> collection) {
        if (collection != null) {
            return AbstractC0292g.f0(collection);
        }
        return null;
    }

    public static final Map<String, byte[]> bundleToMap(Bundle bundle) {
        HashMap hashMap = new HashMap();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                byte[] byteArray = bundle.getByteArray(str);
                if (byteArray != null) {
                    hashMap.put(str, byteArray);
                }
            }
        }
        return hashMap;
    }

    public static final <T> Map<String, T> convertMapKeysToLowerCase(Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(s.j0(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> Map<K, V> copyOf(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    public static final List<String> createSortedListWithoutRepetitions(String... strArr) {
        String[] strArr2 = strArr;
        j.e(strArr2, "<this>");
        TreeSet treeSet = new TreeSet();
        AbstractC0290e.X(strArr2, treeSet);
        return unmodifiableListCopy(treeSet);
    }

    public static final <T> T getFirstOrNull(List<? extends T> list) {
        if (list != null) {
            return (T) AbstractC0292g.X(list);
        }
        return null;
    }

    public static final <T> T getFromMapIgnoreCase(Map<String, ? extends T> map, String str) {
        T t3;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t3 = null;
                break;
            }
            t3 = it.next();
            Map.Entry entry = (Map.Entry) t3;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0) {
                String str2 = (String) entry.getKey();
                if (str2 == null ? str == null : str2.equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        Map.Entry entry2 = (Map.Entry) t3;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> getMapFromList(List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        int j02 = s.j0(AbstractC0294i.U(list));
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> getMapFromListOrNull(List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        int j02 = s.j0(AbstractC0294i.U(list));
        if (j02 < 16) {
            j02 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(j02);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    public static final <K, V> V getOrDefault(Map<K, ? extends V> map, K k3, V v3) {
        V v4 = map.get(k3);
        return v4 == null ? v3 : v4;
    }

    public static final Set<Integer> hashSetFromIntArray(int[] iArr) {
        j.e(iArr, "<this>");
        HashSet hashSet = new HashSet(s.j0(iArr.length));
        for (int i3 : iArr) {
            hashSet.add(Integer.valueOf(i3));
        }
        return hashSet;
    }

    public static final boolean isNullOrEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static final <K, V> Map<K, V> mapCopyOfNullableMap(Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        int size = map.size();
        if (size == 0) {
            return p.f4878a;
        }
        if (size != 1) {
            return r.q0(map);
        }
        Map.Entry<K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        j.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static final Bundle mapToBundle(Map<String, byte[]> map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    public static final <T> Set<T> merge(Set<T> set, Set<? extends T> set2) {
        set.addAll(set2);
        return set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> nullIfEmptyList(List<? extends T> list) {
        if (list == 0 || list.isEmpty()) {
            return null;
        }
        return list;
    }

    public static final <K, V> void putOpt(Map<K, V> map, K k3, V v3) {
        if (k3 == null || v3 == null) {
            return;
        }
        map.put(k3, v3);
    }

    public static final List<Integer> toIntList(int[] iArr) {
        return AbstractC0290e.Y(iArr);
    }

    public static final <T> List<T> unmodifiableListCopy(Collection<? extends T> collection) {
        return Collections.unmodifiableList(new ArrayList(collection));
    }

    public static final <K, V> Map<K, V> unmodifiableMapCopy(Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(Map<K, ? extends V> map) {
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final <T> Set<T> unmodifiableSetOf(T... tArr) {
        j.e(tArr, "<this>");
        HashSet hashSet = new HashSet(s.j0(tArr.length));
        AbstractC0290e.X(tArr, hashSet);
        return Collections.unmodifiableSet(hashSet);
    }
}
