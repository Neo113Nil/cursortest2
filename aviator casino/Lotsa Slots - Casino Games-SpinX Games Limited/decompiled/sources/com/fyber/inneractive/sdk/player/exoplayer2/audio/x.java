package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class x implements com.fyber.inneractive.sdk.player.exoplayer2.audio.c {
    public com.fyber.inneractive.sdk.player.exoplayer2.audio.w d;
    public java.nio.ByteBuffer g;
    public java.nio.ShortBuffer h;
    public java.nio.ByteBuffer i;
    public long j;
    public long k;
    public boolean l;
    public float e = 1.0f;
    public float f = 1.0f;
    public int b = -1;
    public int c = -1;

    public x() {
        java.nio.ByteBuffer byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i, int i2, int i3) {
        if (i3 != 2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.b(i, i2, i3);
        }
        if (this.c == i && this.b == i2) {
            return false;
        }
        this.c = i;
        this.b = i2;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        int i;
        com.fyber.inneractive.sdk.player.exoplayer2.audio.w wVar = this.d;
        int i2 = wVar.q;
        float f = wVar.o;
        float f2 = wVar.p;
        int i3 = wVar.r + ((int) ((((i2 / (f / f2)) + wVar.s) / f2) + 0.5f));
        wVar.a((wVar.e * 2) + i2);
        int i4 = 0;
        while (true) {
            i = wVar.e * 2;
            int i5 = wVar.b;
            if (i4 >= i * i5) {
                break;
            }
            wVar.h[(i5 * i2) + i4] = 0;
            i4++;
        }
        wVar.q = i + wVar.q;
        wVar.a();
        if (wVar.r > i3) {
            wVar.r = i3;
        }
        wVar.q = 0;
        wVar.t = 0;
        wVar.s = 0;
        this.l = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.w wVar;
        return this.l && ((wVar = this.d) == null || wVar.r == 0);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return java.lang.Math.abs(this.e - 1.0f) >= 0.01f || java.lang.Math.abs(this.f - 1.0f) >= 0.01f;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        return this.b;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        this.d = null;
        java.nio.ByteBuffer byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.g = byteBuffer;
        this.h = byteBuffer.asShortBuffer();
        this.i = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        com.fyber.inneractive.sdk.player.exoplayer2.audio.w wVar = new com.fyber.inneractive.sdk.player.exoplayer2.audio.w(this.c, this.b);
        this.d = wVar;
        wVar.o = this.e;
        wVar.p = this.f;
        this.i = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.j = 0L;
        this.k = 0L;
        this.l = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            java.nio.ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.j += remaining;
            com.fyber.inneractive.sdk.player.exoplayer2.audio.w wVar = this.d;
            wVar.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i = wVar.b;
            int i2 = remaining2 / i;
            wVar.a(i2);
            asShortBuffer.get(wVar.h, wVar.q * wVar.b, ((i * i2) * 2) / 2);
            wVar.q += i2;
            wVar.a();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i3 = this.d.r * this.b * 2;
        if (i3 > 0) {
            if (this.g.capacity() < i3) {
                java.nio.ByteBuffer order = java.nio.ByteBuffer.allocateDirect(i3).order(java.nio.ByteOrder.nativeOrder());
                this.g = order;
                this.h = order.asShortBuffer();
            } else {
                this.g.clear();
                this.h.clear();
            }
            com.fyber.inneractive.sdk.player.exoplayer2.audio.w wVar2 = this.d;
            java.nio.ShortBuffer shortBuffer = this.h;
            wVar2.getClass();
            int min = java.lang.Math.min(shortBuffer.remaining() / wVar2.b, wVar2.r);
            shortBuffer.put(wVar2.j, 0, wVar2.b * min);
            int i4 = wVar2.r - min;
            wVar2.r = i4;
            short[] sArr = wVar2.j;
            int i5 = wVar2.b;
            java.lang.System.arraycopy(sArr, min * i5, sArr, 0, i4 * i5);
            this.k += i3;
            this.g.limit(i3);
            this.i = this.g;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final java.nio.ByteBuffer a() {
        java.nio.ByteBuffer byteBuffer = this.i;
        this.i = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        return byteBuffer;
    }
}
