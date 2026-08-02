package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e"}, d2 = {"Landroidx/compose/ui/layout/FixedScale;", "Landroidx/compose/ui/layout/ContentScale;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(F)V", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "Landroidx/compose/ui/layout/ScaleFactor;", "computeScaleFactor-H7hwNQA", "(JJ)J", "computeScaleFactor", "component1", "()F", "copy", "(F)Landroidx/compose/ui/layout/FixedScale;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getValue"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FixedScale implements androidx.compose.ui.layout.ContentScale {
    public static final int $stable = 0;
    private final float value;

    public FixedScale(float f) {
        this.value = f;
    }

    public final float getValue() {
        return this.value;
    }

    @Override // androidx.compose.ui.layout.ContentScale
    /* renamed from: computeScaleFactor-H7hwNQA */
    public final long mo7350computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
        float f = this.value;
        return androidx.compose.ui.layout.ScaleFactor.m7452constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(f)));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FixedScale(value=");
        sb.append(this.value);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.layout.FixedScale) && java.lang.Float.compare(this.value, ((androidx.compose.ui.layout.FixedScale) other).value) == 0;
    }

    public final androidx.compose.ui.layout.FixedScale copy(float value) {
        return new androidx.compose.ui.layout.FixedScale(value);
    }

    /* renamed from: component1, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    public static /* synthetic */ androidx.compose.ui.layout.FixedScale copy$default(androidx.compose.ui.layout.FixedScale fixedScale, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fixedScale.value;
        }
        return fixedScale.copy(f);
    }
}
