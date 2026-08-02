package androidx.compose.ui.text.platform;

@kotlin.Deprecated(message = "Duplicate cache")
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/Font;", io.ktor.http.ContentType.Font.TYPE, "Landroid/graphics/Typeface;", "getOrCreate", "(Landroid/content/Context;Landroidx/compose/ui/text/font/Font;)Landroid/graphics/Typeface;", "Landroidx/collection/SieveCache;", "", "Camera2StreamConfigurationMap", "Landroidx/collection/SieveCache;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {
    public static final androidx.compose.ui.text.platform.AndroidTypefaceCache INSTANCE = new androidx.compose.ui.text.platform.AndroidTypefaceCache();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final androidx.collection.SieveCache<java.lang.String, android.graphics.Typeface> getHighSpeedVideoSizes = new androidx.collection.SieveCache<>(16, 16, null, null, null, 28, null);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final android.graphics.Typeface getOrCreate(android.content.Context context, androidx.compose.ui.text.font.Font font) {
        java.lang.String cacheKey;
        android.graphics.Typeface loadBlocking;
        android.graphics.Typeface typeface;
        boolean z = font instanceof androidx.compose.ui.text.font.ResourceFont;
        if (z) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getResources().getValue(((androidx.compose.ui.text.font.ResourceFont) font).getResId(), typedValue, true);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("res:");
            java.lang.CharSequence charSequence = typedValue.string;
            java.lang.String obj = charSequence != null ? charSequence.toString() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            sb.append(obj);
            cacheKey = sb.toString();
        } else {
            if (!(font instanceof androidx.compose.ui.text.font.AndroidPreloadedFont)) {
                throw new java.lang.IllegalArgumentException("Unknown font type: ".concat(java.lang.String.valueOf(font)));
            }
            cacheKey = ((androidx.compose.ui.text.font.AndroidPreloadedFont) font).getCacheKey();
        }
        if (cacheKey != null && (typeface = getHighSpeedVideoSizes.get(cacheKey)) != null) {
            return typeface;
        }
        if (z) {
            androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper androidResourceFontLoaderHelper = androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper.INSTANCE;
            loadBlocking = androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper.Camera2StreamConfigurationMap(context, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
        } else {
            if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
                throw new java.lang.IllegalArgumentException("Unknown font type: ".concat(java.lang.String.valueOf(font)));
            }
            androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (loadBlocking == null) {
            throw new java.lang.IllegalArgumentException("Unable to load font ".concat(java.lang.String.valueOf(font)));
        }
        if (cacheKey != null) {
            getHighSpeedVideoSizes.put(cacheKey, loadBlocking);
        }
        return loadBlocking;
    }
}
