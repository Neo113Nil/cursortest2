package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\rR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/Font;", "", "Landroidx/compose/ui/text/font/FontWeight;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "weight", "Landroidx/compose/ui/text/font/FontStyle;", "getStyle-_-LCdwA", "()I", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "getLoadingStrategy-PKNRLFQ", "loadingStrategy", "Companion", "ResourceLoader"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Font {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.Font.Companion INSTANCE = androidx.compose.ui.text.font.Font.Companion.Camera2StreamConfigurationMap;
    public static final long MaximumAsyncTimeoutMillis = 15000;

    @kotlin.Deprecated(message = "Replaced with FontFamily.Resolver during the introduction of async fonts, all usages should be replaced. Custom subclasses can be converted into a FontFamily.Resolver by calling createFontFamilyResolver(myFontFamilyResolver, context)")
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0004\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/Font$ResourceLoader;", "", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "load", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ResourceLoader {
        @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
        java.lang.Object load(androidx.compose.ui.text.font.Font font);
    }

    /* renamed from: getStyle-_-LCdwA */
    int mo8105getStyle_LCdwA();

    androidx.compose.ui.text.font.FontWeight getWeight();

    /* renamed from: getLoadingStrategy-PKNRLFQ */
    default int mo8097getLoadingStrategyPKNRLFQ() {
        return androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/text/font/Font$Companion;", "", "<init>", "()V", "", "MaximumAsyncTimeoutMillis", "J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.compose.ui.text.font.Font.Companion Camera2StreamConfigurationMap = new androidx.compose.ui.text.font.Font.Companion();
        public static final long MaximumAsyncTimeoutMillis = 15000;

        private Companion() {
        }
    }
}
