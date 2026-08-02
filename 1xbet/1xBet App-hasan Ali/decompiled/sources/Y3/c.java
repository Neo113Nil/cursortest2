package Y3;

import a.AbstractC0444a;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c extends X3.g implements RandomAccess, Serializable {

    /* renamed from: n, reason: collision with root package name */
    public static final c f6147n;

    /* renamed from: k, reason: collision with root package name */
    public Object[] f6148k;

    /* renamed from: l, reason: collision with root package name */
    public int f6149l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6150m;

    static {
        c cVar = new c(0);
        cVar.f6150m = true;
        f6147n = cVar;
    }

    public c(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.f6148k = new Object[i];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        h();
        int i = this.f6149l;
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.f6148k[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        l.f("elements", collection);
        h();
        int size = collection.size();
        f(this.f6149l, collection, size);
        return size > 0;
    }

    @Override // X3.g
    public final int c() {
        return this.f6149l;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        h();
        k(0, this.f6149l);
    }

    @Override // X3.g
    public final Object d(int i) {
        h();
        int i5 = this.f6149l;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return j(i);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (G4.l.g(this.f6148k, 0, this.f6149l, (List) obj)) {
                return true;
            }
        }
        return false;
    }

    public final void f(int i, Collection collection, int i5) {
        ((AbstractList) this).modCount++;
        i(i, i5);
        Iterator it = collection.iterator();
        for (int i6 = 0; i6 < i5; i6++) {
            this.f6148k[i + i6] = it.next();
        }
    }

    public final void g(int i, Object obj) {
        ((AbstractList) this).modCount++;
        i(i, 1);
        this.f6148k[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i5 = this.f6149l;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return this.f6148k[i];
    }

    public final void h() {
        if (this.f6150m) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f6148k;
        int i = this.f6149l;
        int i5 = 1;
        for (int i6 = 0; i6 < i; i6++) {
            Object obj = objArr[i6];
            i5 = (i5 * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return i5;
    }

    public final void i(int i, int i5) {
        int i6 = this.f6149l + i5;
        if (i6 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f6148k;
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
            l.e("copyOf(...)", copyOf);
            this.f6148k = copyOf;
        }
        Object[] objArr2 = this.f6148k;
        X3.l.t0(i + i5, i, this.f6149l, objArr2, objArr2);
        this.f6149l += i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f6149l; i++) {
            if (l.a(this.f6148k[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6149l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final Object j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f6148k;
        Object obj = objArr[i];
        X3.l.t0(i, i + 1, this.f6149l, objArr, objArr);
        Object[] objArr2 = this.f6148k;
        int i5 = this.f6149l - 1;
        l.f("<this>", objArr2);
        objArr2[i5] = null;
        this.f6149l--;
        return obj;
    }

    public final void k(int i, int i5) {
        if (i5 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f6148k;
        X3.l.t0(i, i + i5, this.f6149l, objArr, objArr);
        Object[] objArr2 = this.f6148k;
        int i6 = this.f6149l;
        G4.l.J(objArr2, i6 - i5, i6);
        this.f6149l -= i5;
    }

    public final int l(int i, int i5, Collection collection, boolean z3) {
        int i6 = 0;
        int i7 = 0;
        while (i6 < i5) {
            int i8 = i + i6;
            if (collection.contains(this.f6148k[i8]) == z3) {
                Object[] objArr = this.f6148k;
                i6++;
                objArr[i7 + i] = objArr[i8];
                i7++;
            } else {
                i6++;
            }
        }
        int i9 = i5 - i7;
        Object[] objArr2 = this.f6148k;
        X3.l.t0(i + i7, i5 + i, this.f6149l, objArr2, objArr2);
        Object[] objArr3 = this.f6148k;
        int i10 = this.f6149l;
        G4.l.J(objArr3, i10 - i9, i10);
        if (i9 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f6149l -= i9;
        return i9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f6149l - 1; i >= 0; i--) {
            if (l.a(this.f6148k[i], obj)) {
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
        h();
        return l(0, this.f6149l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        l.f("elements", collection);
        h();
        return l(0, this.f6149l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        h();
        int i5 = this.f6149l;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        Object[] objArr = this.f6148k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i5) {
        AbstractC0444a.l(i, i5, this.f6149l);
        return new b(this.f6148k, i, i5 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        l.f("array", objArr);
        int length = objArr.length;
        int i = this.f6149l;
        if (length < i) {
            Object[] copyOfRange = Arrays.copyOfRange(this.f6148k, 0, i, objArr.getClass());
            l.e("copyOfRange(...)", copyOfRange);
            return copyOfRange;
        }
        X3.l.t0(0, 0, i, this.f6148k, objArr);
        int i5 = this.f6149l;
        if (i5 < objArr.length) {
            objArr[i5] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return G4.l.h(this.f6148k, 0, this.f6149l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i5 = this.f6149l;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        return new a(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        l.f("elements", collection);
        h();
        int i5 = this.f6149l;
        if (i >= 0 && i <= i5) {
            int size = collection.size();
            f(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        h();
        int i5 = this.f6149l;
        if (i >= 0 && i <= i5) {
            ((AbstractList) this).modCount++;
            i(i, 1);
            this.f6148k[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return X3.l.A0(this.f6148k, 0, this.f6149l);
    }
}
