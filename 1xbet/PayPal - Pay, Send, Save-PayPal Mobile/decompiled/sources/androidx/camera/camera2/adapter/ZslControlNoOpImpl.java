package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/camera/camera2/adapter/ZslControlNoOpImpl;", "Landroidx/camera/camera2/adapter/ZslControl;", "<init>", "()V", "Landroidx/camera/core/impl/SessionConfig$Builder;", "sessionConfigBuilder", "", "addZslConfig", "(Landroidx/camera/core/impl/SessionConfig$Builder;)V", "clearZslConfig", "Landroidx/camera/core/impl/DeferrableSurface;", "surface", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "isZslSurface", "(Landroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/core/impl/SessionConfig;)Z", "disabled", "setZslDisabledByUserCaseConfig", "(Z)V", "isZslDisabledByUserCaseConfig", "()Z", "setZslDisabledByFlashMode", "isZslDisabledByFlashMode", "Landroidx/camera/core/ImageProxy;", "dequeueImageFromBuffer", "()Landroidx/camera/core/ImageProxy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ZslControlNoOpImpl implements androidx.camera.camera2.adapter.ZslControl {
    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void clearZslConfig() {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final androidx.camera.core.ImageProxy dequeueImageFromBuffer() {
        return null;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByFlashMode() {
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslDisabledByUserCaseConfig() {
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByFlashMode(boolean disabled) {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void setZslDisabledByUserCaseConfig(boolean disabled) {
    }

    @javax.inject.Inject
    public ZslControlNoOpImpl() {
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final boolean isZslSurface(androidx.camera.core.impl.DeferrableSurface surface, androidx.camera.core.impl.SessionConfig sessionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfig, "");
        return false;
    }

    @Override // androidx.camera.camera2.adapter.ZslControl
    public final void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder sessionConfigBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionConfigBuilder, "");
    }
}
