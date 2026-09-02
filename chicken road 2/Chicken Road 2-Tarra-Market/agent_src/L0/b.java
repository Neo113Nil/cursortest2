package L0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class b extends AbstractList implements List {

    /* renamed from: d, reason: collision with root package name */
    public static final Object[] f209d = new Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f210a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f211b = f209d;

    /* renamed from: c, reason: collision with root package name */
    public int f212c;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f211b.length;
        while (i2 < length && it.hasNext()) {
            this.f211b[i2] = it.next();
            i2++;
        }
        int i3 = this.f210a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f211b[i4] = it.next();
        }
        this.f212c = collection.size() + this.f212c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        int i4 = this.f212c;
        if (i2 < 0 || i2 > i4) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i4);
        }
        if (i2 == i4) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.f212c + 1);
        int f2 = f(this.f210a + i2);
        int i5 = this.f212c;
        if (i2 < ((i5 + 1) >> 1)) {
            if (f2 == 0) {
                Object[] objArr = this.f211b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                f2 = objArr.length;
            }
            int i6 = f2 - 1;
            int i7 = this.f210a;
            if (i7 == 0) {
                Object[] objArr2 = this.f211b;
                kotlin.jvm.internal.j.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f210a;
            if (i6 >= i8) {
                Object[] objArr3 = this.f211b;
                objArr3[i3] = objArr3[i8];
                c.L(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                Object[] objArr4 = this.f211b;
                c.L(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                Object[] objArr5 = this.f211b;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.L(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f211b[i6] = obj;
            this.f210a = i3;
        } else {
            int f3 = f(this.f210a + i5);
            if (f2 < f3) {
                Object[] objArr6 = this.f211b;
                c.L(objArr6, objArr6, f2 + 1, f2, f3);
            } else {
                Object[] objArr7 = this.f211b;
                c.L(objArr7, objArr7, 1, 0, f3);
                Object[] objArr8 = this.f211b;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.L(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
            }
            this.f211b[f2] = obj;
        }
        this.f212c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        int i3 = this.f212c;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f212c) {
            return addAll(elements);
        }
        g();
        b(elements.size() + this.f212c);
        int f2 = f(this.f210a + this.f212c);
        int f3 = f(this.f210a + i2);
        int size = elements.size();
        if (i2 < ((this.f212c + 1) >> 1)) {
            int i4 = this.f210a;
            int i5 = i4 - size;
            if (f3 < i4) {
                Object[] objArr = this.f211b;
                c.L(objArr, objArr, i5, i4, objArr.length);
                if (size >= f3) {
                    Object[] objArr2 = this.f211b;
                    c.L(objArr2, objArr2, objArr2.length - size, 0, f3);
                } else {
                    Object[] objArr3 = this.f211b;
                    c.L(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f211b;
                    c.L(objArr4, objArr4, 0, size, f3);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.f211b;
                c.L(objArr5, objArr5, i5, i4, f3);
            } else {
                Object[] objArr6 = this.f211b;
                i5 += objArr6.length;
                int i6 = f3 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    c.L(objArr6, objArr6, i5, i4, f3);
                } else {
                    c.L(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.f211b;
                    c.L(objArr7, objArr7, 0, this.f210a + length, f3);
                }
            }
            this.f210a = i5;
            a(d(f3 - size), elements);
        } else {
            int i7 = f3 + size;
            if (f3 < f2) {
                int i8 = size + f2;
                Object[] objArr8 = this.f211b;
                if (i8 <= objArr8.length) {
                    c.L(objArr8, objArr8, i7, f3, f2);
                } else if (i7 >= objArr8.length) {
                    c.L(objArr8, objArr8, i7 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i8 - objArr8.length);
                    c.L(objArr8, objArr8, 0, length2, f2);
                    Object[] objArr9 = this.f211b;
                    c.L(objArr9, objArr9, i7, f3, length2);
                }
            } else {
                Object[] objArr10 = this.f211b;
                c.L(objArr10, objArr10, size, 0, f2);
                Object[] objArr11 = this.f211b;
                if (i7 >= objArr11.length) {
                    c.L(objArr11, objArr11, i7 - objArr11.length, f3, objArr11.length);
                } else {
                    c.L(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f211b;
                    c.L(objArr12, objArr12, i7, f3, objArr12.length - size);
                }
            }
            a(f3, elements);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.f212c + 1);
        int i2 = this.f210a;
        if (i2 == 0) {
            Object[] objArr = this.f211b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f210a = i3;
        this.f211b[i3] = obj;
        this.f212c++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.f212c + 1);
        this.f211b[f(this.f210a + this.f212c)] = obj;
        this.f212c++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f211b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f209d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f211b = new Object[i2];
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
        c.L(objArr, objArr2, 0, this.f210a, objArr.length);
        Object[] objArr3 = this.f211b;
        int length2 = objArr3.length;
        int i4 = this.f210a;
        c.L(objArr3, objArr2, length2 - i4, 0, i4);
        this.f210a = 0;
        this.f211b = objArr2;
    }

    public final int c(int i2) {
        kotlin.jvm.internal.j.e(this.f211b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f210a, f(this.f210a + this.f212c));
        }
        this.f210a = 0;
        this.f212c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.f211b.length : i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            Object[] objArr = this.f211b;
            kotlin.jvm.internal.j.e(objArr, "<this>");
            Arrays.fill(objArr, i2, i3, (Object) null);
        } else {
            Object[] objArr2 = this.f211b;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            Object[] objArr3 = this.f211b;
            kotlin.jvm.internal.j.e(objArr3, "<this>");
            Arrays.fill(objArr3, 0, i3, (Object) null);
        }
    }

    public final int f(int i2) {
        Object[] objArr = this.f211b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.f212c;
        if (i2 >= 0 && i2 < i3) {
            return this.f211b[f(this.f210a + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int f2 = f(this.f210a + this.f212c);
        int i3 = this.f210a;
        if (i3 < f2) {
            while (i3 < f2) {
                if (kotlin.jvm.internal.j.a(obj, this.f211b[i3])) {
                    i2 = this.f210a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < f2) {
            return -1;
        }
        int length = this.f211b.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < f2; i4++) {
                    if (kotlin.jvm.internal.j.a(obj, this.f211b[i4])) {
                        i3 = i4 + this.f211b.length;
                        i2 = this.f210a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.j.a(obj, this.f211b[i3])) {
                i2 = this.f210a;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f212c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int f2 = f(this.f210a + this.f212c);
        int i3 = this.f210a;
        if (i3 < f2) {
            length = f2 - 1;
            if (i3 <= length) {
                while (!kotlin.jvm.internal.j.a(obj, this.f211b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f210a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > f2) {
            int i4 = f2 - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f211b;
                    kotlin.jvm.internal.j.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f210a;
                    if (i5 <= length) {
                        while (!kotlin.jvm.internal.j.a(obj, this.f211b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f210a;
                    }
                } else {
                    if (kotlin.jvm.internal.j.a(obj, this.f211b[i4])) {
                        length = i4 + this.f211b.length;
                        i2 = this.f210a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.f212c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int f2 = f(this.f210a + i2);
        Object[] objArr = this.f211b;
        Object obj = objArr[f2];
        if (i2 < (this.f212c >> 1)) {
            int i4 = this.f210a;
            if (f2 >= i4) {
                c.L(objArr, objArr, i4 + 1, i4, f2);
            } else {
                c.L(objArr, objArr, 1, 0, f2);
                Object[] objArr2 = this.f211b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f210a;
                c.L(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f211b;
            int i6 = this.f210a;
            objArr3[i6] = null;
            this.f210a = c(i6);
        } else {
            int f3 = f((size() - 1) + this.f210a);
            if (f2 <= f3) {
                Object[] objArr4 = this.f211b;
                c.L(objArr4, objArr4, f2, f2 + 1, f3 + 1);
            } else {
                Object[] objArr5 = this.f211b;
                c.L(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                Object[] objArr6 = this.f211b;
                objArr6[objArr6.length - 1] = objArr6[0];
                c.L(objArr6, objArr6, 0, 1, f3 + 1);
            }
            this.f211b[f3] = null;
        }
        this.f212c--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection elements) {
        int f2;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f211b.length != 0) {
            int f3 = f(this.f210a + this.f212c);
            int i2 = this.f210a;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    Object obj = this.f211b[i2];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f211b[f2] = obj;
                        f2++;
                    }
                    i2++;
                }
                Object[] objArr = this.f211b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, f2, f3, (Object) null);
            } else {
                int length = this.f211b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f211b;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (elements.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f211b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    Object[] objArr3 = this.f211b;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f211b[f2] = obj3;
                        f2 = c(f2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f212c = d(f2 - this.f210a);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f211b;
        int i2 = this.f210a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f210a = c(i2);
        this.f212c--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f2 = f((size() - 1) + this.f210a);
        Object[] objArr = this.f211b;
        Object obj = objArr[f2];
        objArr[f2] = null;
        this.f212c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        int i4 = this.f212c;
        if (i2 < 0 || i3 > i4) {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }
        int i5 = i3 - i2;
        if (i5 == 0) {
            return;
        }
        if (i5 == this.f212c) {
            clear();
            return;
        }
        if (i5 == 1) {
            remove(i2);
            return;
        }
        g();
        if (i2 < this.f212c - i3) {
            int f2 = f((i2 - 1) + this.f210a);
            int f3 = f((i3 - 1) + this.f210a);
            while (i2 > 0) {
                int i6 = f2 + 1;
                int min = Math.min(i2, Math.min(i6, f3 + 1));
                Object[] objArr = this.f211b;
                int i7 = f3 - min;
                int i8 = f2 - min;
                c.L(objArr, objArr, i7 + 1, i8 + 1, i6);
                f2 = d(i8);
                f3 = d(i7);
                i2 -= min;
            }
            int f4 = f(this.f210a + i5);
            e(this.f210a, f4);
            this.f210a = f4;
        } else {
            int f5 = f(this.f210a + i3);
            int f6 = f(this.f210a + i2);
            int i9 = this.f212c;
            while (true) {
                i9 -= i3;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f211b;
                i3 = Math.min(i9, Math.min(objArr2.length - f5, objArr2.length - f6));
                Object[] objArr3 = this.f211b;
                int i10 = f5 + i3;
                c.L(objArr3, objArr3, f6, f5, i10);
                f5 = f(i10);
                f6 = f(f6 + i3);
            }
            int f7 = f(this.f210a + this.f212c);
            e(d(f7 - i5), f7);
        }
        this.f212c -= i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection elements) {
        int f2;
        kotlin.jvm.internal.j.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f211b.length != 0) {
            int f3 = f(this.f210a + this.f212c);
            int i2 = this.f210a;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    Object obj = this.f211b[i2];
                    if (elements.contains(obj)) {
                        this.f211b[f2] = obj;
                        f2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f211b;
                kotlin.jvm.internal.j.e(objArr, "<this>");
                Arrays.fill(objArr, f2, f3, (Object) null);
            } else {
                int length = this.f211b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f211b;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f211b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    Object[] objArr3 = this.f211b;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (elements.contains(obj3)) {
                        this.f211b[f2] = obj3;
                        f2 = c(f2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f212c = d(f2 - this.f210a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.f212c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int f2 = f(this.f210a + i2);
        Object[] objArr = this.f211b;
        Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f212c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f212c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.j.e(array, "array");
        int length = array.length;
        int i2 = this.f212c;
        if (length < i2) {
            Object newInstance = Array.newInstance(array.getClass().getComponentType(), i2);
            kotlin.jvm.internal.j.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (Object[]) newInstance;
        }
        int f2 = f(this.f210a + this.f212c);
        int i3 = this.f210a;
        if (i3 < f2) {
            c.L(this.f211b, array, 0, i3, f2);
        } else if (!isEmpty()) {
            Object[] objArr = this.f211b;
            c.L(objArr, array, 0, this.f210a, objArr.length);
            Object[] objArr2 = this.f211b;
            c.L(objArr2, array, objArr2.length - this.f210a, 0, f2);
        }
        int i4 = this.f212c;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
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
    public final boolean addAll(Collection elements) {
        kotlin.jvm.internal.j.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        g();
        b(elements.size() + this.f212c);
        a(f(this.f210a + this.f212c), elements);
        return true;
    }
}
