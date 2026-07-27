package f4;

import g4.AbstractC0464i;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* renamed from: f4.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0441r implements Collection, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f5685a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
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
        if (!(obj instanceof C0440q)) {
            return false;
        }
        return AbstractC0464i.N(this.f5685a, ((C0440q) obj).f5684a);
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (obj instanceof C0440q) {
                if (AbstractC0464i.N(this.f5685a, ((C0440q) obj).f5684a)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C0441r) {
            return kotlin.jvm.internal.i.a(this.f5685a, ((C0441r) obj).f5685a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f5685a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5685a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N4.g(3, this.f5685a);
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
        return this.f5685a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.m(this);
    }

    public final String toString() {
        return "ULongArray(storage=" + Arrays.toString(this.f5685a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.n(this, array);
    }
}
