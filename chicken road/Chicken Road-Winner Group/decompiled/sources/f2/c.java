package f2;

import a.AbstractC0086a;
import e2.AbstractC0286a;
import e2.AbstractC0290e;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class c extends AbstractC0286a implements RandomAccess, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final c f4896d;

    /* renamed from: a, reason: collision with root package name */
    public Object[] f4897a;

    /* renamed from: b, reason: collision with root package name */
    public int f4898b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4899c;

    static {
        c cVar = new c(0);
        cVar.f4899c = true;
        f4896d = cVar;
    }

    public c(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f4897a = new Object[i3];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        g();
        int i3 = this.f4898b;
        ((AbstractList) this).modCount++;
        h(i3, 1);
        this.f4897a[i3] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        j.e(elements, "elements");
        g();
        int size = elements.size();
        e(this.f4898b, elements, size);
        return size > 0;
    }

    @Override // e2.AbstractC0286a
    public final int b() {
        return this.f4898b;
    }

    @Override // e2.AbstractC0286a
    public final Object c(int i3) {
        g();
        int i4 = this.f4898b;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return i(i3);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        g();
        j(0, this.f4898b);
    }

    public final void e(int i3, Collection collection, int i4) {
        ((AbstractList) this).modCount++;
        h(i3, i4);
        Iterator it = collection.iterator();
        for (int i5 = 0; i5 < i4; i5++) {
            this.f4897a[i3 + i5] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (X0.a.e(this.f4897a, 0, this.f4898b, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i3, Object obj) {
        ((AbstractList) this).modCount++;
        h(i3, 1);
        this.f4897a[i3] = obj;
    }

    public final void g() {
        if (this.f4899c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int i4 = this.f4898b;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return this.f4897a[i3];
    }

    public final void h(int i3, int i4) {
        int i5 = this.f4898b + i4;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4897a;
        if (i5 > objArr.length) {
            int length = objArr.length;
            int i6 = length + (length >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] copyOf = Arrays.copyOf(objArr, i6);
            j.d(copyOf, "copyOf(...)");
            this.f4897a = copyOf;
        }
        Object[] objArr2 = this.f4897a;
        AbstractC0290e.T(i3 + i4, i3, this.f4898b, objArr2, objArr2);
        this.f4898b += i4;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4897a;
        int i3 = this.f4898b;
        int i4 = 1;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            i4 = (i4 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i4;
    }

    public final Object i(int i3) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4897a;
        Object obj = objArr[i3];
        AbstractC0290e.T(i3, i3 + 1, this.f4898b, objArr, objArr);
        Object[] objArr2 = this.f4897a;
        int i4 = this.f4898b - 1;
        j.e(objArr2, "<this>");
        objArr2[i4] = null;
        this.f4898b--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i3 = 0; i3 < this.f4898b; i3++) {
            if (j.a(this.f4897a[i3], obj)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4898b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void j(int i3, int i4) {
        if (i4 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4897a;
        AbstractC0290e.T(i3, i3 + i4, this.f4898b, objArr, objArr);
        Object[] objArr2 = this.f4897a;
        int i5 = this.f4898b;
        X0.a.F(objArr2, i5 - i4, i5);
        this.f4898b -= i4;
    }

    public final int k(int i3, int i4, Collection collection, boolean z3) {
        int i5 = 0;
        int i6 = 0;
        while (i5 < i4) {
            int i7 = i3 + i5;
            if (collection.contains(this.f4897a[i7]) == z3) {
                Object[] objArr = this.f4897a;
                i5++;
                objArr[i6 + i3] = objArr[i7];
                i6++;
            } else {
                i5++;
            }
        }
        int i8 = i4 - i6;
        Object[] objArr2 = this.f4897a;
        AbstractC0290e.T(i3 + i6, i4 + i3, this.f4898b, objArr2, objArr2);
        Object[] objArr3 = this.f4897a;
        int i9 = this.f4898b;
        X0.a.F(objArr3, i9 - i8, i9);
        if (i8 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4898b -= i8;
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i3 = this.f4898b - 1; i3 >= 0; i3--) {
            if (j.a(this.f4897a[i3], obj)) {
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
        g();
        return k(0, this.f4898b, elements, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        j.e(elements, "elements");
        g();
        return k(0, this.f4898b, elements, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        g();
        int i4 = this.f4898b;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        Object[] objArr = this.f4897a;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i3, int i4) {
        AbstractC0086a.h(i3, i4, this.f4898b);
        return new C0300b(this.f4897a, i3, i4 - i3, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        j.e(array, "array");
        int length = array.length;
        int i3 = this.f4898b;
        if (length < i3) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f4897a, 0, i3, array.getClass());
            j.d(copyOfRange, "copyOfRange(...)");
            return copyOfRange;
        }
        AbstractC0290e.T(0, 0, i3, this.f4897a, array);
        int i4 = this.f4898b;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return X0.a.f(this.f4897a, 0, this.f4898b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i3) {
        int i4 = this.f4898b;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        return new C0299a(this, i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection elements) {
        j.e(elements, "elements");
        g();
        int i4 = this.f4898b;
        if (i3 >= 0 && i3 <= i4) {
            int size = elements.size();
            e(i3, elements, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        g();
        int i4 = this.f4898b;
        if (i3 >= 0 && i3 <= i4) {
            ((AbstractList) this).modCount++;
            h(i3, 1);
            this.f4897a[i3] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return AbstractC0290e.U(this.f4897a, 0, this.f4898b);
    }
}
