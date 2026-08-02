package androidx.compose.ui.platform;

@kotlin.Deprecated(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.ReplaceWith(expression = "PlatformFontLoader", imports = {}))
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroid/graphics/Typeface;", "load", "(Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "getHighSpeedVideoFpsRangesFor", "Landroid/content/Context;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements androidx.compose.ui.text.font.Font.ResourceLoader {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    public AndroidFontResourceLoader(android.content.Context context) {
        this.getHighSpeedVideoSizes = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public final android.graphics.Typeface load(androidx.compose.ui.text.font.Font font) {
        if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
            androidx.compose.ui.platform.AndroidFontResourceLoaderHelper androidFontResourceLoaderHelper = androidx.compose.ui.platform.AndroidFontResourceLoaderHelper.INSTANCE;
            return androidx.compose.ui.platform.AndroidFontResourceLoaderHelper.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
        }
        throw new java.lang.IllegalArgumentException("Unknown font type: ".concat(java.lang.String.valueOf(font)));
    }
}
