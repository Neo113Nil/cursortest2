package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011"}, d2 = {"Landroidx/compose/material3/DragHandleShapes;", "", "Landroidx/compose/ui/graphics/Shape;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "pressedShape", "draggedShape", "<init>", "(Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/ui/graphics/Shape;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/ui/graphics/Shape;", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "getPressedShape", "getDraggedShape"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DragHandleShapes {
    public static final int $stable = 0;
    private final androidx.compose.ui.graphics.Shape draggedShape;
    private final androidx.compose.ui.graphics.Shape pressedShape;
    private final androidx.compose.ui.graphics.Shape shape;

    public DragHandleShapes(androidx.compose.ui.graphics.Shape shape, androidx.compose.ui.graphics.Shape shape2, androidx.compose.ui.graphics.Shape shape3) {
        this.shape = shape;
        this.pressedShape = shape2;
        this.draggedShape = shape3;
    }

    public final androidx.compose.ui.graphics.Shape getDraggedShape() {
        return this.draggedShape;
    }

    public final androidx.compose.ui.graphics.Shape getPressedShape() {
        return this.pressedShape;
    }

    public final androidx.compose.ui.graphics.Shape getShape() {
        return this.shape;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof androidx.compose.material3.DragHandleShapes)) {
            return false;
        }
        androidx.compose.material3.DragHandleShapes dragHandleShapes = (androidx.compose.material3.DragHandleShapes) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.shape, dragHandleShapes.shape) && kotlin.jvm.internal.Intrinsics.areEqual(this.pressedShape, dragHandleShapes.pressedShape) && kotlin.jvm.internal.Intrinsics.areEqual(this.draggedShape, dragHandleShapes.draggedShape);
    }

    public final int hashCode() {
        return (((this.shape.hashCode() * 31) + this.pressedShape.hashCode()) * 31) + this.draggedShape.hashCode();
    }
}
