package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TargetAspectRatio;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "streamConfigurationMapCompat", "", "get", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;)I", "Companion", "Ratio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TargetAspectRatio {
    public static final int RATIO_16_9 = 1;
    public static final int RATIO_4_3 = 0;
    public static final int RATIO_MAX_JPEG = 2;
    public static final int RATIO_ORIGINAL = 3;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u001b\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000"}, d2 = {"Landroidx/camera/camera2/compat/workaround/TargetAspectRatio$Ratio;", ""}, k = 1, mv = {2, 1, 0}, xi = 48)
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(kotlin.annotation.AnnotationRetention.SOURCE)
    public @interface Ratio {
    }

    public final int get(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.compat.StreamConfigurationMapCompat streamConfigurationMapCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamConfigurationMapCompat, "");
        androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks = new androidx.camera.camera2.compat.quirk.CameraQuirks(cameraMetadata, streamConfigurationMapCompat);
        androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk nexus4AndroidLTargetAspectRatioQuirk = (androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class);
        if (nexus4AndroidLTargetAspectRatioQuirk != null) {
            return nexus4AndroidLTargetAspectRatioQuirk.getCorrectedAspectRatio();
        }
        androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk aspectRatioLegacyApi21Quirk = (androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk) cameraQuirks.getQuirks().get(androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk.class);
        if (aspectRatioLegacyApi21Quirk != null) {
            return aspectRatioLegacyApi21Quirk.getCorrectedAspectRatio();
        }
        return 3;
    }
}
