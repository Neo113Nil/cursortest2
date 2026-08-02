package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aí\u0003\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b2\u00103\u001aí\u0003\u00106\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u00002\b\b\u0002\u0010%\u001a\u00020\u00002\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\u00002\b\b\u0002\u0010)\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u00002\b\b\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010,\u001a\u00020\u00002\b\b\u0002\u0010-\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020\u0000¢\u0006\u0004\b5\u00103\u001a\u0019\u0010:\u001a\u00020\u0000*\u0002012\u0006\u00107\u001a\u00020\u0000¢\u0006\u0004\b8\u00109\u001a\u0015\u0010:\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0000¢\u0006\u0004\b;\u0010<\u001a\u0019\u0010A\u001a\u00020\u0000*\u0002012\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@\u001a\u000f\u0010B\u001a\u000201H\u0000¢\u0006\u0004\bB\u0010C\u001a÷\u0002\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000H\u0007¢\u0006\u0004\bD\u0010E\u001a±\u0002\u00104\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000H\u0007¢\u0006\u0004\bF\u0010G\u001a÷\u0002\u00106\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00002\b\b\u0002\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00002\b\b\u0002\u0010$\u001a\u00020\u0000H\u0007¢\u0006\u0004\bH\u0010E\u001a±\u0002\u00106\u001a\u0002012\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u0000H\u0007¢\u0006\u0004\bI\u0010G\u001a\u001b\u0010L\u001a\u00020\u0000*\u0002012\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010M\u001a#\u0010P\u001a\u00020\u0000*\u0002012\u0006\u00107\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0000¢\u0006\u0004\bN\u0010O\" \u0010R\u001a\b\u0012\u0004\u0012\u0002010Q8\u0001X\u0080\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0014\u0010W\u001a\u00020V8\u0000X\u0081T¢\u0006\u0006\n\u0004\bW\u0010X\"\u0018\u0010K\u001a\u00020\u0000*\u00020J8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\bY\u0010Z\" \u0010\\\u001a\b\u0012\u0004\u0012\u00020[0Q8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010S\u001a\u0004\b]\u0010U"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "surfaceDim", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "Landroidx/compose/material3/ColorScheme;", "lightColorScheme-_VG5OTI", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme", "darkColorScheme-_VG5OTI", "darkColorScheme", "backgroundColor", "contentColorFor-4WTKRHQ", "(Landroidx/compose/material3/ColorScheme;J)J", "contentColorFor", "contentColorFor-ek8zF_U", "(JLandroidx/compose/runtime/Composer;I)J", "Landroidx/compose/ui/unit/Dp;", "elevation", "surfaceColorAtElevation-3ABfNKs", "(Landroidx/compose/material3/ColorScheme;F)J", "surfaceColorAtElevation", "expressiveLightColorScheme", "()Landroidx/compose/material3/ColorScheme;", "lightColorScheme-C-Xl9yA", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "lightColorScheme-G1PFc-w", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Landroidx/compose/material3/ColorScheme;", "darkColorScheme-C-Xl9yA", "darkColorScheme-G1PFc-w", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "fromToken", "(Landroidx/compose/material3/ColorScheme;Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;)J", "applyTonalElevation-RFCenO8", "(Landroidx/compose/material3/ColorScheme;JFLandroidx/compose/runtime/Composer;I)J", "applyTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalColorScheme", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalColorScheme", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "", "DisabledAlpha", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue", "(Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;Landroidx/compose/runtime/Composer;I)J", "", "LocalTonalElevationEnabled", "getLocalTonalElevationEnabled"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorSchemeKt {
    public static final float DisabledAlpha = 0.38f;
    private static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.ColorScheme> LocalColorScheme = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            androidx.compose.material3.ColorScheme highSpeedVideoFpsRangesFor;
            highSpeedVideoFpsRangesFor = androidx.compose.material3.ColorSchemeKt.getHighSpeedVideoFpsRangesFor();
            return highSpeedVideoFpsRangesFor;
        }
    });
    private static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> LocalTonalElevationEnabled = androidx.compose.runtime.CompositionLocalKt.staticCompositionLocalOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ColorSchemeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(androidx.compose.material3.ColorSchemeKt.m3085$r8$lambda$WTrqdW8n7n4AOvyq0V0sKKUblo());
        }
    });

    /* renamed from: $r8$lambda$WTrqd-W8n7n4AOvyq0V0sKKUblo, reason: not valid java name */
    public static /* synthetic */ boolean m3085$r8$lambda$WTrqdW8n7n4AOvyq0V0sKKUblo() {
        return true;
    }

    /* renamed from: lightColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3101lightColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, java.lang.Object obj) {
        long m4576getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4576getPrimary0d7_KjU() : j;
        return m3100lightColorScheme_VG5OTI(m4576getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4560getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4577getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4561getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4555getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4581getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4564getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4582getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4565getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4595getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4570getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4596getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4571getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4551getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4557getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4585getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4568getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4594getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4569getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4576getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4556getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4554getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4552getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4558getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4553getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4559getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4574getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4575getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4580getScrim0d7_KjU() : j29, (i & 536870912) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4586getSurfaceBright0d7_KjU() : j30, (i & 1073741824) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4587getSurfaceContainer0d7_KjU() : j31, (i & Integer.MIN_VALUE) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4588getSurfaceContainerHigh0d7_KjU() : j32, (i2 & 1) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4589getSurfaceContainerHighest0d7_KjU() : j33, (i2 & 2) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4590getSurfaceContainerLow0d7_KjU() : j34, (i2 & 4) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4591getSurfaceContainerLowest0d7_KjU() : j35, (i2 & 8) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4592getSurfaceDim0d7_KjU() : j36, (i2 & 16) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4578getPrimaryFixed0d7_KjU() : j37, (i2 & 32) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4579getPrimaryFixedDim0d7_KjU() : j38, (i2 & 64) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4562getOnPrimaryFixed0d7_KjU() : j39, (i2 & 128) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4563getOnPrimaryFixedVariant0d7_KjU() : j40, (i2 & 256) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4583getSecondaryFixed0d7_KjU() : j41, (i2 & 512) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4584getSecondaryFixedDim0d7_KjU() : j42, (i2 & 1024) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4566getOnSecondaryFixed0d7_KjU() : j43, (i2 & 2048) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4567getOnSecondaryFixedVariant0d7_KjU() : j44, (i2 & 4096) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4597getTertiaryFixed0d7_KjU() : j45, (i2 & 8192) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4598getTertiaryFixedDim0d7_KjU() : j46, (i2 & 16384) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4572getOnTertiaryFixed0d7_KjU() : j47, (i2 & 32768) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4573getOnTertiaryFixedVariant0d7_KjU() : j48);
    }

    /* renamed from: lightColorScheme-_VG5OTI, reason: not valid java name */
    public static final androidx.compose.material3.ColorScheme m3100lightColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new androidx.compose.material3.ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: darkColorScheme-_VG5OTI$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3095darkColorScheme_VG5OTI$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, int i, int i2, java.lang.Object obj) {
        long m4528getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4528getPrimary0d7_KjU() : j;
        return m3094darkColorScheme_VG5OTI(m4528getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4512getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4529getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4513getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4507getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4533getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4516getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4534getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4517getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4547getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4522getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4548getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4523getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4503getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4509getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4537getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4520getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4546getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4521getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4528getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4508getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4506getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4504getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4510getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4505getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4511getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4526getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4527getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4532getScrim0d7_KjU() : j29, (i & 536870912) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4538getSurfaceBright0d7_KjU() : j30, (i & 1073741824) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4539getSurfaceContainer0d7_KjU() : j31, (i & Integer.MIN_VALUE) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4540getSurfaceContainerHigh0d7_KjU() : j32, (i2 & 1) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4541getSurfaceContainerHighest0d7_KjU() : j33, (i2 & 2) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4542getSurfaceContainerLow0d7_KjU() : j34, (i2 & 4) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4543getSurfaceContainerLowest0d7_KjU() : j35, (i2 & 8) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4544getSurfaceDim0d7_KjU() : j36, (i2 & 16) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4530getPrimaryFixed0d7_KjU() : j37, (i2 & 32) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4531getPrimaryFixedDim0d7_KjU() : j38, (i2 & 64) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4514getOnPrimaryFixed0d7_KjU() : j39, (i2 & 128) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4515getOnPrimaryFixedVariant0d7_KjU() : j40, (i2 & 256) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4535getSecondaryFixed0d7_KjU() : j41, (i2 & 512) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4536getSecondaryFixedDim0d7_KjU() : j42, (i2 & 1024) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4518getOnSecondaryFixed0d7_KjU() : j43, (i2 & 2048) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4519getOnSecondaryFixedVariant0d7_KjU() : j44, (i2 & 4096) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4549getTertiaryFixed0d7_KjU() : j45, (i2 & 8192) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4550getTertiaryFixedDim0d7_KjU() : j46, (i2 & 16384) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4524getOnTertiaryFixed0d7_KjU() : j47, (i2 & 32768) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4525getOnTertiaryFixedVariant0d7_KjU() : j48);
    }

    /* renamed from: darkColorScheme-_VG5OTI, reason: not valid java name */
    public static final androidx.compose.material3.ColorScheme m3094darkColorScheme_VG5OTI(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48) {
        return new androidx.compose.material3.ColorScheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j36, j31, j32, j33, j34, j35, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, null);
    }

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m3088contentColorFor4WTKRHQ(androidx.compose.material3.ColorScheme colorScheme, long j) {
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getPrimary())) {
            return colorScheme.getOnPrimary();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSecondary())) {
            return colorScheme.getOnSecondary();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getTertiary())) {
            return colorScheme.getOnTertiary();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getBackground())) {
            return colorScheme.getOnBackground();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getError())) {
            return colorScheme.getOnError();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getPrimaryContainer())) {
            return colorScheme.getOnPrimaryContainer();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSecondaryContainer())) {
            return colorScheme.getOnSecondaryContainer();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getTertiaryContainer())) {
            return colorScheme.getOnTertiaryContainer();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getErrorContainer())) {
            return colorScheme.getOnErrorContainer();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getInverseSurface())) {
            return colorScheme.getInverseOnSurface();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurface())) {
            return colorScheme.getOnSurface();
        }
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceVariant())) {
            return colorScheme.getOnSurfaceVariant();
        }
        if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceBright()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceContainer()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceContainerHigh()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceContainerHighest()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceContainerLow()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceContainerLowest()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurfaceDim())) {
            if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getPrimaryFixed()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getPrimaryFixedDim())) {
                if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSecondaryFixed()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSecondaryFixedDim())) {
                    if (!androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getTertiaryFixed()) && !androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getTertiaryFixedDim())) {
                        return androidx.compose.ui.graphics.Color.INSTANCE.m6032getUnspecified0d7_KjU();
                    }
                    return colorScheme.getOnTertiaryFixed();
                }
                return colorScheme.getOnSecondaryFixed();
            }
            return colorScheme.getOnPrimaryFixed();
        }
        return colorScheme.getOnSurface();
    }

    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m3089contentColorForek8zF_U(long j, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(509589638, i, -1, "androidx.compose.material3.contentColorFor (ColorScheme.kt:1112)");
        }
        composer.startReplaceGroup(89374938);
        long m3088contentColorFor4WTKRHQ = m3088contentColorFor4WTKRHQ(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), j);
        if (m3088contentColorFor4WTKRHQ == 16) {
            m3088contentColorFor4WTKRHQ = ((androidx.compose.ui.graphics.Color) composer.consume(androidx.compose.material3.ContentColorKt.getLocalContentColor())).m6006unboximpl();
        }
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m3088contentColorFor4WTKRHQ;
    }

    public static final androidx.compose.material3.ColorScheme expressiveLightColorScheme() {
        return m3101lightColorScheme_VG5OTI$default(0L, 0L, 0L, androidx.compose.material3.tokens.PaletteTokens.INSTANCE.m4953getPrimary300d7_KjU(), 0L, 0L, 0L, 0L, androidx.compose.material3.tokens.PaletteTokens.INSTANCE.m4966getSecondary300d7_KjU(), 0L, 0L, 0L, androidx.compose.material3.tokens.PaletteTokens.INSTANCE.m4979getTertiary300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, androidx.compose.material3.tokens.PaletteTokens.INSTANCE.m4903getError300d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535, null);
    }

    /* renamed from: lightColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3097lightColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, java.lang.Object obj) {
        long m4576getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4576getPrimary0d7_KjU() : j;
        return m3096lightColorSchemeCXl9yA(m4576getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4560getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4577getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4561getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4555getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4581getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4564getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4582getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4565getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4595getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4570getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4596getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4571getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4551getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4557getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4585getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4568getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4594getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4569getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4576getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4556getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4554getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4552getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4558getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4553getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4559getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4574getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4575getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4580getScrim0d7_KjU() : j29, (i & 536870912) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4586getSurfaceBright0d7_KjU() : j30, (i & 1073741824) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4587getSurfaceContainer0d7_KjU() : j31, (i & Integer.MIN_VALUE) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4588getSurfaceContainerHigh0d7_KjU() : j32, (i2 & 1) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4589getSurfaceContainerHighest0d7_KjU() : j33, (i2 & 2) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4590getSurfaceContainerLow0d7_KjU() : j34, (i2 & 4) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4591getSurfaceContainerLowest0d7_KjU() : j35, (i2 & 8) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4592getSurfaceDim0d7_KjU() : j36);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional Fixed roles instead")
    /* renamed from: lightColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.ColorScheme m3096lightColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m3101lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: lightColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3099lightColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, java.lang.Object obj) {
        long m4576getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4576getPrimary0d7_KjU() : j;
        return m3098lightColorSchemeG1PFcw(m4576getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4560getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4577getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4561getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4555getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4581getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4564getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4582getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4565getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4595getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4570getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4596getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4571getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4551getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4557getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4585getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4568getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4594getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4569getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4576getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4556getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4554getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4552getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4558getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4553getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4559getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4574getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4575getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorLightTokens.INSTANCE.m4580getScrim0d7_KjU() : j29);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: lightColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.ColorScheme m3098lightColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m3101lightColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    /* renamed from: darkColorScheme-C-Xl9yA$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3091darkColorSchemeCXl9yA$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, int i, int i2, java.lang.Object obj) {
        long m4528getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4528getPrimary0d7_KjU() : j;
        return m3090darkColorSchemeCXl9yA(m4528getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4512getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4529getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4513getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4507getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4533getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4516getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4534getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4517getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4547getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4522getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4548getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4523getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4503getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4509getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4537getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4520getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4546getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4521getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4528getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4508getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4506getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4504getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4510getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4505getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4511getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4526getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4527getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4532getScrim0d7_KjU() : j29, (i & 536870912) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4538getSurfaceBright0d7_KjU() : j30, (i & 1073741824) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4539getSurfaceContainer0d7_KjU() : j31, (i & Integer.MIN_VALUE) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4540getSurfaceContainerHigh0d7_KjU() : j32, (i2 & 1) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4541getSurfaceContainerHighest0d7_KjU() : j33, (i2 & 2) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4542getSurfaceContainerLow0d7_KjU() : j34, (i2 & 4) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4543getSurfaceContainerLowest0d7_KjU() : j35, (i2 & 8) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4544getSurfaceDim0d7_KjU() : j36);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-C-Xl9yA, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.ColorScheme m3090darkColorSchemeCXl9yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36) {
        return m3095darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0, 65520, null);
    }

    /* renamed from: darkColorScheme-G1PFc-w$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material3.ColorScheme m3093darkColorSchemeG1PFcw$default(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, int i, java.lang.Object obj) {
        long m4528getPrimary0d7_KjU = (i & 1) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4528getPrimary0d7_KjU() : j;
        return m3092darkColorSchemeG1PFcw(m4528getPrimary0d7_KjU, (i & 2) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4512getOnPrimary0d7_KjU() : j2, (i & 4) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4529getPrimaryContainer0d7_KjU() : j3, (i & 8) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4513getOnPrimaryContainer0d7_KjU() : j4, (i & 16) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4507getInversePrimary0d7_KjU() : j5, (i & 32) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4533getSecondary0d7_KjU() : j6, (i & 64) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4516getOnSecondary0d7_KjU() : j7, (i & 128) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4534getSecondaryContainer0d7_KjU() : j8, (i & 256) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4517getOnSecondaryContainer0d7_KjU() : j9, (i & 512) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4547getTertiary0d7_KjU() : j10, (i & 1024) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4522getOnTertiary0d7_KjU() : j11, (i & 2048) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4548getTertiaryContainer0d7_KjU() : j12, (i & 4096) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4523getOnTertiaryContainer0d7_KjU() : j13, (i & 8192) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4503getBackground0d7_KjU() : j14, (i & 16384) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4509getOnBackground0d7_KjU() : j15, (i & 32768) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4537getSurface0d7_KjU() : j16, (i & 65536) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4520getOnSurface0d7_KjU() : j17, (i & 131072) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4546getSurfaceVariant0d7_KjU() : j18, (i & 262144) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4521getOnSurfaceVariant0d7_KjU() : j19, (i & 524288) != 0 ? m4528getPrimary0d7_KjU : j20, (i & 1048576) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4508getInverseSurface0d7_KjU() : j21, (i & 2097152) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4506getInverseOnSurface0d7_KjU() : j22, (i & 4194304) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4504getError0d7_KjU() : j23, (i & 8388608) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4510getOnError0d7_KjU() : j24, (i & 16777216) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4505getErrorContainer0d7_KjU() : j25, (i & 33554432) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4511getOnErrorContainer0d7_KjU() : j26, (i & 67108864) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4526getOutline0d7_KjU() : j27, (i & androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4527getOutlineVariant0d7_KjU() : j28, (i & 268435456) != 0 ? androidx.compose.material3.tokens.ColorDarkTokens.INSTANCE.m4532getScrim0d7_KjU() : j29);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use overload with additional surface roles instead")
    /* renamed from: darkColorScheme-G1PFc-w, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.ColorScheme m3092darkColorSchemeG1PFcw(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29) {
        return m3095darkColorScheme_VG5OTI$default(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -536870912, 65535, null);
    }

    public static final long fromToken(androidx.compose.material3.ColorScheme colorScheme, androidx.compose.material3.tokens.ColorSchemeKeyTokens colorSchemeKeyTokens) {
        switch (androidx.compose.material3.ColorSchemeKt.WhenMappings.$EnumSwitchMapping$0[colorSchemeKeyTokens.ordinal()]) {
            case 1:
                return colorScheme.getBackground();
            case 2:
                return colorScheme.getError();
            case 3:
                return colorScheme.getErrorContainer();
            case 4:
                return colorScheme.getInverseOnSurface();
            case 5:
                return colorScheme.getInversePrimary();
            case 6:
                return colorScheme.getInverseSurface();
            case 7:
                return colorScheme.getOnBackground();
            case 8:
                return colorScheme.getOnError();
            case 9:
                return colorScheme.getOnErrorContainer();
            case 10:
                return colorScheme.getOnPrimary();
            case 11:
                return colorScheme.getOnPrimaryContainer();
            case 12:
                return colorScheme.getOnSecondary();
            case 13:
                return colorScheme.getOnSecondaryContainer();
            case 14:
                return colorScheme.getOnSurface();
            case 15:
                return colorScheme.getOnSurfaceVariant();
            case 16:
                return colorScheme.getSurfaceTint();
            case 17:
                return colorScheme.getOnTertiary();
            case 18:
                return colorScheme.getOnTertiaryContainer();
            case 19:
                return colorScheme.getOutline();
            case 20:
                return colorScheme.getOutlineVariant();
            case 21:
                return colorScheme.getPrimary();
            case 22:
                return colorScheme.getPrimaryContainer();
            case 23:
                return colorScheme.getScrim();
            case 24:
                return colorScheme.getSecondary();
            case 25:
                return colorScheme.getSecondaryContainer();
            case 26:
                return colorScheme.getSurface();
            case 27:
                return colorScheme.getSurfaceVariant();
            case 28:
                return colorScheme.getSurfaceBright();
            case 29:
                return colorScheme.getSurfaceContainer();
            case 30:
                return colorScheme.getSurfaceContainerHigh();
            case 31:
                return colorScheme.getSurfaceContainerHighest();
            case 32:
                return colorScheme.getSurfaceContainerLow();
            case 33:
                return colorScheme.getSurfaceContainerLowest();
            case 34:
                return colorScheme.getSurfaceDim();
            case 35:
                return colorScheme.getTertiary();
            case 36:
                return colorScheme.getTertiaryContainer();
            case 37:
                return colorScheme.getPrimaryFixed();
            case 38:
                return colorScheme.getPrimaryFixedDim();
            case 39:
                return colorScheme.getOnPrimaryFixed();
            case 40:
                return colorScheme.getOnPrimaryFixedVariant();
            case 41:
                return colorScheme.getSecondaryFixed();
            case 42:
                return colorScheme.getSecondaryFixedDim();
            case 43:
                return colorScheme.getOnSecondaryFixed();
            case 44:
                return colorScheme.getOnSecondaryFixedVariant();
            case 45:
                return colorScheme.getTertiaryFixed();
            case 46:
                return colorScheme.getTertiaryFixedDim();
            case 47:
                return colorScheme.getOnTertiaryFixed();
            case 48:
                return colorScheme.getOnTertiaryFixedVariant();
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.material3.ColorScheme getHighSpeedVideoFpsRangesFor() {
        return m3101lightColorScheme_VG5OTI$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null);
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.material3.ColorScheme> getLocalColorScheme() {
        return LocalColorScheme;
    }

    public static final long getValue(androidx.compose.material3.tokens.ColorSchemeKeyTokens colorSchemeKeyTokens, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-810780884, i, -1, "androidx.compose.material3.<get-value> (ColorScheme.kt:1524)");
        }
        long fromToken = fromToken(androidx.compose.material3.MaterialTheme.INSTANCE.getColorScheme(composer, 6), colorSchemeKeyTokens);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return fromToken;
    }

    /* renamed from: applyTonalElevation-RFCenO8, reason: not valid java name */
    public static final long m3087applyTonalElevationRFCenO8(androidx.compose.material3.ColorScheme colorScheme, long j, float f, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1610977682, i, -1, "androidx.compose.material3.applyTonalElevation (ColorScheme.kt:1539)");
        }
        boolean booleanValue = ((java.lang.Boolean) composer.consume(LocalTonalElevationEnabled)).booleanValue();
        if (androidx.compose.ui.graphics.Color.m5997equalsimpl0(j, colorScheme.getSurface()) && booleanValue) {
            j = m3102surfaceColorAtElevation3ABfNKs(colorScheme, f);
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return j;
    }

    public static final androidx.compose.runtime.ProvidableCompositionLocal<java.lang.Boolean> getLocalTonalElevationEnabled() {
        return LocalTonalElevationEnabled;
    }

    /* renamed from: surfaceColorAtElevation-3ABfNKs, reason: not valid java name */
    public static final long m3102surfaceColorAtElevation3ABfNKs(androidx.compose.material3.ColorScheme colorScheme, float f) {
        if (androidx.compose.ui.unit.Dp.m8606equalsimpl0(f, androidx.compose.ui.unit.Dp.m8601constructorimpl(0.0f))) {
            return colorScheme.getSurface();
        }
        return androidx.compose.ui.graphics.ColorKt.m6041compositeOverOWjLjI(androidx.compose.ui.graphics.Color.m5995copywmQWz5c$default(colorScheme.getSurfaceTint(), ((((float) java.lang.Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface());
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.material3.tokens.ColorSchemeKeyTokens.values().length];
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Background.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Error.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.ErrorContainer.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseOnSurface.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.InversePrimary.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.InverseSurface.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnBackground.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnError.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnErrorContainer.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimary.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryContainer.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondary.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryContainer.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurface.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSurfaceVariant.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceTint.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiary.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryContainer.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Outline.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OutlineVariant.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Primary.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryContainer.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Scrim.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Secondary.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryContainer.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Surface.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceVariant.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceBright.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainer.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerHigh.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerHighest.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerLow.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceContainerLowest.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SurfaceDim.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.Tertiary.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryContainer.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryFixed.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.PrimaryFixedDim.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryFixed.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnPrimaryFixedVariant.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryFixed.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.SecondaryFixedDim.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryFixed.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnSecondaryFixedVariant.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryFixed.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.TertiaryFixedDim.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryFixed.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                iArr[androidx.compose.material3.tokens.ColorSchemeKeyTokens.OnTertiaryFixedVariant.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
