package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/platform/WrapperRenderNodeLayerHelperMethods;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "", "onDescendantInvalidated", "(Landroidx/compose/ui/platform/AndroidComposeView;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WrapperRenderNodeLayerHelperMethods {
    public static final int $stable = 0;
    public static final androidx.compose.ui.platform.WrapperRenderNodeLayerHelperMethods INSTANCE = new androidx.compose.ui.platform.WrapperRenderNodeLayerHelperMethods();

    private WrapperRenderNodeLayerHelperMethods() {
    }

    public final void onDescendantInvalidated(androidx.compose.ui.platform.AndroidComposeView ownerView) {
        android.view.ViewParent parent = ownerView.getParent();
        if (parent != null) {
            androidx.compose.ui.platform.AndroidComposeView androidComposeView = ownerView;
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
