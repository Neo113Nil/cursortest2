package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class h implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public android.net.Uri f3871a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        new java.util.concurrent.CountDownLatch(1);
        new java.util.concurrent.atomic.AtomicReference();
        this.f3871a = kVar.f4091a;
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        return this.f3871a;
    }
}
