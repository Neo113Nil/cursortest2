package androidx.camera.extensions;

/* loaded from: classes6.dex */
final class ExtensionCameraFilter implements androidx.camera.core.CameraFilter {
    private final androidx.camera.extensions.internal.VendorExtender Camera2StreamConfigurationMap;
    private final androidx.camera.core.impl.Identifier getHighSpeedVideoSizes;

    ExtensionCameraFilter(java.lang.String str, androidx.camera.extensions.internal.VendorExtender vendorExtender) {
        this.getHighSpeedVideoSizes = androidx.camera.core.impl.Identifier.create(str);
        this.Camera2StreamConfigurationMap = vendorExtender;
    }

    @Override // androidx.camera.core.CameraFilter
    public final androidx.camera.core.impl.Identifier getIdentifier() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.CameraFilter
    public final java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.CameraInfo cameraInfo : list) {
            androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = (androidx.camera.core.impl.CameraInfoInternal) cameraInfo;
            if (this.Camera2StreamConfigurationMap.isExtensionAvailable(cameraInfoInternal.getCameraId(), androidx.camera.extensions.internal.ExtensionsUtils.getCameraCharacteristicsMap(cameraInfoInternal))) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }
}
