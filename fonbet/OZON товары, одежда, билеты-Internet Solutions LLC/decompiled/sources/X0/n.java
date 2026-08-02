package X0;

import java.util.Iterator;
import java.util.Map;
import kotlin.collections.AbstractC7702i;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n<K, V> extends AbstractC7702i<Map.Entry<? extends K, ? extends V>> implements V0.b<Map.Entry<? extends K, ? extends V>> {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final d<K, V> f33934b;

    public n(@NotNull d<K, V> dVar) {
        this.f33934b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.AbstractC7694a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        Map.Entry entry;
        if ((obj instanceof Map.Entry) && (entry = (Map.Entry) obj) != null) {
            Object key = entry.getKey();
            d<K, V> dVar = this.f33934b;
            Object obj2 = dVar.get(key);
            if (obj2 != null) {
                return obj2.equals(entry.getValue());
            }
            if (entry.getValue() == null && dVar.containsKey(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.collections.AbstractC7694a
    public final int getSize() {
        return this.f33934b.h();
    }

    @Override // kotlin.collections.AbstractC7702i, java.util.Collection, java.lang.Iterable, java.util.Set
    @NotNull
    public final Iterator<Map.Entry<K, V>> iterator() {
        t<K, V> n11 = this.f33934b.n();
        u[] uVarArr = new u[8];
        for (int i11 = 0; i11 < 8; i11++) {
            uVarArr[i11] = new v();
        }
        return new o(n11, uVarArr);
    }
}
