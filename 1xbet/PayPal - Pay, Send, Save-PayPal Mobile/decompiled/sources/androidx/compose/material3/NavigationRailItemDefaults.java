package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006JU\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010JA\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0011\u001a\u00020\u0005*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/NavigationRailItemDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/NavigationRailItemColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationRailItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "indicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "defaultNavigationRailItemColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultNavigationRailItemColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationRailItemColors;", "colors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationRailItemColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.NavigationRailItemDefaults INSTANCE = new androidx.compose.material3.NavigationRailItemDefaults();

    private NavigationRailItemDefaults() {
    }

    public final androidx.compose.material3.NavigationRailItemColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2014332261, i, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:346)");
        }
        androidx.compose.material3.NavigationRailItemColors defaultNavigationRailItemColors$material3 = getDefaultNavigationRailItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultNavigationRailItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final androidx.compose.material3.NavigationRailItemColors m3567colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.Composer composer, int i, int i2) {
        long j8;
        long j9;
        long value = (i2 & 1) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIcon(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveLabelText(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIndicator(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText(), composer, 6) : j5;
        long m5995copywmQWz5c$default = (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m5995copywmQWz5c$default2 = (i2 & 64) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j9 = m5995copywmQWz5c$default2;
            j8 = m5995copywmQWz5c$default;
            androidx.compose.runtime.ComposerKt.traceEventStart(-2104358508, i, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:371)");
        } else {
            j8 = m5995copywmQWz5c$default;
            j9 = m5995copywmQWz5c$default2;
        }
        androidx.compose.material3.NavigationRailItemColors m3556copy4JmcsL4 = getDefaultNavigationRailItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3556copy4JmcsL4(value, value2, value3, value4, value5, j8, j9);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3556copy4JmcsL4;
    }

    public final androidx.compose.material3.NavigationRailItemColors getDefaultNavigationRailItemColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.NavigationRailItemColors defaultNavigationRailItemColorsCached = colorScheme.getDefaultNavigationRailItemColorsCached();
        if (defaultNavigationRailItemColorsCached != null) {
            return defaultNavigationRailItemColorsCached;
        }
        androidx.compose.material3.NavigationRailItemColors navigationRailItemColors = new androidx.compose.material3.NavigationRailItemColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIcon()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveLabelText()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIndicator()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultNavigationRailItemColorsCached$material3(navigationRailItemColors);
        return navigationRailItemColors;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use overload with disabledIconColor and disabledTextColor")
    /* renamed from: colors-zjMxDiM, reason: not valid java name */
    public final /* synthetic */ androidx.compose.material3.NavigationRailItemColors m3568colorszjMxDiM(long j, long j2, long j3, long j4, long j5, androidx.compose.runtime.Composer composer, int i, int i2) {
        long value = (i2 & 1) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIcon(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveLabelText(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIndicator(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText(), composer, 6) : j5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1621601574, i, -1, "androidx.compose.material3.NavigationRailItemDefaults.colors (NavigationRail.kt:415)");
        }
        androidx.compose.material3.NavigationRailItemColors navigationRailItemColors = new androidx.compose.material3.NavigationRailItemColors(value, value2, value3, value4, value5, androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return navigationRailItemColors;
    }
}
