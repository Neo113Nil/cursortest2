package Tc;

import Tc.d;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class e<K, V> extends AbstractC4044a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<K, V> f27031a;

    public e(@NotNull d<K, V> backing) {
        Intrinsics.checkNotNullParameter(backing, "backing");
        this.f27031a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        Map.Entry element = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@NotNull Collection<? extends Map.Entry<K, V>> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // Tc.AbstractC4044a
    public final boolean b(@NotNull Map.Entry<? extends K, ? extends V> element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f27031a.B(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f27031a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return this.f27031a.A(elements);
    }

    @Override // Tc.AbstractC4044a
    public final boolean e(@NotNull Map.Entry element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f27031a.I(element);
    }

    @Override // kotlin.collections.AbstractC7701h
    public final int getSize() {
        return this.f27031a.getF27020i();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f27031a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        d<K, V> map = this.f27031a;
        map.getClass();
        Intrinsics.checkNotNullParameter(map, "map");
        return new d.b(map);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f27031a.v();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@NotNull Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.f27031a.v();
        return super.retainAll(elements);
    }
}
