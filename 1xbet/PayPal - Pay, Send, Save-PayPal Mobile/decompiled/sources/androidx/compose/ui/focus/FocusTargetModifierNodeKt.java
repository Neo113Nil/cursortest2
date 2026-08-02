package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a?\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032&\b\u0002\u0010\t\u001a \u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u0004\u0018\u00010\f*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/focus/FocusTargetModifierNode;", "FocusTargetModifierNode", "()Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/focus/Focusability;", "focusability", "Lkotlin/Function2;", "Landroidx/compose/ui/focus/FocusState;", "Lkotlin/ParameterName;", "", "onFocusChange", "FocusTargetModifierNode-PYyLHbc", "(ILkotlin/jvm/functions/Function2;)Landroidx/compose/ui/focus/FocusTargetModifierNode;", "Landroidx/compose/ui/geometry/Rect;", "getFocusedRect", "(Landroidx/compose/ui/focus/FocusTargetModifierNode;)Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusTargetModifierNodeKt {
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use the other overload with added parameters for focusability and onFocusChange")
    public static final /* synthetic */ androidx.compose.ui.focus.FocusTargetModifierNode FocusTargetModifierNode() {
        return new androidx.compose.ui.focus.FocusTargetNode(0, false, null, new androidx.compose.ui.focus.FocusTargetModifierNodeKt$FocusTargetModifierNode$1(androidx.compose.ui.focus.InvalidateSemantics.INSTANCE), 7, null);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.ui.focus.FocusTargetModifierNode m5677FocusTargetModifierNodePYyLHbc$default(int i, kotlin.jvm.functions.Function2 function2, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = androidx.compose.ui.focus.Focusability.INSTANCE.m5692getAlwaysLCbbffg();
        }
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        return m5676FocusTargetModifierNodePYyLHbc(i, function2);
    }

    /* renamed from: FocusTargetModifierNode-PYyLHbc, reason: not valid java name */
    public static final androidx.compose.ui.focus.FocusTargetModifierNode m5676FocusTargetModifierNodePYyLHbc(int i, kotlin.jvm.functions.Function2<? super androidx.compose.ui.focus.FocusState, ? super androidx.compose.ui.focus.FocusState, kotlin.Unit> function2) {
        return new androidx.compose.ui.focus.FocusTargetNode(i, false, function2, null, 10, null);
    }

    public static final androidx.compose.ui.geometry.Rect getFocusedRect(androidx.compose.ui.focus.FocusTargetModifierNode focusTargetModifierNode) {
        if (!focusTargetModifierNode.getNode().getIsAttached()) {
            return null;
        }
        androidx.compose.ui.focus.FocusState focusState = focusTargetModifierNode.getFocusState();
        if (!focusState.getHasFocus()) {
            return null;
        }
        if (focusState.isFocused()) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(focusTargetModifierNode, "");
            return androidx.compose.ui.focus.FocusTargetNode.fetchFocusRect$ui$default((androidx.compose.ui.focus.FocusTargetNode) focusTargetModifierNode, null, 1, null);
        }
        androidx.compose.ui.focus.FocusTargetModifierNode focusTargetModifierNode2 = focusTargetModifierNode;
        androidx.compose.ui.focus.FocusTargetNode activeFocusTargetNode = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(focusTargetModifierNode2).getFocusOwner().getActiveFocusTargetNode();
        if (activeFocusTargetNode != null) {
            return activeFocusTargetNode.fetchFocusRect$ui(androidx.compose.ui.node.DelegatableNodeKt.requireLayoutCoordinates(focusTargetModifierNode2));
        }
        return null;
    }
}
