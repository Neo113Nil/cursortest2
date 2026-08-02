package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class ComboRequestListener_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.ComboRequestListener> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.ComboRequestListener get() {
        return newInstance();
    }

    public static androidx.camera.camera2.impl.ComboRequestListener_Factory create() {
        return androidx.camera.camera2.impl.ComboRequestListener_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.impl.ComboRequestListener newInstance() {
        return new androidx.camera.camera2.impl.ComboRequestListener();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.impl.ComboRequestListener_Factory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.impl.ComboRequestListener_Factory();

        private InstanceHolder() {
        }
    }
}
