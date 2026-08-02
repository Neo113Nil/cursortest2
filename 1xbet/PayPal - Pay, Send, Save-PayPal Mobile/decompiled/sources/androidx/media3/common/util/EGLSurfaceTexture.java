package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class EGLSurfaceTexture implements android.graphics.SurfaceTexture.OnFrameAvailableListener, java.lang.Runnable {
    public static final int SECURE_MODE_NONE = 0;
    public static final int SECURE_MODE_PROTECTED_PBUFFER = 2;
    public static final int SECURE_MODE_SURFACELESS_CONTEXT = 1;
    private static final int[] getHighSpeedVideoFpsRanges = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    private android.opengl.EGLContext Camera2StreamConfigurationMap;
    private final androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener getHighResolutionOutputSizeshNQ4ISI;
    private final android.os.Handler getHighSpeedVideoFpsRangesFor;
    private android.opengl.EGLDisplay getHighSpeedVideoSizes;
    private final int[] getInputFormats;
    private android.opengl.EGLSurface getInputSizeshNQ4ISI;
    private android.graphics.SurfaceTexture getOutputMinFrameDuration;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface SecureMode {
    }

    public interface TextureImageListener {
        void onFrameAvailable();
    }

    public EGLSurfaceTexture(android.os.Handler handler) {
        this(handler, null);
    }

    public EGLSurfaceTexture(android.os.Handler handler, androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener textureImageListener) {
        this.getHighSpeedVideoFpsRangesFor = handler;
        this.getHighResolutionOutputSizeshNQ4ISI = textureImageListener;
        this.getInputFormats = new int[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void release() {
        this.getHighSpeedVideoFpsRangesFor.removeCallbacks(this);
        try {
            android.graphics.SurfaceTexture surfaceTexture = this.getOutputMinFrameDuration;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                android.opengl.GLES20.glDeleteTextures(1, this.getInputFormats, 0);
            }
        } finally {
            android.opengl.EGLDisplay eGLDisplay = this.getHighSpeedVideoSizes;
            if (eGLDisplay != null && !eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGLDisplay eGLDisplay2 = this.getHighSpeedVideoSizes;
                android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
                android.opengl.EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            }
            android.opengl.EGLSurface eGLSurface2 = this.getInputSizeshNQ4ISI;
            if (eGLSurface2 != null && !eGLSurface2.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI);
            }
            android.opengl.EGLContext eGLContext = this.Camera2StreamConfigurationMap;
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(this.getHighSpeedVideoSizes, eGLContext);
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGLDisplay eGLDisplay3 = this.getHighSpeedVideoSizes;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
                android.opengl.EGL14.eglTerminate(this.getHighSpeedVideoSizes);
            }
            this.getHighSpeedVideoSizes = null;
            this.Camera2StreamConfigurationMap = null;
            this.getInputSizeshNQ4ISI = null;
            this.getOutputMinFrameDuration = null;
        }
    }

    public final android.graphics.SurfaceTexture getSurfaceTexture() {
        return (android.graphics.SurfaceTexture) com.google.common.base.Preconditions.checkNotNull(this.getOutputMinFrameDuration);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        this.getHighSpeedVideoFpsRangesFor.post(this);
    }

    public final void init(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eglCreatePbufferSurface;
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        androidx.media3.common.util.GlUtil.checkGlException(eglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        androidx.media3.common.util.GlUtil.checkGlException(android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        this.getHighSpeedVideoSizes = eglGetDisplay;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        int[] iArr2 = new int[1];
        boolean eglChooseConfig = android.opengl.EGL14.eglChooseConfig(eglGetDisplay, getHighSpeedVideoFpsRanges, 0, eGLConfigArr, 0, 1, iArr2, 0);
        boolean z = eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
        androidx.media3.common.util.GlUtil.checkGlException(z, androidx.media3.common.util.Util.formatInvariant("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", java.lang.Boolean.valueOf(eglChooseConfig), java.lang.Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.getHighSpeedVideoSizes, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        androidx.media3.common.util.GlUtil.checkGlException(eglCreateContext != null, "eglCreateContext failed");
        this.Camera2StreamConfigurationMap = eglCreateContext;
        android.opengl.EGLDisplay eGLDisplay = this.getHighSpeedVideoSizes;
        if (i == 1) {
            eglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            androidx.media3.common.util.GlUtil.checkGlException(eglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        androidx.media3.common.util.GlUtil.checkGlException(android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext), "eglMakeCurrent failed");
        this.getInputSizeshNQ4ISI = eglCreatePbufferSurface;
        android.opengl.GLES20.glGenTextures(1, this.getInputFormats, 0);
        androidx.media3.common.util.GlUtil.checkGlError();
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(this.getInputFormats[0]);
        this.getOutputMinFrameDuration = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.media3.common.util.EGLSurfaceTexture.TextureImageListener textureImageListener = this.getHighResolutionOutputSizeshNQ4ISI;
        if (textureImageListener != null) {
            textureImageListener.onFrameAvailable();
        }
        android.graphics.SurfaceTexture surfaceTexture = this.getOutputMinFrameDuration;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (java.lang.RuntimeException unused) {
            }
        }
    }
}
