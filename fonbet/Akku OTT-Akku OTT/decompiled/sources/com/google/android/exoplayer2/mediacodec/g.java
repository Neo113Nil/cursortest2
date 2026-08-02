package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: classes4.dex */
public final /* synthetic */ class g implements MediaCodecUtil.ScoreProvider {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$applyWorkarounds$1;
        lambda$applyWorkarounds$1 = MediaCodecUtil.lambda$applyWorkarounds$1((MediaCodecInfo) obj);
        return lambda$applyWorkarounds$1;
    }
}
