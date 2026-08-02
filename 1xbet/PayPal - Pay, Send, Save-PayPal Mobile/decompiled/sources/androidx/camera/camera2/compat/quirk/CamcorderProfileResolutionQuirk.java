package androidx.camera.camera2.compat.quirk;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\t"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk;", "Landroidx/camera/core/impl/Quirk;", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "streamConfigurationMapCompat", "<init>", "(Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;)V", "", "Landroid/util/Size;", "getSupportedResolutions", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/compat/StreamConfigurationMapCompat;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CamcorderProfileResolutionQuirk implements androidx.camera.core.impl.Quirk {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.Companion INSTANCE = new androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.StreamConfigurationMapCompat getHighSpeedVideoSizes;
    private final kotlin.Lazy getHighSpeedVideoFpsRanges;

    public CamcorderProfileResolutionQuirk(androidx.camera.camera2.compat.StreamConfigurationMapCompat streamConfigurationMapCompat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamConfigurationMapCompat, "");
        this.getHighSpeedVideoSizes = streamConfigurationMapCompat;
        this.getHighSpeedVideoFpsRanges = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.$r8$lambda$bXAkRXoJlahpxssqlwQqYY8ViaU(androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk.this);
            }
        });
    }

    private final java.util.List<android.util.Size> getHighResolutionOutputSizeshNQ4ISI() {
        return (java.util.List) this.getHighSpeedVideoFpsRanges.getValue();
    }

    public final java.util.List<android.util.Size> getSupportedResolutions() {
        return kotlin.collections.CollectionsKt.toList(getHighResolutionOutputSizeshNQ4ISI());
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/compat/quirk/CamcorderProfileResolutionQuirk$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "", "isEnabled", "(Landroidx/camera/camera2/pipe/CameraMetadata;)Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean isEnabled(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
            return androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraMetadata);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.util.List $r8$lambda$bXAkRXoJlahpxssqlwQqYY8ViaU(androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk) {
        java.util.List emptyList;
        android.util.Size[] outputSizes = camcorderProfileResolutionQuirk.getHighSpeedVideoSizes.getOutputSizes(34);
        if (outputSizes == null || (emptyList = kotlin.collections.ArraysKt.asList(outputSizes)) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        return emptyList;
    }
}
