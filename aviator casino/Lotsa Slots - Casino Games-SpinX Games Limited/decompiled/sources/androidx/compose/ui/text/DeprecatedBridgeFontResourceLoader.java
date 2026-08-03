package androidx.compose.ui.text;

/* compiled from: TextLayoutResult.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "fontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;)V", "load", "", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class DeprecatedBridgeFontResourceLoader implements androidx.compose.ui.text.font.Font.ResourceLoader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.Companion INSTANCE = new androidx.compose.ui.text.DeprecatedBridgeFontResourceLoader.Companion(null);
    private static java.util.Map<androidx.compose.ui.text.font.FontFamily.Resolver, androidx.compose.ui.text.font.Font.ResourceLoader> cache = new java.util.LinkedHashMap();
    private static final androidx.compose.ui.text.platform.SynchronizedObject lock = androidx.compose.ui.text.platform.Synchronization_jvmKt.createSynchronizedObject();
    private final androidx.compose.ui.text.font.FontFamily.Resolver fontFamilyResolver;

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(androidx.compose.ui.text.font.FontFamily.Resolver resolver, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(resolver);
    }

    private DeprecatedBridgeFontResourceLoader(androidx.compose.ui.text.font.FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @kotlin.Deprecated(message = "Replaced by FontFamily.Resolver, this method should not be called", replaceWith = @kotlin.ReplaceWith(expression = "FontFamily.Resolver.resolve(font, )", imports = {}))
    public java.lang.Object load(androidx.compose.ui.text.font.Font font) {
        return androidx.compose.ui.text.font.FontFamily.Resolver.CC.m4051resolveDPcqOEQ$default(this.fontFamilyResolver, androidx.compose.ui.text.font.FontKt.toFontFamily(font), font.getWeight(), font.getStyle(), 0, 8, null).getValue();
    }

    /* compiled from: TextLayoutResult.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0005R&\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/DeprecatedBridgeFontResourceLoader$Companion;", "", "()V", "cache", "", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "getCache", "()Ljava/util/Map;", "setCache", "(Ljava/util/Map;)V", "lock", "Landroidx/compose/ui/text/platform/SynchronizedObject;", "getLock", "()Landroidx/compose/ui/text/platform/SynchronizedObject;", com.google.firebase.messaging.Constants.MessagePayloadKeys.FROM, "fontFamilyResolver", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

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
    }
}
