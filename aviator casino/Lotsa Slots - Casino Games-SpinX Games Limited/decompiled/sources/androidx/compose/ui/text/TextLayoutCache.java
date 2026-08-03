package androidx.compose.ui.text;

/* compiled from: TextMeasurer.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "capacity", "", "(I)V", "lruCache", "Landroidx/compose/ui/text/caches/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "Landroidx/compose/ui/text/TextLayoutResult;", "get", com.ironsource.X3.i.W, "Landroidx/compose/ui/text/TextLayoutInput;", "put", "value", "remove", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.caches.LruCache<androidx.compose.ui.text.CacheTextLayoutInput, androidx.compose.ui.text.TextLayoutResult> lruCache;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public TextLayoutCache(int i) {
        this.lruCache = new androidx.compose.ui.text.caches.LruCache<>(i);
    }

    public /* synthetic */ TextLayoutCache(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? androidx.compose.ui.text.TextMeasurerKt.DefaultCacheSize : i);
    }

    public final androidx.compose.ui.text.TextLayoutResult get(androidx.compose.ui.text.TextLayoutInput key) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.lruCache.get(new androidx.compose.ui.text.CacheTextLayoutInput(key));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final androidx.compose.ui.text.TextLayoutResult put(androidx.compose.ui.text.TextLayoutInput key, androidx.compose.ui.text.TextLayoutResult value) {
        return this.lruCache.put(new androidx.compose.ui.text.CacheTextLayoutInput(key), value);
    }

    public final androidx.compose.ui.text.TextLayoutResult remove(androidx.compose.ui.text.TextLayoutInput key) {
        return this.lruCache.remove(new androidx.compose.ui.text.CacheTextLayoutInput(key));
    }
}
