package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: u7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0756u7 extends AbstractC0416l0 {

    /* JADX INFO: renamed from: m */
    public static final Object[] f7694m = new Object[0];

    /* JADX INFO: renamed from: j */
    public int f7695j;

    /* JADX INFO: renamed from: k */
    public Object[] f7696k = f7694m;

    /* JADX INFO: renamed from: l */
    public int f7697l;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        int i2 = this.f7697l;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m4896l();
        m4891e(this.f7697l + 1);
        int iM4895j = m4895j(this.f7695j + i);
        int i3 = this.f7697l;
        if (i < ((i3 + 1) >> 1)) {
            if (iM4895j == 0) {
                Object[] objArr = this.f7696k;
                objArr.getClass();
                length = objArr.length - 1;
            } else {
                length = iM4895j - 1;
            }
            int length2 = this.f7695j;
            if (length2 == 0) {
                Object[] objArr2 = this.f7696k;
                objArr2.getClass();
                length2 = objArr2.length;
            }
            int i4 = length2 - 1;
            int i5 = this.f7695j;
            Object[] objArr3 = this.f7696k;
            if (length >= i5) {
                objArr3[i4] = objArr3[i5];
                AbstractC0202f8.m1744u(i5, i5 + 1, length + 1, objArr3, objArr3);
            } else {
                AbstractC0202f8.m1744u(i5 - 1, i5, objArr3.length, objArr3, objArr3);
                Object[] objArr4 = this.f7696k;
                objArr4[objArr4.length - 1] = objArr4[0];
                AbstractC0202f8.m1744u(0, 1, length + 1, objArr4, objArr4);
            }
            this.f7696k[length] = obj;
            this.f7695j = i4;
        } else {
            int iM4895j2 = m4895j(i3 + this.f7695j);
            Object[] objArr5 = this.f7696k;
            if (iM4895j < iM4895j2) {
                AbstractC0202f8.m1744u(iM4895j + 1, iM4895j, iM4895j2, objArr5, objArr5);
            } else {
                AbstractC0202f8.m1744u(1, 0, iM4895j2, objArr5, objArr5);
                Object[] objArr6 = this.f7696k;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0202f8.m1744u(iM4895j + 1, iM4895j, objArr6.length - 1, objArr6, objArr6);
            }
            this.f7696k[iM4895j] = obj;
        }
        this.f7697l++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        int i2 = this.f7697l;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f7697l) {
            return addAll(collection);
        }
        m4896l();
        m4891e(collection.size() + this.f7697l);
        int iM4895j = m4895j(this.f7697l + this.f7695j);
        int iM4895j2 = m4895j(this.f7695j + i);
        int size = collection.size();
        if (i >= ((this.f7697l + 1) >> 1)) {
            int i3 = iM4895j2 + size;
            Object[] objArr = this.f7696k;
            if (iM4895j2 < iM4895j) {
                int i4 = size + iM4895j;
                if (i4 <= objArr.length) {
                    AbstractC0202f8.m1744u(i3, iM4895j2, iM4895j, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC0202f8.m1744u(i3 - objArr.length, iM4895j2, iM4895j, objArr, objArr);
                } else {
                    int length = iM4895j - (i4 - objArr.length);
                    AbstractC0202f8.m1744u(0, length, iM4895j, objArr, objArr);
                    Object[] objArr2 = this.f7696k;
                    AbstractC0202f8.m1744u(i3, iM4895j2, length, objArr2, objArr2);
                }
            } else {
                AbstractC0202f8.m1744u(size, 0, iM4895j, objArr, objArr);
                Object[] objArr3 = this.f7696k;
                if (i3 >= objArr3.length) {
                    AbstractC0202f8.m1744u(i3 - objArr3.length, iM4895j2, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC0202f8.m1744u(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f7696k;
                    AbstractC0202f8.m1744u(i3, iM4895j2, objArr4.length - size, objArr4, objArr4);
                }
            }
            m4890d(iM4895j2, collection);
            return true;
        }
        int i5 = this.f7695j;
        int length2 = i5 - size;
        Object[] objArr5 = this.f7696k;
        if (iM4895j2 < i5) {
            AbstractC0202f8.m1744u(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f7696k;
            if (size >= iM4895j2) {
                AbstractC0202f8.m1744u(objArr6.length - size, 0, iM4895j2, objArr6, objArr6);
            } else {
                AbstractC0202f8.m1744u(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f7696k;
                AbstractC0202f8.m1744u(0, size, iM4895j2, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC0202f8.m1744u(length2, i5, iM4895j2, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM4895j2 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC0202f8.m1744u(length2, i5, iM4895j2, objArr5, objArr5);
            } else {
                AbstractC0202f8.m1744u(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f7696k;
                AbstractC0202f8.m1744u(0, this.f7695j + length3, iM4895j2, objArr8, objArr8);
            }
        }
        this.f7695j = length2;
        m4890d(m4893g(iM4895j2 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m4896l();
        m4891e(this.f7697l + 1);
        int length = this.f7695j;
        if (length == 0) {
            Object[] objArr = this.f7696k;
            objArr.getClass();
            length = objArr.length;
        }
        int i = length - 1;
        this.f7695j = i;
        this.f7696k[i] = obj;
        this.f7697l++;
    }

    public final void addLast(Object obj) {
        m4896l();
        m4891e(mo2903b() + 1);
        this.f7696k[m4895j(mo2903b() + this.f7695j)] = obj;
        this.f7697l = mo2903b() + 1;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: b */
    public final int mo2903b() {
        return this.f7697l;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: c */
    public final Object mo2904c(int i) {
        int i2 = this.f7697l;
        if (i < 0 || i >= i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return null;
        }
        if (i == mo2903b() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m4896l();
        int iM4895j = m4895j(this.f7695j + i);
        Object[] objArr = this.f7696k;
        Object obj = objArr[iM4895j];
        int i3 = this.f7697l >> 1;
        int i4 = this.f7695j;
        if (i < i3) {
            if (iM4895j >= i4) {
                AbstractC0202f8.m1744u(i4 + 1, i4, iM4895j, objArr, objArr);
            } else {
                AbstractC0202f8.m1744u(1, 0, iM4895j, objArr, objArr);
                Object[] objArr2 = this.f7696k;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f7695j;
                AbstractC0202f8.m1744u(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f7696k;
            int i6 = this.f7695j;
            objArr3[i6] = null;
            this.f7695j = m4892f(i6);
        } else {
            int iM4895j2 = m4895j((mo2903b() - 1) + i4);
            Object[] objArr4 = this.f7696k;
            if (iM4895j <= iM4895j2) {
                AbstractC0202f8.m1744u(iM4895j, iM4895j + 1, iM4895j2 + 1, objArr4, objArr4);
            } else {
                AbstractC0202f8.m1744u(iM4895j, iM4895j + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f7696k;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0202f8.m1744u(0, 1, iM4895j2 + 1, objArr5, objArr5);
            }
            this.f7696k[iM4895j2] = null;
        }
        this.f7697l--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m4896l();
            m4894h(this.f7695j, m4895j(mo2903b() + this.f7695j));
        }
        this.f7695j = 0;
        this.f7697l = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final void m4890d(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f7696k.length;
        while (i < length && it.hasNext()) {
            this.f7696k[i] = it.next();
            i++;
        }
        int i2 = this.f7695j;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f7696k[i3] = it.next();
        }
        this.f7697l = collection.size() + this.f7697l;
    }

    /* JADX INFO: renamed from: e */
    public final void m4891e(int i) {
        if (i < 0) {
            C0270h1.m2191g("Deque is too big.");
            return;
        }
        Object[] objArr = this.f7696k;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f7694m) {
            if (i < 10) {
                i = 10;
            }
            this.f7696k = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0202f8.m1744u(0, this.f7695j, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f7696k;
        int length2 = objArr3.length;
        int i3 = this.f7695j;
        AbstractC0202f8.m1744u(length2 - i3, 0, i3, objArr3, objArr2);
        this.f7695j = 0;
        this.f7696k = objArr2;
    }

    /* JADX INFO: renamed from: f */
    public final int m4892f(int i) {
        Object[] objArr = this.f7696k;
        objArr.getClass();
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    /* JADX INFO: renamed from: g */
    public final int m4893g(int i) {
        return i < 0 ? i + this.f7696k.length : i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo2903b = mo2903b();
        if (i >= 0 && i < iMo2903b) {
            return this.f7696k[m4895j(this.f7695j + i)];
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, iMo2903b, "index: ", ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m4894h(int i, int i2) {
        Object[] objArr = this.f7696k;
        if (i < i2) {
            objArr.getClass();
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Object[] objArr2 = this.f7696k;
            objArr2.getClass();
            Arrays.fill(objArr2, 0, i2, (Object) null);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM4895j = m4895j(mo2903b() + this.f7695j);
        int length = this.f7695j;
        if (length < iM4895j) {
            while (length < iM4895j) {
                if (af0.m187a(obj, this.f7696k[length])) {
                    i = this.f7695j;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f7695j) < iM4895j) {
            return -1;
        }
        int length2 = this.f7696k.length;
        while (length < length2) {
            if (af0.m187a(obj, this.f7696k[length])) {
                i = this.f7695j;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM4895j; i2++) {
            if (af0.m187a(obj, this.f7696k[i2])) {
                length = i2 + this.f7696k.length;
                i = this.f7695j;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo2903b() == 0;
    }

    /* JADX INFO: renamed from: j */
    public final int m4895j(int i) {
        Object[] objArr = this.f7696k;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: l */
    public final void m4896l() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM4895j = m4895j(this.f7697l + this.f7695j);
        int i2 = this.f7695j;
        if (i2 < iM4895j) {
            length = iM4895j - 1;
            if (i2 <= length) {
                while (!af0.m187a(obj, this.f7696k[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f7695j;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f7695j >= iM4895j) {
            do {
                iM4895j--;
                objArr = this.f7696k;
                if (-1 >= iM4895j) {
                    objArr.getClass();
                    length = objArr.length - 1;
                    int i3 = this.f7695j;
                    if (i3 <= length) {
                        while (!af0.m187a(obj, this.f7696k[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f7695j;
                    }
                }
                return length - i;
            } while (!af0.m187a(obj, objArr[iM4895j]));
            length = iM4895j + this.f7696k.length;
            i = this.f7695j;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo2904c(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM4895j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7696k.length != 0) {
            int iM4895j2 = m4895j(this.f7697l + this.f7695j);
            int i = this.f7695j;
            if (i < iM4895j2) {
                iM4895j = i;
                while (true) {
                    objArr = this.f7696k;
                    if (i >= iM4895j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f7696k[iM4895j] = obj;
                        iM4895j++;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iM4895j, iM4895j2, (Object) null);
            } else {
                int length = this.f7696k.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f7696k;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f7696k[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM4895j = m4895j(i2);
                for (int i3 = 0; i3 < iM4895j2; i3++) {
                    Object[] objArr3 = this.f7696k;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f7696k[iM4895j] = obj3;
                        iM4895j = m4892f(iM4895j);
                    }
                }
                z = z2;
            }
            if (z) {
                m4896l();
                this.f7697l = m4893g(iM4895j - this.f7695j);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m4896l();
        Object[] objArr = this.f7696k;
        int i = this.f7695j;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f7695j = m4892f(i);
        this.f7697l = mo2903b() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        m4896l();
        int iM4895j = m4895j((size() - 1) + this.f7695j);
        Object[] objArr = this.f7696k;
        Object obj = objArr[iM4895j];
        objArr[iM4895j] = null;
        this.f7697l = mo2903b() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        af0.m189c(i, i2, this.f7697l);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f7697l) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo2904c(i);
            return;
        }
        m4896l();
        int i4 = this.f7697l - i2;
        int i5 = this.f7695j;
        if (i < i4) {
            int iM4895j = m4895j((i - 1) + i5);
            int iM4895j2 = m4895j(this.f7695j + (i2 - 1));
            while (i > 0) {
                int i6 = iM4895j + 1;
                int iMin = Math.min(i, Math.min(i6, iM4895j2 + 1));
                Object[] objArr = this.f7696k;
                int i7 = iM4895j2 - iMin;
                int i8 = iM4895j - iMin;
                AbstractC0202f8.m1744u(i7 + 1, i8 + 1, i6, objArr, objArr);
                iM4895j = m4893g(i8);
                iM4895j2 = m4893g(i7);
                i -= iMin;
            }
            int iM4895j3 = m4895j(this.f7695j + i3);
            m4894h(this.f7695j, iM4895j3);
            this.f7695j = iM4895j3;
        } else {
            int iM4895j4 = m4895j(i5 + i2);
            int iM4895j5 = m4895j(this.f7695j + i);
            int i9 = this.f7697l;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f7696k;
                i2 = Math.min(i9, Math.min(objArr2.length - iM4895j4, objArr2.length - iM4895j5));
                Object[] objArr3 = this.f7696k;
                int i10 = iM4895j4 + i2;
                AbstractC0202f8.m1744u(iM4895j5, iM4895j4, i10, objArr3, objArr3);
                iM4895j4 = m4895j(i10);
                iM4895j5 = m4895j(iM4895j5 + i2);
            }
            int iM4895j6 = m4895j(this.f7697l + this.f7695j);
            m4894h(m4893g(iM4895j6 - i3), iM4895j6);
        }
        this.f7697l -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM4895j;
        Object[] objArr;
        collection.getClass();
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f7696k.length != 0) {
            int iM4895j2 = m4895j(this.f7697l + this.f7695j);
            int i = this.f7695j;
            if (i < iM4895j2) {
                iM4895j = i;
                while (true) {
                    objArr = this.f7696k;
                    if (i >= iM4895j2) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f7696k[iM4895j] = obj;
                        iM4895j++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                objArr.getClass();
                Arrays.fill(objArr, iM4895j, iM4895j2, (Object) null);
            } else {
                int length = this.f7696k.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f7696k;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f7696k[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM4895j = m4895j(i2);
                for (int i3 = 0; i3 < iM4895j2; i3++) {
                    Object[] objArr3 = this.f7696k;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f7696k[iM4895j] = obj3;
                        iM4895j = m4892f(iM4895j);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m4896l();
                this.f7697l = m4893g(iM4895j - this.f7695j);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo2903b = mo2903b();
        if (i < 0 || i >= iMo2903b) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, iMo2903b, "index: ", ", size: "));
            return null;
        }
        int iM4895j = m4895j(this.f7695j + i);
        Object[] objArr = this.f7696k;
        Object obj2 = objArr[iM4895j];
        objArr[iM4895j] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f7697l;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            objNewInstance.getClass();
            objArr = (Object[]) objNewInstance;
        }
        int iM4895j = m4895j(this.f7697l + this.f7695j);
        int i2 = this.f7695j;
        if (i2 < iM4895j) {
            AbstractC0202f8.m1745v(i2, iM4895j, 2, this.f7696k, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f7696k;
            AbstractC0202f8.m1744u(0, this.f7695j, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f7696k;
            AbstractC0202f8.m1744u(objArr3.length - this.f7695j, 0, iM4895j, objArr3, objArr);
        }
        int i3 = this.f7697l;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo2903b()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection.isEmpty()) {
            return false;
        }
        m4896l();
        m4891e(collection.size() + mo2903b());
        m4890d(m4895j(mo2903b() + this.f7695j), collection);
        return true;
    }
}
