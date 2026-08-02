package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class CameraStateAdapter_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.CameraStateAdapter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.CameraStateAdapter get() {
        return newInstance();
    }

    public static androidx.camera.camera2.adapter.CameraStateAdapter_Factory create() {
        return androidx.camera.camera2.adapter.CameraStateAdapter_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static androidx.camera.camera2.adapter.CameraStateAdapter newInstance() {
        return new androidx.camera.camera2.adapter.CameraStateAdapter();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.adapter.CameraStateAdapter_Factory getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.adapter.CameraStateAdapter_Factory();

        private InstanceHolder() {
        }
    }
}
