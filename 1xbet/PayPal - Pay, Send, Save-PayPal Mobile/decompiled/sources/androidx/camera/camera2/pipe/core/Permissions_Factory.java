package androidx.camera.camera2.pipe.core;

/* loaded from: classes6.dex */
public final class Permissions_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.core.Permissions> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private Permissions_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.core.Permissions get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.core.Permissions_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.pipe.core.Permissions_Factory(provider);
    }

    public static androidx.camera.camera2.pipe.core.Permissions newInstance(android.content.Context context) {
        return new androidx.camera.camera2.pipe.core.Permissions(context);
    }
}
