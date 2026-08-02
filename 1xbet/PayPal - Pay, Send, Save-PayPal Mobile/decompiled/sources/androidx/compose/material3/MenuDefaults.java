package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015JK\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001a\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u001e\u001a\u00020\u0014*\u00020\u001f8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Landroidx/compose/material3/MenuDefaults;", "", "<init>", "()V", "TonalElevation", "Landroidx/compose/ui/unit/Dp;", "getTonalElevation-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "ShadowElevation", "getShadowElevation-D9Ej5fM", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "itemColors", "Landroidx/compose/material3/MenuItemColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/MenuItemColors;", "textColor", "leadingIconColor", "trailingIconColor", "disabledTextColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "itemColors-5tl4gsc", "(JJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/MenuItemColors;", "defaultMenuItemColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultMenuItemColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/MenuItemColors;", "DropdownMenuItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getDropdownMenuItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MenuDefaults {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.layout.PaddingValues Camera2StreamConfigurationMap;
    public static final androidx.compose.material3.MenuDefaults INSTANCE = new androidx.compose.material3.MenuDefaults();
    private static final float getHighSpeedVideoFpsRangesFor = androidx.compose.material3.tokens.ElevationTokens.INSTANCE.m4653getLevel0D9Ej5fM();
    private static final float getHighResolutionOutputSizeshNQ4ISI = androidx.compose.material3.tokens.MenuTokens.INSTANCE.m4826getContainerElevationD9Ej5fM();

    private MenuDefaults() {
    }

    static {
        float f;
        f = androidx.compose.material3.MenuKt.getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = androidx.compose.foundation.layout.PaddingKt.m1700PaddingValuesYgX7TsA(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f));
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m3443getTonalElevationD9Ej5fM() {
        return getHighSpeedVideoFpsRangesFor;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m3442getShadowElevationD9Ej5fM() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(218702739, i, -1, "androidx.compose.material3.MenuDefaults.<get-shape> (Menu.kt:189)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.MenuTokens.INSTANCE.getContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1787427929, i, -1, "androidx.compose.material3.MenuDefaults.<get-containerColor> (Menu.kt:193)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.MenuTokens.INSTANCE.getContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.material3.MenuItemColors itemColors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1326531516, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:199)");
        }
        androidx.compose.material3.MenuItemColors defaultMenuItemColors$material3 = getDefaultMenuItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultMenuItemColors$material3;
    }

    /* renamed from: itemColors-5tl4gsc, reason: not valid java name */
    public final androidx.compose.material3.MenuItemColors m3444itemColors5tl4gsc(long j, long j2, long j3, long j4, long j5, long j6, androidx.compose.runtime.Composer composer, int i, int i2) {
        long m6032getUnspecified0d7_KjU = (i2 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        long m6032getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j5;
        long m6032getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j6;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1278543580, i, -1, "androidx.compose.material3.MenuDefaults.itemColors (Menu.kt:224)");
        }
        androidx.compose.material3.MenuItemColors m3446copytNS2XkQ = getDefaultMenuItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3446copytNS2XkQ(m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU3, m6032getUnspecified0d7_KjU4, m6032getUnspecified0d7_KjU5, m6032getUnspecified0d7_KjU6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3446copytNS2XkQ;
    }

    public final androidx.compose.material3.MenuItemColors getDefaultMenuItemColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.MenuItemColors defaultMenuItemColorsCached = colorScheme.getDefaultMenuItemColorsCached();
        if (defaultMenuItemColorsCached != null) {
            return defaultMenuItemColorsCached;
        }
        androidx.compose.material3.MenuItemColors menuItemColors = new androidx.compose.material3.MenuItemColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemLeadingIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemTrailingIconColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLabelTextColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLeadingIconColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledTrailingIconColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultMenuItemColorsCached$material3(menuItemColors);
        return menuItemColors;
    }

    public final androidx.compose.foundation.layout.PaddingValues getDropdownMenuItemContentPadding() {
        return Camera2StreamConfigurationMap;
    }
}
