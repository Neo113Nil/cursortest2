package androidx.compose.material;

@kotlin.Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/compose/material/FixedThreshold;", "Landroidx/compose/material/ThresholdConfig;", "Landroidx/compose/ui/unit/Dp;", "offset", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "copy-0680j_4", "(F)Landroidx/compose/material/FixedThreshold;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FixedThreshold implements androidx.compose.material.ThresholdConfig {
    public static final int $stable = 0;
    private final float getHighSpeedVideoSizes;

    private FixedThreshold(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    @Override // androidx.compose.material.ThresholdConfig
    public final float computeThreshold(androidx.compose.ui.unit.Density density, float f, float f2) {
        return f + (density.mo1418toPx0680j_4(this.getHighSpeedVideoSizes) * java.lang.Math.signum(f2 - f));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FixedThreshold(getHighSpeedVideoSizes=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.getHighSpeedVideoSizes));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.material.FixedThreshold) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.getHighSpeedVideoSizes, ((androidx.compose.material.FixedThreshold) other).getHighSpeedVideoSizes);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final androidx.compose.material.FixedThreshold m2637copy0680j_4(float offset) {
        return new androidx.compose.material.FixedThreshold(offset, null);
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.material.FixedThreshold m2636copy0680j_4$default(androidx.compose.material.FixedThreshold fixedThreshold, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fixedThreshold.getHighSpeedVideoSizes;
        }
        return fixedThreshold.m2637copy0680j_4(f);
    }

    public /* synthetic */ FixedThreshold(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }
}
