package X3;

import a.AbstractC0444a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class k extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final Object[] f6083n = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public int f6084k;

    /* renamed from: l, reason: collision with root package name */
    public Object[] f6085l;

    /* renamed from: m, reason: collision with root package name */
    public int f6086m;

    public k() {
        this.f6085l = f6083n;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i5;
        int i6 = this.f6086m;
        if (i < 0 || i > i6) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i6, "index: ", ", size: "));
        }
        if (i == i6) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        l();
        f(this.f6086m + 1);
        int k5 = k(this.f6084k + i);
        int i7 = this.f6086m;
        if (i < ((i7 + 1) >> 1)) {
            if (k5 == 0) {
                Object[] objArr = this.f6085l;
                kotlin.jvm.internal.l.f("<this>", objArr);
                k5 = objArr.length;
            }
            int i8 = k5 - 1;
            int i9 = this.f6084k;
            if (i9 == 0) {
                Object[] objArr2 = this.f6085l;
                kotlin.jvm.internal.l.f("<this>", objArr2);
                i5 = objArr2.length - 1;
            } else {
                i5 = i9 - 1;
            }
            int i10 = this.f6084k;
            if (i8 >= i10) {
                Object[] objArr3 = this.f6085l;
                objArr3[i5] = objArr3[i10];
                l.t0(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f6085l;
                l.t0(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f6085l;
                objArr5[objArr5.length - 1] = objArr5[0];
                l.t0(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f6085l[i8] = obj;
            this.f6084k = i5;
        } else {
            int k6 = k(i7 + this.f6084k);
            if (k5 < k6) {
                Object[] objArr6 = this.f6085l;
                l.t0(k5 + 1, k5, k6, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f6085l;
                l.t0(1, 0, k6, objArr7, objArr7);
                Object[] objArr8 = this.f6085l;
                objArr8[0] = objArr8[objArr8.length - 1];
                l.t0(k5 + 1, k5, objArr8.length - 1, objArr8, objArr8);
            }
            this.f6085l[k5] = obj;
        }
        this.f6086m++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        int i5 = this.f6086m;
        if (i < 0 || i > i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f6086m) {
            return addAll(collection);
        }
        l();
        f(collection.size() + this.f6086m);
        int k5 = k(this.f6086m + this.f6084k);
        int k6 = k(this.f6084k + i);
        int size = collection.size();
        if (i >= ((this.f6086m + 1) >> 1)) {
            int i6 = k6 + size;
            if (k6 < k5) {
                int i7 = size + k5;
                Object[] objArr = this.f6085l;
                if (i7 <= objArr.length) {
                    l.t0(i6, k6, k5, objArr, objArr);
                } else if (i6 >= objArr.length) {
                    l.t0(i6 - objArr.length, k6, k5, objArr, objArr);
                } else {
                    int length = k5 - (i7 - objArr.length);
                    l.t0(0, length, k5, objArr, objArr);
                    Object[] objArr2 = this.f6085l;
                    l.t0(i6, k6, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f6085l;
                l.t0(size, 0, k5, objArr3, objArr3);
                Object[] objArr4 = this.f6085l;
                if (i6 >= objArr4.length) {
                    l.t0(i6 - objArr4.length, k6, objArr4.length, objArr4, objArr4);
                } else {
                    l.t0(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f6085l;
                    l.t0(i6, k6, objArr5.length - size, objArr5, objArr5);
                }
            }
            e(k6, collection);
            return true;
        }
        int i8 = this.f6084k;
        int i9 = i8 - size;
        if (k6 < i8) {
            Object[] objArr6 = this.f6085l;
            l.t0(i9, i8, objArr6.length, objArr6, objArr6);
            if (size >= k6) {
                Object[] objArr7 = this.f6085l;
                l.t0(objArr7.length - size, 0, k6, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f6085l;
                l.t0(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f6085l;
                l.t0(0, size, k6, objArr9, objArr9);
            }
        } else if (i9 >= 0) {
            Object[] objArr10 = this.f6085l;
            l.t0(i9, i8, k6, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f6085l;
            i9 += objArr11.length;
            int i10 = k6 - i8;
            int length2 = objArr11.length - i9;
            if (length2 >= i10) {
                l.t0(i9, i8, k6, objArr11, objArr11);
            } else {
                l.t0(i9, i8, i8 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f6085l;
                l.t0(0, this.f6084k + length2, k6, objArr12, objArr12);
            }
        }
        this.f6084k = i9;
        e(i(k6 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        l();
        f(this.f6086m + 1);
        int i = this.f6084k;
        if (i == 0) {
            Object[] objArr = this.f6085l;
            kotlin.jvm.internal.l.f("<this>", objArr);
            i = objArr.length;
        }
        int i5 = i - 1;
        this.f6084k = i5;
        this.f6085l[i5] = obj;
        this.f6086m++;
    }

    public final void addLast(Object obj) {
        l();
        f(c() + 1);
        this.f6085l[k(c() + this.f6084k)] = obj;
        this.f6086m = c() + 1;
    }

    @Override // X3.g
    public final int c() {
        return this.f6086m;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            l();
            j(this.f6084k, k(c() + this.f6084k));
        }
        this.f6084k = 0;
        this.f6086m = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // X3.g
    public final Object d(int i) {
        int i5 = this.f6086m;
        if (i < 0 || i >= i5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, i5, "index: ", ", size: "));
        }
        if (i == n.N(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        l();
        int k5 = k(this.f6084k + i);
        Object[] objArr = this.f6085l;
        Object obj = objArr[k5];
        if (i < (this.f6086m >> 1)) {
            int i6 = this.f6084k;
            if (k5 >= i6) {
                l.t0(i6 + 1, i6, k5, objArr, objArr);
            } else {
                l.t0(1, 0, k5, objArr, objArr);
                Object[] objArr2 = this.f6085l;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f6084k;
                l.t0(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f6085l;
            int i8 = this.f6084k;
            objArr3[i8] = null;
            this.f6084k = g(i8);
        } else {
            int k6 = k(n.N(this) + this.f6084k);
            if (k5 <= k6) {
                Object[] objArr4 = this.f6085l;
                l.t0(k5, k5 + 1, k6 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f6085l;
                l.t0(k5, k5 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f6085l;
                objArr6[objArr6.length - 1] = objArr6[0];
                l.t0(0, 1, k6 + 1, objArr6, objArr6);
            }
            this.f6085l[k6] = null;
        }
        this.f6086m--;
        return obj;
    }

    public final void e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f6085l.length;
        while (i < length && it.hasNext()) {
            this.f6085l[i] = it.next();
            i++;
        }
        int i5 = this.f6084k;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f6085l[i6] = it.next();
        }
        this.f6086m = collection.size() + this.f6086m;
    }

    public final void f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f6085l;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f6083n) {
            if (i < 10) {
                i = 10;
            }
            this.f6085l = new Object[i];
            return;
        }
        int length = objArr.length;
        int i5 = length + (length >> 1);
        if (i5 - i < 0) {
            i5 = i;
        }
        if (i5 - 2147483639 > 0) {
            i5 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i5];
        l.t0(0, this.f6084k, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f6085l;
        int length2 = objArr3.length;
        int i6 = this.f6084k;
        l.t0(length2 - i6, 0, i6, objArr3, objArr2);
        this.f6084k = 0;
        this.f6085l = objArr2;
    }

    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f6085l[this.f6084k];
    }

    public final int g(int i) {
        kotlin.jvm.internal.l.f("<this>", this.f6085l);
        if (i == r0.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int c5 = c();
        if (i < 0 || i >= c5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, c5, "index: ", ", size: "));
        }
        return this.f6085l[k(this.f6084k + i)];
    }

    public final Object h() {
        if (isEmpty()) {
            return null;
        }
        return this.f6085l[k(n.N(this) + this.f6084k)];
    }

    public final int i(int i) {
        return i < 0 ? i + this.f6085l.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int k5 = k(c() + this.f6084k);
        int i5 = this.f6084k;
        if (i5 < k5) {
            while (i5 < k5) {
                if (kotlin.jvm.internal.l.a(obj, this.f6085l[i5])) {
                    i = this.f6084k;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < k5) {
            return -1;
        }
        int length = this.f6085l.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < k5; i6++) {
                    if (kotlin.jvm.internal.l.a(obj, this.f6085l[i6])) {
                        i5 = i6 + this.f6085l.length;
                        i = this.f6084k;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.l.a(obj, this.f6085l[i5])) {
                i = this.f6084k;
                break;
            }
            i5++;
        }
        return i5 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final void j(int i, int i5) {
        if (i < i5) {
            l.B0(this.f6085l, i, i5);
            return;
        }
        Object[] objArr = this.f6085l;
        l.B0(objArr, i, objArr.length);
        l.B0(this.f6085l, 0, i5);
    }

    public final int k(int i) {
        Object[] objArr = this.f6085l;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void l() {
        ((AbstractList) this).modCount++;
    }

    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        return this.f6085l[k(n.N(this) + this.f6084k)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int k5 = k(this.f6086m + this.f6084k);
        int i5 = this.f6084k;
        if (i5 < k5) {
            length = k5 - 1;
            if (i5 <= length) {
                while (!kotlin.jvm.internal.l.a(obj, this.f6085l[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i = this.f6084k;
                return length - i;
            }
            return -1;
        }
        if (i5 > k5) {
            int i6 = k5 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f6085l;
                    kotlin.jvm.internal.l.f("<this>", objArr);
                    length = objArr.length - 1;
                    int i7 = this.f6084k;
                    if (i7 <= length) {
                        while (!kotlin.jvm.internal.l.a(obj, this.f6085l[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i = this.f6084k;
                    }
                } else {
                    if (kotlin.jvm.internal.l.a(obj, this.f6085l[i6])) {
                        length = i6 + this.f6085l.length;
                        i = this.f6084k;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        d(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int k5;
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f6085l.length != 0) {
            int k6 = k(this.f6086m + this.f6084k);
            int i = this.f6084k;
            if (i < k6) {
                k5 = i;
                while (i < k6) {
                    Object obj = this.f6085l[i];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f6085l[k5] = obj;
                        k5++;
                    }
                    i++;
                }
                l.B0(this.f6085l, k5, k6);
            } else {
                int length = this.f6085l.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f6085l;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f6085l[i5] = obj2;
                        i5++;
                    }
                    i++;
                }
                k5 = k(i5);
                for (int i6 = 0; i6 < k6; i6++) {
                    Object[] objArr2 = this.f6085l;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f6085l[k5] = obj3;
                        k5 = g(k5);
                    }
                }
                z3 = z5;
            }
            if (z3) {
                l();
                this.f6086m = i(k5 - this.f6084k);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        Object[] objArr = this.f6085l;
        int i = this.f6084k;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f6084k = g(i);
        this.f6086m = c() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        l();
        int k5 = k(n.N(this) + this.f6084k);
        Object[] objArr = this.f6085l;
        Object obj = objArr[k5];
        objArr[k5] = null;
        this.f6086m = c() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i5) {
        AbstractC0444a.l(i, i5, this.f6086m);
        int i6 = i5 - i;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f6086m) {
            clear();
            return;
        }
        if (i6 == 1) {
            d(i);
            return;
        }
        l();
        if (i < this.f6086m - i5) {
            int k5 = k((i - 1) + this.f6084k);
            int k6 = k((i5 - 1) + this.f6084k);
            while (i > 0) {
                int i7 = k5 + 1;
                int min = Math.min(i, Math.min(i7, k6 + 1));
                Object[] objArr = this.f6085l;
                int i8 = k6 - min;
                int i9 = k5 - min;
                l.t0(i8 + 1, i9 + 1, i7, objArr, objArr);
                k5 = i(i9);
                k6 = i(i8);
                i -= min;
            }
            int k7 = k(this.f6084k + i6);
            j(this.f6084k, k7);
            this.f6084k = k7;
        } else {
            int k8 = k(this.f6084k + i5);
            int k9 = k(this.f6084k + i);
            int i10 = this.f6086m;
            while (true) {
                i10 -= i5;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f6085l;
                i5 = Math.min(i10, Math.min(objArr2.length - k8, objArr2.length - k9));
                Object[] objArr3 = this.f6085l;
                int i11 = k8 + i5;
                l.t0(k9, k8, i11, objArr3, objArr3);
                k8 = k(i11);
                k9 = k(k9 + i5);
            }
            int k10 = k(this.f6086m + this.f6084k);
            j(i(k10 - i6), k10);
        }
        this.f6086m -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int k5;
        kotlin.jvm.internal.l.f("elements", collection);
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f6085l.length != 0) {
            int k6 = k(this.f6086m + this.f6084k);
            int i = this.f6084k;
            if (i < k6) {
                k5 = i;
                while (i < k6) {
                    Object obj = this.f6085l[i];
                    if (collection.contains(obj)) {
                        this.f6085l[k5] = obj;
                        k5++;
                    } else {
                        z3 = true;
                    }
                    i++;
                }
                l.B0(this.f6085l, k5, k6);
            } else {
                int length = this.f6085l.length;
                boolean z5 = false;
                int i5 = i;
                while (i < length) {
                    Object[] objArr = this.f6085l;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f6085l[i5] = obj2;
                        i5++;
                    } else {
                        z5 = true;
                    }
                    i++;
                }
                k5 = k(i5);
                for (int i6 = 0; i6 < k6; i6++) {
                    Object[] objArr2 = this.f6085l;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f6085l[k5] = obj3;
                        k5 = g(k5);
                    } else {
                        z5 = true;
                    }
                }
                z3 = z5;
            }
            if (z3) {
                l();
                this.f6086m = i(k5 - this.f6084k);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int c5 = c();
        if (i < 0 || i >= c5) {
            throw new IndexOutOfBoundsException(L1.a.k(i, c5, "index: ", ", size: "));
        }
        int k5 = k(this.f6084k + i);
        Object[] objArr = this.f6085l;
        Object obj2 = objArr[k5];
        objArr[k5] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    public k(int i) {
        Object[] objArr;
        if (i == 0) {
            objArr = f6083n;
        } else if (i > 0) {
            objArr = new Object[i];
        } else {
            throw new IllegalArgumentException(AbstractC2107A.q("Illegal Capacity: ", i));
        }
        this.f6085l = objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        kotlin.jvm.internal.l.f("array", objArr);
        int length = objArr.length;
        int i = this.f6086m;
        if (length < i) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", newInstance);
            objArr = (Object[]) newInstance;
        }
        int k5 = k(this.f6086m + this.f6084k);
        int i5 = this.f6084k;
        if (i5 < k5) {
            l.y0(i5, k5, 2, this.f6085l, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f6085l;
            l.t0(0, this.f6084k, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f6085l;
            l.t0(objArr3.length - this.f6084k, 0, k5, objArr3, objArr);
        }
        int i6 = this.f6086m;
        if (i6 < objArr.length) {
            objArr[i6] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        kotlin.jvm.internal.l.f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        l();
        f(collection.size() + c());
        e(k(c() + this.f6084k), collection);
        return true;
    }
}
