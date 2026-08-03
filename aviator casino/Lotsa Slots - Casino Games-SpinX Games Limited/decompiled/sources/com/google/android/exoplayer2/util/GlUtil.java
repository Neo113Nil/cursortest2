package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class GlUtil {
    private static final java.lang.String EXTENSION_PROTECTED_CONTENT = "EGL_EXT_protected_content";
    private static final java.lang.String EXTENSION_SURFACELESS_CONTEXT = "EGL_KHR_surfaceless_context";
    private static final java.lang.String EXTENSION_YUV_TARGET = "GL_EXT_YUV_target";
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] EGL_WINDOW_SURFACE_ATTRIBUTES_NONE = {12344};

    public static final class GlException extends java.lang.Exception {
        public GlException(java.lang.String str) {
            super(str);
        }
    }

    private GlUtil() {
    }

    public static float[] getNormalizedCoordinateBounds() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] getTextureCoordinateBounds() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        setToIdentity(fArr);
        return fArr;
    }

    public static void setToIdentity(float[] fArr) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
    }

    public static float[] createVertexBuffer(java.util.List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i = 0; i < list.size(); i++) {
            java.lang.System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    public static boolean isProtectedContentExtensionSupported(android.content.Context context) {
        java.lang.String eglQueryString;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 24) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 || !(com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.google.android.exoplayer2.util.Util.MANUFACTURER) || "XT1650".equals(com.google.android.exoplayer2.util.Util.MODEL))) {
            return (com.google.android.exoplayer2.util.Util.SDK_INT >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (eglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(EXTENSION_PROTECTED_CONTENT);
        }
        return false;
    }

    public static boolean isSurfacelessContextExtensionSupported() {
        java.lang.String eglQueryString;
        return com.google.android.exoplayer2.util.Util.SDK_INT >= 17 && (eglQueryString = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373)) != null && eglQueryString.contains(EXTENSION_SURFACELESS_CONTEXT);
    }

    public static boolean isYuvTargetExtensionSupported() {
        java.lang.String glGetString;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 17) {
            return false;
        }
        if (com.google.android.exoplayer2.util.Util.areEqual(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT)) {
            try {
                android.opengl.EGLDisplay createEglDisplay = createEglDisplay();
                android.opengl.EGLContext createEglContext = createEglContext(createEglDisplay);
                focusPlaceholderEglSurface(createEglContext, createEglDisplay);
                glGetString = android.opengl.GLES20.glGetString(7939);
                destroyEglContext(createEglDisplay, createEglContext);
            } catch (com.google.android.exoplayer2.util.GlUtil.GlException unused) {
                return false;
            }
        } else {
            glGetString = android.opengl.GLES20.glGetString(7939);
        }
        return glGetString != null && glGetString.contains(EXTENSION_YUV_TARGET);
    }

    public static android.opengl.EGLDisplay createEglDisplay() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return com.google.android.exoplayer2.util.GlUtil.Api17.createEglDisplay();
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return createEglContext(eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        com.google.android.exoplayer2.util.Assertions.checkArgument(java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        return com.google.android.exoplayer2.util.GlUtil.Api17.createEglContext(eGLDisplay, java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102) ? 3 : 2, iArr);
    }

    public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return com.google.android.exoplayer2.util.GlUtil.Api17.getEglSurface(eGLDisplay, obj, EGL_CONFIG_ATTRIBUTES_RGBA_8888, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return com.google.android.exoplayer2.util.GlUtil.Api17.getEglSurface(eGLDisplay, obj, iArr, EGL_WINDOW_SURFACE_ATTRIBUTES_NONE);
    }

    private static android.opengl.EGLSurface createPbufferSurface(android.opengl.EGLDisplay eGLDisplay, int i, int i2, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return com.google.android.exoplayer2.util.GlUtil.Api17.createEglPbufferSurface(eGLDisplay, iArr, new int[]{12375, i, 12374, i2, 12344});
    }

    public static android.opengl.EGLSurface focusPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        return createFocusedPlaceholderEglSurface(eGLContext, eGLDisplay, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.EGLSurface createPbufferSurface;
        if (isSurfacelessContextExtensionSupported()) {
            createPbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            createPbufferSurface = createPbufferSurface(eGLDisplay, 1, 1, iArr);
        }
        focusEglSurface(eGLDisplay, eGLContext, createPbufferSurface, 1, 1);
        return createPbufferSurface;
    }

    public static void checkGlError() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            sb.append("glError: ");
            sb.append(android.opengl.GLU.gluErrorString(glGetError));
            z = true;
        }
        if (z) {
            throw new com.google.android.exoplayer2.util.GlUtil.GlException(sb.toString());
        }
    }

    private static void assertValidTextureSize(int i, int i2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        com.google.android.exoplayer2.util.Assertions.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new com.google.android.exoplayer2.util.GlUtil.GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new com.google.android.exoplayer2.util.GlUtil.GlException("width or height is greater than GL_MAX_TEXTURE_SIZE " + i3);
        }
    }

    public static void clearOutputFrame() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClear(16384);
        checkGlError();
    }

    public static void focusEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        com.google.android.exoplayer2.util.GlUtil.Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, 0, i, i2);
    }

    public static void focusFramebuffer(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2, int i3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        com.google.android.exoplayer2.util.GlUtil.Api17.focusRenderTarget(eGLDisplay, eGLContext, eGLSurface, i, i2, i3);
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        com.google.android.exoplayer2.util.GlUtil.Api17.focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    public static void deleteTexture(int i) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void destroyEglContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        com.google.android.exoplayer2.util.GlUtil.Api17.destroyEglContext(eGLDisplay, eGLContext);
    }

    public static java.nio.FloatBuffer createBuffer(float[] fArr) {
        return (java.nio.FloatBuffer) createBuffer(fArr.length).put(fArr).flip();
    }

    private static java.nio.FloatBuffer createBuffer(int i) {
        return java.nio.ByteBuffer.allocateDirect(i * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static int createExternalTexture() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture);
        return generateTexture;
    }

    public static int createTexture(int i, int i2, boolean z) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        if (z) {
            com.google.android.exoplayer2.util.Assertions.checkState(com.google.android.exoplayer2.util.Util.SDK_INT >= 18, "GLES30 extensions are not supported below API 18.");
            return createTexture(i, i2, 34842, 5131);
        }
        return createTexture(i, i2, 6408, 5121);
    }

    private static int createTexture(int i, int i2, int i3, int i4) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        assertValidTextureSize(i, i2);
        int generateTexture = generateTexture();
        bindTexture(3553, generateTexture);
        android.opengl.GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, java.nio.ByteBuffer.allocateDirect(i * i2 * 4));
        checkGlError();
        return generateTexture;
    }

    private static int generateTexture() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        checkGlException(!com.google.android.exoplayer2.util.Util.areEqual(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static void bindTexture(int i, int i2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.GLES20.glBindTexture(i, i2);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, androidx.work.Data.MAX_DATA_BYTES, 9729);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10241, 9729);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static int createFboForTexture(int i) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        checkGlException(!com.google.android.exoplayer2.util.Util.areEqual(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT), "No current context");
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    public static void checkGlException(boolean z, java.lang.String str) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        if (!z) {
            throw new com.google.android.exoplayer2.util.GlUtil.GlException(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void checkEglException(java.lang.String str) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int eglGetError = android.opengl.EGL14.eglGetError();
        checkGlException(eglGetError == 12288, str + ", error code: " + eglGetError);
    }

    private static final class Api17 {
        private Api17() {
        }

        public static android.opengl.EGLDisplay createEglDisplay() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
            com.google.android.exoplayer2.util.GlUtil.checkGlException(!eglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
            com.google.android.exoplayer2.util.GlUtil.checkGlException(android.opengl.EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
            return eglGetDisplay;
        }

        public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, getEglConfig(eGLDisplay, iArr), android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, i, 12344}, 0);
            if (eglCreateContext == null) {
                android.opengl.EGL14.eglTerminate(eGLDisplay);
                throw new com.google.android.exoplayer2.util.GlUtil.GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i);
            }
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
            return eglCreateContext;
        }

        public static android.opengl.EGLSurface getEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int[] iArr, int[] iArr2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), obj, iArr2, 0);
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error creating surface");
            return eglCreateWindowSurface;
        }

        public static android.opengl.EGLSurface createEglPbufferSurface(android.opengl.EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, getEglConfig(eGLDisplay, iArr), iArr2, 0);
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error creating surface");
            return eglCreatePbufferSurface;
        }

        public static void focusRenderTarget(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2, int i3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error making context current");
            focusFramebufferUsingCurrentContext(i, i2, i3);
        }

        public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            com.google.android.exoplayer2.util.GlUtil.checkGlException(!com.google.android.exoplayer2.util.Util.areEqual(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT), "No current context");
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i) {
                android.opengl.GLES20.glBindFramebuffer(36160, i);
            }
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
            android.opengl.GLES20.glViewport(0, 0, i2, i3);
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        }

        public static void destroyEglContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            if (eGLDisplay == null) {
                return;
            }
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_SURFACE, android.opengl.EGL14.EGL_NO_CONTEXT);
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error releasing context");
            if (eGLContext != null) {
                android.opengl.EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                com.google.android.exoplayer2.util.GlUtil.checkEglException("Error destroying context");
            }
            android.opengl.EGL14.eglReleaseThread();
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error releasing thread");
            android.opengl.EGL14.eglTerminate(eGLDisplay);
            com.google.android.exoplayer2.util.GlUtil.checkEglException("Error terminating display");
        }

        private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
            if (!android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                throw new com.google.android.exoplayer2.util.GlUtil.GlException("eglChooseConfig failed.");
            }
            return eGLConfigArr[0];
        }
    }
}
