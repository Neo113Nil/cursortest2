package androidx.camera.camera2.compat.workaround;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/compat/workaround/ExtraSupportedSurfaceCombinationsContainer;", "", "<init>", "()V", "", "cameraId", "", "Landroidx/camera/core/impl/SurfaceCombination;", "get", "(Ljava/lang/String;)Ljava/util/List;", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExtraSupportedSurfaceCombinationsContainer {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk Camera2StreamConfigurationMap = (androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class);

    public final java.util.List<androidx.camera.core.impl.SurfaceCombination> get(java.lang.String cameraId) {
        java.util.List<androidx.camera.core.impl.SurfaceCombination> extraSupportedSurfaceCombinations;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraId, "");
        androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk extraSupportedSurfaceCombinationsQuirk = this.Camera2StreamConfigurationMap;
        return (extraSupportedSurfaceCombinationsQuirk == null || (extraSupportedSurfaceCombinations = extraSupportedSurfaceCombinationsQuirk.getExtraSupportedSurfaceCombinations(cameraId)) == null) ? kotlin.collections.CollectionsKt.emptyList() : extraSupportedSurfaceCombinations;
    }
}
