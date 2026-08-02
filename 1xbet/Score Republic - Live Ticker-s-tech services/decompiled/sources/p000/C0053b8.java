package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: b8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0053b8 implements Collection {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C0089c8 f755j;

    public C0053b8(C0089c8 c0089c8) {
        this.f755j = c0089c8;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f755j.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f755j.m5294a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f755j.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0904y7(this.f755j, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0089c8 c0089c8 = this.f755j;
        int iM5294a = c0089c8.m5294a(obj);
        if (iM5294a < 0) {
            return false;
        }
        c0089c8.mo5301h(iM5294a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0089c8 c0089c8 = this.f755j;
        int i = c0089c8.f8453l;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0089c8.m5303j(i2))) {
                c0089c8.mo5301h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0089c8 c0089c8 = this.f755j;
        int i = c0089c8.f8453l;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0089c8.m5303j(i2))) {
                c0089c8.mo5301h(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f755j.f8453l;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0089c8 c0089c8 = this.f755j;
        int i = c0089c8.f8453l;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0089c8.m5303j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0089c8 c0089c8 = this.f755j;
        int i = c0089c8.f8453l;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0089c8.m5303j(i2);
        }
        return objArr;
    }
}
