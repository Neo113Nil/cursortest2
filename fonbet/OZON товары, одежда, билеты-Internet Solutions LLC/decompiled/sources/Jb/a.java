package Jb;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class a<K, V, V2> implements e<Map<K, V2>> {

    /* renamed from: a, reason: collision with root package name */
    private final Map<K, Pc.a<V>> f14330a;

    /* renamed from: Jb.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0270a<K, V, V2> {

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashMap<K, Pc.a<V>> f14331a;

        AbstractC0270a(int i11) {
            this.f14331a = b.f(i11);
        }
    }

    a(LinkedHashMap linkedHashMap) {
        this.f14330a = Collections.unmodifiableMap(linkedHashMap);
    }

    final Map<K, Pc.a<V>> a() {
        return this.f14330a;
    }

    @Override // Pc.a
    public Object get() {
        return a();
    }
}
