package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AndroidDevicePolicyManagerWrapper_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper> {
    private final dagger.internal.Provider<android.app.admin.DevicePolicyManager> getHighSpeedVideoFpsRangesFor;

    private AndroidDevicePolicyManagerWrapper_Factory(dagger.internal.Provider<android.app.admin.DevicePolicyManager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper_Factory create(dagger.internal.Provider<android.app.admin.DevicePolicyManager> provider) {
        return new androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper_Factory(provider);
    }

    public static androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper newInstance(android.app.admin.DevicePolicyManager devicePolicyManager) {
        return new androidx.camera.camera2.pipe.compat.AndroidDevicePolicyManagerWrapper(devicePolicyManager);
    }
}
