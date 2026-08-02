package androidx.constraintlayout.compose.carousel;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017"}, d2 = {"Landroidx/constraintlayout/compose/carousel/ResistanceConfig;", "", "", "basis", "factorAtMin", "factorAtMax", "<init>", "(FFF)V", "overflow", "computeResistance", "(F)F", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getBasis", "()F", "getFactorAtMax", "getFactorAtMin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ResistanceConfig {
    public static final int $stable = 0;
    private final float basis;
    private final float factorAtMax;
    private final float factorAtMin;

    public ResistanceConfig(float f, float f2, float f3) {
        this.basis = f;
        this.factorAtMin = f2;
        this.factorAtMax = f3;
    }

    public /* synthetic */ ResistanceConfig(float f, float f2, float f3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(f, (i & 2) != 0 ? 10.0f : f2, (i & 4) != 0 ? 10.0f : f3);
    }

    public final float getBasis() {
        return this.basis;
    }

    public final float getFactorAtMin() {
        return this.factorAtMin;
    }

    public final float getFactorAtMax() {
        return this.factorAtMax;
    }

    public final float computeResistance(float overflow) {
        float f = overflow < 0.0f ? this.factorAtMin : this.factorAtMax;
        if (f == 0.0f) {
            return 0.0f;
        }
        return (this.basis / f) * ((float) java.lang.Math.sin((kotlin.ranges.RangesKt.coerceIn(overflow / this.basis, -1.0f, 1.0f) * 3.1415927f) / 2.0f));
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.constraintlayout.compose.carousel.ResistanceConfig)) {
            return false;
        }
        androidx.constraintlayout.compose.carousel.ResistanceConfig resistanceConfig = (androidx.constraintlayout.compose.carousel.ResistanceConfig) other;
        return this.basis == resistanceConfig.basis && this.factorAtMin == resistanceConfig.factorAtMin && this.factorAtMax == resistanceConfig.factorAtMax;
    }

    public final int hashCode() {
        return (((java.lang.Float.hashCode(this.basis) * 31) + java.lang.Float.hashCode(this.factorAtMin)) * 31) + java.lang.Float.hashCode(this.factorAtMax);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResistanceConfig(basis=");
        sb.append(this.basis);
        sb.append(", factorAtMin=");
        sb.append(this.factorAtMin);
        sb.append(", factorAtMax=");
        sb.append(this.factorAtMax);
        sb.append(')');
        return sb.toString();
    }
}
