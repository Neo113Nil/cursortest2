package androidx.camera.core.featuregroup.impl.feature;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00138\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Landroidx/camera/core/featuregroup/impl/feature/VideoStabilizationFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "videoStabilization", "<init>", "(Landroidx/camera/core/impl/stabilization/VideoStabilization;)V", "Landroidx/camera/core/impl/CameraInfoInternal;", "cameraInfoInternal", "Landroidx/camera/core/SessionConfig;", "sessionConfig", "", "isSupportedIndividually", "(Landroidx/camera/core/impl/CameraInfoInternal;Landroidx/camera/core/SessionConfig;)Z", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/core/impl/stabilization/VideoStabilization;", "getVideoStabilization", "()Landroidx/camera/core/impl/stabilization/VideoStabilization;", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoStabilizationFeature extends androidx.camera.core.featuregroup.GroupableFeature {
    public static final androidx.camera.core.impl.stabilization.VideoStabilization DEFAULT_STABILIZATION = androidx.camera.core.impl.stabilization.VideoStabilization.OFF;
    private final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal;
    private final androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization;

    public VideoStabilizationFeature(androidx.camera.core.impl.stabilization.VideoStabilization videoStabilization) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoStabilization, "");
        this.videoStabilization = videoStabilization;
        this.featureTypeInternal = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.VIDEO_STABILIZATION;
    }

    public final androidx.camera.core.impl.stabilization.VideoStabilization getVideoStabilization() {
        return this.videoStabilization;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final boolean isSupportedIndividually(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.camera.core.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoInternal, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        int i = androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature.WhenMappings.$EnumSwitchMapping$0[this.videoStabilization.ordinal()];
        if (i == 1) {
            return cameraInfoInternal.isVideoStabilizationSupported();
        }
        if (i == 2) {
            return cameraInfoInternal.isPreviewStabilizationSupported();
        }
        if (i == 3 || i == 4) {
            return true;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("VideoStabilizationFeature(mode=");
        sb.append(this.videoStabilization.name());
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.impl.stabilization.VideoStabilization.values().length];
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.ON.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.PREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.OFF.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.impl.stabilization.VideoStabilization.UNSPECIFIED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
