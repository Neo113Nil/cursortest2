package com.miteksystems.misnap.camera.requirements;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/IdCameraSelectorFilter;", "Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "", "cameraId", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "cameraInfo", "<init>", "(Ljava/lang/String;Lcom/miteksystems/misnap/core/MiSnapCameraInfo;)V", "", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "cameraInfoList", "", "filterCameras", "(Ljava/util/List;)Ljava/util/List;", "getCameraInfo", "(Landroidx/camera/camera2/interop/Camera2CameraInfo;)Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class IdCameraSelectorFilter implements com.miteksystems.misnap.camera.requirements.CameraSelectorFilter {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.MiSnapCameraInfo getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final com.miteksystems.misnap.core.MiSnapCameraInfo getCameraInfo(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfo, "");
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.miteksystems.misnap.camera.requirements.CameraSelectorFilter
    public final java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filterCameras(java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> cameraInfoList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInfoList, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : cameraInfoList) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.camera.camera2.interop.Camera2CameraInfo) obj).getCameraId(), this.getHighSpeedVideoFpsRangesFor)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public IdCameraSelectorFilter(java.lang.String str, com.miteksystems.misnap.core.MiSnapCameraInfo miSnapCameraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighSpeedVideoFpsRanges = miSnapCameraInfo;
    }
}
