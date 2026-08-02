package V5;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import q6.AbstractC8993d;
import q6.C8990a;

/* loaded from: classes.dex */
final class m<R> implements C8990a.d {

    /* renamed from: z, reason: collision with root package name */
    private static final c f28232z = new c();

    /* renamed from: a, reason: collision with root package name */
    final e f28233a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC8993d f28234b;

    /* renamed from: c, reason: collision with root package name */
    private final l f28235c;

    /* renamed from: d, reason: collision with root package name */
    private final x2.f<m<?>> f28236d;

    /* renamed from: e, reason: collision with root package name */
    private final c f28237e;

    /* renamed from: f, reason: collision with root package name */
    private final l f28238f;

    /* renamed from: g, reason: collision with root package name */
    private final Y5.a f28239g;

    /* renamed from: h, reason: collision with root package name */
    private final Y5.a f28240h;

    /* renamed from: i, reason: collision with root package name */
    private final Y5.a f28241i;

    /* renamed from: j, reason: collision with root package name */
    private final Y5.a f28242j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f28243k;

    /* renamed from: l, reason: collision with root package name */
    private T5.f f28244l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f28245m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f28246n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28247o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f28248p;

    /* renamed from: q, reason: collision with root package name */
    private v<?> f28249q;

    /* renamed from: r, reason: collision with root package name */
    T5.a f28250r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f28251s;

    /* renamed from: t, reason: collision with root package name */
    q f28252t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f28253u;

    /* renamed from: v, reason: collision with root package name */
    p<?> f28254v;

    /* renamed from: w, reason: collision with root package name */
    private i<R> f28255w;

    /* renamed from: x, reason: collision with root package name */
    private volatile boolean f28256x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f28257y;

    /* loaded from: classes8.dex */
    private class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final l6.j f28258a;

