package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class LensFacingCameraFilter implements androidx.camera.core.CameraFilter {
    private final int getHighSpeedVideoSizes;

    public LensFacingCameraFilter(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // androidx.camera.core.CameraFilter
    public java.util.List<androidx.camera.core.CameraInfo> filter(java.util.List<androidx.camera.core.CameraInfo> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (androidx.camera.core.CameraInfo cameraInfo : list) {
            androidx.core.util.Preconditions.checkArgument(cameraInfo instanceof androidx.camera.core.impl.CameraInfoInternal, "The camera info doesn't contain internal implementation.");
            if (cameraInfo.getLensFacing() == this.getHighSpeedVideoSizes) {
                arrayList.add(cameraInfo);
            }
        }
        return arrayList;
    }

    public int getLensFacing() {
        return this.getHighSpeedVideoSizes;
    }
}
