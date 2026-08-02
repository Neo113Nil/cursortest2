package com.bumptech.glide.load.engine.cache;

import android.util.Log;
import com.bumptech.glide.disklrucache.a;
import com.bumptech.glide.load.engine.cache.b;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d implements a {
    public final File b;
    public com.bumptech.glide.disklrucache.a e;
    public final b d = new b();
    public final long c = 262144000;
    public final i a = new i();

    @Deprecated
    public d(File file) {
        this.b = file;
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final void a(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.engine.g gVar2) {
        b.a aVar;
        boolean z;
        String a = this.a.a(gVar);
        b bVar = this.d;
        synchronized (bVar) {
            aVar = (b.a) bVar.a.get(a);
            if (aVar == null) {
                b.C0056b c0056b = bVar.b;
                synchronized (c0056b.a) {
                    aVar = (b.a) c0056b.a.poll();
                }
                if (aVar == null) {
                    aVar = new b.a();
                }
                bVar.a.put(a, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(gVar);
            }
            try {
                com.bumptech.glide.disklrucache.a c = c();
                if (c.u(a) == null) {
                    a.c s = c.s(a);
                    if (s == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(a));
                    }
                    try {
                        if (gVar2.a.encode(gVar2.b, s.b(), gVar2.c)) {
                            com.bumptech.glide.disklrucache.a.d(com.bumptech.glide.disklrucache.a.this, s, true);
                            s.c = true;
                        }
                        if (!z) {
                            try {
                                s.a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!s.c) {
                            try {
                                s.a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException unused3) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
        } finally {
            this.d.a(a);
        }
    }

    @Override // com.bumptech.glide.load.engine.cache.a
    public final File b(com.bumptech.glide.load.g gVar) {
        String a = this.a.a(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(gVar);
        }
        try {
            a.e u = c().u(a);
            if (u != null) {
                return u.a[0];
            }
            return null;
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }

    public final synchronized com.bumptech.glide.disklrucache.a c() throws IOException {
        try {
            if (this.e == null) {
                this.e = com.bumptech.glide.disklrucache.a.y(this.b, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }
}
