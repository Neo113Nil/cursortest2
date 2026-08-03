package androidx.compose.ui.node;

/* compiled from: LayoutModifierNodeCoordinator.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¨\u0006\u0005"}, d2 = {"calculateAlignmentAndPlaceChildAsNeeded", "", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int calculateAlignmentAndPlaceChildAsNeeded(androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable, androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        int m4610getXimpl;
        androidx.compose.ui.node.LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child == null) {
            throw new java.lang.IllegalStateException(("Child of " + lookaheadCapablePlaceable + " cannot be null when calculating alignment line").toString());
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().containsKey(alignmentLine)) {
            java.lang.Integer num = lookaheadCapablePlaceable.getMeasureResult$ui_release().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = child.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui_release(true);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(true);
        lookaheadCapablePlaceable.replace$ui_release();
        child.setShallowPlacing$ui_release(false);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui_release(false);
        if (alignmentLine instanceof androidx.compose.ui.layout.HorizontalAlignmentLine) {
            m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4611getYimpl(child.getPosition());
        } else {
            m4610getXimpl = androidx.compose.ui.unit.IntOffset.m4610getXimpl(child.getPosition());
        }
        return i + m4610getXimpl;
    }
}
