package w2;

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
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public final class i extends HandlerThread implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public v2.c f18014a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f18015b;

    /* renamed from: c, reason: collision with root package name */
    public Error f18016c;

    /* renamed from: d, reason: collision with root package name */
    public RuntimeException f18017d;

    /* renamed from: e, reason: collision with root package name */
    public PlaceholderSurface f18018e;

    public final void a(int i7) {
        EGLConfig eGLConfig;
        EGLSurface eglCreatePbufferSurface;
        this.f18014a.getClass();
        v2.c cVar = this.f18014a;
        cVar.getClass();
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new W("eglGetDisplay failed");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            throw new W("eglInitialize failed");
        }
        cVar.f17100c = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, v2.c.f17097x, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
            Object[] objArr = {Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i8 = t.f17153a;
            throw new W(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(cVar.f17100c, eGLConfig, EGL14.EGL_NO_CONTEXT, i7 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        if (eglCreateContext == null) {
            throw new W("eglCreateContext failed");
        }
        cVar.f17101d = eglCreateContext;
        EGLDisplay eGLDisplay = cVar.f17100c;
        if (i7 == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i7 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            if (eglCreatePbufferSurface == null) {
                throw new W("eglCreatePbufferSurface failed");
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext)) {
            throw new W("eglMakeCurrent failed");
        }
        cVar.f17102e = eglCreatePbufferSurface;
        int[] iArr3 = cVar.f17099b;
        GLES20.glGenTextures(1, iArr3, 0);
        int i9 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            Log.e("GlUtil", "glError: " + GLU.gluErrorString(glGetError));
            i9 = glGetError;
        }
        if (i9 != 0) {
            Log.e("GlUtil", "glError: " + GLU.gluErrorString(i9));
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        cVar.f17103f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(cVar);
        SurfaceTexture surfaceTexture2 = this.f18014a.f17103f;
        surfaceTexture2.getClass();
        this.f18018e = new PlaceholderSurface(this, surfaceTexture2, i7 != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f18014a.getClass();
        v2.c cVar = this.f18014a;
        cVar.f17098a.removeCallbacks(cVar);
        try {
            SurfaceTexture surfaceTexture = cVar.f17103f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, cVar.f17099b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = cVar.f17100c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = cVar.f17100c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = cVar.f17102e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(cVar.f17100c, cVar.f17102e);
            }
            EGLContext eGLContext = cVar.f17101d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(cVar.f17100c, eGLContext);
            }
            if (t.f17153a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = cVar.f17100c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(cVar.f17100c);
            }
            cVar.f17100c = null;
            cVar.f17101d = null;
            cVar.f17102e = null;
            cVar.f17103f = null;
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
                } finally {
                    try {
                        return true;
                    } finally {
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
                AbstractC1664a.l("PlaceholderSurface", "Failed to initialize placeholder surface", e7);
                this.f18016c = e7;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e8) {
                AbstractC1664a.l("PlaceholderSurface", "Failed to initialize placeholder surface", e8);
                this.f18017d = e8;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
