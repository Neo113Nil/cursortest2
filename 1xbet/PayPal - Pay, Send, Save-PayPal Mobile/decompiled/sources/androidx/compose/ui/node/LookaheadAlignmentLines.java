package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\f*\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t0\u0011*\u00020\u00068UX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/node/LookaheadAlignmentLines;", "Landroidx/compose/ui/node/AlignmentLines;", "Landroidx/compose/ui/node/AlignmentLinesOwner;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/AlignmentLinesOwner;)V", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "getPositionFor", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/geometry/Offset;", com.daon.sdk.face.license.License.FEATURE_POSITION, "calculatePositionInParent-R5De75A", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "calculatePositionInParent", "", "getAlignmentLinesMap", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LookaheadAlignmentLines extends androidx.compose.ui.node.AlignmentLines {
    public static final int $stable = 8;

    public LookaheadAlignmentLines(androidx.compose.ui.node.AlignmentLinesOwner alignmentLinesOwner) {
        super(alignmentLinesOwner, null);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected final java.util.Map<androidx.compose.ui.layout.AlignmentLine, java.lang.Integer> getAlignmentLinesMap(androidx.compose.ui.node.NodeCoordinator nodeCoordinator) {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.getMeasureResult$ui().getAlignmentLines();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    protected final int getPositionFor(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, androidx.compose.ui.layout.AlignmentLine alignmentLine) {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.get(alignmentLine);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    /* renamed from: calculatePositionInParent-R5De75A */
    protected final long mo7495calculatePositionInParentR5De75A(androidx.compose.ui.node.NodeCoordinator nodeCoordinator, long j) {
        androidx.compose.ui.node.LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        kotlin.jvm.internal.Intrinsics.checkNotNull(lookaheadDelegate);
        long position = lookaheadDelegate.getPosition();
        float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(position);
        float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(position);
        return androidx.compose.ui.geometry.Offset.m5757plusMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8729getXimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8730getYimpl) & 4294967295L)), j);
    }
}
