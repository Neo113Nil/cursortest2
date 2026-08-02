package X0;

import java.util.Iterator;
import kotlin.collections.AbstractC7702i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p<K, V> extends AbstractC7702i<K> implements V0.b<K> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d<K, V> f33935b;

    public p(@NotNull d<K, V> dVar) {
        this.f33935b = dVar;
    }

    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f33935b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f33935b.h();
    }

    @Override // kotlin.collections.AbstractC7702i, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<K> iterator() {
        t<K, V> n11 = this.f33935b.n();
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new w();
        }
        return new q(n11, uVarArr);
    }
}
