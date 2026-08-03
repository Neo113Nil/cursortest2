package androidx.compose.material.icons.filled;

/* compiled from: AddCircle.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_addCircle", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AddCircle", "Landroidx/compose/material/icons/Icons$Filled;", "getAddCircle", "(Landroidx/compose/material/icons/Icons$Filled;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddCircleKt {
    private static androidx.compose.ui.graphics.vector.ImageVector _addCircle;

    public static final androidx.compose.ui.graphics.vector.ImageVector getAddCircle(androidx.compose.material.icons.Icons.Filled filled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filled, "<this>");
        androidx.compose.ui.graphics.vector.ImageVector imageVector = _addCircle;
        if (imageVector != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.AddCircle", androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
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
        pathBuilder.moveTo(17.0f, 13.0f);
        pathBuilder.horizontalLineToRelative(-4.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(-4.0f);
        pathBuilder.lineTo(7.0f, 13.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.lineTo(11.0f, 7.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(4.0f);
        pathBuilder.horizontalLineToRelative(4.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.close();
        androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2474getButtKaPHkGw, m2484getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addCircle = build;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
