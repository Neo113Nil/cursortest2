package androidx.compose.ui.res;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\" \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "Landroid/content/Context;", "p0", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/content/Context;Landroidx/compose/ui/text/font/FontFamily;)Landroidx/compose/ui/text/font/Typeface;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/Object;", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "Ljava/util/Map;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontResources_androidKt {
    private static final java.lang.Object getHighSpeedVideoFpsRangesFor = new java.lang.Object();
    private static final java.util.Map<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.Typeface> getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final androidx.compose.ui.text.font.Typeface fontResource(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:51)");
        }
        androidx.compose.ui.text.font.Typeface highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return highResolutionOutputSizeshNQ4ISI;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final androidx.compose.ui.text.font.Typeface getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, androidx.compose.ui.text.font.FontFamily fontFamily) {
        androidx.compose.ui.text.font.Typeface typeface;
        if ((fontFamily instanceof androidx.compose.ui.text.font.SystemFontFamily) || (fontFamily instanceof androidx.compose.ui.text.font.LoadedFontFamily)) {
            synchronized (getHighSpeedVideoFpsRangesFor) {
                java.util.Map<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.Typeface> map = getHighSpeedVideoFpsRanges;
                androidx.compose.ui.text.font.Typeface typeface2 = map.get(fontFamily);
                if (typeface2 == null) {
                    typeface2 = androidx.compose.ui.text.font.AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typeface2);
                }
                typeface = typeface2;
            }
            return typeface;
        }
        return androidx.compose.ui.text.font.AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
    }
}
