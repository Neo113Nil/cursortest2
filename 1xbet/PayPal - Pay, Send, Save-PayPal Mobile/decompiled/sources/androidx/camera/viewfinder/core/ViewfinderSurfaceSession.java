package androidx.camera.viewfinder.core;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Landroidx/camera/viewfinder/core/ViewfinderSurfaceSession;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "request", "Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "getRequest", "()Landroidx/camera/viewfinder/core/ViewfinderSurfaceRequest;", "viewfinder-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ViewfinderSurfaceSession extends java.lang.AutoCloseable {
    androidx.camera.viewfinder.core.ViewfinderSurfaceRequest getRequest();

    android.view.Surface getSurface();
}
