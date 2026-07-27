package g4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* renamed from: g4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462g implements Collection, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f5743a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5744b;

    public C0462g(Object[] values, boolean z) {
        kotlin.jvm.internal.i.e(values, "values");
        this.f5743a = values;
        this.f5744b = z;
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
        int i2;
        Object[] objArr = this.f5743a;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i2 = 0;
            while (i2 < length) {
                if (objArr[i2] == null) {
                    break;
                }
                i2++;
            }
            i2 = -1;
        } else {
            int length2 = objArr.length;
            for (int i3 = 0; i3 < length2; i3++) {
                if (obj.equals(objArr[i3])) {
                    i2 = i3;
                    break;
                }
            }
            i2 = -1;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5743a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] array = this.f5743a;
        kotlin.jvm.internal.i.e(array, "array");
        return new N4.g(array);
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
        return this.f5743a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f5743a;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (this.f5744b && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.n(this, array);
    }
}
