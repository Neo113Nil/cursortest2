package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import java.util.Locale;

/* loaded from: classes.dex */
public final class Mi implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f10689q = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: k, reason: collision with root package name */
    public final Handler f10690k;

    /* renamed from: l, reason: collision with root package name */
    public final int[] f10691l = new int[1];

    /* renamed from: m, reason: collision with root package name */
    public EGLDisplay f10692m;

    /* renamed from: n, reason: collision with root package name */
    public EGLContext f10693n;

    /* renamed from: o, reason: collision with root package name */
    public EGLSurface f10694o;

    /* renamed from: p, reason: collision with root package name */
    public SurfaceTexture f10695p;

    public Mi(Handler handler) {
        this.f10690k = handler;
    }

    public final void a(int i) {
        EGLSurface eglCreatePbufferSurface;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        AbstractC1803xs.o("eglGetDisplay failed", eglGetDisplay != null);
        int[] iArr = new int[2];
        AbstractC1803xs.o("eglInitialize failed", EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1));
        this.f10692m = eglGetDisplay;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f10689q, 0, eGLConfigArr, 0, 1, iArr2, 0);
        AbstractC1803xs.o(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]), eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null);
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eglCreateContext = EGL14.eglCreateContext(this.f10692m, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        AbstractC1803xs.o("eglCreateContext failed", eglCreateContext != null);
        this.f10693n = eglCreateContext;
        EGLDisplay eGLDisplay = this.f10692m;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            AbstractC1803xs.o("eglCreatePbufferSurface failed", eglCreatePbufferSurface != null);
        }
        AbstractC1803xs.o("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext));
        this.f10694o = eglCreatePbufferSurface;
        int[] iArr3 = this.f10691l;
        GLES20.glGenTextures(1, iArr3, 0);
        StringBuilder sb = new StringBuilder();
        boolean z3 = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z3) {
                sb.append('\n');
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(glGetError)));
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z3 = true;
        }
        if (z3) {
            throw new Yi(sb.toString());
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
        this.f10695p = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    public final void b() {
        this.f10690k.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f10695p;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f10691l, 0);
            }
            EGLDisplay eGLDisplay = this.f10692m;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f10692m;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f10694o;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f10692m, this.f10694o);
            }
            EGLContext eGLContext = this.f10693n;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f10692m, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f10692m;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f10692m);
            }
            this.f10692m = null;
            this.f10693n = null;
            this.f10694o = null;
            this.f10695p = null;
        } catch (Throwable th) {
            EGLDisplay eGLDisplay4 = this.f10692m;
            if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay5 = this.f10692m;
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface4 = this.f10694o;
            if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f10692m, this.f10694o);
            }
            EGLContext eGLContext2 = this.f10693n;
            if (eGLContext2 != null) {
                EGL14.eglDestroyContext(this.f10692m, eGLContext2);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay6 = this.f10692m;
            if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f10692m);
            }
            this.f10692m = null;
            this.f10693n = null;
            this.f10694o = null;
            this.f10695p = null;
            throw th;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f10690k.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f10695p;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
