package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/focus/InvalidateSemantics;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "p0", "", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/focus/FocusTargetNode;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class InvalidateSemantics {
    public static final androidx.compose.ui.focus.InvalidateSemantics INSTANCE = new androidx.compose.ui.focus.InvalidateSemantics();

    private InvalidateSemantics() {
    }

    public final void getHighSpeedVideoFpsRangesFor(androidx.compose.ui.focus.FocusTargetNode p0) {
        java.lang.Object node = p0.getNode();
        androidx.compose.ui.node.SemanticsModifierNode semanticsModifierNode = node instanceof androidx.compose.ui.node.SemanticsModifierNode ? (androidx.compose.ui.node.SemanticsModifierNode) node : null;
        if (semanticsModifierNode != null) {
            androidx.compose.ui.node.SemanticsModifierNodeKt.invalidateSemantics(semanticsModifierNode);
        }
    }
}
