package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/foundation/ExcludeFromSystemGestureNode;", "Landroidx/compose/foundation/RectListNode;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "p0", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroid/graphics/Rect;", "currentRects", "()Landroidx/compose/runtime/collection/MutableVector;", "", "updateRects", "(Landroidx/compose/runtime/collection/MutableVector;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ExcludeFromSystemGestureNode extends androidx.compose.foundation.RectListNode {
    public ExcludeFromSystemGestureNode(kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.LayoutCoordinates, androidx.compose.ui.geometry.Rect> function1) {
        super(function1);
    }

    @Override // androidx.compose.foundation.RectListNode
    public final void updateRects(androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> p0) {
        getView().setSystemGestureExclusionRects(p0.asMutableList());
    }

    @Override // androidx.compose.foundation.RectListNode
    public final androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> currentRects() {
        androidx.compose.runtime.collection.MutableVector<android.graphics.Rect> mutableVector = new androidx.compose.runtime.collection.MutableVector<>(new android.graphics.Rect[16], 0);
        mutableVector.addAll(mutableVector.getSize(), (java.util.List<? extends android.graphics.Rect>) getView().getSystemGestureExclusionRects());
        return mutableVector;
    }
}
