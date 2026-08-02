package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;

/* loaded from: classes3.dex */
public final /* synthetic */ class r implements MediaCodecUtil.ScoreProvider {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$applyWorkarounds$3;
        lambda$applyWorkarounds$3 = MediaCodecUtil.lambda$applyWorkarounds$3((MediaCodecInfo) obj);
        return lambda$applyWorkarounds$3;
    }
}
