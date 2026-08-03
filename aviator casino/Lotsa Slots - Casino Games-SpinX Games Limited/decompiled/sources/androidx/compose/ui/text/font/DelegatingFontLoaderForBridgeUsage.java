package androidx.compose.ui.text.font;

/* compiled from: DelegatingFontLoaderForDeprecatedUsage.android.kt */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "loader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "context", "Landroid/content/Context;", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)V", "cacheKey", "", "getCacheKey", "()Ljava/lang/Object;", "getLoader$ui_text_release", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "awaitLoad", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForBridgeUsage implements androidx.compose.ui.text.font.PlatformFontLoader {
    public static final int $stable = 8;
    private final java.lang.Object cacheKey = new java.lang.Object();
    private final android.content.Context context;
    private final androidx.compose.ui.text.font.Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, android.content.Context context) {
        this.loader = resourceLoader;
        this.context = context;
    }

    /* renamed from: getLoader$ui_text_release, reason: from getter */
    public final androidx.compose.ui.text.font.Font.ResourceLoader getLoader() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public java.lang.Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public java.lang.Object loadBlocking(androidx.compose.ui.text.font.Font font) {
        if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
            return this.loader.load(font);
        }
        androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.context, androidFont);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
            return this.loader.load(font);
        }
        androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.context, androidFont, continuation);
    }
}
