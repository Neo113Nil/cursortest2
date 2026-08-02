package com.bumptech.glide.load.engine;

import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.engine.C0685c;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.util.pool.a;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class m implements o, r.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final u a;
    public final q b;
    public final com.bumptech.glide.load.engine.cache.g c;
    public final b d;
    public final A e;
    public final a f;
    public final C0685c g;

    @VisibleForTesting
    public static class a {
        public final c a;
        public final a.c b = com.bumptech.glide.util.pool.a.a(150, new C0061a());
        public int c;

        /* renamed from: com.bumptech.glide.load.engine.m$a$a, reason: collision with other inner class name */
        public class C0061a implements a.b<j<?>> {
            public C0061a() {
            }

            @Override // com.bumptech.glide.util.pool.a.b
            public final j<?> create() {
                a aVar = a.this;
                return new j<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    @VisibleForTesting
    public static class b {
        public final com.bumptech.glide.load.engine.executor.a a;
        public final com.bumptech.glide.load.engine.executor.a b;
        public final com.bumptech.glide.load.engine.executor.a c;
        public final com.bumptech.glide.load.engine.executor.a d;
        public final m e;
        public final m f;
        public final a.c g = com.bumptech.glide.util.pool.a.a(150, new a());

        public class a implements a.b<n<?>> {
            public a() {
            }

            @Override // com.bumptech.glide.util.pool.a.b
            public final n<?> create() {
                b bVar = b.this;
                return new n<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, m mVar2) {
            this.a = aVar;
            this.b = aVar2;
            this.c = aVar3;
            this.d = aVar4;
            this.e = mVar;
            this.f = mVar2;
        }
    }

    public static class c implements j.c {
        public final a.InterfaceC0055a a;
        public volatile com.bumptech.glide.load.engine.cache.a b;

        public c(a.InterfaceC0055a interfaceC0055a) {
            this.a = interfaceC0055a;
        }

        public final com.bumptech.glide.load.engine.cache.a a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            File cacheDir = ((com.bumptech.glide.load.engine.cache.c) this.a).a.a.getCacheDir();
                            com.bumptech.glide.load.engine.cache.d dVar = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                dVar = new com.bumptech.glide.load.engine.cache.d(file);
                            }
                            this.b = dVar;
                        }
                        if (this.b == null) {
                            this.b = new com.amplitude.core.utilities.y();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    public class d {
        public final n<?> a;
        public final com.bumptech.glide.request.j b;

        public d(com.bumptech.glide.request.j jVar, n nVar) {
            this.b = jVar;
            this.a = nVar;
        }
    }

    public m(com.bumptech.glide.load.engine.cache.g gVar, a.InterfaceC0055a interfaceC0055a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4) {
        this.c = gVar;
        c cVar = new c(interfaceC0055a);
        C0685c c0685c = new C0685c();
        this.g = c0685c;
        synchronized (this) {
            try {
                synchronized (c0685c) {
                    try {
                        try {
                            c0685c.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new q();
                this.a = new u();
                this.d = new b(aVar, aVar2, aVar3, aVar4, this, this);
                this.f = new a(cVar);
                this.e = new A();
                gVar.a = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void e(x xVar) {
        if (!(xVar instanceof r)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((r) xVar).d();
    }

    @Override // com.bumptech.glide.load.engine.r.a
    public final void a(com.bumptech.glide.load.g gVar, r<?> rVar) {
        C0685c c0685c = this.g;
        synchronized (c0685c) {
            C0685c.a aVar = (C0685c.a) c0685c.b.remove(gVar);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (rVar.a) {
            this.c.a(gVar, rVar);
        } else {
            this.e.a(rVar, false);
        }
    }

    public final d b(com.bumptech.glide.f fVar, Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, com.bumptech.glide.util.b bVar, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, com.bumptech.glide.request.j jVar, Executor executor) {
        long j;
        if (h) {
            int i3 = com.bumptech.glide.util.h.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.b.getClass();
        p pVar = new p(obj, gVar, i, i2, bVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                r<?> c2 = c(pVar, z3, j);
                if (c2 == null) {
                    return f(fVar, obj, gVar, i, i2, cls, cls2, hVar, lVar, bVar, z, z2, iVar, z3, z4, jVar, executor, pVar, j);
                }
                jVar.h(c2, com.bumptech.glide.load.a.e, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public final r<?> c(p pVar, boolean z, long j) {
        Throwable th;
        r<?> rVar;
        m mVar;
        p pVar2;
        r<?> rVar2;
        if (z) {
            C0685c c0685c = this.g;
            synchronized (c0685c) {
                try {
                    C0685c.a aVar = (C0685c.a) c0685c.b.get(pVar);
                    if (aVar == null) {
                        rVar = null;
                    } else {
                        rVar = aVar.get();
                        if (rVar == null) {
                            try {
                                c0685c.b(aVar);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (rVar != null) {
                        rVar.b();
                    }
                    if (rVar != null) {
                        if (h) {
                            int i = com.bumptech.glide.util.h.a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(pVar);
                        }
                        return rVar;
                    }
                    x b2 = this.c.b(pVar);
                    if (b2 == null) {
                        mVar = this;
                        pVar2 = pVar;
                        rVar2 = null;
                    } else if (b2 instanceof r) {
                        rVar2 = (r) b2;
                        mVar = this;
                        pVar2 = pVar;
                    } else {
                        mVar = this;
                        pVar2 = pVar;
                        rVar2 = new r<>(b2, true, true, pVar2, mVar);
                    }
                    if (rVar2 != null) {
                        rVar2.b();
                        mVar.g.a(pVar2, rVar2);
                    }
                    if (rVar2 != null) {
                        if (h) {
                            int i2 = com.bumptech.glide.util.h.a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(pVar2);
                        }
                        return rVar2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        }
        return null;
    }

    public final synchronized void d(n<?> nVar, com.bumptech.glide.load.g gVar, r<?> rVar) {
        if (rVar != null) {
            try {
                if (rVar.a) {
                    this.g.a(gVar, rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u uVar = this.a;
        uVar.getClass();
        nVar.getClass();
        HashMap hashMap = uVar.a;
        if (nVar.equals(hashMap.get(gVar))) {
            hashMap.remove(gVar);
        }
    }

    public final d f(com.bumptech.glide.f fVar, Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Class cls, Class cls2, com.bumptech.glide.h hVar, l lVar, Map map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, com.bumptech.glide.request.j jVar, Executor executor, p pVar, long j) {
        Executor executor2;
        n nVar = (n) this.a.a.get(pVar);
        if (nVar != null) {
            nVar.a(jVar, executor);
            if (h) {
                int i3 = com.bumptech.glide.util.h.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(pVar);
            }
            return new d(jVar, nVar);
        }
        n nVar2 = (n) this.d.g.acquire();
        synchronized (nVar2) {
            nVar2.m = pVar;
            nVar2.n = z3;
            nVar2.o = z4;
        }
        a aVar = this.f;
        j<R> jVar2 = (j) aVar.b.acquire();
        int i4 = aVar.c;
        aVar.c = i4 + 1;
        i<R> iVar2 = jVar2.a;
        j.c cVar = jVar2.d;
        iVar2.c = fVar;
        iVar2.d = obj;
        iVar2.n = gVar;
        iVar2.e = i;
        iVar2.f = i2;
        iVar2.p = lVar;
        iVar2.g = cls;
        iVar2.h = cVar;
        iVar2.k = cls2;
        iVar2.o = hVar;
        iVar2.i = iVar;
        iVar2.j = map;
        iVar2.q = z;
        iVar2.r = z2;
        jVar2.j = fVar;
        jVar2.k = gVar;
        jVar2.l = hVar;
        jVar2.m = pVar;
        jVar2.n = i;
        jVar2.o = i2;
        jVar2.p = lVar;
        jVar2.q = iVar;
        jVar2.r = nVar2;
        jVar2.s = i4;
        jVar2.u = j.e.a;
        jVar2.v = obj;
        u uVar = this.a;
        uVar.getClass();
        uVar.a.put(pVar, nVar2);
        nVar2.a(jVar, executor);
        synchronized (nVar2) {
            nVar2.v = jVar2;
            j.f h2 = jVar2.h(j.f.a);
            if (h2 != j.f.b && h2 != j.f.c) {
                executor2 = nVar2.o ? nVar2.k : nVar2.j;
                executor2.execute(jVar2);
            }
            executor2 = nVar2.i;
            executor2.execute(jVar2);
        }
        if (h) {
            int i5 = com.bumptech.glide.util.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(pVar);
        }
        return new d(jVar, nVar2);
    }
}
