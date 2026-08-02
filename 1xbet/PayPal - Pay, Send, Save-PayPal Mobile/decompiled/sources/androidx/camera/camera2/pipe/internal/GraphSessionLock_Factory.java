package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class GraphSessionLock_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.GraphSessionLock> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.GraphSessionLock get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.internal.GraphSessionLock_Factory create() {
        return androidx.camera.camera2.pipe.internal.GraphSessionLock_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static androidx.camera.camera2.pipe.internal.GraphSessionLock newInstance() {
        return new androidx.camera.camera2.pipe.internal.GraphSessionLock();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.internal.GraphSessionLock_Factory getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.internal.GraphSessionLock_Factory();

        private InstanceHolder() {
        }
    }
}
