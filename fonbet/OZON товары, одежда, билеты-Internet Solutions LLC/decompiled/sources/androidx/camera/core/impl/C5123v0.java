package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.T;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: androidx.camera.core.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5123v0 extends A0 implements InterfaceC5121u0 {

    /* renamed from: J, reason: collision with root package name */
    @NonNull
    private static final T.b f38396J = T.b.OPTIONAL;

    @NonNull
    public static C5123v0 R() {
        return new C5123v0(new TreeMap(A0.f38107H));
    }

    @NonNull
    public static C5123v0 S(@NonNull T t2) {
        TreeMap treeMap = new TreeMap(A0.f38107H);
        for (T.a<?> aVar : t2.g()) {
            Set<T.b> b11 = t2.b(aVar);
            ArrayMap arrayMap = new ArrayMap();
            for (T.b bVar : b11) {
                arrayMap.put(bVar, t2.f(aVar, bVar));
            }
            treeMap.put(aVar, arrayMap);
        }
        return new C5123v0(treeMap);
    }

    public final <ValueT> void T(@NonNull T.a<ValueT> aVar, @NonNull T.b bVar, ValueT valuet) {
        T.b bVar2;
        TreeMap<T.a<?>, Map<T.b, Object>> treeMap = this.f38109G;
        Map<T.b, Object> map = treeMap.get(aVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(aVar, arrayMap);
            arrayMap.put(bVar, valuet);
            return;
        }
        T.b bVar3 = (T.b) Collections.min(map.keySet());
        if (Objects.equals(map.get(bVar3), valuet) || bVar3 != (bVar2 = T.b.REQUIRED) || bVar != bVar2) {
            map.put(bVar, valuet);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + aVar.c() + ", existing value (" + bVar3 + ")=" + map.get(bVar3) + ", conflicting (" + bVar + ")=" + valuet);
    }

    public final <ValueT> void U(@NonNull T.a<ValueT> aVar, ValueT valuet) {
        T(aVar, f38396J, valuet);
    }

    public final void V(@NonNull T.a aVar) {
        this.f38109G.remove(aVar);
    }
}
