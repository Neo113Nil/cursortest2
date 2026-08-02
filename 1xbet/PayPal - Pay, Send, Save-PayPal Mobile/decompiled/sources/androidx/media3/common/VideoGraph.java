package androidx.media3.common;

/* loaded from: classes7.dex */
public interface VideoGraph {

    public interface Factory {
        androidx.media3.common.VideoGraph create(android.content.Context context, androidx.media3.common.ColorInfo colorInfo, androidx.media3.common.DebugViewProvider debugViewProvider, androidx.media3.common.VideoGraph.Listener listener, java.util.concurrent.Executor executor, long j, boolean z);

        boolean supportsMultipleInputs();
    }

    public interface Listener {
        default void onEnded(long j) {
        }

        default void onError(androidx.media3.common.VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j, boolean z) {
        }

        default void onOutputFrameRateChanged(float f) {
        }

        default void onOutputSizeChanged(int i, int i2) {
        }
    }

    void flush();

    android.view.Surface getInputSurface(int i);

    int getPendingInputFrameCount(int i);

    boolean hasProducedFrameWithTimestampZero();

    void initialize() throws androidx.media3.common.VideoFrameProcessingException;

    boolean queueInputBitmap(int i, android.graphics.Bitmap bitmap, androidx.media3.common.util.TimestampIterator timestampIterator);

    boolean queueInputTexture(int i, int i2, long j);

    void redraw();

    void registerInput(int i) throws androidx.media3.common.VideoFrameProcessingException;

    boolean registerInputFrame(int i);

    void registerInputStream(int i, int i2, androidx.media3.common.Format format, java.util.List<androidx.media3.common.Effect> list, long j);

    void release();

    void renderOutputFrame(long j);

    void setCompositionEffects(java.util.List<androidx.media3.common.Effect> list);

    void setCompositorSettings(androidx.media3.common.VideoCompositorSettings videoCompositorSettings);

    void setOnInputFrameProcessedListener(int i, androidx.media3.common.OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(int i, java.lang.Runnable runnable);

    void setOutputSurfaceInfo(androidx.media3.common.SurfaceInfo surfaceInfo);

    void signalEndOfInput(int i);
}
