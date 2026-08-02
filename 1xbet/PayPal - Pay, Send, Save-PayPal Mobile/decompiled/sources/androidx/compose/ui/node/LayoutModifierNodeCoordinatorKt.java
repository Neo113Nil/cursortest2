package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/AlignmentLine;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/ui/node/LookaheadCapablePlaceable;Landroidx/compose/ui/layout/AlignmentLine;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LayoutModifierNodeCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.node.LookaheadCapablePlaceable lookaheadCapablePlaceable, androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        int m8729getXimpl;
        androidx.compose.ui.node.LookaheadCapablePlaceable child = lookaheadCapablePlaceable.getChild();
        if (child == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Child of ");
            sb.append(lookaheadCapablePlaceable);
            sb.append(" cannot be null when calculating alignment line");
            androidx.compose.ui.internal.InlineClassHelperKt.throwIllegalStateException(sb.toString());
        }
        if (lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().containsKey(alignmentLine)) {
            java.lang.Integer num = lookaheadCapablePlaceable.getMeasureResult$ui().getAlignmentLines().get(alignmentLine);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int i = child.get(alignmentLine);
        if (i == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        child.setShallowPlacing$ui(true);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(true);
        lookaheadCapablePlaceable.replace$ui();
        child.setShallowPlacing$ui(false);
        lookaheadCapablePlaceable.setPlacingForAlignment$ui(false);
        if (alignmentLine instanceof androidx.compose.ui.layout.HorizontalAlignmentLine) {
            m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(child.getPosition());
        } else {
            m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(child.getPosition());
        }
        return i + m8729getXimpl;
    }
}
