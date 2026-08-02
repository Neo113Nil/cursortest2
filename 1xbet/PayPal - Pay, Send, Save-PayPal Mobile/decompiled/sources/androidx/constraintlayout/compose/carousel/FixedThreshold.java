package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!"}, d2 = {"Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "Landroidx/constraintlayout/compose/carousel/ThresholdConfig;", "Landroidx/compose/ui/unit/Dp;", "offset", "<init>", "(FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-0680j_4", "(F)Landroidx/constraintlayout/compose/carousel/FixedThreshold;", "copy", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/unit/Density;", "", "fromValue", "toValue", "computeThreshold", "(Landroidx/compose/ui/unit/Density;FF)F", "Camera2StreamConfigurationMap", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class FixedThreshold implements androidx.constraintlayout.compose.carousel.ThresholdConfig {
    public static final int $stable = 0;
    private final float Camera2StreamConfigurationMap;

    private FixedThreshold(float f) {
        this.Camera2StreamConfigurationMap = f;
    }

    @Override // androidx.constraintlayout.compose.carousel.ThresholdConfig
    public final float computeThreshold(androidx.compose.ui.unit.Density density, float f, float f2) {
        return f + (density.mo1418toPx0680j_4(this.Camera2StreamConfigurationMap) * java.lang.Math.signum(f2 - f));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FixedThreshold(Camera2StreamConfigurationMap=");
        sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(this.Camera2StreamConfigurationMap));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return androidx.compose.ui.unit.Dp.m8607hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.constraintlayout.compose.carousel.FixedThreshold) && androidx.compose.ui.unit.Dp.m8606equalsimpl0(this.Camera2StreamConfigurationMap, ((androidx.constraintlayout.compose.carousel.FixedThreshold) other).Camera2StreamConfigurationMap);
    }

    /* renamed from: copy-0680j_4, reason: not valid java name */
    public final androidx.constraintlayout.compose.carousel.FixedThreshold m9050copy0680j_4(float offset) {
        return new androidx.constraintlayout.compose.carousel.FixedThreshold(offset, null);
    }

    /* renamed from: copy-0680j_4$default, reason: not valid java name */
    public static /* synthetic */ androidx.constraintlayout.compose.carousel.FixedThreshold m9049copy0680j_4$default(androidx.constraintlayout.compose.carousel.FixedThreshold fixedThreshold, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = fixedThreshold.Camera2StreamConfigurationMap;
        }
        return fixedThreshold.m9050copy0680j_4(f);
    }

    public /* synthetic */ FixedThreshold(float f, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f);
    }
}
