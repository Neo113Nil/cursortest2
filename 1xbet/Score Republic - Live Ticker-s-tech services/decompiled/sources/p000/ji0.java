package p000;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ji0 extends AbstractC0416l0 implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: j */
    public Object[] f3939j;

    /* JADX INFO: renamed from: k */
    public final int f3940k;

    /* JADX INFO: renamed from: l */
    public int f3941l;

    /* JADX INFO: renamed from: m */
    public final ji0 f3942m;

    /* JADX INFO: renamed from: n */
    public final ki0 f3943n;

    public ji0(Object[] objArr, int i, int i2, ji0 ji0Var, ki0 ki0Var) {
        objArr.getClass();
        ki0Var.getClass();
        this.f3939j = objArr;
        this.f3940k = i;
        this.f3941l = i2;
        this.f3942m = ji0Var;
        this.f3943n = ki0Var;
        ((AbstractList) this).modCount = ((AbstractList) ki0Var).modCount;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m2908h();
        m2907g();
        int i2 = this.f3941l;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        } else {
            m2906f(this.f3940k + i, obj);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        collection.getClass();
        m2908h();
        m2907g();
        int i2 = this.f3941l;
        if (i < 0 || i > i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return false;
        }
        int size = collection.size();
        m2905e(this.f3940k + i, collection, size);
        return size > 0;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: b */
    public final int mo2903b() {
        m2907g();
        return this.f3941l;
    }

    @Override // p000.AbstractC0416l0
    /* JADX INFO: renamed from: c */
    public final Object mo2904c(int i) {
        m2908h();
        m2907g();
        int i2 = this.f3941l;
        if (i >= 0 && i < i2) {
            return m2909j(this.f3940k + i);
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2908h();
        m2907g();
        m2910l(this.f3940k, this.f3941l);
    }

    /* JADX INFO: renamed from: e */
    public final void m2905e(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        ki0 ki0Var = this.f3943n;
        ji0 ji0Var = this.f3942m;
        if (ji0Var != null) {
            ji0Var.m2905e(i, collection, i2);
        } else {
            ki0 ki0Var2 = ki0.f4386m;
            ki0Var.m3038e(i, collection, i2);
        }
        this.f3939j = ki0Var.f4387j;
        this.f3941l += i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m2907g();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.f3939j;
            int i = this.f3941l;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (af0.m187a(objArr[this.f3940k + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m2906f(int i, Object obj) {
        ((AbstractList) this).modCount++;
        ki0 ki0Var = this.f3943n;
        ji0 ji0Var = this.f3942m;
        if (ji0Var != null) {
            ji0Var.m2906f(i, obj);
        } else {
            ki0 ki0Var2 = ki0.f4386m;
            ki0Var.m3039f(i, obj);
        }
        this.f3939j = ki0Var.f4387j;
        this.f3941l++;
    }

    /* JADX INFO: renamed from: g */
    public final void m2907g() {
        if (((AbstractList) this.f3943n).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2907g();
        int i2 = this.f3941l;
        if (i >= 0 && i < i2) {
            return this.f3939j[this.f3940k + i];
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m2908h() {
        if (this.f3943n.f4389l) {
            dd0.m1164i();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m2907g();
        Object[] objArr = this.f3939j;
        int i = this.f3941l;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f3940k + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m2907g();
        for (int i = 0; i < this.f3941l; i++) {
            if (af0.m187a(this.f3939j[this.f3940k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m2907g();
        return this.f3941l == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX INFO: renamed from: j */
    public final Object m2909j(int i) {
        Object objM3042j;
        ((AbstractList) this).modCount++;
        ji0 ji0Var = this.f3942m;
        if (ji0Var != null) {
            objM3042j = ji0Var.m2909j(i);
        } else {
            ki0 ki0Var = ki0.f4386m;
            objM3042j = this.f3943n.m3042j(i);
        }
        this.f3941l--;
        return objM3042j;
    }

    /* JADX INFO: renamed from: l */
    public final void m2910l(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        ji0 ji0Var = this.f3942m;
        if (ji0Var != null) {
            ji0Var.m2910l(i, i2);
        } else {
            ki0 ki0Var = ki0.f4386m;
            this.f3943n.m3043l(i, i2);
        }
        this.f3941l -= i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m2907g();
        for (int i = this.f3941l - 1; i >= 0; i--) {
            if (af0.m187a(this.f3939j[this.f3940k + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m2907g();
        int i2 = this.f3941l;
        if (i >= 0 && i <= i2) {
            return new ii0(this, i);
        }
        C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
        return null;
    }

    /* JADX INFO: renamed from: p */
    public final int m2911p(int i, int i2, Collection collection, boolean z) {
        int iM3044p;
        ji0 ji0Var = this.f3942m;
        if (ji0Var != null) {
            iM3044p = ji0Var.m2911p(i, i2, collection, z);
        } else {
            ki0 ki0Var = ki0.f4386m;
            iM3044p = this.f3943n.m3044p(i, i2, collection, z);
        }
        if (iM3044p > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f3941l -= iM3044p;
        return iM3044p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2908h();
        m2907g();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo2904c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        m2908h();
        m2907g();
        return m2911p(this.f3940k, this.f3941l, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        m2908h();
        m2907g();
        return m2911p(this.f3940k, this.f3941l, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2908h();
        m2907g();
        int i2 = this.f3941l;
        if (i < 0 || i >= i2) {
            C0270h1.m2193i(AbstractC0024an.m281d(i, i2, "index: ", ", size: "));
            return null;
        }
        Object[] objArr = this.f3939j;
        int i3 = this.f3940k;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        af0.m189c(i, i2, this.f3941l);
        return new ji0(this.f3939j, this.f3940k + i, i2 - i, this, this.f3943n);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        m2907g();
        int length = objArr.length;
        int i = this.f3941l;
        Object[] objArr2 = this.f3939j;
        int i2 = this.f3940k;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr2, i2, i + i2, objArr.getClass());
            objArrCopyOfRange.getClass();
            return objArrCopyOfRange;
        }
        AbstractC0202f8.m1744u(0, i2, i + i2, objArr2, objArr);
        int i3 = this.f3941l;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m2907g();
        return zg1.m5890a(this.f3939j, this.f3940k, this.f3941l, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2908h();
        m2907g();
        m2906f(this.f3940k + this.f3941l, obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m2907g();
        Object[] objArr = this.f3939j;
        int i = this.f3941l;
        int i2 = this.f3940k;
        int i3 = i + i2;
        objArr.getClass();
        zg1.m5893d(i3, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i2, i3);
        objArrCopyOfRange.getClass();
        return objArrCopyOfRange;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        collection.getClass();
        m2908h();
        m2907g();
        int size = collection.size();
        m2905e(this.f3940k + this.f3941l, collection, size);
        return size > 0;
    }
}
