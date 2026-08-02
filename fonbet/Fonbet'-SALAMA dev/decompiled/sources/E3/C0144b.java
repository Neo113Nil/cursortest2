package E3;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: E3.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0144b extends Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0146d f2038a;

    public C0144b(C0146d c0146d) {
        this.f2038a = c0146d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f2038a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set entrySet = this.f2038a.f2045c.entrySet();
        entrySet.getClass();
        try {
            return entrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2038a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0145c(this.f2038a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        H h6 = this.f2038a.f2046d;
        Object key = entry.getKey();
        TreeMap treeMap = h6.f1996d;
        treeMap.getClass();
        try {
            obj2 = treeMap.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return true;
        }
        int size = collection.size();
        collection.clear();
        h6.f1997e -= size;
        return true;
    }

    @Override // E3.Y, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z4 = false;
            while (it.hasNext()) {
                z4 |= remove(it.next());
            }
            return z4;
        }
    }

    @Override // E3.Y, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int ceil;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                AbstractC0158p.a(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) Math.ceil(size / 0.75d) : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            }
            HashSet hashSet = new HashSet(ceil);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.f2038a.keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2038a.f2045c.size();
    }
}
