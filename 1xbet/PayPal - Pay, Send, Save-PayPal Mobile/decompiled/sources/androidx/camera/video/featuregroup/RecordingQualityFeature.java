package androidx.camera.video.featuregroup;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/video/featuregroup/RecordingQualityFeature;", "Landroidx/camera/core/featuregroup/GroupableFeature;", "Landroidx/camera/video/Quality;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "<init>", "(Landroidx/camera/video/Quality;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/video/Quality;", "getQuality", "()Landroidx/camera/video/Quality;", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "featureTypeInternal", "Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;", "getFeatureTypeInternal", "()Landroidx/camera/core/featuregroup/impl/feature/FeatureTypeInternal;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RecordingQualityFeature extends androidx.camera.core.featuregroup.GroupableFeature {
    private final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal featureTypeInternal;
    private final androidx.camera.video.Quality quality;

    public RecordingQualityFeature(androidx.camera.video.Quality quality) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
        this.quality = quality;
        this.featureTypeInternal = androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal.RECORDING_QUALITY;
    }

    public final androidx.camera.video.Quality getQuality() {
        return this.quality;
    }

    @Override // androidx.camera.core.featuregroup.GroupableFeature
    public final androidx.camera.core.featuregroup.impl.feature.FeatureTypeInternal getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RecordingQualityFeature(quality=");
        sb.append(this.quality);
        sb.append(')');
        return sb.toString();
    }
}
