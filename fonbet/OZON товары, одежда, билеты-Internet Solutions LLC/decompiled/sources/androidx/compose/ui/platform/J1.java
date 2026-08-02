package androidx.compose.ui.platform;

import android.view.RenderNode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class J1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final J1 f40667a = new J1();

    public final int a(@NotNull RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public final int b(@NotNull RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public final void c(@NotNull RenderNode renderNode, int i11) {
        renderNode.setAmbientShadowColor(i11);
    }

    public final void d(@NotNull RenderNode renderNode, int i11) {
        renderNode.setSpotShadowColor(i11);
    }
}
