package p000;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hy0 extends AbstractList implements RandomAccess, ee0 {

    /* JADX INFO: renamed from: m */
    public static final hy0 f3358m = new hy0(new Object[0], 0, false);

    /* JADX INFO: renamed from: j */
    public boolean f3359j;

    /* JADX INFO: renamed from: k */
    public Object[] f3360k;

    /* JADX INFO: renamed from: l */
    public int f3361l;

    public hy0(Object[] objArr, int i, boolean z) {
        this.f3359j = z;
        this.f3360k = objArr;
        this.f3361l = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        m2351c();
        if (i < 0 || i > (i2 = this.f3361l)) {
            dd0.m1159d(i, this.f3361l);
            return;
        }
        Object[] objArr = this.f3360k;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f3360k, i, objArr2, i + 1, this.f3361l - i);
            this.f3360k = objArr2;
        }
        this.f3360k[i] = obj;
        this.f3361l++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        m2351c();
        return super.addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    public final void m2350b(int i) {
        if (i < 0 || i >= this.f3361l) {
            dd0.m1159d(i, this.f3361l);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2351c() {
        if (this.f3359j) {
            return;
        }
        dd0.m1164i();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m2351c();
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final hy0 m2352d(int i) {
        if (i >= this.f3361l) {
            return new hy0(Arrays.copyOf(this.f3360k, i), this.f3361l, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m2350b(i);
        return this.f3360k[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i = 0; i < size; i++) {
            iHashCode = (iHashCode * 31) + get(i).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m2351c();
        m2350b(i);
        Object[] objArr = this.f3360k;
        Object obj = objArr[i];
        int i2 = this.f3361l;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.f3361l--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        m2351c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        m2351c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m2351c();
        m2350b(i);
        Object[] objArr = this.f3360k;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3361l;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2351c();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m2351c();
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m2351c();
        int i = this.f3361l;
        Object[] objArr = this.f3360k;
        if (i == objArr.length) {
            this.f3360k = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3360k;
        int i2 = this.f3361l;
        this.f3361l = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
