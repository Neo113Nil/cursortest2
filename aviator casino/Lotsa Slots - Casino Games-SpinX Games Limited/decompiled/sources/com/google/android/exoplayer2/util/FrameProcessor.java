package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public interface FrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final long RELEASE_OUTPUT_FRAME_IMMEDIATELY = -1;

    public interface Factory {
        com.google.android.exoplayer2.util.FrameProcessor create(android.content.Context context, com.google.android.exoplayer2.util.FrameProcessor.Listener listener, java.util.List<com.google.android.exoplayer2.util.Effect> list, com.google.android.exoplayer2.util.DebugViewProvider debugViewProvider, com.google.android.exoplayer2.video.ColorInfo colorInfo, boolean z) throws com.google.android.exoplayer2.util.FrameProcessingException;
    }

    public interface Listener {
        void onFrameProcessingEnded();

        void onFrameProcessingError(com.google.android.exoplayer2.util.FrameProcessingException frameProcessingException);

        void onOutputFrameAvailable(long j);

        void onOutputSizeChanged(int i, int i2);
    }

    android.view.Surface getInputSurface();

    int getPendingInputFrameCount();

    void registerInputFrame();

    void release();

    void releaseOutputFrame(long j);

    void setInputFrameInfo(com.google.android.exoplayer2.util.FrameInfo frameInfo);

    void setOutputSurfaceInfo(com.google.android.exoplayer2.util.SurfaceInfo surfaceInfo);

    void signalEndOfInput();
}
