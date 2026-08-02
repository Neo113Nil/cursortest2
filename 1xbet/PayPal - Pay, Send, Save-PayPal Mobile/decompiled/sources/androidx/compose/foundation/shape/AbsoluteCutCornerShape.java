package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0015\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "Landroidx/compose/foundation/shape/CornerBasedShape;", "Landroidx/compose/foundation/shape/CornerSize;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)V", "Landroidx/compose/ui/geometry/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "", "topStart", "topEnd", "bottomEnd", "bottomStart", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/Outline;", "createOutline-LjSzlW0", "(JFFFFLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/Outline;", "createOutline", "copy", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/AbsoluteCutCornerShape;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "t", "lerp", "(Ljava/lang/Object;F)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbsoluteCutCornerShape extends androidx.compose.foundation.shape.CornerBasedShape {
    public static final int $stable = 0;

    public AbsoluteCutCornerShape(androidx.compose.foundation.shape.CornerSize cornerSize, androidx.compose.foundation.shape.CornerSize cornerSize2, androidx.compose.foundation.shape.CornerSize cornerSize3, androidx.compose.foundation.shape.CornerSize cornerSize4) {
        super(cornerSize, cornerSize2, cornerSize3, cornerSize4);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    /* renamed from: createOutline-LjSzlW0, reason: not valid java name */
    public final androidx.compose.ui.graphics.Outline mo1959createOutlineLjSzlW0(long size, float topStart, float topEnd, float bottomEnd, float bottomStart, androidx.compose.ui.unit.LayoutDirection layoutDirection) {
        if (topStart + topEnd + bottomStart + bottomEnd == 0.0f) {
            return new androidx.compose.ui.graphics.Outline.Rectangle(androidx.compose.ui.geometry.SizeKt.m5842toRectuvyYCjk(size));
        }
        androidx.compose.ui.graphics.Path Path = androidx.compose.ui.graphics.AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, topStart);
        Path.lineTo(topStart, 0.0f);
        int i = (int) (size >> 32);
        Path.lineTo(java.lang.Float.intBitsToFloat(i) - topEnd, 0.0f);
        Path.lineTo(java.lang.Float.intBitsToFloat(i), topEnd);
        int i2 = (int) (size & 4294967295L);
        Path.lineTo(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2) - bottomEnd);
        Path.lineTo(java.lang.Float.intBitsToFloat(i) - bottomEnd, java.lang.Float.intBitsToFloat(i2));
        Path.lineTo(bottomStart, java.lang.Float.intBitsToFloat(i2));
        Path.lineTo(0.0f, java.lang.Float.intBitsToFloat(i2) - bottomStart);
        Path.close();
        return new androidx.compose.ui.graphics.Outline.Generic(Path);
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape
    public final androidx.compose.foundation.shape.AbsoluteCutCornerShape copy(androidx.compose.foundation.shape.CornerSize topStart, androidx.compose.foundation.shape.CornerSize topEnd, androidx.compose.foundation.shape.CornerSize bottomEnd, androidx.compose.foundation.shape.CornerSize bottomStart) {
        return new androidx.compose.foundation.shape.AbsoluteCutCornerShape(topStart, topEnd, bottomEnd, bottomStart);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AbsoluteCutCornerShape(topLeft = ");
        sb.append(getTopStart());
        sb.append(", topRight = ");
        sb.append(getTopEnd());
        sb.append(", bottomRight = ");
        sb.append(getBottomEnd());
        sb.append(", bottomLeft = ");
        sb.append(getBottomStart());
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.shape.AbsoluteCutCornerShape)) {
            return false;
        }
        androidx.compose.foundation.shape.AbsoluteCutCornerShape absoluteCutCornerShape = (androidx.compose.foundation.shape.AbsoluteCutCornerShape) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(getTopStart(), absoluteCutCornerShape.getTopStart()) && kotlin.jvm.internal.Intrinsics.areEqual(getTopEnd(), absoluteCutCornerShape.getTopEnd()) && kotlin.jvm.internal.Intrinsics.areEqual(getBottomEnd(), absoluteCutCornerShape.getBottomEnd()) && kotlin.jvm.internal.Intrinsics.areEqual(getBottomStart(), absoluteCutCornerShape.getBottomStart());
    }

    public final int hashCode() {
        int hashCode = getTopStart().hashCode();
        return (((((hashCode * 31) + getTopEnd().hashCode()) * 31) + getBottomEnd().hashCode()) * 31) + getBottomStart().hashCode();
    }

    @Override // androidx.compose.foundation.shape.CornerBasedShape, androidx.compose.ui.graphics.Interpolatable
    public final java.lang.Object lerp(java.lang.Object other, float t) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(other, androidx.compose.ui.graphics.RectangleShapeKt.getRectangleShape()) || other == null) {
            other = androidx.compose.foundation.shape.AbsoluteCutCornerShapeKt.AbsoluteCutCornerShape(0.0f);
        }
        if (other instanceof androidx.compose.foundation.shape.AbsoluteCutCornerShape) {
            return androidx.compose.foundation.shape.AbsoluteCutCornerShapeKt.lerp(this, (androidx.compose.foundation.shape.AbsoluteCutCornerShape) other, t);
        }
        return null;
    }
}
