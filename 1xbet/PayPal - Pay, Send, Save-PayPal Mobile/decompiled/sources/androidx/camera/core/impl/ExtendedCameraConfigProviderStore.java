package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public final class ExtendedCameraConfigProviderStore {
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static final java.util.Map<java.lang.Object, androidx.camera.core.impl.CameraConfigProvider> getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();

    private ExtendedCameraConfigProviderStore() {
    }

    public static void addConfig(java.lang.Object obj, androidx.camera.core.impl.CameraConfigProvider cameraConfigProvider) {
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI.put(obj, cameraConfigProvider);
        }
    }

    public static androidx.camera.core.impl.CameraConfigProvider getConfigProvider(java.lang.Object obj) {
        androidx.camera.core.impl.CameraConfigProvider cameraConfigProvider;
        synchronized (getHighSpeedVideoFpsRanges) {
            cameraConfigProvider = getHighResolutionOutputSizeshNQ4ISI.get(obj);
        }
        return cameraConfigProvider == null ? androidx.camera.core.impl.CameraConfigProvider.EMPTY : cameraConfigProvider;
    }

    public static void clear() {
        synchronized (getHighSpeedVideoFpsRanges) {
            getHighResolutionOutputSizeshNQ4ISI.clear();
        }
    }
}
