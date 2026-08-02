package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2ErrorProcessor_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor_Factory create() {
        return androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor newInstance() {
        return new androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor_Factory getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.compat.Camera2ErrorProcessor_Factory();

        private InstanceHolder() {
        }
    }
}
