package androidx.camera.camera2.pipe.core;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0011\u0010\u000e\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/core/Permissions;", "", "Landroid/content/Context;", "cameraPipeContext", "<init>", "(Landroid/content/Context;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "", "Z", "getHighSpeedVideoSizes", "getHasCameraPermission", "()Z", "hasCameraPermission"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Permissions {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile boolean getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public Permissions(@androidx.camera.camera2.pipe.config.CameraPipeContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    public final boolean getHasCameraPermission() {
        if (kotlin.jvm.internal.Intrinsics.areEqual(android.os.Build.FINGERPRINT, "robolectric")) {
            return true;
        }
        if (!this.getHighSpeedVideoSizes) {
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.beginSection("CXCP#checkCameraPermission");
            if (this.Camera2StreamConfigurationMap.checkSelfPermission("android.permission.CAMERA") == 0) {
                this.getHighSpeedVideoSizes = true;
            }
            androidx.camera.camera2.pipe.core.Debug debug2 = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            android.os.Trace.endSection();
        }
        return this.getHighSpeedVideoSizes;
    }
}
