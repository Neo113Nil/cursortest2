package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class ZslControlImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.ZslControlImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighSpeedVideoFpsRanges;

    private ZslControlImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.ZslControlImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.adapter.ZslControlImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        return new androidx.camera.camera2.adapter.ZslControlImpl_Factory(provider);
    }

    public static androidx.camera.camera2.adapter.ZslControlImpl newInstance(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        return new androidx.camera.camera2.adapter.ZslControlImpl(cameraProperties);
    }
}
