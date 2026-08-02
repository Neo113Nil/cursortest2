package com.google.android.exoplayer2.mediacodec;

import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* loaded from: classes4.dex */
public final /* synthetic */ class h implements MediaCodecUtil.ScoreProvider {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$applyWorkarounds$2;
        lambda$applyWorkarounds$2 = MediaCodecUtil.lambda$applyWorkarounds$2((MediaCodecInfo) obj);
        return lambda$applyWorkarounds$2;
    }
}
