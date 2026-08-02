package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/CircleShape;", "Landroidx/compose/ui/graphics/Shape;", "<init>", "()V", "Landroidx/compose/ui/geometry/Size;", "p0", "Landroidx/compose/ui/unit/LayoutDirection;", "p1", "Landroidx/compose/ui/unit/Density;", "p2", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CircleShape implements androidx.compose.ui.graphics.Shape {
    public static final androidx.compose.ui.text.CircleShape INSTANCE = new androidx.compose.ui.text.CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long p0, androidx.compose.ui.unit.LayoutDirection p1, androidx.compose.ui.unit.Density p2) {
        float m5820getMinDimensionimpl = androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(p0) / 2.0f;
        long m5706constructorimpl = androidx.compose.ui.geometry.CornerRadius.m5706constructorimpl((java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) & 4294967295L) | (java.lang.Float.floatToRawIntBits(m5820getMinDimensionimpl) << 32));
        return new androidx.compose.ui.graphics.Outline.Rounded(androidx.compose.ui.geometry.RoundRectKt.m5804RoundRectZAM2FJo(androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(p0), m5706constructorimpl, m5706constructorimpl, m5706constructorimpl, m5706constructorimpl));
    }
}
