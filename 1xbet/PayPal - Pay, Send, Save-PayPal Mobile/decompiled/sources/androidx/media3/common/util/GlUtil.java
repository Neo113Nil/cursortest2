package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class GlUtil {
    public static final int HOMOGENEOUS_COORDINATE_VECTOR_SIZE = 4;
    public static final float LENGTH_NDC = 2.0f;
    public static final int MAX_BITMAP_DECODING_SIZE = 4096;
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_8888 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] EGL_CONFIG_ATTRIBUTES_RGBA_1010102 = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    private static final int[] getHighSpeedVideoFpsRangesFor = {androidx.camera.core.processing.util.GLUtils.EGL_GL_COLORSPACE_KHR, 13120, 12344, 12344};
    private static final int[] getHighSpeedVideoFpsRanges = {androidx.camera.core.processing.util.GLUtils.EGL_GL_COLORSPACE_KHR, androidx.camera.core.processing.util.GLUtils.EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344, 12344};
    private static final int[] getHighResolutionOutputSizeshNQ4ISI = {12344};

    public static final class GlException extends java.lang.Exception {
        public final com.google.common.collect.ImmutableList<java.lang.Integer> errorCodes;

        public GlException(java.lang.String str) {
            this(str, com.google.common.collect.ImmutableList.of());
        }

        public GlException(java.lang.String str, java.util.List<java.lang.Integer> list) {
            super(str);
            this.errorCodes = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) list);
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

    public static boolean isYuvTargetExtensionSupported() {
        java.lang.String glGetString;
        if (java.util.Objects.equals(android.opengl.EGL14.eglGetCurrentContext(), android.opengl.EGL14.EGL_NO_CONTEXT)) {
            try {
                android.opengl.EGLDisplay defaultEglDisplay = getDefaultEglDisplay();
                android.opengl.EGLContext createEglContext = createEglContext(defaultEglDisplay);
                createFocusedPlaceholderEglSurface(createEglContext, defaultEglDisplay);
                glGetString = android.opengl.GLES20.glGetString(7939);
                destroyEglContext(defaultEglDisplay, createEglContext);
            } catch (androidx.media3.common.util.GlUtil.GlException unused) {
                return false;
            }
        } else {
            glGetString = android.opengl.GLES20.glGetString(7939);
        }
        return glGetString != null && glGetString.contains("GL_EXT_YUV_target");
    }

    public static boolean isColorTransferSupported(int i) throws androidx.media3.common.util.GlUtil.GlException {
        if (i == 6) {
            return isBt2020PqExtensionSupported();
        }
        if (i == 7) {
            return isBt2020HlgExtensionSupported();
        }
        return true;
    }

    public static boolean isBt2020PqExtensionSupported() throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.String eglQueryString;
        return android.os.Build.VERSION.SDK_INT >= 33 && (eglQueryString = android.opengl.EGL14.eglQueryString(getDefaultEglDisplay(), 12373)) != null && eglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static android.opengl.EGLDisplay getDefaultEglDisplay() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        checkGlException(!eglGetDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY), "No EGL display.");
        checkGlException(android.opengl.EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        checkGlError();
        return eglGetDisplay;
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        return createEglContext(android.opengl.EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, EGL_CONFIG_ATTRIBUTES_RGBA_8888);
    }

    public static android.opengl.EGLContext createEglContext(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay, int i, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        boolean z = true;
        com.google.common.base.Preconditions.checkArgument(java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_8888) || java.util.Arrays.equals(iArr, EGL_CONFIG_ATTRIBUTES_RGBA_1010102));
        if (i != 2 && i != 3) {
            z = false;
        }
        com.google.common.base.Preconditions.checkArgument(z);
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(eGLDisplay, Camera2StreamConfigurationMap(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eglCreateContext == null || eglCreateContext.equals(android.opengl.EGL14.EGL_NO_CONTEXT)) {
            android.opengl.EGL14.eglTerminate(eGLDisplay);
            throw new androidx.media3.common.util.GlUtil.GlException("eglCreateContext() failed to create a valid context. The device may not support EGL version ".concat(java.lang.String.valueOf(i)));
        }
        checkGlError();
        return eglCreateContext;
    }

    public static android.opengl.EGLSurface createEglSurface(android.opengl.EGLDisplay eGLDisplay, java.lang.Object obj, int i, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr;
        int[] iArr2;
        if (i == 3 || i == 10) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
            iArr2 = getHighResolutionOutputSizeshNQ4ISI;
        } else if (i == 7 || i == 6) {
            iArr = EGL_CONFIG_ATTRIBUTES_RGBA_1010102;
            if (z) {
                iArr2 = getHighResolutionOutputSizeshNQ4ISI;
            } else if (i == 6) {
                if (!isBt2020PqExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = getHighSpeedVideoFpsRangesFor;
            } else {
                if (!isBt2020HlgExtensionSupported()) {
                    throw new androidx.media3.common.util.GlUtil.GlException("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = getHighSpeedVideoFpsRanges;
            }
        } else {
            throw new java.lang.IllegalArgumentException("Unsupported color transfer: ".concat(java.lang.String.valueOf(i)));
        }
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, Camera2StreamConfigurationMap(eGLDisplay, iArr), obj, iArr2, 0);
        getHighSpeedVideoFpsRanges("Error creating a new EGL surface");
        return eglCreateWindowSurface;
    }

    public static android.opengl.EGLSurface createFocusedPlaceholderEglSurface(android.opengl.EGLContext eGLContext, android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLSurface eglCreatePbufferSurface;
        int[] iArr = EGL_CONFIG_ATTRIBUTES_RGBA_8888;
        if (isSurfacelessContextExtensionSupported()) {
            eglCreatePbufferSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        } else {
            eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, Camera2StreamConfigurationMap(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            getHighSpeedVideoFpsRanges("Error creating a new EGL Pbuffer surface");
        }
        focusEglSurface(eGLDisplay, eGLContext, eglCreatePbufferSurface, 1, 1);
        return eglCreatePbufferSurface;
    }

    public static long getContextMajorVersion() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglQueryContext(android.opengl.EGL14.eglGetDisplay(0), android.opengl.EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        checkGlError();
        return r0[0];
    }

    public static long createGlSyncFence() throws androidx.media3.common.util.GlUtil.GlException {
        if (getContextMajorVersion() < 3) {
            return 0L;
        }
        long glFenceSync = android.opengl.GLES30.glFenceSync(37143, 0);
        checkGlError();
        android.opengl.GLES20.glFlush();
        checkGlError();
        return glFenceSync;
    }

    public static void deleteSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        deleteSyncObjectQuietly(j);
        checkGlError();
    }

    public static void deleteSyncObjectQuietly(long j) {
        android.opengl.GLES30.glDeleteSync(j);
    }

    public static void awaitSyncObject(long j) throws androidx.media3.common.util.GlUtil.GlException {
        if (j == 0) {
            android.opengl.GLES20.glFinish();
        } else {
            android.opengl.GLES30.glWaitSync(j, 0, -1L);
            checkGlError();
        }
    }

    public static android.opengl.EGLContext getCurrentContext() {
        return android.opengl.EGL14.eglGetCurrentContext();
    }

    public static void checkGlError() throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        boolean z = false;
        while (true) {
            int glGetError = android.opengl.GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            java.lang.String gluErrorString = android.opengl.GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("error code: 0x");
                sb2.append(java.lang.Integer.toHexString(glGetError));
                gluErrorString = sb2.toString();
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            builder.add((com.google.common.collect.ImmutableList.Builder) java.lang.Integer.valueOf(glGetError));
            z = true;
        }
        if (z) {
            throw new androidx.media3.common.util.GlUtil.GlException(sb.toString(), builder.build());
        }
    }

    private static void getHighSpeedVideoFpsRanges(int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        com.google.common.base.Preconditions.checkState(i3 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i < 0 || i2 < 0) {
            throw new androidx.media3.common.util.GlUtil.GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new androidx.media3.common.util.GlUtil.GlException("width or height is greater than GL_MAX_TEXTURE_SIZE ".concat(java.lang.String.valueOf(i3)));
        }
    }

    public static void clearFocusedBuffers() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        android.opengl.GLES20.glClearDepthf(1.0f);
        android.opengl.GLES20.glClear(16640);
        checkGlError();
    }

    public static void focusFramebufferUsingCurrentContext(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            android.opengl.GLES20.glBindFramebuffer(36160, i);
        }
        checkGlError();
        android.opengl.GLES20.glViewport(0, 0, i2, i3);
        checkGlError();
    }

    public static java.nio.FloatBuffer createBuffer(float[] fArr) {
        return (java.nio.FloatBuffer) java.nio.ByteBuffer.allocateDirect(fArr.length * 4).order(java.nio.ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static int createExternalTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int generateTexture = generateTexture();
        bindTexture(36197, generateTexture, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        return generateTexture;
    }

    public static int createTexture(android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        int generateTexture = generateTexture();
        setTexture(generateTexture, bitmap);
        return generateTexture;
    }

    public static int createTexture(int i, int i2, boolean z) throws androidx.media3.common.util.GlUtil.GlException {
        if (z) {
            return getHighSpeedVideoFpsRanges(i, i2, 34842, 5131);
        }
        return getHighSpeedVideoFpsRanges(i, i2, 6408, 5121);
    }

    public static int createRgb10A2Texture(int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        return getHighSpeedVideoFpsRanges(i, i2, 32857, 33640);
    }

    private static int getHighSpeedVideoFpsRanges(int i, int i2, int i3, int i4) throws androidx.media3.common.util.GlUtil.GlException {
        getHighSpeedVideoFpsRanges(i, i2);
        int generateTexture = generateTexture();
        bindTexture(3553, generateTexture, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLES20.glTexImage2D(3553, 0, i3, i, i2, 0, 6408, i4, null);
        checkGlError();
        return generateTexture;
    }

    public static int generateTexture() throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlError();
        return iArr[0];
    }

    public static void setTexture(int i, android.graphics.Bitmap bitmap) throws androidx.media3.common.util.GlUtil.GlException {
        getHighSpeedVideoFpsRanges(bitmap.getWidth(), bitmap.getHeight());
        bindTexture(3553, i, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        checkGlError();
    }

    public static void bindTexture(int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindTexture(i, i2);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, androidx.work.Data.MAX_DATA_BYTES, i3);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10241, i3);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10242, 33071);
        checkGlError();
        android.opengl.GLES20.glTexParameteri(i, 10243, 33071);
        checkGlError();
    }

    public static int createFboForTexture(int i) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        checkGlError();
        return iArr[0];
    }

    public static void deleteTexture(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void destroyEglContext(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
        getHighSpeedVideoFpsRanges("Error releasing context");
        if (eGLContext == null || eGLContext.equals(android.opengl.EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        android.opengl.EGL14.eglDestroyContext(eGLDisplay, eGLContext);
        getHighSpeedVideoFpsRanges("Error destroying context");
    }

    public static void terminate(android.opengl.EGLDisplay eGLDisplay) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglReleaseThread();
        getHighSpeedVideoFpsRanges("Error releasing thread");
        android.opengl.EGL14.eglTerminate(eGLDisplay);
        getHighSpeedVideoFpsRanges("Error terminating display");
    }

    public static void destroyEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) throws androidx.media3.common.util.GlUtil.GlException {
        if (eGLDisplay == null || eGLDisplay.equals(android.opengl.EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(android.opengl.EGL14.EGL_NO_SURFACE)) {
            return;
        }
        android.opengl.EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        getHighSpeedVideoFpsRanges("Error destroying surface");
    }

    public static void deleteFbo(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void deleteRbo(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteRenderbuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void blitFrameBuffer(int i, androidx.media3.common.util.GlRect glRect, int i2, androidx.media3.common.util.GlRect glRect2) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetIntegerv(36006, iArr, 0);
        checkGlError();
        android.opengl.GLES30.glBindFramebuffer(36008, i);
        checkGlError();
        android.opengl.GLES30.glBindFramebuffer(36009, i2);
        checkGlError();
        android.opengl.GLES30.glBlitFramebuffer(glRect.left, glRect.bottom, glRect.right, glRect.top, glRect2.left, glRect2.bottom, glRect2.right, glRect2.top, 16384, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        checkGlError();
        android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
        checkGlError();
    }

    public static int createPixelBufferObject(int i) throws androidx.media3.common.util.GlUtil.GlException {
        int[] iArr = new int[1];
        android.opengl.GLES30.glGenBuffers(1, iArr, 0);
        checkGlError();
        android.opengl.GLES30.glBindBuffer(35051, iArr[0]);
        checkGlError();
        android.opengl.GLES30.glBufferData(35051, i, null, 35049);
        checkGlError();
        android.opengl.GLES30.glBindBuffer(35051, 0);
        checkGlError();
        return iArr[0];
    }

    public static void schedulePixelBufferRead(int i, int i2, int i3, int i4) throws androidx.media3.common.util.GlUtil.GlException {
        focusFramebufferUsingCurrentContext(i, i2, i3);
        android.opengl.GLES30.glBindBuffer(35051, i4);
        checkGlError();
        android.opengl.GLES30.glReadBuffer(36064);
        android.opengl.GLES30.glReadPixels(0, 0, i2, i3, 6408, 5121, 0);
        checkGlError();
        android.opengl.GLES30.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static java.nio.ByteBuffer mapPixelBufferObject(int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glBindBuffer(35051, i);
        checkGlError();
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) android.opengl.GLES30.glMapBufferRange(35051, 0, i2, 1);
        checkGlError();
        android.opengl.GLES30.glBindBuffer(35051, 0);
        checkGlError();
        return byteBuffer;
    }

    public static void unmapPixelBufferObject(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES30.glBindBuffer(35051, i);
        checkGlError();
        android.opengl.GLES30.glUnmapBuffer(35051);
        checkGlError();
        android.opengl.GLES30.glBindBuffer(35051, 0);
        checkGlError();
    }

    public static void deleteBuffer(int i) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteBuffers(1, new int[]{i}, 0);
        checkGlError();
    }

    public static void checkGlException(boolean z, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        if (!z) {
            throw new androidx.media3.common.util.GlUtil.GlException(str);
        }
    }

    private static android.opengl.EGLConfig Camera2StreamConfigurationMap(android.opengl.EGLDisplay eGLDisplay, int[] iArr) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new androidx.media3.common.util.GlUtil.GlException("eglChooseConfig failed.");
        }
        return eGLConfigArr[0];
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(", error code: 0x");
        sb.append(java.lang.Integer.toHexString(eglGetError));
        throw new androidx.media3.common.util.GlUtil.GlException(sb.toString(), com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(eglGetError)));
    }

    public static void focusEglSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        getHighSpeedVideoFpsRanges("Error making context current");
        focusFramebufferUsingCurrentContext(0, i, i2);
    }

    public static void focusFramebuffer(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLContext eGLContext, android.opengl.EGLSurface eGLSurface, int i, int i2, int i3) throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        getHighSpeedVideoFpsRanges("Error making context current");
        focusFramebufferUsingCurrentContext(i, i2, i3);
    }

    public static boolean isBt2020HlgExtensionSupported() throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return eglQueryString != null && eglQueryString.contains("EGL_EXT_gl_colorspace_bt2020_hlg");
    }

    public static boolean isProtectedContentExtensionSupported(android.content.Context context) throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content");
    }

    public static boolean isSurfacelessContextExtensionSupported() throws androidx.media3.common.util.GlUtil.GlException {
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(getDefaultEglDisplay(), 12373);
        return eglQueryString != null && eglQueryString.contains("EGL_KHR_surfaceless_context");
    }
}
