package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public class Eu extends AbstractMap {

    /* renamed from: k, reason: collision with root package name */
    public transient Cu f8623k;

    /* renamed from: l, reason: collision with root package name */
    public transient Pu f8624l;

    /* renamed from: m, reason: collision with root package name */
    public final transient Map f8625m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1581sv f8626n;

    public Eu(C1581sv c1581sv, Map map) {
        this.f8626n = c1581sv;
        this.f8625m = map;
    }

    public final C0865cv a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        C1581sv c1581sv = this.f8626n;
        List list = (List) collection;
        return new C0865cv(key, list instanceof RandomAccess ? new Iu(c1581sv, key, list, null) : new Nu(c1581sv, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C1581sv c1581sv = this.f8626n;
        if (this.f8625m == c1581sv.f15613n) {
            c1581sv.b();
            return;
        }
        Du du = new Du(this);
        while (du.hasNext()) {
            du.next();
            du.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f8625m;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Cu cu = this.f8623k;
        if (cu != null) {
            return cu;
        }
        Cu cu2 = new Cu(this);
        this.f8623k = cu2;
        return cu2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f8625m.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f8625m;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C1581sv c1581sv = this.f8626n;
        List list = (List) collection;
        return list instanceof RandomAccess ? new Iu(c1581sv, obj, list, null) : new Nu(c1581sv, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f8625m.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C1581sv c1581sv = this.f8626n;
        Fu fu = c1581sv.f11283k;
        if (fu != null) {
            return fu;
        }
        Map map = c1581sv.f15613n;
        Fu hu = map instanceof NavigableMap ? new Hu(c1581sv, (NavigableMap) map) : map instanceof SortedMap ? new Lu(c1581sv, (SortedMap) map) : new Fu(c1581sv, map);
        c1581sv.f11283k = hu;
        return hu;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f8625m.remove(obj);
        if (collection == null) {
            return null;
        }
        C1581sv c1581sv = this.f8626n;
        List list = (List) c1581sv.f15615p.mo12a();
        list.addAll(collection);
        c1581sv.f15614o -= collection.size();
        collection.clear();
        return list;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f8625m.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f8625m.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Pu pu = this.f8624l;
        if (pu != null) {
            return pu;
        }
        Pu pu2 = new Pu(this);
        this.f8624l = pu2;
        return pu2;
    }
}
