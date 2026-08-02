package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/LayoutInfo;", "Landroid/view/View;", "getView", "(Landroidx/compose/ui/layout/LayoutInfo;)Landroid/view/View;", "view"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutInfo_androidKt {
    public static final android.view.View getView(androidx.compose.ui.layout.LayoutInfo layoutInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNull(layoutInfo, "");
        java.lang.Object owner = ((androidx.compose.ui.node.LayoutNode) layoutInfo).getOwner();
        if (owner instanceof android.view.View) {
            return (android.view.View) owner;
        }
        return null;
    }
}
