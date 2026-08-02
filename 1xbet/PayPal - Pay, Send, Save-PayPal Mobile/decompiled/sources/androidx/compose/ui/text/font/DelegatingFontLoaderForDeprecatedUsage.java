package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/DelegatingFontLoaderForDeprecatedUsage;", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "loader", "<init>", "(Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "", "loadBlocking", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "awaitLoad", "(Landroidx/compose/ui/text/font/Font;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getLoader$ui_text", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "cacheKey", "Ljava/lang/Object;", "getCacheKey", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DelegatingFontLoaderForDeprecatedUsage implements androidx.compose.ui.text.font.PlatformFontLoader {
    public static final int $stable = 8;
    private final java.lang.Object cacheKey = new java.lang.Object();
    private final androidx.compose.ui.text.font.Font.ResourceLoader loader;

    public DelegatingFontLoaderForDeprecatedUsage(androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
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
        return this.loader.load(font);
    }

    @Override // androidx.compose.ui.text.font.PlatformFontLoader
    public final java.lang.Object awaitLoad(androidx.compose.ui.text.font.Font font, kotlin.coroutines.Continuation<java.lang.Object> continuation) {
        return this.loader.load(font);
    }
}
