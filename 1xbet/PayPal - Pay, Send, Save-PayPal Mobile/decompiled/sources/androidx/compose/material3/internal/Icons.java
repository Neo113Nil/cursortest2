package androidx.compose.material3.internal;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/Icons;", "", "<init>", "()V", "AutoMirrored", "Filled", "Outlined"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Icons {
    public static final int $stable = 0;
    public static final androidx.compose.material3.internal.Icons INSTANCE = new androidx.compose.material3.internal.Icons();

    private Icons() {
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/material3/internal/Icons$AutoMirrored;", "", "<init>", "()V", "Filled"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AutoMirrored {
        public static final int $stable = 0;
        public static final androidx.compose.material3.internal.Icons.AutoMirrored INSTANCE = new androidx.compose.material3.internal.Icons.AutoMirrored();

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/Icons$AutoMirrored$Filled;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getKeyboardArrowLeft$material3", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowLeft", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getHighSpeedVideoFpsRangesFor", "getKeyboardArrowRight$material3", "KeyboardArrowRight", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Filled {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private static androidx.compose.ui.graphics.vector.ImageVector getHighSpeedVideoFpsRangesFor;
            private static androidx.compose.ui.graphics.vector.ImageVector getHighSpeedVideoSizes;
            public static final androidx.compose.material3.internal.Icons.AutoMirrored.Filled INSTANCE = new androidx.compose.material3.internal.Icons.AutoMirrored.Filled();
            public static final int $stable = 8;

            private Filled() {
            }

            public final androidx.compose.ui.graphics.vector.ImageVector getKeyboardArrowLeft$material3() {
                androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighSpeedVideoFpsRangesFor;
                if (imageVector != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                    return imageVector;
                }
                androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowLeft", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
                androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
                int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
                int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
                androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
                pathBuilder.moveTo(15.41f, 16.59f);
                pathBuilder.lineTo(10.83f, 12.0f);
                pathBuilder.lineToRelative(4.58f, -4.59f);
                pathBuilder.lineTo(14.0f, 6.0f);
                pathBuilder.lineToRelative(-6.0f, 6.0f);
                pathBuilder.lineToRelative(6.0f, 6.0f);
                pathBuilder.lineToRelative(1.41f, -1.41f);
                pathBuilder.close();
                androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
                getHighSpeedVideoFpsRangesFor = build;
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                return build;
            }

            public final androidx.compose.ui.graphics.vector.ImageVector getKeyboardArrowRight$material3() {
                androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighSpeedVideoSizes;
                if (imageVector != null) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                    return imageVector;
                }
                androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("AutoMirrored.Filled.KeyboardArrowRight", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
                int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
                androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
                int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
                int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
                androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
                pathBuilder.moveTo(8.59f, 16.59f);
                pathBuilder.lineTo(13.17f, 12.0f);
                pathBuilder.lineTo(8.59f, 7.41f);
                pathBuilder.lineTo(10.0f, 6.0f);
                pathBuilder.lineToRelative(6.0f, 6.0f);
                pathBuilder.lineToRelative(-6.0f, 6.0f);
                pathBuilder.lineToRelative(-1.41f, -1.41f);
                pathBuilder.close();
                androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
                getHighSpeedVideoSizes = build;
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                return build;
            }
        }

        private AutoMirrored() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00048AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/Icons$Filled;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getClose$material3", "()Landroidx/compose/ui/graphics/vector/ImageVector;", com.knotapi.knot.utilities.Constants.META_CLOSE, "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera2StreamConfigurationMap", "getCheck$material3", "Check", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "getEdit$material3", "Edit", "getHighSpeedVideoFpsRanges", "getDateRange$material3", "DateRange", "getArrowDropDown$material3", "ArrowDropDown"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Filled {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector getHighSpeedVideoSizes;
        private static androidx.compose.ui.graphics.vector.ImageVector getHighSpeedVideoFpsRanges;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector getHighSpeedVideoFpsRangesFor;
        public static final androidx.compose.material3.internal.Icons.Filled INSTANCE = new androidx.compose.material3.internal.Icons.Filled();
        public static final int $stable = 8;

        private Filled() {
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getClose$material3() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = Camera2StreamConfigurationMap;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.Close", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(19.0f, 6.41f);
            pathBuilder.lineTo(17.59f, 5.0f);
            pathBuilder.lineTo(12.0f, 10.59f);
            pathBuilder.lineTo(6.41f, 5.0f);
            pathBuilder.lineTo(5.0f, 6.41f);
            pathBuilder.lineTo(10.59f, 12.0f);
            pathBuilder.lineTo(5.0f, 17.59f);
            pathBuilder.lineTo(6.41f, 19.0f);
            pathBuilder.lineTo(12.0f, 13.41f);
            pathBuilder.lineTo(17.59f, 19.0f);
            pathBuilder.lineTo(19.0f, 17.59f);
            pathBuilder.lineTo(13.41f, 12.0f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            Camera2StreamConfigurationMap = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getCheck$material3() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighSpeedVideoSizes;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.Check", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(9.0f, 16.17f);
            pathBuilder.lineTo(4.83f, 12.0f);
            pathBuilder.lineToRelative(-1.42f, 1.41f);
            pathBuilder.lineTo(9.0f, 19.0f);
            pathBuilder.lineTo(21.0f, 7.0f);
            pathBuilder.lineToRelative(-1.41f, -1.41f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            getHighSpeedVideoSizes = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getEdit$material3() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighSpeedVideoFpsRanges;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.Edit", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(3.0f, 17.25f);
            pathBuilder.verticalLineTo(21.0f);
            pathBuilder.horizontalLineToRelative(3.75f);
            pathBuilder.lineTo(17.81f, 9.94f);
            pathBuilder.lineToRelative(-3.75f, -3.75f);
            pathBuilder.lineTo(3.0f, 17.25f);
            pathBuilder.close();
            pathBuilder.moveTo(20.71f, 7.04f);
            pathBuilder.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
            pathBuilder.lineToRelative(-2.34f, -2.34f);
            pathBuilder.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
            pathBuilder.lineToRelative(-1.83f, 1.83f);
            pathBuilder.lineToRelative(3.75f, 3.75f);
            pathBuilder.lineToRelative(1.83f, -1.83f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            getHighSpeedVideoFpsRanges = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getDateRange$material3() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighResolutionOutputSizeshNQ4ISI;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Filled.DateRange", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(9.0f, 11.0f);
            pathBuilder.lineTo(7.0f, 11.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(13.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(19.0f, 4.0f);
            pathBuilder.horizontalLineToRelative(-1.0f);
            pathBuilder.lineTo(18.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 4.0f);
            pathBuilder.lineTo(8.0f, 2.0f);
            pathBuilder.lineTo(6.0f, 2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 4.0f);
            pathBuilder.curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.lineTo(3.0f, 20.0f);
            pathBuilder.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(14.0f);
            pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.lineTo(21.0f, 6.0f);
            pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(19.0f, 20.0f);
            pathBuilder.lineTo(5.0f, 20.0f);
            pathBuilder.lineTo(5.0f, 9.0f);
            pathBuilder.horizontalLineToRelative(14.0f);
            pathBuilder.verticalLineToRelative(11.0f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            getHighResolutionOutputSizeshNQ4ISI = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getArrowDropDown$material3() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighSpeedVideoFpsRangesFor;
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
            getHighSpeedVideoFpsRangesFor = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\t"}, d2 = {"Landroidx/compose/material3/internal/Icons$Outlined;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getSchedule", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "Schedule", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Camera2StreamConfigurationMap", "getKeyboard", "Keyboard", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Outlined {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
        private static androidx.compose.ui.graphics.vector.ImageVector getHighResolutionOutputSizeshNQ4ISI;
        public static final androidx.compose.material3.internal.Icons.Outlined INSTANCE = new androidx.compose.material3.internal.Icons.Outlined();
        public static final int $stable = 8;

        private Outlined() {
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getSchedule() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = Camera2StreamConfigurationMap;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Outlined.Schedule", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(11.99f, 2.0f);
            pathBuilder.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
            pathBuilder.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
            pathBuilder.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
            pathBuilder.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.0f, 20.0f);
            pathBuilder.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
            pathBuilder.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
            pathBuilder.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
            pathBuilder.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
            pathBuilder.close();
            pathBuilder.moveTo(12.5f, 7.0f);
            pathBuilder.lineTo(11.0f, 7.0f);
            pathBuilder.verticalLineToRelative(6.0f);
            pathBuilder.lineToRelative(5.25f, 3.15f);
            pathBuilder.lineToRelative(0.75f, -1.23f);
            pathBuilder.lineToRelative(-4.5f, -2.67f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            Camera2StreamConfigurationMap = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }

        public final androidx.compose.ui.graphics.vector.ImageVector getKeyboard() {
            androidx.compose.ui.graphics.vector.ImageVector imageVector = getHighResolutionOutputSizeshNQ4ISI;
            if (imageVector != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageVector);
                return imageVector;
            }
            androidx.compose.ui.graphics.vector.ImageVector.Builder builder = new androidx.compose.ui.graphics.vector.ImageVector.Builder("Outlined.Keyboard", androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), androidx.compose.ui.unit.Dp.m8601constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = androidx.compose.ui.graphics.vector.VectorKt.getDefaultFillType();
            androidx.compose.ui.graphics.SolidColor solidColor = new androidx.compose.ui.graphics.SolidColor(androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU(), null);
            int m6340getButtKaPHkGw = androidx.compose.ui.graphics.StrokeCap.INSTANCE.m6340getButtKaPHkGw();
            int m6350getBevelLxFBmk8 = androidx.compose.ui.graphics.StrokeJoin.INSTANCE.m6350getBevelLxFBmk8();
            androidx.compose.ui.graphics.vector.PathBuilder pathBuilder = new androidx.compose.ui.graphics.vector.PathBuilder();
            pathBuilder.moveTo(20.0f, 7.0f);
            pathBuilder.verticalLineToRelative(10.0f);
            pathBuilder.lineTo(4.0f, 17.0f);
            pathBuilder.lineTo(4.0f, 7.0f);
            pathBuilder.horizontalLineToRelative(16.0f);
            pathBuilder.moveToRelative(0.0f, -2.0f);
            pathBuilder.lineTo(4.0f, 5.0f);
            pathBuilder.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
            pathBuilder.lineTo(2.0f, 17.0f);
            pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
            pathBuilder.horizontalLineToRelative(16.0f);
            pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
            pathBuilder.lineTo(22.0f, 7.0f);
            pathBuilder.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(11.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(11.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 10.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 13.0f);
            pathBuilder.close();
            pathBuilder.moveTo(5.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 13.0f);
            pathBuilder.close();
            pathBuilder.moveTo(5.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(5.0f, 10.0f);
            pathBuilder.close();
            pathBuilder.moveTo(8.0f, 14.0f);
            pathBuilder.horizontalLineToRelative(8.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.lineTo(8.0f, 16.0f);
            pathBuilder.close();
            pathBuilder.moveTo(14.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(14.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 11.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            pathBuilder.moveTo(17.0f, 8.0f);
            pathBuilder.horizontalLineToRelative(2.0f);
            pathBuilder.verticalLineToRelative(2.0f);
            pathBuilder.horizontalLineToRelative(-2.0f);
            pathBuilder.close();
            androidx.compose.ui.graphics.vector.ImageVector build = androidx.compose.ui.graphics.vector.ImageVector.Builder.m6676addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m6340getButtKaPHkGw, m6350getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            getHighResolutionOutputSizeshNQ4ISI = build;
            kotlin.jvm.internal.Intrinsics.checkNotNull(build);
            return build;
        }
    }
}
