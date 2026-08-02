package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForBridgeUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "Landroid/content/Context;", "context", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;Landroid/content/Context;)V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForBridgeUsage implements androidx.compose.ui.text.font.PlatformFontLoader {
    public static final int $stable = 8;
    private final java.lang.Object cacheKey = new java.lang.Object();

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;
    private final androidx.compose.ui.text.font.Font.ResourceLoader loader;

    public DelegatingFontLoaderForBridgeUsage(androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader, android.content.Context context) {
        this.loader = resourceLoader;
        this.getHighSpeedVideoSizes = context;
    }

    /* renamed from: getLoader$ui_text, reason: from getter */
    public final androidx.compose.ui.text.font.Font.ResourceLoader getLoader() {
        return this.loader;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final java.lang.Object getCacheKey() {
        return this.cacheKey;
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final java.lang.Object loadBlocking(androidx.compose.ui.text.font.Font font) {
        if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
            return this.loader.load(font);
        }
        androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
        return androidFont.getTypefaceLoader().loadBlocking(this.getHighSpeedVideoSizes, androidFont);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
            return this.loader.load(font);
        }
        androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
        return androidFont.getTypefaceLoader().awaitLoad(this.getHighSpeedVideoSizes, androidFont, continuation);
    }
}
