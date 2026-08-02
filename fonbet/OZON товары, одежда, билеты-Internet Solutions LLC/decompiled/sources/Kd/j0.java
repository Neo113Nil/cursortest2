package Kd;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f15914a;

    public j0(@NotNull LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f15914a = map;
    }

    @NotNull
    public final j0 a() {
        LinkedHashMap linkedHashMap = this.f15914a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.U.h(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), C3511h.b((C3511h) entry.getValue()));
        }
        return new j0(linkedHashMap2);
    }

    @NotNull
    public final Map<Integer, C3511h> b() {
        return this.f15914a;
    }
}
