package androidx.camera.core.featuregroup.impl.feature;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/FpsRangeFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "", "minFps", "maxFps", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getMinFps", "()I", "getMaxFps", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FpsRangeFeature extends androidx.camera.core.featuregroup.GroupableFeature {
    public static final android.util.Range<java.lang.Integer> DEFAULT_FPS_RANGE;
    private final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.FPS_RANGE;
    private final int maxFps;
    private final int minFps;

    public FpsRangeFeature(int i, int i2) {
        this.minFps = i;
        this.maxFps = i2;
    }

    public final int getMaxFps() {
        return this.maxFps;
    }

    public final int getMinFps() {
        return this.minFps;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FpsRangeFeature(minFps=");
        sb.append(this.minFps);
        sb.append(", maxFps=");
        sb.append(this.maxFps);
        sb.append(')');
        return sb.toString();
    }

    static {
        java.lang.Integer num = (java.lang.Comparable) 30;
        DEFAULT_FPS_RANGE = new android.util.Range<>(num, num);
    }
}
