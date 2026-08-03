package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* loaded from: classes3.dex */
public class MediaCodecVideoRenderer extends com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c {
    public static final int[] q0 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.h P;
    public final com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher Q;
    public final long R;
    public final int S;
    public final boolean T;
    public com.fyber.inneractive.sdk.player.exoplayer2.o[] U;
    public com.fyber.inneractive.sdk.player.exoplayer2.video.e V;
    public android.view.Surface W;
    public int X;
    public boolean Y;
    public long Z;
    public long a0;
    public int b0;
    public int c0;
    public int d0;
    public float e0;
    public int f0;
    public int g0;
    public int h0;
    public float i0;
    public int j0;
    public int k0;
    public int l0;
    public float m0;
    public boolean n0;
    public int o0;
    public com.fyber.inneractive.sdk.player.exoplayer2.video.f p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaCodecVideoRenderer(android.os.Handler handler, com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener videoRendererEventListener) {
        super(2, false);
        boolean z = false;
        this.R = 5000L;
        this.S = -1;
        this.P = new com.fyber.inneractive.sdk.player.exoplayer2.video.h();
        this.Q = new com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener.EventDispatcher(handler, videoRendererEventListener);
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a <= 22 && "foster".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.b) && "NVIDIA".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.c)) {
            z = true;
        }
        this.T = z;
        this.Z = -9223372036854775807L;
        this.f0 = -1;
        this.g0 = -1;
        this.i0 = -1.0f;
        this.e0 = -1.0f;
        this.X = 1;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.l0 = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr) {
        this.U = oVarArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final int b(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.d dVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        boolean z;
        int i;
        int i2;
        java.lang.String str = oVar.f;
        if (!"video".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.i.b(str))) {
            return 0;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.drm.d dVar2 = oVar.i;
        if (dVar2 != null) {
            z = false;
            for (int i3 = 0; i3 < dVar2.c; i3++) {
                z |= dVar2.f3923a[i3].e;
            }
        } else {
            z = false;
        }
        dVar.getClass();
        com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a a2 = com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a(z, str);
        if (a2 == null) {
            return 1;
        }
        boolean a3 = a2.a(oVar.c);
        if (a3 && (i = oVar.j) > 0 && (i2 = oVar.k) > 0) {
            if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
                a3 = a2.a(i, i2, oVar.l);
            } else {
                boolean z2 = i * i2 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a();
                if (!z2) {
                    android.util.Log.d("MediaCodecVideoRenderer", "FalseCheck [legacyFrameSize, " + oVar.j + "x" + oVar.k + "] [" + com.fyber.inneractive.sdk.player.exoplayer2.util.z.e + com.ironsource.X3.j.e);
                }
                a3 = z2;
            }
        }
        return (a3 ? 3 : 2) | (a2.b ? 8 : 4) | (a2.c ? 16 : 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final boolean f() {
        if ((this.Y || super.q()) && super.f()) {
            this.Z = -9223372036854775807L;
            return true;
        }
        if (this.Z == -9223372036854775807L) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() < this.Z) {
            return true;
        }
        this.Z = -9223372036854775807L;
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void g() {
        this.f0 = -1;
        this.g0 = -1;
        this.i0 = -1.0f;
        this.e0 = -1.0f;
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.l0 = -1;
        r();
        com.fyber.inneractive.sdk.player.exoplayer2.video.h hVar = this.P;
        if (hVar.b) {
            hVar.f4128a.b.sendEmptyMessage(2);
        }
        this.p0 = null;
        try {
            this.n = null;
            o();
        } finally {
            this.N.ensureUpdated();
            this.Q.disabled(this.N);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void h() {
        com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters();
        this.N = decoderCounters;
        int i = this.b.f4066a;
        this.o0 = i;
        this.n0 = i != 0;
        this.Q.enabled(decoderCounters);
        com.fyber.inneractive.sdk.player.exoplayer2.video.h hVar = this.P;
        hVar.h = false;
        if (hVar.b) {
            hVar.f4128a.b.sendEmptyMessage(1);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void i() {
        this.b0 = 0;
        this.a0 = android.os.SystemClock.elapsedRealtime();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void j() {
        this.Z = -9223372036854775807L;
        if (this.b0 > 0) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.Q.droppedFrames(this.b0, elapsedRealtime - this.a0);
            this.b0 = 0;
            this.a0 = elapsedRealtime;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void m() {
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 23 || !this.n0 || this.Y) {
            return;
        }
        this.Y = true;
        this.Q.renderedFirstFrame(this.W);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean q() {
        android.view.Surface surface;
        return super.q() && (surface = this.W) != null && surface.isValid();
    }

    public final void r() {
        android.media.MediaCodec mediaCodec;
        this.Y = false;
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 23 || !this.n0 || (mediaCodec = this.o) == null) {
            return;
        }
        this.p0 = new com.fyber.inneractive.sdk.player.exoplayer2.video.f(this, mediaCodec);
    }

    public final void s() {
        int i = this.f0;
        if (i == -1 && this.g0 == -1) {
            return;
        }
        if (this.j0 == i && this.k0 == this.g0 && this.l0 == this.h0 && this.m0 == this.i0) {
            return;
        }
        this.Q.videoSizeChanged(i, this.g0, this.h0, this.i0);
        this.j0 = this.f0;
        this.k0 = this.g0;
        this.l0 = this.h0;
        this.m0 = this.i0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c, com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(boolean z, long j) {
        super.a(z, j);
        r();
        this.c0 = 0;
        if (z) {
            this.Z = this.R > 0 ? android.os.SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
        } else {
            this.Z = -9223372036854775807L;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.a
    public final void a(int i, java.lang.Object obj) {
        if (i != 1) {
            if (i == 4) {
                int intValue = ((java.lang.Integer) obj).intValue();
                this.X = intValue;
                android.media.MediaCodec mediaCodec = this.o;
                if (mediaCodec != null) {
                    mediaCodec.setVideoScalingMode(intValue);
                    return;
                }
                return;
            }
            return;
        }
        android.view.Surface surface = (android.view.Surface) obj;
        if (this.W == surface) {
            if (surface != null) {
                int i2 = this.j0;
                if (i2 != -1 || this.k0 != -1) {
                    this.Q.videoSizeChanged(i2, this.k0, this.l0, this.m0);
                }
                if (this.Y) {
                    this.Q.renderedFirstFrame(this.W);
                    return;
                }
                return;
            }
            return;
        }
        this.W = surface;
        int i3 = this.c;
        if (i3 == 1 || i3 == 2) {
            android.media.MediaCodec mediaCodec2 = this.o;
            if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 23 && mediaCodec2 != null && surface != null) {
                mediaCodec2.setOutputSurface(surface);
            } else {
                o();
                l();
            }
        }
        if (surface != null) {
            int i4 = this.j0;
            if (i4 != -1 || this.k0 != -1) {
                this.Q.videoSizeChanged(i4, this.k0, this.l0, this.m0);
            }
            r();
            if (i3 == 2) {
                this.Z = this.R > 0 ? android.os.SystemClock.elapsedRealtime() + this.R : -9223372036854775807L;
                return;
            }
            return;
        }
        this.j0 = -1;
        this.k0 = -1;
        this.m0 = -1.0f;
        this.l0 = -1;
        r();
    }

    public static boolean b(boolean z, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (!oVar.f.equals(oVar2.f)) {
            return false;
        }
        int i = oVar.m;
        if (i == -1) {
            i = 0;
        }
        int i2 = oVar2.m;
        if (i2 == -1) {
            i2 = 0;
        }
        if (i == i2) {
            return z || (oVar.j == oVar2.j && oVar.k == oVar2.k);
        }
        return false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.a aVar, android.media.MediaCodec mediaCodec, com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.video.e eVar;
        java.lang.String str;
        android.graphics.Point point;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.U;
        int i2 = oVar.j;
        int i3 = oVar.k;
        int i4 = oVar.g;
        if (i4 == -1) {
            i4 = a(oVar.f, i2, i3);
        }
        if (oVarArr.length == 1) {
            eVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.e(i2, i3, i4);
        } else {
            boolean z = false;
            for (com.fyber.inneractive.sdk.player.exoplayer2.o oVar2 : oVarArr) {
                if (b(aVar.b, oVar, oVar2)) {
                    int i5 = oVar2.j;
                    z |= i5 == -1 || oVar2.k == -1;
                    i2 = java.lang.Math.max(i2, i5);
                    i3 = java.lang.Math.max(i3, oVar2.k);
                    int i6 = oVar2.g;
                    if (i6 == -1) {
                        i6 = a(oVar2.f, oVar2.j, oVar2.k);
                    }
                    i4 = java.lang.Math.max(i4, i6);
                }
            }
            if (z) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Resolutions unknown. Codec max resolution: ");
                sb.append(i2);
                java.lang.String str2 = "x";
                sb.append("x");
                sb.append(i3);
                android.util.Log.w("MediaCodecVideoRenderer", sb.toString());
                int i7 = oVar.k;
                int i8 = oVar.j;
                boolean z2 = i7 > i8;
                int i9 = z2 ? i7 : i8;
                if (z2) {
                    i7 = i8;
                }
                float f = i7 / i9;
                int[] iArr = q0;
                int i10 = 0;
                while (i10 < 9) {
                    int i11 = iArr[i10];
                    int[] iArr2 = iArr;
                    int i12 = (int) (i11 * f);
                    if (i11 <= i9 || i12 <= i7) {
                        break;
                    }
                    int i13 = i7;
                    float f2 = f;
                    if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
                        int i14 = z2 ? i12 : i11;
                        if (!z2) {
                            i11 = i12;
                        }
                        point = aVar.a(i14, i11);
                        str = str2;
                        if (aVar.a(point.x, point.y, oVar.l)) {
                            break;
                        }
                        i10++;
                        iArr = iArr2;
                        i7 = i13;
                        f = f2;
                        str2 = str;
                    } else {
                        str = str2;
                        int i15 = ((i11 + 15) / 16) * 16;
                        int i16 = ((i12 + 15) / 16) * 16;
                        if (i15 * i16 <= com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.j.a()) {
                            int i17 = z2 ? i16 : i15;
                            if (!z2) {
                                i15 = i16;
                            }
                            point = new android.graphics.Point(i17, i15);
                        } else {
                            i10++;
                            iArr = iArr2;
                            i7 = i13;
                            f = f2;
                            str2 = str;
                        }
                    }
                }
                str = str2;
                point = null;
                if (point != null) {
                    i2 = java.lang.Math.max(i2, point.x);
                    i3 = java.lang.Math.max(i3, point.y);
                    i4 = java.lang.Math.max(i4, a(oVar.f, i2, i3));
                    android.util.Log.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i2 + str + i3);
                }
            }
            eVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.e(i2, i3, i4);
        }
        this.V = eVar;
        boolean z3 = this.T;
        int i18 = this.o0;
        android.media.MediaFormat a2 = oVar.a();
        a2.setInteger("max-width", eVar.f4125a);
        a2.setInteger("max-height", eVar.b);
        int i19 = eVar.c;
        if (i19 != -1) {
            a2.setInteger("max-input-size", i19);
        }
        if (z3) {
            i = 0;
            a2.setInteger("auto-frc", 0);
        } else {
            i = 0;
        }
        if (i18 != 0) {
            a2.setFeatureEnabled("tunneled-playback", true);
            a2.setInteger("audio-session-id", i18);
        }
        mediaCodec.configure(a2, this.W, (android.media.MediaCrypto) null, i);
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 23 || !this.n0) {
            return;
        }
        this.p0 = new com.fyber.inneractive.sdk.player.exoplayer2.video.f(this, mediaCodec);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(java.lang.String str, long j, long j2) {
        this.Q.decoderInitialized(str, j, j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        super.a(oVar);
        this.Q.inputFormatChanged(oVar);
        float f = oVar.n;
        if (f == -1.0f) {
            f = 1.0f;
        }
        this.e0 = f;
        int i = oVar.m;
        if (i == -1) {
            i = 0;
        }
        this.d0 = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final void a(android.media.MediaCodec mediaCodec, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        this.f0 = integer;
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        this.g0 = integer2;
        float f = this.e0;
        this.i0 = f;
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
            int i = this.d0;
            if (i == 90 || i == 270) {
                int i2 = this.f0;
                this.f0 = integer2;
                this.g0 = i2;
                this.i0 = 1.0f / f;
            }
        } else {
            this.h0 = this.d0;
        }
        mediaCodec.setVideoScalingMode(this.X);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    public final boolean a(boolean z, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, com.fyber.inneractive.sdk.player.exoplayer2.o oVar2) {
        if (b(z, oVar, oVar2)) {
            int i = oVar2.j;
            com.fyber.inneractive.sdk.player.exoplayer2.video.e eVar = this.V;
            if (i <= eVar.f4125a && oVar2.k <= eVar.b && oVar2.g <= eVar.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0188  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(long j, long j2, android.media.MediaCodec mediaCodec, java.nio.ByteBuffer byteBuffer, int i, long j3, boolean z) {
        long j4;
        long j5;
        com.fyber.inneractive.sdk.player.exoplayer2.video.g gVar;
        long j6;
        long j7;
        long j8;
        if (z) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("skipVideoBuffer");
            mediaCodec.releaseOutputBuffer(i, false);
            com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
            this.N.skippedOutputBufferCount++;
            return true;
        }
        if (!this.Y) {
            if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
                long nanoTime = java.lang.System.nanoTime();
                s();
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i, nanoTime);
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                this.N.renderedOutputBufferCount++;
                this.c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            } else {
                s();
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("releaseOutputBuffer");
                mediaCodec.releaseOutputBuffer(i, true);
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                this.N.renderedOutputBufferCount++;
                this.c0 = 0;
                if (!this.Y) {
                    this.Y = true;
                    this.Q.renderedFirstFrame(this.W);
                }
            }
            return true;
        }
        if (this.c != 2) {
            return false;
        }
        long elapsedRealtime = (j3 - j) - ((android.os.SystemClock.elapsedRealtime() * 1000) - j2);
        long nanoTime2 = java.lang.System.nanoTime();
        long j9 = (elapsedRealtime * 1000) + nanoTime2;
        com.fyber.inneractive.sdk.player.exoplayer2.video.h hVar = this.P;
        long j10 = j3 * 1000;
        if (hVar.h) {
            if (j3 != hVar.e) {
                hVar.k++;
                hVar.f = hVar.g;
            }
            long j11 = hVar.k;
            if (j11 >= 6) {
                long j12 = hVar.j;
                j4 = hVar.f + ((j10 - j12) / j11);
                if (java.lang.Math.abs((j9 - hVar.i) - (j4 - j12)) > 20000000) {
                    hVar.h = false;
                } else {
                    j5 = (hVar.i + j4) - hVar.j;
                    if (!hVar.h) {
                        hVar.j = j10;
                        hVar.i = j9;
                        hVar.k = 0L;
                        hVar.h = true;
                    }
                    hVar.e = j3;
                    hVar.g = j4;
                    gVar = hVar.f4128a;
                    if (gVar != null && gVar.f4127a != 0) {
                        long j13 = hVar.f4128a.f4127a;
                        long j14 = hVar.c;
                        j7 = (((j5 - j13) / j14) * j14) + j13;
                        if (j5 > j7) {
                            j8 = j7 - j14;
                        } else {
                            j8 = j7;
                            j7 = j14 + j7;
                        }
                        if (j7 - j5 >= j5 - j8) {
                            j7 = j8;
                        }
                        j5 = j7 - hVar.d;
                    }
                    j6 = (j5 - nanoTime2) / 1000;
                    if (j6 >= -30000) {
                        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("dropVideoBuffer");
                        mediaCodec.releaseOutputBuffer(i, false);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                        com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters decoderCounters = this.N;
                        decoderCounters.droppedOutputBufferCount++;
                        this.b0++;
                        int i2 = this.c0 + 1;
                        this.c0 = i2;
                        decoderCounters.maxConsecutiveDroppedOutputBufferCount = java.lang.Math.max(i2, decoderCounters.maxConsecutiveDroppedOutputBufferCount);
                        int i3 = this.b0;
                        if (i3 != this.S || i3 <= 0) {
                            return true;
                        }
                        long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                        this.Q.droppedFrames(this.b0, elapsedRealtime2 - this.a0);
                        this.b0 = 0;
                        this.a0 = elapsedRealtime2;
                        return true;
                    }
                    if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
                        if (j6 >= com.unity3d.services.core.di.ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                            return false;
                        }
                        s();
                        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("releaseOutputBuffer");
                        mediaCodec.releaseOutputBuffer(i, j5);
                        com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                        this.N.renderedOutputBufferCount++;
                        this.c0 = 0;
                        if (!this.Y) {
                            this.Y = true;
                            this.Q.renderedFirstFrame(this.W);
                        }
                        return true;
                    }
                    if (j6 >= 30000) {
                        return false;
                    }
                    if (j6 > 11000) {
                        try {
                            java.lang.Thread.sleep((j6 - 10000) / 1000);
                        } catch (java.lang.InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                        }
                    }
                    s();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("releaseOutputBuffer");
                    mediaCodec.releaseOutputBuffer(i, true);
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    this.N.renderedOutputBufferCount++;
                    this.c0 = 0;
                    if (!this.Y) {
                        this.Y = true;
                        this.Q.renderedFirstFrame(this.W);
                    }
                    return true;
                }
            } else {
                if (java.lang.Math.abs((j9 - hVar.i) - (j10 - hVar.j)) > 20000000) {
                    hVar.h = false;
                }
            }
        }
        j4 = j10;
        j5 = j9;
        if (!hVar.h) {
        }
        hVar.e = j3;
        hVar.g = j4;
        gVar = hVar.f4128a;
        if (gVar != null) {
            long j132 = hVar.f4128a.f4127a;
            long j142 = hVar.c;
            j7 = (((j5 - j132) / j142) * j142) + j132;
            if (j5 > j7) {
            }
            if (j7 - j5 >= j5 - j8) {
            }
            j5 = j7 - hVar.d;
        }
        j6 = (j5 - nanoTime2) / 1000;
        if (j6 >= -30000) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(java.lang.String str, int i, int i2) {
        char c;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.getClass();
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 2:
            case 4:
                i3 = i2 * i;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i2 * i;
                break;
            case 3:
                if (!"BRAVIA 4K 2015".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.d)) {
                    i3 = ((i2 + 15) / 16) * ((i + 15) / 16) * 256;
                    i4 = 2;
                    break;
                }
                break;
        }
        return -1;
    }
}
