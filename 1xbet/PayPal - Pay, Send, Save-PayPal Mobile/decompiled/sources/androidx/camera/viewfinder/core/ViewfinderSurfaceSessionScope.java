package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/ViewfinderSurfaceSessionScope;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "surface", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getRequest", "()Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "request"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewfinderSurfaceSessionScope extends kotlinx.coroutines.CoroutineScope {
    androidx.camera.viewfinder.core.ViewfinderSurfaceRequest getRequest();

    android.view.Surface getSurface();
}
