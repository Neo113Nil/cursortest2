package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class OpenGlRenderer {
    protected android.view.Surface mCurrentSurface;
    protected android.opengl.EGLConfig mEglConfig;
    protected java.lang.Thread mGlThread;
    protected final java.util.concurrent.atomic.AtomicBoolean mInitialized = new java.util.concurrent.atomic.AtomicBoolean(false);
    protected final java.util.Map<android.view.Surface, androidx.camera.core.processing.util.OutputSurface> mOutputSurfaceMap = new java.util.HashMap();
    protected android.opengl.EGLDisplay mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
    protected android.opengl.EGLContext mEglContext = android.opengl.EGL14.EGL_NO_CONTEXT;
    protected int[] mSurfaceAttrib = androidx.camera.core.processing.util.GLUtils.EMPTY_ATTRIBS;
    protected android.opengl.EGLSurface mTempSurface = android.opengl.EGL14.EGL_NO_SURFACE;
    protected java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.util.GLUtils.Program2D> mProgramHandles = java.util.Collections.emptyMap();
    protected androidx.camera.core.processing.util.GLUtils.Program2D mCurrentProgram = null;
    protected androidx.camera.core.processing.util.GLUtils.InputFormat mCurrentInputformat = androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN;
    private int getHighSpeedVideoSizes = -1;

    public androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange) {
        return init(dynamicRange, java.util.Collections.emptyMap());
    }

    public androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder = androidx.camera.core.processing.util.GraphicDeviceInfo.builder();
        try {
            if (dynamicRange.is10BitHdr()) {
                androidx.core.util.Pair<java.lang.String, java.lang.String> highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(dynamicRange);
                java.lang.String str = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(highSpeedVideoFpsRanges.first);
                java.lang.String str2 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(highSpeedVideoFpsRanges.second);
                if (!str.contains("GL_EXT_YUV_target")) {
                    androidx.camera.core.Logger.w("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    dynamicRange = androidx.camera.core.DynamicRange.SDR;
                }
                this.mSurfaceAttrib = androidx.camera.core.processing.util.GLUtils.chooseSurfaceAttrib(str2, dynamicRange);
                builder.setGlExtensions(str);
                builder.setEglExtensions(str2);
            }
            getHighSpeedVideoFpsRanges(dynamicRange, builder);
            android.opengl.EGLSurface createPBufferSurface = androidx.camera.core.processing.util.GLUtils.createPBufferSurface(this.mEglDisplay, (android.opengl.EGLConfig) java.util.Objects.requireNonNull(this.mEglConfig), 1, 1);
            this.mTempSurface = createPBufferSurface;
            makeCurrent(createPBufferSurface);
            builder.setGlVersion(androidx.camera.core.processing.util.GLUtils.getGlVersionNumber());
            this.mProgramHandles = androidx.camera.core.processing.util.GLUtils.createPrograms(dynamicRange, map);
            int createTexture = androidx.camera.core.processing.util.GLUtils.createTexture();
            this.getHighSpeedVideoSizes = createTexture;
            useAndConfigureProgramWithTexture(createTexture);
            this.mGlThread = java.lang.Thread.currentThread();
            this.mInitialized.set(true);
            return builder.build();
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e) {
            getHighResolutionOutputSizeshNQ4ISI();
            throw e;
        }
    }

    public void release() {
        if (this.mInitialized.getAndSet(false)) {
            androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    public void registerOutputSurface(android.view.Surface surface) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mOutputSurfaceMap.containsKey(surface)) {
            return;
        }
        this.mOutputSurfaceMap.put(surface, androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE);
    }

    public void unregisterOutputSurface(android.view.Surface surface) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        removeOutputSurfaceInternal(surface, true);
    }

    public int getTextureName() {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return this.getHighSpeedVideoSizes;
    }

    public void setInputFormat(androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        if (this.mCurrentInputformat != inputFormat) {
            this.mCurrentInputformat = inputFormat;
            useAndConfigureProgramWithTexture(this.getHighSpeedVideoSizes);
        }
    }

    public void render(long j, float[] fArr, android.view.Surface surface) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        androidx.camera.core.processing.util.OutputSurface outSurfaceOrThrow = getOutSurfaceOrThrow(surface);
        if (outSurfaceOrThrow == androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE) {
            outSurfaceOrThrow = createOutputSurfaceInternal(surface);
            if (outSurfaceOrThrow == null) {
                return;
            } else {
                this.mOutputSurfaceMap.put(surface, outSurfaceOrThrow);
            }
        }
        if (surface != this.mCurrentSurface) {
            makeCurrent(outSurfaceOrThrow.getEglSurface());
            this.mCurrentSurface = surface;
            android.opengl.GLES20.glViewport(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
            android.opengl.GLES20.glScissor(0, 0, outSurfaceOrThrow.getWidth(), outSurfaceOrThrow.getHeight());
        }
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = (androidx.camera.core.processing.util.GLUtils.Program2D) androidx.core.util.Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j);
        if (android.opengl.EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to swap buffers with EGL error: 0x");
        sb.append(java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        androidx.camera.core.Logger.w("OpenGlRenderer", sb.toString());
        removeOutputSurfaceInternal(surface, false);
    }

    public android.graphics.Bitmap snapshot(android.util.Size size, float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        androidx.core.util.Preconditions.checkArgument(allocateDirect.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        androidx.core.util.Preconditions.checkArgument(allocateDirect.isDirect(), "ByteBuffer is not direct.");
        int generateTexture = androidx.camera.core.processing.util.GLUtils.generateTexture();
        android.opengl.GLES20.glActiveTexture(33985);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(3553, generateTexture);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
        android.opengl.GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glTexImage2D");
        android.opengl.GLES20.glTexParameteri(3553, androidx.work.Data.MAX_DATA_BYTES, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLES20.glTexParameteri(3553, 10241, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        int generateFbo = androidx.camera.core.processing.util.GLUtils.generateFbo();
        android.opengl.GLES20.glBindFramebuffer(36160, generateFbo);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindFramebuffer");
        android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, generateTexture, 0);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glFramebufferTexture2D");
        android.opengl.GLES20.glActiveTexture(33984);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, this.getHighSpeedVideoSizes);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
        this.mCurrentSurface = null;
        android.opengl.GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        android.opengl.GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = (androidx.camera.core.processing.util.GLUtils.Program2D) androidx.core.util.Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr);
        }
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, allocateDirect);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glReadPixels");
        android.opengl.GLES20.glBindFramebuffer(36160, 0);
        androidx.camera.core.processing.util.GLUtils.deleteTexture(generateTexture);
        androidx.camera.core.processing.util.GLUtils.deleteFbo(generateFbo);
        int i = this.getHighSpeedVideoSizes;
        android.opengl.GLES20.glActiveTexture(33984);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, i);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(size.getWidth(), size.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        androidx.camera.core.ImageProcessingUtil.copyByteBufferToBitmap(createBitmap, allocateDirect, size.getWidth() * 4);
        return createBitmap;
    }

    private androidx.core.util.Pair<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges(androidx.camera.core.DynamicRange dynamicRange) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, false);
        try {
            getHighSpeedVideoFpsRanges(dynamicRange, null);
            android.opengl.EGLSurface createPBufferSurface = androidx.camera.core.processing.util.GLUtils.createPBufferSurface(this.mEglDisplay, (android.opengl.EGLConfig) java.util.Objects.requireNonNull(this.mEglConfig), 1, 1);
            this.mTempSurface = createPBufferSurface;
            makeCurrent(createPBufferSurface);
            java.lang.String glGetString = android.opengl.GLES20.glGetString(7939);
            java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(this.mEglDisplay, 12373);
            if (glGetString == null) {
                glGetString = "";
            }
            if (eglQueryString == null) {
                eglQueryString = "";
            }
            return new androidx.core.util.Pair<>(glGetString, eglQueryString);
        } catch (java.lang.IllegalStateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to get GL or EGL extensions: ");
            sb.append(e.getMessage());
            androidx.camera.core.Logger.w("OpenGlRenderer", sb.toString(), e);
            return new androidx.core.util.Pair<>("", "");
        } finally {
            getHighResolutionOutputSizeshNQ4ISI();
        }
    }

    private void getHighSpeedVideoFpsRanges(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.util.GraphicDeviceInfo.Builder builder) {
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        this.mEglDisplay = eglGetDisplay;
        if (java.util.Objects.equals(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            throw new java.lang.IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(this.mEglDisplay, iArr, 0, iArr, 1)) {
            this.mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
            throw new java.lang.IllegalStateException("Unable to initialize EGL14");
        }
        if (builder != null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(iArr[0]);
            sb.append(".");
            sb.append(iArr[1]);
            builder.setEglVersion(sb.toString());
        }
        int i = dynamicRange.is10BitHdr() ? 10 : 8;
        android.opengl.EGLConfig[] eGLConfigArr = new android.opengl.EGLConfig[1];
        if (!android.opengl.EGL14.eglChooseConfig(this.mEglDisplay, new int[]{12324, i, 12323, i, 12322, i, 12321, dynamicRange.is10BitHdr() ? 2 : 8, 12325, 0, 12326, 0, 12352, dynamicRange.is10BitHdr() ? 64 : 4, 12610, dynamicRange.is10BitHdr() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new java.lang.IllegalStateException("Unable to find a suitable EGLConfig");
        }
        android.opengl.EGLConfig eGLConfig = eGLConfigArr[0];
        android.opengl.EGLContext eglCreateContext = android.opengl.EGL14.eglCreateContext(this.mEglDisplay, eGLConfig, android.opengl.EGL14.EGL_NO_CONTEXT, new int[]{12440, dynamicRange.is10BitHdr() ? 3 : 2, 12344}, 0);
        androidx.camera.core.processing.util.GLUtils.checkEglErrorOrThrow("eglCreateContext");
        this.mEglConfig = eGLConfig;
        this.mEglContext = eglCreateContext;
        int[] iArr2 = new int[1];
        android.opengl.EGL14.eglQueryContext(this.mEglDisplay, eglCreateContext, 12440, iArr2, 0);
        int i2 = iArr2[0];
    }

    protected void makeCurrent(android.opengl.EGLSurface eGLSurface) {
        androidx.core.util.Preconditions.checkNotNull(this.mEglDisplay);
        androidx.core.util.Preconditions.checkNotNull(this.mEglContext);
        if (!android.opengl.EGL14.eglMakeCurrent(this.mEglDisplay, eGLSurface, eGLSurface, this.mEglContext)) {
            throw new java.lang.IllegalStateException("eglMakeCurrent failed");
        }
    }

    protected void useAndConfigureProgramWithTexture(int i) {
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = this.mProgramHandles.get(this.mCurrentInputformat);
        if (program2D == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to configure program for input format: ");
            sb.append(this.mCurrentInputformat);
            throw new java.lang.IllegalStateException(sb.toString());
        }
        if (this.mCurrentProgram != program2D) {
            this.mCurrentProgram = program2D;
            program2D.use();
        }
        android.opengl.GLES20.glActiveTexture(33984);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glActiveTexture");
        android.opengl.GLES20.glBindTexture(36197, i);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glBindTexture");
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        java.util.Iterator<androidx.camera.core.processing.util.GLUtils.Program2D> it = this.mProgramHandles.values().iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
        this.mProgramHandles = java.util.Collections.emptyMap();
        this.mCurrentProgram = null;
        if (!java.util.Objects.equals(this.mEglDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            android.opengl.EGLDisplay eGLDisplay = this.mEglDisplay;
            android.opengl.EGLSurface eGLSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            android.opengl.EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, android.opengl.EGL14.EGL_NO_CONTEXT);
            for (androidx.camera.core.processing.util.OutputSurface outputSurface : this.mOutputSurfaceMap.values()) {
                if (!java.util.Objects.equals(outputSurface.getEglSurface(), android.opengl.EGL14.EGL_NO_SURFACE) && !android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, outputSurface.getEglSurface())) {
                    androidx.camera.core.processing.util.GLUtils.checkEglErrorOrLog("eglDestroySurface");
                }
            }
            this.mOutputSurfaceMap.clear();
            if (!java.util.Objects.equals(this.mTempSurface, android.opengl.EGL14.EGL_NO_SURFACE)) {
                android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, this.mTempSurface);
                this.mTempSurface = android.opengl.EGL14.EGL_NO_SURFACE;
            }
            if (!java.util.Objects.equals(this.mEglContext, android.opengl.EGL14.EGL_NO_CONTEXT)) {
                android.opengl.EGL14.eglDestroyContext(this.mEglDisplay, this.mEglContext);
                this.mEglContext = android.opengl.EGL14.EGL_NO_CONTEXT;
            }
            android.opengl.EGL14.eglReleaseThread();
            android.opengl.EGL14.eglTerminate(this.mEglDisplay);
            this.mEglDisplay = android.opengl.EGL14.EGL_NO_DISPLAY;
        }
        this.mEglConfig = null;
        this.getHighSpeedVideoSizes = -1;
        this.mCurrentInputformat = androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN;
        this.mCurrentSurface = null;
        this.mGlThread = null;
    }

    protected androidx.camera.core.processing.util.OutputSurface getOutSurfaceOrThrow(android.view.Surface surface) {
        androidx.core.util.Preconditions.checkState(this.mOutputSurfaceMap.containsKey(surface), "The surface is not registered.");
        return (androidx.camera.core.processing.util.OutputSurface) java.util.Objects.requireNonNull(this.mOutputSurfaceMap.get(surface));
    }

    protected androidx.camera.core.processing.util.OutputSurface createOutputSurfaceInternal(android.view.Surface surface) {
        try {
            android.opengl.EGLSurface createWindowSurface = androidx.camera.core.processing.util.GLUtils.createWindowSurface(this.mEglDisplay, (android.opengl.EGLConfig) java.util.Objects.requireNonNull(this.mEglConfig), surface, this.mSurfaceAttrib);
            android.util.Size surfaceSize = androidx.camera.core.processing.util.GLUtils.getSurfaceSize(this.mEglDisplay, createWindowSurface);
            return androidx.camera.core.processing.util.OutputSurface.of(createWindowSurface, surfaceSize.getWidth(), surfaceSize.getHeight());
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create EGL surface: ");
            sb.append(e.getMessage());
            androidx.camera.core.Logger.w("OpenGlRenderer", sb.toString(), e);
            return null;
        }
    }

    protected void removeOutputSurfaceInternal(android.view.Surface surface, boolean z) {
        androidx.camera.core.processing.util.OutputSurface put;
        if (this.mCurrentSurface == surface) {
            this.mCurrentSurface = null;
            makeCurrent(this.mTempSurface);
        }
        if (z) {
            put = this.mOutputSurfaceMap.remove(surface);
        } else {
            put = this.mOutputSurfaceMap.put(surface, androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE);
        }
        if (put == null || put == androidx.camera.core.processing.util.GLUtils.NO_OUTPUT_SURFACE) {
            return;
        }
        try {
            android.opengl.EGL14.eglDestroySurface(this.mEglDisplay, put.getEglSurface());
        } catch (java.lang.RuntimeException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to destroy EGL surface: ");
            sb.append(e.getMessage());
            androidx.camera.core.Logger.w("OpenGlRenderer", sb.toString(), e);
        }
    }
}
