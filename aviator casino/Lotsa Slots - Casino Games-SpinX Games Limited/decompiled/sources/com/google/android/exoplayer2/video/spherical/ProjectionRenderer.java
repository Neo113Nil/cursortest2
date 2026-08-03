package com.google.android.exoplayer2.video.spherical;

/* loaded from: classes3.dex */
final class ProjectionRenderer {
    private static final java.lang.String FRAGMENT_SHADER = "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n";
    private static final java.lang.String TAG = "ProjectionRenderer";
    private static final java.lang.String VERTEX_SHADER = "uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n";
    private com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData leftMeshData;
    private int mvpMatrixHandle;
    private int positionHandle;
    private com.google.android.exoplayer2.util.GlProgram program;
    private com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData rightMeshData;
    private int stereoMode;
    private int texCoordsHandle;
    private int textureHandle;
    private int uTexMatrixHandle;
    private static final float[] TEX_MATRIX_WHOLE = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_TOP = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    private static final float[] TEX_MATRIX_BOTTOM = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_LEFT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] TEX_MATRIX_RIGHT = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    ProjectionRenderer() {
    }

    public static boolean isSupported(com.google.android.exoplayer2.video.spherical.Projection projection) {
        com.google.android.exoplayer2.video.spherical.Projection.Mesh mesh = projection.leftMesh;
        com.google.android.exoplayer2.video.spherical.Projection.Mesh mesh2 = projection.rightMesh;
        return mesh.getSubMeshCount() == 1 && mesh.getSubMesh(0).textureId == 0 && mesh2.getSubMeshCount() == 1 && mesh2.getSubMesh(0).textureId == 0;
    }

    public void setProjection(com.google.android.exoplayer2.video.spherical.Projection projection) {
        if (isSupported(projection)) {
            this.stereoMode = projection.stereoMode;
            this.leftMeshData = new com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData(projection.leftMesh.getSubMesh(0));
            this.rightMeshData = projection.singleMesh ? this.leftMeshData : new com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData(projection.rightMesh.getSubMesh(0));
        }
    }

    public void init() {
        try {
            com.google.android.exoplayer2.util.GlProgram glProgram = new com.google.android.exoplayer2.util.GlProgram(VERTEX_SHADER, FRAGMENT_SHADER);
            this.program = glProgram;
            this.mvpMatrixHandle = glProgram.getUniformLocation("uMvpMatrix");
            this.uTexMatrixHandle = this.program.getUniformLocation("uTexMatrix");
            this.positionHandle = this.program.getAttributeArrayLocationAndEnable("aPosition");
            this.texCoordsHandle = this.program.getAttributeArrayLocationAndEnable("aTexCoords");
            this.textureHandle = this.program.getUniformLocation("uTexture");
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e) {
            android.util.Log.e(TAG, "Failed to initialize the program", e);
        }
    }

    public void draw(int i, float[] fArr, boolean z) {
        float[] fArr2;
        com.google.android.exoplayer2.video.spherical.ProjectionRenderer.MeshData meshData = z ? this.rightMeshData : this.leftMeshData;
        if (meshData == null) {
            return;
        }
        int i2 = this.stereoMode;
        if (i2 == 1) {
            fArr2 = z ? TEX_MATRIX_BOTTOM : TEX_MATRIX_TOP;
        } else if (i2 == 2) {
            fArr2 = z ? TEX_MATRIX_RIGHT : TEX_MATRIX_LEFT;
        } else {
            fArr2 = TEX_MATRIX_WHOLE;
        }
        android.opengl.GLES20.glUniformMatrix3fv(this.uTexMatrixHandle, 1, false, fArr2, 0);
        android.opengl.GLES20.glUniformMatrix4fv(this.mvpMatrixHandle, 1, false, fArr, 0);
        android.opengl.GLES20.glActiveTexture(33984);
        android.opengl.GLES20.glBindTexture(36197, i);
        android.opengl.GLES20.glUniform1i(this.textureHandle, 0);
        try {
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e) {
            android.util.Log.e(TAG, "Failed to bind uniforms", e);
        }
        android.opengl.GLES20.glVertexAttribPointer(this.positionHandle, 3, 5126, false, 12, (java.nio.Buffer) meshData.vertexBuffer);
        try {
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e2) {
            android.util.Log.e(TAG, "Failed to load position data", e2);
        }
        android.opengl.GLES20.glVertexAttribPointer(this.texCoordsHandle, 2, 5126, false, 8, (java.nio.Buffer) meshData.textureBuffer);
        try {
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e3) {
            android.util.Log.e(TAG, "Failed to load texture data", e3);
        }
        android.opengl.GLES20.glDrawArrays(meshData.drawMode, 0, meshData.vertexCount);
        try {
            com.google.android.exoplayer2.util.GlUtil.checkGlError();
        } catch (com.google.android.exoplayer2.util.GlUtil.GlException e4) {
            android.util.Log.e(TAG, "Failed to render", e4);
        }
    }

    public void shutdown() {
        com.google.android.exoplayer2.util.GlProgram glProgram = this.program;
        if (glProgram != null) {
            try {
                glProgram.delete();
            } catch (com.google.android.exoplayer2.util.GlUtil.GlException e) {
                android.util.Log.e(TAG, "Failed to delete the shader program", e);
            }
        }
    }

    private static class MeshData {
        private final int drawMode;
        private final java.nio.FloatBuffer textureBuffer;
        private final java.nio.FloatBuffer vertexBuffer;
        private final int vertexCount;

        public MeshData(com.google.android.exoplayer2.video.spherical.Projection.SubMesh subMesh) {
            this.vertexCount = subMesh.getVertexCount();
            this.vertexBuffer = com.google.android.exoplayer2.util.GlUtil.createBuffer(subMesh.vertices);
            this.textureBuffer = com.google.android.exoplayer2.util.GlUtil.createBuffer(subMesh.textureCoords);
            int i = subMesh.mode;
            if (i == 1) {
                this.drawMode = 5;
            } else if (i == 2) {
                this.drawMode = 6;
            } else {
                this.drawMode = 4;
            }
        }
    }
}
