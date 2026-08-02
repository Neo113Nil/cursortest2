package Y3;

import a.AbstractC0444a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b extends X3.g implements RandomAccess, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public Object[] f6142k;

    /* renamed from: l, reason: collision with root package name */
    public final int f6143l;

    /* renamed from: m, reason: collision with root package name */
    public int f6144m;

    /* renamed from: n, reason: collision with root package name */
    public final b f6145n;

    /* renamed from: o, reason: collision with root package name */
    public final c f6146o;

    public b(Object[] objArr, int i, int i5, b bVar, c cVar) {
        int i6;
        l.f("backing", objArr);
        l.f("root", cVar);
        this.f6142k = objArr;
        this.f6143l = i;
        this.f6144m = i5;
        this.f6145n = bVar;
        this.f6146o = cVar;
        i6 = ((AbstractList) cVar).modCount;
        ((AbstractList) this).modCount = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.f6143l + this.f6144m, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        i();
        h();
        int size = collection.size();
        f(this.f6143l + this.f6144m, collection, size);
        return size > 0;
    }

    @Override // X3.g
    public final int c() {
        h();
        return this.f6144m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.f6143l, this.f6144m);
    }

    @Override // X3.g
    public final Object d(int i) {
        i();
        h();
        int i5 = this.f6144m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return j(this.f6143l + i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return G4.l.g(this.f6142k, this.f6143l, this.f6144m, (List) obj);
        }
        return false;
    }

    public final void f(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        c cVar = this.f6146o;
        b bVar = this.f6145n;
        if (bVar != null) {
            bVar.f(i, collection, i5);
        } else {
            c cVar2 = c.f6147n;
            cVar.f(i, collection, i5);
        }
        this.f6142k = cVar.f6148k;
        this.f6144m += i5;
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f6146o;
        b bVar = this.f6145n;
        if (bVar != null) {
            bVar.g(i, obj);
        } else {
            c cVar2 = c.f6147n;
            cVar.g(i, obj);
        }
        this.f6142k = cVar.f6148k;
        this.f6144m++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        h();
        int i5 = this.f6144m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return this.f6142k[this.f6143l + i];
    }

    public final void h() {
        int i;
        i = ((AbstractList) this.f6146o).modCount;
        if (i != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f6142k;
        int i = this.f6144m;
        int i5 = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[this.f6143l + i6];
            i5 = (i5 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public final void i() {
        if (this.f6146o.f6150m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i = 0; i < this.f6144m; i++) {
            if (l.a(this.f6142k[this.f6143l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f6144m == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        Object j5;
        ((AbstractList) this).modCount++;
        b bVar = this.f6145n;
        if (bVar != null) {
            j5 = bVar.j(i);
        } else {
            c cVar = c.f6147n;
            j5 = this.f6146o.j(i);
        }
        this.f6144m--;
        return j5;
    }

    public final void k(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        b bVar = this.f6145n;
        if (bVar != null) {
            bVar.k(i, i5);
        } else {
            c cVar = c.f6147n;
            this.f6146o.k(i, i5);
        }
        this.f6144m -= i5;
    }

    public final int l(int i, int i5, Collection collection, boolean z3) {
        int l5;
        b bVar = this.f6145n;
        if (bVar != null) {
            l5 = bVar.l(i, i5, collection, z3);
        } else {
            c cVar = c.f6147n;
            l5 = this.f6146o.l(i, i5, collection, z3);
        }
        if (l5 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6144m -= l5;
        return l5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i = this.f6144m - 1; i >= 0; i--) {
            if (l.a(this.f6142k[this.f6143l + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        i();
        h();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            d(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        l.f("elements", collection);
        i();
        h();
        return l(this.f6143l, this.f6144m, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f("elements", collection);
        i();
        h();
        return l(this.f6143l, this.f6144m, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        i();
        h();
        int i5 = this.f6144m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        Object[] objArr = this.f6142k;
        int i6 = this.f6143l;
        Object obj2 = objArr[i6 + i];
        objArr[i6 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        AbstractC0444a.l(i, i5, this.f6144m);
        return new b(this.f6142k, this.f6143l + i, i5 - i, this, this.f6146o);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f("array", objArr);
        h();
        int length = objArr.length;
        int i = this.f6144m;
        int i5 = this.f6143l;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f6142k, i5, i + i5, objArr.getClass());
            l.e("copyOfRange(...)", copyOfRange);
            return copyOfRange;
        }
        X3.l.t0(0, i5, i + i5, this.f6142k, objArr);
        int i6 = this.f6144m;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return G4.l.h(this.f6142k, this.f6143l, this.f6144m, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        h();
        int i5 = this.f6144m;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        i();
        h();
        int i5 = this.f6144m;
        if (i >= 0 && i <= i5) {
            g(this.f6143l + i, obj);
            return;
        }
        throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        l.f("elements", collection);
        i();
        h();
        int i5 = this.f6144m;
        if (i >= 0 && i <= i5) {
            int size = collection.size();
            f(this.f6143l + i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f6142k;
        int i = this.f6144m;
        int i5 = this.f6143l;
        return X3.l.A0(objArr, i5, i + i5);
    }
}
