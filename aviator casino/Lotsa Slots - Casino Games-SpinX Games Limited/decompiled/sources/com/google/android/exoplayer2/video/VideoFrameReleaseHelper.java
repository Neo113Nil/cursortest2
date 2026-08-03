package com.google.android.exoplayer2.video;

/* loaded from: classes3.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final java.lang.String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final com.google.android.exoplayer2.video.FixedFrameRateEstimator frameRateEstimator = new com.google.android.exoplayer2.video.FixedFrameRateEstimator();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;
    private android.view.Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;
    private final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler vsyncSampler;

    /* JADX INFO: Access modifiers changed from: private */
    interface DisplayHelper {

        public interface Listener {
            void onDefaultDisplayChanged(android.view.Display display);
        }

        void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener);

        void unregister();
    }

    public VideoFrameReleaseHelper(android.content.Context context) {
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = maybeBuildDisplayHelper;
        this.vsyncSampler = maybeBuildDisplayHelper != null ? com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler.getInstance() : null;
        this.vsyncDurationNs = -9223372036854775807L;
        this.vsyncOffsetNs = -9223372036854775807L;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.changeFrameRateStrategy == i) {
            return;
        }
        this.changeFrameRateStrategy = i;
        updateSurfacePlaybackFrameRate(true);
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.vsyncSampler)).addObserver();
            this.displayHelper.register(new com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener() { // from class: com.google.android.exoplayer2.video.VideoFrameReleaseHelper$$ExternalSyntheticLambda0
                @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
                public final void onDefaultDisplayChanged(android.view.Display display) {
                    com.google.android.exoplayer2.video.VideoFrameReleaseHelper.this.updateDefaultDisplayRefreshRateParams(display);
                }
            });
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onSurfaceChanged(android.view.Surface surface) {
        if (surface instanceof com.google.android.exoplayer2.video.PlaceholderSurface) {
            surface = null;
        }
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onPlaybackSpeed(float f) {
        this.playbackSpeed = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onFormatChanged(float f) {
        this.formatFrameRate = f;
        this.frameRateEstimator.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.pendingLastAdjustedFrameIndex;
        if (j2 != -1) {
            this.lastAdjustedFrameIndex = j2;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onStopped() {
        this.started = false;
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.unregister();
            ((com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.vsyncSampler)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public long adjustReleaseTime(long j) {
        long j2;
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler vSyncSampler;
        if (this.lastAdjustedFrameIndex != -1 && this.frameRateEstimator.isSynced()) {
            long frameDurationNs = this.lastAdjustedReleaseTimeNs + ((long) ((this.frameRateEstimator.getFrameDurationNs() * (this.frameIndex - this.lastAdjustedFrameIndex)) / this.playbackSpeed));
            if (!adjustmentAllowed(j, frameDurationNs)) {
                resetAdjustment();
            } else {
                j2 = frameDurationNs;
                this.pendingLastAdjustedFrameIndex = this.frameIndex;
                this.pendingLastAdjustedReleaseTimeNs = j2;
                vSyncSampler = this.vsyncSampler;
                if (vSyncSampler != null || this.vsyncDurationNs == -9223372036854775807L) {
                    return j2;
                }
                long j3 = vSyncSampler.sampledVsyncTimeNs;
                return j3 == -9223372036854775807L ? j2 : closestVsync(j2, j3, this.vsyncDurationNs) - this.vsyncOffsetNs;
            }
        }
        j2 = j;
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j2;
        vSyncSampler = this.vsyncSampler;
        if (vSyncSampler != null) {
        }
        return j2;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return java.lang.Math.abs(j - j2) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    private void updateSurfaceMediaFrameRate() {
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float frameRate = this.frameRateEstimator.isSynced() ? this.frameRateEstimator.getFrameRate() : this.formatFrameRate;
        float f = this.surfaceMediaFrameRate;
        if (frameRate == f) {
            return;
        }
        if (frameRate != -1.0f && f != -1.0f) {
            if (java.lang.Math.abs(frameRate - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.isSynced() || this.frameRateEstimator.getMatchingFrameDurationSumNs() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE)) {
                return;
            }
        } else if (frameRate == -1.0f && this.frameRateEstimator.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    private void updateSurfacePlaybackFrameRate(boolean z) {
        android.view.Surface surface;
        float f;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE) {
            return;
        }
        if (this.started) {
            float f2 = this.surfaceMediaFrameRate;
            if (f2 != -1.0f) {
                f = f2 * this.playbackSpeed;
                if (z && this.surfacePlaybackFrameRate == f) {
                    return;
                }
                this.surfacePlaybackFrameRate = f;
                com.google.android.exoplayer2.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(surface, f);
            }
        }
        f = 0.0f;
        if (z) {
        }
        this.surfacePlaybackFrameRate = f;
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(surface, f);
    }

    private void clearSurfaceFrameRate() {
        android.view.Surface surface;
        if (com.google.android.exoplayer2.util.Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.Api30.setSurfaceFrameRate(surface, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(android.view.Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        } else {
            com.google.android.exoplayer2.util.Log.w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = -9223372036854775807L;
            this.vsyncOffsetNs = -9223372036854775807L;
        }
    }

    private static long closestVsync(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    private static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildDisplayHelper(android.content.Context context) {
        if (context == null) {
            return null;
        }
        android.content.Context applicationContext = context.getApplicationContext();
        com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildNewInstance = com.google.android.exoplayer2.util.Util.SDK_INT >= 17 ? com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV17.maybeBuildNewInstance(applicationContext) : null;
        return maybeBuildNewInstance == null ? com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV16.maybeBuildNewInstance(applicationContext) : maybeBuildNewInstance;
    }

    private static final class Api30 {
        private Api30() {
        }

        public static void setSurfaceFrameRate(android.view.Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (java.lang.IllegalStateException e) {
                com.google.android.exoplayer2.util.Log.e(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    private static final class DisplayHelperV16 implements com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper {
        private final android.view.WindowManager windowManager;

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
        }

        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildNewInstance(android.content.Context context) {
            android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV16(windowManager);
            }
            return null;
        }

        private DisplayHelperV16(android.view.WindowManager windowManager) {
            this.windowManager = windowManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener) {
            listener.onDefaultDisplayChanged(this.windowManager.getDefaultDisplay());
        }
    }

    private static final class DisplayHelperV17 implements com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper, android.hardware.display.DisplayManager.DisplayListener {
        private final android.hardware.display.DisplayManager displayManager;
        private com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper maybeBuildNewInstance(android.content.Context context) {
            android.hardware.display.DisplayManager displayManager = (android.hardware.display.DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelperV17(displayManager);
            }
            return null;
        }

        private DisplayHelperV17(android.hardware.display.DisplayManager displayManager) {
            this.displayManager = displayManager;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void register(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener) {
            this.listener = listener;
            this.displayManager.registerDisplayListener(this, com.google.android.exoplayer2.util.Util.createHandlerForCurrentLooper());
            listener.onDefaultDisplayChanged(getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void unregister() {
            this.displayManager.unregisterDisplayListener(this);
            this.listener = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener listener = this.listener;
            if (listener == null || i != 0) {
                return;
            }
            listener.onDefaultDisplayChanged(getDefaultDisplay());
        }

        private android.view.Display getDefaultDisplay() {
            return this.displayManager.getDisplay(0);
        }
    }

    private static final class VSyncSampler implements android.view.Choreographer.FrameCallback, android.os.Handler.Callback {
        private static final int CREATE_CHOREOGRAPHER = 0;
        private static final com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler INSTANCE = new com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler();
        private static final int MSG_ADD_OBSERVER = 1;
        private static final int MSG_REMOVE_OBSERVER = 2;
        private android.view.Choreographer choreographer;
        private final android.os.HandlerThread choreographerOwnerThread;
        private final android.os.Handler handler;
        private int observerCount;
        public volatile long sampledVsyncTimeNs = -9223372036854775807L;

        public static com.google.android.exoplayer2.video.VideoFrameReleaseHelper.VSyncSampler getInstance() {
            return INSTANCE;
        }

        private VSyncSampler() {
            android.os.HandlerThread handlerThread = new android.os.HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.choreographerOwnerThread = handlerThread;
            handlerThread.start();
            android.os.Handler createHandler = com.google.android.exoplayer2.util.Util.createHandler(handlerThread.getLooper(), this);
            this.handler = createHandler;
            createHandler.sendEmptyMessage(0);
        }

        public void addObserver() {
            this.handler.sendEmptyMessage(1);
        }

        public void removeObserver() {
            this.handler.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.sampledVsyncTimeNs = j;
            ((android.view.Choreographer) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.choreographer)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            int i = message.what;
            if (i == 0) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i == 1) {
                addObserverInternal();
                return true;
            }
            if (i != 2) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.choreographer = android.view.Choreographer.getInstance();
            } catch (java.lang.RuntimeException e) {
                com.google.android.exoplayer2.util.Log.w(com.google.android.exoplayer2.video.VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e);
            }
        }

        private void addObserverInternal() {
            android.view.Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount + 1;
                this.observerCount = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void removeObserverInternal() {
            android.view.Choreographer choreographer = this.choreographer;
            if (choreographer != null) {
                int i = this.observerCount - 1;
                this.observerCount = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.sampledVsyncTimeNs = -9223372036854775807L;
                }
            }
        }
    }
}
