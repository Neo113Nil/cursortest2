package androidx.compose.material;

@kotlin.Deprecated(message = "Material's Swipeable has been replaced by Foundation's AnchoredDraggable APIs. Please see developer.android.com for an overview of the changes and a migration guide.")
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/compose/material/FractionalThreshold;", "Landroidx/compose/material/ThresholdConfig;", "", "fraction", "<init>", "(F)V", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "copy", "(F)Landroidx/compose/material/FractionalThreshold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FractionalThreshold implements androidx.compose.material.ThresholdConfig {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final float getHighResolutionOutputSizeshNQ4ISI;

    public FractionalThreshold(float f) {
        this.getHighResolutionOutputSizeshNQ4ISI = f;
    }

    @Override // androidx.compose.material.ThresholdConfig
    public final float computeThreshold(androidx.compose.ui.unit.Density density, float f, float f2) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FractionalThreshold(getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.material.FractionalThreshold) && java.lang.Float.compare(this.getHighResolutionOutputSizeshNQ4ISI, ((androidx.compose.material.FractionalThreshold) other).getHighResolutionOutputSizeshNQ4ISI) == 0;
    }

    public final androidx.compose.material.FractionalThreshold copy(float fraction) {
        return new androidx.compose.material.FractionalThreshold(fraction);
    }

    public static /* synthetic */ androidx.compose.material.FractionalThreshold copy$default(androidx.compose.material.FractionalThreshold fractionalThreshold, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fractionalThreshold.getHighResolutionOutputSizeshNQ4ISI;
        }
        return fractionalThreshold.copy(f);
    }
}
