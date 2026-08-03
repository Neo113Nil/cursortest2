package androidx.compose.foundation;

/* compiled from: RectListNode.android.kt */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0007H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\u001c\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function1;)V", "androidRect", "Landroid/graphics/Rect;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "currentRects", "Landroidx/compose/runtime/collection/MutableVector;", "onDetach", "", "onGloballyPositioned", com.ironsource.Y3.f, "replaceRect", "newRect", "updateRects", "rects", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RectListNode extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.GlobalPositionAwareModifierNode, androidx.compose.ui.node.CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private android.graphics.Rect androidRect;
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public abstract androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> currentRects();

    public abstract void updateRects(androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> rects);

    public kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public RectListNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    protected final android.view.View getView() {
        return (android.view.View) androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt.currentValueOf(this, androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalView());
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(androidx.compose.ui.layout.LayoutCoordinates coordinates) {
        android.graphics.Rect calcBounds;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = androidx.compose.ui.layout.LayoutCoordinatesKt.boundsInRoot(coordinates);
            calcBounds = new android.graphics.Rect(kotlin.math.MathKt.roundToInt(boundsInRoot.getLeft()), kotlin.math.MathKt.roundToInt(boundsInRoot.getTop()), kotlin.math.MathKt.roundToInt(boundsInRoot.getRight()), kotlin.math.MathKt.roundToInt(boundsInRoot.getBottom()));
        } else {
            kotlin.jvm.functions.Function1<androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
            calcBounds = calcBounds(coordinates, rect.invoke(coordinates));
        }
        replaceRect(calcBounds);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    private final void replaceRect(android.graphics.Rect newRect) {
        androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> currentRects = currentRects();
        android.graphics.Rect rect = this.androidRect;
        if (rect != null) {
            currentRects.remove(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            currentRects.add(newRect);
        }
        updateRects(currentRects);
        this.androidRect = newRect;
    }

    private final android.graphics.Rect calcBounds(androidx.compose.ui.layout.LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        androidx.compose.ui.layout.LayoutCoordinates findRootCoordinates = androidx.compose.ui.layout.LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long mo3410localPositionOfR5De75A = findRootCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, rect.m1906getTopLeftF1C5BW0());
        long mo3410localPositionOfR5De75A2 = findRootCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, rect.m1907getTopRightF1C5BW0());
        long mo3410localPositionOfR5De75A3 = findRootCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, rect.m1899getBottomLeftF1C5BW0());
        long mo3410localPositionOfR5De75A4 = findRootCoordinates.mo3410localPositionOfR5De75A(layoutCoordinates, rect.m1900getBottomRightF1C5BW0());
        return new android.graphics.Rect(kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.minOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A2), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A3), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A4))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.minOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A2), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A3), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A4))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A2), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A3), androidx.compose.ui.geometry.Offset.m1871getXimpl(mo3410localPositionOfR5De75A4))), kotlin.math.MathKt.roundToInt(kotlin.comparisons.ComparisonsKt.maxOf(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A2), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A3), androidx.compose.ui.geometry.Offset.m1872getYimpl(mo3410localPositionOfR5De75A4))));
    }
}
