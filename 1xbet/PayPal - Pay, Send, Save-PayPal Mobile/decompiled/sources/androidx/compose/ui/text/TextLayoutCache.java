package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/ui/text/TextLayoutCache;", "", "", "capacity", "<init>", "(I)V", "Landroidx/compose/ui/text/TextLayoutInput;", "key", "Landroidx/compose/ui/text/TextLayoutResult;", "get", "(Landroidx/compose/ui/text/TextLayoutInput;)Landroidx/compose/ui/text/TextLayoutResult;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "put", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/TextLayoutResult;)V", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "getHighSpeedVideoFpsRanges", "Landroidx/collection/LruCache;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/CacheTextLayoutInput;", "getHighSpeedVideoSizes", "Landroidx/compose/ui/text/TextLayoutResult;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private androidx.compose.ui.text.CacheTextLayoutInput getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.collection.LruCache<androidx.compose.ui.text.CacheTextLayoutInput, androidx.compose.ui.text.TextLayoutResult> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private androidx.compose.ui.text.TextLayoutResult getHighSpeedVideoFpsRanges;

    public TextLayoutCache(int i) {
        this.Camera2StreamConfigurationMap = i != 1 ? new androidx.collection.LruCache<>(i) : null;
    }

    public /* synthetic */ TextLayoutCache(int i, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    public final androidx.compose.ui.text.TextLayoutResult get(androidx.compose.ui.text.TextLayoutInput key) {
        androidx.compose.ui.text.TextLayoutResult textLayoutResult;
        androidx.compose.ui.text.CacheTextLayoutInput cacheTextLayoutInput = new androidx.compose.ui.text.CacheTextLayoutInput(key);
        androidx.collection.LruCache<androidx.compose.ui.text.CacheTextLayoutInput, androidx.compose.ui.text.TextLayoutResult> lruCache = this.Camera2StreamConfigurationMap;
        if (lruCache != null) {
            textLayoutResult = lruCache.get(cacheTextLayoutInput);
        } else {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, cacheTextLayoutInput)) {
                return null;
            }
            textLayoutResult = this.getHighSpeedVideoFpsRanges;
        }
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final void put(androidx.compose.ui.text.TextLayoutInput key, androidx.compose.ui.text.TextLayoutResult value) {
        androidx.collection.LruCache<androidx.compose.ui.text.CacheTextLayoutInput, androidx.compose.ui.text.TextLayoutResult> lruCache = this.Camera2StreamConfigurationMap;
        if (lruCache != null) {
            lruCache.put(new androidx.compose.ui.text.CacheTextLayoutInput(key), value);
        } else {
            this.getHighSpeedVideoSizes = new androidx.compose.ui.text.CacheTextLayoutInput(key);
            this.getHighSpeedVideoFpsRanges = value;
        }
    }

    public TextLayoutCache() {
        this(0, 1, null);
    }
}
