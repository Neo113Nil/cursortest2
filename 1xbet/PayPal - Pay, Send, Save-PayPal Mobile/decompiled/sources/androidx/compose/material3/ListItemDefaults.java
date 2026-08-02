package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0013\u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010\u0015Ji\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\u000e2\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\t\u001a\u00020\n8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0018\u0010 \u001a\u00020\u0014*\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/material3/ListItemDefaults;", "", "<init>", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM", "()F", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_SHAPE, "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "contentColor", "getContentColor", "colors", "Landroidx/compose/material3/ListItemColors;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ListItemColors;", "headlineColor", "leadingIconColor", "overlineColor", "supportingColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "colors-J08w3-E", "(JJJJJJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ListItemColors;", "defaultListItemColors", "Landroidx/compose/material3/ColorScheme;", "getDefaultListItemColors$material3", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ListItemColors;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ListItemDefaults {
    public static final int $stable = 0;
    public static final androidx.compose.material3.ListItemDefaults INSTANCE = new androidx.compose.material3.ListItemDefaults();
    private static final float getHighSpeedVideoFpsRanges = androidx.compose.material3.tokens.ListTokens.INSTANCE.m4799getListItemContainerElevationD9Ej5fM();

    private ListItemDefaults() {
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m3427getElevationD9Ej5fM() {
        return getHighSpeedVideoFpsRanges;
    }

    public final androidx.compose.ui.graphics.Shape getShape(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-496871597, i, -1, "androidx.compose.material3.ListItemDefaults.<get-shape> (ListItem.kt:532)");
        }
        androidx.compose.ui.graphics.Shape value = androidx.compose.material3.ShapesKt.getValue(androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemContainerShape(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContainerColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1253579929, i, -1, "androidx.compose.material3.ListItemDefaults.<get-containerColor> (ListItem.kt:536)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemContainerColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final long getContentColor(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1076068327, i, -1, "androidx.compose.material3.ListItemDefaults.<get-contentColor> (ListItem.kt:540)");
        }
        long value = androidx.compose.material3.ColorSchemeKt.getValue(androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemLabelTextColor(), composer, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return value;
    }

    public final androidx.compose.material3.ListItemColors colors(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-552214416, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:546)");
        }
        androidx.compose.material3.ListItemColors defaultListItemColors$material3 = getDefaultListItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return defaultListItemColors$material3;
    }

    /* renamed from: colors-J08w3-E, reason: not valid java name */
    public final androidx.compose.material3.ListItemColors m3426colorsJ08w3E(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, androidx.compose.runtime.Composer composer, int i, int i2) {
        long j10;
        long j11;
        long m6032getUnspecified0d7_KjU = (i2 & 1) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j;
        long m6032getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j2;
        long m6032getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j3;
        long m6032getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j4;
        long m6032getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j5;
        long m6032getUnspecified0d7_KjU6 = (i2 & 32) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j6;
        long m6032getUnspecified0d7_KjU7 = (i2 & 64) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j7;
        long m6032getUnspecified0d7_KjU8 = (i2 & 128) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j8;
        long m6032getUnspecified0d7_KjU9 = (i2 & 256) != 0 ? androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU() : j9;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            j11 = m6032getUnspecified0d7_KjU8;
            j10 = m6032getUnspecified0d7_KjU7;
            androidx.compose.runtime.ComposerKt.traceEventStart(-352515689, i, -1, "androidx.compose.material3.ListItemDefaults.colors (ListItem.kt:576)");
        } else {
            j10 = m6032getUnspecified0d7_KjU7;
            j11 = m6032getUnspecified0d7_KjU8;
        }
        androidx.compose.material3.ListItemColors m3411copy5r9EGqc = getDefaultListItemColors$material3(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m3411copy5r9EGqc(m6032getUnspecified0d7_KjU, m6032getUnspecified0d7_KjU2, m6032getUnspecified0d7_KjU3, m6032getUnspecified0d7_KjU4, m6032getUnspecified0d7_KjU5, m6032getUnspecified0d7_KjU6, j10, j11, m6032getUnspecified0d7_KjU9);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3411copy5r9EGqc;
    }

    public final androidx.compose.material3.ListItemColors getDefaultListItemColors$material3(androidx.compose.material3.ColorScheme colorScheme) {
        androidx.compose.material3.ListItemColors defaultListItemColorsCached = colorScheme.getDefaultListItemColorsCached();
        if (defaultListItemColorsCached != null) {
            return defaultListItemColorsCached;
        }
        androidx.compose.material3.ListItemColors listItemColors = new androidx.compose.material3.ListItemColors(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemContainerColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemLabelTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemLeadingIconColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemOverlineColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemSupportingTextColor()), androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemTrailingIconColor()), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLabelTextColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLeadingIconColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(androidx.compose.material3.ColorSchemeKt.fromToken(colorScheme, androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledTrailingIconColor()), androidx.compose.material3.tokens.ListTokens.INSTANCE.getListItemDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultListItemColorsCached$material3(listItemColors);
        return listItemColors;
    }
}
