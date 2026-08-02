package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0003J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Landroidx/camera/camera2/impl/VideoUsageControl;", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "<init>", "()V", "", "incrementUsage", "decrementUsage", "reset", "", "isInVideoUsage", "()Z", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "requestControl", "Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "getRequestControl", "()Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;", "setRequestControl", "(Landroidx/camera/camera2/impl/UseCaseCameraRequestControl;)V", "Lkotlinx/atomicfu/AtomicInt;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoFpsRangesFor", "Bindings"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class VideoUsageControl implements androidx.camera.camera2.impl.UseCaseCameraControl {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicInt getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(0);
    private androidx.camera.camera2.impl.UseCaseCameraRequestControl requestControl;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/impl/VideoUsageControl$Bindings;", "", "<init>", "()V", "Landroidx/camera/camera2/impl/VideoUsageControl;", "videoUsageControl", "Landroidx/camera/camera2/impl/UseCaseCameraControl;", "provideControls", "(Landroidx/camera/camera2/impl/VideoUsageControl;)Landroidx/camera/camera2/impl/UseCaseCameraControl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @dagger.Module
    public static abstract class Bindings {
        @dagger.Binds
        @dagger.multibindings.IntoSet
        public abstract androidx.camera.camera2.impl.UseCaseCameraControl provideControls(androidx.camera.camera2.impl.VideoUsageControl videoUsageControl);
    }

    @javax.inject.Inject
    public VideoUsageControl() {
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final androidx.camera.camera2.impl.UseCaseCameraRequestControl getRequestControl() {
        return this.requestControl;
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void setRequestControl(androidx.camera.camera2.impl.UseCaseCameraRequestControl useCaseCameraRequestControl) {
        this.requestControl = useCaseCameraRequestControl;
    }

    public final void incrementUsage() {
        this.getHighSpeedVideoFpsRangesFor.incrementAndGet();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    public final void decrementUsage() {
        if (this.getHighSpeedVideoFpsRangesFor.decrementAndGet() < 0) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                return;
            }
            return;
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.camera2.impl.UseCaseCameraControl
    public final void reset() {
        this.getHighSpeedVideoFpsRangesFor.setValue(0);
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    public final boolean isInVideoUsage() {
        int value = this.getHighSpeedVideoFpsRangesFor.getValue();
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        return value > 0;
    }
}
