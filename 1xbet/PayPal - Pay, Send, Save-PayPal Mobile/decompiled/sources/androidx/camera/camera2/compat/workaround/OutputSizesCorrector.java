package androidx.camera.camera2.compat.workaround;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0004\b\r\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001f"}, d2 = {"Landroidx/camera/camera2/compat/workaround/OutputSizesCorrector;", "", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "streamConfigurationMap", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroid/hardware/camera2/params/StreamConfigurationMap;)V", "", "Landroid/util/Size;", "sizes", "", "format", "applyQuirks", "([Landroid/util/Size;I)[Landroid/util/Size;", "T", "Ljava/lang/Class;", "klass", "([Landroid/util/Size;Ljava/lang/Class;)[Landroid/util/Size;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Landroid/hardware/camera2/params/StreamConfigurationMap;", "", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "Landroidx/camera/camera2/compat/quirk/ExcludedSupportedSizesQuirk;", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedOutputSizeQuirk;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OutputSizesCorrector {
    private final android.hardware.camera2.params.StreamConfigurationMap Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges = "OutputSizesCorrector";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk getHighSpeedVideoSizes = (androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.class);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk getHighSpeedVideoFpsRangesFor = (androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.class);

    @javax.inject.Inject
    public OutputSizesCorrector(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        this.getHighResolutionOutputSizeshNQ4ISI = cameraMetadata;
        this.Camera2StreamConfigurationMap = streamConfigurationMap;
    }

    public final android.util.Size[] applyQuirks(android.util.Size[] sizes, int format) {
        androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizes, "");
        java.util.List mutableList = kotlin.collections.ArraysKt.toMutableList(sizes);
        androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.getHighSpeedVideoFpsRangesFor;
        if (extraSupportedOutputSizeQuirk != null) {
            android.util.Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(format);
            if (extraSupportedResolutions.length != 0) {
                kotlin.collections.CollectionsKt.addAll(mutableList, extraSupportedResolutions);
            }
        }
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cameraMetadata != null && (excludedSupportedSizesQuirk = this.getHighSpeedVideoSizes) != null) {
            java.util.List<android.util.Size> excludedSizes = excludedSupportedSizesQuirk.getExcludedSizes(cameraMetadata.mo411getCameraDz_R5H8(), format);
            if (!excludedSizes.isEmpty()) {
                mutableList.removeAll(excludedSizes);
            }
        }
        if (mutableList.isEmpty()) {
            androidx.camera.core.Logger.w(this.getHighSpeedVideoFpsRanges, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) mutableList.toArray(new android.util.Size[0]);
    }

    public final <T> android.util.Size[] applyQuirks(android.util.Size[] sizes, java.lang.Class<T> klass) {
        androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sizes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(klass, "");
        java.util.List mutableList = kotlin.collections.ArraysKt.toMutableList(sizes);
        androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.getHighSpeedVideoFpsRangesFor;
        if (extraSupportedOutputSizeQuirk != null) {
            android.util.Size[] extraSupportedResolutions = extraSupportedOutputSizeQuirk.getExtraSupportedResolutions(klass);
            if (extraSupportedResolutions.length != 0) {
                kotlin.collections.CollectionsKt.addAll(mutableList, extraSupportedResolutions);
            }
        }
        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = this.getHighResolutionOutputSizeshNQ4ISI;
        if (cameraMetadata != null && (excludedSupportedSizesQuirk = this.getHighSpeedVideoSizes) != null) {
            java.util.List<android.util.Size> excludedSizes = excludedSupportedSizesQuirk.getExcludedSizes(cameraMetadata.mo411getCameraDz_R5H8(), (java.lang.Class<?>) klass);
            if (!excludedSizes.isEmpty()) {
                mutableList.removeAll(excludedSizes);
            }
        }
        if (mutableList.isEmpty()) {
            androidx.camera.core.Logger.w(this.getHighSpeedVideoFpsRanges, "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (android.util.Size[]) mutableList.toArray(new android.util.Size[0]);
    }
}
