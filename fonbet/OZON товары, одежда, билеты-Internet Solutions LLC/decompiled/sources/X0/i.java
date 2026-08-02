package X0;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class i<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC6712a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final g<K, V, Map.Entry<K, V>> f33931a;

    public i(@NotNull f<K, V> fVar) {
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new x(this);
        }
        this.f33931a = new g<>(fVar, uVarArr);
    }

    public final void b(K k11, V v11) {
        this.f33931a.l(k11, v11);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33931a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f33931a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f33931a.remove();
    }
}
