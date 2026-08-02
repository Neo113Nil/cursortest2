package X0;

import java.util.Iterator;
import kotlin.collections.AbstractC7701h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class j<K, V> extends AbstractC7701h<K> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f<K, V> f33932a;

    public j(@NotNull f<K, V> fVar) {
        this.f33932a = fVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k11) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f33932a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f33932a.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC7701h
    public final int getSize() {
        return this.f33932a.h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<K> iterator() {
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new w();
        }
        return new k(this.f33932a, uVarArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<K, V> fVar = this.f33932a;
        if (!fVar.containsKey(obj)) {
            return false;
        }
        fVar.remove(obj);
        return true;
    }
}
