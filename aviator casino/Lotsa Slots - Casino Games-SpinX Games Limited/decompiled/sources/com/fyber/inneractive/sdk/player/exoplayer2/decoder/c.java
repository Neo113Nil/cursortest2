package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f3921a;
    public java.nio.ByteBuffer c;
    public long d;
    public final com.fyber.inneractive.sdk.player.exoplayer2.decoder.b b = new com.fyber.inneractive.sdk.player.exoplayer2.decoder.b();
    public final int e = 0;

    public final void a() {
        this.f3921a = 0;
        java.nio.ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final boolean b(int i) {
        return (this.f3921a & i) == i;
    }

    public final java.nio.ByteBuffer a(int i) {
        int i2 = this.e;
        if (i2 == 1) {
            return java.nio.ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return java.nio.ByteBuffer.allocateDirect(i);
        }
        java.nio.ByteBuffer byteBuffer = this.c;
        throw new java.lang.IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }
}
