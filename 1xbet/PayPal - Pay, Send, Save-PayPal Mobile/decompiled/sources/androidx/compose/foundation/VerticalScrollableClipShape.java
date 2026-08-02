package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/foundation/VerticalScrollableClipShape;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class VerticalScrollableClipShape implements androidx.compose.ui.graphics.Shape {
    public static final androidx.compose.foundation.VerticalScrollableClipShape INSTANCE = new androidx.compose.foundation.VerticalScrollableClipShape();

    private VerticalScrollableClipShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long p0, androidx.compose.ui.unit.LayoutDirection p1, androidx.compose.ui.unit.Density p2) {
        float mo1412roundToPx0680j_4 = p2.mo1412roundToPx0680j_4(androidx.compose.foundation.ClipScrollableContainerKt.getMaxSupportedElevation());
        return new androidx.compose.ui.graphics.Outline.Rectangle(new androidx.compose.ui.geometry.Rect(-mo1412roundToPx0680j_4, 0.0f, java.lang.Float.intBitsToFloat((int) (p0 >> 32)) + mo1412roundToPx0680j_4, java.lang.Float.intBitsToFloat((int) (p0 & 4294967295L))));
    }
}
