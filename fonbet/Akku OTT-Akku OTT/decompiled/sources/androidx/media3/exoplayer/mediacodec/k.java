package androidx.media3.exoplayer.mediacodec;

import java.util.List;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements MediaCodecSelector {
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
    public final List getDecoderInfos(String str, boolean z, boolean z2) {
        return MediaCodecUtil.getDecoderInfos(str, z, z2);
    }
}
