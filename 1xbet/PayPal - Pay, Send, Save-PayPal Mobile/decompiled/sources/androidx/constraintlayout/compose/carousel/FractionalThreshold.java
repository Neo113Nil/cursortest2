package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0016\u001a\u00020\u0002*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/constraintlayout/compose/carousel/FractionalThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "", "fraction", "<init>", "(F)V", "copy", "(F)Landroidx/constraintlayout/compose/carousel/FractionalThreshold;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "getHighSpeedVideoSizes", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FractionalThreshold implements androidx.constraintlayout.compose.carousel.ThresholdConfig {
    public static final int $stable = 0;
    private final float getHighSpeedVideoSizes;

    public FractionalThreshold(float f) {
        this.getHighSpeedVideoSizes = f;
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public final float computeThreshold(androidx.compose.ui.unit.Density density, float f, float f2) {
        return androidx.compose.ui.util.MathHelpersKt.lerp(f, f2, this.getHighSpeedVideoSizes);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FractionalThreshold(getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.constraintlayout.compose.carousel.FractionalThreshold) && java.lang.Float.compare(this.getHighSpeedVideoSizes, ((androidx.constraintlayout.compose.carousel.FractionalThreshold) other).getHighSpeedVideoSizes) == 0;
    }

    public final androidx.constraintlayout.compose.carousel.FractionalThreshold copy(float fraction) {
        return new androidx.constraintlayout.compose.carousel.FractionalThreshold(fraction);
    }

    public static /* synthetic */ androidx.constraintlayout.compose.carousel.FractionalThreshold copy$default(androidx.constraintlayout.compose.carousel.FractionalThreshold fractionalThreshold, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fractionalThreshold.getHighSpeedVideoSizes;
        }
        return fractionalThreshold.copy(f);
    }
}
