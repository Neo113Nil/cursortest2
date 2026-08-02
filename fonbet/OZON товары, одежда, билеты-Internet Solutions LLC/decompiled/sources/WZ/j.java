package WZ;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class j extends i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final j f33360a = new j();

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
        return linkedHashMap;
    }
}
