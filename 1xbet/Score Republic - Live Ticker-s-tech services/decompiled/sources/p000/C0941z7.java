package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0941z7 implements Set {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0089c8 f9623j;

    public C0941z7(C0089c8 c0089c8) {
        this.f9623j = c0089c8;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f9623j.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f9623j.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f9623j.m898k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        C0089c8 c0089c8 = this.f9623j;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return c0089c8.f8453l == set.size() && c0089c8.m898k(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0089c8 c0089c8 = this.f9623j;
        int iHashCode = 0;
        for (int i = c0089c8.f8453l - 1; i >= 0; i--) {
            Object objM5299f = c0089c8.m5299f(i);
            iHashCode += objM5299f == null ? 0 : objM5299f.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f9623j.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0904y7(this.f9623j, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0089c8 c0089c8 = this.f9623j;
        int iM5297d = c0089c8.m5297d(obj);
        if (iM5297d < 0) {
            return false;
        }
        c0089c8.mo5301h(iM5297d);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f9623j.m899l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0089c8 c0089c8 = this.f9623j;
        int i = c0089c8.f8453l;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(c0089c8.m5299f(i2))) {
                c0089c8.mo5301h(i2);
            }
        }
        return i != c0089c8.f8453l;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f9623j.f8453l;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0089c8 c0089c8 = this.f9623j;
        int i = c0089c8.f8453l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0089c8.m5299f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0089c8 c0089c8 = this.f9623j;
        int i = c0089c8.f8453l;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0089c8.m5299f(i2);
        }
        return objArr;
    }
}
