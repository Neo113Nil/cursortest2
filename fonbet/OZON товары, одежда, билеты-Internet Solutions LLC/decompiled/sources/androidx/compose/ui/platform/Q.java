package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Q f40729a = new Q();

    public final void a(@NotNull View view) {
        view.clearViewTranslationCallback();
    }

    public final void b(@NotNull View view) {
        M m11 = M.f40721a;
        M m12 = M.f40721a;
        view.setViewTranslationCallback(M.f40721a);
    }
}
