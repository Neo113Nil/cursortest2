package androidx.camera.video;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0011\u0010\b\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/camera/video/GroupableFeatures;", "", "<init>", "()V", "Landroidx/camera/core/featuregroup/GroupableFeature;", "SD_RECORDING", "Landroidx/camera/core/featuregroup/GroupableFeature;", "HD_RECORDING", "FHD_RECORDING", "UHD_RECORDING", "VIDEO_STABILIZATION"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GroupableFeatures {
    public static final androidx.camera.core.featuregroup.GroupableFeature FHD_RECORDING;
    public static final androidx.camera.core.featuregroup.GroupableFeature HD_RECORDING;
    public static final androidx.camera.video.GroupableFeatures INSTANCE = new androidx.camera.video.GroupableFeatures();
    public static final androidx.camera.core.featuregroup.GroupableFeature SD_RECORDING;
    public static final androidx.camera.core.featuregroup.GroupableFeature UHD_RECORDING;
    public static final androidx.camera.core.featuregroup.GroupableFeature VIDEO_STABILIZATION;

    private GroupableFeatures() {
    }

    static {
        androidx.camera.video.Quality quality = androidx.camera.video.Quality.SD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quality, "");
        SD_RECORDING = new androidx.camera.video.featuregroup.RecordingQualityFeature(quality);
        androidx.camera.video.Quality quality2 = androidx.camera.video.Quality.HD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quality2, "");
        HD_RECORDING = new androidx.camera.video.featuregroup.RecordingQualityFeature(quality2);
        androidx.camera.video.Quality quality3 = androidx.camera.video.Quality.FHD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quality3, "");
        FHD_RECORDING = new androidx.camera.video.featuregroup.RecordingQualityFeature(quality3);
        androidx.camera.video.Quality quality4 = androidx.camera.video.Quality.UHD;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(quality4, "");
        UHD_RECORDING = new androidx.camera.video.featuregroup.RecordingQualityFeature(quality4);
        VIDEO_STABILIZATION = new androidx.camera.core.featuregroup.impl.feature.VideoStabilizationFeature(androidx.camera.core.impl.stabilization.VideoStabilization.ON);
    }
}
