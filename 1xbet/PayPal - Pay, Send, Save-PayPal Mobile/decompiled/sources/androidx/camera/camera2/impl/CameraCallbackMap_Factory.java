package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class CameraCallbackMap_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.CameraCallbackMap> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CameraCallbackMap get() {
        return newInstance();
    }

    public static androidx.camera.camera2.impl.CameraCallbackMap_Factory create() {
        return androidx.camera.camera2.impl.CameraCallbackMap_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.impl.CameraCallbackMap newInstance() {
        return new androidx.camera.camera2.impl.CameraCallbackMap();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.impl.CameraCallbackMap_Factory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.impl.CameraCallbackMap_Factory();

        private InstanceHolder() {
        }
    }
}
