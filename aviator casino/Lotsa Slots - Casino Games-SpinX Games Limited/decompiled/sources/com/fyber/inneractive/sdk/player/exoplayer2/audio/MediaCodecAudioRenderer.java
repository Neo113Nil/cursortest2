package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public class MediaCodecAudioRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c implements com.fyber.inneractive.sdk.player.exoplayer2.util.h {
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher P;
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.r Q;
    public boolean R;
    public int S;
    public int T;
    public long U;
    public boolean V;

    public MediaCodecAudioRenderer() {
        super(1, true);
        this.Q = new com.fyber.inneractive.sdk.player.exoplayer2.audio.r(new com.fyber.inneractive.sdk.player.exoplayer2.audio.c[0], new com.fyber.inneractive.sdk.player.exoplayer2.audio.u(this));
        this.P = new com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener.EventDispatcher(null, null);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        java.lang.String str = oVar.f;
        this.Q.getClass();
        java.lang.String str2 = oVar.f;
        dVar.getClass();
        return com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i;
        int i2;
        java.lang.String str = oVar.f;
        if (!"audio".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        int i4 = i3 >= 21 ? 16 : 0;
        this.Q.getClass();
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a2 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(false, str);
        if (a2 == null) {
            return 1;
        }
        return ((i3 < 21 || (((i = oVar.s) == -1 || a2.b(i)) && ((i2 = oVar.r) == -1 || a2.a(i2)))) ? 3 : 2) | i4 | 4;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final com.fyber.inneractive.sdk.player.exoplayer2.util.h d() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean e() {
        if (this.L) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            if (!rVar.d() || (rVar.X && !rVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        return this.Q.c() || super.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            rVar.g();
            for (com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar : rVar.c) {
                cVar.f();
            }
            rVar.Z = 0;
            rVar.Y = false;
            try {
                this.n = null;
                o();
            } finally {
            }
        } catch (java.lang.Throwable th) {
            try {
                this.n = null;
                o();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters();
        this.N = decoderCounters;
        this.P.enabled(decoderCounters);
        int i = this.b.f4066a;
        if (i == 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            if (rVar.a0) {
                rVar.a0 = false;
                rVar.Z = 0;
                rVar.g();
                return;
            }
            return;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar2 = this.Q;
        rVar2.getClass();
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 21) {
            throw new java.lang.IllegalStateException();
        }
        if (rVar2.a0 && rVar2.Z == i) {
            return;
        }
        rVar2.a0 = true;
        rVar2.Z = i;
        rVar2.g();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.Q.f();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
        rVar.Y = false;
        if (rVar.d()) {
            rVar.z = 0L;
            rVar.y = 0;
            rVar.x = 0;
            rVar.A = 0L;
            rVar.B = false;
            rVar.C = 0L;
            rVar.g.d();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void p() {
        try {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            if (!rVar.X && rVar.d() && rVar.a()) {
                rVar.g.a(rVar.b());
                rVar.w = 0;
                rVar.X = true;
            }
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.audio.q e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, android.media.MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z;
        java.lang.String str = aVar.f4035a;
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 24 && "OMX.SEC.aac.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.c)) {
            java.lang.String str2 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z = true;
                this.R = z;
                mediaCodec.configure(oVar.a(), (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
            }
        }
        z = false;
        this.R = z;
        mediaCodec.configure(oVar.a(), (android.view.Surface) null, (android.media.MediaCrypto) null, 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long a2 = this.Q.a(e());
        if (a2 != Long.MIN_VALUE) {
            if (!this.V) {
                a2 = java.lang.Math.max(this.U, a2);
            }
            this.U = a2;
            this.V = false;
        }
        return this.U;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(java.lang.String str, long j, long j2) {
        this.P.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        super.a(oVar);
        this.P.inputFormatChanged(oVar);
        this.S = "audio/raw".equals(oVar.f) ? oVar.t : 2;
        this.T = oVar.r;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (this.R && integer == 6 && (i = this.T) < 6) {
            iArr = new int[i];
            for (int i2 = 0; i2 < this.T; i2++) {
                iArr[i2] = i2;
            }
        } else {
            iArr = null;
        }
        try {
            this.Q.a(integer, integer2, this.S, iArr);
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.audio.m e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z, long j) {
        super.a(z, j);
        this.Q.g();
        this.U = j;
        this.V = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        return this.Q.a(sVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.Q.s;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(long j, long j2, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i, long j3, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.N.skippedOutputBufferCount++;
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            if (rVar.L == 1) {
                rVar.L = 2;
            }
            return true;
        }
        try {
            if (!this.Q.a(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.N.renderedOutputBufferCount++;
            return true;
        } catch (com.fyber.inneractive.sdk.player.exoplayer2.audio.n | com.fyber.inneractive.sdk.player.exoplayer2.audio.q e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.d(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i, java.lang.Object obj) {
        if (i == 2) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar = this.Q;
            float floatValue = ((java.lang.Float) obj).floatValue();
            if (rVar.P != floatValue) {
                rVar.P = floatValue;
                rVar.i();
                return;
            }
            return;
        }
        if (i != 3) {
            return;
        }
        int intValue = ((java.lang.Integer) obj).intValue();
        com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar2 = this.Q;
        if (rVar2.n == intValue) {
            return;
        }
        rVar2.n = intValue;
        if (rVar2.a0) {
            return;
        }
        rVar2.g();
        rVar2.Z = 0;
    }
}
