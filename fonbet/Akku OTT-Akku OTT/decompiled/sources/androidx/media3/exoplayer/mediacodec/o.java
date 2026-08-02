package androidx.media3.exoplayer.mediacodec;

import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements MediaCodecUtil.ScoreProvider {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecUtil.ScoreProvider
    public final int getScore(Object obj) {
        int lambda$getDecoderInfosSortedBySoftwareOnly$2;
        lambda$getDecoderInfosSortedBySoftwareOnly$2 = MediaCodecUtil.lambda$getDecoderInfosSortedBySoftwareOnly$2((MediaCodecInfo) obj);
        return lambda$getDecoderInfosSortedBySoftwareOnly$2;
    }
}
