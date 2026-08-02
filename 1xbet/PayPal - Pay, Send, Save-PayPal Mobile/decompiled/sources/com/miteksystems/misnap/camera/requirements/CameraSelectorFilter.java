package com.miteksystems.misnap.camera.requirements;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0003H&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/miteksystems/misnap/camera/requirements/CameraSelectorFilter;", "", "", "Landroidx/camera/camera2/interop/Camera2CameraInfo;", "cameraInfoList", "", "filterCameras", "(Ljava/util/List;)Ljava/util/List;", "cameraInfo", "Lcom/miteksystems/misnap/core/MiSnapCameraInfo;", "getCameraInfo", "(Landroidx/camera/camera2/interop/Camera2CameraInfo;)Lcom/miteksystems/misnap/core/MiSnapCameraInfo;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraSelectorFilter {
    java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> filterCameras(java.util.List<androidx.camera.camera2.interop.Camera2CameraInfo> cameraInfoList);

    com.miteksystems.misnap.core.MiSnapCameraInfo getCameraInfo(androidx.camera.camera2.interop.Camera2CameraInfo cameraInfo);
}
