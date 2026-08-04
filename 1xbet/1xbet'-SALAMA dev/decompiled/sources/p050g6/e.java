package p050g6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import t6.h;
import u6.a;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Collection, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f13301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13302b;

    public e(Object[] objArr, boolean z4) {
        h.e(objArr, "values");
        this.f13301a = objArr;
        this.f13302b = z4;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i7;
        Object[] objArr = this.f13301a;
        h.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] != null) {
                    i7++;
                }
            }
            i7 = -1;
        } else {
            int length2 = objArr.length;
            for (int i8 = 0; i8 < length2; i8++) {
                if (obj.equals(objArr[i8])) {
                    i7 = i8;
                }
            }
            i7 = -1;
        }
        return i7 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        h.e(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f13301a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f13301a;
        h.e(objArr, "array");
        return new a(objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f13301a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f13301a;
        h.e(objArr, "<this>");
        if (this.f13302b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        h.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        h.e(objArr, "array");
        return h.j(this, objArr);
    }
}
