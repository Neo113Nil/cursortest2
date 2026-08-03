package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public final class f implements android.media.MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer f4126a;

    public f(com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer mediaCodecVideoRenderer, android.media.MediaCodec mediaCodec) {
        this.f4126a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new android.os.Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(android.media.MediaCodec mediaCodec, long j, long j2) {
        com.fyber.inneractive.sdk.player.exoplayer2.video.MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f4126a;
        if (this == mediaCodecVideoRenderer.p0 && !mediaCodecVideoRenderer.Y) {
            mediaCodecVideoRenderer.Y = true;
            mediaCodecVideoRenderer.Q.renderedFirstFrame(mediaCodecVideoRenderer.W);
        }
    }
}
