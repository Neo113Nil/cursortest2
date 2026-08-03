package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class n implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f4094a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.s b;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.d c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.f d;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.h e;

    public n(android.content.Context context, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar) {
        hVar.getClass();
        this.f4094a = hVar;
        this.b = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.s(mVar);
        this.c = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.d(context, mVar);
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.f(context, mVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        if (this.e != null) {
            throw new java.lang.IllegalStateException();
        }
        java.lang.String scheme = kVar.f4091a.getScheme();
        android.net.Uri uri = kVar.f4091a;
        int i = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
        java.lang.String scheme2 = uri.getScheme();
        if (android.text.TextUtils.isEmpty(scheme2) || scheme2.equals("file")) {
            if (kVar.f4091a.getPath().startsWith("/android_asset/")) {
                this.e = this.c;
            } else {
                this.e = this.b;
            }
        } else if ("asset".equals(scheme)) {
            this.e = this.c;
        } else if ("content".equals(scheme)) {
            this.e = this.d;
        } else {
            this.e = this.f4094a;
        }
        return this.e.a(kVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.e;
        if (hVar != null) {
            try {
                hVar.close();
            } finally {
                this.e = null;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        return this.e.read(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar = this.e;
        if (hVar == null) {
            return null;
        }
        return hVar.a();
    }
}
