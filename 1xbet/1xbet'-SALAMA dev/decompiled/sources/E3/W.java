package E3;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class W extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f2030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D3.l f2031b;

    public W(Set set, D3.l lVar) {
        this.f2030a = set;
        this.f2031b = lVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        p113p3.f.e(this.f2031b.apply(obj));
        return this.f2030a.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p113p3.f.e(this.f2031b.apply(it.next()));
        }
        return this.f2030a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Set set = this.f2030a;
        boolean z4 = set instanceof RandomAccess;
        D3.l lVar = this.f2031b;
        if (!z4 || !(set instanceof List)) {
            Iterator it = set.iterator();
            lVar.getClass();
            while (it.hasNext()) {
                if (lVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) set;
        lVar.getClass();
        int i7 = 0;
        for (int i8 = 0; i8 < list.size(); i8++) {
            Object obj = list.get(i8);
            if (!lVar.apply(obj)) {
                if (i8 > i7) {
                    try {
                        list.set(i7, obj);
                    } catch (IllegalArgumentException unused) {
                        AbstractC0158p.j(list, lVar, i7, i8);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        AbstractC0158p.j(list, lVar, i7, i8);
                        return;
                    }
                }
                i7++;
            }
        }
        list.subList(i7, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Set set = this.f2030a;
        set.getClass();
        try {
            zContains = set.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f2031b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return AbstractC0158p.c(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return AbstractC0158p.g(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.f2030a.iterator();
        D3.l lVar = this.f2031b;
        p113p3.f.k(lVar, "predicate");
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            if (lVar.apply(it.next())) {
                break;
            }
            i7++;
        }
        return true ^ (i7 != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.f2030a.iterator();
        it.getClass();
        D3.l lVar = this.f2031b;
        lVar.getClass();
        return new C(it, lVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.f2030a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f2030a.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2031b.apply(next) && collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f2030a.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f2031b.apply(next) && !collection.contains(next)) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f2030a.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            if (this.f2031b.apply(it.next())) {
                i7++;
            }
        }
        return i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        C c3 = (C) iterator();
        ArrayList arrayList = new ArrayList();
        while (c3.hasNext()) {
            arrayList.add(c3.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        C c3 = (C) iterator();
        ArrayList arrayList = new ArrayList();
        while (c3.hasNext()) {
            arrayList.add(c3.next());
        }
        return arrayList.toArray(objArr);
    }
}
