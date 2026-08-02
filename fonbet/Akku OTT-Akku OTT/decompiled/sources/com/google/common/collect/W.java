package com.google.common.collect;

import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public interface W<K, V> {
    Collection<Map.Entry<K, V>> a();

    Map<K, Collection<V>> b();

    Collection<V> get(K k);

    boolean put(K k, V v);

    boolean remove(Object obj, Object obj2);

    int size();

    Collection<V> values();
}
