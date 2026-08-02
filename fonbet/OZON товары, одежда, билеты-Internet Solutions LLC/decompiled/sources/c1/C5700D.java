package c1;

import gd.InterfaceC6712a;
import java.util.Iterator;
import java.util.Map;

/* renamed from: c1.D, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5700D<K, V> extends AbstractC5701E<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC6712a {
    @Override // java.util.Iterator
    public final Object next() {
        c();
        if (e() != null) {
            return new C5699C(this);
        }
        throw new IllegalStateException();
    }
}
