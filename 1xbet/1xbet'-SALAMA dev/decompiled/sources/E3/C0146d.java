package E3;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: E3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0146d extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient C0144b f2043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient C0156n f2044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient SortedMap f2045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ H f2046d;

    public C0146d(H h6, SortedMap sortedMap) {
        this.f2046d = h6;
        this.f2045c = sortedMap;
    }

    public final C0163v a(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        H h6 = this.f2046d;
        List list = (List) collection;
        return new C0163v(key, list instanceof RandomAccess ? new C0150h(h6, key, list, null) : new C0154l(h6, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        H h6 = this.f2046d;
        if (this.f2045c == h6.f1996d) {
            h6.b();
            return;
        }
        C0145c c0145c = new C0145c(this);
        while (c0145c.hasNext()) {
            c0145c.next();
            c0145c.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        SortedMap sortedMap = this.f2045c;
        sortedMap.getClass();
        try {
            return sortedMap.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C0144b c0144b = this.f2043a;
        if (c0144b != null) {
            return c0144b;
        }
        C0144b c0144b2 = new C0144b(this);
        this.f2043a = c0144b2;
        return c0144b2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f2045c.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        SortedMap sortedMap = this.f2045c;
        sortedMap.getClass();
        try {
            obj2 = sortedMap.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        H h6 = this.f2046d;
        List list = (List) collection;
        return list instanceof RandomAccess ? new C0150h(h6, obj, list, null) : new C0154l(h6, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f2045c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        C0147e c0152j;
        H h6 = this.f2046d;
        C0147e c0147e = h6.f2063a;
        if (c0147e == null) {
            TreeMap treeMap = h6.f1996d;
            if (treeMap != null) {
                c0152j = new C0149g(h6, treeMap);
            } else {
                c0152j = treeMap != null ? new C0152j(h6, treeMap) : new C0147e(h6, treeMap);
            }
            c0147e = c0152j;
            h6.f2063a = c0147e;
        }
        return c0147e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f2045c.remove(obj);
        if (collection == null) {
            return null;
        }
        H h6 = this.f2046d;
        List listC = h6.c();
        listC.addAll(collection);
        h6.f1997e -= collection.size();
        collection.clear();
        return listC;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f2045c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f2045c.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0156n c0156n = this.f2044b;
        if (c0156n != null) {
            return c0156n;
        }
        C0156n c0156n2 = new C0156n(this);
        this.f2044b = c0156n2;
        return c0156n2;
    }
}
