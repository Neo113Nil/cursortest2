package androidx.camera.camera2.adapter;

/* loaded from: classes6.dex */
public final class ZslControlNoOpImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.adapter.ZslControlNoOpImpl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.ZslControlNoOpImpl get() {
        return newInstance();
    }

    public static androidx.camera.camera2.adapter.ZslControlNoOpImpl_Factory create() {
        return androidx.camera.camera2.adapter.ZslControlNoOpImpl_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static androidx.camera.camera2.adapter.ZslControlNoOpImpl newInstance() {
        return new androidx.camera.camera2.adapter.ZslControlNoOpImpl();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.adapter.ZslControlNoOpImpl_Factory getHighSpeedVideoFpsRanges = new androidx.camera.camera2.adapter.ZslControlNoOpImpl_Factory();

        private InstanceHolder() {
        }
    }
}
