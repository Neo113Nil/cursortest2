package androidx.compose.ui.text.font;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"createFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontResourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "context", "Landroid/content/Context;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
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
