package org.modelmapper.internal.util;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class CopyOnWriteLinkedHashMap<K, V> implements Map<K, V> {
    private volatile Map<K, V> map;

    public CopyOnWriteLinkedHashMap() {
        this.map = new LinkedHashMap();
    }

    public CopyOnWriteLinkedHashMap(Map<K, V> map) {
        this.map = new LinkedHashMap(map);
    }

    @Override // java.util.Map
    public synchronized void clear() {
        this.map = new LinkedHashMap();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public synchronized V put(K k, V v) {
        V v2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.map);
        v2 = (V) linkedHashMap.put(k, v);
        this.map = linkedHashMap;
        return v2;
    }

    @Override // java.util.Map
    public synchronized void putAll(Map<? extends K, ? extends V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.map);
        linkedHashMap.putAll(map);
        this.map = linkedHashMap;
    }

    @Override // java.util.Map
    public synchronized V remove(Object obj) {
        V v;
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.map);
        v = (V) linkedHashMap.remove(obj);
        this.map = linkedHashMap;
        return v;
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.map.values();
    }
}
