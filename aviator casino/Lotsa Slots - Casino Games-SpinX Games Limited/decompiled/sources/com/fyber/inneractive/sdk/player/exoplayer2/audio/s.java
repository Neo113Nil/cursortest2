package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class s implements com.fyber.inneractive.sdk.player.exoplayer2.audio.c {
    public int b;
    public int c;
    public int[] d;
    public boolean e;
    public int[] f;
    public java.nio.ByteBuffer g;
    public java.nio.ByteBuffer h;
    public boolean i;

    public s() {
        java.nio.ByteBuffer byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.g = byteBuffer;
        this.h = byteBuffer;
        this.b = -1;
        this.c = -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean a(int i, int i2, int i3) {
        boolean z = !java.util.Arrays.equals(this.d, this.f);
        int[] iArr = this.d;
        this.f = iArr;
        if (iArr == null) {
            this.e = false;
            return z;
        }
        if (i3 != 2) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.b(i, i2, i3);
        }
        if (!z && this.c == i && this.b == i2) {
            return false;
        }
        this.c = i;
        this.b = i2;
        this.e = i2 != iArr.length;
        int i4 = 0;
        while (true) {
            int[] iArr2 = this.f;
            if (i4 >= iArr2.length) {
                return true;
            }
            int i5 = iArr2[i4];
            if (i5 >= i2) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.audio.b(i, i2, i3);
            }
            this.e = (i5 != i4) | this.e;
            i4++;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void b() {
        this.i = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean c() {
        return this.i && this.h == com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final boolean d() {
        return this.e;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final int e() {
        int[] iArr = this.f;
        return iArr == null ? this.b : iArr.length;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void f() {
        java.nio.ByteBuffer byteBuffer = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.h = byteBuffer;
        this.i = false;
        this.g = byteBuffer;
        this.b = -1;
        this.c = -1;
        this.f = null;
        this.e = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void flush() {
        this.h = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        this.i = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final void a(java.nio.ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int length = ((limit - position) / (this.b * 2)) * this.f.length * 2;
        if (this.g.capacity() < length) {
            this.g = java.nio.ByteBuffer.allocateDirect(length).order(java.nio.ByteOrder.nativeOrder());
        } else {
            this.g.clear();
        }
        while (position < limit) {
            for (int i : this.f) {
                this.g.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.b * 2;
        }
        byteBuffer.position(limit);
        this.g.flip();
        this.h = this.g;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.c
    public final java.nio.ByteBuffer a() {
        java.nio.ByteBuffer byteBuffer = this.h;
        this.h = com.fyber.inneractive.sdk.player.exoplayer2.audio.c.f3903a;
        return byteBuffer;
    }
}
