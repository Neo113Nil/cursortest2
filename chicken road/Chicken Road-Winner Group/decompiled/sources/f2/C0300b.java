package f2;

import a.AbstractC0086a;
import e2.AbstractC0286a;
import e2.AbstractC0290e;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0300b extends AbstractC0286a implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4891a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4892b;

    /* renamed from: c, reason: collision with root package name */
    public int f4893c;

    /* renamed from: d, reason: collision with root package name */
    public final C0300b f4894d;

    /* renamed from: e, reason: collision with root package name */
    public final c f4895e;

    public C0300b(Object[] backing, int i3, int i4, C0300b c0300b, c root) {
        int i5;
        j.e(backing, "backing");
        j.e(root, "root");
        this.f4891a = backing;
        this.f4892b = i3;
        this.f4893c = i4;
        this.f4894d = c0300b;
        this.f4895e = root;
        i5 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i5;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        g();
        f(this.f4892b + this.f4893c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        j.e(elements, "elements");
        h();
        g();
        int size = elements.size();
        e(this.f4892b + this.f4893c, elements, size);
        return size > 0;
    }

    @Override // e2.AbstractC0286a
    public final int b() {
        g();
        return this.f4893c;
    }

    @Override // e2.AbstractC0286a
    public final Object c(int i3) {
        h();
        g();
        int i4 = this.f4893c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return i(this.f4892b + i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        g();
        j(this.f4892b, this.f4893c);
    }

    public final void e(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        c cVar = this.f4895e;
        C0300b c0300b = this.f4894d;
        if (c0300b != null) {
            c0300b.e(i3, collection, i4);
        } else {
            c cVar2 = c.f4896d;
            cVar.e(i3, collection, i4);
        }
        this.f4891a = cVar.f4897a;
        this.f4893c += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return X0.a.e(this.f4891a, this.f4892b, this.f4893c, (List) obj);
        }
        return false;
    }

    public final void f(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        c cVar = this.f4895e;
        C0300b c0300b = this.f4894d;
        if (c0300b != null) {
            c0300b.f(i3, obj);
        } else {
            c cVar2 = c.f4896d;
            cVar.f(i3, obj);
        }
        this.f4891a = cVar.f4897a;
        this.f4893c++;
    }

    public final void g() {
        int i3;
        i3 = ((AbstractList) this.f4895e).modCount;
        if (i3 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        g();
        int i4 = this.f4893c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return this.f4891a[this.f4892b + i3];
    }

    public final void h() {
        if (this.f4895e.f4899c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        g();
        Object[] objArr = this.f4891a;
        int i3 = this.f4893c;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[this.f4892b + i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i3) {
        Object i4;
        ((AbstractList) this).modCount++;
        C0300b c0300b = this.f4894d;
        if (c0300b != null) {
            i4 = c0300b.i(i3);
        } else {
            c cVar = c.f4896d;
            i4 = this.f4895e.i(i3);
        }
        this.f4893c--;
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        g();
        for (int i3 = 0; i3 < this.f4893c; i3++) {
            if (j.a(this.f4891a[this.f4892b + i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        g();
        return this.f4893c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0300b c0300b = this.f4894d;
        if (c0300b != null) {
            c0300b.j(i3, i4);
        } else {
            c cVar = c.f4896d;
            this.f4895e.j(i3, i4);
        }
        this.f4893c -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int k3;
        C0300b c0300b = this.f4894d;
        if (c0300b != null) {
            k3 = c0300b.k(i3, i4, collection, z3);
        } else {
            c cVar = c.f4896d;
            k3 = this.f4895e.k(i3, i4, collection, z3);
        }
        if (k3 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4893c -= k3;
        return k3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        g();
        for (int i3 = this.f4893c - 1; i3 >= 0; i3--) {
            if (j.a(this.f4891a[this.f4892b + i3], obj)) {
                return i3;
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
        h();
        g();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            c(indexOf);
        }
        return indexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        j.e(elements, "elements");
        h();
        g();
        return k(this.f4892b, this.f4893c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        j.e(elements, "elements");
        h();
        g();
        return k(this.f4892b, this.f4893c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        h();
        g();
        int i4 = this.f4893c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f4891a;
        int i5 = this.f4892b;
        Object obj2 = objArr[i5 + i3];
        objArr[i5 + i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0086a.h(i3, i4, this.f4893c);
        return new C0300b(this.f4891a, this.f4892b + i3, i4 - i3, this, this.f4895e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        j.e(array, "array");
        g();
        int length = array.length;
        int i3 = this.f4893c;
        int i4 = this.f4892b;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4891a, i4, i3 + i4, array.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0290e.T(0, i4, i3 + i4, this.f4891a, array);
        int i5 = this.f4893c;
        if (i5 < array.length) {
            array[i5] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        g();
        return X0.a.f(this.f4891a, this.f4892b, this.f4893c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        g();
        int i4 = this.f4893c;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return new C0299a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        h();
        g();
        int i4 = this.f4893c;
        if (i3 >= 0 && i3 <= i4) {
            f(this.f4892b + i3, obj);
            return;
        }
        throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection elements) {
        j.e(elements, "elements");
        h();
        g();
        int i4 = this.f4893c;
        if (i3 >= 0 && i3 <= i4) {
            int size = elements.size();
            e(this.f4892b + i3, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        g();
        Object[] objArr = this.f4891a;
        int i3 = this.f4893c;
        int i4 = this.f4892b;
        return AbstractC0290e.U(objArr, i4, i3 + i4);
    }
}
