package androidx.camera.core.impl;

import B.j;
import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes8.dex */
public class A0 implements T {

    /* renamed from: H, reason: collision with root package name */
    protected static final C5131z0 f38107H;

    /* renamed from: I, reason: collision with root package name */
    private static final A0 f38108I;

    /* renamed from: G, reason: collision with root package name */
    protected final TreeMap<T.a<?>, Map<T.b, Object>> f38109G;

    static {
        C5131z0 c5131z0 = new C5131z0();
        f38107H = c5131z0;
        f38108I = new A0(new TreeMap(c5131z0));
    }

    A0(TreeMap<T.a<?>, Map<T.b, Object>> treeMap) {
        this.f38109G = treeMap;
    }

    @NonNull
    public static A0 P() {
        return f38108I;
    }

    @NonNull
    public static A0 Q(@NonNull T t2) {
        if (A0.class.equals(t2.getClass())) {
            return (A0) t2;
        }
        TreeMap treeMap = new TreeMap(f38107H);
        for (T.a<?> aVar : t2.g()) {
            Set<T.b> b11 = t2.b(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (T.b bVar : b11) {
                arrayMap.put(bVar, t2.f(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new A0(treeMap);
    }

    @Override // androidx.camera.core.impl.T
    public final <ValueT> ValueT a(@NonNull T.a<ValueT> aVar) {
        Map<T.b, Object> map = this.f38109G.get(aVar);
        if (map != null) {
            return (ValueT) map.get((T.b) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    public final Set<T.b> b(@NonNull T.a<?> aVar) {
        Map<T.b, Object> map = this.f38109G.get(aVar);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.T
    public final <ValueT> ValueT c(@NonNull T.a<ValueT> aVar, ValueT valuet) {
        try {
            return (ValueT) a(aVar);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.T
    public final boolean d(@NonNull T.a<?> aVar) {
        return this.f38109G.containsKey(aVar);
    }

    @Override // androidx.camera.core.impl.T
    public final void e(@NonNull B.i iVar) {
        for (Map.Entry<T.a<?>, Map<T.b, Object>> entry : this.f38109G.tailMap(T.a.a(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().c().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            j.a.c(iVar.f1319a, iVar.f1320b, entry.getKey());
        }
    }

    @Override // androidx.camera.core.impl.T
    public final <ValueT> ValueT f(@NonNull T.a<ValueT> aVar, @NonNull T.b bVar) {
        Map<T.b, Object> map = this.f38109G.get(aVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + aVar);
        }
        if (map.containsKey(bVar)) {
            return (ValueT) map.get(bVar);
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar + " with priority=" + bVar);
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    public final Set<T.a<?>> g() {
        return Collections.unmodifiableSet(this.f38109G.keySet());
    }

    @Override // androidx.camera.core.impl.T
    @NonNull
    public final T.b h(@NonNull T.a<?> aVar) {
        Map<T.b, Object> map = this.f38109G.get(aVar);
        if (map != null) {
            return (T.b) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + aVar);
    }
}
