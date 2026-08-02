package Wh0;

import android.app.Service;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class e {
    @NotNull
    public static final String a(@NotNull Service service) {
        Intrinsics.checkNotNullParameter(service, "<this>");
        String name = service.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }
}
