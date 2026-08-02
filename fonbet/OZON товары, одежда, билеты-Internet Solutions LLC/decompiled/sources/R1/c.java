package R1;

import gd.InterfaceC6712a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.collections.K;
import kotlin.jvm.internal.C7728j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class c implements Collection<b>, InterfaceC6712a {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final c f24233c = new c(K.f71697a);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f24234d = 0;

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<b> f24235a;

    /* renamed from: b, reason: collision with root package name */
    private final int f24236b;

    public static final class a {
    }

    public c(@NotNull List<b> list) {
        this.f24235a = list;
        this.f24236b = list.size();
    }

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(b bVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final b c() {
        return this.f24235a.get(0);
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f24235a.contains((b) obj);
    }

    @Override // java.util.Collection
    public final boolean containsAll(@NotNull Collection<? extends Object> collection) {
        return this.f24235a.containsAll(collection);
    }

    @NotNull
    public final List<b> e() {
        return this.f24235a;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return Intrinsics.d(this.f24235a, ((c) obj).f24235a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return this.f24235a.hashCode();
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f24235a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<b> iterator() {
        return this.f24235a.iterator();
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
    public final boolean removeIf(Predicate<? super b> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f24236b;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @NotNull
    public final String toString() {
        return "LocaleList(localeList=" + this.f24235a + ')';
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }
}
