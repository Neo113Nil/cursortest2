package androidx.compose.ui.text.platform;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0007\u0010\fJ\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0013\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R&\u0010\u0018\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0004\u0012\u00020\u00160\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014"}, d2 = {"Landroidx/compose/ui/text/platform/URLSpanCache;", "", "<init>", "()V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "Landroid/text/style/URLSpan;", "toURLSpan", "(Landroidx/compose/ui/text/UrlAnnotation;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "urlRange", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/URLSpan;", "Landroidx/compose/ui/text/LinkAnnotation;", "linkRange", "Landroid/text/style/ClickableSpan;", "toClickableSpan", "(Landroidx/compose/ui/text/AnnotatedString$Range;)Landroid/text/style/ClickableSpan;", "Ljava/util/WeakHashMap;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/WeakHashMap;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/platform/ComposeClickableSpan;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class URLSpanCache {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.WeakHashMap<androidx.compose.ui.text.UrlAnnotation, android.text.style.URLSpan> Camera2StreamConfigurationMap = new java.util.WeakHashMap<>();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.WeakHashMap<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>, android.text.style.URLSpan> getHighResolutionOutputSizeshNQ4ISI = new java.util.WeakHashMap<>();

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.WeakHashMap<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>, androidx.compose.ui.text.platform.ComposeClickableSpan> getHighSpeedVideoSizes = new java.util.WeakHashMap<>();

    public final android.text.style.URLSpan toURLSpan(androidx.compose.ui.text.UrlAnnotation urlAnnotation) {
        java.util.WeakHashMap<androidx.compose.ui.text.UrlAnnotation, android.text.style.URLSpan> weakHashMap = this.Camera2StreamConfigurationMap;
        android.text.style.URLSpan uRLSpan = weakHashMap.get(urlAnnotation);
        if (uRLSpan == null) {
            uRLSpan = new android.text.style.URLSpan(urlAnnotation.getUrl());
            weakHashMap.put(urlAnnotation, uRLSpan);
        }
        return uRLSpan;
    }

    public final android.text.style.URLSpan toURLSpan(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url> urlRange) {
        java.util.WeakHashMap<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation.Url>, android.text.style.URLSpan> weakHashMap = this.getHighResolutionOutputSizeshNQ4ISI;
        android.text.style.URLSpan uRLSpan = weakHashMap.get(urlRange);
        if (uRLSpan == null) {
            uRLSpan = new android.text.style.URLSpan(urlRange.getItem().getUrl());
            weakHashMap.put(urlRange, uRLSpan);
        }
        return uRLSpan;
    }

    public final android.text.style.ClickableSpan toClickableSpan(androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation> linkRange) {
        java.util.WeakHashMap<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>, androidx.compose.ui.text.platform.ComposeClickableSpan> weakHashMap = this.getHighSpeedVideoSizes;
        androidx.compose.ui.text.platform.ComposeClickableSpan composeClickableSpan = weakHashMap.get(linkRange);
        if (composeClickableSpan == null) {
            composeClickableSpan = new androidx.compose.ui.text.platform.ComposeClickableSpan(linkRange.getItem());
            weakHashMap.put(linkRange, composeClickableSpan);
        }
        return composeClickableSpan;
    }
}
