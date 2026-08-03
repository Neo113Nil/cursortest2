package i1;

/* renamed from: i1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188g extends java.util.AbstractList implements java.util.List {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object[] f3318d = new java.lang.Object[0];

    /* renamed from: a, reason: collision with root package name */
    public int f3319a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f3320b = f3318d;

    /* renamed from: c, reason: collision with root package name */
    public int f3321c;

    public final void a(int i2, java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        int length = this.f3320b.length;
        while (i2 < length && it.hasNext()) {
            this.f3320b[i2] = it.next();
            i2++;
        }
        int i3 = this.f3319a;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f3320b[i4] = it.next();
        }
        this.f3321c = collection.size() + this.f3321c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, java.lang.Object obj) {
        int i3;
        int i4 = this.f3321c;
        if (i2 < 0 || i2 > i4) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i4, ", size: "));
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
        b(this.f3321c + 1);
        int f2 = f(this.f3319a + i2);
        int i5 = this.f3321c;
        if (i2 < ((i5 + 1) >> 1)) {
            if (f2 == 0) {
                java.lang.Object[] objArr = this.f3320b;
                kotlin.jvm.internal.i.e(objArr, "<this>");
                f2 = objArr.length;
            }
            int i6 = f2 - 1;
            int i7 = this.f3319a;
            if (i7 == 0) {
                java.lang.Object[] objArr2 = this.f3320b;
                kotlin.jvm.internal.i.e(objArr2, "<this>");
                i3 = objArr2.length - 1;
            } else {
                i3 = i7 - 1;
            }
            int i8 = this.f3319a;
            if (i6 >= i8) {
                java.lang.Object[] objArr3 = this.f3320b;
                objArr3[i3] = objArr3[i8];
                i1.AbstractC0189h.L(objArr3, objArr3, i8, i8 + 1, i6 + 1);
            } else {
                java.lang.Object[] objArr4 = this.f3320b;
                i1.AbstractC0189h.L(objArr4, objArr4, i8 - 1, i8, objArr4.length);
                java.lang.Object[] objArr5 = this.f3320b;
                objArr5[objArr5.length - 1] = objArr5[0];
                i1.AbstractC0189h.L(objArr5, objArr5, 0, 1, i6 + 1);
            }
            this.f3320b[i6] = obj;
            this.f3319a = i3;
        } else {
            int f3 = f(this.f3319a + i5);
            if (f2 < f3) {
                java.lang.Object[] objArr6 = this.f3320b;
                i1.AbstractC0189h.L(objArr6, objArr6, f2 + 1, f2, f3);
            } else {
                java.lang.Object[] objArr7 = this.f3320b;
                i1.AbstractC0189h.L(objArr7, objArr7, 1, 0, f3);
                java.lang.Object[] objArr8 = this.f3320b;
                objArr8[0] = objArr8[objArr8.length - 1];
                i1.AbstractC0189h.L(objArr8, objArr8, f2 + 1, f2, objArr8.length - 1);
            }
            this.f3320b[f2] = obj;
        }
        this.f3321c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, java.util.Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        int i3 = this.f3321c;
        if (i2 < 0 || i2 > i3) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i3, ", size: "));
        }
        if (elements.isEmpty()) {
            return false;
        }
        if (i2 == this.f3321c) {
            return addAll(elements);
        }
        g();
        b(elements.size() + this.f3321c);
        int f2 = f(this.f3319a + this.f3321c);
        int f3 = f(this.f3319a + i2);
        int size = elements.size();
        if (i2 < ((this.f3321c + 1) >> 1)) {
            int i4 = this.f3319a;
            int i5 = i4 - size;
            if (f3 < i4) {
                java.lang.Object[] objArr = this.f3320b;
                i1.AbstractC0189h.L(objArr, objArr, i5, i4, objArr.length);
                if (size >= f3) {
                    java.lang.Object[] objArr2 = this.f3320b;
                    i1.AbstractC0189h.L(objArr2, objArr2, objArr2.length - size, 0, f3);
                } else {
                    java.lang.Object[] objArr3 = this.f3320b;
                    i1.AbstractC0189h.L(objArr3, objArr3, objArr3.length - size, 0, size);
                    java.lang.Object[] objArr4 = this.f3320b;
                    i1.AbstractC0189h.L(objArr4, objArr4, 0, size, f3);
                }
            } else if (i5 >= 0) {
                java.lang.Object[] objArr5 = this.f3320b;
                i1.AbstractC0189h.L(objArr5, objArr5, i5, i4, f3);
            } else {
                java.lang.Object[] objArr6 = this.f3320b;
                i5 += objArr6.length;
                int i6 = f3 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    i1.AbstractC0189h.L(objArr6, objArr6, i5, i4, f3);
                } else {
                    i1.AbstractC0189h.L(objArr6, objArr6, i5, i4, i4 + length);
                    java.lang.Object[] objArr7 = this.f3320b;
                    i1.AbstractC0189h.L(objArr7, objArr7, 0, this.f3319a + length, f3);
                }
            }
            this.f3319a = i5;
            a(d(f3 - size), elements);
        } else {
            int i7 = f3 + size;
            if (f3 < f2) {
                int i8 = size + f2;
                java.lang.Object[] objArr8 = this.f3320b;
                if (i8 <= objArr8.length) {
                    i1.AbstractC0189h.L(objArr8, objArr8, i7, f3, f2);
                } else if (i7 >= objArr8.length) {
                    i1.AbstractC0189h.L(objArr8, objArr8, i7 - objArr8.length, f3, f2);
                } else {
                    int length2 = f2 - (i8 - objArr8.length);
                    i1.AbstractC0189h.L(objArr8, objArr8, 0, length2, f2);
                    java.lang.Object[] objArr9 = this.f3320b;
                    i1.AbstractC0189h.L(objArr9, objArr9, i7, f3, length2);
                }
            } else {
                java.lang.Object[] objArr10 = this.f3320b;
                i1.AbstractC0189h.L(objArr10, objArr10, size, 0, f2);
                java.lang.Object[] objArr11 = this.f3320b;
                if (i7 >= objArr11.length) {
                    i1.AbstractC0189h.L(objArr11, objArr11, i7 - objArr11.length, f3, objArr11.length);
                } else {
                    i1.AbstractC0189h.L(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    java.lang.Object[] objArr12 = this.f3320b;
                    i1.AbstractC0189h.L(objArr12, objArr12, i7, f3, objArr12.length - size);
                }
            }
            a(f3, elements);
        }
        return true;
    }

    public final void addFirst(java.lang.Object obj) {
        g();
        b(this.f3321c + 1);
        int i2 = this.f3319a;
        if (i2 == 0) {
            java.lang.Object[] objArr = this.f3320b;
            kotlin.jvm.internal.i.e(objArr, "<this>");
            i2 = objArr.length;
        }
        int i3 = i2 - 1;
        this.f3319a = i3;
        this.f3320b[i3] = obj;
        this.f3321c++;
    }

    public final void addLast(java.lang.Object obj) {
        g();
        b(this.f3321c + 1);
        this.f3320b[f(this.f3319a + this.f3321c)] = obj;
        this.f3321c++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalStateException("Deque is too big.");
        }
        java.lang.Object[] objArr = this.f3320b;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f3318d) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f3320b = new java.lang.Object[i2];
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
        java.lang.Object[] objArr2 = new java.lang.Object[i3];
        i1.AbstractC0189h.L(objArr, objArr2, 0, this.f3319a, objArr.length);
        java.lang.Object[] objArr3 = this.f3320b;
        int length2 = objArr3.length;
        int i4 = this.f3319a;
        i1.AbstractC0189h.L(objArr3, objArr2, length2 - i4, 0, i4);
        this.f3319a = 0;
        this.f3320b = objArr2;
    }

    public final int c(int i2) {
        kotlin.jvm.internal.i.e(this.f3320b, "<this>");
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f3319a, f(this.f3319a + this.f3321c));
        }
        this.f3319a = 0;
        this.f3321c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.f3320b.length : i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            i1.AbstractC0189h.N(this.f3320b, i2, i3);
            return;
        }
        java.lang.Object[] objArr = this.f3320b;
        i1.AbstractC0189h.N(objArr, i2, objArr.length);
        i1.AbstractC0189h.N(this.f3320b, 0, i3);
    }

    public final int f(int i2) {
        java.lang.Object[] objArr = this.f3320b;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((java.util.AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object get(int i2) {
        int i3 = this.f3321c;
        if (i2 < 0 || i2 >= i3) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i3, ", size: "));
        }
        return this.f3320b[f(this.f3319a + i2)];
    }

    public final java.lang.Object h(int i2) {
        int i3 = this.f3321c;
        if (i2 < 0 || i2 >= i3) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i3, ", size: "));
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int f2 = f(this.f3319a + i2);
        java.lang.Object[] objArr = this.f3320b;
        java.lang.Object obj = objArr[f2];
        if (i2 < (this.f3321c >> 1)) {
            int i4 = this.f3319a;
            if (f2 >= i4) {
                i1.AbstractC0189h.L(objArr, objArr, i4 + 1, i4, f2);
            } else {
                i1.AbstractC0189h.L(objArr, objArr, 1, 0, f2);
                java.lang.Object[] objArr2 = this.f3320b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f3319a;
                i1.AbstractC0189h.L(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            java.lang.Object[] objArr3 = this.f3320b;
            int i6 = this.f3319a;
            objArr3[i6] = null;
            this.f3319a = c(i6);
        } else {
            int f3 = f((size() - 1) + this.f3319a);
            if (f2 <= f3) {
                java.lang.Object[] objArr4 = this.f3320b;
                i1.AbstractC0189h.L(objArr4, objArr4, f2, f2 + 1, f3 + 1);
            } else {
                java.lang.Object[] objArr5 = this.f3320b;
                i1.AbstractC0189h.L(objArr5, objArr5, f2, f2 + 1, objArr5.length);
                java.lang.Object[] objArr6 = this.f3320b;
                objArr6[objArr6.length - 1] = objArr6[0];
                i1.AbstractC0189h.L(objArr6, objArr6, 0, 1, f3 + 1);
            }
            this.f3320b[f3] = null;
        }
        this.f3321c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(java.lang.Object obj) {
        int i2;
        int f2 = f(this.f3319a + this.f3321c);
        int i3 = this.f3319a;
        if (i3 < f2) {
            while (i3 < f2) {
                if (kotlin.jvm.internal.i.a(obj, this.f3320b[i3])) {
                    i2 = this.f3319a;
                } else {
                    i3++;
                }
            }
            return -1;
        }
        if (i3 < f2) {
            return -1;
        }
        int length = this.f3320b.length;
        while (true) {
            if (i3 >= length) {
                for (int i4 = 0; i4 < f2; i4++) {
                    if (kotlin.jvm.internal.i.a(obj, this.f3320b[i4])) {
                        i3 = i4 + this.f3320b.length;
                        i2 = this.f3319a;
                    }
                }
                return -1;
            }
            if (kotlin.jvm.internal.i.a(obj, this.f3320b[i3])) {
                i2 = this.f3319a;
                break;
            }
            i3++;
        }
        return i3 - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f3321c == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        int length;
        int i2;
        int f2 = f(this.f3319a + this.f3321c);
        int i3 = this.f3319a;
        if (i3 < f2) {
            length = f2 - 1;
            if (i3 <= length) {
                while (!kotlin.jvm.internal.i.a(obj, this.f3320b[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f3319a;
                return length - i2;
            }
            return -1;
        }
        if (i3 > f2) {
            int i4 = f2 - 1;
            while (true) {
                if (-1 >= i4) {
                    java.lang.Object[] objArr = this.f3320b;
                    kotlin.jvm.internal.i.e(objArr, "<this>");
                    length = objArr.length - 1;
                    int i5 = this.f3319a;
                    if (i5 <= length) {
                        while (!kotlin.jvm.internal.i.a(obj, this.f3320b[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f3319a;
                    }
                } else {
                    if (kotlin.jvm.internal.i.a(obj, this.f3320b[i4])) {
                        length = i4 + this.f3320b.length;
                        i2 = this.f3319a;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ java.lang.Object remove(int i2) {
        return h(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection elements) {
        int f2;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3320b.length != 0) {
            int f3 = f(this.f3319a + this.f3321c);
            int i2 = this.f3319a;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    java.lang.Object obj = this.f3320b[i2];
                    if (elements.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f3320b[f2] = obj;
                        f2++;
                    }
                    i2++;
                }
                i1.AbstractC0189h.N(this.f3320b, f2, f3);
            } else {
                int length = this.f3320b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    java.lang.Object[] objArr = this.f3320b;
                    java.lang.Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f3320b[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    java.lang.Object[] objArr2 = this.f3320b;
                    java.lang.Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f3320b[f2] = obj3;
                        f2 = c(f2);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f3321c = d(f2 - this.f3319a);
            }
        }
        return z2;
    }

    public final java.lang.Object removeFirst() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        java.lang.Object[] objArr = this.f3320b;
        int i2 = this.f3319a;
        java.lang.Object obj = objArr[i2];
        objArr[i2] = null;
        this.f3319a = c(i2);
        this.f3321c--;
        return obj;
    }

    public final java.lang.Object removeLast() {
        if (isEmpty()) {
            throw new java.util.NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int f2 = f((size() - 1) + this.f3319a);
        java.lang.Object[] objArr = this.f3320b;
        java.lang.Object obj = objArr[f2];
        objArr[f2] = null;
        this.f3321c--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        Q1.l.d(i2, i3, this.f3321c);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.f3321c) {
            clear();
            return;
        }
        if (i4 == 1) {
            h(i2);
            return;
        }
        g();
        if (i2 < this.f3321c - i3) {
            int f2 = f(this.f3319a + (i2 - 1));
            int f3 = f(this.f3319a + (i3 - 1));
            while (i2 > 0) {
                int i5 = f2 + 1;
                int min = java.lang.Math.min(i2, java.lang.Math.min(i5, f3 + 1));
                java.lang.Object[] objArr = this.f3320b;
                int i6 = f3 - min;
                int i7 = f2 - min;
                i1.AbstractC0189h.L(objArr, objArr, i6 + 1, i7 + 1, i5);
                f2 = d(i7);
                f3 = d(i6);
                i2 -= min;
            }
            int f4 = f(this.f3319a + i4);
            e(this.f3319a, f4);
            this.f3319a = f4;
        } else {
            int f5 = f(this.f3319a + i3);
            int f6 = f(this.f3319a + i2);
            int i8 = this.f3321c;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                java.lang.Object[] objArr2 = this.f3320b;
                i3 = java.lang.Math.min(i8, java.lang.Math.min(objArr2.length - f5, objArr2.length - f6));
                java.lang.Object[] objArr3 = this.f3320b;
                int i9 = f5 + i3;
                i1.AbstractC0189h.L(objArr3, objArr3, f6, f5, i9);
                f5 = f(i9);
                f6 = f(f6 + i3);
            }
            int f7 = f(this.f3319a + this.f3321c);
            e(d(f7 - i4), f7);
        }
        this.f3321c -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection elements) {
        int f2;
        kotlin.jvm.internal.i.e(elements, "elements");
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f3320b.length != 0) {
            int f3 = f(this.f3319a + this.f3321c);
            int i2 = this.f3319a;
            if (i2 < f3) {
                f2 = i2;
                while (i2 < f3) {
                    java.lang.Object obj = this.f3320b[i2];
                    if (elements.contains(obj)) {
                        this.f3320b[f2] = obj;
                        f2++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                i1.AbstractC0189h.N(this.f3320b, f2, f3);
            } else {
                int length = this.f3320b.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    java.lang.Object[] objArr = this.f3320b;
                    java.lang.Object obj2 = objArr[i2];
                    objArr[i2] = null;
                    if (elements.contains(obj2)) {
                        this.f3320b[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                f2 = f(i3);
                for (int i4 = 0; i4 < f3; i4++) {
                    java.lang.Object[] objArr2 = this.f3320b;
                    java.lang.Object obj3 = objArr2[i4];
                    objArr2[i4] = null;
                    if (elements.contains(obj3)) {
                        this.f3320b[f2] = obj3;
                        f2 = c(f2);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.f3321c = d(f2 - this.f3319a);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final java.lang.Object set(int i2, java.lang.Object obj) {
        int i3 = this.f3321c;
        if (i2 < 0 || i2 >= i3) {
            throw new java.lang.IndexOutOfBoundsException(B1.a.h("index: ", i2, i3, ", size: "));
        }
        int f2 = f(this.f3319a + i2);
        java.lang.Object[] objArr = this.f3320b;
        java.lang.Object obj2 = objArr[f2];
        objArr[f2] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3321c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray() {
        return toArray(new java.lang.Object[this.f3321c]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        h(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        int length = array.length;
        int i2 = this.f3321c;
        if (length < i2) {
            java.lang.Object newInstance = java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), i2);
            kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            array = (java.lang.Object[]) newInstance;
        }
        int f2 = f(this.f3319a + this.f3321c);
        int i3 = this.f3319a;
        if (i3 < f2) {
            i1.AbstractC0189h.L(this.f3320b, array, 0, i3, f2);
        } else if (!isEmpty()) {
            java.lang.Object[] objArr = this.f3320b;
            i1.AbstractC0189h.L(objArr, array, 0, this.f3319a, objArr.length);
            java.lang.Object[] objArr2 = this.f3320b;
            i1.AbstractC0189h.L(objArr2, array, objArr2.length - this.f3319a, 0, f2);
        }
        int i4 = this.f3321c;
        if (i4 < array.length) {
            array[i4] = null;
        }
        return array;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(java.lang.Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(java.util.Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        g();
        b(elements.size() + this.f3321c);
        a(f(this.f3319a + this.f3321c), elements);
        return true;
    }
}
