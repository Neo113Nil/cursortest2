package O9;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import java.io.IOException;

/* loaded from: classes9.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private SurfaceHolder f20113a;

    /* renamed from: b, reason: collision with root package name */
    private SurfaceTexture f20114b;

    public h(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalArgumentException("surfaceHolder may not be null");
        }
        this.f20113a = surfaceHolder;
    }

    public final void a(Camera camera) throws IOException {
        SurfaceHolder surfaceHolder = this.f20113a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f20114b);
        }
    }

    public h(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f20114b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }
}
