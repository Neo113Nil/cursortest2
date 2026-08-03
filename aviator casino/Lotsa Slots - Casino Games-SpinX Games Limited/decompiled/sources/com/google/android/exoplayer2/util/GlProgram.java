package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram.Attribute> attributeByName;
    private final com.google.android.exoplayer2.util.GlProgram.Attribute[] attributes;
    private final int programId;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram.Uniform> uniformByName;
    private final com.google.android.exoplayer2.util.GlProgram.Uniform[] uniforms;

    public GlProgram(android.content.Context context, java.lang.String str, java.lang.String str2) throws java.io.IOException, com.google.android.exoplayer2.util.GlUtil.GlException {
        this(loadAsset(context, str), loadAsset(context, str2));
    }

    public static java.lang.String loadAsset(android.content.Context context, java.lang.String str) throws java.io.IOException {
        java.io.InputStream inputStream = null;
        try {
            inputStream = context.getAssets().open(str);
            return com.google.android.exoplayer2.util.Util.fromUtf8Bytes(com.google.android.exoplayer2.util.Util.toByteArray(inputStream));
        } finally {
            com.google.android.exoplayer2.util.Util.closeQuietly(inputStream);
        }
    }

    public GlProgram(java.lang.String str, java.lang.String str2) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int glCreateProgram = android.opengl.GLES20.glCreateProgram();
        this.programId = glCreateProgram;
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
        addShader(glCreateProgram, 35633, str);
        addShader(glCreateProgram, 35632, str2);
        android.opengl.GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        com.google.android.exoplayer2.util.GlUtil.checkGlException(iArr[0] == 1, "Unable to link shader program: \n" + android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram));
        android.opengl.GLES20.glUseProgram(glCreateProgram);
        this.attributeByName = new java.util.HashMap();
        int[] iArr2 = new int[1];
        android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35721, iArr2, 0);
        this.attributes = new com.google.android.exoplayer2.util.GlProgram.Attribute[iArr2[0]];
        for (int i = 0; i < iArr2[0]; i++) {
            com.google.android.exoplayer2.util.GlProgram.Attribute create = com.google.android.exoplayer2.util.GlProgram.Attribute.create(this.programId, i);
            this.attributes[i] = create;
            this.attributeByName.put(create.name, create);
        }
        this.uniformByName = new java.util.HashMap();
        int[] iArr3 = new int[1];
        android.opengl.GLES20.glGetProgramiv(this.programId, 35718, iArr3, 0);
        this.uniforms = new com.google.android.exoplayer2.util.GlProgram.Uniform[iArr3[0]];
        for (int i2 = 0; i2 < iArr3[0]; i2++) {
            com.google.android.exoplayer2.util.GlProgram.Uniform create2 = com.google.android.exoplayer2.util.GlProgram.Uniform.create(this.programId, i2);
            this.uniforms[i2] = create2;
            this.uniformByName.put(create2.name, create2);
        }
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
    }

    private static void addShader(int i, int i2, java.lang.String str) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i2);
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        com.google.android.exoplayer2.util.GlUtil.checkGlException(iArr[0] == 1, android.opengl.GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        android.opengl.GLES20.glAttachShader(i, glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getAttributeLocation(int i, java.lang.String str) {
        return android.opengl.GLES20.glGetAttribLocation(i, str);
    }

    private int getAttributeLocation(java.lang.String str) {
        return getAttributeLocation(this.programId, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getUniformLocation(int i, java.lang.String str) {
        return android.opengl.GLES20.glGetUniformLocation(i, str);
    }

    public int getUniformLocation(java.lang.String str) {
        return getUniformLocation(this.programId, str);
    }

    public void use() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.GLES20.glUseProgram(this.programId);
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
    }

    public void delete() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        android.opengl.GLES20.glDeleteProgram(this.programId);
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
    }

    public int getAttributeArrayLocationAndEnable(java.lang.String str) throws com.google.android.exoplayer2.util.GlUtil.GlException {
        int attributeLocation = getAttributeLocation(str);
        android.opengl.GLES20.glEnableVertexAttribArray(attributeLocation);
        com.google.android.exoplayer2.util.GlUtil.checkGlError();
        return attributeLocation;
    }

    public void setBufferAttribute(java.lang.String str, float[] fArr, int i) {
        ((com.google.android.exoplayer2.util.GlProgram.Attribute) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.attributeByName.get(str))).setBuffer(fArr, i);
    }

    public void setSamplerTexIdUniform(java.lang.String str, int i, int i2) {
        ((com.google.android.exoplayer2.util.GlProgram.Uniform) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.uniformByName.get(str))).setSamplerTexId(i, i2);
    }

    public void setIntUniform(java.lang.String str, int i) {
        ((com.google.android.exoplayer2.util.GlProgram.Uniform) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.uniformByName.get(str))).setInt(i);
    }

    public void setFloatUniform(java.lang.String str, float f) {
        ((com.google.android.exoplayer2.util.GlProgram.Uniform) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.uniformByName.get(str))).setFloat(f);
    }

    public void setFloatsUniform(java.lang.String str, float[] fArr) {
        ((com.google.android.exoplayer2.util.GlProgram.Uniform) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.uniformByName.get(str))).setFloats(fArr);
    }

    public void bindAttributesAndUniforms() throws com.google.android.exoplayer2.util.GlUtil.GlException {
        for (com.google.android.exoplayer2.util.GlProgram.Attribute attribute : this.attributes) {
            attribute.bind();
        }
        for (com.google.android.exoplayer2.util.GlProgram.Uniform uniform : this.uniforms) {
            uniform.bind();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCStringLength(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 0) {
                return i;
            }
        }
        return bArr.length;
    }

    private static final class Attribute {
        private java.nio.Buffer buffer;
        private final int index;
        private final int location;
        public final java.lang.String name;
        private int size;

        public static com.google.android.exoplayer2.util.GlProgram.Attribute create(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35722, iArr, 0);
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveAttrib(i, i2, i3, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, com.google.android.exoplayer2.util.GlProgram.getCStringLength(bArr));
            return new com.google.android.exoplayer2.util.GlProgram.Attribute(str, i2, com.google.android.exoplayer2.util.GlProgram.getAttributeLocation(i, str));
        }

        private Attribute(java.lang.String str, int i, int i2) {
            this.name = str;
            this.index = i;
            this.location = i2;
        }

        public void setBuffer(float[] fArr, int i) {
            this.buffer = com.google.android.exoplayer2.util.GlUtil.createBuffer(fArr);
            this.size = i;
        }

        public void bind() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            java.nio.Buffer buffer = (java.nio.Buffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.buffer, "call setBuffer before bind");
            android.opengl.GLES20.glBindBuffer(34962, 0);
            android.opengl.GLES20.glVertexAttribPointer(this.location, this.size, 5126, false, 0, buffer);
            android.opengl.GLES20.glEnableVertexAttribArray(this.index);
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        }
    }

    private static final class Uniform {
        private final float[] floatValue = new float[16];
        private int intValue;
        private final int location;
        public final java.lang.String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;

        public static com.google.android.exoplayer2.util.GlProgram.Uniform create(int i, int i2) {
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(i, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i3 = iArr[0];
            byte[] bArr = new byte[i3];
            android.opengl.GLES20.glGetActiveUniform(i, i2, i3, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            java.lang.String str = new java.lang.String(bArr, 0, com.google.android.exoplayer2.util.GlProgram.getCStringLength(bArr));
            return new com.google.android.exoplayer2.util.GlProgram.Uniform(str, com.google.android.exoplayer2.util.GlProgram.getUniformLocation(i, str), iArr2[0]);
        }

        private Uniform(java.lang.String str, int i, int i2) {
            this.name = str;
            this.location = i;
            this.type = i2;
        }

        public void setSamplerTexId(int i, int i2) {
            this.texIdValue = i;
            this.texUnitIndex = i2;
        }

        public void setInt(int i) {
            this.intValue = i;
        }

        public void setFloat(float f) {
            this.floatValue[0] = f;
        }

        public void setFloats(float[] fArr) {
            java.lang.System.arraycopy(fArr, 0, this.floatValue, 0, fArr.length);
        }

        public void bind() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            switch (this.type) {
                case 5124:
                    android.opengl.GLES20.glUniform1i(this.location, this.intValue);
                    return;
                case 5126:
                    android.opengl.GLES20.glUniform1fv(this.location, 1, this.floatValue, 0);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                case 35664:
                    android.opengl.GLES20.glUniform2fv(this.location, 1, this.floatValue, 0);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                case 35665:
                    android.opengl.GLES20.glUniform3fv(this.location, 1, this.floatValue, 0);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                case 35675:
                    android.opengl.GLES20.glUniformMatrix3fv(this.location, 1, false, this.floatValue, 0);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                case 35676:
                    android.opengl.GLES20.glUniformMatrix4fv(this.location, 1, false, this.floatValue, 0);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                case 35678:
                case com.google.android.exoplayer2.util.GlProgram.GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT /* 35815 */:
                case 36198:
                    if (this.texIdValue == 0) {
                        throw new java.lang.IllegalStateException("No call to setSamplerTexId() before bind.");
                    }
                    android.opengl.GLES20.glActiveTexture(this.texUnitIndex + 33984);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    com.google.android.exoplayer2.util.GlUtil.bindTexture(this.type == 35678 ? 3553 : 36197, this.texIdValue);
                    android.opengl.GLES20.glUniform1i(this.location, this.texUnitIndex);
                    com.google.android.exoplayer2.util.GlUtil.checkGlError();
                    return;
                default:
                    throw new java.lang.IllegalStateException("Unexpected uniform type: " + this.type);
            }
        }
    }
}
