package androidx.compose.ui.platform;

import android.view.View;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final T f40737a = new T();

    public final void a(@NotNull View view, int i11, boolean z11) {
        view.setFocusable(i11);
        view.setDefaultFocusHighlightEnabled(z11);
    }
}
