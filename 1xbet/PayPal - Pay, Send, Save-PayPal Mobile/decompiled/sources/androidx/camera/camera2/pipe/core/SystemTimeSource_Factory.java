package androidx.camera.camera2.pipe.core;

/* loaded from: classes6.dex */
public final class SystemTimeSource_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.core.SystemTimeSource> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.core.SystemTimeSource get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.core.SystemTimeSource_Factory create() {
        return androidx.camera.camera2.pipe.core.SystemTimeSource_Factory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static androidx.camera.camera2.pipe.core.SystemTimeSource newInstance() {
        return new androidx.camera.camera2.pipe.core.SystemTimeSource();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.core.SystemTimeSource_Factory getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.core.SystemTimeSource_Factory();

        private InstanceHolder() {
        }
    }
}
