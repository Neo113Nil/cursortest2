package androidx.camera.viewfinder.compose.internal;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0006@BX\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/camera/viewfinder/compose/internal/ViewfinderExternalSurfaceHolder;", "Landroidx/camera/viewfinder/compose/internal/ViewfinderSurfaceHolder;", "Landroid/view/Surface;", "p0", "", "p1", "p2", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "p3", "<init>", "(Landroid/view/Surface;IILandroidx/camera/viewfinder/core/impl/SurfaceControlCompat;)V", "", "detach", "()V", "getHighSpeedVideoFpsRanges", "Landroidx/camera/viewfinder/core/impl/SurfaceControlCompat;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "Camera2StreamConfigurationMap", "Landroidx/camera/viewfinder/core/impl/RefCounted;", "getRefCountedSurface", "()Landroidx/camera/viewfinder/core/impl/RefCounted;", "", "getHighSpeedVideoSizes", "Z", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ViewfinderExternalSurfaceHolder implements androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder {
    private final androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface> Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final androidx.camera.viewfinder.core.impl.SurfaceControlCompat getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    public boolean getHighResolutionOutputSizeshNQ4ISI;

    public ViewfinderExternalSurfaceHolder(final android.view.Surface surface, int i, int i2, androidx.camera.viewfinder.core.impl.SurfaceControlCompat surfaceControlCompat) {
        androidx.camera.viewfinder.core.impl.SurfaceControlCompat.Companion companion = androidx.camera.viewfinder.core.impl.SurfaceControlCompat.INSTANCE;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ViewfinderExternalSurfaceHolder-");
        sb.append(hashCode());
        androidx.camera.viewfinder.core.impl.SurfaceControlCompat create = companion.create(surfaceControlCompat, i, i2, sb.toString());
        this.getHighSpeedVideoFpsRangesFor = create;
        final android.view.Surface newSurface = create.newSurface();
        newSurface = newSurface == null ? surface : newSurface;
        this.Camera2StreamConfigurationMap = new androidx.camera.viewfinder.core.impl.RefCounted<>(false, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder.getHighSpeedVideoSizes(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder.this, newSurface, surface);
            }
        }, 1, null);
        getRefCountedSurface().initialize(newSurface);
    }

    @Override // androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder
    public final androidx.camera.viewfinder.core.impl.RefCounted<android.view.Surface> getRefCountedSurface() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.viewfinder.compose.internal.ViewfinderSurfaceHolder
    public final void detach() {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        this.getHighSpeedVideoFpsRangesFor.detach();
        getRefCountedSurface().release();
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(androidx.camera.viewfinder.compose.internal.ViewfinderExternalSurfaceHolder viewfinderExternalSurfaceHolder, android.view.Surface surface, android.view.Surface surface2) {
        viewfinderExternalSurfaceHolder.getHighSpeedVideoFpsRangesFor.detach();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(surface, surface2)) {
            surface.release();
        }
        return kotlin.Unit.INSTANCE;
    }
}
