package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0014\u0010\n\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/viewfinder/core/impl/CloseGuardApi30Impl;", "Landroidx/camera/viewfinder/core/impl/CloseGuardImpl;", "<init>", "()V", "", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Ljava/lang/String;)V", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroid/util/CloseGuard;", "getHighSpeedVideoFpsRanges", "Landroid/util/CloseGuard;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CloseGuardApi30Impl implements androidx.camera.viewfinder.core.impl.CloseGuardImpl {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.util.CloseGuard Camera2StreamConfigurationMap = new android.util.CloseGuard();

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public final void getHighResolutionOutputSizeshNQ4ISI(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.Camera2StreamConfigurationMap.open(p0);
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public final void getHighSpeedVideoFpsRangesFor() {
        this.Camera2StreamConfigurationMap.close();
    }

    @Override // androidx.camera.viewfinder.core.impl.CloseGuardImpl
    public final void Camera2StreamConfigurationMap() {
        this.Camera2StreamConfigurationMap.warnIfOpen();
    }
}
