package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00168\u0007@\u0007X\u0086,¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00198\u0007@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", "Landroidx/camera/viewfinder/compose/internal/BaseViewfinderExternalSurfaceState;", "Landroid/view/SurfaceHolder$Callback;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/view/SurfaceHolder;", "", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "p1", "p2", "p3", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceView;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceHolder;", "Camera2StreamConfigurationMap", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceHolder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewfinderExternalSurfaceState extends androidx.camera.viewfinder.compose.internal.BaseViewfinderExternalSurfaceState implements android.view.SurfaceHolder.Callback {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public int getHighSpeedVideoFpsRangesFor;
    public int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    public android.view.SurfaceView getHighSpeedVideoSizes;

    public ViewfinderExternalSurfaceState(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.getHighSpeedVideoFpsRanges = -1;
        this.getHighSpeedVideoFpsRangesFor = -1;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder p0) {
        android.graphics.Rect surfaceFrame = p0.getSurfaceFrame();
        this.getHighSpeedVideoFpsRanges = surfaceFrame.width();
        this.getHighSpeedVideoFpsRangesFor = surfaceFrame.height();
        androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion companion = androidx.camera.viewfinder.core.impl.SurfaceControlCompat.INSTANCE;
        android.view.SurfaceView surfaceView = this.getHighSpeedVideoSizes;
        if (surfaceView == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            surfaceView = null;
        }
        androidx.camera.viewfinder.core.impl.SurfaceControlCompat wrap = companion.wrap(surfaceView);
        androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (viewfinderExternalSurfaceHolder != null) {
            if (!viewfinderExternalSurfaceHolder.getHighResolutionOutputSizeshNQ4ISI) {
                throw new java.lang.IllegalStateException("tryAttach() can only be called when detached".toString());
            }
            if (viewfinderExternalSurfaceHolder.getRefCountedSurface().acquire() != null) {
                if (viewfinderExternalSurfaceHolder.getHighSpeedVideoFpsRangesFor.reparent(wrap)) {
                    viewfinderExternalSurfaceHolder.getHighResolutionOutputSizeshNQ4ISI = false;
                    return;
                }
                viewfinderExternalSurfaceHolder.getRefCountedSurface().release();
            }
        }
        androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder2 = new androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder(p0.getSurface(), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor, wrap);
        this.getHighResolutionOutputSizeshNQ4ISI = viewfinderExternalSurfaceHolder2;
        dispatchSurfaceCreated(viewfinderExternalSurfaceHolder2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {
        this.getHighSpeedVideoFpsRanges = p2;
        this.getHighSpeedVideoFpsRangesFor = p3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder p0) {
        androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder = this.getHighResolutionOutputSizeshNQ4ISI;
        if (viewfinderExternalSurfaceHolder != null) {
            viewfinderExternalSurfaceHolder.detach();
        }
    }
}
