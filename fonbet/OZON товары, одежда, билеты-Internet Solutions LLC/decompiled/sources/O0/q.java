package O0;

import java.util.LinkedHashMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f19797a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f19798b = new LinkedHashMap();

    public final p a(@NotNull r rVar) {
        return (p) this.f19798b.get(rVar);
    }

    public final r b(@NotNull p pVar) {
        return (r) this.f19797a.get(pVar);
    }

    public final void c(@NotNull p pVar) {
        LinkedHashMap linkedHashMap = this.f19797a;
        r rVar = (r) linkedHashMap.get(pVar);
        if (rVar != null) {
        }
        linkedHashMap.remove(pVar);
    }

    public final void d(@NotNull p pVar, @NotNull r rVar) {
        this.f19797a.put(pVar, rVar);
        this.f19798b.put(rVar, pVar);
    }
}
