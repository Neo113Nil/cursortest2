package androidx.camera.core.featuregroup.impl.feature;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/DynamicRangeFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "Landroidx/camera/core/DynamicRange;", "dynamicRange", "<init>", "(Landroidx/camera/core/DynamicRange;)V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "", "isSupportedIndividually", "(Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/SessionConfig;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/DynamicRange;", "getDynamicRange", "()Landroidx/camera/core/DynamicRange;", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicRangeFeature extends androidx.camera.core.featuregroup.GroupableFeature {
    public static final androidx.camera.core.DynamicRange DEFAULT_DYNAMIC_RANGE;
    private final androidx.camera.core.DynamicRange dynamicRange;
    private final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal;

    public DynamicRangeFeature(androidx.camera.core.DynamicRange dynamicRange) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicRange, "");
        this.dynamicRange = dynamicRange;
        this.featureTypeInternal = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.DYNAMIC_RANGE;
    }

    public final androidx.camera.core.DynamicRange getDynamicRange() {
        return this.dynamicRange;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final boolean isSupportedIndividually(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges = cameraInfoInternal.getSupportedDynamicRanges();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supportedDynamicRanges, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("isSupportedIndividually: cameraInfoSupportedDynamicRanges = ");
        sb.append(supportedDynamicRanges);
        sb.append(", this = ");
        sb.append(this);
        androidx.camera.core.Logger.d("DynamicRangeFeature", sb.toString());
        if (!supportedDynamicRanges.contains(this.dynamicRange)) {
            return false;
        }
        for (androidx.camera.core.UseCase useCase : sessionConfig.getUseCases()) {
            java.util.Set<androidx.camera.core.DynamicRange> supportedDynamicRanges2 = useCase.getSupportedDynamicRanges(cameraInfoInternal);
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("isSupportedIndividually: useCaseSupportedDynamicRanges = ");
            sb2.append(supportedDynamicRanges2);
            sb2.append(", this = ");
            sb2.append(this);
            sb2.append(", useCases = ");
            sb2.append(useCase);
            androidx.camera.core.Logger.d("DynamicRangeFeature", sb2.toString());
            if (supportedDynamicRanges2 != null && !supportedDynamicRanges2.contains(this.dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicRangeFeature(dynamicRange=");
        sb.append(this.dynamicRange);
        sb.append(')');
        return sb.toString();
    }

    static {
        androidx.camera.core.DynamicRange dynamicRange = androidx.camera.core.DynamicRange.SDR;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange, "");
        DEFAULT_DYNAMIC_RANGE = dynamicRange;
    }
}
