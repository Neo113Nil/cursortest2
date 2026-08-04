package p151v2;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class c implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int[] f17103x = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f17104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17105b = new int[1];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EGLDisplay f17106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EGLContext f17107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EGLSurface f17108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceTexture f17109f;

    public c(Handler handler) {
        this.f17104a = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f17104a.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f17109f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
