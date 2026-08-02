package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\u00188\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/TextureView$SurfaceTextureListener;", "Lkotlinx/coroutines/CoroutineScope;", "p0", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "Landroid/graphics/SurfaceTexture;", "", "p1", "p2", "", "onSurfaceTextureAvailable", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureSizeChanged", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "Landroidx/compose/ui/unit/IntSize;", "getHighSpeedVideoSizes", "J", "Camera2StreamConfigurationMap", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "getHighSpeedVideoFpsRanges", "Landroid/view/Surface;", "getHighSpeedVideoFpsRangesFor", "Landroid/view/Surface;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AndroidEmbeddedExternalSurfaceState extends androidx.compose.foundation.BaseAndroidExternalSurfaceState implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.graphics.Matrix getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private android.view.Surface getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    long Camera2StreamConfigurationMap;

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(android.graphics.SurfaceTexture p0) {
    }

    public AndroidEmbeddedExternalSurfaceState(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.Camera2StreamConfigurationMap = androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g();
        this.getHighSpeedVideoFpsRanges = new android.graphics.Matrix();
    }

    /* renamed from: getHighSpeedVideoSizes, reason: from getter */
    public final android.graphics.Matrix getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture p0, int p1, int p2) {
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.Camera2StreamConfigurationMap, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            long j = this.Camera2StreamConfigurationMap;
            int i = (int) (j >> 32);
            p2 = (int) (j & 4294967295L);
            p0.setDefaultBufferSize(i, p2);
            p1 = i;
        }
        android.view.Surface surface = new android.view.Surface(p0);
        this.getHighResolutionOutputSizeshNQ4ISI = surface;
        getHighSpeedVideoFpsRanges(surface, p1, p2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture p0, int p1, int p2) {
        if (!androidx.compose.ui.unit.IntSize.m8770equalsimpl0(this.Camera2StreamConfigurationMap, androidx.compose.ui.unit.IntSize.INSTANCE.m8777getZeroYbymL2g())) {
            long j = this.Camera2StreamConfigurationMap;
            int i = (int) (j >> 32);
            p2 = (int) (j & 4294967295L);
            p0.setDefaultBufferSize(i, p2);
            p1 = i;
        }
        android.view.Surface surface = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(surface);
        getHighResolutionOutputSizeshNQ4ISI(surface, p1, p2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture p0) {
        android.view.Surface surface = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(surface);
        getHighSpeedVideoSizes(surface);
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        return true;
    }
}
