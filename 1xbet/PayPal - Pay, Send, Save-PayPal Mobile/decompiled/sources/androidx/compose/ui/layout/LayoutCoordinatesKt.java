package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0006*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\t\u0010\f\u001a\u0011\u0010\r\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\r\u0010\u0003\u001a\u0011\u0010\u000e\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Offset;", "positionInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInWindow", "positionOnScreen", "Landroidx/compose/ui/geometry/Rect;", "boundsInRoot", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "boundsInWindow", "", "clipBounds", "(Landroidx/compose/ui/layout/LayoutCoordinates;Z)Landroidx/compose/ui/geometry/Rect;", "positionInParent", "boundsInParent", "findRootCoordinates", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long positionInRoot(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo7364localToRootMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    public static final long positionInWindow(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo7366localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    public static final long positionOnScreen(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo7365localToScreenMKHz9U(androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0());
    }

    public static final androidx.compose.ui.geometry.Rect boundsInRoot(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        return androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static /* synthetic */ androidx.compose.ui.geometry.Rect boundsInWindow$default(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return boundsInWindow(layoutCoordinates, z);
    }

    public static final androidx.compose.ui.geometry.Rect boundsInWindow(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, boolean z) {
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = findRootCoordinates(layoutCoordinates);
        float mo7361getSizeYbymL2g = (int) (findRootCoordinates.mo7361getSizeYbymL2g() >> 32);
        float mo7361getSizeYbymL2g2 = (int) (findRootCoordinates.mo7361getSizeYbymL2g() & 4294967295L);
        androidx.compose.ui.geometry.Rect localBoundingBoxOf = findRootCoordinates.localBoundingBoxOf(layoutCoordinates, z);
        float left = localBoundingBoxOf.getLeft();
        if (z) {
            if (left < 0.0f) {
                left = 0.0f;
            }
            if (left > mo7361getSizeYbymL2g) {
                left = mo7361getSizeYbymL2g;
            }
        }
        float top = localBoundingBoxOf.getTop();
        if (z) {
            if (top < 0.0f) {
                top = 0.0f;
            }
            if (top > mo7361getSizeYbymL2g2) {
                top = mo7361getSizeYbymL2g2;
            }
        }
        if (z) {
            float right = localBoundingBoxOf.getRight();
            if (right < 0.0f) {
                right = 0.0f;
            }
            if (right <= mo7361getSizeYbymL2g) {
                mo7361getSizeYbymL2g = right;
            }
        } else {
            mo7361getSizeYbymL2g = localBoundingBoxOf.getRight();
        }
        if (z) {
            float bottom = localBoundingBoxOf.getBottom();
            float f = bottom >= 0.0f ? bottom : 0.0f;
            if (f <= mo7361getSizeYbymL2g2) {
                mo7361getSizeYbymL2g2 = f;
            }
        } else {
            mo7361getSizeYbymL2g2 = localBoundingBoxOf.getBottom();
        }
        if (left == mo7361getSizeYbymL2g || top == mo7361getSizeYbymL2g2) {
            return androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        }
        long mo7366localToWindowMKHz9U = findRootCoordinates.mo7366localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(left) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L)));
        long mo7366localToWindowMKHz9U2 = findRootCoordinates.mo7366localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(mo7361getSizeYbymL2g) << 32) | (java.lang.Float.floatToRawIntBits(top) & 4294967295L)));
        long mo7366localToWindowMKHz9U3 = findRootCoordinates.mo7366localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(mo7361getSizeYbymL2g) << 32) | (java.lang.Float.floatToRawIntBits(mo7361getSizeYbymL2g2) & 4294967295L)));
        long mo7366localToWindowMKHz9U4 = findRootCoordinates.mo7366localToWindowMKHz9U(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(mo7361getSizeYbymL2g2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(left) << 32)));
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U2 >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U4 >> 32));
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U3 >> 32));
        float min = java.lang.Math.min(intBitsToFloat, java.lang.Math.min(intBitsToFloat2, java.lang.Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = java.lang.Math.max(intBitsToFloat, java.lang.Math.max(intBitsToFloat2, java.lang.Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U & 4294967295L));
        float intBitsToFloat6 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U2 & 4294967295L));
        float intBitsToFloat7 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U4 & 4294967295L));
        float intBitsToFloat8 = java.lang.Float.intBitsToFloat((int) (mo7366localToWindowMKHz9U3 & 4294967295L));
        return new androidx.compose.ui.geometry.Rect(min, java.lang.Math.min(intBitsToFloat5, java.lang.Math.min(intBitsToFloat6, java.lang.Math.min(intBitsToFloat7, intBitsToFloat8))), max, java.lang.Math.max(intBitsToFloat5, java.lang.Math.max(intBitsToFloat6, java.lang.Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final long positionInParent(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo7362localPositionOfR5De75A(layoutCoordinates, androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0()) : androidx.compose.ui.geometry.Offset.INSTANCE.m5768getZeroF1C5BW0();
    }

    public static final androidx.compose.ui.geometry.Rect boundsInParent(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.geometry.Rect localBoundingBoxOf$default;
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (localBoundingBoxOf$default = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new androidx.compose.ui.geometry.Rect(0.0f, 0.0f, (int) (layoutCoordinates.mo7361getSizeYbymL2g() >> 32), (int) (layoutCoordinates.mo7361getSizeYbymL2g() & 4294967295L)) : localBoundingBoxOf$default;
    }

    public static final androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates) {
        androidx.compose.ui.layout.LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (parentLayoutCoordinates != null) {
            androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates2 = parentLayoutCoordinates;
            parentLayoutCoordinates = parentLayoutCoordinates.getParentLayoutCoordinates();
            layoutCoordinates = layoutCoordinates2;
        }
        androidx.compose.ui.node.NodeCoordinator nodeCoordinator = layoutCoordinates instanceof androidx.compose.ui.node.NodeCoordinator ? (androidx.compose.ui.node.NodeCoordinator) layoutCoordinates : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates;
        }
        for (androidx.compose.ui.node.NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy(); wrappedBy != null; wrappedBy = wrappedBy.getWrappedBy()) {
            nodeCoordinator = wrappedBy;
        }
        return nodeCoordinator;
    }
}
