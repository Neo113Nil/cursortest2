package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

/* loaded from: classes3.dex */
public final class i implements com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4038a;
    public android.media.MediaCodecInfo[] b;

    public i(boolean z) {
        this.f4038a = z ? 1 : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean a(java.lang.String str, android.media.MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final boolean b() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final int a() {
        if (this.b == null) {
            this.b = new android.media.MediaCodecList(this.f4038a).getCodecInfos();
        }
        return this.b.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.g
    public final android.media.MediaCodecInfo a(int i) {
        if (this.b == null) {
            this.b = new android.media.MediaCodecList(this.f4038a).getCodecInfos();
        }
        return this.b[i];
    }
}
