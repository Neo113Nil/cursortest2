package Kd0;

import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class j {
    @NotNull
    public static final h a(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return new h(intent);
    }

    @NotNull
    public static final i b(@NotNull Uri deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new i(deeplink);
    }
}
