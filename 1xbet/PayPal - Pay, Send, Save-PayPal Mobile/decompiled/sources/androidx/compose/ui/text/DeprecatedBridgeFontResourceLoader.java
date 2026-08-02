package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "p0", "<init>", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "Landroidx/compose/ui/text/font/Font;", "", "load", "(Landroidx/compose/ui/text/font/Font;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class DeprecatedBridgeFontResourceLoader implements androidx.compose.ui.text.font.Font.ResourceLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.Companion INSTANCE = new androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.Companion(null);
    private static java.util.Map<androidx.compose.ui.text.font.FontFamily.Resolver, androidx.compose.ui.text.font.Font.ResourceLoader> cache = new java.util.LinkedHashMap();
    private static final androidx.compose.ui.text.platform.SynchronizedObject lock = new androidx.compose.ui.text.platform.SynchronizedObject();

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.FontFamily.Resolver getHighSpeedVideoFpsRangesFor;

    private DeprecatedBridgeFontResourceLoader(androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.getHighSpeedVideoFpsRangesFor = resolver;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public final java.lang.Object load(androidx.compose.ui.text.font.Font p0) {
        return androidx.compose.ui.text.font.FontFamily.Resolver.m8124resolveDPcqOEQ$default(this.getHighSpeedVideoFpsRangesFor, androidx.compose.ui.text.font.FontKt.toFontFamily(p0), p0.getGetHighSpeedVideoFpsRanges(), p0.getGetHighResolutionOutputSizeshNQ4ISI(), 0, 8, null).getValue();
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR.\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "from", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)Landroidx/compose/ui/text/font/Font$ResourceLoader;", "", com.datadog.trace.api.DDSpanTypes.CACHE, "Ljava/util/Map;", "getCache", "()Ljava/util/Map;", "setCache", "(Ljava/util/Map;)V", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock", "()Landroidx/compose/ui/text/platform/SynchronizedObject;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Map<androidx.compose.ui.text.font.FontFamily.Resolver, androidx.compose.ui.text.font.Font.ResourceLoader> getCache() {
            return androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.cache;
        }

        public final void setCache(java.util.Map<androidx.compose.ui.text.font.FontFamily.Resolver, androidx.compose.ui.text.font.Font.ResourceLoader> map) {
            androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.cache = map;
        }

        public final androidx.compose.ui.text.platform.SynchronizedObject getLock() {
            return androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.lock;
        }

        public final androidx.compose.ui.text.font.Font.ResourceLoader from(androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver) {
            synchronized (getLock()) {
                androidx.compose.ui.text.font.Font.ResourceLoader resourceLoader = androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.INSTANCE.getCache().get(fontFamilyResolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader(fontFamilyResolver, null);
                androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.INSTANCE.getCache().put(fontFamilyResolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver);
    }
}
