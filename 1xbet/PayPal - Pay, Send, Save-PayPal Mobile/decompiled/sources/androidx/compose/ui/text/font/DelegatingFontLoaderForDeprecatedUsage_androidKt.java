package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0005\u0010\u0007"}, d2 = {"Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontResourceLoader", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "createFontFamilyResolver", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;)Landroidx/compose/ui/text/font/FontFamily$Resolver;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage_androidKt {
    @kotlin.Deprecated(message = "This exists to bridge existing Font.ResourceLoader subclasses to be used as aFontFamily.ResourceLoader during upgrade.", replaceWith = @kotlin.ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    public static final androidx.compose.ui.text.font.FontFamily.Resolver createFontFamilyResolver(androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, android.content.Context context) {
        return new androidx.compose.ui.text.font.FontFamilyResolverImpl(new androidx.compose.ui.text.font.DelegatingFontLoaderForBridgeUsage(resourceLoader, context.getApplicationContext()), null, null, null, null, 30, null);
    }

    @kotlin.Deprecated(message = "This exists to bridge existing Font.ResourceLoader APIs, and should be removed with them", replaceWith = @kotlin.ReplaceWith(expression = "createFontFamilyResolver()", imports = {}))
    public static final androidx.compose.ui.text.font.FontFamily.Resolver createFontFamilyResolver(androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        return new androidx.compose.ui.text.font.FontFamilyResolverImpl(new androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage(resourceLoader), null, null, null, null, 30, null);
    }
}
