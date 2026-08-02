package androidx.compose.foundation.layout;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/FlowRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FlowRowScope extends androidx.compose.foundation.layout.RowScope {
    androidx.compose.ui.Modifier fillMaxRowHeight(androidx.compose.ui.Modifier modifier, float f);

    static /* synthetic */ androidx.compose.ui.Modifier fillMaxRowHeight$default(androidx.compose.foundation.layout.FlowRowScope flowRowScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return flowRowScope.fillMaxRowHeight(modifier, f);
    }
}
