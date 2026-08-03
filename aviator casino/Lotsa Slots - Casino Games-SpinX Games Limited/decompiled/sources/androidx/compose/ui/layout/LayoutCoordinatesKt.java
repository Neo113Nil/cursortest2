package androidx.compose.ui.layout;

/* compiled from: LayoutCoordinates.kt */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\u000b"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo3411localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
    }

    public static final long positionInWindow(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0());
    }

    public static final androidx.compose.ui.geometry.Rect boundsInRoot(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final androidx.compose.ui.geometry.Rect boundsInWindow(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        androidx.compose.ui.geometry.Rect boundsInRoot = boundsInRoot(layoutCoordinates);
        float m4652getWidthimpl = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(findRootCoordinates.mo3409getSizeYbymL2g());
        float m4651getHeightimpl = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(findRootCoordinates.mo3409getSizeYbymL2g());
        float coerceIn = kotlin.ranges.RangesKt.coerceIn(boundsInRoot.getLeft(), 0.0f, m4652getWidthimpl);
        float coerceIn2 = kotlin.ranges.RangesKt.coerceIn(boundsInRoot.getTop(), 0.0f, m4651getHeightimpl);
        float coerceIn3 = kotlin.ranges.RangesKt.coerceIn(boundsInRoot.getRight(), 0.0f, m4652getWidthimpl);
        float coerceIn4 = kotlin.ranges.RangesKt.coerceIn(boundsInRoot.getBottom(), 0.0f, m4651getHeightimpl);
        if (coerceIn == coerceIn3 || coerceIn2 == coerceIn4) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        long mo3412localToWindowMKHz9U = findRootCoordinates.mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn, coerceIn2));
        long mo3412localToWindowMKHz9U2 = findRootCoordinates.mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn3, coerceIn2));
        long mo3412localToWindowMKHz9U3 = findRootCoordinates.mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn3, coerceIn4));
        long mo3412localToWindowMKHz9U4 = findRootCoordinates.mo3412localToWindowMKHz9U(androidx.compose.ui.geometry.OffsetKt.Offset(coerceIn, coerceIn4));
        return new androidx.compose.ui.geometry.Rect(kotlin.comparisons.ComparisonsKt.minOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U2), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U4), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U3)), kotlin.comparisons.ComparisonsKt.minOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U2), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U4), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U3)), kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U2), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U4), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3412localToWindowMKHz9U3)), kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U2), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U4), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3412localToWindowMKHz9U3)));
    }

    public static final long positionInParent(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0()) : androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();
    }

    public static final androidx.compose.ui.geometry.Rect boundsInParent(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.geometry.Rect localBoundingBoxOf$default;
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, androidx.compose.ui.unit.IntSize.m4652getWidthimpl(layoutCoordinates.mo3409getSizeYbymL2g()), androidx.compose.ui.unit.IntSize.m4651getHeightimpl(layoutCoordinates.mo3409getSizeYbymL2g())) : localBoundingBoxOf$default;
    }

    public static final androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2;
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof androidx.compose.ui.node.NodeCoordinator ? (androidx.compose.ui.node.NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        androidx.compose.ui.node.NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator2 = wrappedBy;
            androidx.compose.ui.node.NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }
}
