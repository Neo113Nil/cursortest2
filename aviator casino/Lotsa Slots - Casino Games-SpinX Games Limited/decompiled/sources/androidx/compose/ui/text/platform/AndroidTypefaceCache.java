package androidx.compose.ui.text.platform;

/* compiled from: AndroidFontListTypeface.android.kt */
@kotlin.Deprecated(message = "Duplicate cache")
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTypefaceCache;", "", "()V", "cache", "Landroidx/collection/LruCache;", "", "Landroid/graphics/Typeface;", "getKey", "context", "Landroid/content/Context;", io.ktor.http.ContentType.Font.TYPE, "Landroidx/compose/ui/text/font/Font;", "getOrCreate", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTypefaceCache {
    public static final androidx.compose.ui.text.platform.AndroidTypefaceCache INSTANCE = new androidx.compose.ui.text.platform.AndroidTypefaceCache();
    private static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> cache = new androidx.collection.LruCache<>(16);
    public static final int $stable = 8;

    private AndroidTypefaceCache() {
    }

    public final android.graphics.Typeface getOrCreate(android.content.Context context, androidx.compose.ui.text.font.Font font) {
        android.graphics.Typeface loadBlocking;
        android.graphics.Typeface typeface;
        java.lang.String key = getKey(context, font);
        if (key != null && (typeface = cache.get(key)) != null) {
            return typeface;
        }
        if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                loadBlocking = androidx.compose.ui.text.platform.AndroidResourceFontLoaderHelper.INSTANCE.create(context, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
            } else {
                loadBlocking = androidx.core.content.res.ResourcesCompat.getFont(context, ((androidx.compose.ui.text.font.ResourceFont) font).getResId());
                kotlin.jvm.internal.Intrinsics.checkNotNull(loadBlocking);
            }
        } else {
            if (!(font instanceof androidx.compose.ui.text.font.AndroidFont)) {
                throw new java.lang.IllegalArgumentException("Unknown font type: " + font);
            }
            androidx.compose.ui.text.font.AndroidFont androidFont = (androidx.compose.ui.text.font.AndroidFont) font;
            loadBlocking = androidFont.getTypefaceLoader().loadBlocking(context, androidFont);
        }
        if (loadBlocking != null) {
            if (key != null) {
                cache.put(key, loadBlocking);
            }
            return loadBlocking;
        }
        throw new java.lang.IllegalArgumentException("Unable to load font " + font);
    }

    public final java.lang.String getKey(android.content.Context context, androidx.compose.ui.text.font.Font font) {
        if (font instanceof androidx.compose.ui.text.font.ResourceFont) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            context.getResources().getValue(((androidx.compose.ui.text.font.ResourceFont) font).getResId(), typedValue, true);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("res:");
            java.lang.CharSequence charSequence = typedValue.string;
            java.lang.String obj = charSequence != null ? charSequence.toString() : null;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj);
            sb.append(obj);
            return sb.toString();
        }
        if (font instanceof androidx.compose.ui.text.font.AndroidPreloadedFont) {
            return ((androidx.compose.ui.text.font.AndroidPreloadedFont) font).getCacheKey();
        }
        throw new java.lang.IllegalArgumentException("Unknown font type: " + font);
    }
}
