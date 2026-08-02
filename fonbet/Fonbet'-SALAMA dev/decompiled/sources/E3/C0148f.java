package E3;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* renamed from: E3.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0148f extends C0151i implements NavigableMap {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ H f2049x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0148f(H h6, NavigableMap navigableMap) {
        super(h6, navigableMap);
        this.f2049x = h6;
    }

    @Override // E3.C0151i
    public final SortedSet b() {
        return new C0149g(this.f2049x, d());
    }

    @Override // E3.C0151i
    /* renamed from: c */
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = d().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return d().ceilingKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new C0148f(this.f2049x, d().descendingMap());
    }

    public final C0163v e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List c3 = this.f2049x.c();
        c3.addAll((Collection) entry.getValue());
        it.remove();
        return new C0163v(entry.getKey(), Collections.unmodifiableList(c3));
    }

    @Override // E3.C0151i
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap d() {
        return (NavigableMap) this.f2045c;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = d().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = d().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return d().floorKey(obj);
    }

    @Override // E3.C0151i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = d().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return d().higherKey(obj);
    }

    @Override // E3.C0151i, E3.C0146d, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = d().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = d().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return d().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((C0144b) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((C0144b) ((C0146d) descendingMap()).entrySet()).iterator());
    }

    @Override // E3.C0151i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // E3.C0151i, java.util.SortedMap, java.util.NavigableMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z4) {
        return new C0148f(this.f2049x, d().headMap(obj, z4));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z4, Object obj2, boolean z7) {
        return new C0148f(this.f2049x, d().subMap(obj, z4, obj2, z7));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z4) {
        return new C0148f(this.f2049x, d().tailMap(obj, z4));
    }
}
