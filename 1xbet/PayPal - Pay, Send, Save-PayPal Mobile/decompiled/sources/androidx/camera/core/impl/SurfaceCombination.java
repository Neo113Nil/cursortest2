package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class SurfaceCombination {
    private final java.util.List<androidx.camera.core.impl.SurfaceConfig> getHighSpeedVideoFpsRangesFor;

    public SurfaceCombination() {
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    public SurfaceCombination(androidx.camera.core.impl.SurfaceConfig... surfaceConfigArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighSpeedVideoFpsRangesFor = arrayList;
        java.util.Collections.addAll(arrayList, surfaceConfigArr);
    }

    private static void Camera2StreamConfigurationMap(java.util.List<int[]> list, int i, int[] iArr, int i2) {
        int i3;
        if (i2 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i4 = 0; i4 < i; i4++) {
            while (true) {
                if (i3 < i2) {
                    i3 = i4 != iArr[i3] ? i3 + 1 : 0;
                } else {
                    iArr[i2] = i4;
                    Camera2StreamConfigurationMap(list, i, iArr, i2 + 1);
                    break;
                }
            }
        }
    }

    public final boolean addSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.getHighSpeedVideoFpsRangesFor.add(surfaceConfig);
    }

    public final boolean removeSurfaceConfig(androidx.camera.core.impl.SurfaceConfig surfaceConfig) {
        return this.getHighSpeedVideoFpsRangesFor.remove(surfaceConfig);
    }

    public final java.util.List<androidx.camera.core.impl.SurfaceConfig> getSurfaceConfigList() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<androidx.camera.core.impl.SurfaceConfig> getOrderedSupportedSurfaceConfigList(java.util.List<androidx.camera.core.impl.SurfaceConfig> list) {
        if (list.isEmpty()) {
            return new java.util.ArrayList();
        }
        if (list.size() != this.getHighSpeedVideoFpsRangesFor.size()) {
            return null;
        }
        int size = this.getHighSpeedVideoFpsRangesFor.size();
        java.util.ArrayList<int[]> arrayList = new java.util.ArrayList();
        Camera2StreamConfigurationMap(arrayList, size, new int[size], 0);
        androidx.camera.core.impl.SurfaceConfig[] surfaceConfigArr = new androidx.camera.core.impl.SurfaceConfig[list.size()];
        for (int[] iArr : arrayList) {
            boolean z = true;
            for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor.size(); i++) {
                if (iArr[i] < list.size()) {
                    z &= this.getHighSpeedVideoFpsRangesFor.get(i).isSupported(list.get(iArr[i]));
                    if (!z) {
                        break;
                    }
                    surfaceConfigArr[iArr[i]] = this.getHighSpeedVideoFpsRangesFor.get(i);
                }
            }
            if (z) {
                return java.util.Arrays.asList(surfaceConfigArr);
            }
        }
        return null;
    }
}
