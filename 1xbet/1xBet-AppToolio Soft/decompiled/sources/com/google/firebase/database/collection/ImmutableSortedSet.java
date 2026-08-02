package com.google.firebase.database.collection;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.database.collection.ImmutableSortedMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@KeepForSdk
/* loaded from: classes.dex */
public class ImmutableSortedSet<T> implements Iterable<T> {
    private final ImmutableSortedMap<T, Void> zzk;

    private static class WrappedEntryIterator<T> implements Iterator<T> {
        private final Iterator<Map.Entry<T, Void>> zzl;

        @KeepForSdk
        public WrappedEntryIterator(Iterator<Map.Entry<T, Void>> it) {
            this.zzl = it;
        }

        @Override // java.util.Iterator
        @KeepForSdk
        public boolean hasNext() {
            return this.zzl.hasNext();
        }

        @Override // java.util.Iterator
        @KeepForSdk
        public T next() {
            return this.zzl.next().getKey();
        }

        @Override // java.util.Iterator
        @KeepForSdk
        public void remove() {
            this.zzl.remove();
        }
    }

    private ImmutableSortedSet(ImmutableSortedMap<T, Void> immutableSortedMap) {
        this.zzk = immutableSortedMap;
    }

    @KeepForSdk
    public ImmutableSortedSet(List<T> list, Comparator<T> comparator) {
        this.zzk = ImmutableSortedMap.Builder.buildFrom(list, Collections.emptyMap(), ImmutableSortedMap.Builder.identityTranslator(), comparator);
    }

    @KeepForSdk
    public boolean contains(T t) {
        return this.zzk.containsKey(t);
    }

    @KeepForSdk
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImmutableSortedSet) {
            return this.zzk.equals(((ImmutableSortedSet) obj).zzk);
        }
        return false;
    }

    @KeepForSdk
    public T getMaxEntry() {
        return this.zzk.getMaxKey();
    }

    @KeepForSdk
    public T getMinEntry() {
        return this.zzk.getMinKey();
    }

    @KeepForSdk
    public T getPredecessorEntry(T t) {
        return this.zzk.getPredecessorKey(t);
    }

    @KeepForSdk
    public int hashCode() {
        return this.zzk.hashCode();
    }

    @KeepForSdk
    public int indexOf(T t) {
        return this.zzk.indexOf(t);
    }

    @KeepForSdk
    public ImmutableSortedSet<T> insert(T t) {
        return new ImmutableSortedSet<>(this.zzk.insert(t, null));
    }

    @KeepForSdk
    public boolean isEmpty() {
        return this.zzk.isEmpty();
    }

    @Override // java.lang.Iterable
    @KeepForSdk
    public Iterator<T> iterator() {
        return new WrappedEntryIterator(this.zzk.iterator());
    }

    @KeepForSdk
    public Iterator<T> iteratorFrom(T t) {
        return new WrappedEntryIterator(this.zzk.iteratorFrom(t));
    }

    @KeepForSdk
    public ImmutableSortedSet<T> remove(T t) {
        ImmutableSortedMap<T, Void> remove = this.zzk.remove(t);
        return remove == this.zzk ? this : new ImmutableSortedSet<>(remove);
    }

    @KeepForSdk
    public Iterator<T> reverseIterator() {
        return new WrappedEntryIterator(this.zzk.reverseIterator());
    }

    @KeepForSdk
    public Iterator<T> reverseIteratorFrom(T t) {
        return new WrappedEntryIterator(this.zzk.reverseIteratorFrom(t));
    }

    @KeepForSdk
    public int size() {
        return this.zzk.size();
    }
}
