package g6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: g6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1156e implements Collection, u6.a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f13295a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13296b;

    public C1156e(Object[] objArr, boolean z4) {
        t6.h.e(objArr, "values");
        this.f13295a = objArr;
        this.f13296b = z4;
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
        Object[] objArr = this.f13295a;
        t6.h.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i7 = 0;
            while (i7 < length) {
                if (objArr[i7] == null) {
                    break;
                }
                i7++;
            }
            i7 = -1;
        } else {
            int length2 = objArr.length;
            for (int i8 = 0; i8 < length2; i8++) {
                if (obj.equals(objArr[i8])) {
                    i7 = i8;
                    break;
                }
            }
            i7 = -1;
        }
        return i7 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        t6.h.e(collection, "elements");
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
        return this.f13295a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f13295a;
        t6.h.e(objArr, "array");
        return new C1152a(objArr);
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
        return this.f13295a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f13295a;
        t6.h.e(objArr, "<this>");
        if (this.f13296b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        t6.h.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        t6.h.e(objArr, "array");
        return t6.h.j(this, objArr);
    }
}
