package P1;

import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: P1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3816x extends AbstractC3809p implements List<InterfaceC3808o>, InterfaceC6712a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final List<InterfaceC3808o> f21598c;

    /* JADX WARN: Multi-variable type inference failed */
    public C3816x(@NotNull List<? extends InterfaceC3808o> list) {
        this.f21598c = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i11, InterfaceC3808o interfaceC3808o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i11, Collection<? extends InterfaceC3808o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof InterfaceC3808o)) {
            return false;
        }
        return this.f21598c.contains((InterfaceC3808o) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return this.f21598c.containsAll(collection);
    }

    @NotNull
    public final List<InterfaceC3808o> e() {
        return this.f21598c;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3816x) {
            return Intrinsics.d(this.f21598c, ((C3816x) obj).f21598c);
        }
        return false;
    }

    @Override // java.util.List
    public final InterfaceC3808o get(int i11) {
        return this.f21598c.get(i11);
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f21598c.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof InterfaceC3808o)) {
            return -1;
        }
        return this.f21598c.indexOf((InterfaceC3808o) obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f21598c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<InterfaceC3808o> iterator() {
        return this.f21598c.iterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof InterfaceC3808o)) {
            return -1;
        }
        return this.f21598c.lastIndexOf((InterfaceC3808o) obj);
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<InterfaceC3808o> listIterator() {
        return this.f21598c.listIterator();
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC3808o remove(int i11) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<InterfaceC3808o> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ InterfaceC3808o set(int i11, InterfaceC3808o interfaceC3808o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f21598c.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super InterfaceC3808o> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final List<InterfaceC3808o> subList(int i11, int i12) {
        return this.f21598c.subList(i11, i12);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @NotNull
    public final String toString() {
        return "FontListFontFamily(fonts=" + this.f21598c + ')';
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends InterfaceC3808o> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @NotNull
    public final ListIterator<InterfaceC3808o> listIterator(int i11) {
        return this.f21598c.listIterator(i11);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }
}
