package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001d\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\u0012\n\u0004\b\u0001\u0010\u0002\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Shape;", "RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectangleShapeKt {
    private static final androidx.compose.ui.graphics.Shape RectangleShape = new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public final androidx.compose.ui.graphics.Outline.Rectangle mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
            return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(size));
        }

        public final java.lang.String toString() {
            return "RectangleShape";
        }
    };

    public static /* synthetic */ void getRectangleShape$annotations() {
    }

    public static final androidx.compose.ui.graphics.Shape getRectangleShape() {
        return RectangleShape;
    }
}
