package Jb;

import Jb.a;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class h<K, V> extends Jb.a<K, V, V> {

    public static final class a<K, V> extends a.AbstractC0270a<K, V, V> {
        public final h<K, V> a() {
            return new h<>(this.f14331a);
        }

        public final void b(Class cls, Pc.a aVar) {
            LinkedHashMap<K, Pc.a<V>> linkedHashMap = this.f14331a;
            j.b(aVar, "provider");
            linkedHashMap.put(cls, aVar);
        }
    }

    static {
        f.a(Collections.EMPTY_MAP);
    }

    public static <K, V> a<K, V> b(int i11) {
        return new a<>(i11);
    }

    @Override // Jb.a, Pc.a
    public final Object get() {
        LinkedHashMap f7 = b.f(a().size());
        for (Map.Entry<K, Pc.a<V>> entry : a().entrySet()) {
            f7.put(entry.getKey(), entry.getValue().get());
        }
        return Collections.unmodifiableMap(f7);
    }
}
