package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/viewinterop/FocusTargetPropertiesNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "<init>", "()V", "Landroidx/compose/ui/focus/FocusProperties;", "p0", "", "applyFocusProperties", "(Landroidx/compose/ui/focus/FocusProperties;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class FocusTargetPropertiesNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.focus.FocusPropertiesModifierNode {
    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void applyFocusProperties(androidx.compose.ui.focus.FocusProperties p0) {
        androidx.compose.ui.geometry.Rect calculateFocusRectRelativeTo;
        androidx.compose.ui.viewinterop.FocusTargetPropertiesNode focusTargetPropertiesNode = this;
        android.view.View access$getEmbeddedView = androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(focusTargetPropertiesNode);
        p0.setCanFocus(getNode().getIsAttached() && androidx.compose.ui.viewinterop.FocusGroupNode_androidKt.access$getEmbeddedView(focusTargetPropertiesNode).hasFocusable());
        android.view.View findFocus = access$getEmbeddedView.findFocus();
        if (findFocus == null || (calculateFocusRectRelativeTo = androidx.compose.ui.focus.FocusInteropUtils_androidKt.calculateFocusRectRelativeTo(findFocus, access$getEmbeddedView)) == null) {
            return;
        }
        p0.setFocusRect(calculateFocusRectRelativeTo);
    }
}
