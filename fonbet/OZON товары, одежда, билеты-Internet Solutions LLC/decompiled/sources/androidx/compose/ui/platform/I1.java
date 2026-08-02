package androidx.compose.ui.platform;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class I1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final I1 f40664a = new I1();

    public final void a(@NotNull RenderNode renderNode) {
        renderNode.discardDisplayList();
    }
}
