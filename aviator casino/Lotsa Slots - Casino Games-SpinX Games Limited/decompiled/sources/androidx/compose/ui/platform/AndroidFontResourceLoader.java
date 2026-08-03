package androidx.compose.ui.platform;

/* compiled from: AndroidFontResourceLoader.android.kt */
@kotlin.Deprecated(message = "Replaced with PlatformFontLoader during the introduction of async fonts, all usages should be replaced", replaceWith = @kotlin.ReplaceWith(expression = "PlatformFontLoader", imports = {}))
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "load", "Landroid/graphics/Typeface;", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements androidx.compose.ui.text.font.Font.ResourceLoader {
    public static final int $stable = 8;
    private final android.content.Context context;

    public AndroidFontResourceLoader(android.content.Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public android.graphics.Typeface load(androidx.compose.ui.text.font.Font font) {
        if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                return androidx.compose.ui.platform.AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
            }
            android.graphics.Typeface font2 = androidx.core.content.res.ResourcesCompat.getFont(this.context, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
            kotlin.jvm.internal.Intrinsics.checkNotNull(font2);
            return font2;
        }
        throw new java.lang.IllegalArgumentException("Unknown font type: " + font);
    }
}
