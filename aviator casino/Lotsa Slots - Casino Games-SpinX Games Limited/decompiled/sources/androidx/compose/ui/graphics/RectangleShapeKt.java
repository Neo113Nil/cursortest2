package androidx.compose.ui.graphics;

/* compiled from: RectangleShape.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001c\u0010\u0000\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"RectangleShape", "Landroidx/compose/ui/graphics/Shape;", "getRectangleShape$annotations", "()V", "getRectangleShape", "()Landroidx/compose/ui/graphics/Shape;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RectangleShapeKt {
    private static final androidx.compose.ui.graphics.Shape RectangleShape = new androidx.compose.ui.graphics.Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public androidx.compose.ui.graphics.Outline.Rectangle mo262createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
            return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.ui.geometry.SizeKt.m1961toRectuvyYCjk(size));
        }

        public java.lang.String toString() {
            return "RectangleShape";
        }
    };

    public static /* synthetic */ void getRectangleShape$annotations() {
    }

    public static final androidx.compose.ui.graphics.Shape getRectangleShape() {
        return RectangleShape;
    }
}
