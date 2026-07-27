package g4;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import u1.AbstractC1477a;

/* renamed from: g4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0463h extends AbstractC0460e {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f5745d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f5746a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f5747b = f5745d;

    /* renamed from: c, reason: collision with root package name */
    public int f5748c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i6 = this.f5748c;
        if (i2 < 0 || i2 > i6) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, i6, ", size: "));
        }
        if (i2 == i6) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        k();
        f(this.f5748c + 1);
        int j2 = j(this.f5746a + i2);
        int i7 = this.f5748c;
        if (i2 < ((i7 + 1) >> 1)) {
            if (j2 == 0) {
                Object[] objArr = this.f5747b;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                j2 = objArr.length;
            }
            int i8 = j2 - 1;
            int i9 = this.f5746a;
            if (i9 == 0) {
                Object[] objArr2 = this.f5747b;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i9 - 1;
            }
            int i10 = this.f5746a;
            if (i8 >= i10) {
                Object[] objArr3 = this.f5747b;
                objArr3[i3] = objArr3[i10];
                AbstractC0464i.P(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f5747b;
                AbstractC0464i.P(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f5747b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0464i.P(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f5747b[i8] = obj;
            this.f5746a = i3;
        } else {
            int j6 = j(i7 + this.f5746a);
            if (j2 < j6) {
                Object[] objArr6 = this.f5747b;
                AbstractC0464i.P(j2 + 1, j2, j6, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f5747b;
                AbstractC0464i.P(1, 0, j6, objArr7, objArr7);
                Object[] objArr8 = this.f5747b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0464i.P(j2 + 1, j2, objArr8.length - 1, objArr8, objArr8);
            }
            this.f5747b[j2] = obj;
        }
        this.f5748c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i3 = this.f5748c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, i3, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f5748c) {
            return addAll(elements);
        }
        k();
        f(elements.size() + this.f5748c);
        int j2 = j(this.f5748c + this.f5746a);
        int j6 = j(this.f5746a + i2);
        int size = elements.size();
        if (i2 < ((this.f5748c + 1) >> 1)) {
            int i6 = this.f5746a;
            int i7 = i6 - size;
            if (j6 < i6) {
                Object[] objArr = this.f5747b;
                AbstractC0464i.P(i7, i6, objArr.length, objArr, objArr);
                if (size >= j6) {
                    Object[] objArr2 = this.f5747b;
                    AbstractC0464i.P(objArr2.length - size, 0, j6, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.f5747b;
                    AbstractC0464i.P(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.f5747b;
                    AbstractC0464i.P(0, size, j6, objArr4, objArr4);
                }
            } else if (i7 >= 0) {
                Object[] objArr5 = this.f5747b;
                AbstractC0464i.P(i7, i6, j6, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.f5747b;
                i7 += objArr6.length;
                int i8 = j6 - i6;
                int length = objArr6.length - i7;
                if (length >= i8) {
                    AbstractC0464i.P(i7, i6, j6, objArr6, objArr6);
                } else {
                    AbstractC0464i.P(i7, i6, i6 + length, objArr6, objArr6);
                    Object[] objArr7 = this.f5747b;
                    AbstractC0464i.P(0, this.f5746a + length, j6, objArr7, objArr7);
                }
            }
            this.f5746a = i7;
            e(h(j6 - size), elements);
        } else {
            int i9 = j6 + size;
            if (j6 < j2) {
                int i10 = size + j2;
                Object[] objArr8 = this.f5747b;
                if (i10 <= objArr8.length) {
                    AbstractC0464i.P(i9, j6, j2, objArr8, objArr8);
                } else if (i9 >= objArr8.length) {
                    AbstractC0464i.P(i9 - objArr8.length, j6, j2, objArr8, objArr8);
                } else {
                    int length2 = j2 - (i10 - objArr8.length);
                    AbstractC0464i.P(0, length2, j2, objArr8, objArr8);
                    Object[] objArr9 = this.f5747b;
                    AbstractC0464i.P(i9, j6, length2, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.f5747b;
                AbstractC0464i.P(size, 0, j2, objArr10, objArr10);
                Object[] objArr11 = this.f5747b;
                if (i9 >= objArr11.length) {
                    AbstractC0464i.P(i9 - objArr11.length, j6, objArr11.length, objArr11, objArr11);
                } else {
                    AbstractC0464i.P(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.f5747b;
                    AbstractC0464i.P(i9, j6, objArr12.length - size, objArr12, objArr12);
                }
            }
            e(j6, elements);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        k();
        f(this.f5748c + 1);
        int i2 = this.f5746a;
        if (i2 == 0) {
            Object[] objArr = this.f5747b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f5746a = i3;
        this.f5747b[i3] = obj;
        this.f5748c++;
    }

    public final void addLast(Object obj) {
        k();
        f(c() + 1);
        this.f5747b[j(c() + this.f5746a)] = obj;
        this.f5748c = c() + 1;
    }

    @Override // g4.AbstractC0460e
    public final int c() {
        return this.f5748c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            k();
            i(this.f5746a, j(c() + this.f5746a));
        }
        this.f5746a = 0;
        this.f5748c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // g4.AbstractC0460e
    public final Object d(int i2) {
        int i3 = this.f5748c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, i3, ", size: "));
        }
        if (i2 == AbstractC0466k.z0(this)) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        k();
        int j2 = j(this.f5746a + i2);
        Object[] objArr = this.f5747b;
        Object obj = objArr[j2];
        if (i2 < (this.f5748c >> 1)) {
            int i6 = this.f5746a;
            if (j2 >= i6) {
                AbstractC0464i.P(i6 + 1, i6, j2, objArr, objArr);
            } else {
                AbstractC0464i.P(1, 0, j2, objArr, objArr);
                Object[] objArr2 = this.f5747b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f5746a;
                AbstractC0464i.P(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f5747b;
            int i8 = this.f5746a;
            objArr3[i8] = null;
            this.f5746a = g(i8);
        } else {
            int j6 = j(AbstractC0466k.z0(this) + this.f5746a);
            if (j2 <= j6) {
                Object[] objArr4 = this.f5747b;
                AbstractC0464i.P(j2, j2 + 1, j6 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f5747b;
                AbstractC0464i.P(j2, j2 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f5747b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0464i.P(0, 1, j6 + 1, objArr6, objArr6);
            }
            this.f5747b[j6] = null;
        }
        this.f5748c--;
        return obj;
    }

    public final void e(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f5747b.length;
        while (i2 < length && it.hasNext()) {
            this.f5747b[i2] = it.next();
            i2++;
        }
        int i3 = this.f5746a;
        for (int i6 = 0; i6 < i3 && it.hasNext(); i6++) {
            this.f5747b[i6] = it.next();
        }
        this.f5748c = collection.size() + c();
    }

    public final void f(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f5747b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f5745d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f5747b = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        AbstractC0464i.P(0, this.f5746a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f5747b;
        int length2 = objArr3.length;
        int i6 = this.f5746a;
        AbstractC0464i.P(length2 - i6, 0, i6, objArr3, objArr2);
        this.f5746a = 0;
        this.f5747b = objArr2;
    }

    public final int g(int i2) {
        kotlin.jvm.internal.i.e(this.f5747b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int c2 = c();
        if (i2 < 0 || i2 >= c2) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, c2, ", size: "));
        }
        return this.f5747b[j(this.f5746a + i2)];
    }

    public final int h(int i2) {
        return i2 < 0 ? i2 + this.f5747b.length : i2;
    }

    public final void i(int i2, int i3) {
        if (i2 < i3) {
            AbstractC0464i.S(i2, i3, this.f5747b);
            return;
        }
        Object[] objArr = this.f5747b;
        AbstractC0464i.S(i2, objArr.length, objArr);
        AbstractC0464i.S(0, i3, this.f5747b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int j2 = j(c() + this.f5746a);
        int i3 = this.f5746a;
        if (i3 < j2) {
            while (i3 < j2) {
                if (kotlin.jvm.internal.i.a(obj, this.f5747b[i3])) {
                    i2 = this.f5746a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < j2) {
            return -1;
        }
        int length = this.f5747b.length;
        while (true) {
            if (i3 >= length) {
                for (int i6 = 0; i6 < j2; i6++) {
                    if (kotlin.jvm.internal.i.a(obj, this.f5747b[i6])) {
                        i3 = i6 + this.f5747b.length;
                        i2 = this.f5746a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.f5747b[i3])) {
                i2 = this.f5746a;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return c() == 0;
    }

    public final int j(int i2) {
        Object[] objArr = this.f5747b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void k() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int j2 = j(this.f5748c + this.f5746a);
        int i3 = this.f5746a;
        if (i3 < j2) {
            length = j2 - 1;
            if (i3 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f5747b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f5746a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > j2) {
            int i6 = j2 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f5747b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f5746a;
                    if (i7 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f5747b[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i2 = this.f5746a;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.f5747b[i6])) {
                        length = i6 + this.f5747b.length;
                        i2 = this.f5746a;
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
    public final boolean removeAll(Collection elements) {
        int j2;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f5747b.length != 0) {
            int j6 = j(this.f5748c + this.f5746a);
            int i2 = this.f5746a;
            if (i2 < j6) {
                j2 = i2;
                while (i2 < j6) {
                    Object obj = this.f5747b[i2];
                    if (elements.contains(obj)) {
                        z = true;
                    } else {
                        this.f5747b[j2] = obj;
                        j2++;
                    }
                    i2++;
                }
                AbstractC0464i.S(j2, j6, this.f5747b);
            } else {
                int length = this.f5747b.length;
                boolean z5 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f5747b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z5 = true;
                    } else {
                        this.f5747b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                j2 = j(i3);
                for (int i6 = 0; i6 < j6; i6++) {
                    Object[] objArr2 = this.f5747b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        z5 = true;
                    } else {
                        this.f5747b[j2] = obj3;
                        j2 = g(j2);
                    }
                }
                z = z5;
            }
            if (z) {
                k();
                this.f5748c = h(j2 - this.f5746a);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        Object[] objArr = this.f5747b;
        int i2 = this.f5746a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f5746a = g(i2);
        this.f5748c = c() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        k();
        int j2 = j(AbstractC0466k.z0(this) + this.f5746a);
        Object[] objArr = this.f5747b;
        Object obj = objArr[j2];
        objArr[j2] = null;
        this.f5748c = c() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        AbstractC1477a.d(i2, i3, this.f5748c);
        int i6 = i3 - i2;
        if (i6 == 0) {
            return;
        }
        if (i6 == this.f5748c) {
            clear();
            return;
        }
        if (i6 == 1) {
            d(i2);
            return;
        }
        k();
        if (i2 < this.f5748c - i3) {
            int j2 = j(this.f5746a + (i2 - 1));
            int j6 = j(this.f5746a + (i3 - 1));
            while (i2 > 0) {
                int i7 = j2 + 1;
                int min = Math.min(i2, Math.min(i7, j6 + 1));
                Object[] objArr = this.f5747b;
                int i8 = j6 - min;
                int i9 = j2 - min;
                AbstractC0464i.P(i8 + 1, i9 + 1, i7, objArr, objArr);
                j2 = h(i9);
                j6 = h(i8);
                i2 -= min;
            }
            int j7 = j(this.f5746a + i6);
            i(this.f5746a, j7);
            this.f5746a = j7;
        } else {
            int j8 = j(this.f5746a + i3);
            int j9 = j(this.f5746a + i2);
            int i10 = this.f5748c;
            while (true) {
                i10 -= i3;
                if (i10 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f5747b;
                i3 = Math.min(i10, Math.min(objArr2.length - j8, objArr2.length - j9));
                Object[] objArr3 = this.f5747b;
                int i11 = j8 + i3;
                AbstractC0464i.P(j9, j8, i11, objArr3, objArr3);
                j8 = j(i11);
                j9 = j(j9 + i3);
            }
            int j10 = j(this.f5748c + this.f5746a);
            i(h(j10 - i6), j10);
        }
        this.f5748c -= i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int j2;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f5747b.length != 0) {
            int j6 = j(this.f5748c + this.f5746a);
            int i2 = this.f5746a;
            if (i2 < j6) {
                j2 = i2;
                while (i2 < j6) {
                    Object obj = this.f5747b[i2];
                    if (elements.contains(obj)) {
                        this.f5747b[j2] = obj;
                        j2++;
                    } else {
                        z = true;
                    }
                    i2++;
                }
                AbstractC0464i.S(j2, j6, this.f5747b);
            } else {
                int length = this.f5747b.length;
                boolean z5 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr = this.f5747b;
                    Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f5747b[i3] = obj2;
                        i3++;
                    } else {
                        z5 = true;
                    }
                    i2++;
                }
                j2 = j(i3);
                for (int i6 = 0; i6 < j6; i6++) {
                    Object[] objArr2 = this.f5747b;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (elements.contains(obj3)) {
                        this.f5747b[j2] = obj3;
                        j2 = g(j2);
                    } else {
                        z5 = true;
                    }
                }
                z = z5;
            }
            if (z) {
                k();
                this.f5748c = h(j2 - this.f5746a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int c2 = c();
        if (i2 < 0 || i2 >= c2) {
            throw new IndexOutOfBoundsException(B0.o.h("index: ", i2, c2, ", size: "));
        }
        int j2 = j(this.f5746a + i2);
        Object[] objArr = this.f5747b;
        Object obj2 = objArr[j2];
        objArr[j2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[c()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i2 = this.f5748c;
        if (length < i2) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int j2 = j(this.f5748c + this.f5746a);
        int i3 = this.f5746a;
        if (i3 < j2) {
            AbstractC0464i.P(0, i3, j2, this.f5747b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f5747b;
            AbstractC0464i.P(0, this.f5746a, objArr.length, objArr, array);
            Object[] objArr2 = this.f5747b;
            AbstractC0464i.P(objArr2.length - this.f5746a, 0, j2, objArr2, array);
        }
        int i6 = this.f5748c;
        if (i6 < array.length) {
            array[i6] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        k();
        f(elements.size() + c());
        e(j(c() + this.f5746a), elements);
        return true;
    }
}
