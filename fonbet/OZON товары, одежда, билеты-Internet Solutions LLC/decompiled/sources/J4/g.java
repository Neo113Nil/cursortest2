package J4;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import xe.C10747s0;
import xe.I;

/* loaded from: classes.dex */
public final class g {
    @NotNull
    public static final I a(@NotNull s sVar) {
        Map<String, Object> backingFieldMap = sVar.getBackingFieldMap();
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            obj = C10747s0.b(sVar.getQueryExecutor());
            backingFieldMap.put("QueryDispatcher", obj);
        }
        return (I) obj;
    }
}
