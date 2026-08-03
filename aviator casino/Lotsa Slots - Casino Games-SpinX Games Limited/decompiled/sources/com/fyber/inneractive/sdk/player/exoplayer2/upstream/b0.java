package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ExecutorService f4074a;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.y b;
    public java.io.IOException c;

    public b0(java.lang.String str) {
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        this.f4074a = java.util.concurrent.Executors.newSingleThreadExecutor(new com.fyber.inneractive.sdk.player.exoplayer2.util.y(str));
    }

    public final boolean a() {
        return this.b != null;
    }

    public final void b() {
        java.io.IOException iOException = this.c;
        if (iOException != null) {
            throw iOException;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = this.b;
        if (yVar != null) {
            int i = yVar.c;
            java.io.IOException iOException2 = yVar.e;
            if (iOException2 != null && yVar.f > i) {
                throw iOException2;
            }
        }
    }

    public final void a(com.fyber.inneractive.sdk.player.exoplayer2.source.k kVar) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.y yVar = this.b;
        if (yVar != null) {
            yVar.a(true);
        }
        if (kVar != null) {
            this.f4074a.execute(kVar);
        }
        this.f4074a.shutdown();
    }
}
