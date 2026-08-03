package i1;

/* renamed from: i1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187f implements java.util.Collection {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object[] f3316a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3317b;

    public C0187f(java.lang.Object[] values, boolean z2) {
        kotlin.jvm.internal.i.e(values, "values");
        this.f3316a = values;
        this.f3317b = z2;
    }

    @Override // java.util.Collection
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        int i2;
        java.lang.Object[] objArr = this.f3316a;
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
    public final boolean containsAll(java.util.Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        java.util.Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f3316a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        java.lang.Object[] array = this.f3316a;
        kotlin.jvm.internal.i.e(array, "array");
        return new i1.C0183b(array);
    }

    @Override // java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f3316a.length;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        java.lang.Object[] objArr = this.f3316a;
        kotlin.jvm.internal.i.e(objArr, "<this>");
        if (this.f3317b && objArr.getClass().equals(java.lang.Object[].class)) {
            return objArr;
        }
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length, java.lang.Object[].class);
        kotlin.jvm.internal.i.d(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.k(this, array);
    }
}
