package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "node", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "windowSize", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "rectInfoFor-Dg36KO4", "(Landroidx/compose/ui/node/DelegatableNode;JJJJJ[F)Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "rectInfoFor"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ThrottledCallbacksKt {
    /* renamed from: rectInfoFor-Dg36KO4, reason: not valid java name */
    public static final androidx.compose.ui.spatial.RelativeLayoutBounds m7833rectInfoForDg36KO4(androidx.compose.ui.node.DelegatableNode delegatableNode, long j, long j2, long j3, long j4, long j5, float[] fArr) {
        androidx.compose.ui.node.NodeCoordinator m7502requireCoordinator64DMado = androidx.compose.ui.node.DelegatableNodeKt.m7502requireCoordinator64DMado(delegatableNode, androidx.compose.ui.node.NodeKind.m7621constructorimpl(2));
        androidx.compose.ui.node.LayoutNode requireLayoutNode = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(delegatableNode);
        if (!requireLayoutNode.isPlaced()) {
            return null;
        }
        if (requireLayoutNode.getOuterCoordinator$ui() != m7502requireCoordinator64DMado) {
            long m8723constructorimpl = androidx.compose.ui.unit.IntOffset.m8723constructorimpl(j);
            float m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(m8723constructorimpl);
            float m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(m8723constructorimpl);
            long m5744constructorimpl = androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(m8729getXimpl) << 32) | (java.lang.Float.floatToRawIntBits(m8730getYimpl) & 4294967295L));
            long mo7361getSizeYbymL2g = m7502requireCoordinator64DMado.getCoordinates().mo7361getSizeYbymL2g();
            return new androidx.compose.ui.spatial.RelativeLayoutBounds(androidx.compose.ui.unit.IntOffsetKt.m8746roundk4lQ0M(requireLayoutNode.getOuterCoordinator$ui().getCoordinates().mo7362localPositionOfR5De75A(m7502requireCoordinator64DMado, m5744constructorimpl)), androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((androidx.compose.ui.unit.IntOffset.m8729getXimpl(r3) + ((int) (mo7361getSizeYbymL2g >> 32))) << 32) | ((androidx.compose.ui.unit.IntOffset.m8730getYimpl(r3) + ((int) (mo7361getSizeYbymL2g & 4294967295L))) & 4294967295L)), j3, j4, j5, fArr, delegatableNode, null);
        }
        return new androidx.compose.ui.spatial.RelativeLayoutBounds(j, j2, j3, j4, j5, fArr, delegatableNode, null);
    }
}
