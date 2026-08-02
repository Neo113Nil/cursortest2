package androidx.compose.ui.graphics.layer;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Landroidx/compose/ui/graphics/layer/SurfaceUtils;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "Landroid/graphics/Canvas;", "lockCanvas", "(Landroid/view/Surface;)Landroid/graphics/Canvas;", "", "isLockHardwareCanvasAvailable", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SurfaceUtils {
    public static final androidx.compose.ui.graphics.layer.SurfaceUtils INSTANCE = new androidx.compose.ui.graphics.layer.SurfaceUtils();
    public static final int $stable = 8;

    public final boolean isLockHardwareCanvasAvailable() {
        return true;
    }

    private SurfaceUtils() {
    }

    public final android.graphics.Canvas lockCanvas(android.view.Surface surface) {
        androidx.compose.ui.graphics.layer.SurfaceVerificationHelper surfaceVerificationHelper = androidx.compose.ui.graphics.layer.SurfaceVerificationHelper.INSTANCE;
        return androidx.compose.ui.graphics.layer.SurfaceVerificationHelper.getHighSpeedVideoFpsRanges(surface);
    }
}
