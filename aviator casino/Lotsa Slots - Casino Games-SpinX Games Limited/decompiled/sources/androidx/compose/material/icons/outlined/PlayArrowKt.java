package androidx.compose.material.icons.outlined;

/* compiled from: PlayArrow.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_playArrow", "Landroidx/compose/ui/graphics/vector/ImageVector;", "PlayArrow", "Landroidx/compose/material/icons/Icons$Outlined;", "getPlayArrow", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlayArrowKt {
    private static androidx.compose.ui.graphics.vector.ImageVector _playArrow;

    public static final androidx.compose.ui.graphics.vector.ImageVector getPlayArrow(androidx.compose.material.icons.Icons.Outlined outlined) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outlined, "<this>");
        androidx.compose.ui.graphics.vector.ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Outlined.PlayArrow", androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m4478constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, 96, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
        androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU(), null);
        int m2474getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m2474getButtKaPHkGw();
        int m2484getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m2484getBevelLxFBmk8();
        androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
        pathBuilder.moveTo(10.0f, 8.64f);
        pathBuilder.lineTo(15.27f, 12.0f);
        pathBuilder.lineTo(10.0f, 15.36f);
        pathBuilder.verticalLineTo(8.64f);
        pathBuilder.moveTo(8.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.lineToRelative(11.0f, -7.0f);
        pathBuilder.lineTo(8.0f, 5.0f);
        pathBuilder.close();
        androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m2759addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2474getButtKaPHkGw, m2484getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = build;
        kotlin.jvm.internal.Intrinsics.checkNotNull(build);
        return build;
    }
}
