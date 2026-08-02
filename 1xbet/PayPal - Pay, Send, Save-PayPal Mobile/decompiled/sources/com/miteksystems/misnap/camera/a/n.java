package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013B\u0019\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/miteksystems/misnap/camera/a/n;", "Landroidx/camera/core/Preview$SurfaceProvider;", "Landroidx/camera/core/SurfaceRequest;", "request", "", "onSurfaceRequested", "Ljava/util/concurrent/Executor;", "a", "Ljava/util/concurrent/Executor;", "executor", "Landroid/view/Surface;", util.h.xy.cb.b.f1091, "Landroid/view/Surface;", "providedSurface", "Landroid/view/SurfaceHolder;", "c", "Landroid/view/SurfaceHolder;", "surfaceHolder", "<init>", "(Ljava/util/concurrent/Executor;)V", "surface", "(Landroid/view/Surface;Ljava/util/concurrent/Executor;)V", "(Landroid/view/SurfaceHolder;Ljava/util/concurrent/Executor;)V", "d", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class n implements androidx.camera.core.Preview.SurfaceProvider {
    private final java.util.concurrent.Executor getHighSpeedVideoFpsRanges;
    private android.view.Surface getHighSpeedVideoFpsRangesFor;
    private android.view.SurfaceHolder getHighSpeedVideoSizes;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(android.view.Surface surface, java.util.concurrent.Executor executor) {
        this(executor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoFpsRangesFor = surface;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(android.view.SurfaceHolder surfaceHolder, java.util.concurrent.Executor executor) {
        this(executor);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceHolder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
        this.getHighSpeedVideoSizes = surfaceHolder;
    }

    private n(java.util.concurrent.Executor executor) {
        this.getHighSpeedVideoFpsRanges = executor;
    }

    @Override // androidx.camera.core.Preview.SurfaceProvider
    public final /* synthetic */ void onSurfaceRequested(androidx.camera.core.SurfaceRequest request) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        android.view.SurfaceHolder surfaceHolder = this.getHighSpeedVideoSizes;
        if (surfaceHolder != null) {
            android.util.Size resolution = request.getResolution();
            surfaceHolder.setFixedSize(resolution.getWidth(), resolution.getHeight());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            android.view.Surface surface = surfaceHolder.getSurface();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surface, "");
            this.getHighSpeedVideoFpsRangesFor = surface;
        }
        android.view.Surface surface2 = this.getHighSpeedVideoFpsRangesFor;
        if (surface2 == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            surface2 = null;
        }
        request.provideSurface(surface2, this.getHighSpeedVideoFpsRanges, new androidx.core.util.Consumer() { // from class: com.miteksystems.misnap.camera.a.n$$ExternalSyntheticLambda0
            @Override // androidx.core.util.Consumer
            public final void accept(java.lang.Object obj) {
                ((androidx.camera.core.SurfaceRequest.Result) obj).getResultCode();
            }
        });
    }
}
