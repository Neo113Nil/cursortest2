package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\n\u0018\u00002\u00020\u0001R.\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1;", "Landroid/view/SurfaceView;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "attachedState", "Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", "getAttachedState", "()Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;", "setAttachedState", "(Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceState;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1 extends android.view.SurfaceView {
    private androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState attachedState;

    ViewfinderExternalSurfaceKt$ViewfinderExternalSurface$1$1$1(android.content.Context context) {
        super(context);
    }

    public final androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState getAttachedState() {
        return this.attachedState;
    }

    public final void setAttachedState(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState) {
        if (viewfinderExternalSurfaceState == null) {
            androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceState viewfinderExternalSurfaceState2 = this.attachedState;
            if (viewfinderExternalSurfaceState2 != null) {
                getHolder().removeCallback(viewfinderExternalSurfaceState2);
            }
        } else {
            getHolder().addCallback(viewfinderExternalSurfaceState);
        }
        this.attachedState = viewfinderExternalSurfaceState;
    }
}
