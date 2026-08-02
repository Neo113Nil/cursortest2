package androidx.camera.core.processing.util;

/* loaded from: classes6.dex */
public final class GLUtils {
    public static final java.lang.String BLANK_FRAGMENT_SHADER = "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n";
    public static final java.lang.String BLANK_VERTEX_SHADER = "uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n";
    public static final int PIXEL_STRIDE = 4;
    public static final int SIZEOF_FLOAT = 4;
    public static final java.lang.String TAG = "GLUtils";
    public static final java.nio.FloatBuffer TEX_BUF;
    public static final float[] TEX_COORDS;
    public static final java.lang.String VAR_TEXTURE = "sTexture";
    public static final java.lang.String VERSION_UNKNOWN = "0.0";
    public static final java.nio.FloatBuffer VERTEX_BUF;
    public static final float[] VERTEX_COORDS;
    public static final int[] EMPTY_ATTRIBS = {12344};
    public static final int EGL_GL_COLORSPACE_KHR = 12445;
    public static final int EGL_GL_COLORSPACE_BT2020_HLG_EXT = 13632;
    public static final int[] HLG_SURFACE_ATTRIBS = {EGL_GL_COLORSPACE_KHR, EGL_GL_COLORSPACE_BT2020_HLG_EXT, 12344};
    public static final java.lang.String VAR_TEXTURE_COORD = "vTextureCoord";
    public static final java.lang.String DEFAULT_VERTEX_SHADER = java.lang.String.format(java.util.Locale.US, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
    public static final java.lang.String HDR_VERTEX_SHADER = java.lang.String.format(java.util.Locale.US, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", VAR_TEXTURE_COORD, VAR_TEXTURE_COORD);
    private static final androidx.camera.core.processing.ShaderProvider getHighSpeedVideoSizes = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.1
        @Override // androidx.camera.core.processing.ShaderProvider
        public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
            return java.lang.String.format(java.util.Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }
    };
    private static final androidx.camera.core.processing.ShaderProvider Camera2StreamConfigurationMap = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.2
        @Override // androidx.camera.core.processing.ShaderProvider
        public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
            return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }
    };
    private static final androidx.camera.core.processing.ShaderProvider getHighSpeedVideoFpsRanges = new androidx.camera.core.processing.ShaderProvider() { // from class: androidx.camera.core.processing.util.GLUtils.3
        @Override // androidx.camera.core.processing.ShaderProvider
        public java.lang.String createFragmentShader(java.lang.String str, java.lang.String str2) {
            return java.lang.String.format(java.util.Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }
    };
    public static final androidx.camera.core.processing.util.OutputSurface NO_OUTPUT_SURFACE = androidx.camera.core.processing.util.OutputSurface.of(android.opengl.EGL14.EGL_NO_SURFACE, 0, 0);

    public enum InputFormat {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        VERTEX_COORDS = fArr;
        VERTEX_BUF = createFloatBuffer(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        TEX_COORDS = fArr2;
        TEX_BUF = createFloatBuffer(fArr2);
    }

    private GLUtils() {
    }

    public static abstract class Program2D {
        protected int mProgramHandle;
        protected int mTransMatrixLoc = -1;
        protected int mAlphaScaleLoc = -1;
        protected int mPositionLoc = -1;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        protected Program2D(java.lang.String str, java.lang.String str2) {
            java.lang.Throwable e;
            int i;
            int i2;
            int i3;
            try {
                i = androidx.camera.core.processing.util.GLUtils.loadShader(35633, str);
            } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e2) {
                e = e2;
                i = -1;
            }
            try {
                i2 = androidx.camera.core.processing.util.GLUtils.loadShader(35632, str2);
                try {
                    i3 = android.opengl.GLES20.glCreateProgram();
                } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e3) {
                    e = e3;
                    i3 = -1;
                }
                try {
                    androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glCreateProgram");
                    android.opengl.GLES20.glAttachShader(i3, i);
                    androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glAttachShader");
                    android.opengl.GLES20.glAttachShader(i3, i2);
                    androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glAttachShader");
                    android.opengl.GLES20.glLinkProgram(i3);
                    int[] iArr = new int[1];
                    android.opengl.GLES20.glGetProgramiv(i3, 35714, iArr, 0);
                    if (iArr[0] != 1) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not link program: ");
                        sb.append(android.opengl.GLES20.glGetProgramInfoLog(i3));
                        throw new java.lang.IllegalStateException(sb.toString());
                    }
                    this.mProgramHandle = i3;
                    getHighSpeedVideoFpsRangesFor();
                } catch (java.lang.IllegalArgumentException e4) {
                    e = e4;
                    if (i != -1) {
                        android.opengl.GLES20.glDeleteShader(i);
                    }
                    if (i2 != -1) {
                        android.opengl.GLES20.glDeleteShader(i2);
                    }
                    if (i3 != -1) {
                        android.opengl.GLES20.glDeleteProgram(i3);
                    }
                    throw e;
                } catch (java.lang.IllegalStateException e5) {
                    e = e5;
                    if (i != -1) {
                    }
                    if (i2 != -1) {
                    }
                    if (i3 != -1) {
                    }
                    throw e;
                }
            } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException e6) {
                e = e6;
                i2 = -1;
                i3 = -1;
                if (i != -1) {
                }
                if (i2 != -1) {
                }
                if (i3 != -1) {
                }
                throw e;
            }
        }

        public void use() {
            android.opengl.GLES20.glUseProgram(this.mProgramHandle);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUseProgram");
            android.opengl.GLES20.glEnableVertexAttribArray(this.mPositionLoc);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.mPositionLoc, 2, 5126, false, 0, (java.nio.Buffer) androidx.camera.core.processing.util.GLUtils.VERTEX_BUF);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
            updateTransformMatrix(androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix());
            updateAlpha(1.0f);
        }

        public void updateTransformMatrix(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.mTransMatrixLoc, 1, false, fArr, 0);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        public void updateAlpha(float f) {
            android.opengl.GLES20.glUniform1f(this.mAlphaScaleLoc, f);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniform1f");
        }

        public void delete() {
            android.opengl.GLES20.glDeleteProgram(this.mProgramHandle);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void getHighSpeedVideoFpsRangesFor() {
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "aPosition");
            this.mPositionLoc = glGetAttribLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uTransMatrix");
            this.mTransMatrixLoc = glGetUniformLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uAlphaScale");
            this.mAlphaScaleLoc = glGetUniformLocation2;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uAlphaScale");
        }
    }

    public static class SamplerShaderProgram extends androidx.camera.core.processing.util.GLUtils.Program2D {
        private int Camera2StreamConfigurationMap;
        private int getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        public SamplerShaderProgram(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.ShaderProvider shaderProvider) {
            super(dynamicRange.is10BitHdr() ? androidx.camera.core.processing.util.GLUtils.HDR_VERTEX_SHADER : androidx.camera.core.processing.util.GLUtils.DEFAULT_VERTEX_SHADER, androidx.camera.core.processing.util.GLUtils.Camera2StreamConfigurationMap(shaderProvider));
            this.getHighSpeedVideoFpsRangesFor = -1;
            this.Camera2StreamConfigurationMap = -1;
            this.getHighSpeedVideoSizes = -1;
            getHighSpeedVideoFpsRangesFor();
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
            this.getHighSpeedVideoFpsRangesFor = glGetUniformLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation, androidx.camera.core.processing.util.GLUtils.VAR_TEXTURE);
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.mProgramHandle, "aTextureCoord");
            this.getHighSpeedVideoSizes = glGetAttribLocation;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.mProgramHandle, "uTexMatrix");
            this.Camera2StreamConfigurationMap = glGetUniformLocation2;
            androidx.camera.core.processing.util.GLUtils.checkLocationOrThrow(glGetUniformLocation2, "uTexMatrix");
        }

        @Override // androidx.camera.core.processing.util.GLUtils.Program2D
        public void use() {
            super.use();
            android.opengl.GLES20.glUniform1i(this.getHighSpeedVideoFpsRangesFor, 0);
            android.opengl.GLES20.glEnableVertexAttribArray(this.getHighSpeedVideoSizes);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glEnableVertexAttribArray");
            android.opengl.GLES20.glVertexAttribPointer(this.getHighSpeedVideoSizes, 2, 5126, false, 0, (java.nio.Buffer) androidx.camera.core.processing.util.GLUtils.TEX_BUF);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glVertexAttribPointer");
        }

        public void updateTextureMatrix(float[] fArr) {
            android.opengl.GLES20.glUniformMatrix4fv(this.Camera2StreamConfigurationMap, 1, false, fArr, 0);
            androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glUniformMatrix4fv");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public SamplerShaderProgram(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat) {
            this(dynamicRange, r5);
            androidx.camera.core.processing.ShaderProvider shaderProvider;
            if (!dynamicRange.is10BitHdr()) {
                shaderProvider = androidx.camera.core.processing.util.GLUtils.getHighSpeedVideoSizes;
            } else {
                androidx.core.util.Preconditions.checkArgument(inputFormat != androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN, "No default sampler shader available for".concat(java.lang.String.valueOf(inputFormat)));
                shaderProvider = inputFormat == androidx.camera.core.processing.util.GLUtils.InputFormat.YUV ? androidx.camera.core.processing.util.GLUtils.getHighSpeedVideoFpsRanges : androidx.camera.core.processing.util.GLUtils.Camera2StreamConfigurationMap;
            }
        }
    }

    public static class BlankShaderProgram extends androidx.camera.core.processing.util.GLUtils.Program2D {
        public BlankShaderProgram() {
            super(androidx.camera.core.processing.util.GLUtils.BLANK_VERTEX_SHADER, androidx.camera.core.processing.util.GLUtils.BLANK_FRAGMENT_SHADER);
        }
    }

    public static android.opengl.EGLSurface createWindowSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, android.view.Surface surface, int[] iArr) {
        android.opengl.EGLSurface eglCreateWindowSurface = android.opengl.EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        checkEglErrorOrThrow("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    public static int loadShader(int i, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i);
        checkGlErrorOrThrow("glCreateShader type=".concat(java.lang.String.valueOf(i)));
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        androidx.camera.core.Logger.w(TAG, "Could not compile shader: ".concat(java.lang.String.valueOf(str)));
        java.lang.String glGetShaderInfoLog = android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Could not compile shader type ");
        sb.append(i);
        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
        sb.append(glGetShaderInfoLog);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static int querySurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface, int i) {
        int[] iArr = new int[1];
        android.opengl.EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i, iArr, 0);
        return iArr[0];
    }

    public static android.util.Size getSurfaceSize(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLSurface eGLSurface) {
        return new android.util.Size(querySurface(eGLDisplay, eGLSurface, 12375), querySurface(eGLDisplay, eGLSurface, 12374));
    }

    public static java.nio.FloatBuffer createFloatBuffer(float[] fArr) {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(java.nio.ByteOrder.nativeOrder());
        java.nio.FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static android.opengl.EGLSurface createPBufferSurface(android.opengl.EGLDisplay eGLDisplay, android.opengl.EGLConfig eGLConfig, int i, int i2) {
        android.opengl.EGLSurface eglCreatePbufferSurface = android.opengl.EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i, 12374, i2, 12344}, 0);
        checkEglErrorOrThrow("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new java.lang.IllegalStateException("surface was null");
    }

    public static java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.util.GLUtils.Program2D> createPrograms(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        androidx.camera.core.processing.util.GLUtils.Program2D samplerShaderProgram;
        java.util.HashMap hashMap = new java.util.HashMap();
        androidx.camera.core.processing.util.GLUtils.InputFormat[] values = androidx.camera.core.processing.util.GLUtils.InputFormat.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat = values[i];
            androidx.camera.core.processing.ShaderProvider shaderProvider = map.get(inputFormat);
            if (shaderProvider != null) {
                samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, shaderProvider);
            } else if (inputFormat == androidx.camera.core.processing.util.GLUtils.InputFormat.YUV || inputFormat == androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT) {
                samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, inputFormat);
            } else {
                androidx.core.util.Preconditions.checkState(inputFormat == androidx.camera.core.processing.util.GLUtils.InputFormat.UNKNOWN, "Unhandled input format: ".concat(java.lang.String.valueOf(inputFormat)));
                if (dynamicRange.is10BitHdr()) {
                    samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.BlankShaderProgram();
                } else {
                    androidx.camera.core.processing.ShaderProvider shaderProvider2 = map.get(androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT);
                    if (shaderProvider2 != null) {
                        samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, shaderProvider2);
                    } else {
                        samplerShaderProgram = new androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram(dynamicRange, androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT);
                    }
                }
            }
            hashMap.put(inputFormat, samplerShaderProgram);
        }
        return hashMap;
    }

    public static int createTexture() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        int i = iArr[0];
        android.opengl.GLES20.glBindTexture(36197, i);
        checkGlErrorOrThrow("glBindTexture ".concat(java.lang.String.valueOf(i)));
        android.opengl.GLES20.glTexParameteri(36197, 10241, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLES20.glTexParameteri(36197, androidx.work.Data.MAX_DATA_BYTES, androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR);
        android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
        android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
        checkGlErrorOrThrow("glTexParameter");
        return i;
    }

    public static float[] create4x4IdentityMatrix() {
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static void checkLocationOrThrow(int i, java.lang.String str) {
        if (i >= 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to locate '");
        sb.append(str);
        sb.append("' in program");
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static void checkEglErrorOrThrow(java.lang.String str) {
        int eglGetError = android.opengl.EGL14.eglGetError();
        if (eglGetError == 12288) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": EGL error: 0x");
        sb.append(java.lang.Integer.toHexString(eglGetError));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static void checkGlErrorOrThrow(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": GL error 0x");
        sb.append(java.lang.Integer.toHexString(glGetError));
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public static void checkEglErrorOrLog(java.lang.String str) {
        try {
            checkEglErrorOrThrow(str);
        } catch (java.lang.IllegalStateException e) {
            androidx.camera.core.Logger.e(TAG, e.toString(), e);
        }
    }

    public static void checkInitializedOrThrow(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, boolean z) {
        java.lang.String str;
        boolean z2 = z == atomicBoolean.get();
        if (z) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        androidx.core.util.Preconditions.checkState(z2, str);
    }

    public static void checkGlThreadOrThrow(java.lang.Thread thread) {
        androidx.core.util.Preconditions.checkState(thread == java.lang.Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static java.lang.String getGlVersionNumber() {
        java.util.regex.Matcher matcher = java.util.regex.Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(android.opengl.GLES20.glGetString(7938));
        if (matcher.find()) {
            java.lang.String str = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(1));
            java.lang.String str2 = (java.lang.String) androidx.core.util.Preconditions.checkNotNull(matcher.group(2));
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append(".");
            sb.append(str2);
            return sb.toString();
        }
        return VERSION_UNKNOWN;
    }

    public static int[] chooseSurfaceAttrib(java.lang.String str, androidx.camera.core.DynamicRange dynamicRange) {
        int[] iArr = EMPTY_ATTRIBS;
        if (dynamicRange.getEncoding() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return HLG_SURFACE_ATTRIBS;
            }
            androidx.camera.core.Logger.w(TAG, "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static int generateFbo() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
        checkGlErrorOrThrow("glGenFramebuffers");
        return iArr[0];
    }

    public static int generateTexture() {
        int[] iArr = new int[1];
        android.opengl.GLES20.glGenTextures(1, iArr, 0);
        checkGlErrorOrThrow("glGenTextures");
        return iArr[0];
    }

    public static void deleteTexture(int i) {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{i}, 0);
        checkGlErrorOrThrow("glDeleteTextures");
    }

    public static void deleteFbo(int i) {
        android.opengl.GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
        checkGlErrorOrThrow("glDeleteFramebuffers");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String Camera2StreamConfigurationMap(androidx.camera.core.processing.ShaderProvider shaderProvider) {
        try {
            java.lang.String createFragmentShader = shaderProvider.createFragmentShader(VAR_TEXTURE, VAR_TEXTURE_COORD);
            if (createFragmentShader != null && createFragmentShader.contains(VAR_TEXTURE_COORD) && createFragmentShader.contains(VAR_TEXTURE)) {
                return createFragmentShader;
            }
            throw new java.lang.IllegalArgumentException("Invalid fragment shader");
        } catch (java.lang.Throwable th) {
            if (th instanceof java.lang.IllegalArgumentException) {
                throw th;
            }
            throw new java.lang.IllegalArgumentException("Unable retrieve fragment shader source", th);
        }
    }
}
