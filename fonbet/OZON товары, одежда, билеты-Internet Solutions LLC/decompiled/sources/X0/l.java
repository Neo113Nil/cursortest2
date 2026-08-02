package X0;

import java.util.Iterator;
import kotlin.collections.AbstractC7698e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class l<K, V> extends AbstractC7698e<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<K, V> f33933a;

    public l(@NotNull f<K, V> fVar) {
        this.f33933a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f33933a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f33933a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC7698e
    public final int getSize() {
        return this.f33933a.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new y();
        }
        return new m(this.f33933a, uVarArr);
    }
}
