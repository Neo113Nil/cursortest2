package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\t\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\t\u001a\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Rect;", "rect", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "coerceIn", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "offset", "fromTextLayoutToCore-Uv8p0NA", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromDecorationToTextLayout-Uv8p0NA", "fromDecorationToTextLayout", "fromWindowToDecoration-Uv8p0NA", "fromWindowToDecoration", "fromTextLayoutToDecoration", "(Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayoutStateKt {
    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m2265fromTextLayoutToCoreUv8p0NA(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j) {
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            androidx.compose.ui.geometry.Offset offset = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                androidx.compose.ui.layout.LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offset = androidx.compose.ui.geometry.Offset.m5741boximpl(coreNodeCoordinates.mo7362localPositionOfR5De75A(textLayoutNodeCoordinates, j));
                    }
                }
                if (offset != null) {
                    return offset.m5762unboximpl();
                }
            }
        }
        return j;
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m2264fromDecorationToTextLayoutUv8p0NA(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j) {
        androidx.compose.ui.geometry.Offset offset;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                offset = androidx.compose.ui.geometry.Offset.m5741boximpl((textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) ? textLayoutNodeCoordinates.mo7362localPositionOfR5De75A(decoratorNodeCoordinates, j) : j);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m5762unboximpl();
            }
        }
        return j;
    }

    /* renamed from: fromWindowToDecoration-Uv8p0NA, reason: not valid java name */
    public static final long m2266fromWindowToDecorationUv8p0NA(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, long j) {
        androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
        return (decoratorNodeCoordinates == null || !decoratorNodeCoordinates.isAttached()) ? j : decoratorNodeCoordinates.mo7370windowToLocalMKHz9U(j);
    }

    public static final androidx.compose.ui.geometry.Rect fromTextLayoutToDecoration(androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.geometry.Rect rect) {
        androidx.compose.ui.layout.LayoutCoordinates decoratorNodeCoordinates;
        androidx.compose.ui.layout.LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates()) != null) {
                androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates = decoratorNodeCoordinates.isAttached() ? decoratorNodeCoordinates : null;
                if (layoutCoordinates != null) {
                    return rect.m5789translatek4lQ0M(layoutCoordinates.localBoundingBoxOf(textLayoutNodeCoordinates, false).m5787getTopLeftF1C5BW0());
                }
            }
        }
        return rect;
    }

    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m2263coerceIn3MmeM6k(long j, androidx.compose.ui.geometry.Rect rect) {
        float right;
        float bottom;
        int i = (int) (j >> 32);
        if (java.lang.Float.intBitsToFloat(i) < rect.getLeft()) {
            right = rect.getLeft();
        } else {
            right = java.lang.Float.intBitsToFloat(i) > rect.getRight() ? rect.getRight() : java.lang.Float.intBitsToFloat(i);
        }
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i2) < rect.getTop()) {
            bottom = rect.getTop();
        } else {
            bottom = java.lang.Float.intBitsToFloat(i2) > rect.getBottom() ? rect.getBottom() : java.lang.Float.intBitsToFloat(i2);
        }
        return androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(right) << 32) | (java.lang.Float.floatToRawIntBits(bottom) & 4294967295L));
    }
}
