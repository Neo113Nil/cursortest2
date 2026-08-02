package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\t\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00128\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/ViewfinderEmbeddedExternalSurfaceHolder;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceHolder;", "Landroid/graphics/SurfaceTexture;", "p0", "<init>", "(Landroid/graphics/SurfaceTexture;)V", "", "detach", "()V", "getHighSpeedVideoFpsRanges", "Landroid/graphics/SurfaceTexture;", "getHighSpeedVideoSizes", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "Landroid/view/Surface;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "getRefCountedSurface", "()Landroidx/camera/viewfinder/core/impl/RefCounted;", "", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewfinderEmbeddedExternalSurfaceHolder implements androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder {
    private final androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface> getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.viewfinder.core.impl.RefCounted<>(false, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder.Camera2StreamConfigurationMap(androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder.this, (android.view.Surface) obj);
        }
    }, 1, null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final android.graphics.SurfaceTexture getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public boolean getHighSpeedVideoFpsRanges;

    public ViewfinderEmbeddedExternalSurfaceHolder(android.graphics.SurfaceTexture surfaceTexture) {
        this.getHighSpeedVideoSizes = surfaceTexture;
        getRefCountedSurface().initialize(new android.view.Surface(surfaceTexture));
    }

    @Override // androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder
    public final androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface> getRefCountedSurface() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder
    public final void detach() {
        if (this.getHighSpeedVideoFpsRanges) {
            return;
        }
        getRefCountedSurface().release();
        this.getHighSpeedVideoFpsRanges = true;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.camera.viewfinder.compose.internal.ViewfinderEmbeddedExternalSurfaceHolder viewfinderEmbeddedExternalSurfaceHolder, android.view.Surface surface) {
        surface.release();
        viewfinderEmbeddedExternalSurfaceHolder.getHighSpeedVideoSizes.release();
        return kotlin.Unit.INSTANCE;
    }
}
