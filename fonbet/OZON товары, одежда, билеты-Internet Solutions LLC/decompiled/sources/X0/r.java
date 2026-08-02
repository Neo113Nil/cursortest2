package X0;

import java.util.Iterator;
import kotlin.collections.AbstractC7694a;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class r<K, V> extends AbstractC7694a<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d<K, V> f33936a;

    public r(@NotNull d<K, V> dVar) {
        this.f33936a = dVar;
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f33936a.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f33936a.h();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @NotNull
    public final Iterator<V> iterator() {
        t<K, V> n11 = this.f33936a.n();
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new y();
        }
        return new s(n11, uVarArr);
    }
}
