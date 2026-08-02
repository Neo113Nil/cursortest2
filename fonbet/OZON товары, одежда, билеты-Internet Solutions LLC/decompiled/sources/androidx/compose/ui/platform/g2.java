package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class g2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g2 f40878a = new g2();

    public final void a(@NotNull View view, l1.z0 z0Var) {
        view.setRenderEffect(z0Var != null ? z0Var.a() : null);
    }
}
