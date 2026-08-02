package com.miteksystems.misnap.camera.a;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0018\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0004H\u0002J*\u0010\u0003\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\t\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\""}, d2 = {"Lcom/miteksystems/misnap/camera/a/l;", "", "", "a", "", "vertexSource", "fragmentSource", "shaderType", "source", util.h.xy.cb.b.f1091, "baseMessage", "", "location", "label", "", "texMatrix", "width", "height", "", androidx.constraintlayout.motion.widget.Key.ROTATION, com.visa.cbp.getEncExpo.warmup, "eglProgramHandle", "()I", "textureId", "c", "aPositionLoc", "d", "aTextureCoordLoc", "e", "uMVPMatrixLoc", "f", "uTexMatrixLoc", "<init>", "()V", "camera_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class l {
    private final int Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;
    private final int getHighSpeedVideoSizes;
    private final int getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str) {
        int glGetError = android.opengl.GLES20.glGetError();
        if (glGetError == 0) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(": glError 0x");
        sb.append(java.lang.Integer.toHexString(glGetError));
        throw new java.lang.RuntimeException(sb.toString());
    }

    /* renamed from: b, reason: from getter */
    public final int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    private static int getHighSpeedVideoSizes(int i, java.lang.String str) {
        int glCreateShader = android.opengl.GLES20.glCreateShader(i);
        getHighSpeedVideoFpsRanges("glCreateShader type=".concat(java.lang.String.valueOf(i)));
        android.opengl.GLES20.glShaderSource(glCreateShader, str);
        android.opengl.GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        android.opengl.GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        android.opengl.GLES20.glGetShaderInfoLog(glCreateShader);
        android.opengl.GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public final /* synthetic */ void a(float[] texMatrix, int width, int height, float rotation) {
        com.miteksystems.misnap.camera.a.f fVar;
        com.miteksystems.misnap.camera.a.f fVar2;
        com.miteksystems.misnap.camera.a.f fVar3;
        com.miteksystems.misnap.camera.a.f fVar4;
        com.miteksystems.misnap.camera.a.f fVar5;
        com.miteksystems.misnap.camera.a.f fVar6;
        getHighSpeedVideoFpsRanges("draw start");
        android.opengl.GLES20.glUseProgram(this.getHighSpeedVideoFpsRangesFor);
        getHighSpeedVideoFpsRanges("glUseProgram");
        android.opengl.GLES20.glViewport(0, 0, width, height);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, this.Camera2StreamConfigurationMap);
        float[] fArr = new float[16];
        android.opengl.Matrix.setIdentityM(fArr, 0);
        android.opengl.Matrix.rotateM(fArr, 0, rotation, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES20.glUniformMatrix4fv(this.getHighResolutionOutputSizeshNQ4ISI, 1, false, fArr, 0);
        getHighSpeedVideoFpsRanges("glUniformMatrix4fv");
        android.opengl.GLES20.glUniformMatrix4fv(this.getOutputMinFrameDuration, 1, false, texMatrix, 0);
        getHighSpeedVideoFpsRanges("glUniformMatrix4fv");
        android.opengl.GLES20.glEnableVertexAttribArray(this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoFpsRanges("glEnableVertexAttribArray");
        int i = this.getHighSpeedVideoFpsRanges;
        fVar = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        int coordsPerVertex = fVar.getCoordsPerVertex();
        fVar2 = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        int vertexStride = fVar2.getVertexStride();
        fVar3 = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        android.opengl.GLES20.glVertexAttribPointer(i, coordsPerVertex, 5126, false, vertexStride, (java.nio.Buffer) fVar3.getVertexArray());
        getHighSpeedVideoFpsRanges("glVertexAttribPointer");
        android.opengl.GLES20.glEnableVertexAttribArray(this.getHighSpeedVideoSizes);
        getHighSpeedVideoFpsRanges("glEnableVertexAttribArray");
        int i2 = this.getHighSpeedVideoSizes;
        fVar4 = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        int texCoordStride = fVar4.getTexCoordStride();
        fVar5 = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        android.opengl.GLES20.glVertexAttribPointer(i2, 2, 5126, false, texCoordStride, (java.nio.Buffer) fVar5.getTexCoordArray());
        getHighSpeedVideoFpsRanges("glVertexAttribPointer");
        fVar6 = com.miteksystems.misnap.camera.a.m.getHighSpeedVideoSizes;
        android.opengl.GLES20.glDrawArrays(5, 0, fVar6.getVertexCount());
        getHighSpeedVideoFpsRanges("glDrawArrays");
        android.opengl.GLES20.glDisableVertexAttribArray(this.getHighSpeedVideoFpsRanges);
        android.opengl.GLES20.glDisableVertexAttribArray(this.getHighSpeedVideoSizes);
        android.opengl.GLES20.glBindTexture(36197, 0);
        android.opengl.GLES20.glUseProgram(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l() {
        int highSpeedVideoSizes;
        int glCreateProgram;
        int highSpeedVideoSizes2 = getHighSpeedVideoSizes(35633, "\n            uniform mat4 uMVPMatrix;\n            uniform mat4 uTexMatrix;\n            attribute vec4 aPosition;\n            attribute vec4 aTextureCoord;\n            varying vec2 vTextureCoord;\n            void main() {\n                gl_Position = uMVPMatrix * aPosition;\n                vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n            }\n        ");
        if (highSpeedVideoSizes2 != 0 && (highSpeedVideoSizes = getHighSpeedVideoSizes(35632, "\n            #extension GL_OES_EGL_image_external : require\n            precision mediump float;\n            varying vec2 vTextureCoord;\n            uniform samplerExternalOES sTexture;\n            void main() {\n                gl_FragColor = texture2D(sTexture, vTextureCoord);\n            }\n        ")) != 0) {
            glCreateProgram = android.opengl.GLES20.glCreateProgram();
            getHighSpeedVideoFpsRanges("glCreateProgram");
            android.opengl.GLES20.glAttachShader(glCreateProgram, highSpeedVideoSizes2);
            getHighSpeedVideoFpsRanges("glAttachShader");
            android.opengl.GLES20.glAttachShader(glCreateProgram, highSpeedVideoSizes);
            getHighSpeedVideoFpsRanges("glAttachShader");
            android.opengl.GLES20.glLinkProgram(glCreateProgram);
            int[] iArr = new int[1];
            android.opengl.GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                android.opengl.GLES20.glGetProgramInfoLog(glCreateProgram);
                android.opengl.GLES20.glDeleteProgram(glCreateProgram);
            }
            this.getHighSpeedVideoFpsRangesFor = glCreateProgram;
            if (glCreateProgram != 0) {
                throw new java.lang.RuntimeException("Error creating EGL Program");
            }
            int glGetAttribLocation = android.opengl.GLES20.glGetAttribLocation(glCreateProgram, "aPosition");
            this.getHighSpeedVideoFpsRanges = glGetAttribLocation;
            if (glGetAttribLocation < 0) {
                throw new java.lang.RuntimeException("Invalid GLES label ".concat("aPosition"));
            }
            int glGetAttribLocation2 = android.opengl.GLES20.glGetAttribLocation(this.getHighSpeedVideoFpsRangesFor, "aTextureCoord");
            this.getHighSpeedVideoSizes = glGetAttribLocation2;
            if (glGetAttribLocation2 < 0) {
                throw new java.lang.RuntimeException("Invalid GLES label ".concat("aTextureCoord"));
            }
            int glGetUniformLocation = android.opengl.GLES20.glGetUniformLocation(this.getHighSpeedVideoFpsRangesFor, "uMVPMatrix");
            this.getHighResolutionOutputSizeshNQ4ISI = glGetUniformLocation;
            if (glGetUniformLocation < 0) {
                throw new java.lang.RuntimeException("Invalid GLES label ".concat("uMVPMatrix"));
            }
            int glGetUniformLocation2 = android.opengl.GLES20.glGetUniformLocation(this.getHighSpeedVideoFpsRangesFor, "uTexMatrix");
            this.getOutputMinFrameDuration = glGetUniformLocation2;
            if (glGetUniformLocation2 < 0) {
                throw new java.lang.RuntimeException("Invalid GLES label ".concat("uTexMatrix"));
            }
            int[] iArr2 = new int[1];
            android.opengl.GLES20.glGenTextures(1, iArr2, 0);
            getHighSpeedVideoFpsRanges("glGenTextures");
            int i = iArr2[0];
            android.opengl.GLES20.glBindTexture(36197, i);
            getHighSpeedVideoFpsRanges("glBindTexture ".concat(java.lang.String.valueOf(i)));
            android.opengl.GLES20.glTexParameterf(36197, 10241, 9728.0f);
            android.opengl.GLES20.glTexParameterf(36197, androidx.work.Data.MAX_DATA_BYTES, 9729.0f);
            android.opengl.GLES20.glTexParameteri(36197, 10242, 33071);
            android.opengl.GLES20.glTexParameteri(36197, 10243, 33071);
            getHighSpeedVideoFpsRanges("glTexParameter");
            this.Camera2StreamConfigurationMap = i;
            return;
        }
        glCreateProgram = 0;
        this.getHighSpeedVideoFpsRangesFor = glCreateProgram;
        if (glCreateProgram != 0) {
        }
    }
}
