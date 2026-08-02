package H30;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class u {
    public static final void a(@NotNull Window window, boolean z11) {
        Intrinsics.checkNotNullParameter(window, "<this>");
        window.clearFlags(201326592);
        if (!z11) {
            if (Build.VERSION.SDK_INT >= 31) {
                window.setStatusBarColor(androidx.core.content.a.getColor(window.getContext(), R.color.transparent));
                window.setNavigationBarColor(androidx.core.content.a.getColor(window.getContext(), R.color.nav_hack));
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            window.setStatusBarColor(androidx.core.content.a.getColor(window.getContext(), R.color.transparent));
            window.setNavigationBarColor(androidx.core.content.a.getColor(window.getContext(), R.color.transparent));
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static final void b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().setBackgroundDrawableResource(R.color.oz_semantic_bg_secondary);
        if (Build.VERSION.SDK_INT < 31) {
            int color = androidx.core.content.a.getColor(activity, R.color.oz_semantic_bg_secondary);
            activity.getWindow().setNavigationBarColor(color);
            activity.getWindow().setStatusBarColor(color);
        }
    }

    public static final void c(Activity activity) {
        Window window;
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        d(window);
    }

    public static final void d(Window window) {
        Resources resources;
        Configuration configuration;
        Context context = window.getContext();
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return;
        }
        int i11 = configuration.uiMode & 48;
        if (i11 == 16) {
            f(window);
        } else {
            if (i11 != 32) {
                return;
            }
            e(window);
        }
    }

    public static final void e(Window window) {
        View decorView;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        if (Build.VERSION.SDK_INT < 31) {
            View decorView2 = window.getDecorView();
            if ((decorView2 != null ? Integer.valueOf(decorView2.getSystemUiVisibility()) : null) == null || (decorView = window.getDecorView()) == null) {
                return;
            }
            decorView.setSystemUiVisibility(0);
            return;
        }
        insetsController = window.getInsetsController();
        if (insetsController != null) {
            insetsController.setSystemBarsAppearance(0, 8);
        }
        insetsController2 = window.getInsetsController();
        if (insetsController2 != null) {
            insetsController2.setSystemBarsAppearance(0, 16);
        }
    }

    public static final void f(Window window) {
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        if (Build.VERSION.SDK_INT >= 31) {
            insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(8, 8);
            }
            insetsController2 = window.getInsetsController();
            if (insetsController2 != null) {
                insetsController2.setSystemBarsAppearance(16, 16);
                return;
            }
            return;
        }
        View decorView = window.getDecorView();
        Integer valueOf = decorView != null ? Integer.valueOf(decorView.getSystemUiVisibility()) : null;
        if (valueOf != null) {
            int intValue = valueOf.intValue() | 8208;
            View decorView2 = window.getDecorView();
            if (decorView2 != null) {
                decorView2.setSystemUiVisibility(intValue);
            }
        }
    }

    public static final void g(@NotNull androidx.fragment.app.r rVar, Integer num) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (num == null) {
            return;
        }
        rVar.getWindow().setBackgroundDrawableResource(num.intValue());
        if (Build.VERSION.SDK_INT < 31) {
            int color = androidx.core.content.a.getColor(rVar, num.intValue());
            rVar.getWindow().setNavigationBarColor(color);
            rVar.getWindow().setStatusBarColor(color);
        }
    }
}
