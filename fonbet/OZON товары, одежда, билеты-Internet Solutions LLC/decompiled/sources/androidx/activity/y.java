package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.core.view.C5334o0;
import androidx.core.view.Q0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
class y extends w {
    @Override // androidx.activity.u
    public void b(@NotNull O statusBarStyle, @NotNull O navigationBarStyle, @NotNull Window window, @NotNull View view, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(view, "view");
        C5334o0.a(window, false);
        statusBarStyle.getClass();
        window.setStatusBarColor(0);
        navigationBarStyle.getClass();
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        Q0 q02 = new Q0(view, window);
        q02.e(!z11);
        q02.d(true ^ z12);
    }
}
