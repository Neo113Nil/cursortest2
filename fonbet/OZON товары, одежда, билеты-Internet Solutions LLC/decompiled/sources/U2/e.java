package U2;

import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f27287a;

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f27288b;

    public e(@NotNull SharedPreferences prefs, LinkedHashSet linkedHashSet) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.f27287a = prefs;
        this.f27288b = linkedHashSet;
    }

    @NotNull
    public final LinkedHashMap a() {
        Map<String, ?> all = this.f27287a.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "prefs.all");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            LinkedHashSet linkedHashSet = this.f27288b;
            if (linkedHashSet != null ? linkedHashSet.contains(key) : true) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(U.h(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key2 = entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Set) {
                value = C7714v.Y0((Iterable) value);
            }
            linkedHashMap2.put(key2, value);
        }
        return linkedHashMap2;
    }
}
