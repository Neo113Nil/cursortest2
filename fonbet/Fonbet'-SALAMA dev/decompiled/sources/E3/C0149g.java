package E3;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;

/* renamed from: E3.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0149g extends C0152j implements NavigableSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f2050d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0149g(H h6, NavigableMap navigableMap) {
        super(h6, navigableMap);
        this.f2050d = h6;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return l().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((C0147e) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new C0149g(this.f2050d, l().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return l().floorKey(obj);
    }

    @Override // E3.C0152j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return l().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return l().lowerKey(obj);
    }

    @Override // E3.C0152j
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final NavigableMap l() {
        return (NavigableMap) this.f2047a;
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        C0145c c0145c = (C0145c) iterator();
        if (!c0145c.hasNext()) {
            return null;
        }
        Object next = c0145c.next();
        c0145c.remove();
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

    @Override // E3.C0152j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // E3.C0152j, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z4) {
        return new C0149g(this.f2050d, l().headMap(obj, z4));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z4, Object obj2, boolean z7) {
        return new C0149g(this.f2050d, l().subMap(obj, z4, obj2, z7));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z4) {
        return new C0149g(this.f2050d, l().tailMap(obj, z4));
    }
}
