package H30;

import com.squareup.moshi.Moshi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class q {
    public static final <T> T a(@NotNull Moshi moshi, @NotNull String jsonString, @NotNull Class<T> type) {
        Intrinsics.checkNotNullParameter(moshi, "<this>");
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        Intrinsics.checkNotNullParameter(type, "type");
        try {
            return moshi.c(type).fromJson(jsonString);
        } catch (Throwable th2) {
            L80.a.c("Moshi", null, th2);
            return null;
        }
    }
}
