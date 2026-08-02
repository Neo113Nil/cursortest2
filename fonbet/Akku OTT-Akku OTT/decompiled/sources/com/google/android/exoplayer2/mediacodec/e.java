package com.google.android.exoplayer2.mediacodec;

import java.util.List;

/* loaded from: classes4.dex */
public final /* synthetic */ class e implements MediaCodecSelector {
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecSelector
    public final List getDecoderInfos(String str, boolean z, boolean z2) {
        return MediaCodecUtil.getDecoderInfos(str, z, z2);
    }
}
