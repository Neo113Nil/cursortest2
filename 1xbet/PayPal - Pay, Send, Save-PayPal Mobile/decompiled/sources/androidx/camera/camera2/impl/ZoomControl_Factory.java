package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class ZoomControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.ZoomControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> getHighSpeedVideoFpsRanges;

    private ZoomControl_Factory(dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.ZoomControl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.ZoomControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.compat.ZoomCompat> provider) {
        return new androidx.camera.camera2.impl.ZoomControl_Factory(provider);
    }

    public static androidx.camera.camera2.impl.ZoomControl newInstance(androidx.camera.camera2.compat.ZoomCompat zoomCompat) {
        return new androidx.camera.camera2.impl.ZoomControl(zoomCompat);
    }
}
