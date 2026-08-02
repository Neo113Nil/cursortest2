package com.bumptech.glide.load.engine;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.j;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.util.pool.a;
import com.bumptech.glide.util.pool.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class n<R> implements a.d {
    public static final c y = new c();
    public final e a;
    public final d.a b;
    public final r.a c;
    public final Pools.Pool<n<?>> d;
    public final c e;
    public final o f;
    public final com.bumptech.glide.load.engine.executor.a i;
    public final com.bumptech.glide.load.engine.executor.a j;
    public final com.bumptech.glide.load.engine.executor.a k;
    public final AtomicInteger l;
    public p m;
    public boolean n;
    public boolean o;
    public x<?> p;
    public com.bumptech.glide.load.a q;
    public boolean r;
    public s s;
    public boolean t;
    public r<?> u;
    public j<R> v;
    public volatile boolean w;
    public boolean x;

    public class a implements Runnable {
        public final com.bumptech.glide.request.j a;

        public a(com.bumptech.glide.request.j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bumptech.glide.request.j jVar = this.a;
            jVar.a.a();
            synchronized (jVar.b) {
                synchronized (n.this) {
                    try {
                        if (n.this.a.a.contains(new d(this.a, com.bumptech.glide.util.e.b))) {
                            n nVar = n.this;
                            com.bumptech.glide.request.j jVar2 = this.a;
                            nVar.getClass();
                            try {
                                jVar2.e(nVar.s, 5);
                            } catch (Throwable th) {
                                throw new com.bumptech.glide.load.engine.d(th);
                            }
                        }
                        n.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public class b implements Runnable {
        public final com.bumptech.glide.request.j a;

        public b(com.bumptech.glide.request.j jVar) {
            this.a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bumptech.glide.request.j jVar = this.a;
            jVar.a.a();
            synchronized (jVar.b) {
                synchronized (n.this) {
                    try {
                        if (n.this.a.a.contains(new d(this.a, com.bumptech.glide.util.e.b))) {
                            n.this.u.b();
                            n nVar = n.this;
                            com.bumptech.glide.request.j jVar2 = this.a;
                            nVar.getClass();
                            try {
                                jVar2.h(nVar.u, nVar.q, nVar.x);
                                n.this.h(this.a);
                            } catch (Throwable th) {
                                throw new com.bumptech.glide.load.engine.d(th);
                            }
                        }
                        n.this.d();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @VisibleForTesting
    public static class c {
    }

    public static final class d {
        public final com.bumptech.glide.request.j a;
        public final Executor b;

        public d(com.bumptech.glide.request.j jVar, Executor executor) {
            this.a = jVar;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final class e implements Iterable<d> {
        public final ArrayList a;

        public e(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    @VisibleForTesting
    public n() {
        throw null;
    }

    public n(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, m mVar2, a.c cVar) {
        this.a = new e(new ArrayList(2));
        this.b = new d.a();
        this.l = new AtomicInteger();
        this.i = aVar;
        this.j = aVar2;
        this.k = aVar4;
        this.f = mVar;
        this.c = mVar2;
        this.d = cVar;
        this.e = y;
    }

    public final synchronized void a(com.bumptech.glide.request.j jVar, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new d(jVar, executor));
            if (this.r) {
                e(1);
                executor.execute(new b(jVar));
            } else if (this.t) {
                e(1);
                executor.execute(new a(jVar));
            } else {
                com.bumptech.glide.util.l.a(!this.w, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @NonNull
    public final d.a b() {
        return this.b;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.w = true;
        j<R> jVar = this.v;
        jVar.E = true;
        h hVar = jVar.C;
        if (hVar != null) {
            hVar.cancel();
        }
        o oVar = this.f;
        p pVar = this.m;
        m mVar = (m) oVar;
        synchronized (mVar) {
            u uVar = mVar.a;
            uVar.getClass();
            HashMap hashMap = uVar.a;
            if (equals(hashMap.get(pVar))) {
                hashMap.remove(pVar);
            }
        }
    }

    public final void d() {
        r<?> rVar;
        synchronized (this) {
            try {
                this.b.a();
                com.bumptech.glide.util.l.a(f(), "Not yet complete!");
                int decrementAndGet = this.l.decrementAndGet();
                com.bumptech.glide.util.l.a(decrementAndGet >= 0, "Can't decrement below 0");
                if (decrementAndGet == 0) {
                    rVar = this.u;
                    g();
                } else {
                    rVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rVar != null) {
            rVar.d();
        }
    }

    public final synchronized void e(int i) {
        r<?> rVar;
        com.bumptech.glide.util.l.a(f(), "Not yet complete!");
        if (this.l.getAndAdd(i) == 0 && (rVar = this.u) != null) {
            rVar.b();
        }
    }

    public final boolean f() {
        return this.t || this.r || this.w;
    }

    public final synchronized void g() {
        boolean a2;
        if (this.m == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.m = null;
        this.u = null;
        this.p = null;
        this.t = false;
        this.w = false;
        this.r = false;
        this.x = false;
        j<R> jVar = this.v;
        j.d dVar = jVar.i;
        synchronized (dVar) {
            dVar.a = true;
            a2 = dVar.a();
        }
        if (a2) {
            jVar.j();
        }
        this.v = null;
        this.s = null;
        this.q = null;
        this.d.release(this);
    }

    public final synchronized void h(com.bumptech.glide.request.j jVar) {
        try {
            this.b.a();
            this.a.a.remove(new d(jVar, com.bumptech.glide.util.e.b));
            if (this.a.a.isEmpty()) {
                c();
                if (!this.r) {
                    if (this.t) {
                    }
                }
                if (this.l.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
