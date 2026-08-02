package WZ;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Long, RZ.c> f33361a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Long, RZ.b> f33362b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ConcurrentHashMap<Long, Map<String, String>> f33363c = new ConcurrentHashMap<>();

    public final void a(@NotNull Map<Long, RZ.b> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f33362b.putAll(state);
    }

    public final void b(@NotNull Map<Long, ? extends Map<String, String>> aliases) {
        Intrinsics.checkNotNullParameter(aliases, "aliases");
        this.f33363c.putAll(aliases);
    }

    public final void c(@NotNull Map<Long, RZ.c> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f33361a.putAll(state);
    }

    public final RZ.c d(Long l11) {
        if (l11 == null) {
            return null;
        }
        return this.f33361a.get(l11);
    }

    public final RZ.b e(Long l11) {
        if (l11 == null) {
            return null;
        }
        return this.f33362b.get(l11);
    }

    public final String f(Long l11, String str) {
        Map<String, String> map;
        if (l11 == null || str == null || (map = this.f33363c.get(l11)) == null) {
            return null;
        }
        return map.get(str);
    }

    public final void g() {
        this.f33361a.clear();
        this.f33362b.clear();
        this.f33363c.clear();
    }
}
