package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class r {
    public long A;
    public boolean B;
    public long C;
    public java.lang.reflect.Method D;
    public int E;
    public long F;
    public long G;
    public int H;
    public long I;
    public long J;
    public int K;
    public int L;
    public long M;
    public long N;
    public long O;
    public float P;
    public com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] Q;
    public java.nio.ByteBuffer[] R;
    public java.nio.ByteBuffer S;
    public java.nio.ByteBuffer T;
    public byte[] U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.s f3913a;
    public boolean a0;
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.x b;
    public boolean b0;
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] c;
    public long c0;
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.o d;
    public final android.os.ConditionVariable e = new android.os.ConditionVariable(true);
    public final long[] f;
    public final com.fyber.inneractive.sdk.player.exoplayer2.audio.k g;
    public final java.util.LinkedList h;
    public android.media.AudioTrack i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public com.fyber.inneractive.sdk.player.exoplayer2.s r;
    public com.fyber.inneractive.sdk.player.exoplayer2.s s;
    public long t;
    public long u;
    public java.nio.ByteBuffer v;
    public int w;
    public int x;
    public int y;
    public long z;

    public r(com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] cVarArr, com.fyber.inneractive.sdk.player.exoplayer2.audio.u uVar) {
        this.d = uVar;
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 18) {
            try {
                this.D = android.media.AudioTrack.class.getMethod("getLatency", null);
            } catch (java.lang.NoSuchMethodException unused) {
            }
        }
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 19) {
            this.g = new com.fyber.inneractive.sdk.player.exoplayer2.audio.l();
        } else {
            this.g = new com.fyber.inneractive.sdk.player.exoplayer2.audio.k();
        }
        com.fyber.inneractive.sdk.player.exoplayer2.audio.s sVar = new com.fyber.inneractive.sdk.player.exoplayer2.audio.s();
        this.f3913a = sVar;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.x xVar = new com.fyber.inneractive.sdk.player.exoplayer2.audio.x();
        this.b = xVar;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] cVarArr2 = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c[cVarArr.length + 3];
        this.c = cVarArr2;
        cVarArr2[0] = new com.fyber.inneractive.sdk.player.exoplayer2.audio.v();
        cVarArr2[1] = sVar;
        java.lang.System.arraycopy(cVarArr, 0, cVarArr2, 2, cVarArr.length);
        cVarArr2[cVarArr.length + 2] = xVar;
        this.f = new long[10];
        this.P = 1.0f;
        this.L = 0;
        this.n = 3;
        this.Z = 0;
        this.s = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
        this.W = -1;
        this.Q = new com.fyber.inneractive.sdk.player.exoplayer2.audio.c[0];
        this.R = new java.nio.ByteBuffer[0];
        this.h = new java.util.LinkedList();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, int i2, int i3, int[] iArr) {
        int i4;
        int i5;
        int minBufferSize;
        int i6 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        if (i3 == Integer.MIN_VALUE) {
            i4 = i * 3;
        } else if (i3 == 1073741824) {
            i4 = i * 4;
        } else if (i3 == 2) {
            i4 = i * 2;
        } else {
            if (i3 != 3) {
                throw new java.lang.IllegalArgumentException();
            }
            i4 = i;
        }
        this.E = i4;
        this.f3913a.d = iArr;
        boolean z = false;
        for (com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar : this.c) {
            try {
                z |= cVar.a(i2, i, i3);
                if (cVar.d()) {
                    i = cVar.e();
                    i3 = 2;
                }
            } catch (com.fyber.inneractive.sdk.player.exoplayer2.audio.b e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.m(e);
            }
        }
        if (z) {
            h();
        }
        int i7 = 252;
        switch (i) {
            case 1:
                i5 = 4;
                break;
            case 2:
                i5 = 12;
                break;
            case 3:
                i5 = 28;
                break;
            case 4:
                i5 = 204;
                break;
            case 5:
                i5 = com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE;
                break;
            case 6:
                i5 = 252;
                break;
            case 7:
                i5 = 1276;
                break;
            case 8:
                i5 = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
                break;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.m(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unsupported channel count: ", i));
        }
        int i8 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        if (i8 <= 23 && "foster".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.b) && "NVIDIA".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.c)) {
            if (i != 3 && i != 5) {
                if (i == 7) {
                    i7 = com.fyber.inneractive.sdk.player.exoplayer2.b.f3917a;
                }
            }
            if (i8 <= 25) {
                "fugu".equals(com.fyber.inneractive.sdk.player.exoplayer2.util.z.b);
            }
            if (z && d() && this.l == i3 && this.j == i2 && this.k == i7) {
                return;
            }
            g();
            this.l = i3;
            this.o = false;
            this.j = i2;
            this.k = i7;
            this.m = 2;
            this.H = i * 2;
            minBufferSize = android.media.AudioTrack.getMinBufferSize(i2, i7, 2);
            if (minBufferSize != -2) {
                throw new java.lang.IllegalStateException();
            }
            int i9 = minBufferSize * 4;
            long j = this.j;
            int i10 = this.H;
            int i11 = ((int) ((250000 * j) / 1000000)) * i10;
            int max = (int) java.lang.Math.max(minBufferSize, ((j * 750000) / 1000000) * i10);
            if (i9 < i11) {
                i9 = i11;
            } else if (i9 > max) {
                i9 = max;
            }
            this.p = i9;
            this.q = ((i9 / this.H) * 1000000) / this.j;
            a(this.s);
            return;
        }
        i7 = i5;
        if (i8 <= 25) {
        }
        if (z) {
        }
        g();
        this.l = i3;
        this.o = false;
        this.j = i2;
        this.k = i7;
        this.m = 2;
        this.H = i * 2;
        minBufferSize = android.media.AudioTrack.getMinBufferSize(i2, i7, 2);
        if (minBufferSize != -2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ce, code lost:
    
        if (r10 < r9) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(java.nio.ByteBuffer byteBuffer, long j) {
        if (byteBuffer.hasRemaining()) {
            java.nio.ByteBuffer byteBuffer2 = this.T;
            int i = 0;
            if (byteBuffer2 == null) {
                this.T = byteBuffer;
                if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.U;
                    if (bArr == null || bArr.length < remaining) {
                        this.U = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.U, 0, remaining);
                    byteBuffer.position(position);
                    this.V = 0;
                }
            } else if (byteBuffer2 != byteBuffer) {
                throw new java.lang.IllegalArgumentException();
            }
            int remaining2 = byteBuffer.remaining();
            if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 21) {
                int a2 = this.p - ((int) (this.I - (this.g.a() * this.H)));
                if (a2 > 0) {
                    i = this.i.write(this.U, this.V, java.lang.Math.min(remaining2, a2));
                    if (i > 0) {
                        this.V += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                }
            } else if (!this.a0) {
                i = this.i.write(byteBuffer, remaining2, 1);
            } else {
                if (j == -9223372036854775807L) {
                    throw new java.lang.IllegalStateException();
                }
                android.media.AudioTrack audioTrack = this.i;
                if (this.v == null) {
                    java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(16);
                    this.v = allocate;
                    allocate.order(java.nio.ByteOrder.BIG_ENDIAN);
                    this.v.putInt(1431633921);
                }
                if (this.w == 0) {
                    this.v.putInt(4, remaining2);
                    this.v.putLong(8, j * 1000);
                    this.v.position(0);
                    this.w = remaining2;
                }
                int remaining3 = this.v.remaining();
                if (remaining3 > 0) {
                    int write = audioTrack.write(this.v, remaining3, 1);
                    if (write < 0) {
                        this.w = 0;
                        i = write;
                    }
                }
                int write2 = audioTrack.write(byteBuffer, remaining2, 1);
                if (write2 < 0) {
                    this.w = 0;
                } else {
                    this.w -= write2;
                }
                i = write2;
            }
            this.c0 = android.os.SystemClock.elapsedRealtime();
            if (i < 0) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.q(i);
            }
            boolean z = this.o;
            if (!z) {
                this.I += i;
            }
            if (i == remaining2) {
                if (z) {
                    this.J += this.K;
                }
                this.T = null;
            }
        }
    }

    public final boolean c() {
        return d() && (b() > this.g.a() || (e() && this.i.getPlayState() == 2 && this.i.getPlaybackHeadPosition() == 0));
    }

    public final boolean d() {
        return this.i != null;
    }

    public final boolean e() {
        int i;
        return com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a < 23 && ((i = this.m) == 5 || i == 6);
    }

    public final void f() {
        this.Y = true;
        if (d()) {
            this.N = java.lang.System.nanoTime() / 1000;
            this.i.play();
        }
    }

    public final void g() {
        if (d()) {
            this.F = 0L;
            this.G = 0L;
            this.I = 0L;
            this.J = 0L;
            this.K = 0;
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.r;
            if (sVar != null) {
                this.s = sVar;
                this.r = null;
            } else if (!this.h.isEmpty()) {
                this.s = ((com.fyber.inneractive.sdk.player.exoplayer2.audio.p) this.h.getLast()).f3912a;
            }
            this.h.clear();
            this.t = 0L;
            this.u = 0L;
            this.S = null;
            this.T = null;
            int i = 0;
            while (true) {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] cVarArr = this.Q;
                if (i >= cVarArr.length) {
                    break;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar = cVarArr[i];
                cVar.flush();
                this.R[i] = cVar.a();
                i++;
            }
            this.X = false;
            this.W = -1;
            this.v = null;
            this.w = 0;
            this.L = 0;
            this.O = 0L;
            this.z = 0L;
            this.y = 0;
            this.x = 0;
            this.A = 0L;
            this.B = false;
            this.C = 0L;
            if (this.i.getPlayState() == 3) {
                this.i.pause();
            }
            android.media.AudioTrack audioTrack = this.i;
            this.i = null;
            this.g.a(null, false);
            this.e.close();
            new com.fyber.inneractive.sdk.player.exoplayer2.audio.j(this, audioTrack).start();
        }
    }

    public final void h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar : this.c) {
            if (cVar.d()) {
                arrayList.add(cVar);
            } else {
                cVar.flush();
            }
        }
        int size = arrayList.size();
        this.Q = (com.fyber.inneractive.sdk.player.exoplayer2.audio.c[]) arrayList.toArray(new com.fyber.inneractive.sdk.player.exoplayer2.audio.c[size]);
        this.R = new java.nio.ByteBuffer[size];
        for (int i = 0; i < size; i++) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar2 = this.Q[i];
            cVar2.flush();
            this.R[i] = cVar2.a();
        }
    }

    public final void i() {
        if (d()) {
            if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 21) {
                this.i.setVolume(this.P);
                return;
            }
            android.media.AudioTrack audioTrack = this.i;
            float f = this.P;
            audioTrack.setStereoVolume(f, f);
        }
    }

    public final long b() {
        return this.o ? this.J : this.I / this.H;
    }

    public final boolean a(java.nio.ByteBuffer byteBuffer, long j) {
        int i;
        int i2;
        java.nio.ByteBuffer byteBuffer2 = this.S;
        if (byteBuffer2 != null && byteBuffer != byteBuffer2) {
            throw new java.lang.IllegalArgumentException();
        }
        if (!d()) {
            this.e.block();
            if (this.a0) {
                this.i = new android.media.AudioTrack(new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(16).build(), new android.media.AudioFormat.Builder().setChannelMask(this.k).setEncoding(this.m).setSampleRate(this.j).build(), this.p, 1, this.Z);
            } else if (this.Z == 0) {
                this.i = new android.media.AudioTrack(this.n, this.j, this.k, this.m, this.p, 1);
            } else {
                this.i = new android.media.AudioTrack(this.n, this.j, this.k, this.m, this.p, 1, this.Z);
            }
            int state = this.i.getState();
            if (state == 1) {
                int audioSessionId = this.i.getAudioSessionId();
                if (this.Z != audioSessionId) {
                    this.Z = audioSessionId;
                    com.fyber.inneractive.sdk.player.exoplayer2.audio.u uVar = (com.fyber.inneractive.sdk.player.exoplayer2.audio.u) this.d;
                    uVar.f3915a.P.audioSessionId(audioSessionId);
                    uVar.f3915a.getClass();
                }
                this.g.a(this.i, e());
                i();
                this.b0 = false;
                if (this.Y) {
                    f();
                }
            } else {
                try {
                    this.i.release();
                } catch (java.lang.Exception unused) {
                } catch (java.lang.Throwable th) {
                    this.i = null;
                    throw th;
                }
                this.i = null;
                throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.n(state, this.j, this.k, this.p);
            }
        }
        if (e()) {
            if (this.i.getPlayState() == 2) {
                this.b0 = false;
                return false;
            }
            if (this.i.getPlayState() == 1 && this.g.a() != 0) {
                return false;
            }
        }
        boolean z = this.b0;
        boolean c = c();
        this.b0 = c;
        if (z && !c && this.i.getPlayState() != 1) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - this.c0;
            com.fyber.inneractive.sdk.player.exoplayer2.audio.u uVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.audio.u) this.d;
            uVar2.f3915a.P.audioTrackUnderrun(this.p, com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.q), elapsedRealtime);
            uVar2.f3915a.getClass();
        }
        if (this.S == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (this.o && this.K == 0) {
                int i3 = this.m;
                if (i3 == 7 || i3 == 8) {
                    int position = byteBuffer.position();
                    i2 = ((((byteBuffer.get(position + 5) & 252) >> 2) | ((byteBuffer.get(position + 4) & 1) << 6)) + 1) * 32;
                } else if (i3 == 5) {
                    i2 = 1536;
                } else if (i3 == 6) {
                    i2 = (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? com.fyber.inneractive.sdk.player.exoplayer2.audio.a.f3902a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
                } else {
                    throw new java.lang.IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Unexpected audio encoding: ", i3));
                }
                this.K = i2;
            }
            if (this.r != null) {
                if (!a()) {
                    return false;
                }
                this.h.add(new com.fyber.inneractive.sdk.player.exoplayer2.audio.p(this.r, java.lang.Math.max(0L, j), (b() * 1000000) / this.j));
                this.r = null;
                h();
            }
            int i4 = this.L;
            if (i4 == 0) {
                this.M = java.lang.Math.max(0L, j);
                this.L = 1;
            } else {
                long j2 = (((this.o ? this.G : this.F / this.E) * 1000000) / this.j) + this.M;
                if (i4 != 1 || java.lang.Math.abs(j2 - j) <= 200000) {
                    i = 2;
                } else {
                    android.util.Log.e("AudioTrack", "Discontinuity detected [expected " + j2 + ", got " + j + com.ironsource.X3.j.e);
                    i = 2;
                    this.L = 2;
                }
                if (this.L == i) {
                    this.M = (j - j2) + this.M;
                    this.L = 1;
                    com.fyber.inneractive.sdk.player.exoplayer2.audio.u uVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.audio.u) this.d;
                    uVar3.f3915a.getClass();
                    uVar3.f3915a.V = true;
                }
            }
            if (this.o) {
                this.G += this.K;
            } else {
                this.F += byteBuffer.remaining();
            }
            this.S = byteBuffer;
        }
        if (this.o) {
            b(this.S, j);
        } else {
            a(j);
        }
        if (this.S.hasRemaining()) {
            return false;
        }
        this.S = null;
        return true;
    }

    public final void a(long j) {
        java.nio.ByteBuffer byteBuffer;
        int length = this.Q.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.R[i - 1];
            } else {
                byteBuffer = this.S;
                if (byteBuffer == null) {
                    byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
                }
            }
            if (i == length) {
                b(byteBuffer, j);
            } else {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar = this.Q[i];
                cVar.a(byteBuffer);
                java.nio.ByteBuffer a2 = cVar.a();
                this.R[i] = a2;
                if (a2.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0032 -> B:7:0x0012). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        boolean z;
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.c[] cVarArr;
        if (this.W == -1) {
            this.W = this.o ? this.Q.length : 0;
            z = true;
            i = this.W;
            cVarArr = this.Q;
            if (i < cVarArr.length) {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.c cVar = cVarArr[i];
                if (z) {
                    cVar.b();
                }
                a(-9223372036854775807L);
                if (!cVar.c()) {
                    return false;
                }
                this.W++;
                z = true;
                i = this.W;
                cVarArr = this.Q;
                if (i < cVarArr.length) {
                    java.nio.ByteBuffer byteBuffer = this.T;
                    if (byteBuffer != null) {
                        b(byteBuffer, -9223372036854775807L);
                        if (this.T != null) {
                            return false;
                        }
                    }
                    this.W = -1;
                    return true;
                }
            }
        } else {
            z = false;
            i = this.W;
            cVarArr = this.Q;
            if (i < cVarArr.length) {
            }
        }
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.o) {
            com.fyber.inneractive.sdk.player.exoplayer2.s sVar2 = com.fyber.inneractive.sdk.player.exoplayer2.s.d;
            this.s = sVar2;
            return sVar2;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.audio.x xVar = this.b;
        float f = sVar.f4046a;
        xVar.getClass();
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        float max = java.lang.Math.max(0.1f, java.lang.Math.min(f, 8.0f));
        xVar.e = max;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.x xVar2 = this.b;
        float f2 = sVar.b;
        xVar2.getClass();
        xVar2.f = java.lang.Math.max(0.1f, java.lang.Math.min(f2, 8.0f));
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar3 = new com.fyber.inneractive.sdk.player.exoplayer2.s(max, f2);
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar4 = this.r;
        if (sVar4 == null) {
            if (!this.h.isEmpty()) {
                sVar4 = ((com.fyber.inneractive.sdk.player.exoplayer2.audio.p) this.h.getLast()).f3912a;
            } else {
                sVar4 = this.s;
            }
        }
        if (!sVar3.equals(sVar4)) {
            if (d()) {
                this.r = sVar3;
            } else {
                this.s = sVar3;
            }
        }
        return this.s;
    }

    public final long a(boolean z) {
        long j;
        long j2;
        if (!d() || this.L == 0) {
            return Long.MIN_VALUE;
        }
        if (this.i.getPlayState() == 3) {
            long a2 = (this.g.a() * 1000000) / r1.c;
            if (a2 != 0) {
                long nanoTime = java.lang.System.nanoTime() / 1000;
                if (nanoTime - this.A >= 30000) {
                    long[] jArr = this.f;
                    int i = this.x;
                    jArr[i] = a2 - nanoTime;
                    this.x = (i + 1) % 10;
                    int i2 = this.y;
                    if (i2 < 10) {
                        this.y = i2 + 1;
                    }
                    this.A = nanoTime;
                    this.z = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = this.y;
                        if (i3 >= i4) {
                            break;
                        }
                        this.z = (this.f[i3] / i4) + this.z;
                        i3++;
                    }
                }
                if (!e() && nanoTime - this.C >= 500000) {
                    boolean e = this.g.e();
                    this.B = e;
                    if (e) {
                        long c = this.g.c() / 1000;
                        long b = this.g.b();
                        if (c < this.N) {
                            this.B = false;
                        } else if (java.lang.Math.abs(c - nanoTime) > 5000000) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(b);
                            sb.append(", ");
                            sb.append(c);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(a2);
                            sb.append(", ");
                            sb.append(this.o ? this.G : this.F / this.E);
                            sb.append(", ");
                            sb.append(b());
                            android.util.Log.w("AudioTrack", sb.toString());
                            this.B = false;
                        } else if (java.lang.Math.abs(((b * 1000000) / this.j) - a2) > 5000000) {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(b);
                            sb2.append(", ");
                            sb2.append(c);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(a2);
                            sb2.append(", ");
                            sb2.append(this.o ? this.G : this.F / this.E);
                            sb2.append(", ");
                            sb2.append(b());
                            android.util.Log.w("AudioTrack", sb2.toString());
                            this.B = false;
                        }
                    }
                    if (this.D != null && !this.o) {
                        try {
                            long intValue = (((java.lang.Integer) r1.invoke(this.i, null)).intValue() * 1000) - this.q;
                            this.O = intValue;
                            long max = java.lang.Math.max(intValue, 0L);
                            this.O = max;
                            if (max > 5000000) {
                                android.util.Log.w("AudioTrack", "Ignoring impossibly large audio latency: " + this.O);
                                this.O = 0L;
                            }
                        } catch (java.lang.Exception unused) {
                            this.D = null;
                        }
                    }
                    this.C = nanoTime;
                }
            }
        }
        long nanoTime2 = java.lang.System.nanoTime() / 1000;
        if (this.B) {
            j = ((this.g.b() + (((nanoTime2 - (this.g.c() / 1000)) * this.j) / 1000000)) * 1000000) / this.j;
        } else {
            if (this.y == 0) {
                j = (this.g.a() * 1000000) / r1.c;
            } else {
                j = nanoTime2 + this.z;
            }
            if (!z) {
                j -= this.O;
            }
        }
        long j3 = this.M;
        while (!this.h.isEmpty() && j >= ((com.fyber.inneractive.sdk.player.exoplayer2.audio.p) this.h.getFirst()).c) {
            com.fyber.inneractive.sdk.player.exoplayer2.audio.p pVar = (com.fyber.inneractive.sdk.player.exoplayer2.audio.p) this.h.remove();
            this.s = pVar.f3912a;
            this.u = pVar.c;
            this.t = pVar.b - this.M;
        }
        if (this.s.f4046a == 1.0f) {
            j2 = (j + this.t) - this.u;
        } else {
            if (this.h.isEmpty()) {
                com.fyber.inneractive.sdk.player.exoplayer2.audio.x xVar = this.b;
                long j4 = xVar.k;
                if (j4 >= 1024) {
                    j2 = this.t + com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(j - this.u, xVar.j, j4);
                }
            }
            j2 = ((long) (this.s.f4046a * (j - this.u))) + this.t;
        }
        return j3 + j2;
    }
}
