package androidx.compose.foundation.text.input;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0088\u0001\u0010\u0092\u0001\u00020\u0006"}, d2 = {"Landroidx/compose/foundation/text/input/TextHighlightType;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class TextHighlightType {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.input.TextHighlightType.Companion INSTANCE = new androidx.compose.foundation.text.input.TextHighlightType.Companion(null);
    private static final int HandwritingSelectPreview = 0;
    private static final int HandwritingDeletePreview = 1;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2188equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/foundation/text/input/TextHighlightType$Companion;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/TextHighlightType;", "HandwritingSelectPreview", com.visa.cbp.getEncExpo.warmup, "getHandwritingSelectPreview-s-xJuwY", "()I", "HandwritingDeletePreview", "getHandwritingDeletePreview-s-xJuwY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getHandwritingSelectPreview-s-xJuwY, reason: not valid java name */
        public final int m2193getHandwritingSelectPreviewsxJuwY() {
            return androidx.compose.foundation.text.input.TextHighlightType.HandwritingSelectPreview;
        }

        /* renamed from: getHandwritingDeletePreview-s-xJuwY, reason: not valid java name */
        public final int m2192getHandwritingDeletePreviewsxJuwY() {
            return androidx.compose.foundation.text.input.TextHighlightType.HandwritingDeletePreview;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ TextHighlightType(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String toString() {
        return m2190toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final int hashCode() {
        return m2189hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m2187equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2190toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextHighlightType(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2189hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2187equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.text.input.TextHighlightType) && i == ((androidx.compose.foundation.text.input.TextHighlightType) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.text.input.TextHighlightType m2186boximpl(int i) {
        return new androidx.compose.foundation.text.input.TextHighlightType(i);
    }
}
