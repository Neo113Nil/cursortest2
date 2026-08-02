package androidx.compose.ui.platform;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForInspector;", "", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "subCompositionView", "Landroid/view/View;", "getViewRoot", "()Landroid/view/View;", "viewRoot"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewRootForInspector {
    default androidx.compose.ui.platform.AbstractComposeView getSubCompositionView() {
        return null;
    }

    default android.view.View getViewRoot() {
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static androidx.compose.ui.platform.AbstractComposeView getSubCompositionView(androidx.compose.ui.platform.ViewRootForInspector viewRootForInspector) {
            return androidx.compose.ui.platform.ViewRootForInspector.super.getSubCompositionView();
        }

        @java.lang.Deprecated
        public static android.view.View getViewRoot(androidx.compose.ui.platform.ViewRootForInspector viewRootForInspector) {
            return androidx.compose.ui.platform.ViewRootForInspector.super.getViewRoot();
        }
    }
}
