package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class VideoUsageControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.VideoUsageControl> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.VideoUsageControl get() {
        return newInstance();
    }

    public static androidx.camera.camera2.impl.VideoUsageControl_Factory create() {
        return androidx.camera.camera2.impl.VideoUsageControl_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static androidx.camera.camera2.impl.VideoUsageControl newInstance() {
        return new androidx.camera.camera2.impl.VideoUsageControl();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.impl.VideoUsageControl_Factory getHighSpeedVideoSizes = new androidx.camera.camera2.impl.VideoUsageControl_Factory();

        private InstanceHolder() {
        }
    }
}
