package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/ui/graphics/layer/ViewLayerVerificationHelper31;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Landroidx/compose/ui/graphics/RenderEffect;", "p1", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/view/View;Landroidx/compose/ui/graphics/RenderEffect;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewLayerVerificationHelper31 {
    public static final androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper31 INSTANCE = new androidx.compose.ui.graphics.layer.ViewLayerVerificationHelper31();

    private ViewLayerVerificationHelper31() {
    }

    public static void getHighResolutionOutputSizeshNQ4ISI(android.view.View p0, androidx.compose.ui.graphics.RenderEffect p1) {
        p0.setRenderEffect(p1 != null ? p1.asAndroidRenderEffect() : null);
    }
}
