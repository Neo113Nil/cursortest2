package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR0\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\bR\u0018\u0010!\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010 R\u0014\u0010%\u001a\u00020\"8EX\u0084\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "rect", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "coordinates", "", "onGloballyPositioned", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "onDetach", "()V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroid/graphics/Rect;", "currentRects", "()Landroidx/compose/runtime/collection/MutableVector;", "rects", "updateRects", "(Landroidx/compose/runtime/collection/MutableVector;)V", "p0", "getHighSpeedVideoFpsRangesFor", "(Landroid/graphics/Rect;)V", "p1", "Camera2StreamConfigurationMap", "(Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Lkotlin/jvm/functions/Function1;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", "Landroid/graphics/Rect;", "getHighSpeedVideoSizes", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class RectListNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.GlobalPositionAwareModifierNode {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.graphics.Rect getHighSpeedVideoSizes;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public abstract androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> currentRects();

    public abstract void updateRects(androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> rects);

    public RectListNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    protected final android.view.View getView() {
        return androidx.compose.ui.node.DelegatableNode_androidKt.requireView(this);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        android.graphics.Rect Camera2StreamConfigurationMap;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(coordinates);
            Camera2StreamConfigurationMap = new android.graphics.Rect(kotlin.math.MathKt.roundToInt(boundsInRoot.getLeft()), kotlin.math.MathKt.roundToInt(boundsInRoot.getTop()), kotlin.math.MathKt.roundToInt(boundsInRoot.getRight()), kotlin.math.MathKt.roundToInt(boundsInRoot.getBottom()));
        } else {
            kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
            Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(coordinates, rect.invoke(coordinates));
        }
        getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        getHighSpeedVideoFpsRangesFor(null);
    }

    private final void getHighSpeedVideoFpsRangesFor(android.graphics.Rect p0) {
        androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> currentRects = currentRects();
        android.graphics.Rect rect = this.getHighSpeedVideoSizes;
        if (rect != null) {
            currentRects.remove(rect);
        }
        if (p0 != null && !p0.isEmpty()) {
            currentRects.add(p0);
        }
        updateRects(currentRects);
        this.getHighSpeedVideoSizes = p0;
    }

    private static android.graphics.Rect Camera2StreamConfigurationMap(androidx.compose.ui.layout.LayoutCoordinates p0, androidx.compose.ui.geometry.Rect p1) {
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(p0);
        long mo7362localPositionOfR5De75A = findRootCoordinates.mo7362localPositionOfR5De75A(p0, p1.m5787getTopLeftF1C5BW0());
        long mo7362localPositionOfR5De75A2 = findRootCoordinates.mo7362localPositionOfR5De75A(p0, p1.m5788getTopRightF1C5BW0());
        long mo7362localPositionOfR5De75A3 = findRootCoordinates.mo7362localPositionOfR5De75A(p0, p1.m5780getBottomLeftF1C5BW0());
        long mo7362localPositionOfR5De75A4 = findRootCoordinates.mo7362localPositionOfR5De75A(p0, p1.m5781getBottomRightF1C5BW0());
        int i = (int) (mo7362localPositionOfR5De75A >> 32);
        int i2 = (int) (mo7362localPositionOfR5De75A2 >> 32);
        int i3 = (int) (mo7362localPositionOfR5De75A3 >> 32);
        int i4 = (int) (mo7362localPositionOfR5De75A4 >> 32);
        int i5 = (int) (mo7362localPositionOfR5De75A & 4294967295L);
        int i6 = (int) (mo7362localPositionOfR5De75A2 & 4294967295L);
        int i7 = (int) (mo7362localPositionOfR5De75A3 & 4294967295L);
        int i8 = (int) (mo7362localPositionOfR5De75A4 & 4294967295L);
        return new android.graphics.Rect(kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.minOf(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.minOf(java.lang.Float.intBitsToFloat(i5), java.lang.Float.intBitsToFloat(i6), java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i8))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.maxOf(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat(i3), java.lang.Float.intBitsToFloat(i4))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.maxOf(java.lang.Float.intBitsToFloat(i5), java.lang.Float.intBitsToFloat(i6), java.lang.Float.intBitsToFloat(i7), java.lang.Float.intBitsToFloat(i8))));
    }
}
