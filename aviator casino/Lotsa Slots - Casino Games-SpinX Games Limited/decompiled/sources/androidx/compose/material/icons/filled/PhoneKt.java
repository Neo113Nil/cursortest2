package androidx.compose.material.icons.filled;

/* compiled from: Phone.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_phone", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Phone", "Landroidx/compose/material/icons/Icons$Filled;", "getPhone", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PhoneKt {
    private static androidx.compose.ui.graphics.vector.ImageVector _phone;

    public static final androidx.compose.ui.graphics.vector.ImageVector getPhone(androidx.compose.material.icons.Icons.Filled filled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filled, "<this>");
        androidx.compose.ui.graphics.vector.ImageVector imageVector = _phone;
        if (imageVector != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.Phone", androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
        androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
        int m2474getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw();
        int m2484getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8();
        androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
        pathBuilder.moveTo(6.62f, 10.79f);
        pathBuilder.curveToRelative(1.44f, 2.83f, 3.76f, 5.14f, 6.59f, 6.59f);
        pathBuilder.lineToRelative(2.2f, -2.2f);
        pathBuilder.curveToRelative(0.27f, -0.27f, 0.67f, -0.36f, 1.02f, -0.24f);
        pathBuilder.curveToRelative(1.12f, 0.37f, 2.33f, 0.57f, 3.57f, 0.57f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.verticalLineTo(20.0f);
        pathBuilder.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        pathBuilder.curveToRelative(-9.39f, 0.0f, -17.0f, -7.61f, -17.0f, -17.0f);
        pathBuilder.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        pathBuilder.horizontalLineToRelative(3.5f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        pathBuilder.curveToRelative(0.0f, 1.25f, 0.2f, 2.45f, 0.57f, 3.57f);
        pathBuilder.curveToRelative(0.11f, 0.35f, 0.03f, 0.74f, -0.25f, 1.02f);
        pathBuilder.lineToRelative(-2.2f, 2.2f);
        pathBuilder.close();
        androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2474getButtKaPHkGw, m2484getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phone = build;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
