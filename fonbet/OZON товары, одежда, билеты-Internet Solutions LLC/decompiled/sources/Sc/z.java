package Sc;

import ed.InterfaceC6346b;
import gd.InterfaceC6712a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes10.dex */
public final class z implements Collection<y>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final byte[] f26120a;

    private static final class a implements Iterator<y>, InterfaceC6712a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final byte[] f26121a;

        /* renamed from: b, reason: collision with root package name */
        private int f26122b;

        public a(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f26121a = array;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f26122b < this.f26121a.length;
        }

        @Override // java.util.Iterator
        public final y next() {
            int i11 = this.f26122b;
            byte[] bArr = this.f26121a;
            if (i11 >= bArr.length) {
                throw new NoSuchElementException(String.valueOf(this.f26122b));
            }
            this.f26122b = i11 + 1;
            return y.a(bArr[i11]);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private /* synthetic */ z(byte[] bArr) {
        this.f26120a = bArr;
    }

    public static final /* synthetic */ z b(byte[] bArr) {
        return new z(bArr);
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(y yVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends y> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* synthetic */ byte[] c() {
        return this.f26120a;
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof y)) {
            return false;
        }
        return C7705l.i(this.f26120a, ((y) obj).getF26119a());
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Collection<? extends Object> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (obj instanceof y) {
                if (C7705l.i(this.f26120a, ((y) obj).getF26119a())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return Intrinsics.d(this.f26120a, ((z) obj).f26120a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f26120a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f26120a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<y> iterator() {
        return new a(this.f26120a);
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
        return this.f26120a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    public final String toString() {
        return "UByteArray(storage=" + Arrays.toString(this.f26120a) + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) C7728j.b(this, array);
    }
}
