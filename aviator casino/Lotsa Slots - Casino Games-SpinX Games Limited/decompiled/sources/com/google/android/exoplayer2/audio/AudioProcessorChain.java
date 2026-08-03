package com.google.android.exoplayer2.audio;

/* loaded from: classes3.dex */
public interface AudioProcessorChain {
    com.google.android.exoplayer2.PlaybackParameters applyPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters playbackParameters);

    boolean applySkipSilenceEnabled(boolean z);

    com.google.android.exoplayer2.audio.AudioProcessor[] getAudioProcessors();

    long getMediaDuration(long j);

    long getSkippedOutputFrameCount();
}
