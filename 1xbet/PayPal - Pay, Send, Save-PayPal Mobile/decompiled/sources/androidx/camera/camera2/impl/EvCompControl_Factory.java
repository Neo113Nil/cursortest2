package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class EvCompControl_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.EvCompControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.EvCompCompat> getHighSpeedVideoFpsRangesFor;

    private EvCompControl_Factory(dagger.internal.Provider<androidx.camera.camera2.compat.EvCompCompat> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.EvCompControl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.impl.EvCompControl_Factory create(dagger.internal.Provider<androidx.camera.camera2.compat.EvCompCompat> provider) {
        return new androidx.camera.camera2.impl.EvCompControl_Factory(provider);
    }

    public static androidx.camera.camera2.impl.EvCompControl newInstance(androidx.camera.camera2.compat.EvCompCompat evCompCompat) {
        return new androidx.camera.camera2.impl.EvCompControl(evCompCompat);
    }
}
