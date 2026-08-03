package androidx.media3.exoplayer;

/* loaded from: classes2.dex */
public interface MediaClock {

    /* renamed from: androidx.media3.exoplayer.MediaClock$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static boolean $default$hasSkippedSilenceSinceLastCall(androidx.media3.exoplayer.MediaClock _this) {
            return false;
        }
    }

    androidx.media3.common.PlaybackParameters getPlaybackParameters();

    long getPositionUs();

    boolean hasSkippedSilenceSinceLastCall();

    void setPlaybackParameters(androidx.media3.common.PlaybackParameters playbackParameters);
}
