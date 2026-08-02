package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ki0 extends AbstractC0416l0 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: m */
    public static final ki0 f4386m;

    /* JADX INFO: renamed from: j */
    public Object[] f4387j;

    /* JADX INFO: renamed from: k */
    public int f4388k;

    /* JADX INFO: renamed from: l */
    public boolean f4389l;

    static {
        ki0 ki0Var = new ki0(0);
        ki0Var.f4389l = true;
        f4386m = ki0Var;
    }

    public ki0(int i) {
        if (i >= 0) {
            this.f4387j = new Object[i];
        } else {
            C0270h1.m2190f("capacity must be non-negative.");
            throw null;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m3040g();
        int i2 = this.f4388k;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return;
        }
        ((AbstractList) this).modCount++;
        m3041h(i, 1);
        this.f4387j[i] = obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m3040g();
        int i2 = this.f4388k;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m3038e(i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: b */
    public final int mo2903b() {
        return this.f4388k;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: c */
    public final Object mo2904c(int i) {
        m3040g();
        int i2 = this.f4388k;
        if (i >= 0 && i < i2) {
            return m3042j(i);
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m3040g();
        m3043l(0, this.f4388k);
    }

    /* JADX INFO: renamed from: e */
    public final void m3038e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        m3041h(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.f4387j[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f4387j;
            int i = this.f4388k;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (af0.m187a(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m3039f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        m3041h(i, 1);
        this.f4387j[i] = obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m3040g() {
        if (this.f4389l) {
            dd0.m1164i();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.f4388k;
        if (i >= 0 && i < i2) {
            return this.f4387j[i];
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m3041h(int i, int i2) {
        int i3 = this.f4388k + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f4387j;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f4387j = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.f4387j;
        AbstractC0202f8.m1744u(i + i2, i, this.f4388k, objArr2, objArr2);
        this.f4388k += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.f4387j;
        int i = this.f4388k;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.f4388k; i++) {
            if (af0.m187a(this.f4387j[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f4388k == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final Object m3042j(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.f4387j;
        Object obj = objArr[i];
        AbstractC0202f8.m1744u(i, i + 1, this.f4388k, objArr, objArr);
        Object[] objArr2 = this.f4387j;
        int i2 = this.f4388k - 1;
        objArr2.getClass();
        objArr2[i2] = null;
        this.f4388k--;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m3043l(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.f4387j;
        AbstractC0202f8.m1744u(i, i + i2, this.f4388k, objArr, objArr);
        Object[] objArr2 = this.f4387j;
        int i3 = this.f4388k;
        objArr2.getClass();
        for (int i4 = i3 - i2; i4 < i3; i4++) {
            objArr2[i4] = null;
        }
        this.f4388k -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.f4388k - 1; i >= 0; i--) {
            if (af0.m187a(this.f4387j[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.f4388k;
        if (i >= 0 && i <= i2) {
            return new ii0(this, i);
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final int m3044p(int i, int i2, Collection collection, boolean z) {
        Object[] objArr;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            objArr = this.f4387j;
            if (i3 >= i2) {
                break;
            }
            int i5 = i + i3;
            if (collection.contains(objArr[i5]) == z) {
                Object[] objArr2 = this.f4387j;
                i3++;
                objArr2[i4 + i] = objArr2[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        AbstractC0202f8.m1744u(i + i4, i2 + i, this.f4388k, objArr, objArr);
        Object[] objArr3 = this.f4387j;
        int i7 = this.f4388k;
        objArr3.getClass();
        for (int i8 = i7 - i6; i8 < i7; i8++) {
            objArr3[i8] = null;
        }
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f4388k -= i6;
        return i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m3040g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo2904c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m3040g();
        return m3044p(0, this.f4388k, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m3040g();
        return m3044p(0, this.f4388k, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m3040g();
        int i2 = this.f4388k;
        if (i < 0 || i >= i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f4387j;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        af0.m189c(i, i2, this.f4388k);
        return new ji0(this.f4387j, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        int i = this.f4388k;
        Object[] objArr2 = this.f4387j;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, 0, i, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0202f8.m1744u(0, 0, i, objArr2, objArr);
        int i2 = this.f4388k;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return zg1.m5890a(this.f4387j, 0, this.f4388k, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m3040g();
        int i = this.f4388k;
        ((AbstractList) this).modCount++;
        m3041h(i, 1);
        this.f4387j[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.f4387j;
        int i = this.f4388k;
        objArr.getClass();
        zg1.m5893d(i, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m3040g();
        int size = collection.size();
        m3038e(this.f4388k, collection, size);
        return size > 0;
    }
}
