package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "layoutId", "(Landroidx/compose/ui/Modifier;Ljava/lang/Object;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/layout/Measurable;", "getLayoutId", "(Landroidx/compose/ui/layout/Measurable;)Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutIdKt {
    public static final androidx.compose.ui.Modifier layoutId(androidx.compose.ui.Modifier modifier, java.lang.Object obj) {
        return modifier.then(new androidx.compose.ui.layout.LayoutIdElement(obj));
    }

    public static final java.lang.Object getLayoutId(androidx.compose.ui.layout.Measurable measurable) {
        java.lang.Object parentData = measurable.getParentData();
        androidx.compose.ui.layout.LayoutIdParentData layoutIdParentData = parentData instanceof androidx.compose.ui.layout.LayoutIdParentData ? (androidx.compose.ui.layout.LayoutIdParentData) parentData : null;
        if (layoutIdParentData != null) {
            return layoutIdParentData.getLayoutId();
        }
        return null;
    }
}
