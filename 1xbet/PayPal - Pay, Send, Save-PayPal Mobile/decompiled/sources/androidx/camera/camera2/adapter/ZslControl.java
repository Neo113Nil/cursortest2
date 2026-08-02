package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0015\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\rH&¢\u0006\u0004\b\u0016\u0010\u0014J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/adapter/ZslControl;", "", "Landroidx/camera/core/impl/SessionConfig$Builder;", "sessionConfigBuilder", "", "addZslConfig", "(Landroidx/camera/core/impl/SessionConfig$Builder;)V", "clearZslConfig", "()V", "Landroidx/camera/core/impl/DeferrableSurface;", "surface", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "isZslSurface", "(Landroidx/camera/core/impl/DeferrableSurface;Landroidx/camera/core/impl/SessionConfig;)Z", "disabled", "setZslDisabledByUserCaseConfig", "(Z)V", "isZslDisabledByUserCaseConfig", "()Z", "setZslDisabledByFlashMode", "isZslDisabledByFlashMode", "Landroidx/camera/core/ImageProxy;", "dequeueImageFromBuffer", "()Landroidx/camera/core/ImageProxy;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ZslControl {
    void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder sessionConfigBuilder);

    void clearZslConfig();

    androidx.camera.core.ImageProxy dequeueImageFromBuffer();

    boolean isZslDisabledByFlashMode();

    boolean isZslDisabledByUserCaseConfig();

    boolean isZslSurface(androidx.camera.core.impl.DeferrableSurface surface, androidx.camera.core.impl.SessionConfig sessionConfig);

    void setZslDisabledByFlashMode(boolean disabled);

    void setZslDisabledByUserCaseConfig(boolean disabled);
}
