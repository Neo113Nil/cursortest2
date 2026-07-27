package e2;

import a.AbstractC0086a;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: e2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0289d extends AbstractC0286a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f4870d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f4871a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f4872b = f4870d;

    /* renamed from: c, reason: collision with root package name */
    public int f4873c;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i3, Object obj) {
        int i4;
        int i5 = this.f4873c;
        if (i3 < 0 || i3 > i5) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i5, "index: ", ", size: "));
        }
        if (i3 == i5) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        j();
        e(this.f4873c + 1);
        int i6 = i(this.f4871a + i3);
        int i7 = this.f4873c;
        if (i3 < ((i7 + 1) >> 1)) {
            if (i6 == 0) {
                Object[] objArr = this.f4872b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                i6 = objArr.length;
            }
            int i8 = i6 - 1;
            int i9 = this.f4871a;
            if (i9 == 0) {
                Object[] objArr2 = this.f4872b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                i4 = objArr2.length - 1;
            } else {
                i4 = i9 - 1;
            }
            int i10 = this.f4871a;
            if (i8 >= i10) {
                Object[] objArr3 = this.f4872b;
                objArr3[i4] = objArr3[i10];
                AbstractC0290e.T(i10, i10 + 1, i8 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f4872b;
                AbstractC0290e.T(i10 - 1, i10, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f4872b;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0290e.T(0, 1, i8 + 1, objArr5, objArr5);
            }
            this.f4872b[i8] = obj;
            this.f4871a = i4;
        } else {
            int i11 = i(i7 + this.f4871a);
            if (i6 < i11) {
                Object[] objArr6 = this.f4872b;
                AbstractC0290e.T(i6 + 1, i6, i11, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f4872b;
                AbstractC0290e.T(1, 0, i11, objArr7, objArr7);
                Object[] objArr8 = this.f4872b;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0290e.T(i6 + 1, i6, objArr8.length - 1, objArr8, objArr8);
            }
            this.f4872b[i6] = obj;
        }
        this.f4873c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i3, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i4 = this.f4873c;
        if (i3 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i3 == this.f4873c) {
            return addAll(elements);
        }
        j();
        e(elements.size() + this.f4873c);
        int i5 = i(this.f4873c + this.f4871a);
        int i6 = i(this.f4871a + i3);
        int size = elements.size();
        if (i3 >= ((this.f4873c + 1) >> 1)) {
            int i7 = i6 + size;
            if (i6 < i5) {
                int i8 = size + i5;
                Object[] objArr = this.f4872b;
                if (i8 <= objArr.length) {
                    AbstractC0290e.T(i7, i6, i5, objArr, objArr);
                } else if (i7 >= objArr.length) {
                    AbstractC0290e.T(i7 - objArr.length, i6, i5, objArr, objArr);
                } else {
                    int length = i5 - (i8 - objArr.length);
                    AbstractC0290e.T(0, length, i5, objArr, objArr);
                    Object[] objArr2 = this.f4872b;
                    AbstractC0290e.T(i7, i6, length, objArr2, objArr2);
                }
            } else {
                Object[] objArr3 = this.f4872b;
                AbstractC0290e.T(size, 0, i5, objArr3, objArr3);
                Object[] objArr4 = this.f4872b;
                if (i7 >= objArr4.length) {
                    AbstractC0290e.T(i7 - objArr4.length, i6, objArr4.length, objArr4, objArr4);
                } else {
                    AbstractC0290e.T(0, objArr4.length - size, objArr4.length, objArr4, objArr4);
                    Object[] objArr5 = this.f4872b;
                    AbstractC0290e.T(i7, i6, objArr5.length - size, objArr5, objArr5);
                }
            }
            d(i6, elements);
            return true;
        }
        int i9 = this.f4871a;
        int i10 = i9 - size;
        if (i6 < i9) {
            Object[] objArr6 = this.f4872b;
            AbstractC0290e.T(i10, i9, objArr6.length, objArr6, objArr6);
            if (size >= i6) {
                Object[] objArr7 = this.f4872b;
                AbstractC0290e.T(objArr7.length - size, 0, i6, objArr7, objArr7);
            } else {
                Object[] objArr8 = this.f4872b;
                AbstractC0290e.T(objArr8.length - size, 0, size, objArr8, objArr8);
                Object[] objArr9 = this.f4872b;
                AbstractC0290e.T(0, size, i6, objArr9, objArr9);
            }
        } else if (i10 >= 0) {
            Object[] objArr10 = this.f4872b;
            AbstractC0290e.T(i10, i9, i6, objArr10, objArr10);
        } else {
            Object[] objArr11 = this.f4872b;
            i10 += objArr11.length;
            int i11 = i6 - i9;
            int length2 = objArr11.length - i10;
            if (length2 >= i11) {
                AbstractC0290e.T(i10, i9, i6, objArr11, objArr11);
            } else {
                AbstractC0290e.T(i10, i9, i9 + length2, objArr11, objArr11);
                Object[] objArr12 = this.f4872b;
                AbstractC0290e.T(0, this.f4871a + length2, i6, objArr12, objArr12);
            }
        }
        this.f4871a = i10;
        d(g(i6 - size), elements);
        return true;
    }

    public final void addFirst(Object obj) {
        j();
        e(this.f4873c + 1);
        int i3 = this.f4871a;
        if (i3 == 0) {
            Object[] objArr = this.f4872b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i3 = objArr.length;
        }
        int i4 = i3 - 1;
        this.f4871a = i4;
        this.f4872b[i4] = obj;
        this.f4873c++;
    }

    public final void addLast(Object obj) {
        j();
        e(b() + 1);
        this.f4872b[i(b() + this.f4871a)] = obj;
        this.f4873c = b() + 1;
    }

    @Override // e2.AbstractC0286a
    public final int b() {
        return this.f4873c;
    }

    @Override // e2.AbstractC0286a
    public final Object c(int i3) {
        int i4 = this.f4873c;
        if (i3 < 0 || i3 >= i4) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, i4, "index: ", ", size: "));
        }
        if (i3 == size() - 1) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        j();
        int i5 = i(this.f4871a + i3);
        Object[] objArr = this.f4872b;
        Object obj = objArr[i5];
        if (i3 < (this.f4873c >> 1)) {
            int i6 = this.f4871a;
            if (i5 >= i6) {
                AbstractC0290e.T(i6 + 1, i6, i5, objArr, objArr);
            } else {
                AbstractC0290e.T(1, 0, i5, objArr, objArr);
                Object[] objArr2 = this.f4872b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i7 = this.f4871a;
                AbstractC0290e.T(i7 + 1, i7, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f4872b;
            int i8 = this.f4871a;
            objArr3[i8] = null;
            this.f4871a = f(i8);
        } else {
            int i9 = i((size() - 1) + this.f4871a);
            if (i5 <= i9) {
                Object[] objArr4 = this.f4872b;
                AbstractC0290e.T(i5, i5 + 1, i9 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.f4872b;
                AbstractC0290e.T(i5, i5 + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.f4872b;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0290e.T(0, 1, i9 + 1, objArr6, objArr6);
            }
            this.f4872b[i9] = null;
        }
        this.f4873c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            j();
            h(this.f4871a, i(b() + this.f4871a));
        }
        this.f4871a = 0;
        this.f4873c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f4872b.length;
        while (i3 < length && it.hasNext()) {
            this.f4872b[i3] = it.next();
            i3++;
        }
        int i4 = this.f4871a;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f4872b[i5] = it.next();
        }
        this.f4873c = collection.size() + this.f4873c;
    }

    public final void e(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f4872b;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f4870d) {
            if (i3 < 10) {
                i3 = 10;
            }
            this.f4872b = new Object[i3];
            return;
        }
        int length = objArr.length;
        int i4 = length + (length >> 1);
        if (i4 - i3 < 0) {
            i4 = i3;
        }
        if (i4 - 2147483639 > 0) {
            i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i4];
        AbstractC0290e.T(0, this.f4871a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f4872b;
        int length2 = objArr3.length;
        int i5 = this.f4871a;
        AbstractC0290e.T(length2 - i5, 0, i5, objArr3, objArr2);
        this.f4871a = 0;
        this.f4872b = objArr2;
    }

    public final int f(int i3) {
        kotlin.jvm.internal.j.e(this.f4872b, "<this>");
        if (i3 == r0.length - 1) {
            return 0;
        }
        return i3 + 1;
    }

    public final int g(int i3) {
        return i3 < 0 ? i3 + this.f4872b.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i3) {
        int b3 = b();
        if (i3 < 0 || i3 >= b3) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, b3, "index: ", ", size: "));
        }
        return this.f4872b[i(this.f4871a + i3)];
    }

    public final void h(int i3, int i4) {
        if (i3 < i4) {
            Object[] objArr = this.f4872b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            Arrays.fill(objArr, i3, i4, (Object) null);
        } else {
            Object[] objArr2 = this.f4872b;
            Arrays.fill(objArr2, i3, objArr2.length, (Object) null);
            Object[] objArr3 = this.f4872b;
            kotlin.jvm.internal.j.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i4, (Object) null);
        }
    }

    public final int i(int i3) {
        Object[] objArr = this.f4872b;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i3;
        int i4 = i(b() + this.f4871a);
        int i5 = this.f4871a;
        if (i5 < i4) {
            while (i5 < i4) {
                if (kotlin.jvm.internal.j.a(obj, this.f4872b[i5])) {
                    i3 = this.f4871a;
                } else {
                    i5++;
                }
            }
            return -1;
        }
        if (i5 < i4) {
            return -1;
        }
        int length = this.f4872b.length;
        while (true) {
            if (i5 >= length) {
                for (int i6 = 0; i6 < i4; i6++) {
                    if (kotlin.jvm.internal.j.a(obj, this.f4872b[i6])) {
                        i5 = i6 + this.f4872b.length;
                        i3 = this.f4871a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.f4872b[i5])) {
                i3 = this.f4871a;
                break;
            }
            i5++;
        }
        return i5 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return b() == 0;
    }

    public final void j() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i3;
        int i4 = i(this.f4873c + this.f4871a);
        int i5 = this.f4871a;
        if (i5 < i4) {
            length = i4 - 1;
            if (i5 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f4872b[length])) {
                    if (length != i5) {
                        length--;
                    }
                }
                i3 = this.f4871a;
                return length - i3;
            }
            return -1;
        }
        if (i5 > i4) {
            int i6 = i4 - 1;
            while (true) {
                if (-1 >= i6) {
                    Object[] objArr = this.f4872b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i7 = this.f4871a;
                    if (i7 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f4872b[length])) {
                            if (length != i7) {
                                length--;
                            }
                        }
                        i3 = this.f4871a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.f4872b[i6])) {
                        length = i6 + this.f4872b.length;
                        i3 = this.f4871a;
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
        c(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int i3;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4872b.length != 0) {
            int i4 = i(this.f4873c + this.f4871a);
            int i5 = this.f4871a;
            if (i5 < i4) {
                i3 = i5;
                while (i5 < i4) {
                    Object obj = this.f4872b[i5];
                    if (elements.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f4872b[i3] = obj;
                        i3++;
                    }
                    i5++;
                }
                Object[] objArr = this.f4872b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, i3, i4, (Object) null);
            } else {
                int length = this.f4872b.length;
                boolean z4 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f4872b;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (elements.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f4872b[i6] = obj2;
                        i6++;
                    }
                    i5++;
                }
                i3 = i(i6);
                for (int i7 = 0; i7 < i4; i7++) {
                    Object[] objArr3 = this.f4872b;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (elements.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f4872b[i3] = obj3;
                        i3 = f(i3);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                j();
                this.f4873c = g(i3 - this.f4871a);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        Object[] objArr = this.f4872b;
        int i3 = this.f4871a;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f4871a = f(i3);
        this.f4873c = b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        j();
        int i3 = i((size() - 1) + this.f4871a);
        Object[] objArr = this.f4872b;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f4873c = b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i3, int i4) {
        AbstractC0086a.h(i3, i4, this.f4873c);
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f4873c) {
            clear();
            return;
        }
        if (i5 == 1) {
            c(i3);
            return;
        }
        j();
        if (i3 < this.f4873c - i4) {
            int i6 = i((i3 - 1) + this.f4871a);
            int i7 = i((i4 - 1) + this.f4871a);
            while (i3 > 0) {
                int i8 = i6 + 1;
                int min = Math.min(i3, Math.min(i8, i7 + 1));
                Object[] objArr = this.f4872b;
                int i9 = i7 - min;
                int i10 = i6 - min;
                AbstractC0290e.T(i9 + 1, i10 + 1, i8, objArr, objArr);
                i6 = g(i10);
                i7 = g(i9);
                i3 -= min;
            }
            int i11 = i(this.f4871a + i5);
            h(this.f4871a, i11);
            this.f4871a = i11;
        } else {
            int i12 = i(this.f4871a + i4);
            int i13 = i(this.f4871a + i3);
            int i14 = this.f4873c;
            while (true) {
                i14 -= i4;
                if (i14 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f4872b;
                i4 = Math.min(i14, Math.min(objArr2.length - i12, objArr2.length - i13));
                Object[] objArr3 = this.f4872b;
                int i15 = i12 + i4;
                AbstractC0290e.T(i13, i12, i15, objArr3, objArr3);
                i12 = i(i15);
                i13 = i(i13 + i4);
            }
            int i16 = i(this.f4873c + this.f4871a);
            h(g(i16 - i5), i16);
        }
        this.f4873c -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int i3;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f4872b.length != 0) {
            int i4 = i(this.f4873c + this.f4871a);
            int i5 = this.f4871a;
            if (i5 < i4) {
                i3 = i5;
                while (i5 < i4) {
                    Object obj = this.f4872b[i5];
                    if (elements.contains(obj)) {
                        this.f4872b[i3] = obj;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i5++;
                }
                Object[] objArr = this.f4872b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, i3, i4, (Object) null);
            } else {
                int length = this.f4872b.length;
                boolean z4 = false;
                int i6 = i5;
                while (i5 < length) {
                    Object[] objArr2 = this.f4872b;
                    Object obj2 = objArr2[i5];
                    objArr2[i5] = null;
                    if (elements.contains(obj2)) {
                        this.f4872b[i6] = obj2;
                        i6++;
                    } else {
                        z4 = true;
                    }
                    i5++;
                }
                i3 = i(i6);
                for (int i7 = 0; i7 < i4; i7++) {
                    Object[] objArr3 = this.f4872b;
                    Object obj3 = objArr3[i7];
                    objArr3[i7] = null;
                    if (elements.contains(obj3)) {
                        this.f4872b[i3] = obj3;
                        i3 = f(i3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                j();
                this.f4873c = g(i3 - this.f4871a);
            }
        }
        return z3;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i3, Object obj) {
        int b3 = b();
        if (i3 < 0 || i3 >= b3) {
            throw new IndexOutOfBoundsException(B0.c.g(i3, b3, "index: ", ", size: "));
        }
        int i4 = i(this.f4871a + i3);
        Object[] objArr = this.f4872b;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[b()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i3 = this.f4873c;
        if (length < i3) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i3);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int i4 = i(this.f4873c + this.f4871a);
        int i5 = this.f4871a;
        if (i5 < i4) {
            AbstractC0290e.T(0, i5, i4, this.f4872b, array);
        } else if (!isEmpty()) {
            Object[] objArr = this.f4872b;
            AbstractC0290e.T(0, this.f4871a, objArr.length, objArr, array);
            Object[] objArr2 = this.f4872b;
            AbstractC0290e.T(objArr2.length - this.f4871a, 0, i4, objArr2, array);
        }
        int i6 = this.f4873c;
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
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        j();
        e(elements.size() + b());
        d(i(b() + this.f4871a), elements);
        return true;
    }
}
