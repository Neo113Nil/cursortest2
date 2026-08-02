package Sc;

import ed.InterfaceC6346b;
import gd.InterfaceC6712a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes10.dex */
public final class B implements Collection<A>, InterfaceC6712a {
    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(A a11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends A> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        C7705l.k(null, ((A) obj).a());
        throw null;
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        Object next = it.next();
        if (!(next instanceof A)) {
            return false;
        }
        C7705l.k(null, ((A) next).a());
        throw null;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (!(obj instanceof B)) {
            return false;
        }
        ((B) obj).getClass();
        return Intrinsics.d(null, null);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode((int[]) null);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        throw null;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<A> iterator() {
        Intrinsics.checkNotNullParameter(null, "array");
        throw null;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString((int[]) null) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C7728j.b(this, array);
    }
}
