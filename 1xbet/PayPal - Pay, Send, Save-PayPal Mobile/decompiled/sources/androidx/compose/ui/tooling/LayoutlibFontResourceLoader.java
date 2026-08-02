package androidx.compose.ui.tooling;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/tooling/LayoutlibFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroid/graphics/Typeface;", "load", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "Camera2StreamConfigurationMap", "Landroid/content/Context;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutlibFontResourceLoader implements androidx.compose.ui.text.font.Font.ResourceLoader {
    public static final int $stable = 8;
    private final android.content.Context Camera2StreamConfigurationMap;

    public LayoutlibFontResourceLoader(android.content.Context context) {
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public final android.graphics.Typeface load(androidx.compose.ui.text.font.Font font) {
        if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
            androidx.compose.ui.tooling.ResourceFontHelper resourceFontHelper = androidx.compose.ui.tooling.ResourceFontHelper.INSTANCE;
            return androidx.compose.ui.tooling.ResourceFontHelper.getHighSpeedVideoSizes(this.Camera2StreamConfigurationMap, (androidx.compose.ui.text.font.ResourceFont) font);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown font type: ");
        sb.append(font.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
