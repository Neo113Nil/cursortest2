package androidx.compose.material.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material/internal/Icons;", "", "<init>", "()V", "Filled"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Icons {
    public static final int $stable = 0;
    public static final androidx.compose.material.internal.Icons INSTANCE = new androidx.compose.material.internal.Icons();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/material/internal/Icons$Filled;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getArrowDropDown$material", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "ArrowDropDown", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/vector/ImageVector;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Filled {
        private static androidx.compose.ui.graphics.vector.ImageVector getHighResolutionOutputSizeshNQ4ISI;
        public static final androidx.compose.material.internal.Icons.Filled INSTANCE = new androidx.compose.material.internal.Icons.Filled();
        public static final int $stable = 8;

        private Filled() {
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getArrowDropDown$material() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighResolutionOutputSizeshNQ4ISI;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.ArrowDropDown", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(7.0f, 10.0f);
            pathBuilder.lineToRelative(5.0f, 5.0f);
            pathBuilder.lineToRelative(5.0f, -5.0f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            getHighResolutionOutputSizeshNQ4ISI = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }
    }

    private Icons() {
    }
}
