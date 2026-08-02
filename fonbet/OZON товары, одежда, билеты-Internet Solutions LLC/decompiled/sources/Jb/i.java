package Jb;

import Jb.a;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class i<K, V> extends Jb.a<K, V, Pc.a<V>> implements Ib.a<Map<K, Pc.a<V>>> {

    public static final class a<K, V> extends a.AbstractC0270a<K, V, Pc.a<V>> {
        public final i<K, V> a() {
            return new i<>(this.f14331a);
        }

        public final void b(Class cls, Pc.a aVar) {
            LinkedHashMap<K, Pc.a<V>> linkedHashMap = this.f14331a;
            j.b(aVar, "provider");
            linkedHashMap.put(cls, aVar);
        }
    }

    public static <K, V> a<K, V> b(int i11) {
        return new a<>(i11);
    }
}
