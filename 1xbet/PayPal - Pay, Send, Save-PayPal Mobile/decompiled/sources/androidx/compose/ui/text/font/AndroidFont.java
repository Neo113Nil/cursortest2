package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001:\u0001\u0014B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "loadingStrategy", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "typefaceLoader", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Landroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", com.visa.cbp.getEncExpo.warmup, "getLoadingStrategy-PKNRLFQ", "()I", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "getTypefaceLoader", "()Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "TypefaceLoader"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class AndroidFont implements androidx.compose.ui.text.font.Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader;
    private final androidx.compose.ui.text.font.FontVariation.Settings variationSettings;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/AndroidFont;", io.ktor.http.ContentType.Font.TYPE, "Landroid/graphics/Typeface;", "loadBlocking", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;)Landroid/graphics/Typeface;", "awaitLoad", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TypefaceLoader {
        java.lang.Object awaitLoad(android.content.Context context, androidx.compose.ui.text.font.AndroidFont androidFont, kotlin.coroutines.Continuation<? super android.graphics.Typeface> continuation);

        android.graphics.Typeface loadBlocking(android.content.Context context, androidx.compose.ui.text.font.AndroidFont font);
    }

    private AndroidFont(int i, androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader, androidx.compose.ui.text.font.FontVariation.Settings settings) {
        this.loadingStrategy = i;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name and from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final androidx.compose.ui.text.font.AndroidFont.TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    private AndroidFont(int i, androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader) {
        this(i, typefaceLoader, new androidx.compose.ui.text.font.FontVariation.Settings(new androidx.compose.ui.text.font.FontVariation.Setting[0]), null);
    }

    public final androidx.compose.ui.text.font.FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @kotlin.Deprecated(message = "Replaced with fontVariation constructor", replaceWith = @kotlin.ReplaceWith(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public /* synthetic */ AndroidFont(int i, androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader);
    }

    public /* synthetic */ AndroidFont(int i, androidx.compose.ui.text.font.AndroidFont.TypefaceLoader typefaceLoader, androidx.compose.ui.text.font.FontVariation.Settings settings, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, typefaceLoader, settings);
    }
}
