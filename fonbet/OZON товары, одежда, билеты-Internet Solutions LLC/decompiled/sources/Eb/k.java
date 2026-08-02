package Eb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class k {
    static {
        new Regex("(?<=[a-zA-Z])[A-Z]");
    }

    @NotNull
    public static final String a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() <= 8) {
            return "****";
        }
        return "****" + kotlin.text.h.r0(4, str);
    }
}
