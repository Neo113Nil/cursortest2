package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class k implements java.io.Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.InputStream f3873a;
    public final java.nio.charset.Charset b;
    public byte[] c;
    public int d;
    public int e;

    public k(java.io.FileInputStream fileInputStream) {
        java.nio.charset.Charset charset = com.fyber.inneractive.sdk.player.cache.l.f3874a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new java.lang.IllegalArgumentException("Unsupported encoding");
        }
        this.f3873a = fileInputStream;
        this.b = charset;
        this.c = new byte[8192];
    }

    public final java.lang.String a() {
        int i;
        synchronized (this.f3873a) {
            byte[] bArr = this.c;
            if (bArr == null) {
                throw new java.io.IOException("LineReader is closed");
            }
            if (this.d >= this.e) {
                int read = this.f3873a.read(bArr, 0, bArr.length);
                if (read == -1) {
                    throw new java.io.EOFException();
                }
                this.d = 0;
                this.e = read;
            }
            for (int i2 = this.d; i2 != this.e; i2++) {
                byte[] bArr2 = this.c;
                if (bArr2[i2] == 10) {
                    int i3 = this.d;
                    if (i2 != i3) {
                        i = i2 - 1;
                        if (bArr2[i] == 13) {
                            java.lang.String str = new java.lang.String(bArr2, i3, i - i3, this.b.name());
                            this.d = i2 + 1;
                            return str;
                        }
                    }
                    i = i2;
                    java.lang.String str2 = new java.lang.String(bArr2, i3, i - i3, this.b.name());
                    this.d = i2 + 1;
                    return str2;
                }
            }
            com.fyber.inneractive.sdk.player.cache.j jVar = new com.fyber.inneractive.sdk.player.cache.j(this, (this.e - this.d) + 80);
            while (true) {
                byte[] bArr3 = this.c;
                int i4 = this.d;
                jVar.write(bArr3, i4, this.e - i4);
                this.e = -1;
                java.io.InputStream inputStream = this.f3873a;
                byte[] bArr4 = this.c;
                int read2 = inputStream.read(bArr4, 0, bArr4.length);
                if (read2 == -1) {
                    throw new java.io.EOFException();
                }
                this.d = 0;
                this.e = read2;
                for (int i5 = 0; i5 != this.e; i5++) {
                    byte[] bArr5 = this.c;
                    if (bArr5[i5] == 10) {
                        int i6 = this.d;
                        if (i5 != i6) {
                            jVar.write(bArr5, i6, i5 - i6);
                        }
                        this.d = i5 + 1;
                        return jVar.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f3873a) {
            if (this.c != null) {
                this.c = null;
                this.f3873a.close();
            }
        }
    }
}
