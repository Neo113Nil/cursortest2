package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class Hu extends Lu implements NavigableSet {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1581sv f9500n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hu(C1581sv c1581sv, NavigableMap navigableMap) {
        super(c1581sv, navigableMap);
        this.f9500n = c1581sv;
    }

    @Override // com.google.android.gms.internal.ads.Lu
    public final /* synthetic */ SortedMap c() {
        return (NavigableMap) ((SortedMap) this.f9139k);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9139k)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((Fu) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new Hu(this.f9500n, ((NavigableMap) ((SortedMap) this.f9139k)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9139k)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Lu, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9139k)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f9139k)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        Du du = (Du) iterator();
        if (!du.hasNext()) {
            return null;
        }
        Object next = du.next();
        du.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (!descendingIterator.hasNext()) {
            return null;
        }
        Object next = descendingIterator.next();
        descendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.Lu, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.Lu, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z3) {
        return new Hu(this.f9500n, ((NavigableMap) ((SortedMap) this.f9139k)).headMap(obj, z3));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z3, Object obj2, boolean z5) {
        return new Hu(this.f9500n, ((NavigableMap) ((SortedMap) this.f9139k)).subMap(obj, z3, obj2, z5));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z3) {
        return new Hu(this.f9500n, ((NavigableMap) ((SortedMap) this.f9139k)).tailMap(obj, z3));
    }
}
