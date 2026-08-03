package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
public interface LoadControl {

    @java.lang.Deprecated
    public static final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId EMPTY_MEDIA_PERIOD_ID = new androidx.media3.exoplayer.source.MediaSource.MediaPeriodId(new java.lang.Object());

    androidx.media3.exoplayer.upstream.Allocator getAllocator();

    @java.lang.Deprecated
    long getBackBufferDurationUs();

    long getBackBufferDurationUs(androidx.media3.exoplayer.analytics.PlayerId playerId);

    @java.lang.Deprecated
    void onPrepared();

    void onPrepared(androidx.media3.exoplayer.analytics.PlayerId playerId);

    @java.lang.Deprecated
    void onReleased();

    void onReleased(androidx.media3.exoplayer.analytics.PlayerId playerId);

    @java.lang.Deprecated
    void onStopped();

    void onStopped(androidx.media3.exoplayer.analytics.PlayerId playerId);

    @java.lang.Deprecated
    void onTracksSelected(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr);

    void onTracksSelected(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr);

    @java.lang.Deprecated
    void onTracksSelected(androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr);

    @java.lang.Deprecated
    boolean retainBackBufferFromKeyframe();

    boolean retainBackBufferFromKeyframe(androidx.media3.exoplayer.analytics.PlayerId playerId);

    @java.lang.Deprecated
    boolean shouldContinueLoading(long j, long j2, float f);

    boolean shouldContinueLoading(androidx.media3.exoplayer.LoadControl.Parameters parameters);

    @java.lang.Deprecated
    boolean shouldStartPlayback(long j, float f, boolean z, long j2);

    @java.lang.Deprecated
    boolean shouldStartPlayback(androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, float f, boolean z, long j2);

    boolean shouldStartPlayback(androidx.media3.exoplayer.LoadControl.Parameters parameters);

    public static final class Parameters {
        public final long bufferedDurationUs;
        public final androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId;
        public final boolean playWhenReady;
        public final long playbackPositionUs;
        public final float playbackSpeed;
        public final androidx.media3.exoplayer.analytics.PlayerId playerId;
        public final boolean rebuffering;
        public final long targetLiveOffsetUs;
        public final androidx.media3.common.Timeline timeline;

        public Parameters(androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.common.Timeline timeline, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z, boolean z2, long j3) {
            this.playerId = playerId;
            this.timeline = timeline;
            this.mediaPeriodId = mediaPeriodId;
            this.playbackPositionUs = j;
            this.bufferedDurationUs = j2;
            this.playbackSpeed = f;
            this.playWhenReady = z;
            this.rebuffering = z2;
            this.targetLiveOffsetUs = j3;
        }
    }

    /* renamed from: androidx.media3.exoplayer.LoadControl$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        @java.lang.Deprecated
        public static void $default$onPrepared(androidx.media3.exoplayer.LoadControl _this) {
            throw new java.lang.IllegalStateException("onPrepared not implemented");
        }

        @java.lang.Deprecated
        public static void $default$onTracksSelected(androidx.media3.exoplayer.LoadControl _this, androidx.media3.exoplayer.Renderer[] rendererArr, androidx.media3.exoplayer.source.TrackGroupArray trackGroupArray, androidx.media3.exoplayer.trackselection.ExoTrackSelection[] exoTrackSelectionArr) {
            throw new java.lang.IllegalStateException("onTracksSelected not implemented");
        }

        @java.lang.Deprecated
        public static void $default$onStopped(androidx.media3.exoplayer.LoadControl _this) {
            throw new java.lang.IllegalStateException("onStopped not implemented");
        }

        @java.lang.Deprecated
        public static void $default$onReleased(androidx.media3.exoplayer.LoadControl _this) {
            throw new java.lang.IllegalStateException("onReleased not implemented");
        }

        @java.lang.Deprecated
        public static long $default$getBackBufferDurationUs(androidx.media3.exoplayer.LoadControl _this) {
            throw new java.lang.IllegalStateException("getBackBufferDurationUs not implemented");
        }

        @java.lang.Deprecated
        public static boolean $default$retainBackBufferFromKeyframe(androidx.media3.exoplayer.LoadControl _this) {
            throw new java.lang.IllegalStateException("retainBackBufferFromKeyframe not implemented");
        }

        @java.lang.Deprecated
        public static boolean $default$shouldContinueLoading(androidx.media3.exoplayer.LoadControl _this, long j, long j2, float f) {
            throw new java.lang.IllegalStateException("shouldContinueLoading not implemented");
        }

        @java.lang.Deprecated
        public static boolean $default$shouldStartPlayback(androidx.media3.exoplayer.LoadControl _this, long j, float f, boolean z, long j2) {
            throw new java.lang.IllegalStateException("shouldStartPlayback not implemented");
        }
    }
}
