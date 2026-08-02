package WZ;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class y extends i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final y f33404a = new y();

    @Override // WZ.i
    @NotNull
    public final Map<YZ.a, List<s>> filterEvents(@NotNull Map<YZ.a, ? extends List<s>> events, @NotNull u tokenizedViewPool) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(tokenizedViewPool, "tokenizedViewPool");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<YZ.a, ? extends List<s>> entry : events.entrySet()) {
            if (kotlin.text.h.e0(entry.getKey().b(), "view", true)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (tokenizedViewPool.b((List) entry2.getValue())) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }
}
