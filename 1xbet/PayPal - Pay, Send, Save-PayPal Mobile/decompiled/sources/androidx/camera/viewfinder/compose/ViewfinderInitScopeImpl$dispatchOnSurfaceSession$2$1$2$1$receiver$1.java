package androidx.camera.viewfinder.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/viewfinder/compose/ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "request", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getRequest", "()Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1 implements androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope, kotlinx.coroutines.CoroutineScope {
    private final /* synthetic */ kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;
    private final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest request;
    private final android.view.Surface surface;

    ViewfinderInitScopeImpl$dispatchOnSurfaceSession$2$1$2$1$receiver$1(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.camera.viewfinder.core.impl.ViewfinderSurfaceSessionImpl viewfinderSurfaceSessionImpl) {
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.surface = viewfinderSurfaceSessionImpl.getSurface();
        this.request = viewfinderSurfaceSessionImpl.getRequest();
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope
    public final android.view.Surface getSurface() {
        return this.surface;
    }

    @Override // androidx.camera.viewfinder.core.ViewfinderSurfaceSessionScope
    public final androidx.camera.viewfinder.core.ViewfinderSurfaceRequest getRequest() {
        return this.request;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* renamed from: getCoroutineContext */
    public final kotlin.coroutines.CoroutineContext getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRanges();
    }
}
