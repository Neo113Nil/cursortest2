package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\fJU\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u00020\u000b*\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/WideNavigationRailItemDefaults;", "", "<init>", "()V", "iconPositionFor", "Landroidx/compose/material3/NavigationItemIconPosition;", "railExpanded", "", "iconPositionFor-s8pcRp0", "(Z)I", "colors", "Landroidx/compose/material3/NavigationItemColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/NavigationItemColors;", "selectedIconColor", "Landroidx/compose/ui/graphics/Color;", "selectedTextColor", "selectedIndicatorColor", "unselectedIconColor", "unselectedTextColor", "disabledIconColor", "disabledTextColor", "colors-69fazGs", "(JJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/NavigationItemColors;", "defaultWideNavigationRailItemColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultWideNavigationRailItemColors", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/NavigationItemColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WideNavigationRailItemDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.WideNavigationRailItemDefaults INSTANCE = new androidx.compose.material3.WideNavigationRailItemDefaults();

    private WideNavigationRailItemDefaults() {
    }

    /* renamed from: iconPositionFor-s8pcRp0, reason: not valid java name */
    public final int m4220iconPositionFors8pcRp0(boolean railExpanded) {
        return railExpanded ? androidx.compose.material3.NavigationItemIconPosition.INSTANCE.m3541getStartxw1Ddg() : androidx.compose.material3.NavigationItemIconPosition.INSTANCE.m3542getTopxw1Ddg();
    }

    public final androidx.compose.material3.NavigationItemColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(911821421, i, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:889)");
        }
        androidx.compose.material3.NavigationItemColors Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return Camera2StreamConfigurationMap;
    }

    /* renamed from: colors-69fazGs, reason: not valid java name */
    public final androidx.compose.material3.NavigationItemColors m4219colors69fazGs(long j, long j2, long j3, long j4, long j5, long j6, long j7, androidx.compose.runtime.Composer composer, int i, int i2) {
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
            androidx.compose.runtime.ComposerKt.traceEventStart(1759081702, i, -1, "androidx.compose.material3.WideNavigationRailItemDefaults.colors (WideNavigationRail.kt:914)");
        } else {
            j8 = m5995copywmQWz5c$default;
            j9 = m5995copywmQWz5c$default2;
        }
        androidx.compose.material3.NavigationItemColors m3525copy4JmcsL4 = Camera2StreamConfigurationMap(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3525copy4JmcsL4(value, value2, value3, value4, value5, j8, j9);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3525copy4JmcsL4;
    }

    private static androidx.compose.material3.NavigationItemColors Camera2StreamConfigurationMap(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.NavigationItemColors defaultWideNavigationRailItemColorsCached = colorScheme.getDefaultWideNavigationRailItemColorsCached();
        if (defaultWideNavigationRailItemColorsCached != null) {
            return defaultWideNavigationRailItemColorsCached;
        }
        androidx.compose.material3.NavigationItemColors navigationItemColors = new androidx.compose.material3.NavigationItemColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIcon()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveLabelText()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemActiveIndicator()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveIcon()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.NavigationRailColorTokens.INSTANCE.getItemInactiveLabelText()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultWideNavigationRailItemColorsCached$material3(navigationItemColors);
        return navigationItemColors;
    }
}
