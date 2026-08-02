package g6;

import W5.AbstractC0486a1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: g6.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1157f extends AbstractList implements List, u6.b {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f13297d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f13298a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f13299b = f13297d;

    /* renamed from: c, reason: collision with root package name */
    public int f13300c;

    public final int A(int i7) {
        Object[] objArr = this.f13299b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void B() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int i8;
        int i9 = this.f13300c;
        if (i7 < 0 || i7 > i9) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i9, "index: ", ", size: "));
        }
        if (i7 == i9) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        B();
        m(this.f13300c + 1);
        int A7 = A(this.f13298a + i7);
        int i10 = this.f13300c;
        if (i7 < ((i10 + 1) >> 1)) {
            if (A7 == 0) {
                Object[] objArr = this.f13299b;
                t6.h.e(objArr, "<this>");
                A7 = objArr.length;
            }
            int i11 = A7 - 1;
            int i12 = this.f13298a;
            if (i12 == 0) {
                Object[] objArr2 = this.f13299b;
                t6.h.e(objArr2, "<this>");
                i8 = objArr2.length - 1;
            } else {
                i8 = i12 - 1;
            }
            int i13 = this.f13298a;
            if (i11 >= i13) {
                Object[] objArr3 = this.f13299b;
                objArr3[i8] = objArr3[i13];
                AbstractC1158g.r0(objArr3, i13, objArr3, i13 + 1, i11 + 1);
            } else {
                Object[] objArr4 = this.f13299b;
                AbstractC1158g.r0(objArr4, i13 - 1, objArr4, i13, objArr4.length);
                Object[] objArr5 = this.f13299b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC1158g.r0(objArr5, 0, objArr5, 1, i11 + 1);
            }
            this.f13299b[i11] = obj;
            this.f13298a = i8;
        } else {
            int A8 = A(this.f13298a + i10);
            if (A7 < A8) {
                Object[] objArr6 = this.f13299b;
                AbstractC1158g.r0(objArr6, A7 + 1, objArr6, A7, A8);
            } else {
                Object[] objArr7 = this.f13299b;
                AbstractC1158g.r0(objArr7, 1, objArr7, 0, A8);
                Object[] objArr8 = this.f13299b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC1158g.r0(objArr8, A7 + 1, objArr8, A7, objArr8.length - 1);
            }
            this.f13299b[A7] = obj;
        }
        this.f13300c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        t6.h.e(collection, "elements");
        int i8 = this.f13300c;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f13300c) {
            return addAll(collection);
        }
        B();
        m(collection.size() + this.f13300c);
        int A7 = A(this.f13298a + this.f13300c);
        int A8 = A(this.f13298a + i7);
        int size = collection.size();
        if (i7 < ((this.f13300c + 1) >> 1)) {
            int i9 = this.f13298a;
            int i10 = i9 - size;
            if (A8 < i9) {
                Object[] objArr = this.f13299b;
                AbstractC1158g.r0(objArr, i10, objArr, i9, objArr.length);
                if (size >= A8) {
                    Object[] objArr2 = this.f13299b;
                    AbstractC1158g.r0(objArr2, objArr2.length - size, objArr2, 0, A8);
                } else {
                    Object[] objArr3 = this.f13299b;
                    AbstractC1158g.r0(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f13299b;
                    AbstractC1158g.r0(objArr4, 0, objArr4, size, A8);
                }
            } else if (i10 >= 0) {
                Object[] objArr5 = this.f13299b;
                AbstractC1158g.r0(objArr5, i10, objArr5, i9, A8);
            } else {
                Object[] objArr6 = this.f13299b;
                i10 += objArr6.length;
                int i11 = A8 - i9;
                int length = objArr6.length - i10;
                if (length >= i11) {
                    AbstractC1158g.r0(objArr6, i10, objArr6, i9, A8);
                } else {
                    AbstractC1158g.r0(objArr6, i10, objArr6, i9, i9 + length);
                    Object[] objArr7 = this.f13299b;
                    AbstractC1158g.r0(objArr7, 0, objArr7, this.f13298a + length, A8);
                }
            }
            this.f13298a = i10;
            l(y(A8 - size), collection);
        } else {
            int i12 = A8 + size;
            if (A8 < A7) {
                int i13 = size + A7;
                Object[] objArr8 = this.f13299b;
                if (i13 <= objArr8.length) {
                    AbstractC1158g.r0(objArr8, i12, objArr8, A8, A7);
                } else if (i12 >= objArr8.length) {
                    AbstractC1158g.r0(objArr8, i12 - objArr8.length, objArr8, A8, A7);
                } else {
                    int length2 = A7 - (i13 - objArr8.length);
                    AbstractC1158g.r0(objArr8, 0, objArr8, length2, A7);
                    Object[] objArr9 = this.f13299b;
                    AbstractC1158g.r0(objArr9, i12, objArr9, A8, length2);
                }
            } else {
                Object[] objArr10 = this.f13299b;
                AbstractC1158g.r0(objArr10, size, objArr10, 0, A7);
                Object[] objArr11 = this.f13299b;
                if (i12 >= objArr11.length) {
                    AbstractC1158g.r0(objArr11, i12 - objArr11.length, objArr11, A8, objArr11.length);
                } else {
                    AbstractC1158g.r0(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f13299b;
                    AbstractC1158g.r0(objArr12, i12, objArr12, A8, objArr12.length - size);
                }
            }
            l(A8, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        B();
        m(this.f13300c + 1);
        int i7 = this.f13298a;
        if (i7 == 0) {
            Object[] objArr = this.f13299b;
            t6.h.e(objArr, "<this>");
            i7 = objArr.length;
        }
        int i8 = i7 - 1;
        this.f13298a = i8;
        this.f13299b[i8] = obj;
        this.f13300c++;
    }

    public final void addLast(Object obj) {
        B();
        m(this.f13300c + 1);
        this.f13299b[A(this.f13298a + this.f13300c)] = obj;
        this.f13300c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            B();
            z(this.f13298a, A(this.f13298a + this.f13300c));
        }
        this.f13298a = 0;
        this.f13300c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f13300c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        return this.f13299b[A(this.f13298a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int A7 = A(this.f13298a + this.f13300c);
        int i8 = this.f13298a;
        if (i8 < A7) {
            while (i8 < A7) {
                if (t6.h.a(obj, this.f13299b[i8])) {
                    i7 = this.f13298a;
                } else {
                    i8++;
                }
            }
            return -1;
        }
        if (i8 < A7) {
            return -1;
        }
        int length = this.f13299b.length;
        while (true) {
            if (i8 >= length) {
                for (int i9 = 0; i9 < A7; i9++) {
                    if (t6.h.a(obj, this.f13299b[i9])) {
                        i8 = i9 + this.f13299b.length;
                        i7 = this.f13298a;
                    }
                }
                return -1;
            }
            if (t6.h.a(obj, this.f13299b[i8])) {
                i7 = this.f13298a;
                break;
            }
            i8++;
        }
        return i8 - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13300c == 0;
    }

    public final void l(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13299b.length;
        while (i7 < length && it.hasNext()) {
            this.f13299b[i7] = it.next();
            i7++;
        }
        int i8 = this.f13298a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f13299b[i9] = it.next();
        }
        this.f13300c = collection.size() + this.f13300c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int A7 = A(this.f13298a + this.f13300c);
        int i8 = this.f13298a;
        if (i8 < A7) {
            length = A7 - 1;
            if (i8 <= length) {
                while (!t6.h.a(obj, this.f13299b[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f13298a;
                return length - i7;
            }
            return -1;
        }
        if (i8 > A7) {
            int i9 = A7 - 1;
            while (true) {
                if (-1 >= i9) {
                    Object[] objArr = this.f13299b;
                    t6.h.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i10 = this.f13298a;
                    if (i10 <= length) {
                        while (!t6.h.a(obj, this.f13299b[length])) {
                            if (length != i10) {
                                length--;
                            }
                        }
                        i7 = this.f13298a;
                    }
                } else {
                    if (t6.h.a(obj, this.f13299b[i9])) {
                        length = i9 + this.f13299b.length;
                        i7 = this.f13298a;
                        break;
                    }
                    i9--;
                }
            }
        }
        return -1;
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13299b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f13297d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f13299b = new Object[i7];
            return;
        }
        int length = objArr.length;
        int i8 = length + (length >> 1);
        if (i8 - i7 < 0) {
            i8 = i7;
        }
        if (i8 - 2147483639 > 0) {
            i8 = i7 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i8];
        AbstractC1158g.r0(objArr, 0, objArr2, this.f13298a, objArr.length);
        Object[] objArr3 = this.f13299b;
        int length2 = objArr3.length;
        int i9 = this.f13298a;
        AbstractC1158g.r0(objArr3, length2 - i9, objArr2, 0, i9);
        this.f13298a = 0;
        this.f13299b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8 = this.f13300c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        if (i7 == AbstractC1160i.L0(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        B();
        int A7 = A(this.f13298a + i7);
        Object[] objArr = this.f13299b;
        Object obj = objArr[A7];
        if (i7 < (this.f13300c >> 1)) {
            int i9 = this.f13298a;
            if (A7 >= i9) {
                AbstractC1158g.r0(objArr, i9 + 1, objArr, i9, A7);
            } else {
                AbstractC1158g.r0(objArr, 1, objArr, 0, A7);
                Object[] objArr2 = this.f13299b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f13298a;
                AbstractC1158g.r0(objArr2, i10 + 1, objArr2, i10, objArr2.length - 1);
            }
            Object[] objArr3 = this.f13299b;
            int i11 = this.f13298a;
            objArr3[i11] = null;
            this.f13298a = t(i11);
        } else {
            int A8 = A(AbstractC1160i.L0(this) + this.f13298a);
            if (A7 <= A8) {
                Object[] objArr4 = this.f13299b;
                AbstractC1158g.r0(objArr4, A7, objArr4, A7 + 1, A8 + 1);
            } else {
                Object[] objArr5 = this.f13299b;
                AbstractC1158g.r0(objArr5, A7, objArr5, A7 + 1, objArr5.length);
                Object[] objArr6 = this.f13299b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC1158g.r0(objArr6, 0, objArr6, 1, A8 + 1);
            }
            this.f13299b[A8] = null;
        }
        this.f13300c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int A7;
        t6.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f13299b.length != 0) {
            int A8 = A(this.f13298a + this.f13300c);
            int i7 = this.f13298a;
            if (i7 < A8) {
                A7 = i7;
                while (i7 < A8) {
                    Object obj = this.f13299b[i7];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f13299b[A7] = obj;
                        A7++;
                    }
                    i7++;
                }
                AbstractC1158g.s0(this.f13299b, A7, A8);
            } else {
                int length = this.f13299b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f13299b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f13299b[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                A7 = A(i8);
                for (int i9 = 0; i9 < A8; i9++) {
                    Object[] objArr2 = this.f13299b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f13299b[A7] = obj3;
                        A7 = t(A7);
                    }
                }
                z4 = z7;
            }
            if (z4) {
                B();
                this.f13300c = y(A7 - this.f13298a);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        B();
        Object[] objArr = this.f13299b;
        int i7 = this.f13298a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f13298a = t(i7);
        this.f13300c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        B();
        int A7 = A(AbstractC1160i.L0(this) + this.f13298a);
        Object[] objArr = this.f13299b;
        Object obj = objArr[A7];
        objArr[A7] = null;
        this.f13300c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        P6.b.b(i7, i8, this.f13300c);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f13300c) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        B();
        if (i7 < this.f13300c - i8) {
            int A7 = A((i7 - 1) + this.f13298a);
            int A8 = A((i8 - 1) + this.f13298a);
            while (i7 > 0) {
                int i10 = A7 + 1;
                int min = Math.min(i7, Math.min(i10, A8 + 1));
                Object[] objArr = this.f13299b;
                int i11 = A8 - min;
                int i12 = A7 - min;
                AbstractC1158g.r0(objArr, i11 + 1, objArr, i12 + 1, i10);
                A7 = y(i12);
                A8 = y(i11);
                i7 -= min;
            }
            int A9 = A(this.f13298a + i9);
            z(this.f13298a, A9);
            this.f13298a = A9;
        } else {
            int A10 = A(this.f13298a + i8);
            int A11 = A(this.f13298a + i7);
            int i13 = this.f13300c;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13299b;
                i8 = Math.min(i13, Math.min(objArr2.length - A10, objArr2.length - A11));
                Object[] objArr3 = this.f13299b;
                int i14 = A10 + i8;
                AbstractC1158g.r0(objArr3, A11, objArr3, A10, i14);
                A10 = A(i14);
                A11 = A(A11 + i8);
            }
            int A12 = A(this.f13298a + this.f13300c);
            z(y(A12 - i9), A12);
        }
        this.f13300c -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int A7;
        t6.h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f13299b.length != 0) {
            int A8 = A(this.f13298a + this.f13300c);
            int i7 = this.f13298a;
            if (i7 < A8) {
                A7 = i7;
                while (i7 < A8) {
                    Object obj = this.f13299b[i7];
                    if (collection.contains(obj)) {
                        this.f13299b[A7] = obj;
                        A7++;
                    } else {
                        z4 = true;
                    }
                    i7++;
                }
                AbstractC1158g.s0(this.f13299b, A7, A8);
            } else {
                int length = this.f13299b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f13299b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f13299b[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                A7 = A(i8);
                for (int i9 = 0; i9 < A8; i9++) {
                    Object[] objArr2 = this.f13299b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f13299b[A7] = obj3;
                        A7 = t(A7);
                    } else {
                        z7 = true;
                    }
                }
                z4 = z7;
            }
            if (z4) {
                B();
                this.f13300c = y(A7 - this.f13298a);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i8 = this.f13300c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        int A7 = A(this.f13298a + i7);
        Object[] objArr = this.f13299b;
        Object obj2 = objArr[A7];
        objArr[A7] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13300c;
    }

    public final int t(int i7) {
        t6.h.e(this.f13299b, "<this>");
        if (i7 == r0.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f13300c]);
    }

    public final int y(int i7) {
        return i7 < 0 ? i7 + this.f13299b.length : i7;
    }

    public final void z(int i7, int i8) {
        if (i7 < i8) {
            AbstractC1158g.s0(this.f13299b, i7, i8);
            return;
        }
        Object[] objArr = this.f13299b;
        AbstractC1158g.s0(objArr, i7, objArr.length);
        AbstractC1158g.s0(this.f13299b, 0, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        t6.h.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13300c;
        if (length < i7) {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            t6.h.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) newInstance;
        }
        int A7 = A(this.f13298a + this.f13300c);
        int i8 = this.f13298a;
        if (i8 < A7) {
            AbstractC1158g.r0(this.f13299b, 0, objArr, i8, A7);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13299b;
            AbstractC1158g.r0(objArr2, 0, objArr, this.f13298a, objArr2.length);
            Object[] objArr3 = this.f13299b;
            AbstractC1158g.r0(objArr3, objArr3.length - this.f13298a, objArr, 0, A7);
        }
        int i9 = this.f13300c;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        t6.h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        B();
        m(collection.size() + this.f13300c);
        l(A(this.f13298a + this.f13300c), collection);
        return true;
    }
}
