package androidx.compose.foundation.layout;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutData;", "", "", "fillCrossAxisFraction", "<init>", "(F)V", "component1", "()F", "copy", "(F)Landroidx/compose/foundation/layout/FlowLayoutData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getFillCrossAxisFraction", "setFillCrossAxisFraction"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FlowLayoutData {
    public static final int $stable = 8;
    private float fillCrossAxisFraction;

    public FlowLayoutData(float f) {
        this.fillCrossAxisFraction = f;
    }

    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public final void setFillCrossAxisFraction(float f) {
        this.fillCrossAxisFraction = f;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FlowLayoutData(fillCrossAxisFraction=");
        sb.append(this.fillCrossAxisFraction);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.fillCrossAxisFraction);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.foundation.layout.FlowLayoutData) && java.lang.Float.compare(this.fillCrossAxisFraction, ((androidx.compose.foundation.layout.FlowLayoutData) other).fillCrossAxisFraction) == 0;
    }

    public final androidx.compose.foundation.layout.FlowLayoutData copy(float fillCrossAxisFraction) {
        return new androidx.compose.foundation.layout.FlowLayoutData(fillCrossAxisFraction);
    }

    /* renamed from: component1, reason: from getter */
    public final float getFillCrossAxisFraction() {
        return this.fillCrossAxisFraction;
    }

    public static /* synthetic */ androidx.compose.foundation.layout.FlowLayoutData copy$default(androidx.compose.foundation.layout.FlowLayoutData flowLayoutData, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = flowLayoutData.fillCrossAxisFraction;
        }
        return flowLayoutData.copy(f);
    }
}
