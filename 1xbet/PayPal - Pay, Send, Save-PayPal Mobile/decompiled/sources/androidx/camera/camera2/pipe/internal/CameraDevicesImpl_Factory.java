package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class CameraDevicesImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.CameraDevicesImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> getHighSpeedVideoFpsRanges;

    private CameraDevicesImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.CameraDevicesImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.internal.CameraDevicesImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider) {
        return new androidx.camera.camera2.pipe.internal.CameraDevicesImpl_Factory(provider);
    }

    public static androidx.camera.camera2.pipe.internal.CameraDevicesImpl newInstance(androidx.camera.camera2.pipe.CameraBackends cameraBackends) {
        return new androidx.camera.camera2.pipe.internal.CameraDevicesImpl(cameraBackends);
    }
}
