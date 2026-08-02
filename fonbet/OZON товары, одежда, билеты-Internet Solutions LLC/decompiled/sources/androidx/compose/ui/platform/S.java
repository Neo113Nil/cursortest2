package androidx.compose.ui.platform;

import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import x1.C10626a;
import x1.C10627b;

/* loaded from: classes8.dex */
final class S {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S f40735a = new S();

    public final void a(@NotNull View view, x1.t tVar) {
        PointerIcon systemIcon;
        if (tVar instanceof C10626a) {
            ((C10626a) tVar).getClass();
            systemIcon = null;
        } else {
            systemIcon = tVar instanceof C10627b ? PointerIcon.getSystemIcon(view.getContext(), ((C10627b) tVar).a()) : PointerIcon.getSystemIcon(view.getContext(), 1000);
        }
        if (Intrinsics.d(view.getPointerIcon(), systemIcon)) {
            return;
        }
        view.setPointerIcon(systemIcon);
    }
}
