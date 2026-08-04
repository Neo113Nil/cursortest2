package p050g6;

import W5.AbstractC0486a1;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t6.h;
import u6.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends AbstractList implements List, b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f13303d = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f13305b = f13303d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13306c;

    public final int A(int i7) {
        Object[] objArr = this.f13305b;
        return i7 >= objArr.length ? i7 - objArr.length : i7;
    }

    public final void B() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i7, Object obj) {
        int length;
        int i8 = this.f13306c;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        if (i7 == i8) {
            addLast(obj);
            return;
        }
        if (i7 == 0) {
            addFirst(obj);
            return;
        }
        B();
        m(this.f13306c + 1);
        int iA = A(this.f13304a + i7);
        int i9 = this.f13306c;
        if (i7 < ((i9 + 1) >> 1)) {
            if (iA == 0) {
                Object[] objArr = this.f13305b;
                h.e(objArr, "<this>");
                iA = objArr.length;
            }
            int i10 = iA - 1;
            int i11 = this.f13304a;
            if (i11 == 0) {
                Object[] objArr2 = this.f13305b;
                h.e(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i11 - 1;
            }
            int i12 = this.f13304a;
            if (i10 >= i12) {
                Object[] objArr3 = this.f13305b;
                objArr3[length] = objArr3[i12];
                g.r0(objArr3, i12, objArr3, i12 + 1, i10 + 1);
            } else {
                Object[] objArr4 = this.f13305b;
                g.r0(objArr4, i12 - 1, objArr4, i12, objArr4.length);
                Object[] objArr5 = this.f13305b;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.r0(objArr5, 0, objArr5, 1, i10 + 1);
            }
            this.f13305b[i10] = obj;
            this.f13304a = length;
        } else {
            int iA2 = A(this.f13304a + i9);
            if (iA < iA2) {
                Object[] objArr6 = this.f13305b;
                g.r0(objArr6, iA + 1, objArr6, iA, iA2);
            } else {
                Object[] objArr7 = this.f13305b;
                g.r0(objArr7, 1, objArr7, 0, iA2);
                Object[] objArr8 = this.f13305b;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.r0(objArr8, iA + 1, objArr8, iA, objArr8.length - 1);
            }
            this.f13305b[iA] = obj;
        }
        this.f13306c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i7, Collection collection) {
        h.e(collection, "elements");
        int i8 = this.f13306c;
        if (i7 < 0 || i7 > i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i7 == this.f13306c) {
            return addAll(collection);
        }
        B();
        m(collection.size() + this.f13306c);
        int iA = A(this.f13304a + this.f13306c);
        int iA2 = A(this.f13304a + i7);
        int size = collection.size();
        if (i7 < ((this.f13306c + 1) >> 1)) {
            int i9 = this.f13304a;
            int length = i9 - size;
            if (iA2 < i9) {
                Object[] objArr = this.f13305b;
                g.r0(objArr, length, objArr, i9, objArr.length);
                if (size >= iA2) {
                    Object[] objArr2 = this.f13305b;
                    g.r0(objArr2, objArr2.length - size, objArr2, 0, iA2);
                } else {
                    Object[] objArr3 = this.f13305b;
                    g.r0(objArr3, objArr3.length - size, objArr3, 0, size);
                    Object[] objArr4 = this.f13305b;
                    g.r0(objArr4, 0, objArr4, size, iA2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f13305b;
                g.r0(objArr5, length, objArr5, i9, iA2);
            } else {
                Object[] objArr6 = this.f13305b;
                length += objArr6.length;
                int i10 = iA2 - i9;
                int length2 = objArr6.length - length;
                if (length2 >= i10) {
                    g.r0(objArr6, length, objArr6, i9, iA2);
                } else {
                    g.r0(objArr6, length, objArr6, i9, i9 + length2);
                    Object[] objArr7 = this.f13305b;
                    g.r0(objArr7, 0, objArr7, this.f13304a + length2, iA2);
                }
            }
            this.f13304a = length;
            l(y(iA2 - size), collection);
        } else {
            int i11 = iA2 + size;
            if (iA2 < iA) {
                int i12 = size + iA;
                Object[] objArr8 = this.f13305b;
                if (i12 <= objArr8.length) {
                    g.r0(objArr8, i11, objArr8, iA2, iA);
                } else if (i11 >= objArr8.length) {
                    g.r0(objArr8, i11 - objArr8.length, objArr8, iA2, iA);
                } else {
                    int length3 = iA - (i12 - objArr8.length);
                    g.r0(objArr8, 0, objArr8, length3, iA);
                    Object[] objArr9 = this.f13305b;
                    g.r0(objArr9, i11, objArr9, iA2, length3);
                }
            } else {
                Object[] objArr10 = this.f13305b;
                g.r0(objArr10, size, objArr10, 0, iA);
                Object[] objArr11 = this.f13305b;
                if (i11 >= objArr11.length) {
                    g.r0(objArr11, i11 - objArr11.length, objArr11, iA2, objArr11.length);
                } else {
                    g.r0(objArr11, 0, objArr11, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f13305b;
                    g.r0(objArr12, i11, objArr12, iA2, objArr12.length - size);
                }
            }
            l(iA2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        B();
        m(this.f13306c + 1);
        int length = this.f13304a;
        if (length == 0) {
            Object[] objArr = this.f13305b;
            h.e(objArr, "<this>");
            length = objArr.length;
        }
        int i7 = length - 1;
        this.f13304a = i7;
        this.f13305b[i7] = obj;
        this.f13306c++;
    }

    public final void addLast(Object obj) {
        B();
        m(this.f13306c + 1);
        this.f13305b[A(this.f13304a + this.f13306c)] = obj;
        this.f13306c++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            B();
            z(this.f13304a, A(this.f13304a + this.f13306c));
        }
        this.f13304a = 0;
        this.f13306c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i7) {
        int i8 = this.f13306c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        return this.f13305b[A(this.f13304a + i7)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i7;
        int iA = A(this.f13304a + this.f13306c);
        int length = this.f13304a;
        if (length < iA) {
            while (length < iA) {
                if (h.a(obj, this.f13305b[length])) {
                    i7 = this.f13304a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iA) {
            return -1;
        }
        int length2 = this.f13305b.length;
        while (length < length2) {
            if (h.a(obj, this.f13305b[length])) {
                i7 = this.f13304a;
            } else {
                length++;
            }
        }
        for (int i8 = 0; i8 < iA; i8++) {
            if (h.a(obj, this.f13305b[i8])) {
                length = i8 + this.f13305b.length;
                i7 = this.f13304a;
            }
        }
        return -1;
        return length - i7;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f13306c == 0;
    }

    public final void l(int i7, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f13305b.length;
        while (i7 < length && it.hasNext()) {
            this.f13305b[i7] = it.next();
            i7++;
        }
        int i8 = this.f13304a;
        for (int i9 = 0; i9 < i8 && it.hasNext(); i9++) {
            this.f13305b[i9] = it.next();
        }
        this.f13306c = collection.size() + this.f13306c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i7;
        int iA = A(this.f13304a + this.f13306c);
        int i8 = this.f13304a;
        if (i8 < iA) {
            length = iA - 1;
            if (i8 <= length) {
                while (!h.a(obj, this.f13305b[length])) {
                    if (length != i8) {
                        length--;
                    }
                }
                i7 = this.f13304a;
                return length - i7;
            }
            return -1;
        }
        if (i8 > iA) {
            for (int i9 = iA - 1; -1 < i9; i9--) {
                if (h.a(obj, this.f13305b[i9])) {
                    length = i9 + this.f13305b.length;
                    i7 = this.f13304a;
                    return length - i7;
                }
            }
            Object[] objArr = this.f13305b;
            h.e(objArr, "<this>");
            length = objArr.length - 1;
            int i10 = this.f13304a;
            if (i10 <= length) {
                while (!h.a(obj, this.f13305b[length])) {
                    if (length != i10) {
                        length--;
                    }
                }
                i7 = this.f13304a;
                return length - i7;
            }
        }
        return -1;
    }

    public final void m(int i7) {
        if (i7 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f13305b;
        if (i7 <= objArr.length) {
            return;
        }
        if (objArr == f13303d) {
            if (i7 < 10) {
                i7 = 10;
            }
            this.f13305b = new Object[i7];
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
        g.r0(objArr, 0, objArr2, this.f13304a, objArr.length);
        Object[] objArr3 = this.f13305b;
        int length2 = objArr3.length;
        int i9 = this.f13304a;
        g.r0(objArr3, length2 - i9, objArr2, 0, i9);
        this.f13304a = 0;
        this.f13305b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i7) {
        int i8 = this.f13306c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        if (i7 == i.L0(this)) {
            return removeLast();
        }
        if (i7 == 0) {
            return removeFirst();
        }
        B();
        int iA = A(this.f13304a + i7);
        Object[] objArr = this.f13305b;
        Object obj = objArr[iA];
        if (i7 < (this.f13306c >> 1)) {
            int i9 = this.f13304a;
            if (iA >= i9) {
                g.r0(objArr, i9 + 1, objArr, i9, iA);
            } else {
                g.r0(objArr, 1, objArr, 0, iA);
                Object[] objArr2 = this.f13305b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i10 = this.f13304a;
                g.r0(objArr2, i10 + 1, objArr2, i10, objArr2.length - 1);
            }
            Object[] objArr3 = this.f13305b;
            int i11 = this.f13304a;
            objArr3[i11] = null;
            this.f13304a = t(i11);
        } else {
            int iA2 = A(i.L0(this) + this.f13304a);
            if (iA <= iA2) {
                Object[] objArr4 = this.f13305b;
                g.r0(objArr4, iA, objArr4, iA + 1, iA2 + 1);
            } else {
                Object[] objArr5 = this.f13305b;
                g.r0(objArr5, iA, objArr5, iA + 1, objArr5.length);
                Object[] objArr6 = this.f13305b;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.r0(objArr6, 0, objArr6, 1, iA2 + 1);
            }
            this.f13305b[iA2] = null;
        }
        this.f13306c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iA;
        h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f13305b.length != 0) {
            int iA2 = A(this.f13304a + this.f13306c);
            int i7 = this.f13304a;
            if (i7 < iA2) {
                iA = i7;
                while (i7 < iA2) {
                    Object obj = this.f13305b[i7];
                    if (collection.contains(obj)) {
                        z4 = true;
                    } else {
                        this.f13305b[iA] = obj;
                        iA++;
                    }
                    i7++;
                }
                g.s0(this.f13305b, iA, iA2);
            } else {
                int length = this.f13305b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f13305b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        z7 = true;
                    } else {
                        this.f13305b[i8] = obj2;
                        i8++;
                    }
                    i7++;
                }
                iA = A(i8);
                for (int i9 = 0; i9 < iA2; i9++) {
                    Object[] objArr2 = this.f13305b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        z7 = true;
                    } else {
                        this.f13305b[iA] = obj3;
                        iA = t(iA);
                    }
                }
                z4 = z7;
            }
            if (z4) {
                B();
                this.f13306c = y(iA - this.f13304a);
            }
        }
        return z4;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        B();
        Object[] objArr = this.f13305b;
        int i7 = this.f13304a;
        Object obj = objArr[i7];
        objArr[i7] = null;
        this.f13304a = t(i7);
        this.f13306c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        B();
        int iA = A(i.L0(this) + this.f13304a);
        Object[] objArr = this.f13305b;
        Object obj = objArr[iA];
        objArr[iA] = null;
        this.f13306c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i7, int i8) {
        P6.b.b(i7, i8, this.f13306c);
        int i9 = i8 - i7;
        if (i9 == 0) {
            return;
        }
        if (i9 == this.f13306c) {
            clear();
            return;
        }
        if (i9 == 1) {
            remove(i7);
            return;
        }
        B();
        if (i7 < this.f13306c - i8) {
            int iA = A((i7 - 1) + this.f13304a);
            int iA2 = A((i8 - 1) + this.f13304a);
            while (i7 > 0) {
                int i10 = iA + 1;
                int iMin = Math.min(i7, Math.min(i10, iA2 + 1));
                Object[] objArr = this.f13305b;
                int i11 = iA2 - iMin;
                int i12 = iA - iMin;
                g.r0(objArr, i11 + 1, objArr, i12 + 1, i10);
                iA = y(i12);
                iA2 = y(i11);
                i7 -= iMin;
            }
            int iA3 = A(this.f13304a + i9);
            z(this.f13304a, iA3);
            this.f13304a = iA3;
        } else {
            int iA4 = A(this.f13304a + i8);
            int iA5 = A(this.f13304a + i7);
            int i13 = this.f13306c;
            while (true) {
                i13 -= i8;
                if (i13 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f13305b;
                i8 = Math.min(i13, Math.min(objArr2.length - iA4, objArr2.length - iA5));
                Object[] objArr3 = this.f13305b;
                int i14 = iA4 + i8;
                g.r0(objArr3, iA5, objArr3, iA4, i14);
                iA4 = A(i14);
                iA5 = A(iA5 + i8);
            }
            int iA6 = A(this.f13304a + this.f13306c);
            z(y(iA6 - i9), iA6);
        }
        this.f13306c -= i9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iA;
        h.e(collection, "elements");
        boolean z4 = false;
        z4 = false;
        z4 = false;
        if (!isEmpty() && this.f13305b.length != 0) {
            int iA2 = A(this.f13304a + this.f13306c);
            int i7 = this.f13304a;
            if (i7 < iA2) {
                iA = i7;
                while (i7 < iA2) {
                    Object obj = this.f13305b[i7];
                    if (collection.contains(obj)) {
                        this.f13305b[iA] = obj;
                        iA++;
                    } else {
                        z4 = true;
                    }
                    i7++;
                }
                g.s0(this.f13305b, iA, iA2);
            } else {
                int length = this.f13305b.length;
                boolean z7 = false;
                int i8 = i7;
                while (i7 < length) {
                    Object[] objArr = this.f13305b;
                    Object obj2 = objArr[i7];
                    objArr[i7] = null;
                    if (collection.contains(obj2)) {
                        this.f13305b[i8] = obj2;
                        i8++;
                    } else {
                        z7 = true;
                    }
                    i7++;
                }
                iA = A(i8);
                for (int i9 = 0; i9 < iA2; i9++) {
                    Object[] objArr2 = this.f13305b;
                    Object obj3 = objArr2[i9];
                    objArr2[i9] = null;
                    if (collection.contains(obj3)) {
                        this.f13305b[iA] = obj3;
                        iA = t(iA);
                    } else {
                        z7 = true;
                    }
                }
                z4 = z7;
            }
            if (z4) {
                B();
                this.f13306c = y(iA - this.f13304a);
            }
        }
        return z4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i7, Object obj) {
        int i8 = this.f13306c;
        if (i7 < 0 || i7 >= i8) {
            throw new IndexOutOfBoundsException(AbstractC0486a1.e(i7, i8, "index: ", ", size: "));
        }
        int iA = A(this.f13304a + i7);
        Object[] objArr = this.f13305b;
        Object obj2 = objArr[iA];
        objArr[iA] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13306c;
    }

    public final int t(int i7) {
        Object[] objArr = this.f13305b;
        h.e(objArr, "<this>");
        if (i7 == objArr.length - 1) {
            return 0;
        }
        return i7 + 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f13306c]);
    }

    public final int y(int i7) {
        return i7 < 0 ? i7 + this.f13305b.length : i7;
    }

    public final void z(int i7, int i8) {
        if (i7 < i8) {
            g.s0(this.f13305b, i7, i8);
            return;
        }
        Object[] objArr = this.f13305b;
        g.s0(objArr, i7, objArr.length);
        g.s0(this.f13305b, 0, i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        int length = objArr.length;
        int i7 = this.f13306c;
        if (length < i7) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i7);
            h.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iA = A(this.f13304a + this.f13306c);
        int i8 = this.f13304a;
        if (i8 < iA) {
            g.r0(this.f13305b, 0, objArr, i8, iA);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f13305b;
            g.r0(objArr2, 0, objArr, this.f13304a, objArr2.length);
            Object[] objArr3 = this.f13305b;
            g.r0(objArr3, objArr3.length - this.f13304a, objArr, 0, iA);
        }
        int i9 = this.f13306c;
        if (i9 < objArr.length) {
            objArr[i9] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        h.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        B();
        m(collection.size() + this.f13306c);
        l(A(this.f13304a + this.f13306c), collection);
        return true;
    }
}
