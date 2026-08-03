package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l f4075a;
    public final long b = 10485760;
    public final int c = 20480;
    public com.fyber.inneractive.sdk.player.exoplayer2.upstream.k d;
    public java.io.File e;
    public java.io.OutputStream f;
    public java.io.FileOutputStream g;
    public long h;
    public long i;
    public com.fyber.inneractive.sdk.player.exoplayer2.util.p j;

    public c(com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar) {
        this.f4075a = lVar;
    }

    public final void a() {
        java.io.OutputStream outputStream = this.f;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            this.g.getFD().sync();
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f);
            this.f = null;
            java.io.File file = this.e;
            this.e = null;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar = this.f4075a;
            synchronized (lVar) {
                com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a2 = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m.a(file, lVar.d);
                if (a2 == null) {
                    throw new java.lang.IllegalStateException();
                }
                if (!lVar.c.containsKey(a2.f4079a)) {
                    throw new java.lang.IllegalStateException();
                }
                if (file.exists()) {
                    if (file.length() == 0) {
                        file.delete();
                        return;
                    }
                    long a3 = lVar.a(a2.f4079a);
                    if (a3 != -1 && a2.b + a2.c > a3) {
                        throw new java.lang.IllegalStateException();
                    }
                    lVar.a(a2);
                    lVar.d.b();
                    lVar.notifyAll();
                }
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.z.a(this.f);
            this.f = null;
            java.io.File file2 = this.e;
            this.e = null;
            file2.delete();
            throw th;
        }
    }

    public final void b() {
        java.io.File file;
        long j = this.d.d;
        long min = j == -1 ? this.b : java.lang.Math.min(j - this.i, this.b);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.l lVar = this.f4075a;
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar = this.d;
        java.lang.String str = kVar.e;
        long j2 = kVar.b + this.i;
        synchronized (lVar) {
            if (!lVar.c.containsKey(str)) {
                throw new java.lang.IllegalStateException();
            }
            if (!lVar.f4084a.exists()) {
                lVar.a();
                lVar.f4084a.mkdirs();
            }
            lVar.b.a(lVar, min);
            java.io.File file2 = lVar.f4084a;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.i iVar = lVar.d;
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h hVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.h) iVar.f4081a.get(str);
            if (hVar == null) {
                hVar = iVar.a(str, -1L);
            }
            int i = hVar.f4080a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.regex.Pattern pattern = com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m.g;
            file = new java.io.File(file2, i + "." + j2 + "." + currentTimeMillis + ".v3.exo");
        }
        this.e = file;
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(this.e);
        this.g = fileOutputStream;
        if (this.c > 0) {
            com.fyber.inneractive.sdk.player.exoplayer2.util.p pVar = this.j;
            if (pVar == null) {
                this.j = new com.fyber.inneractive.sdk.player.exoplayer2.util.p(this.g, this.c);
            } else {
                pVar.a(fileOutputStream);
            }
            this.f = this.j;
        } else {
            this.f = fileOutputStream;
        }
        this.h = 0L;
    }
}
