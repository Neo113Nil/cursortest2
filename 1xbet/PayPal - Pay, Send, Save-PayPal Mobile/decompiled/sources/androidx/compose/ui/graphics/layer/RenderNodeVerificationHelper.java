package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/layer/RenderNodeVerificationHelper;", "", "<init>", "()V", "Landroid/graphics/RenderNode;", "renderNode", "Landroidx/compose/ui/graphics/RenderEffect;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "", "setRenderEffect", "(Landroid/graphics/RenderNode;Landroidx/compose/ui/graphics/RenderEffect;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RenderNodeVerificationHelper {
    public static final int $stable = 0;
    public static final androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper INSTANCE = new androidx.compose.ui.graphics.layer.RenderNodeVerificationHelper();

    private RenderNodeVerificationHelper() {
    }

    public final void setRenderEffect(android.graphics.RenderNode renderNode, androidx.compose.ui.graphics.RenderEffect target) {
        renderNode.setRenderEffect(target != null ? target.asAndroidRenderEffect() : null);
    }
}
