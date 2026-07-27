package h4;

import B0.o;
import g4.AbstractC0460e;
import g4.AbstractC0464i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import u1.AbstractC1477a;

/* renamed from: h4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0484b extends AbstractC0460e implements RandomAccess, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5789a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5790b;

    /* renamed from: c, reason: collision with root package name */
    public int f5791c;

    /* renamed from: d, reason: collision with root package name */
    public final C0484b f5792d;

    /* renamed from: e, reason: collision with root package name */
    public final C0485c f5793e;

    public C0484b(Object[] backing, int i2, int i3, C0484b c0484b, C0485c root) {
        int i6;
        kotlin.jvm.internal.i.e(backing, "backing");
        kotlin.jvm.internal.i.e(root, "root");
        this.f5789a = backing;
        this.f5790b = i2;
        this.f5791c = i3;
        this.f5792d = c0484b;
        this.f5793e = root;
        i6 = ((AbstractList) root).modCount;
        ((AbstractList) this).modCount = i6;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        h();
        g(this.f5790b + this.f5791c, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        i();
        h();
        int size = elements.size();
        f(this.f5790b + this.f5791c, elements, size);
        return size > 0;
    }

    @Override // g4.AbstractC0460e
    public final int c() {
        h();
        return this.f5791c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        i();
        h();
        k(this.f5790b, this.f5791c);
    }

    @Override // g4.AbstractC0460e
    public final Object d(int i2) {
        i();
        h();
        int i3 = this.f5791c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return j(this.f5790b + i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        h();
        if (obj != this) {
            if (obj instanceof List) {
                if (K1.b.A(this.f5789a, this.f5790b, this.f5791c, (List) obj)) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        C0485c c0485c = this.f5793e;
        C0484b c0484b = this.f5792d;
        if (c0484b != null) {
            c0484b.f(i2, collection, i3);
        } else {
            C0485c c0485c2 = C0485c.f5794d;
            c0485c.f(i2, collection, i3);
        }
        this.f5789a = c0485c.f5795a;
        this.f5791c += i3;
    }

    public final void g(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        C0485c c0485c = this.f5793e;
        C0484b c0484b = this.f5792d;
        if (c0484b != null) {
            c0484b.g(i2, obj);
        } else {
            C0485c c0485c2 = C0485c.f5794d;
            c0485c.g(i2, obj);
        }
        this.f5789a = c0485c.f5795a;
        this.f5791c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        h();
        int i3 = this.f5791c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return this.f5789a[this.f5790b + i2];
    }

    public final void h() {
        int i2;
        i2 = ((AbstractList) this.f5793e).modCount;
        if (i2 != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        h();
        Object[] objArr = this.f5789a;
        int i2 = this.f5791c;
        int i3 = 1;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[this.f5790b + i6];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i() {
        if (this.f5793e.f5797c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        h();
        for (int i2 = 0; i2 < this.f5791c; i2++) {
            if (kotlin.jvm.internal.i.a(this.f5789a[this.f5790b + i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        h();
        return this.f5791c == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i2) {
        Object j2;
        ((AbstractList) this).modCount++;
        C0484b c0484b = this.f5792d;
        if (c0484b != null) {
            j2 = c0484b.j(i2);
        } else {
            C0485c c0485c = C0485c.f5794d;
            j2 = this.f5793e.j(i2);
        }
        this.f5791c--;
        return j2;
    }

    public final void k(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0484b c0484b = this.f5792d;
        if (c0484b != null) {
            c0484b.k(i2, i3);
        } else {
            C0485c c0485c = C0485c.f5794d;
            this.f5793e.k(i2, i3);
        }
        this.f5791c -= i3;
    }

    public final int l(int i2, int i3, Collection collection, boolean z) {
        int l2;
        C0484b c0484b = this.f5792d;
        if (c0484b != null) {
            l2 = c0484b.l(i2, i3, collection, z);
        } else {
            C0485c c0485c = C0485c.f5794d;
            l2 = this.f5793e.l(i2, i3, collection, z);
        }
        if (l2 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5791c -= l2;
        return l2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        h();
        for (int i2 = this.f5791c - 1; i2 >= 0; i2--) {
            if (kotlin.jvm.internal.i.a(this.f5789a[this.f5790b + i2], obj)) {
                return i2;
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
    public final boolean removeAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        i();
        h();
        return l(this.f5790b, this.f5791c, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        i();
        h();
        return l(this.f5790b, this.f5791c, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        i();
        h();
        int i3 = this.f5791c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        Object[] objArr = this.f5789a;
        int i6 = this.f5790b;
        Object obj2 = objArr[i6 + i2];
        objArr[i6 + i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC1477a.d(i2, i3, this.f5791c);
        return new C0484b(this.f5789a, this.f5790b + i2, i3 - i2, this, this.f5793e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        h();
        int length = array.length;
        int i2 = this.f5791c;
        int i3 = this.f5790b;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f5789a, i3, i2 + i3, array.getClass());
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0464i.P(0, i3, i2 + i3, this.f5789a, array);
        int i6 = this.f5791c;
        if (i6 < array.length) {
            array[i6] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        h();
        return K1.b.B(this.f5789a, this.f5790b, this.f5791c, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        h();
        int i3 = this.f5791c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return new C0483a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        i();
        h();
        int i3 = this.f5791c;
        if (i2 >= 0 && i2 <= i3) {
            g(this.f5790b + i2, obj);
            return;
        }
        throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        i();
        h();
        int i3 = this.f5791c;
        if (i2 >= 0 && i2 <= i3) {
            int size = elements.size();
            f(this.f5790b + i2, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        h();
        Object[] objArr = this.f5789a;
        int i2 = this.f5791c;
        int i3 = this.f5790b;
        return AbstractC0464i.R(i3, i2 + i3, objArr);
    }
}
