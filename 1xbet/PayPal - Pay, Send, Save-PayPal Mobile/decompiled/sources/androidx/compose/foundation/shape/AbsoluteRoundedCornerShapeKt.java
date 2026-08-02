package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u000e\u001a\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u0011\u001a5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017\u001a5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0017\u001a5\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\t\u0010\u001c"}, d2 = {"Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "a", util.h.xy.cb.b.f1091, "", "t", "lerp", "(Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;F)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerSize;", "corner", "AbsoluteRoundedCornerShape", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", io.ktor.http.ContentDisposition.Parameters.Size, "AbsoluteRoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "", "percent", "(I)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "topLeft", "topRight", "bottomRight", "bottomLeft", "AbsoluteRoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;", "topLeftPercent", "topRightPercent", "bottomRightPercent", "bottomLeftPercent", "(IIII)Landroidx/compose/foundation/shape/AbsoluteRoundedCornerShape;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AbsoluteRoundedCornerShapeKt {
    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape lerp(androidx.compose.foundation.shape.AbsoluteRoundedCornerShape absoluteRoundedCornerShape, androidx.compose.foundation.shape.AbsoluteRoundedCornerShape absoluteRoundedCornerShape2, float f) {
        return new androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopStart(), absoluteRoundedCornerShape2.getTopStart(), f), androidx.compose.foundation.shape.RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getTopEnd(), absoluteRoundedCornerShape2.getTopEnd(), f), androidx.compose.foundation.shape.RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomEnd(), absoluteRoundedCornerShape2.getBottomEnd(), f), androidx.compose.foundation.shape.RoundedCornerShapeKt.lerp(absoluteRoundedCornerShape.getBottomStart(), absoluteRoundedCornerShape2.getBottomStart(), f));
    }

    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSize cornerSize) {
        return new androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    /* renamed from: AbsoluteRoundedCornerShape-0680j_4, reason: not valid java name */
    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape m1963AbsoluteRoundedCornerShape0680j_4(float f) {
        return AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f));
    }

    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f) {
        return AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f));
    }

    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i) {
        return AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape m1964AbsoluteRoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f2), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f3), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f4));
    }

    public static /* synthetic */ androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        return AbsoluteRoundedCornerShape(f, f2, f3, f4);
    }

    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f2), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f3), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = 0;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        return AbsoluteRoundedCornerShape(i, i2, i3, i4);
    }

    public static final androidx.compose.foundation.shape.AbsoluteRoundedCornerShape AbsoluteRoundedCornerShape(int i, int i2, int i3, int i4) {
        return new androidx.compose.foundation.shape.AbsoluteRoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i2), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i3), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i4));
    }

    /* renamed from: AbsoluteRoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.shape.AbsoluteRoundedCornerShape m1965AbsoluteRoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f3 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        if ((i & 8) != 0) {
            f4 = androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f);
        }
        return m1964AbsoluteRoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }
}