        a(l6.j jVar) {
            this.f28258a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f28258a.g()) {
                synchronized (m.this) {
                    try {
                        if (m.this.f28233a.b(this.f28258a)) {
                            m mVar = m.this;
                            l6.j jVar = this.f28258a;
                            mVar.getClass();
                            try {
                                jVar.m(mVar.f28252t);
                            } catch (Throwable th2) {
                                throw new V5.c(th2);
                            }
                        }
                        m.this.c();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
    }

    private class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final l6.j f28260a;

        b(l6.j jVar) {
            this.f28260a = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.f28260a.g()) {
                synchronized (m.this) {
                    try {
                        if (m.this.f28233a.b(this.f28260a)) {
                            m.this.f28254v.c();
                            m.this.b(this.f28260a);
                            m.this.l(this.f28260a);
                        }
                        m.this.c();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    static class c {
    }

    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final l6.j f28262a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f28263b;

        d(l6.j jVar, Executor executor) {
            this.f28262a = jVar;
            this.f28263b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f28262a.equals(((d) obj).f28262a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f28262a.hashCode();
        }
    }

    static final class e implements Iterable<d> {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f28264a;

        e(ArrayList arrayList) {
            this.f28264a = arrayList;
        }

        final void a(l6.j jVar, Executor executor) {
            this.f28264a.add(new d(jVar, executor));
        }

        final boolean b(l6.j jVar) {
            return this.f28264a.contains(new d(jVar, p6.e.a()));
        }

        final e c() {
            return new e(new ArrayList(this.f28264a));
        }

        final void clear() {
            this.f28264a.clear();
        }

        final void e(l6.j jVar) {
            this.f28264a.remove(new d(jVar, p6.e.a()));
        }

        final boolean isEmpty() {
            return this.f28264a.isEmpty();
        }

        @Override // java.lang.Iterable
        @NonNull
        public final Iterator<d> iterator() {
            return this.f28264a.iterator();
        }

        final int size() {
            return this.f28264a.size();
        }
    }

    m() {
        throw null;
    }

    m(Y5.a aVar, Y5.a aVar2, Y5.a aVar3, Y5.a aVar4, l lVar, l lVar2, x2.f fVar) {
        c cVar = f28232z;
        this.f28233a = new e(new ArrayList(2));
        this.f28234b = AbstractC8993d.a();
        this.f28243k = new AtomicInteger();
        this.f28239g = aVar;
        this.f28240h = aVar2;
        this.f28241i = aVar3;
        this.f28242j = aVar4;
        this.f28238f = lVar;
        this.f28235c = lVar2;
        this.f28236d = fVar;
        this.f28237e = cVar;
    }

    private boolean g() {
        return this.f28253u || this.f28251s || this.f28256x;
    }

    private synchronized void k() {
        if (this.f28244l == null) {
            throw new IllegalArgumentException();
        }
        this.f28233a.clear();
        this.f28244l = null;
        this.f28254v = null;
        this.f28249q = null;
        this.f28253u = false;
        this.f28256x = false;
        this.f28251s = false;
        this.f28257y = false;
        this.f28255w.n();
        this.f28255w = null;
        this.f28252t = null;
        this.f28250r = null;
        this.f28236d.b(this);
    }

    final synchronized void a(l6.j jVar, Executor executor) {
        try {
            this.f28234b.c();
            this.f28233a.a(jVar, executor);
            if (this.f28251s) {
                e(1);
                executor.execute(new b(jVar));
            } else if (this.f28253u) {
                e(1);
                executor.execute(new a(jVar));
            } else {
                p6.k.a("Cannot add callbacks to a cancelled EngineJob", !this.f28256x);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    final void b(l6.j jVar) {
        try {
            jVar.o(this.f28254v, this.f28250r, this.f28257y);
        } catch (Throwable th2) {
            throw new V5.c(th2);
        }
    }

    final void c() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f28234b.c();
                p6.k.a("Not yet complete!", g());
                int decrementAndGet = this.f28243k.decrementAndGet();
                p6.k.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    pVar = this.f28254v;
                    k();
                } else {
                    pVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    @Override // q6.C8990a.d
    @NonNull
    public final AbstractC8993d d() {
        return this.f28234b;
    }

    final synchronized void e(int i11) {
        p<?> pVar;
        p6.k.a("Not yet complete!", g());
        if (this.f28243k.getAndAdd(i11) == 0 && (pVar = this.f28254v) != null) {
            pVar.c();
        }
    }

    final synchronized void f(T5.f fVar, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f28244l = fVar;
        this.f28245m = z11;
        this.f28246n = z12;
        this.f28247o = z13;
        this.f28248p = z14;
    }

    public final void h(q qVar) {
        synchronized (this) {
            this.f28252t = qVar;
        }
        synchronized (this) {
            try {
                this.f28234b.c();
                if (this.f28256x) {
                    k();
                    return;
                }
                if (this.f28233a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f28253u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f28253u = true;
                T5.f fVar = this.f28244l;
                e c11 = this.f28233a.c();
                e(c11.size() + 1);
                this.f28238f.e(this, fVar, null);
                Iterator<d> it = c11.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f28263b.execute(new a(next.f28262a));
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(v<R> vVar, T5.a aVar, boolean z11) {
        synchronized (this) {
            this.f28249q = vVar;
            this.f28250r = aVar;
            this.f28257y = z11;
        }
        synchronized (this) {
            try {
                this.f28234b.c();
                if (this.f28256x) {
                    this.f28249q.a();
                    k();
                    return;
                }
                if (this.f28233a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f28251s) {
                    throw new IllegalStateException("Already have resource");
                }
                c cVar = this.f28237e;
                v<?> vVar2 = this.f28249q;
                boolean z12 = this.f28245m;
                T5.f fVar = this.f28244l;
                l lVar = this.f28235c;
                cVar.getClass();
                this.f28254v = new p<>(vVar2, z12, true, fVar, lVar);
                this.f28251s = true;
                e c11 = this.f28233a.c();
                e(c11.size() + 1);
                this.f28238f.e(this, this.f28244l, this.f28254v);
                Iterator<d> it = c11.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f28263b.execute(new b(next.f28262a));
                }
                c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean j() {
        return this.f28248p;
    }

    final synchronized void l(l6.j jVar) {
        try {
            this.f28234b.c();
            this.f28233a.e(jVar);
            if (this.f28233a.isEmpty()) {
                if (!g()) {
                    this.f28256x = true;
                    this.f28255w.b();
                    this.f28238f.d(this.f28244l, this);
                }
                if (!this.f28251s) {
                    if (this.f28253u) {
                    }
                }
                if (this.f28243k.get() == 0) {
                    k();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m(i<?> iVar) {
        (this.f28246n ? this.f28241i : this.f28247o ? this.f28242j : this.f28240h).execute(iVar);
    }

    public final synchronized void n(i<R> iVar) {
        try {
            this.f28255w = iVar;
            (iVar.t() ? this.f28239g : this.f28246n ? this.f28241i : this.f28247o ? this.f28242j : this.f28240h).execute(iVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
