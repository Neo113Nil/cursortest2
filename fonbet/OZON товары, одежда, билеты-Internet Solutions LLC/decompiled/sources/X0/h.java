package X0;

import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<K, V> f33930a;

    public h(@NotNull f<K, V> fVar) {
        this.f33930a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // X0.a
    public final boolean b(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        K key = entry.getKey();
        f<K, V> fVar = this.f33930a;
        V v11 = fVar.get(key);
        return v11 != null ? v11.equals(entry.getValue()) : entry.getValue() == null && fVar.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33930a.clear();
    }

    @Override // X0.a
    public final boolean e(@NotNull Map.Entry<? extends K, ? extends V> entry) {
        return this.f33930a.remove(entry.getKey(), entry.getValue());
    }

    @Override // kotlin.collections.AbstractC7701h
    public final int getSize() {
        return this.f33930a.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f33930a);
    }
}
