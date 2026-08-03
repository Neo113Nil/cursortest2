package androidx.compose.material;

/* compiled from: Colors.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u001d\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u008b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u008b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001b\u001a\u001f\u0010\t\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010 \u001a\u00020!*\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000\"\u001a\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006#"}, d2 = {"LocalColors", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Colors;", "getLocalColors", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "primarySurface", "Landroidx/compose/ui/graphics/Color;", "getPrimarySurface", "(Landroidx/compose/material/Colors;)J", "contentColorFor", "backgroundColor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "darkColors", "primary", "primaryVariant", com.ironsource.X3.i.Y, "secondaryVariant", com.helpshift.proactive.InAppViewConstants.BACKGROUND, "surface", "error", "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "darkColors-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material/Colors;", "lightColors", "lightColors-2qZNXz8", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material/Colors;J)J", "updateColorsFrom", "", "other", "material_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorsKt {
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Colors> LocalColors = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0<androidx.compose.material.Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.compose.material.Colors invoke() {
            androidx.compose.material.Colors m1336lightColors2qZNXz8;
            m1336lightColors2qZNXz8 = androidx.compose.material.ColorsKt.m1336lightColors2qZNXz8((r43 & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4284612846L) : 0L, (r43 & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : 0L, (r43 & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : 0L, (r43 & 8) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278290310L) : 0L, (r43 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4289724448L) : 0L, (r43 & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L, (r43 & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : 0L, (r43 & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : 0L);
            return m1336lightColors2qZNXz8;
        }
    });

    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final androidx.compose.material.Colors m1336lightColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new androidx.compose.material.Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.Colors m1335darkColors2qZNXz8$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, java.lang.Object obj) {
        long Color = (i & 1) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4290479868L) : j;
        long Color2 = (i & 2) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4281794739L) : j2;
        long Color3 = (i & 4) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4278442694L) : j3;
        return m1334darkColors2qZNXz8(Color, Color2, Color3, (i & 8) != 0 ? Color3 : j4, (i & 16) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4279374354L) : j5, (i & 32) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4279374354L) : j6, (i & 64) != 0 ? androidx.compose.ui.graphics.ColorKt.Color(4291782265L) : j7, (i & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2150getWhite0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m2139getBlack0d7_KjU() : j12);
    }

    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final androidx.compose.material.Colors m1334darkColors2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new androidx.compose.material.Colors(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, null);
    }

    public static final long getPrimarySurface(androidx.compose.material.Colors colors) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "<this>");
        return colors.isLight() ? colors.m1315getPrimary0d7_KjU() : colors.m1319getSurface0d7_KjU();
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1332contentColorFor4WTKRHQ(androidx.compose.material.Colors contentColorFor, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contentColorFor, "$this$contentColorFor");
        if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1315getPrimary0d7_KjU()) && !androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1316getPrimaryVariant0d7_KjU())) {
            if (!androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1317getSecondary0d7_KjU()) && !androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1318getSecondaryVariant0d7_KjU())) {
                return androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1308getBackground0d7_KjU()) ? contentColorFor.m1310getOnBackground0d7_KjU() : androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1319getSurface0d7_KjU()) ? contentColorFor.m1314getOnSurface0d7_KjU() : androidx.compose.ui.graphics.Color.m2114equalsimpl0(j, contentColorFor.m1309getError0d7_KjU()) ? contentColorFor.m1311getOnError0d7_KjU() : androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU();
            }
            return contentColorFor.m1313getOnSecondary0d7_KjU();
        }
        return contentColorFor.m1312getOnPrimary0d7_KjU();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1333contentColorForek8zF_U(long j, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 441849991, "C(contentColorFor)P(0:c#ui.graphics.Color)*296@11462L6,296@11533L7:Colors.kt#jmzs0o");
        long m1332contentColorFor4WTKRHQ = m1332contentColorFor4WTKRHQ(androidx.compose.material.MaterialTheme.INSTANCE.getColors(composer, 6), j);
        if (m1332contentColorFor4WTKRHQ == androidx.compose.ui.graphics.Color.INSTANCE.m2149getUnspecified0d7_KjU()) {
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.graphics.Color> localContentColor = androidx.compose.material.ContentColorKt.getLocalContentColor();
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "C:CompositionLocal.kt#9igjgp");
            java.lang.Object consume = composer.consume(localContentColor);
            androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
            m1332contentColorFor4WTKRHQ = ((androidx.compose.ui.graphics.Color) consume).m2123unboximpl();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return m1332contentColorFor4WTKRHQ;
    }

    public static final void updateColorsFrom(androidx.compose.material.Colors colors, androidx.compose.material.Colors other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colors, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        colors.m1327setPrimary8_81llA$material_release(other.m1315getPrimary0d7_KjU());
        colors.m1328setPrimaryVariant8_81llA$material_release(other.m1316getPrimaryVariant0d7_KjU());
        colors.m1329setSecondary8_81llA$material_release(other.m1317getSecondary0d7_KjU());
        colors.m1330setSecondaryVariant8_81llA$material_release(other.m1318getSecondaryVariant0d7_KjU());
        colors.m1320setBackground8_81llA$material_release(other.m1308getBackground0d7_KjU());
        colors.m1331setSurface8_81llA$material_release(other.m1319getSurface0d7_KjU());
        colors.m1321setError8_81llA$material_release(other.m1309getError0d7_KjU());
        colors.m1324setOnPrimary8_81llA$material_release(other.m1312getOnPrimary0d7_KjU());
        colors.m1325setOnSecondary8_81llA$material_release(other.m1313getOnSecondary0d7_KjU());
        colors.m1322setOnBackground8_81llA$material_release(other.m1310getOnBackground0d7_KjU());
        colors.m1326setOnSurface8_81llA$material_release(other.m1314getOnSurface0d7_KjU());
        colors.m1323setOnError8_81llA$material_release(other.m1311getOnError0d7_KjU());
        colors.setLight$material_release(other.isLight());
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material.Colors> getLocalColors() {
        return LocalColors;
    }
}
