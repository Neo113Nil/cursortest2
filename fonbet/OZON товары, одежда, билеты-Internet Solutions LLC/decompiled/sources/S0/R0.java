package S0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C7714v;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class R0 {
    public static final void a(@NotNull LinkedHashMap linkedHashMap, C3964i0 c3964i0, C3968k0 c3968k0) {
        Object obj = linkedHashMap.get(c3964i0);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(c3964i0, obj);
        }
        ((List) obj).add(c3968k0);
    }

    public static final Object b(@NotNull LinkedHashMap linkedHashMap, C3964i0 c3964i0) {
        List list = (List) linkedHashMap.get(c3964i0);
        if (list == null) {
            return null;
        }
        Object u02 = C7714v.u0(list);
        if (list.isEmpty()) {
            linkedHashMap.remove(c3964i0);
        }
        return u02;
    }
}
