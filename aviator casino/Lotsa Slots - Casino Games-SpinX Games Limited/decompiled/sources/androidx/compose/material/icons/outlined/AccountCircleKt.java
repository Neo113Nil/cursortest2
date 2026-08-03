package androidx.compose.material.icons.outlined;

/* compiled from: AccountCircle.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountCircle", "Landroidx/compose/material/icons/Icons$Outlined;", "getAccountCircle", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountCircleKt {
    private static androidx.compose.ui.graphics.vector.ImageVector _accountCircle;

    public static final androidx.compose.ui.graphics.vector.ImageVector getAccountCircle(androidx.compose.material.icons.Icons.Outlined outlined) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outlined, "<this>");
        androidx.compose.ui.graphics.vector.ImageVector imageVector = _accountCircle;
        if (imageVector != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Outlined.AccountCircle", androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
        androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
        int m2474getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw();
        int m2484getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8();
        androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilder.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilder.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.07f, 18.28f);
        pathBuilder.curveToRelative(0.43f, -0.9f, 3.05f, -1.78f, 4.93f, -1.78f);
        pathBuilder.reflectiveCurveToRelative(4.51f, 0.88f, 4.93f, 1.78f);
        pathBuilder.curveTo(15.57f, 19.36f, 13.86f, 20.0f, 12.0f, 20.0f);
        pathBuilder.reflectiveCurveToRelative(-3.57f, -0.64f, -4.93f, -1.72f);
        pathBuilder.close();
        pathBuilder.moveTo(18.36f, 16.83f);
        pathBuilder.curveToRelative(-1.43f, -1.74f, -4.9f, -2.33f, -6.36f, -2.33f);
        pathBuilder.reflectiveCurveToRelative(-4.93f, 0.59f, -6.36f, 2.33f);
        pathBuilder.curveTo(4.62f, 15.49f, 4.0f, 13.82f, 4.0f, 12.0f);
        pathBuilder.curveToRelative(0.0f, -4.41f, 3.59f, -8.0f, 8.0f, -8.0f);
        pathBuilder.reflectiveCurveToRelative(8.0f, 3.59f, 8.0f, 8.0f);
        pathBuilder.curveToRelative(0.0f, 1.82f, -0.62f, 3.49f, -1.64f, 4.83f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(-1.94f, 0.0f, -3.5f, 1.56f, -3.5f, 3.5f);
        pathBuilder.reflectiveCurveTo(10.06f, 13.0f, 12.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(3.5f, -1.56f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveTo(13.94f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 11.0f);
        pathBuilder.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilder.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilder.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilder.close();
        androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2474getButtKaPHkGw, m2484getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountCircle = build;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
