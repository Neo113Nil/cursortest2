package X0;

import java.util.Map;

/* loaded from: classes8.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    public final Object next() {
        o(h() + 2);
        return new b(e()[h() - 2], e()[h() - 1]);
    }
}
