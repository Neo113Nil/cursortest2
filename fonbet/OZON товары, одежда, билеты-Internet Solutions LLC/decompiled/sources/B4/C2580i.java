package B4;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B4.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2580i {
    @NotNull
    public static final ArrayList a(@NotNull Map map, @NotNull Function1 isArgumentMissing) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(isArgumentMissing, "isArgumentMissing");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            C2578g c2578g = (C2578g) entry.getValue();
            Boolean valueOf = c2578g != null ? Boolean.valueOf(c2578g.c()) : null;
            Intrinsics.f(valueOf);
            if (!valueOf.booleanValue() && !c2578g.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : keySet) {
            if (((Boolean) isArgumentMissing.invoke((String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
