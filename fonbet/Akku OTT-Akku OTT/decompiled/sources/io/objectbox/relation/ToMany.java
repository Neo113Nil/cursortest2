package io.objectbox.relation;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes3.dex */
public class ToMany<TARGET> implements List<TARGET>, Serializable {
    private static final long serialVersionUID = 2367317778240689006L;

    public final void a() {
        throw null;
    }

    @Override // java.util.List
    public final synchronized void add(int i, TARGET target) {
        throw null;
    }

    @Override // java.util.List
    public final synchronized boolean addAll(int i, Collection<? extends TARGET> collection) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized void clear() {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        a();
        throw null;
    }

    @Override // java.util.List
    public final TARGET get(int i) {
        a();
        throw null;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<TARGET> iterator() {
        a();
        throw null;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        a();
        throw null;
    }

    @Override // java.util.List
    public final ListIterator<TARGET> listIterator() {
        a();
        throw null;
    }

    @Override // java.util.List
    public final synchronized TARGET remove(int i) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        if (it.hasNext()) {
            remove(it.next());
            throw null;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized boolean retainAll(Collection<?> collection) {
        throw null;
    }

    @Override // java.util.List
    public final synchronized TARGET set(int i, TARGET target) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        a();
        throw null;
    }

    @Override // java.util.List
    public final List<TARGET> subList(int i, int i2) {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized boolean add(TARGET target) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized boolean addAll(Collection<? extends TARGET> collection) {
        throw null;
    }

    @Override // java.util.List
    public final ListIterator<TARGET> listIterator(int i) {
        a();
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final synchronized boolean remove(Object obj) {
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        a();
        throw null;
    }
}
