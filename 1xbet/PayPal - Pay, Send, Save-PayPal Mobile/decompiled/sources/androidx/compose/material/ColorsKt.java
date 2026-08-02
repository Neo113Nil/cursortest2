package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0085\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0085\u0001\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0019\u0010\u0016\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\r2\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001b\u0010\u001c\"\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\" \u0010!\u001a\b\u0012\u0004\u0012\u00020\r0 8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "primaryVariant", "secondary", "secondaryVariant", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Landroidx/compose/material/Colors;", "lightColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "darkColors-2qZNXz8", "darkColors", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "other", "", "updateColorsFrom", "(Landroidx/compose/material/Colors;Landroidx/compose/material/Colors;)V", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "primarySurface", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorsKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Colors> LocalColors = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material.ColorsKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material.Colors highSpeedVideoSizes;
            highSpeedVideoSizes = androidx.compose.material.ColorsKt.getHighSpeedVideoSizes();
            return highSpeedVideoSizes;
        }
    });

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.Colors m2584lightColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, java.lang.Object obj) {
        return m2583lightColors2qZNXz8((i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284612846L) : j, (i & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : j2, (i & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : j3, (i & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278290310L) : j4, (i & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4289724448L) : j7, (i & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j12);
    }

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final androidx.compose.material.Colors m2583lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new androidx.compose.material.Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.Colors m2582darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, java.lang.Object obj) {
        long Color = (i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4290479868L) : j;
        long Color2 = (i & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : j3;
        return m2581darkColors2qZNXz8(Color, Color2, Color3, (i & 8) != 0 ? Color3 : j4, (i & 16) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6033getWhite0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6022getBlack0d7_KjU() : j12);
    }

    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final androidx.compose.material.Colors m2581darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new androidx.compose.material.Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long getPrimarySurface(androidx.compose.material.Colors colors) {
        return colors.isLight() ? colors.m2562getPrimary0d7_KjU() : colors.m2566getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m2579contentColorFor4WTKRHQ(androidx.compose.material.Colors colors, long j) {
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2562getPrimary0d7_KjU()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2563getPrimaryVariant0d7_KjU())) {
            if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2564getSecondary0d7_KjU()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2565getSecondaryVariant0d7_KjU())) {
                return androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2555getBackground0d7_KjU()) ? colors.m2557getOnBackground0d7_KjU() : androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2566getSurface0d7_KjU()) ? colors.m2561getOnSurface0d7_KjU() : androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colors.m2556getError0d7_KjU()) ? colors.m2558getOnError0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
            }
            return colors.m2560getOnSecondary0d7_KjU();
        }
        return colors.m2559getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m2580contentColorForek8zF_U(long j, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:310)");
        }
        composer.startReplaceGroup(-583917585);
        long m2579contentColorFor4WTKRHQ = m2579contentColorFor4WTKRHQ(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m2579contentColorFor4WTKRHQ == 16) {
            m2579contentColorFor4WTKRHQ = ((androidx.compose.ui.graphics.Color) composer.consume(androidx.compose.material.ContentColorKt.getLocalContentColor())).m6006unboximpl();
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2579contentColorFor4WTKRHQ;
    }

    public static final void updateColorsFrom(androidx.compose.material.Colors colors, androidx.compose.material.Colors colors2) {
        colors.m2574setPrimary8_81llA$material(colors2.m2562getPrimary0d7_KjU());
        colors.m2575setPrimaryVariant8_81llA$material(colors2.m2563getPrimaryVariant0d7_KjU());
        colors.m2576setSecondary8_81llA$material(colors2.m2564getSecondary0d7_KjU());
        colors.m2577setSecondaryVariant8_81llA$material(colors2.m2565getSecondaryVariant0d7_KjU());
        colors.m2567setBackground8_81llA$material(colors2.m2555getBackground0d7_KjU());
        colors.m2578setSurface8_81llA$material(colors2.m2566getSurface0d7_KjU());
        colors.m2568setError8_81llA$material(colors2.m2556getError0d7_KjU());
        colors.m2571setOnPrimary8_81llA$material(colors2.m2559getOnPrimary0d7_KjU());
        colors.m2572setOnSecondary8_81llA$material(colors2.m2560getOnSecondary0d7_KjU());
        colors.m2569setOnBackground8_81llA$material(colors2.m2557getOnBackground0d7_KjU());
        colors.m2573setOnSurface8_81llA$material(colors2.m2561getOnSurface0d7_KjU());
        colors.m2570setOnError8_81llA$material(colors2.m2558getOnError0d7_KjU());
        colors.setLight$material(colors2.isLight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material.Colors getHighSpeedVideoSizes() {
        return m2584lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, my.com.softspace.ssfasstapsdk.SSFasstapSDK.CardScheme.ALL, null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Colors> getLocalColors() {
        return LocalColors;
    }
}
