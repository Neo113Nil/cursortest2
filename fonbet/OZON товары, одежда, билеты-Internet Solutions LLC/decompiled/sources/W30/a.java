package W30;

import O30.b;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {
    @NotNull
    public static final SharedPreferences a(@NotNull Context context, @NotNull b type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        SharedPreferences sharedPreferences = context.getSharedPreferences(b(context, type), 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }

    @NotNull
    public static final String b(@NotNull Context context, @NotNull b type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(type, "type");
        return context.getPackageName() + "_preferences_" + type;
    }
}
