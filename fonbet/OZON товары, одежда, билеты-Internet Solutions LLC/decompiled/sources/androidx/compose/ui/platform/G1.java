package androidx.compose.ui.platform;

import android.graphics.RenderNode;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class G1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final G1 f40646a = new G1();

    public final void a(@NotNull RenderNode renderNode, l1.z0 z0Var) {
        renderNode.setRenderEffect(z0Var != null ? z0Var.a() : null);
    }
}
