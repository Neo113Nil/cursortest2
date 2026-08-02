package WZ;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d extends i {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC7737t f33356a;

    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1) {
        this.f33356a = (AbstractC7737t) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // WZ.i
    @NotNull
    public final Map<YZ.a, List<s>> filterEvents(@NotNull Map<YZ.a, ? extends List<s>> events, @NotNull u tokenizedViewPool) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(tokenizedViewPool, "tokenizedViewPool");
        ?? r52 = this.f33356a;
        if (r52 == 0) {
            return events;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : events.entrySet()) {
            if (((Boolean) r52.invoke(entry.getKey())).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }
}
