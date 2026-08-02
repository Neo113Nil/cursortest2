package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidDevicePolicyManagerWrapper;", "Landroidx/camera/camera2/pipe/compat/DevicePolicyManagerWrapper;", "Landroid/app/admin/DevicePolicyManager;", "devicePolicyManager", "<init>", "(Landroid/app/admin/DevicePolicyManager;)V", "getHighSpeedVideoFpsRangesFor", "Landroid/app/admin/DevicePolicyManager;", "getHighSpeedVideoSizes", "", "getCamerasDisabled", "()Z", "camerasDisabled"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidDevicePolicyManagerWrapper implements androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.app.admin.DevicePolicyManager getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AndroidDevicePolicyManagerWrapper(android.app.admin.DevicePolicyManager devicePolicyManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(devicePolicyManager, "");
        this.getHighSpeedVideoSizes = devicePolicyManager;
    }

    @Override // androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper
    public final boolean getCamerasDisabled() {
        androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
        try {
            android.os.Trace.beginSection("DevicePolicyManager#getCameraDisabled");
            return this.getHighSpeedVideoSizes.getCameraDisabled(null);
        } finally {
            android.os.Trace.endSection();
        }
    }
}
