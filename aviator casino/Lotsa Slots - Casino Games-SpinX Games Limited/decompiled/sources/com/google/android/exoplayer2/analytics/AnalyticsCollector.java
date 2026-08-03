package com.google.android.exoplayer2.analytics;

/* loaded from: classes3.dex */
public interface AnalyticsCollector extends com.google.android.exoplayer2.Player.Listener, com.google.android.exoplayer2.source.MediaSourceEventListener, com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener, com.google.android.exoplayer2.drm.DrmSessionEventListener {
    void addListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener);

    void notifySeekStarted();

    void onAudioCodecError(java.lang.Exception exc);

    void onAudioDecoderInitialized(java.lang.String str, long j, long j2);

    void onAudioDecoderReleased(java.lang.String str);

    void onAudioDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    void onAudioPositionAdvancing(long j);

    void onAudioSinkError(java.lang.Exception exc);

    void onAudioUnderrun(int i, long j, long j2);

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(java.lang.Object obj, long j);

    void onVideoCodecError(java.lang.Exception exc);

    void onVideoDecoderInitialized(java.lang.String str, long j, long j2);

    void onVideoDecoderReleased(java.lang.String str);

    void onVideoDisabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoEnabled(com.google.android.exoplayer2.decoder.DecoderCounters decoderCounters);

    void onVideoFrameProcessingOffset(long j, int i);

    void onVideoInputFormatChanged(com.google.android.exoplayer2.Format format, com.google.android.exoplayer2.decoder.DecoderReuseEvaluation decoderReuseEvaluation);

    void release();

    void removeListener(com.google.android.exoplayer2.analytics.AnalyticsListener analyticsListener);

    void setPlayer(com.google.android.exoplayer2.Player player, android.os.Looper looper);

    void updateMediaPeriodQueueInfo(java.util.List<com.google.android.exoplayer2.source.MediaSource.MediaPeriodId> list, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaPeriodId);
}
