package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006JU\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u00020\u0005*\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/ShortNavigationBarItemDefaults;", "", "<init>", "()V", "colors", "Landroidx/compose/material3/NavigationItemColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationItemColors;", "defaultShortNavigationBarItemColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultShortNavigationBarItemColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationItemColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShortNavigationBarItemDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.ShortNavigationBarItemDefaults INSTANCE = new androidx.compose.material3.ShortNavigationBarItemDefaults();

    private ShortNavigationBarItemDefaults() {
    }

    public final androidx.compose.material3.NavigationItemColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(954437293, i, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:287)");
        }
        androidx.compose.material3.NavigationItemColors defaultShortNavigationBarItemColors$material3 = getDefaultShortNavigationBarItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultShortNavigationBarItemColors$material3;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final androidx.compose.material3.NavigationItemColors m3747colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.Composer composer, int i, int i2) {
        long j8;
        long j9;
        long value = (i2 & 1) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveIconColor(), composer, 6) : j;
        long value2 = (i2 & 2) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor(), composer, 6) : j2;
        long value3 = (i2 & 4) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor(), composer, 6) : j3;
        long value4 = (i2 & 8) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveIconColor(), composer, 6) : j4;
        long value5 = (i2 & 16) != 0 ? androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor(), composer, 6) : j5;
        long m5995copywmQWz5c$default = (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value4, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j6;
        long m5995copywmQWz5c$default2 = (i2 & 64) != 0 ? androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(value5, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j7;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j9 = m5995copywmQWz5c$default2;
            j8 = m5995copywmQWz5c$default;
            androidx.compose.runtime.ComposerKt.traceEventStart(1801697574, i, -1, "androidx.compose.material3.ShortNavigationBarItemDefaults.colors (ShortNavigationBar.kt:312)");
        } else {
            j8 = m5995copywmQWz5c$default;
            j9 = m5995copywmQWz5c$default2;
        }
        androidx.compose.material3.NavigationItemColors m3525copy4JmcsL4 = getDefaultShortNavigationBarItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3525copy4JmcsL4(value, value2, value3, value4, value5, j8, j9);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3525copy4JmcsL4;
    }

    public final androidx.compose.material3.NavigationItemColors getDefaultShortNavigationBarItemColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.NavigationItemColors defaultShortNavigationBarItemColorsCached = colorScheme.getDefaultShortNavigationBarItemColorsCached();
        if (defaultShortNavigationBarItemColorsCached != null) {
            return defaultShortNavigationBarItemColorsCached;
        }
        androidx.compose.material3.NavigationItemColors navigationItemColors = new androidx.compose.material3.NavigationItemColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemActiveIndicatorColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveIconColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationBarTokens.INSTANCE.getItemInactiveLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultShortNavigationBarItemColorsCached$material3(navigationItemColors);
        return navigationItemColors;
    }
}
