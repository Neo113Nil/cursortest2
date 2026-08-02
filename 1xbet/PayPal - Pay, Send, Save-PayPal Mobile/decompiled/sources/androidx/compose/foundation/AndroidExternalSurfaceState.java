package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\nR\u0016\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/AndroidExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/SurfaceHolder$Callback;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/view/SurfaceHolder;", "", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "", "p1", "p2", "p3", "surfaceChanged", "(Landroid/view/SurfaceHolder;III)V", "surfaceDestroyed", "getHighSpeedVideoSizes", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidExternalSurfaceState extends androidx.compose.foundation.BaseAndroidExternalSurfaceState implements android.view.SurfaceHolder.Callback {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    public int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public int getHighSpeedVideoFpsRangesFor;

    public AndroidExternalSurfaceState(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.getHighSpeedVideoFpsRangesFor = -1;
        this.getHighSpeedVideoFpsRanges = -1;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(android.view.SurfaceHolder p0) {
        android.graphics.Rect surfaceFrame = p0.getSurfaceFrame();
        this.getHighSpeedVideoFpsRangesFor = surfaceFrame.width();
        this.getHighSpeedVideoFpsRanges = surfaceFrame.height();
        getHighSpeedVideoFpsRanges(p0.getSurface(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(android.view.SurfaceHolder p0, int p1, int p2, int p3) {
        if (this.getHighSpeedVideoFpsRangesFor == p2 && this.getHighSpeedVideoFpsRanges == p3) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor = p2;
        this.getHighSpeedVideoFpsRanges = p3;
        getHighResolutionOutputSizeshNQ4ISI(p0.getSurface(), p2, p3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(android.view.SurfaceHolder p0) {
        getHighSpeedVideoSizes(p0.getSurface());
    }
}
