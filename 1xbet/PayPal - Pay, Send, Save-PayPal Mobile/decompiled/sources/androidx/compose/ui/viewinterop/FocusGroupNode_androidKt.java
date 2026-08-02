package androidx.compose.ui.viewinterop;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "focusInteropModifier", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FocusGroupNode_androidKt {
    public static final androidx.compose.ui.Modifier focusInteropModifier(androidx.compose.ui.Modifier modifier) {
        return androidx.compose.ui.focus.FocusModifierKt.focusTarget(modifier.then(androidx.compose.ui.viewinterop.FocusGroupPropertiesElement.INSTANCE)).then(androidx.compose.ui.viewinterop.FocusTargetPropertiesElement.INSTANCE).then(androidx.compose.ui.viewinterop.FocusTargetInteropElement.INSTANCE);
    }

    public static final /* synthetic */ boolean access$containsDescendant(android.view.View view, android.view.View view2) {
        for (android.view.ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final /* synthetic */ android.graphics.Rect access$getCurrentlyFocusedRect(androidx.compose.ui.focus.FocusOwner focusOwner, android.view.View view, android.view.View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        androidx.compose.ui.geometry.Rect focusRect = focusOwner.getFocusRect();
        if (focusRect == null) {
            return null;
        }
        int left = (int) focusRect.getLeft();
        int i = iArr[0];
        int i2 = iArr2[0];
        int top = (int) focusRect.getTop();
        int i3 = iArr[1];
        int i4 = iArr2[1];
        int right = (int) focusRect.getRight();
        int i5 = iArr[0];
        return new android.graphics.Rect((left + i) - i2, (top + i3) - i4, (right + i5) - iArr2[0], (((int) focusRect.getBottom()) + iArr[1]) - iArr2[1]);
    }

    public static final /* synthetic */ android.view.View access$getEmbeddedView(androidx.compose.ui.Modifier.Node node) {
        android.view.View interopView = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(node.getNode()).getInteropView();
        if (interopView != null) {
            return interopView;
        }
        throw new java.lang.IllegalStateException("Could not fetch interop view".toString());
    }
}
