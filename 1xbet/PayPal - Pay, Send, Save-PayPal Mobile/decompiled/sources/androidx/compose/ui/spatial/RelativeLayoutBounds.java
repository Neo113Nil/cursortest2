package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b!\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010$\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0017H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,R\u0014\u00101\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010,R\u0014\u0010.\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010,R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,R\u0016\u00102\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00103R\u0014\u00105\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00104R\u0011\u00108\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b6\u00107R\u0011\u0010:\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b9\u00107R\u0011\u0010<\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b;\u00107R\u0011\u0010>\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b=\u0010*R\u0011\u0010@\u001a\u00020\u00178G¢\u0006\u0006\u001a\u0004\b?\u0010*R\u0011\u0010C\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0011\u0010G\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\bF\u0010B"}, d2 = {"Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "windowSize", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "Landroidx/compose/ui/node/DelegatableNode;", "node", "<init>", "(JJJJJ[FLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Landroidx/compose/ui/unit/IntRect;", "calculateOcclusions", "()Ljava/util/List;", "viewport", "", "fractionVisibleIn", "(Landroidx/compose/ui/spatial/RelativeLayoutBounds;)F", "", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT, com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP, com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT, com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM, "fractionVisibleInRect", "(IIII)F", "fractionVisibleInWindow", "()F", "topLeftInset", "bottomRightInset", "fractionVisibleInWindowWithInsets-E1MhUcY", "(JJ)F", "fractionVisibleInWindowWithInsets", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizesFor", "getHighSpeedVideoFpsRangesFor", "getInputFormats", "[F", "Landroidx/compose/ui/node/DelegatableNode;", "getOutputFormats", "getPositionInRoot-nOcc-ac", "()J", "positionInRoot", "getPositionInWindow-nOcc-ac", "positionInWindow", "getPositionInScreen-nOcc-ac", "positionInScreen", "getWidth", "width", "getHeight", "height", "getBoundsInRoot", "()Landroidx/compose/ui/unit/IntRect;", "boundsInRoot", "getBoundsInWindow", "boundsInWindow", "getBoundsInScreen", "boundsInScreen"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RelativeLayoutBounds {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float[] getInputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.ui.node.DelegatableNode getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRangesFor;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    private RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, androidx.compose.ui.node.DelegatableNode delegatableNode) {
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = j2;
        this.getHighSpeedVideoFpsRangesFor = j3;
        this.getHighSpeedVideoSizes = j4;
        this.getHighResolutionOutputSizeshNQ4ISI = j5;
        this.getInputFormats = fArr;
        this.getOutputFormats = delegatableNode;
    }

    /* renamed from: getPositionInRoot-nOcc-ac, reason: not valid java name */
    public final long m7822getPositionInRootnOccac() {
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: getPositionInWindow-nOcc-ac, reason: not valid java name */
    public final long m7824getPositionInWindownOccac() {
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoSizes);
        int m8729getXimpl2 = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoFpsRangesFor);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoSizes);
        int m8730getYimpl2 = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoFpsRangesFor);
        long j = this.Camera2StreamConfigurationMap;
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((((int) (j >> 32)) + (m8729getXimpl - m8729getXimpl2)) << 32) | ((((int) j) + (m8730getYimpl - m8730getYimpl2)) & 4294967295L));
    }

    /* renamed from: getPositionInScreen-nOcc-ac, reason: not valid java name */
    public final long m7823getPositionInScreennOccac() {
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoSizes);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoSizes);
        return androidx.compose.ui.unit.IntOffset.m8723constructorimpl(((((int) r2) + m8730getYimpl) & 4294967295L) | ((((int) (this.Camera2StreamConfigurationMap >> 32)) + m8729getXimpl) << 32));
    }

    public final int getWidth() {
        return ((int) (this.getHighSpeedVideoFpsRanges >> 32)) - ((int) (this.Camera2StreamConfigurationMap >> 32));
    }

    public final int getHeight() {
        return ((int) this.getHighSpeedVideoFpsRanges) - ((int) this.Camera2StreamConfigurationMap);
    }

    public final androidx.compose.ui.unit.IntRect getBoundsInRoot() {
        long j = this.Camera2StreamConfigurationMap;
        long j2 = this.getHighSpeedVideoFpsRanges;
        return new androidx.compose.ui.unit.IntRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final androidx.compose.ui.unit.IntRect getBoundsInWindow() {
        long j = this.Camera2StreamConfigurationMap;
        int i = (int) (j >> 32);
        int i2 = (int) j;
        long j2 = this.getHighSpeedVideoFpsRanges;
        int i3 = (int) (j2 >> 32);
        int i4 = (int) j2;
        float[] fArr = this.getInputFormats;
        if (fArr != null) {
            return androidx.compose.ui.unit.IntRectKt.roundToIntRect(androidx.compose.ui.graphics.Matrix.m6230mapimpl(fArr, new androidx.compose.ui.geometry.Rect(i, i2, i3, i4)));
        }
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoSizes) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoFpsRangesFor);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoSizes) - androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoFpsRangesFor);
        return new androidx.compose.ui.unit.IntRect(i + m8729getXimpl, i2 + m8730getYimpl, i3 + m8729getXimpl, i4 + m8730getYimpl);
    }

    public final androidx.compose.ui.unit.IntRect getBoundsInScreen() {
        if (this.getInputFormats != null) {
            androidx.compose.ui.unit.IntRect boundsInWindow = getBoundsInWindow();
            long j = this.getHighSpeedVideoFpsRangesFor;
            return new androidx.compose.ui.unit.IntRect(boundsInWindow.getLeft() + androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), boundsInWindow.getTop() + androidx.compose.ui.unit.IntOffset.m8730getYimpl(j), boundsInWindow.getRight() + androidx.compose.ui.unit.IntOffset.m8729getXimpl(j), boundsInWindow.getBottom() + androidx.compose.ui.unit.IntOffset.m8730getYimpl(j));
        }
        long j2 = this.Camera2StreamConfigurationMap;
        int i = (int) (j2 >> 32);
        long j3 = this.getHighSpeedVideoFpsRanges;
        int i2 = (int) (j3 >> 32);
        int i3 = (int) j3;
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoSizes);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoSizes);
        return new androidx.compose.ui.unit.IntRect(i + m8729getXimpl, ((int) j2) + m8730getYimpl, i2 + m8729getXimpl, i3 + m8730getYimpl);
    }

    public final java.util.List<androidx.compose.ui.unit.IntRect> calculateOcclusions() {
        int i;
        int i2;
        androidx.compose.ui.spatial.RectManager rectManager = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(this.getOutputFormats).getRectManager();
        int semanticsId = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(this.getOutputFormats).getSemanticsId();
        androidx.compose.ui.spatial.RectList rects = rectManager.getRects();
        int indexOf = rects.indexOf(semanticsId);
        if (indexOf < 0) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        long[] jArr = rects.items;
        int i3 = rects.itemsSize;
        long j = jArr[indexOf];
        long j2 = jArr[indexOf + 1];
        int i4 = 0;
        while (i4 < jArr.length - 2 && i4 < i3) {
            if (i4 == indexOf) {
                i4 += 3;
            } else {
                long j3 = jArr[i4];
                long j4 = jArr[i4 + 1];
                if (((((j2 - j3) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((j4 - j) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    i = i3;
                    i2 = indexOf;
                    int i5 = (int) (j3 >> 32);
                    int i6 = (int) j3;
                    int i7 = (int) (j4 >> 32);
                    int i8 = (int) j4;
                    if (rectManager.isTargetDrawnFirst$ui(semanticsId, ((int) jArr[i4 + 2]) & 33554431)) {
                        createListBuilder.add(new androidx.compose.ui.unit.IntRect(i5, i6, i7, i8));
                    }
                } else {
                    i = i3;
                    i2 = indexOf;
                }
                i4 += 3;
                indexOf = i2;
                i3 = i;
            }
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public final float fractionVisibleIn(androidx.compose.ui.spatial.RelativeLayoutBounds viewport) {
        long j = viewport.Camera2StreamConfigurationMap;
        long j2 = viewport.getHighSpeedVideoFpsRanges;
        return fractionVisibleInRect((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
    }

    public final float fractionVisibleInRect(int left, int top, int right, int bottom) {
        int min = java.lang.Math.min(java.lang.Math.max((int) (this.Camera2StreamConfigurationMap >> 32), left), right);
        int min2 = java.lang.Math.min(java.lang.Math.max((int) this.Camera2StreamConfigurationMap, top), bottom);
        int max = java.lang.Math.max(java.lang.Math.min((int) (this.getHighSpeedVideoFpsRanges >> 32), right), left);
        int i = (int) this.getHighSpeedVideoFpsRanges;
        return java.lang.Math.max((max - min) * (java.lang.Math.max(java.lang.Math.min(i, bottom), top) - min2), 0) / java.lang.Math.min((right - left) * (bottom - top), (r2 - r0) * (i - r3));
    }

    public final float fractionVisibleInWindow() {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        return fractionVisibleInRect(0, 0, (int) (j >> 32), (int) j);
    }

    /* renamed from: fractionVisibleInWindowWithInsets-E1MhUcY, reason: not valid java name */
    public final float m7821fractionVisibleInWindowWithInsetsE1MhUcY(long topLeftInset, long bottomRightInset) {
        long j = this.getHighResolutionOutputSizeshNQ4ISI;
        int m8729getXimpl = androidx.compose.ui.unit.IntOffset.m8729getXimpl(this.getHighSpeedVideoFpsRangesFor);
        int m8730getYimpl = androidx.compose.ui.unit.IntOffset.m8730getYimpl(this.getHighSpeedVideoFpsRangesFor);
        int i = (int) (j >> 32);
        return fractionVisibleInRect(androidx.compose.ui.unit.IntOffset.m8729getXimpl(topLeftInset) + m8729getXimpl, androidx.compose.ui.unit.IntOffset.m8730getYimpl(topLeftInset) + m8730getYimpl, (m8729getXimpl + i) - androidx.compose.ui.unit.IntOffset.m8729getXimpl(bottomRightInset), (m8730getYimpl + ((int) j)) - androidx.compose.ui.unit.IntOffset.m8730getYimpl(bottomRightInset));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        androidx.compose.ui.spatial.RelativeLayoutBounds relativeLayoutBounds = (androidx.compose.ui.spatial.RelativeLayoutBounds) other;
        if (this.Camera2StreamConfigurationMap != relativeLayoutBounds.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRanges != relativeLayoutBounds.getHighSpeedVideoFpsRanges || this.getHighResolutionOutputSizeshNQ4ISI != relativeLayoutBounds.getHighResolutionOutputSizeshNQ4ISI || !androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(this.getHighSpeedVideoFpsRangesFor, relativeLayoutBounds.getHighSpeedVideoFpsRangesFor) || !androidx.compose.ui.unit.IntOffset.m8728equalsimpl0(this.getHighSpeedVideoSizes, relativeLayoutBounds.getHighSpeedVideoSizes)) {
            return false;
        }
        float[] fArr = this.getInputFormats;
        float[] fArr2 = relativeLayoutBounds.getInputFormats;
        if (fArr != null ? fArr2 != null && androidx.compose.ui.graphics.Matrix.m6225equalsimpl0(fArr, fArr2) : fArr2 == null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getOutputFormats, relativeLayoutBounds.getOutputFormats);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.Camera2StreamConfigurationMap);
        int hashCode2 = java.lang.Long.hashCode(this.getHighSpeedVideoFpsRanges);
        int hashCode3 = java.lang.Long.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
        int m8731hashCodeimpl = androidx.compose.ui.unit.IntOffset.m8731hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
        int m8731hashCodeimpl2 = androidx.compose.ui.unit.IntOffset.m8731hashCodeimpl(this.getHighSpeedVideoSizes);
        float[] fArr = this.getInputFormats;
        return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + m8731hashCodeimpl) * 31) + m8731hashCodeimpl2) * 31) + (fArr != null ? androidx.compose.ui.graphics.Matrix.m6227hashCodeimpl(fArr) : 0)) * 31) + this.getOutputFormats.hashCode();
    }

    public /* synthetic */ RelativeLayoutBounds(long j, long j2, long j3, long j4, long j5, float[] fArr, androidx.compose.ui.node.DelegatableNode delegatableNode, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, fArr, delegatableNode);
    }
}
