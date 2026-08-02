package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a1\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "", "requestFocusForChildInRootBounds", "(Landroidx/compose/ui/node/DelegatableNode;IIII)Z"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequestChildFocusKt {
    public static final boolean requestFocusForChildInRootBounds(androidx.compose.ui.node.DelegatableNode delegatableNode, int i, int i2, int i3, int i4) {
        androidx.compose.ui.focus.FocusTargetModifierNode findFocusableNodeFromRect$ui = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(delegatableNode).getRectManager().findFocusableNodeFromRect$ui(i, i2, i3, i4, androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode).getSemanticsId());
        if (findFocusableNodeFromRect$ui != null) {
            return androidx.compose.ui.focus.FocusTargetModifierNode.m5672requestFocus3ESFkO8$default(findFocusableNodeFromRect$ui, 0, 1, null);
        }
        return false;
    }
}
