package androidx.compose.material.icons.twotone;

/* compiled from: Home.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_home", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Home", "Landroidx/compose/material/icons/Icons$TwoTone;", "getHome", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HomeKt {
    private static androidx.compose.ui.graphics.vector.ImageVector _home;

    public static final androidx.compose.ui.graphics.vector.ImageVector getHome(androidx.compose.material.icons.Icons.TwoTone twoTone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(twoTone, "<this>");
        androidx.compose.ui.graphics.vector.ImageVector imageVector = _home;
        if (imageVector != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("TwoTone.Home", androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
        androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
        int m2474getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw();
        int m2484getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8();
        androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
        pathBuilder.moveTo(12.0f, 3.0f);
        pathBuilder.lineTo(2.0f, 12.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.verticalLineToRelative(8.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.horizontalLineToRelative(6.0f);
        pathBuilder.verticalLineToRelative(-8.0f);
        pathBuilder.horizontalLineToRelative(3.0f);
        pathBuilder.lineTo(12.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 18.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-6.0f);
        pathBuilder.lineTo(9.0f, 12.0f);
        pathBuilder.verticalLineToRelative(6.0f);
        pathBuilder.lineTo(7.0f, 18.0f);
        pathBuilder.verticalLineToRelative(-7.81f);
        pathBuilder.lineToRelative(5.0f, -4.5f);
        pathBuilder.lineToRelative(5.0f, 4.5f);
        pathBuilder.lineTo(17.0f, 18.0f);
        pathBuilder.close();
        androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2474getButtKaPHkGw, m2484getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
        androidx.compose.ui.graphics.SolidColor solidColor2 = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
        int m2474getButtKaPHkGw2 = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw();
        int m2484getBevelLxFBmk82 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8();
        androidx.compose.ui.graphics.vector.PathBuilder pathBuilder2 = new androidx.compose.ui.graphics.vector.PathBuilder();
        pathBuilder2.moveTo(7.0f, 10.19f);
        pathBuilder2.verticalLineTo(18.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-6.0f);
        pathBuilder2.horizontalLineToRelative(6.0f);
        pathBuilder2.verticalLineToRelative(6.0f);
        pathBuilder2.horizontalLineToRelative(2.0f);
        pathBuilder2.verticalLineToRelative(-7.81f);
        pathBuilder2.lineToRelative(-5.0f, -4.5f);
        pathBuilder2.close();
        androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m2474getButtKaPHkGw2, m2484getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _home = build;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
