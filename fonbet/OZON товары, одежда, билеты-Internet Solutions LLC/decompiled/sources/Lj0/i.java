package Lj0;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.logging.business.LogSource;
import ru.ozon.tracker.sendEvent.Namespace;

/* loaded from: classes3.dex */
public final class i {
    public static final void a(@NotNull e context_receiver_0, @NotNull Tc.d dVar, Long l11) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (l11 != null) {
            dVar.put("batch_size", l11);
        }
    }

    public static final void b(@NotNull e context_receiver_0, @NotNull Tc.d dVar, String str) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        if (str == null) {
            str = "";
        }
        dVar.put("error_text", str);
    }

    public static final void c(@NotNull e context_receiver_0, @NotNull Tc.d dVar, @NotNull LogSource logSource) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(logSource, "logSource");
        dVar.put("log_source", logSource.getSourceName());
    }

    public static final void d(@NotNull e context_receiver_0, @NotNull Tc.d dVar, @NotNull Namespace namespace) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(namespace, "namespace");
        String lowerCase = namespace.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        dVar.put("namespace", lowerCase);
    }
}
