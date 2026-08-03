package androidx.compose.ui.res;

/* compiled from: FontResources.android.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001c\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"cacheLock", "Ljava/lang/Object;", "syncLoadedTypefaces", "", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/Typeface;", "fontResource", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/font/Typeface;", "fontResourceFromContext", "context", "Landroid/content/Context;", "a", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontResources_androidKt {
    private static final java.lang.Object cacheLock = new java.lang.Object();
    private static final java.util.Map<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.Typeface> syncLoadedTypefaces = new java.util.LinkedHashMap();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    public static final androidx.compose.ui.text.font.Typeface fontResource(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.runtime.Composer composer, int i) {
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, -190831095, "C(fontResource)54@1901L7:FontResources.android.kt#ccshc7");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-190831095, i, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        androidx.compose.runtime.ProvidableCompositionLocal<android.content.Context> localContext = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext();
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        java.lang.Object consume = composer.consume(localContext);
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        androidx.compose.ui.text.font.Typeface fontResourceFromContext = fontResourceFromContext((android.content.Context) consume, fontFamily);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        androidx.compose.runtime.ComposerKt.sourceInformationMarkerEnd(composer);
        return fontResourceFromContext;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Prefer to preload fonts using FontFamily.Resolver.", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.preload(fontFamily, Font.AndroidResourceLoader(context))", imports = {}))
    private static final androidx.compose.ui.text.font.Typeface fontResourceFromContext(android.content.Context context, androidx.compose.ui.text.font.FontFamily fontFamily) {
        androidx.compose.ui.text.font.Typeface typeface;
        if ((fontFamily instanceof androidx.compose.ui.text.font.SystemFontFamily) || (fontFamily instanceof androidx.compose.ui.text.font.LoadedFontFamily)) {
            synchronized (cacheLock) {
                java.util.Map<androidx.compose.ui.text.font.FontFamily, androidx.compose.ui.text.font.Typeface> map = syncLoadedTypefaces;
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
