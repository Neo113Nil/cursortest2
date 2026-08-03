package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class s implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m f4098a;
    public java.io.RandomAccessFile b;
    public android.net.Uri c;
    public long d;
    public boolean e;

    public s(com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar) {
        this.f4098a = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            this.c = kVar.f4091a;
            java.io.RandomAccessFile randomAccessFile = new java.io.RandomAccessFile(kVar.f4091a.getPath(), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.b = randomAccessFile;
            randomAccessFile.seek(kVar.c);
            long j = kVar.d;
            if (j == -1) {
                j = this.b.length() - kVar.c;
            }
            this.d = j;
            if (j < 0) {
                throw new java.io.EOFException();
            }
            this.e = true;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.f4098a;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.b == 0) {
                        mVar.c = android.os.SystemClock.elapsedRealtime();
                    }
                    mVar.b++;
                }
            }
            return this.d;
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.c = null;
        try {
            try {
                java.io.RandomAccessFile randomAccessFile = this.b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (java.io.IOException e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r(e);
            }
        } finally {
            this.b = null;
            if (this.e) {
                this.e = false;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.f4098a;
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
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.b.read(bArr, i, (int) java.lang.Math.min(j, i2));
            if (read > 0) {
                long j2 = read;
                this.d -= j2;
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.f4098a;
                if (mVar != null) {
                    synchronized (mVar) {
                        mVar.d += j2;
                    }
                }
            }
            return read;
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final android.net.Uri a() {
        return this.c;
    }
}
