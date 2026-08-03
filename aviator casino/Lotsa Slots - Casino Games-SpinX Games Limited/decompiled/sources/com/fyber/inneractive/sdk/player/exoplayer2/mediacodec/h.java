package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g {
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final int a() {
        return android.media.MediaCodecList.getCodecCount();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean b() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final android.media.MediaCodecInfo a(int i) {
        return android.media.MediaCodecList.getCodecInfoAt(i);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean a(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }
}
