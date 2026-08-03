package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class f implements com.fyber.inneractive.sdk.player.exoplayer2.upstream.h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ContentResolver f4088a;
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.m b;
    public android.net.Uri c;
    public android.content.res.AssetFileDescriptor d;
    public java.io.FileInputStream e;
    public long f;
    public boolean g;

    public f(android.content.Context context, com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar) {
        this.f4088a = context.getContentResolver();
        this.b = mVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar) {
        try {
            android.net.Uri uri = kVar.f4091a;
            this.c = uri;
            android.content.res.AssetFileDescriptor openAssetFileDescriptor = this.f4088a.openAssetFileDescriptor(uri, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            this.d = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new java.io.FileNotFoundException("Could not open file descriptor for: " + this.c);
            }
            this.e = new java.io.FileInputStream(this.d.getFileDescriptor());
            long startOffset = this.d.getStartOffset();
            if (this.e.skip(kVar.c + startOffset) - startOffset != kVar.c) {
                throw new java.io.EOFException();
            }
            long j = kVar.d;
            if (j != -1) {
                this.f = j;
            } else {
                long length = this.d.getLength();
                this.f = length;
                if (length == -1) {
                    long available = this.e.available();
                    this.f = available;
                    if (available == 0) {
                        this.f = -1L;
                    }
                }
            }
            this.g = true;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.b;
            if (mVar != null) {
                synchronized (mVar) {
                    if (mVar.b == 0) {
                        mVar.c = android.os.SystemClock.elapsedRealtime();
                    }
                    mVar.b++;
                }
            }
            return this.f;
        } catch (java.io.IOException e) {
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final void close() {
        this.c = null;
        try {
            try {
                java.io.FileInputStream fileInputStream = this.e;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.e = null;
                try {
                    try {
                        android.content.res.AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (java.io.IOException e) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(e);
                    }
                } finally {
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar = this.b;
                        if (mVar != null) {
                            mVar.a();
                        }
                    }
                }
            } catch (java.io.IOException e2) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(e2);
            }
        } catch (java.lang.Throwable th) {
            this.e = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar2 = this.b;
                        if (mVar2 != null) {
                            mVar2.a();
                        }
                    }
                    throw th;
                } catch (java.io.IOException e3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(e3);
                }
            } finally {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    com.fyber.inneractive.sdk.player.exoplayer2.upstream.m mVar3 = this.b;
                    if (mVar3 != null) {
                        mVar3.a();
                    }
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.h
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(e);
            }
        }
        int read = this.e.read(bArr, i, i2);
        if (read == -1) {
            if (this.f == -1) {
                return -1;
            }
            throw new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e(new java.io.EOFException());
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
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
