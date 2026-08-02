package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class M implements ViewTranslationCallback {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final M f40721a = new M();

    public final boolean onClearTranslation(@NotNull View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getF40551o().g();
        return true;
    }

    public final boolean onHideTranslation(@NotNull View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getF40551o().i();
        return true;
    }

    public final boolean onShowTranslation(@NotNull View view) {
        Intrinsics.g(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getF40551o().l();
        return true;
    }
}
