package com.fyber.inneractive.sdk.player.controller;

/* loaded from: classes3.dex */
public final class b0 implements com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f3877a;
    public boolean b = false;

    public b0(com.fyber.inneractive.sdk.player.controller.f fVar) {
        this.f3877a = new java.lang.ref.WeakReference(fVar);
    }

    public final java.lang.String a() {
        com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) this.f3877a.get();
        return fVar == null ? com.fyber.inneractive.sdk.player.controller.b0.class.getName() : com.fyber.inneractive.sdk.util.IAlog.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i, long j) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(android.view.Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(java.lang.String str, long j, long j2) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) this.f3877a.get();
        if (fVar != null) {
            fVar.t = i;
            fVar.u = i2;
        }
    }

    public final void a(int i, boolean z) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        com.fyber.inneractive.sdk.util.IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), java.lang.Boolean.valueOf(z), java.lang.Integer.valueOf(i));
        com.fyber.inneractive.sdk.player.controller.f fVar = (com.fyber.inneractive.sdk.player.controller.f) this.f3877a.get();
        if (fVar == null || (gVar = fVar.s) == null || fVar.z) {
            return;
        }
        if (i != 3) {
            if (i == 2) {
                if (fVar.e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (!z) {
            if (fVar.e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.o;
                if (hVar != null && hVar.f4071a > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.b[0];
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.d[bVar.a()];
                    if (oVar != null) {
                        int i2 = oVar.j;
                        int i3 = oVar.k;
                        fVar.t = i2;
                        fVar.u = i3;
                    }
                }
                this.b = true;
                fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                return;
            }
            return;
        }
        fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
    }
}
