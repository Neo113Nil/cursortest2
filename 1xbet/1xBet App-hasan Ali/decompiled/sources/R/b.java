package R;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b implements List, j4.c {

    /* renamed from: k, reason: collision with root package name */
    public final e f5100k;

    public b(e eVar) {
        this.f5100k = eVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.f5100k.c(obj);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        e eVar = this.f5100k;
        return eVar.f(eVar.f5108m, collection);
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.f5100k.h();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f5100k.i(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        e eVar = this.f5100k;
        eVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!eVar.i(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        f.a(i, this);
        return this.f5100k.f5106k[i];
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f5100k.j(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f5100k.f5108m == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new d(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        e eVar = this.f5100k;
        Object[] objArr = eVar.f5106k;
        for (int i = eVar.f5108m - 1; i >= 0; i--) {
            if (l.a(obj, objArr[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new d(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f5100k.k(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.f5100k;
        eVar.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        int i = eVar.f5108m;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            eVar.k(it.next());
        }
        return i != eVar.f5108m;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.f5100k;
        int i = eVar.f5108m;
        for (int i5 = i - 1; -1 < i5; i5--) {
            if (!collection.contains(eVar.f5106k[i5])) {
                eVar.l(i5);
            }
        }
        return i != eVar.f5108m;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        f.a(i, this);
        Object[] objArr = this.f5100k.f5106k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f5100k.f5108m;
    }

    @Override // java.util.List
    public final List subList(int i, int i5) {
        f.b(i, i5, this);
        return new c(i, i5, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return k.a(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.f5100k.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new d(i, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        f.a(i, this);
        return this.f5100k.l(i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return k.b(this, objArr);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return this.f5100k.f(i, collection);
    }
}
