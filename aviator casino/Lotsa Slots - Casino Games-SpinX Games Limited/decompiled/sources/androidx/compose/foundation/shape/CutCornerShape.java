package androidx.compose.foundation.shape;

/* compiled from: CutCornerShape.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J(\u0010\b\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0016JB\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroidx/compose/foundation/shape/CutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "topStart", "Landroidx/compose/foundation/shape/CornerSize;", "topEnd", "bottomEnd", "bottomStart", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "copy", "createOutline", "Landroidx/compose/ui/graphics/Outline;", "size", "Landroidx/compose/ui/geometry/Size;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "equals", "", "other", "", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CutCornerShape extends androidx.compose.foundation.shape.CornerBasedShape {
    public static final int $stable = 0;

    public CutCornerShape(androidx.compose.foundation.shape.CornerSize cornerSize, androidx.compose.foundation.shape.CornerSize cornerSize2, androidx.compose.foundation.shape.CornerSize cornerSize3, androidx.compose.foundation.shape.CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0 */
    public androidx.compose.ui.graphics.Outline mo829createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (topStart + topEnd + bottomStart + bottomEnd == 0.0f) {
            return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.ui.geometry.SizeKt.m1961toRectuvyYCjk(size));
        }
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        float f = layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? topStart : topEnd;
        Path.moveTo(0.0f, f);
        Path.lineTo(f, 0.0f);
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            topStart = topEnd;
        }
        Path.lineTo(androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) - topStart, 0.0f);
        Path.lineTo(androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), topStart);
        float f2 = layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr ? bottomEnd : bottomStart;
        Path.lineTo(androidx.compose.ui.geometry.Size.m1940getWidthimpl(size), androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) - f2);
        Path.lineTo(androidx.compose.ui.geometry.Size.m1940getWidthimpl(size) - f2, androidx.compose.ui.geometry.Size.m1937getHeightimpl(size));
        if (layoutDirection == androidx.compose.ui.unit.LayoutDirection.Ltr) {
            bottomEnd = bottomStart;
        }
        Path.lineTo(bottomEnd, androidx.compose.ui.geometry.Size.m1937getHeightimpl(size));
        Path.lineTo(0.0f, androidx.compose.ui.geometry.Size.m1937getHeightimpl(size) - bottomEnd);
        Path.close();
        return new androidx.compose.ui.graphics.Outline.Generic(Path);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public androidx.compose.foundation.shape.CutCornerShape copy(androidx.compose.foundation.shape.CornerSize topStart, androidx.compose.foundation.shape.CornerSize topEnd, androidx.compose.foundation.shape.CornerSize bottomEnd, androidx.compose.foundation.shape.CornerSize bottomStart) {
        return new androidx.compose.foundation.shape.CutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public java.lang.String toString() {
        return "CutCornerShape(topStart = " + getTopStart() + ", topEnd = " + getTopEnd() + ", bottomEnd = " + getBottomEnd() + ", bottomStart = " + getBottomStart() + ')';
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.shape.CutCornerShape)) {
            return false;
        }
        androidx.compose.foundation.shape.CutCornerShape cutCornerShape = (androidx.compose.foundation.shape.CutCornerShape) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getTopStart(), cutCornerShape.getTopStart()) && kotlin.jvm.internal.Intrinsics.areEqual(getTopEnd(), cutCornerShape.getTopEnd()) && kotlin.jvm.internal.Intrinsics.areEqual(getBottomEnd(), cutCornerShape.getBottomEnd()) && kotlin.jvm.internal.Intrinsics.areEqual(getBottomStart(), cutCornerShape.getBottomStart());
    }

    public int hashCode() {
        return (((((getTopStart().hashCode() * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }
}
