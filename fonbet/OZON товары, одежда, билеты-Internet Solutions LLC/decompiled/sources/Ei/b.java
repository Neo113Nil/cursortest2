package Ei;

import android.os.Build;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {
    public static final <T> T a(@NotNull Bundle bundle, String str, @NotNull Class<T> clazz) {
        Object parcelable;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(str);
        }
        parcelable = bundle.getParcelable(str, clazz);
        return (T) parcelable;
    }
}
