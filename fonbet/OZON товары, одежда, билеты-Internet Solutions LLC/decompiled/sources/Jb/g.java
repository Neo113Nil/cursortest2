package Jb;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes9.dex */
public final class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f14338a = b.f(2);

    private g() {
    }

    public static g b() {
        return new g();
    }

    public final Map<K, V> a() {
        LinkedHashMap linkedHashMap = this.f14338a;
        return linkedHashMap.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(linkedHashMap);
    }

    public final void c(Class cls, e eVar) {
        this.f14338a.put(cls, eVar);
    }
}
