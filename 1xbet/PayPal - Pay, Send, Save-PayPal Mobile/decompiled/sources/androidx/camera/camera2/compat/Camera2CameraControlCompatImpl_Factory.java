package androidx.camera.camera2.compat;

/* loaded from: classes6.dex */
public final class Camera2CameraControlCompatImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.compat.Camera2CameraControlCompatImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.Camera2CameraControlCompatImpl get() {
        return newInstance();
    }

    public static androidx.camera.camera2.compat.Camera2CameraControlCompatImpl_Factory create() {
        return androidx.camera.camera2.compat.Camera2CameraControlCompatImpl_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static androidx.camera.camera2.compat.Camera2CameraControlCompatImpl newInstance() {
        return new androidx.camera.camera2.compat.Camera2CameraControlCompatImpl();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.compat.Camera2CameraControlCompatImpl_Factory Camera2StreamConfigurationMap = new androidx.camera.camera2.compat.Camera2CameraControlCompatImpl_Factory();

        private InstanceHolder() {
        }
    }
}
