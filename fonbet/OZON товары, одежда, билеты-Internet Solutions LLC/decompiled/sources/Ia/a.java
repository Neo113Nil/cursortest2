package Ia;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    @NotNull
    public static final String a(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return C7714v.V(list, null, null, null, null, 63);
    }

    public static final Object b(@NotNull String key, @NotNull Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = map.get(key);
        if (obj != null) {
            return obj;
        }
        String lowerCase = key.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return map.get(lowerCase);
    }
}
