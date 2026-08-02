package androidx.camera.viewfinder.core.impl;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\r\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Landroidx/camera/viewfinder/core/impl/ViewfinderSurfaceSessionImpl;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceSession;", "Landroid/view/Surface;", "surface", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "request", "Lkotlin/Function0;", "", "onClose", "<init>", "(Landroid/view/Surface;Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;Lkotlin/jvm/functions/Function0;)V", "close", "()V", "finalize", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getRequest", "()Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/jvm/functions/Function0;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/viewfinder/core/impl/CloseGuardHelper;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/core/impl/CloseGuardHelper;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderSurfaceSessionImpl implements androidx.camera.viewfinder.core.ViewfinderSurfaceSession {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    private final androidx.camera.viewfinder.core.impl.CloseGuardHelper getHighSpeedVideoSizes;
    private final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest request;
    private final android.view.Surface surface;

    public ViewfinderSurfaceSessionImpl(android.view.Surface surface, androidx.camera.viewfinder.core.ViewfinderSurfaceRequest viewfinderSurfaceRequest, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewfinderSurfaceRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.surface = surface;
        this.request = viewfinderSurfaceRequest;
        this.Camera2StreamConfigurationMap = function0;
        this.getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(false);
        androidx.camera.viewfinder.core.impl.CloseGuardHelper create = androidx.camera.viewfinder.core.impl.CloseGuardHelper.INSTANCE.create();
        create.open("close");
        this.getHighSpeedVideoSizes = create;
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSession
    public final android.view.Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSession
    public final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest getRequest() {
        return this.request;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoSizes.close();
        if (this.getHighSpeedVideoFpsRanges.getAndSet(true)) {
            return;
        }
        this.Camera2StreamConfigurationMap.invoke();
    }

    protected final void finalize() {
        this.getHighSpeedVideoSizes.warnIfOpen();
        close();
    }
}
