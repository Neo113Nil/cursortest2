package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
public final class DualOpenGlRenderer extends androidx.camera.core.processing.OpenGlRenderer {
    private final androidx.camera.core.CompositionSettings Camera2StreamConfigurationMap;
    private final androidx.camera.core.CompositionSettings getHighSpeedVideoFpsRangesFor;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;
    private int getHighSpeedVideoSizes = -1;

    public DualOpenGlRenderer(androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2) {
        this.getHighSpeedVideoFpsRangesFor = compositionSettings;
        this.Camera2StreamConfigurationMap = compositionSettings2;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public final androidx.camera.core.processing.util.GraphicDeviceInfo init(androidx.camera.core.DynamicRange dynamicRange, java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        androidx.camera.core.processing.util.GraphicDeviceInfo init = super.init(dynamicRange, map);
        this.getHighResolutionOutputSizeshNQ4ISI = androidx.camera.core.processing.util.GLUtils.createTexture();
        this.getHighSpeedVideoSizes = androidx.camera.core.processing.util.GLUtils.createTexture();
        return init;
    }

    @Override // androidx.camera.core.processing.OpenGlRenderer
    public final void release() {
        super.release();
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoSizes = -1;
    }

    public final int getTextureName(boolean z) {
        androidx.camera.core.processing.util.GLUtils.checkInitializedOrThrow(this.mInitialized, true);
        androidx.camera.core.processing.util.GLUtils.checkGlThreadOrThrow(this.mGlThread);
        return z ? this.getHighResolutionOutputSizeshNQ4ISI : this.getHighSpeedVideoSizes;
    }

    public final void render(long j, android.view.Surface surface, androidx.camera.core.SurfaceOutput surfaceOutput, android.graphics.SurfaceTexture surfaceTexture, android.graphics.SurfaceTexture surfaceTexture2) {
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
        }
        android.opengl.GLES30.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        android.opengl.GLES30.glClear(16384);
        androidx.camera.core.processing.util.OutputSurface outputSurface = outSurfaceOrThrow;
        getHighResolutionOutputSizeshNQ4ISI(outputSurface, surfaceOutput, surfaceTexture, this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI, true);
        getHighResolutionOutputSizeshNQ4ISI(outputSurface, surfaceOutput, surfaceTexture2, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, false);
        android.opengl.EGLExt.eglPresentationTimeANDROID(this.mEglDisplay, outSurfaceOrThrow.getEglSurface(), j);
        if (android.opengl.EGL14.eglSwapBuffers(this.mEglDisplay, outSurfaceOrThrow.getEglSurface())) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to swap buffers with EGL error: 0x");
        sb.append(java.lang.Integer.toHexString(android.opengl.EGL14.eglGetError()));
        androidx.camera.core.Logger.w("DualOpenGlRenderer", sb.toString());
        removeOutputSurfaceInternal(surface, false);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.processing.util.OutputSurface outputSurface, androidx.camera.core.SurfaceOutput surfaceOutput, android.graphics.SurfaceTexture surfaceTexture, androidx.camera.core.CompositionSettings compositionSettings, int i, boolean z) {
        useAndConfigureProgramWithTexture(i);
        android.opengl.GLES20.glViewport(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        android.opengl.GLES20.glScissor(0, 0, outputSurface.getWidth(), outputSurface.getHeight());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        surfaceOutput.updateTransformMatrix(fArr2, fArr, z);
        androidx.camera.core.processing.util.GLUtils.Program2D program2D = (androidx.camera.core.processing.util.GLUtils.Program2D) androidx.core.util.Preconditions.checkNotNull(this.mCurrentProgram);
        if (program2D instanceof androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) {
            ((androidx.camera.core.processing.util.GLUtils.SamplerShaderProgram) program2D).updateTextureMatrix(fArr2);
        }
        android.util.Size size = new android.util.Size((int) (outputSurface.getWidth() * compositionSettings.getScale().first.floatValue()), (int) (outputSurface.getHeight() * compositionSettings.getScale().second.floatValue()));
        android.util.Size size2 = new android.util.Size(outputSurface.getWidth(), outputSurface.getHeight());
        float[] create4x4IdentityMatrix = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        float[] create4x4IdentityMatrix2 = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        float[] create4x4IdentityMatrix3 = androidx.camera.core.processing.util.GLUtils.create4x4IdentityMatrix();
        android.opengl.Matrix.scaleM(create4x4IdentityMatrix, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        if (compositionSettings.getScale().first.floatValue() != 0.0f || compositionSettings.getScale().second.floatValue() != 0.0f) {
            android.opengl.Matrix.translateM(create4x4IdentityMatrix2, 0, compositionSettings.getOffset().first.floatValue() / compositionSettings.getScale().first.floatValue(), compositionSettings.getOffset().second.floatValue() / compositionSettings.getScale().second.floatValue(), 0.0f);
        }
        android.opengl.Matrix.multiplyMM(create4x4IdentityMatrix3, 0, create4x4IdentityMatrix, 0, create4x4IdentityMatrix2, 0);
        program2D.updateTransformMatrix(create4x4IdentityMatrix3);
        program2D.updateAlpha(compositionSettings.getAlpha());
        android.opengl.GLES20.glEnable(3042);
        android.opengl.GLES20.glBlendFuncSeparate(my.com.softspace.ssfasstapsdk.pog.AttestationPOG.POGStatusCodes.RST_POG_DIFF_SCRP_ID, 771, 1, 771);
        android.opengl.GLES20.glDrawArrays(5, 0, 4);
        androidx.camera.core.processing.util.GLUtils.checkGlErrorOrThrow("glDrawArrays");
        android.opengl.GLES20.glDisable(3042);
    }
}
