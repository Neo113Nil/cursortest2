package f4;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import u4.InterfaceC1481a;

/* loaded from: classes.dex */
public final class u implements Collection, InterfaceC1481a {

    /* renamed from: a, reason: collision with root package name */
    public final short[] f5688a;

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
        if (!(obj instanceof C0443t)) {
            return false;
        }
        short s2 = ((C0443t) obj).f5687a;
        short[] sArr = this.f5688a;
        int length = sArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (s2 == sArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.i.e(elements, "elements");
        if (elements.isEmpty()) {
            return true;
        }
        for (Object obj : elements) {
            if (obj instanceof C0443t) {
                short s2 = ((C0443t) obj).f5687a;
                short[] sArr = this.f5688a;
                int length = sArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        i2 = -1;
                        break;
                    }
                    if (s2 == sArr[i2]) {
                        break;
                    }
                    i2++;
                }
                if (i2 >= 0) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            return kotlin.jvm.internal.i.a(this.f5688a, ((u) obj).f5688a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f5688a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5688a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new N4.g(4, this.f5688a);
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
        return this.f5688a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return kotlin.jvm.internal.i.m(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f5688a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.i.e(array, "array");
        return kotlin.jvm.internal.i.n(this, array);
    }
}
