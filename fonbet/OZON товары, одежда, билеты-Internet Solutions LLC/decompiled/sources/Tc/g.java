package Tc;

import Tc.d;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractC7698e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g<V> extends AbstractC7698e<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<?, V> f27033a;

    public g(@NotNull d<?, V> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f27033a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(@NotNull Collection<? extends V> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f27033a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f27033a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC7698e
    public final int getSize() {
        return this.f27033a.getF27020i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f27033a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        d<?, V> map = this.f27033a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new d.f(map);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f27033a.L(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f27033a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f27033a.v();
        return super.retainAll(elements);
    }
}
