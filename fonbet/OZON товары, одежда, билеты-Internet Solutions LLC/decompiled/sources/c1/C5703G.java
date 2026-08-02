package c1;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c1.G, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5703G<K, V> extends AbstractC5701E<K, V> implements Iterator<V>, InterfaceC6712a {
    @Override // java.util.Iterator
    public final V next() {
        Map.Entry<K, V> i11 = i();
        if (i11 == null) {
            throw new IllegalStateException();
        }
        c();
        return i11.getValue();
    }
}
