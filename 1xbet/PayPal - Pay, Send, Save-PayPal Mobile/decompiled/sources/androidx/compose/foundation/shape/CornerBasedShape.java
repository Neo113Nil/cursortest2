package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H&¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001c\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001b\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003¢\u0006\u0004\b\u0017\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b#\u0010\"R\u001a\u0010\u0006\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b%\u0010\""}, d2 = {"Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/ui/graphics/Shape;", "Landroidx/compose/ui/graphics/Interpolatable;", "Landroidx/compose/foundation/shape/CornerSize;", "topStart", "topEnd", "bottomEnd", "bottomStart", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/graphics/Outline;", "createOutline-Pq9zytI", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "copy", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "", "other", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;", "all", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/foundation/shape/CornerSize;", "getTopStart", "()Landroidx/compose/foundation/shape/CornerSize;", "getTopEnd", "getBottomEnd", "getBottomStart"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class CornerBasedShape implements androidx.compose.ui.graphics.Shape, androidx.compose.ui.graphics.Interpolatable {
    public static final int $stable = 0;
    private final androidx.compose.foundation.shape.CornerSize bottomEnd;
    private final androidx.compose.foundation.shape.CornerSize bottomStart;
    private final androidx.compose.foundation.shape.CornerSize topEnd;
    private final androidx.compose.foundation.shape.CornerSize topStart;

    public abstract androidx.compose.foundation.shape.CornerBasedShape copy(androidx.compose.foundation.shape.CornerSize topStart, androidx.compose.foundation.shape.CornerSize topEnd, androidx.compose.foundation.shape.CornerSize bottomEnd, androidx.compose.foundation.shape.CornerSize bottomStart);

    /* renamed from: createOutline-LjSzlW0 */
    public abstract androidx.compose.ui.graphics.Outline mo1959createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, androidx.compose.ui.unit.LayoutDirection layoutDirection);

    public java.lang.Object lerp(java.lang.Object other, float t) {
        return null;
    }

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
    public final androidx.compose.ui.graphics.Outline mo1334createOutlinePq9zytI(long size, androidx.compose.ui.unit.LayoutDirection layoutDirection, androidx.compose.ui.unit.Density density) {
        float mo1966toPxTmRCtEA = this.topStart.mo1966toPxTmRCtEA(size, density);
        float mo1966toPxTmRCtEA2 = this.topEnd.mo1966toPxTmRCtEA(size, density);
        float mo1966toPxTmRCtEA3 = this.bottomEnd.mo1966toPxTmRCtEA(size, density);
        float mo1966toPxTmRCtEA4 = this.bottomStart.mo1966toPxTmRCtEA(size, density);
        float m5820getMinDimensionimpl = androidx.compose.ui.geometry.Size.m5820getMinDimensionimpl(size);
        float f = mo1966toPxTmRCtEA + mo1966toPxTmRCtEA4;
        if (f > m5820getMinDimensionimpl) {
            float f2 = m5820getMinDimensionimpl / f;
            mo1966toPxTmRCtEA *= f2;
            mo1966toPxTmRCtEA4 *= f2;
        }
        float f3 = mo1966toPxTmRCtEA4;
        float f4 = mo1966toPxTmRCtEA2 + mo1966toPxTmRCtEA3;
        if (f4 > m5820getMinDimensionimpl) {
            float f5 = m5820getMinDimensionimpl / f4;
            mo1966toPxTmRCtEA2 *= f5;
            mo1966toPxTmRCtEA3 *= f5;
        }
        if (mo1966toPxTmRCtEA < 0.0f || mo1966toPxTmRCtEA2 < 0.0f || mo1966toPxTmRCtEA3 < 0.0f || f3 < 0.0f) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Corner size in Px can't be negative(topStart = ");
            sb.append(mo1966toPxTmRCtEA);
            sb.append(", topEnd = ");
            sb.append(mo1966toPxTmRCtEA2);
            sb.append(", bottomEnd = ");
            sb.append(mo1966toPxTmRCtEA3);
            sb.append(", bottomStart = ");
            sb.append(f3);
            sb.append(")!");
            androidx.compose.foundation.internal.InlineClassHelperKt.throwIllegalArgumentException(sb.toString());
        }
        return mo1959createOutlineLjSzlW0(size, mo1966toPxTmRCtEA, mo1966toPxTmRCtEA2, mo1966toPxTmRCtEA3, f3, layoutDirection);
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
