package Ig0;

import android.content.Context;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {
    public static final Display a(@NotNull Context context) {
        Display display;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            display = context.getDisplay();
            return display;
        }
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static final long b(@NotNull Display display) {
        Intrinsics.checkNotNullParameter(display, "<this>");
        return (long) (1.0E9d / display.getRefreshRate());
    }
}
