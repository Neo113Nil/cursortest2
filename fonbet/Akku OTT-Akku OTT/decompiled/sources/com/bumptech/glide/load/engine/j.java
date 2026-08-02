package com.bumptech.glide.load.engine;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.m;
import com.bumptech.glide.load.engine.n;
import com.bumptech.glide.load.engine.r;
import com.bumptech.glide.util.pool.a;
import com.bumptech.glide.util.pool.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class j<R> implements h.a, Runnable, Comparable<j<?>>, a.d {
    public com.bumptech.glide.load.a A;
    public com.bumptech.glide.load.data.d<?> B;
    public volatile h C;
    public volatile boolean D;
    public volatile boolean E;
    public boolean F;
    public final c d;
    public final Pools.Pool<j<?>> e;
    public com.bumptech.glide.f j;
    public com.bumptech.glide.load.g k;
    public com.bumptech.glide.h l;
    public p m;
    public int n;
    public int o;
    public l p;
    public com.bumptech.glide.load.i q;
    public n r;
    public int s;
    public f t;
    public e u;
    public Object v;
    public Thread w;
    public com.bumptech.glide.load.g x;
    public com.bumptech.glide.load.g y;
    public Object z;
    public final i<R> a = new i<>();
    public final ArrayList b = new ArrayList();
    public final d.a c = new d.a();
    public final b<?> f = new b<>();
    public final d i = new d();

    public final class a<Z> {
        public final com.bumptech.glide.load.a a;

        public a(com.bumptech.glide.load.a aVar) {
            this.a = aVar;
        }
    }

    public static class b<Z> {
        public com.bumptech.glide.load.g a;
        public com.bumptech.glide.load.l<Z> b;
        public w<Z> c;
    }

    public interface c {
    }

    public static class d {
        public boolean a;
        public boolean b;
        public boolean c;

        public final boolean a() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class e {
        public static final e a;
        public static final e b;
        public static final e c;
        public static final /* synthetic */ e[] d;

        static {
            e eVar = new e("INITIALIZE", 0);
            a = eVar;
            e eVar2 = new e("SWITCH_TO_SOURCE_SERVICE", 1);
            b = eVar2;
            e eVar3 = new e("DECODE_DATA", 2);
            c = eVar3;
            d = new e[]{eVar, eVar2, eVar3};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;
        public static final /* synthetic */ f[] i;

        static {
            f fVar = new f("INITIALIZE", 0);
            a = fVar;
            f fVar2 = new f("RESOURCE_CACHE", 1);
            b = fVar2;
            f fVar3 = new f("DATA_CACHE", 2);
            c = fVar3;
            f fVar4 = new f("SOURCE", 3);
            d = fVar4;
            f fVar5 = new f("ENCODE", 4);
            e = fVar5;
            f fVar6 = new f("FINISHED", 5);
            f = fVar6;
            i = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) i.clone();
        }
    }

    public j(m.c cVar, a.c cVar2) {
        this.d = cVar;
        this.e = cVar2;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void a(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.cleanup();
        s sVar = new s("Fetching data failed", Collections.singletonList(exc));
        Class<?> dataClass = dVar.getDataClass();
        sVar.b = gVar;
        sVar.c = aVar;
        sVar.d = dataClass;
        this.b.add(sVar);
        if (Thread.currentThread() != this.w) {
            k(e.b);
        } else {
            l();
        }
    }

    @Override // com.bumptech.glide.util.pool.a.d
    @NonNull
    public final d.a b() {
        return this.c;
    }

    @Override // com.bumptech.glide.load.engine.h.a
    public final void c(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.x = gVar;
        this.z = obj;
        this.B = dVar;
        this.A = aVar;
        this.y = gVar2;
        this.F = gVar != this.a.a().get(0);
        if (Thread.currentThread() != this.w) {
            k(e.c);
        } else {
            f();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(@NonNull j<?> jVar) {
        j<?> jVar2 = jVar;
        int ordinal = this.l.ordinal() - jVar2.l.ordinal();
        return ordinal == 0 ? this.s - jVar2.s : ordinal;
    }

    public final <Data> x<R> d(com.bumptech.glide.load.data.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) throws s {
        if (data == null) {
            dVar.cleanup();
            return null;
        }
        try {
            int i = com.bumptech.glide.util.h.a;
            SystemClock.elapsedRealtimeNanos();
            x<R> e2 = e(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                e2.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.m);
                Thread.currentThread().getName();
            }
            return e2;
        } finally {
            dVar.cleanup();
        }
    }

    public final <Data> x<R> e(Data data, com.bumptech.glide.load.a aVar) throws s {
        Class<?> cls = data.getClass();
        i<R> iVar = this.a;
        v<Data, ?, R> c2 = iVar.c(cls);
        com.bumptech.glide.load.i iVar2 = this.q;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = aVar == com.bumptech.glide.load.a.d || iVar.r;
            com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.resource.bitmap.l.i;
            Boolean bool = (Boolean) iVar2.b(hVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                iVar2 = new com.bumptech.glide.load.i();
                com.bumptech.glide.util.b bVar = this.q.b;
                com.bumptech.glide.util.b bVar2 = iVar2.b;
                bVar2.putAll((SimpleArrayMap) bVar);
                bVar2.put(hVar, Boolean.valueOf(z));
            }
        }
        com.bumptech.glide.load.i iVar3 = iVar2;
        com.bumptech.glide.load.data.e e2 = this.j.a().e(data);
        try {
            return c2.a(this.n, this.o, iVar3, e2, new a(aVar));
        } finally {
            e2.cleanup();
        }
    }

    public final void f() {
        w wVar;
        boolean a2;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.z + ", cache key: " + this.x + ", fetcher: " + this.B;
            int i = com.bumptech.glide.util.h.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.m);
            if (str != null) {
                ", ".concat(str);
            }
            Thread.currentThread().getName();
        }
        w wVar2 = null;
        try {
            wVar = d(this.B, this.z, this.A);
        } catch (s e2) {
            com.bumptech.glide.load.g gVar = this.y;
            com.bumptech.glide.load.a aVar = this.A;
            e2.b = gVar;
            e2.c = aVar;
            e2.d = null;
            this.b.add(e2);
            wVar = null;
        }
        if (wVar == null) {
            l();
            return;
        }
        com.bumptech.glide.load.a aVar2 = this.A;
        boolean z = this.F;
        if (wVar instanceof t) {
            ((t) wVar).initialize();
        }
        if (this.f.c != null) {
            wVar2 = (w) w.e.acquire();
            wVar2.d = false;
            wVar2.c = true;
            wVar2.b = wVar;
            wVar = wVar2;
        }
        n();
        n<?> nVar = this.r;
        synchronized (nVar) {
            nVar.p = wVar;
            nVar.q = aVar2;
            nVar.x = z;
        }
        synchronized (nVar) {
            try {
                nVar.b.a();
                if (nVar.w) {
                    nVar.p.recycle();
                    nVar.g();
                } else {
                    if (nVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (nVar.r) {
                        throw new IllegalStateException("Already have resource");
                    }
                    n.c cVar = nVar.e;
                    x<?> xVar = nVar.p;
                    boolean z2 = nVar.n;
                    p pVar = nVar.m;
                    r.a aVar3 = nVar.c;
                    cVar.getClass();
                    nVar.u = new r<>(xVar, z2, true, pVar, aVar3);
                    nVar.r = true;
                    n.e eVar = nVar.a;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.a);
                    nVar.e(arrayList.size() + 1);
                    ((m) nVar.f).d(nVar, nVar.m, nVar.u);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n.d dVar = (n.d) it.next();
                        dVar.b.execute(new n.b(dVar.a));
                    }
                    nVar.d();
                }
            } finally {
            }
        }
        this.t = f.e;
        try {
            b<?> bVar = this.f;
            if (bVar.c != null) {
                c cVar2 = this.d;
                com.bumptech.glide.load.i iVar = this.q;
                bVar.getClass();
                try {
                    ((m.c) cVar2).a().a(bVar.a, new g(bVar.b, bVar.c, iVar));
                    bVar.c.d();
                } catch (Throwable th) {
                    bVar.c.d();
                    throw th;
                }
            }
            d dVar2 = this.i;
            synchronized (dVar2) {
                dVar2.b = true;
                a2 = dVar2.a();
            }
            if (a2) {
                j();
            }
        } finally {
            if (wVar2 != null) {
                wVar2.d();
            }
        }
    }

    public final h g() {
        int ordinal = this.t.ordinal();
        i<R> iVar = this.a;
        if (ordinal == 1) {
            return new y(iVar, this);
        }
        if (ordinal == 2) {
            return new com.bumptech.glide.load.engine.e(iVar.a(), iVar, this);
        }
        if (ordinal == 3) {
            return new C(iVar, this);
        }
        if (ordinal == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.t);
    }

    public final f h(f fVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            boolean b2 = this.p.b();
            f fVar2 = f.b;
            return b2 ? fVar2 : h(fVar2);
        }
        if (ordinal == 1) {
            boolean a2 = this.p.a();
            f fVar3 = f.c;
            return a2 ? fVar3 : h(fVar3);
        }
        if (ordinal == 2) {
            return f.d;
        }
        if (ordinal == 3 || ordinal == 5) {
            return f.f;
        }
        throw new IllegalArgumentException("Unrecognized stage: " + fVar);
    }

    public final void i() {
        boolean a2;
        n();
        s sVar = new s("Failed to load resource", new ArrayList(this.b));
        n<?> nVar = this.r;
        synchronized (nVar) {
            nVar.s = sVar;
        }
        synchronized (nVar) {
            try {
                nVar.b.a();
                if (nVar.w) {
                    nVar.g();
                } else {
                    if (nVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (nVar.t) {
                        throw new IllegalStateException("Already failed once");
                    }
                    nVar.t = true;
                    p pVar = nVar.m;
                    n.e eVar = nVar.a;
                    eVar.getClass();
                    ArrayList arrayList = new ArrayList(eVar.a);
                    nVar.e(arrayList.size() + 1);
                    ((m) nVar.f).d(nVar, pVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n.d dVar = (n.d) it.next();
                        dVar.b.execute(new n.a(dVar.a));
                    }
                    nVar.d();
                }
            } finally {
            }
        }
        d dVar2 = this.i;
        synchronized (dVar2) {
            dVar2.c = true;
            a2 = dVar2.a();
        }
        if (a2) {
            j();
        }
    }

    public final void j() {
        d dVar = this.i;
        synchronized (dVar) {
            dVar.b = false;
            dVar.a = false;
            dVar.c = false;
        }
        b<?> bVar = this.f;
        bVar.a = null;
        bVar.b = null;
        bVar.c = null;
        i<R> iVar = this.a;
        iVar.c = null;
        iVar.d = null;
        iVar.n = null;
        iVar.g = null;
        iVar.k = null;
        iVar.i = null;
        iVar.o = null;
        iVar.j = null;
        iVar.p = null;
        iVar.a.clear();
        iVar.l = false;
        iVar.b.clear();
        iVar.m = false;
        this.D = false;
        this.j = null;
        this.k = null;
        this.q = null;
        this.l = null;
        this.m = null;
        this.r = null;
        this.t = null;
        this.C = null;
        this.w = null;
        this.x = null;
        this.z = null;
        this.A = null;
        this.B = null;
        this.E = false;
        this.v = null;
        this.b.clear();
        this.e.release(this);
    }

    public final void k(e eVar) {
        this.u = eVar;
        n nVar = this.r;
        (nVar.o ? nVar.k : nVar.j).execute(this);
    }

    public final void l() {
        this.w = Thread.currentThread();
        int i = com.bumptech.glide.util.h.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.E && this.C != null && !(z = this.C.b())) {
            this.t = h(this.t);
            this.C = g();
            if (this.t == f.d) {
                k(e.b);
                return;
            }
        }
        if ((this.t == f.f || this.E) && !z) {
            i();
        }
    }

    public final void m() {
        int ordinal = this.u.ordinal();
        if (ordinal == 0) {
            this.t = h(f.a);
            this.C = g();
            l();
        } else if (ordinal == 1) {
            l();
        } else if (ordinal == 2) {
            f();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.u);
        }
    }

    public final void n() {
        this.c.a();
        if (this.D) {
            throw new IllegalStateException("Already notified", this.b.isEmpty() ? null : (Throwable) androidx.constraintlayout.motion.widget.a.a(1, this.b));
        }
        this.D = true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d<?> dVar = this.B;
        try {
            try {
                if (this.E) {
                    i();
                    if (dVar != null) {
                        dVar.cleanup();
                        return;
                    }
                    return;
                }
                m();
                if (dVar != null) {
                    dVar.cleanup();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.cleanup();
                }
                throw th;
            }
        } catch (com.bumptech.glide.load.engine.d e2) {
            throw e2;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Objects.toString(this.t);
            }
            if (this.t != f.e) {
                this.b.add(th2);
                i();
            }
            if (!this.E) {
                throw th2;
            }
            throw th2;
        }
    }
}
