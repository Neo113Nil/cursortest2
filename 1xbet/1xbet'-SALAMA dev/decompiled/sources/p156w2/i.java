package p156w2;

import A1.W;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import java.util.Locale;
import p151v2.a;
import p151v2.c;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f18020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f18021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Error f18022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RuntimeException f18023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public PlaceholderSurface f18024e;

    public final void a(int i7) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        this.f18020a.getClass();
        c cVar = this.f18020a;
        cVar.getClass();
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay == null) {
            throw new W("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new W("eglInitialize failed");
        }
        cVar.f17106c = eGLDisplayEglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, c.f17103x, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!zEglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i8 = t.f17159a;
            throw new W(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(cVar.f17106c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eGLContextEglCreateContext == null) {
            throw new W("eglCreateContext failed");
        }
        cVar.f17107d = eGLContextEglCreateContext;
        EGLDisplay eGLDisplay = cVar.f17106c;
        if (i7 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eGLSurfaceEglCreatePbufferSurface == null) {
                throw new W("eglCreatePbufferSurface failed");
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
            throw new W("eglMakeCurrent failed");
        }
        cVar.f17108e = eGLSurfaceEglCreatePbufferSurface;
        int[] iArr3 = cVar.f17105b;
        GLES20.glGenTextures(1, iArr3, 0);
        int i9 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            Log.e("GlUtil", "glError: " + GLU.gluErrorString(iGlGetError));
            i9 = iGlGetError;
        }
        if (i9 != 0) {
            Log.e("GlUtil", "glError: " + GLU.gluErrorString(i9));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        cVar.f17109f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(cVar);
        SurfaceTexture surfaceTexture2 = this.f18020a.f17109f;
        surfaceTexture2.getClass();
        this.f18024e = new PlaceholderSurface(this, surfaceTexture2, i7 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f18020a.getClass();
        c cVar = this.f18020a;
        cVar.f17104a.removeCallbacks(cVar);
        try {
            SurfaceTexture surfaceTexture = cVar.f17109f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, cVar.f17105b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = cVar.f17106c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = cVar.f17106c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = cVar.f17108e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(cVar.f17106c, cVar.f17108e);
            }
            EGLContext eGLContext = cVar.f17107d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(cVar.f17106c, eGLContext);
            }
            if (t.f17159a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = cVar.f17106c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(cVar.f17106c);
            }
            cVar.f17106c = null;
            cVar.f17107d = null;
            cVar.f17108e = null;
            cVar.f17109f = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i7 = message.what;
        try {
            if (i7 != 1) {
                if (i7 != 2) {
                    return true;
                }
                try {
                    b();
                } catch (Throwable th) {
                    try {
                        a.l("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                a(message.arg1);
                synchronized (this) {
                    notify();
                }
            } catch (Error e7) {
                a.l("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                this.f18022c = e7;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e8) {
                a.l("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                this.f18023d = e8;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
