package org.jctools.maps;

/* loaded from: classes18.dex */
public class NonBlockingHashSet<E> extends java.util.AbstractSet<E> implements java.io.Serializable {
    private static final java.lang.Object V = "";
    private final org.jctools.maps.NonBlockingHashMap<E, java.lang.Object> _map = new org.jctools.maps.NonBlockingHashMap<>();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(E e) {
        return this._map.putIfAbsent(e, V) == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        return this._map.containsKey(obj);
    }

    public E get(E e) {
        return this._map.getk(e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        return this._map.remove(obj) == V;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this._map.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this._map.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<E> iterator() {
        return this._map.keySet().iterator();
    }
}
