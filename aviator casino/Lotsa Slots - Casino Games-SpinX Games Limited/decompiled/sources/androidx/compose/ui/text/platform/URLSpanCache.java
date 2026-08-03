package androidx.compose.ui.text.platform;

/* compiled from: URLSpanCache.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0005R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "()V", "spansByAnnotation", "Ljava/util/WeakHashMap;", "Landroidx/compose/ui/text/UrlAnnotation;", "Landroid/text/style/URLSpan;", "toURLSpan", "urlAnnotation", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class URLSpanCache {
    public static final int $stable = 8;
    private final java.util.WeakHashMap<androidx.compose.ui.text.UrlAnnotation, android.text.style.URLSpan> spansByAnnotation = new java.util.WeakHashMap<>();

    public final android.text.style.URLSpan toURLSpan(androidx.compose.ui.text.UrlAnnotation urlAnnotation) {
        java.util.WeakHashMap<androidx.compose.ui.text.UrlAnnotation, android.text.style.URLSpan> weakHashMap = this.spansByAnnotation;
        android.text.style.URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new android.text.style.URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }
}
