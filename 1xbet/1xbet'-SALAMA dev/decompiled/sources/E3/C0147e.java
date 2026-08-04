package E3;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedMap;

/* JADX INFO: renamed from: E3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0147e extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortedMap f2047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H f2048b;

    public C0147e(H h6, SortedMap sortedMap) {
        this.f2048b = h6;
        sortedMap.getClass();
        this.f2047a = sortedMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            C0145c c0145c = (C0145c) it;
            if (!c0145c.hasNext()) {
                return;
            }
            c0145c.next();
            c0145c.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f2047a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f2047a.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return this == obj || this.f2047a.keySet().equals(obj);
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f2047a.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2047a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0145c(this, this.f2047a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.f2047a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.f2048b.f1997e -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f2047a.size();
    }
}
