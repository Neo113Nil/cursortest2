package androidx.compose.foundation.layout;

@androidx.compose.foundation.layout.LayoutScopeMarker
@kotlin.Deprecated(message = "ContextualFlowLayouts are no longer maintained")
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/ContextualFlowRowScope;", "Landroidx/compose/foundation/layout/RowScope;", "Landroidx/compose/ui/Modifier;", "", "fraction", "fillMaxRowHeight", "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;", "", "getLineIndex", "()I", "lineIndex", "getIndexInLine", "indexInLine", "Landroidx/compose/ui/unit/Dp;", "getMaxWidthInLine-D9Ej5fM", "()F", "maxWidthInLine", "getMaxHeight-D9Ej5fM", "maxHeight"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContextualFlowRowScope extends androidx.compose.foundation.layout.RowScope {
    androidx.compose.ui.Modifier fillMaxRowHeight(androidx.compose.ui.Modifier modifier, float f);

    int getIndexInLine();

    int getLineIndex();

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name */
    float mo1636getMaxHeightD9Ej5fM();

    /* renamed from: getMaxWidthInLine-D9Ej5fM, reason: not valid java name */
    float mo1637getMaxWidthInLineD9Ej5fM();

    static /* synthetic */ androidx.compose.ui.Modifier fillMaxRowHeight$default(androidx.compose.foundation.layout.ContextualFlowRowScope contextualFlowRowScope, androidx.compose.ui.Modifier modifier, float f, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillMaxRowHeight");
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return contextualFlowRowScope.fillMaxRowHeight(modifier, f);
    }
}
