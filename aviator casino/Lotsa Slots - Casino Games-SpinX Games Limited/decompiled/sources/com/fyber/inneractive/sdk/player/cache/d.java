package com.fyber.inneractive.sdk.player.cache;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.cache.e f3868a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.cache.g d;

    public d(com.fyber.inneractive.sdk.player.cache.g gVar, com.fyber.inneractive.sdk.player.cache.e eVar) {
        this.d = gVar;
        this.f3868a = eVar;
        this.b = eVar.c ? null : new boolean[gVar.g];
    }

    public final void a(byte[] bArr) {
        java.io.OutputStream outputStream;
        java.io.FileOutputStream fileOutputStream;
        com.fyber.inneractive.sdk.player.cache.g gVar = this.d;
        if (gVar.g <= 0) {
            throw new java.lang.IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + this.d.g);
        }
        synchronized (gVar) {
            com.fyber.inneractive.sdk.player.cache.e eVar = this.f3868a;
            if (eVar.d != this) {
                throw new java.lang.IllegalStateException();
            }
            if (!eVar.c) {
                this.b[0] = true;
            }
            java.io.File b = eVar.b(0);
            try {
                fileOutputStream = new java.io.FileOutputStream(b);
            } catch (java.io.FileNotFoundException unused) {
                this.d.f3870a.mkdirs();
                try {
                    fileOutputStream = new java.io.FileOutputStream(b);
                } catch (java.io.FileNotFoundException unused2) {
                    outputStream = com.fyber.inneractive.sdk.player.cache.g.q;
                }
            }
            outputStream = new com.fyber.inneractive.sdk.player.cache.c(this, fileOutputStream);
        }
        try {
            outputStream.write(bArr);
            java.nio.charset.Charset charset = com.fyber.inneractive.sdk.player.cache.l.f3874a;
            try {
                outputStream.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused3) {
            }
        } catch (java.lang.Throwable th) {
            java.nio.charset.Charset charset2 = com.fyber.inneractive.sdk.player.cache.l.f3874a;
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (java.lang.RuntimeException e2) {
                    throw e2;
                } catch (java.lang.Exception unused4) {
                }
            }
            throw th;
        }
    }

    public final void a() {
        if (this.c) {
            com.fyber.inneractive.sdk.player.cache.g.a(this.d, this, false);
            this.d.c(this.f3868a.f3869a);
        } else {
            com.fyber.inneractive.sdk.player.cache.g.a(this.d, this, true);
        }
    }
}
