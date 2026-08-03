package androidx.compose.foundation;

/* compiled from: AndroidExternalSurface.android.kt */
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0016H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\u00020\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "Landroidx/compose/foundation/BaseAndroidExternalSurfaceState;", "Landroid/view/TextureView$SurfaceTextureListener;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "()Landroid/graphics/Matrix;", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "getSurfaceSize-YbymL2g", "()J", "setSurfaceSize-ozmzZPI", "(J)V", "J", "surfaceTextureSurface", "Landroid/view/Surface;", "onSurfaceTextureAvailable", "", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "width", "", "height", "onSurfaceTextureDestroyed", "", "onSurfaceTextureSizeChanged", "onSurfaceTextureUpdated", "surface", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidEmbeddedExternalSurfaceState extends androidx.compose.foundation.BaseAndroidExternalSurfaceState implements android.view.TextureView.SurfaceTextureListener {
    private final android.graphics.Matrix matrix;
    private long surfaceSize;
    private android.view.Surface surfaceTextureSurface;

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
    }

    public AndroidEmbeddedExternalSurfaceState(kotlinx.coroutines.CoroutineScope coroutineScope) {
        super(coroutineScope);
        this.surfaceSize = androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g();
        this.matrix = new android.graphics.Matrix();
    }

    /* renamed from: getSurfaceSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSurfaceSize() {
        return this.surfaceSize;
    }

    /* renamed from: setSurfaceSize-ozmzZPI, reason: not valid java name */
    public final void m196setSurfaceSizeozmzZPI(long j) {
        this.surfaceSize = j;
    }

    public final android.graphics.Matrix getMatrix() {
        return this.matrix;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
        if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.surfaceSize, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
            width = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.surfaceSize);
            height = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(width, height);
        }
        android.view.Surface surface = new android.view.Surface(surfaceTexture);
        this.surfaceTextureSurface = surface;
        dispatchSurfaceCreated(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int width, int height) {
        if (!androidx.compose.ui.unit.IntSize.m4650equalsimpl0(this.surfaceSize, androidx.compose.ui.unit.IntSize.INSTANCE.m4657getZeroYbymL2g())) {
            width = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(this.surfaceSize);
            height = androidx.compose.ui.unit.IntSize.m4651getHeightimpl(this.surfaceSize);
            surfaceTexture.setDefaultBufferSize(width, height);
        }
        android.view.Surface surface = this.surfaceTextureSurface;
        kotlin.jvm.internal.Intrinsics.checkNotNull(surface);
        dispatchSurfaceChanged(surface, width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
        android.view.Surface surface = this.surfaceTextureSurface;
        kotlin.jvm.internal.Intrinsics.checkNotNull(surface);
        dispatchSurfaceDestroyed(surface);
        this.surfaceTextureSurface = null;
        return true;
    }
}
