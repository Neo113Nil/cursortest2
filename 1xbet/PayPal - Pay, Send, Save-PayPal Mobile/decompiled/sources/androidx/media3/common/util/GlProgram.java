package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final class GlProgram {
    private final int Camera2StreamConfigurationMap;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Attribute> getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private final java.util.Map<java.lang.String, androidx.media3.common.util.GlProgram.Uniform> getHighSpeedVideoFpsRangesFor;
    private final androidx.media3.common.util.GlProgram.Attribute[] getHighSpeedVideoSizes;
    private final androidx.media3.common.util.GlProgram.Uniform[] getOutputMinFrameDuration;

    public GlProgram(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, androidx.media3.common.util.GlUtil.GlException {
        this(androidx.media3.common.util.Util.loadAsset(context, str), androidx.media3.common.util.Util.loadAsset(context, str2));
    }

    public GlProgram(java.lang.String str, java.lang.String str2) throws androidx.media3.common.util.GlUtil.GlException {
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.Camera2StreamConfigurationMap = glCreateProgram;
        androidx.media3.common.util.GlUtil.checkGlError();
        getHighSpeedVideoFpsRangesFor(glCreateProgram, 35633, str);
        getHighSpeedVideoFpsRangesFor(glCreateProgram, 35632, str2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        boolean z = iArr[0] == 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to link shader program: \n");
        sb.append(android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
        androidx.media3.common.util.GlUtil.checkGlException(z, sb.toString());
        android.opengl.GLES20.glUseProgram(glCreateProgram);
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.HashMap();
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.getHighSpeedVideoSizes = new androidx.media3.common.util.GlProgram.Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            androidx.media3.common.util.GlProgram.Attribute Camera2StreamConfigurationMap = androidx.media3.common.util.GlProgram.Attribute.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, i);
            this.getHighSpeedVideoSizes[i] = Camera2StreamConfigurationMap;
            this.getHighResolutionOutputSizeshNQ4ISI.put(Camera2StreamConfigurationMap.getHighSpeedVideoSizes, Camera2StreamConfigurationMap);
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.HashMap();
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.Camera2StreamConfigurationMap, 35718, iArr3, 0);
        this.getOutputMinFrameDuration = new androidx.media3.common.util.GlProgram.Uniform[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            androidx.media3.common.util.GlProgram.Uniform Camera2StreamConfigurationMap2 = androidx.media3.common.util.GlProgram.Uniform.Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, i2);
            this.getOutputMinFrameDuration[i2] = Camera2StreamConfigurationMap2;
            this.getHighSpeedVideoFpsRangesFor.put(Camera2StreamConfigurationMap2.getHighResolutionOutputSizeshNQ4ISI, Camera2StreamConfigurationMap2);
        }
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    private static void getHighSpeedVideoFpsRangesFor(int i, int i2, java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i2);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        boolean z = iArr[0] == 1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(android.opengl.GLES20.glGetShaderInfoLog(glCreateShader));
        sb.append(", source: \n");
        sb.append(str);
        androidx.media3.common.util.GlUtil.checkGlException(z, sb.toString());
        android.opengl.GLES20.glAttachShader(i, glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public final int getUniformLocation(java.lang.String str) {
        return android.opengl.GLES20.glGetUniformLocation(this.Camera2StreamConfigurationMap, str);
    }

    public final void use() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glUseProgram(this.Camera2StreamConfigurationMap);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public final void delete() throws androidx.media3.common.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteProgram(this.Camera2StreamConfigurationMap);
        androidx.media3.common.util.GlUtil.checkGlError();
    }

    public final void setBufferAttribute(java.lang.String str, float[] fArr, int i) {
        androidx.media3.common.util.GlProgram.Attribute attribute = (androidx.media3.common.util.GlProgram.Attribute) com.google.common.base.Preconditions.checkNotNull(this.getHighResolutionOutputSizeshNQ4ISI.get(str));
        attribute.getHighResolutionOutputSizeshNQ4ISI = androidx.media3.common.util.GlUtil.createBuffer(fArr);
        attribute.Camera2StreamConfigurationMap = i;
    }

    public final void setSamplerTexIdUniform(java.lang.String str, int i, int i2) {
        androidx.media3.common.util.GlProgram.Uniform uniform = (androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str));
        uniform.Camera2StreamConfigurationMap = i;
        uniform.getOutputFormats = i2;
    }

    public final void setSamplerTexIdUniform(java.lang.String str, int i, int i2, int i3) {
        androidx.media3.common.util.GlProgram.Uniform uniform = (androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str));
        uniform.Camera2StreamConfigurationMap = i;
        uniform.getOutputFormats = i2;
        uniform.getInputFormats = i3;
    }

    public final void setIntUniform(java.lang.String str, int i) {
        ((androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str))).getHighSpeedVideoSizes[0] = i;
    }

    public final void setIntsUniform(java.lang.String str, int[] iArr) {
        java.lang.System.arraycopy(iArr, 0, ((androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str))).getHighSpeedVideoSizes, 0, iArr.length);
    }

    public final void setFloatUniform(java.lang.String str, float f) {
        ((androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str))).getHighSpeedVideoFpsRanges[0] = f;
    }

    public final void setFloatsUniform(java.lang.String str, float[] fArr) {
        java.lang.System.arraycopy(fArr, 0, ((androidx.media3.common.util.GlProgram.Uniform) com.google.common.base.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRangesFor.get(str))).getHighSpeedVideoFpsRanges, 0, fArr.length);
    }

    public final void setFloatsUniformIfPresent(java.lang.String str, float[] fArr) {
        androidx.media3.common.util.GlProgram.Uniform uniform = this.getHighSpeedVideoFpsRangesFor.get(str);
        if (uniform == null) {
            return;
        }
        java.lang.System.arraycopy(fArr, 0, uniform.getHighSpeedVideoFpsRanges, 0, fArr.length);
    }

    public final void bindAttributesAndUniforms() throws androidx.media3.common.util.GlUtil.GlException {
        for (androidx.media3.common.util.GlProgram.Attribute attribute : this.getHighSpeedVideoSizes) {
            java.nio.Buffer buffer = (java.nio.Buffer) com.google.common.base.Preconditions.checkNotNull(attribute.getHighResolutionOutputSizeshNQ4ISI, "call setBuffer before bind");
            android.opengl.GLES20.glBindBuffer(34962, 0);
            android.opengl.GLES20.glVertexAttribPointer(attribute.getHighSpeedVideoFpsRanges, attribute.Camera2StreamConfigurationMap, 5126, false, 0, buffer);
            android.opengl.GLES20.glEnableVertexAttribArray(attribute.getHighSpeedVideoFpsRanges);
            androidx.media3.common.util.GlUtil.checkGlError();
        }
        for (androidx.media3.common.util.GlProgram.Uniform uniform : this.getOutputMinFrameDuration) {
            boolean z = this.getHighSpeedVideoFpsRanges;
            int i = uniform.getOutputMinFrameDuration;
            if (i == 5124) {
                android.opengl.GLES20.glUniform1iv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoSizes, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
            } else if (i == 5126) {
                android.opengl.GLES20.glUniform1fv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoFpsRanges, 0);
                androidx.media3.common.util.GlUtil.checkGlError();
            } else if (i != 35678 && i != 35815 && i != 36198) {
                switch (i) {
                    case 35664:
                        android.opengl.GLES20.glUniform2fv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoFpsRanges, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    case 35665:
                        android.opengl.GLES20.glUniform3fv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoFpsRanges, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    case 35666:
                        android.opengl.GLES20.glUniform4fv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoFpsRanges, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    case 35667:
                        android.opengl.GLES20.glUniform2iv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoSizes, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    case 35668:
                        android.opengl.GLES20.glUniform3iv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoSizes, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    case 35669:
                        android.opengl.GLES20.glUniform4iv(uniform.getHighSpeedVideoFpsRangesFor, 1, uniform.getHighSpeedVideoSizes, 0);
                        androidx.media3.common.util.GlUtil.checkGlError();
                        break;
                    default:
                        switch (i) {
                            case 35675:
                                android.opengl.GLES20.glUniformMatrix3fv(uniform.getHighSpeedVideoFpsRangesFor, 1, false, uniform.getHighSpeedVideoFpsRanges, 0);
                                androidx.media3.common.util.GlUtil.checkGlError();
                                break;
                            case 35676:
                                android.opengl.GLES20.glUniformMatrix4fv(uniform.getHighSpeedVideoFpsRangesFor, 1, false, uniform.getHighSpeedVideoFpsRanges, 0);
                                androidx.media3.common.util.GlUtil.checkGlError();
                                break;
                            default:
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected uniform type: ");
                                sb.append(uniform.getOutputMinFrameDuration);
                                throw new java.lang.IllegalStateException(sb.toString());
                        }
                }
            } else {
                if (uniform.Camera2StreamConfigurationMap == 0) {
                    throw new java.lang.IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                android.opengl.GLES20.glActiveTexture(uniform.getOutputFormats + 33984);
                androidx.media3.common.util.GlUtil.checkGlError();
                int i2 = uniform.getOutputMinFrameDuration;
                androidx.media3.common.util.GlUtil.bindTexture(i2 == 35678 ? 3553 : 36197, uniform.Camera2StreamConfigurationMap, (i2 == 35678 || !z) ? androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR : 9728);
                if (uniform.getOutputMinFrameDuration == 35678) {
                    if (uniform.getInputFormats == 9987) {
                        android.opengl.GLES20.glGenerateMipmap(3553);
                        androidx.media3.common.util.GlUtil.checkGlError();
                    }
                    android.opengl.GLES20.glTexParameteri(3553, 10241, uniform.getInputFormats);
                    androidx.media3.common.util.GlUtil.checkGlError();
                }
                android.opengl.GLES20.glUniform1i(uniform.getHighSpeedVideoFpsRangesFor, uniform.getOutputFormats);
                androidx.media3.common.util.GlUtil.checkGlError();
            }
        }
    }

    public final void setExternalTexturesRequireNearestSampling(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }

    static final class Attribute {
        int Camera2StreamConfigurationMap;
        java.nio.Buffer getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRanges;
        public final java.lang.String getHighSpeedVideoSizes;

        public static androidx.media3.common.util.GlProgram.Attribute Camera2StreamConfigurationMap(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getHighSpeedVideoFpsRanges(bArr));
            return new androidx.media3.common.util.GlProgram.Attribute(str, android.opengl.GLES20.glGetAttribLocation(i, str));
        }

        private Attribute(java.lang.String str, int i) {
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = i;
        }
    }

    static final class Uniform {
        int Camera2StreamConfigurationMap;
        public final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        final int getHighSpeedVideoFpsRangesFor;
        int getOutputFormats;
        final int getOutputMinFrameDuration;
        final float[] getHighSpeedVideoFpsRanges = new float[16];
        final int[] getHighSpeedVideoSizes = new int[4];
        int getInputFormats = androidx.media3.common.C.TEXTURE_MIN_FILTER_LINEAR;

        public static androidx.media3.common.util.GlProgram.Uniform Camera2StreamConfigurationMap(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, androidx.media3.common.util.GlProgram.getHighSpeedVideoFpsRanges(bArr));
            return new androidx.media3.common.util.GlProgram.Uniform(str, android.opengl.GLES20.glGetUniformLocation(i, str), iArr2[0]);
        }

        private Uniform(java.lang.String str, int i, int i2) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getOutputMinFrameDuration = i2;
        }
    }

    static /* synthetic */ int getHighSpeedVideoFpsRanges(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    public final int getAttributeArrayLocationAndEnable(java.lang.String str) throws androidx.media3.common.util.GlUtil.GlException {
        int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(this.Camera2StreamConfigurationMap, str);
        android.opengl.GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        androidx.media3.common.util.GlUtil.checkGlError();
        return glGetAttribLocation;
    }
}
