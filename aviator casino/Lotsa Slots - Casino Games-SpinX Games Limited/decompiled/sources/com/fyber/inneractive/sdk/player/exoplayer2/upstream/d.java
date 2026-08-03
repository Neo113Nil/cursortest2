package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class d implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetManager f4085a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m b;
    public android.net.Uri c;
    public java.io.InputStream d;
    public long e;
    public boolean f;

    public d(android.content.Context context, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar) {
        this.f4085a = context.getAssets();
        this.b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            android.net.Uri uri = kVar.f4091a;
            this.c = uri;
            java.lang.String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(com.google.firebase.sessions.settings.RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            java.io.InputStream open = this.f4085a.open(path, 1);
            this.d = open;
            if (open.skip(kVar.c) < kVar.c) {
                throw new java.io.EOFException();
            }
            long j = kVar.d;
            if (j != -1) {
                this.e = j;
            } else {
                long available = this.d.available();
                this.e = available;
                if (available == 2147483647L) {
                    this.e = -1L;
                }
            }
            this.f = true;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.b == 0) {
                        mVar.c = android.os.SystemClock.elapsedRealtime();
                    }
                    mVar.b++;
                }
            }
            return this.e;
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.c(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.c = null;
        try {
            try {
                java.io.InputStream inputStream = this.d;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (java.io.IOException e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.c(e);
            }
        } finally {
            this.d = null;
            if (this.f) {
                this.f = false;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.b;
                if (mVar != null) {
                    mVar.a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.c(e);
            }
        }
        int read = this.d.read(bArr, i, i2);
        if (read == -1) {
            if (this.e == -1) {
                return -1;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.c(new java.io.EOFException());
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.b;
        if (mVar != null) {
            synchronized (mVar) {
                mVar.d += read;
            }
        }
        return read;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        return this.c;
    }
}
