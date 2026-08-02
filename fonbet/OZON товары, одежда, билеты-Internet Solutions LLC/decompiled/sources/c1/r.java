package c1;

import gd.InterfaceC6716e;
import java.util.Set;
import kotlin.jvm.internal.C7728j;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
abstract class r<K, V, E> implements Set<E>, InterfaceC6716e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final w<K, V> f56269a;

    public r(@NotNull w<K, V> wVar) {
        this.f56269a = wVar;
    }

    @NotNull
    public final w<K, V> b() {
        return this.f56269a;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f56269a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f56269a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f56269a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C7728j.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C7728j.b(this, tArr);
    }
}
