package androidx.compose.foundation.shape;

/* compiled from: CornerBasedShape.kt */
@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J0\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H&J(\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JB\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "getBottomEnd", "()Landroidx/compose/foundation/shape/CornerSize;", "getBottomStart", "getTopEnd", "getTopStart", "copy", "all", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements androidx.compose.ui.graphics.Shape {
    public static final int $stable = 0;
    private final androidx.compose.foundation.shape.CornerSize bottomEnd;
    private final androidx.compose.foundation.shape.CornerSize bottomStart;
    private final androidx.compose.foundation.shape.CornerSize topEnd;
    private final androidx.compose.foundation.shape.CornerSize topStart;

    public abstract androidx.compose.foundation.shape.CornerBasedShape copy(androidx.compose.foundation.shape.CornerSize topStart, androidx.compose.foundation.shape.CornerSize topEnd, androidx.compose.foundation.shape.CornerSize bottomEnd, androidx.compose.foundation.shape.CornerSize bottomStart);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract androidx.compose.ui.graphics.Outline mo829createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, androidx.compose.ui.unit.LayoutDirection layoutDirection);

    public CornerBasedShape(androidx.compose.foundation.shape.CornerSize cornerSize, androidx.compose.foundation.shape.CornerSize cornerSize2, androidx.compose.foundation.shape.CornerSize cornerSize3, androidx.compose.foundation.shape.CornerSize cornerSize4) {
        this.topStart = cornerSize;
        this.topEnd = cornerSize2;
        this.bottomEnd = cornerSize3;
        this.bottomStart = cornerSize4;
    }

    public final androidx.compose.foundation.shape.CornerSize getTopStart() {
        return this.topStart;
    }

    public final androidx.compose.foundation.shape.CornerSize getTopEnd() {
        return this.topEnd;
    }

    public final androidx.compose.foundation.shape.CornerSize getBottomEnd() {
        return this.bottomEnd;
    }

    public final androidx.compose.foundation.shape.CornerSize getBottomStart() {
        return this.bottomStart;
    }

    @Override // androidx.compose.ui.graphics.Shape
    /* renamed from: createOutline-Pq9zytI */
    public final androidx.compose.ui.graphics.Outline mo262createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        float mo837toPxTmRCtEA = this.topStart.mo837toPxTmRCtEA(size, density);
        float mo837toPxTmRCtEA2 = this.topEnd.mo837toPxTmRCtEA(size, density);
        float mo837toPxTmRCtEA3 = this.bottomEnd.mo837toPxTmRCtEA(size, density);
        float mo837toPxTmRCtEA4 = this.bottomStart.mo837toPxTmRCtEA(size, density);
        float m1939getMinDimensionimpl = androidx.compose.ui.geometry.Size.m1939getMinDimensionimpl(size);
        float f = mo837toPxTmRCtEA + mo837toPxTmRCtEA4;
        if (f > m1939getMinDimensionimpl) {
            float f2 = m1939getMinDimensionimpl / f;
            mo837toPxTmRCtEA *= f2;
            mo837toPxTmRCtEA4 *= f2;
        }
        float f3 = mo837toPxTmRCtEA4;
        float f4 = mo837toPxTmRCtEA2 + mo837toPxTmRCtEA3;
        if (f4 > m1939getMinDimensionimpl) {
            float f5 = m1939getMinDimensionimpl / f4;
            mo837toPxTmRCtEA2 *= f5;
            mo837toPxTmRCtEA3 *= f5;
        }
        if (mo837toPxTmRCtEA < 0.0f || mo837toPxTmRCtEA2 < 0.0f || mo837toPxTmRCtEA3 < 0.0f || f3 < 0.0f) {
            throw new java.lang.IllegalArgumentException(("Corner size in Px can't be negative(topStart = " + mo837toPxTmRCtEA + ", topEnd = " + mo837toPxTmRCtEA2 + ", bottomEnd = " + mo837toPxTmRCtEA3 + ", bottomStart = " + f3 + ")!").toString());
        }
        return mo829createOutlineLjSzlW0(size, mo837toPxTmRCtEA, mo837toPxTmRCtEA2, mo837toPxTmRCtEA3, f3, layoutDirection);
    }

    public static /* synthetic */ androidx.compose.foundation.shape.CornerBasedShape copy$default(androidx.compose.foundation.shape.CornerBasedShape cornerBasedShape, androidx.compose.foundation.shape.CornerSize cornerSize, androidx.compose.foundation.shape.CornerSize cornerSize2, androidx.compose.foundation.shape.CornerSize cornerSize3, androidx.compose.foundation.shape.CornerSize cornerSize4, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i & 1) != 0) {
            cornerSize = cornerBasedShape.topStart;
        }
        if ((i & 2) != 0) {
            cornerSize2 = cornerBasedShape.topEnd;
        }
        if ((i & 4) != 0) {
            cornerSize3 = cornerBasedShape.bottomEnd;
        }
        if ((i & 8) != 0) {
            cornerSize4 = cornerBasedShape.bottomStart;
        }
        return cornerBasedShape.copy(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    public final androidx.compose.foundation.shape.CornerBasedShape copy(androidx.compose.foundation.shape.CornerSize all) {
        return copy(all, all, all, all);
    }
}
