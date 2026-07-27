package h4;

import B0.o;
import g4.AbstractC0460e;
import g4.AbstractC0464i;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import u1.AbstractC1477a;

/* renamed from: h4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0485c extends AbstractC0460e implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final C0485c f5794d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f5795a;

    /* renamed from: b, reason: collision with root package name */
    public int f5796b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5797c;

    static {
        C0485c c0485c = new C0485c(0);
        c0485c.f5797c = true;
        f5794d = c0485c;
    }

    public C0485c(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f5795a = new Object[i2];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i2 = this.f5796b;
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.f5795a[i2] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        h();
        int size = elements.size();
        f(this.f5796b, elements, size);
        return size > 0;
    }

    @Override // g4.AbstractC0460e
    public final int c() {
        return this.f5796b;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.f5796b);
    }

    @Override // g4.AbstractC0460e
    public final Object d(int i2) {
        h();
        int i3 = this.f5796b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return j(i2);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!K1.b.A(this.f5795a, 0, this.f5796b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i2, Collection collection, int i3) {
        ((AbstractList) this).modCount++;
        i(i2, i3);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i3; i6++) {
            this.f5795a[i2 + i6] = it.next();
        }
    }

    public final void g(int i2, Object obj) {
        ((AbstractList) this).modCount++;
        i(i2, 1);
        this.f5795a[i2] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f5796b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return this.f5795a[i2];
    }

    public final void h() {
        if (this.f5797c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f5795a;
        int i2 = this.f5796b;
        int i3 = 1;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj = objArr[i6];
            i3 = (i3 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i3;
    }

    public final void i(int i2, int i3) {
        int i6 = this.f5796b + i3;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f5795a;
        if (i6 > objArr.length) {
            int length = objArr.length;
            int i7 = length + (length >> 1);
            if (i7 - i6 < 0) {
                i7 = i6;
            }
            if (i7 - 2147483639 > 0) {
                i7 = i6 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i7);
            kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
            this.f5795a = copyOf;
        }
        Object[] objArr2 = this.f5795a;
        AbstractC0464i.P(i2 + i3, i2, this.f5796b, objArr2, objArr2);
        this.f5796b += i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i2 = 0; i2 < this.f5796b; i2++) {
            if (kotlin.jvm.internal.i.a(this.f5795a[i2], obj)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f5796b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i2) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f5795a;
        Object obj = objArr[i2];
        AbstractC0464i.P(i2, i2 + 1, this.f5796b, objArr, objArr);
        Object[] objArr2 = this.f5795a;
        int i3 = this.f5796b - 1;
        kotlin.jvm.internal.i.e(objArr2, "<this>");
        objArr2[i3] = null;
        this.f5796b--;
        return obj;
    }

    public final void k(int i2, int i3) {
        if (i3 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f5795a;
        AbstractC0464i.P(i2, i2 + i3, this.f5796b, objArr, objArr);
        Object[] objArr2 = this.f5795a;
        int i6 = this.f5796b;
        K1.b.l0(i6 - i3, i6, objArr2);
        this.f5796b -= i3;
    }

    public final int l(int i2, int i3, Collection collection, boolean z) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i3) {
            int i8 = i2 + i6;
            if (collection.contains(this.f5795a[i8]) == z) {
                Object[] objArr = this.f5795a;
                i6++;
                objArr[i7 + i2] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i3 - i7;
        Object[] objArr2 = this.f5795a;
        AbstractC0464i.P(i2 + i7, i3 + i2, this.f5796b, objArr2, objArr2);
        Object[] objArr3 = this.f5795a;
        int i10 = this.f5796b;
        K1.b.l0(i10 - i9, i10, objArr3);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f5796b -= i9;
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i2 = this.f5796b - 1; i2 >= 0; i2--) {
            if (kotlin.jvm.internal.i.a(this.f5795a[i2], obj)) {
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
        h();
        return l(0, this.f5796b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        h();
        return l(0, this.f5796b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        h();
        int i3 = this.f5796b;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        Object[] objArr = this.f5795a;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i2, int i3) {
        AbstractC1477a.d(i2, i3, this.f5796b);
        return new C0484b(this.f5795a, i2, i3 - i2, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i2 = this.f5796b;
        if (length < i2) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f5795a, 0, i2, array.getClass());
            kotlin.jvm.internal.i.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0464i.P(0, 0, i2, this.f5795a, array);
        int i3 = this.f5796b;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return K1.b.B(this.f5795a, 0, this.f5796b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i2) {
        int i3 = this.f5796b;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
        }
        return new C0483a(this, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        h();
        int i3 = this.f5796b;
        if (i2 >= 0 && i2 <= i3) {
            int size = elements.size();
            f(i2, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        h();
        int i3 = this.f5796b;
        if (i2 >= 0 && i2 <= i3) {
            ((AbstractList) this).modCount++;
            i(i2, 1);
            this.f5795a[i2] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(o.h("index: ", i2, i3, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0464i.R(0, this.f5796b, this.f5795a);
    }
}
