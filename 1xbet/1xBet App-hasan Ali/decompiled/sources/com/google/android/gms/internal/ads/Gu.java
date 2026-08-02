package com.google.android.gms.internal.ads;

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

/* loaded from: classes.dex */
public final class Gu extends Ku implements NavigableMap {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1581sv f9283q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gu(C1581sv c1581sv, NavigableMap navigableMap) {
        super(c1581sv, navigableMap);
        this.f9283q = c1581sv;
    }

    @Override // com.google.android.gms.internal.ads.Ku
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f8625m);
    }

    @Override // com.google.android.gms.internal.ads.Ku
    public final SortedSet c() {
        return new Hu(this.f9283q, (NavigableMap) ((SortedMap) this.f8625m));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = ((NavigableMap) ((SortedMap) this.f8625m)).ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return a(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8625m)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ku
    /* renamed from: d */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new Gu(this.f9283q, ((NavigableMap) ((SortedMap) this.f8625m)).descendingMap());
    }

    public final C0865cv e(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        List list = (List) this.f9283q.f15615p.mo12a();
        list.addAll((Collection) entry.getValue());
        it.remove();
        return new C0865cv(entry.getKey(), Collections.unmodifiableList(list));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = ((NavigableMap) ((SortedMap) this.f8625m)).firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return a(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = ((NavigableMap) ((SortedMap) this.f8625m)).floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return a(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8625m)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ku, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = ((NavigableMap) ((SortedMap) this.f8625m)).higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return a(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8625m)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.Ku, com.google.android.gms.internal.ads.Eu, java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = ((NavigableMap) ((SortedMap) this.f8625m)).lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return a(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = ((NavigableMap) ((SortedMap) this.f8625m)).lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return a(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f8625m)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return e(((Cu) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return e(((Cu) ((Eu) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.Ku, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.Ku, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z3) {
        return new Gu(this.f9283q, ((NavigableMap) ((SortedMap) this.f8625m)).headMap(obj, z3));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z3, Object obj2, boolean z5) {
        return new Gu(this.f9283q, ((NavigableMap) ((SortedMap) this.f8625m)).subMap(obj, z3, obj2, z5));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z3) {
        return new Gu(this.f9283q, ((NavigableMap) ((SortedMap) this.f8625m)).tailMap(obj, z3));
    }
}
