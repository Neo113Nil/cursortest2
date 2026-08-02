package androidx.compose.foundation.shape;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0005\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000f\u001a\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0012\u001a5\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u0018\u001a5\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u001d\"\u0017\u0010\u001e\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/foundation/shape/RoundedCornerShape;", "a", util.h.xy.cb.b.f1091, "", "t", "lerp", "(Landroidx/compose/foundation/shape/RoundedCornerShape;Landroidx/compose/foundation/shape/RoundedCornerShape;F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/foundation/shape/CornerSize;", "(Landroidx/compose/foundation/shape/CornerSize;Landroidx/compose/foundation/shape/CornerSize;F)Landroidx/compose/foundation/shape/CornerSize;", "corner", "RoundedCornerShape", "(Landroidx/compose/foundation/shape/CornerSize;)Landroidx/compose/foundation/shape/RoundedCornerShape;", "Landroidx/compose/ui/unit/Dp;", io.ktor.http.ContentDisposition.Parameters.Size, "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "(I)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "(IIII)Landroidx/compose/foundation/shape/RoundedCornerShape;", "CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {
    private static final androidx.compose.foundation.shape.RoundedCornerShape CircleShape = RoundedCornerShape(50);

    public static final androidx.compose.foundation.shape.RoundedCornerShape lerp(androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape, androidx.compose.foundation.shape.RoundedCornerShape roundedCornerShape2, float f) {
        return new androidx.compose.foundation.shape.RoundedCornerShape(lerp(roundedCornerShape.getTopStart(), roundedCornerShape2.getTopStart(), f), lerp(roundedCornerShape.getTopEnd(), roundedCornerShape2.getTopEnd(), f), lerp(roundedCornerShape.getBottomEnd(), roundedCornerShape2.getBottomEnd(), f), lerp(roundedCornerShape.getBottomStart(), roundedCornerShape2.getBottomStart(), f));
    }

    public static final androidx.compose.foundation.shape.CornerSize lerp(final androidx.compose.foundation.shape.CornerSize cornerSize, final androidx.compose.foundation.shape.CornerSize cornerSize2, final float f) {
        return new androidx.compose.foundation.shape.CornerSize() { // from class: androidx.compose.foundation.shape.RoundedCornerShapeKt$lerp$1
            @Override // androidx.compose.foundation.shape.CornerSize
            /* renamed from: toPx-TmRCtEA */
            public final float mo1966toPxTmRCtEA(long shapeSize, androidx.compose.ui.unit.Density density) {
                return androidx.compose.ui.util.MathHelpersKt.lerp(androidx.compose.foundation.shape.CornerSize.this.mo1966toPxTmRCtEA(shapeSize, density), cornerSize2.mo1966toPxTmRCtEA(shapeSize, density), f);
            }
        };
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape(androidx.compose.foundation.shape.CornerSize cornerSize) {
        return new androidx.compose.foundation.shape.RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final androidx.compose.foundation.shape.RoundedCornerShape m1971RoundedCornerShape0680j_4(float f) {
        return RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f));
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape(float f) {
        return RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f));
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape(int i) {
        return RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final androidx.compose.foundation.shape.RoundedCornerShape m1972RoundedCornerShapea9UjIt4(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.shape.RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f2), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f3), androidx.compose.foundation.shape.CornerSizeKt.m1967CornerSize0680j_4(f4));
    }

    public static /* synthetic */ androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
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
        return RoundedCornerShape(f, f2, f3, f4);
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape(float f, float f2, float f3, float f4) {
        return new androidx.compose.foundation.shape.RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f2), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f3), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(f4));
    }

    public static /* synthetic */ androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape$default(int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
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
        return RoundedCornerShape(i, i2, i3, i4);
    }

    public static final androidx.compose.foundation.shape.RoundedCornerShape RoundedCornerShape(int i, int i2, int i3, int i4) {
        return new androidx.compose.foundation.shape.RoundedCornerShape(androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i2), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i3), androidx.compose.foundation.shape.CornerSizeKt.CornerSize(i4));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.foundation.shape.RoundedCornerShape m1973RoundedCornerShapea9UjIt4$default(float f, float f2, float f3, float f4, int i, java.lang.Object obj) {
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
        return m1972RoundedCornerShapea9UjIt4(f, f2, f3, f4);
    }
}
