package V5;

import E0.C2942q;
import V5.C4078a;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.Executor;
import q6.C8990a;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f28207h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    private final s f28208a;

    /* renamed from: b, reason: collision with root package name */
    private final o f28209b;

    /* renamed from: c, reason: collision with root package name */
    private final X5.h f28210c;

    /* renamed from: d, reason: collision with root package name */
    private final b f28211d;

    /* renamed from: e, reason: collision with root package name */
    private final y f28212e;

    /* renamed from: f, reason: collision with root package name */
    private final a f28213f;

    /* renamed from: g, reason: collision with root package name */
    private final C4078a f28214g;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        final c f28215a;

        /* renamed from: b, reason: collision with root package name */
        final x2.f<i<?>> f28216b = C8990a.a(150, new C0576a());

        /* renamed from: c, reason: collision with root package name */
        private int f28217c;

        /* renamed from: V5.l$a$a, reason: collision with other inner class name */
        final class C0576a implements C8990a.b<i<?>> {
            C0576a() {
            }

            @Override // q6.C8990a.b
            public final i<?> create() {
                a aVar = a.this;
                return new i<>(aVar.f28215a, aVar.f28216b);
            }
        }

        a(c cVar) {
            this.f28215a = cVar;
        }

        final i a(com.bumptech.glide.f fVar, Object obj, n nVar, T5.f fVar2, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.i iVar, k kVar, Map map, boolean z11, boolean z12, boolean z13, T5.i iVar2, m mVar) {
            i<?> a11 = this.f28216b.a();
            p6.k.c(a11, "Argument must not be null");
            int i13 = this.f28217c;
            this.f28217c = i13 + 1;
            a11.j(fVar, obj, nVar, fVar2, i11, i12, cls, cls2, iVar, kVar, map, z11, z12, z13, iVar2, mVar, i13);
            return a11;
        }
    }

    static class b {

        /* renamed from: a, reason: collision with root package name */
        final Y5.a f28219a;

        /* renamed from: b, reason: collision with root package name */
        final Y5.a f28220b;

        /* renamed from: c, reason: collision with root package name */
        final Y5.a f28221c;

        /* renamed from: d, reason: collision with root package name */
        final Y5.a f28222d;

        /* renamed from: e, reason: collision with root package name */
        final l f28223e;

        /* renamed from: f, reason: collision with root package name */
        final l f28224f;

        /* renamed from: g, reason: collision with root package name */
        final x2.f<m<?>> f28225g = C8990a.a(150, new a());

        final class a implements C8990a.b<m<?>> {
            a() {
            }

            @Override // q6.C8990a.b
            public final m<?> create() {
                b bVar = b.this;
                Y5.a aVar = bVar.f28219a;
                x2.f<m<?>> fVar = bVar.f28225g;
                return new m<>(aVar, bVar.f28220b, bVar.f28221c, bVar.f28222d, bVar.f28223e, bVar.f28224f, fVar);
            }
        }

        b(Y5.a aVar, Y5.a aVar2, Y5.a aVar3, Y5.a aVar4, l lVar, l lVar2) {
            this.f28219a = aVar;
            this.f28220b = aVar2;
            this.f28221c = aVar3;
            this.f28222d = aVar4;
            this.f28223e = lVar;
            this.f28224f = lVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final X5.g f28227a;

        /* renamed from: b, reason: collision with root package name */
        private volatile X5.a f28228b;

        c(X5.g gVar) {
            this.f28227a = gVar;
        }

        public final X5.a a() {
            if (this.f28228b == null) {
                synchronized (this) {
                    try {
                        if (this.f28228b == null) {
                            this.f28228b = this.f28227a.a();
                        }
                        if (this.f28228b == null) {
                            this.f28228b = new X5.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f28228b;
        }
    }

    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final m<?> f28229a;

        /* renamed from: b, reason: collision with root package name */
        private final l6.j f28230b;

        d(l6.j jVar, m mVar) {
            this.f28230b = jVar;
            this.f28229a = mVar;
        }

        public final void a() {
            synchronized (l.this) {
                this.f28229a.l(this.f28230b);
            }
        }
    }

    public l(X5.h hVar, X5.g gVar, Y5.a aVar, Y5.a aVar2, Y5.a aVar3, Y5.a aVar4, boolean z11) {
        this.f28210c = hVar;
        c cVar = new c(gVar);
        C4078a c4078a = new C4078a(z11);
        this.f28214g = c4078a;
        c4078a.d(this);
        this.f28209b = new o();
        this.f28208a = new s();
        this.f28211d = new b(aVar, aVar2, aVar3, aVar4, this, this);
        this.f28213f = new a(cVar);
        this.f28212e = new y();
        hVar.j(this);
    }

    private p<?> b(n nVar, boolean z11, long j11) {
        Throwable th2;
        p<?> pVar;
        l lVar;
        n nVar2;
        p<?> pVar2;
        if (z11) {
            C4078a c4078a = this.f28214g;
            synchronized (c4078a) {
                try {
                    C4078a.b bVar = (C4078a.b) c4078a.f28116c.get(nVar);
                    if (bVar == null) {
                        pVar = null;
                    } else {
                        pVar = bVar.get();
                        if (pVar == null) {
                            try {
                                c4078a.c(bVar);
                            } catch (Throwable th3) {
                                th2 = th3;
                                while (true) {
                                    try {
                                        throw th2;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                    }
                                    th2 = th4;
                                }
                            }
                        }
                    }
                    if (pVar != null) {
                        pVar.c();
                    }
                    if (pVar != null) {
                        if (f28207h) {
                            c("Loaded resource from active resources", j11, nVar);
                        }
                        return pVar;
                    }
                    v<?> g10 = this.f28210c.g(nVar);
                    if (g10 == null) {
                        lVar = this;
                        nVar2 = nVar;
                        pVar2 = null;
                    } else if (g10 instanceof p) {
                        pVar2 = (p) g10;
                        lVar = this;
                        nVar2 = nVar;
                    } else {
                        lVar = this;
                        nVar2 = nVar;
                        pVar2 = new p<>(g10, true, true, nVar2, lVar);
                    }
                    if (pVar2 != null) {
                        pVar2.c();
                        lVar.f28214g.a(nVar2, pVar2);
                    }
                    if (pVar2 != null) {
                        if (f28207h) {
                            c("Loaded resource from cache", j11, nVar2);
                        }
                        return pVar2;
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                }
            }
        }
        return null;
    }

    private static void c(String str, long j11, T5.f fVar) {
        StringBuilder e11 = C2942q.e(str, " in ");
        e11.append(p6.g.a(j11));
        e11.append("ms, key: ");
        e11.append(fVar);
        Log.v("Engine", e11.toString());
    }

    public static void h(v vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).f();
    }

    private d i(com.bumptech.glide.f fVar, Object obj, T5.f fVar2, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.i iVar, k kVar, Map map, boolean z11, boolean z12, T5.i iVar2, boolean z13, boolean z14, boolean z15, boolean z16, l6.j jVar, Executor executor, n nVar, long j11) {
        s sVar = this.f28208a;
        m<?> a11 = sVar.a(nVar, z16);
        boolean z17 = f28207h;
        if (a11 != null) {
            a11.a(jVar, executor);
            if (z17) {
                c("Added to existing load", j11, nVar);
            }
            return new d(jVar, a11);
        }
        m a12 = this.f28211d.f28225g.a();
        p6.k.c(a12, "Argument must not be null");
        a12.f(nVar, z13, z14, z15, z16);
        i a13 = this.f28213f.a(fVar, obj, nVar, fVar2, i11, i12, cls, cls2, iVar, kVar, map, z11, z12, z16, iVar2, a12);
        sVar.b(nVar, a12);
        a12.a(jVar, executor);
        a12.n(a13);
        if (z17) {
            c("Started new load", j11, nVar);
        }
        return new d(jVar, a12);
    }

    public final d a(com.bumptech.glide.f fVar, Object obj, T5.f fVar2, int i11, int i12, Class cls, Class cls2, com.bumptech.glide.i iVar, k kVar, Map map, boolean z11, boolean z12, T5.i iVar2, boolean z13, boolean z14, boolean z15, boolean z16, l6.j jVar, Executor executor) {
        long j11;
        if (f28207h) {
            int i13 = p6.g.f80269b;
            j11 = SystemClock.elapsedRealtimeNanos();
        } else {
            j11 = 0;
        }
        this.f28209b.getClass();
        n nVar = new n(obj, fVar2, i11, i12, map, cls, cls2, iVar2);
        synchronized (this) {
            try {
                p<?> b11 = b(nVar, z13, j11);
                if (b11 == null) {
                    return i(fVar, obj, fVar2, i11, i12, cls, cls2, iVar, kVar, map, z11, z12, iVar2, z13, z14, z15, z16, jVar, executor, nVar, j11);
                }
                jVar.o(b11, T5.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void d(T5.f fVar, m mVar) {
        this.f28208a.c(fVar, mVar);
    }

    public final synchronized void e(m<?> mVar, T5.f fVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.e()) {
                    this.f28214g.a(fVar, pVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28208a.c(fVar, mVar);
    }

    public final void f(T5.f fVar, p<?> pVar) {
        C4078a c4078a = this.f28214g;
        synchronized (c4078a) {
            C4078a.b bVar = (C4078a.b) c4078a.f28116c.remove(fVar);
            if (bVar != null) {
                bVar.f28122c = null;
                bVar.clear();
            }
        }
        if (pVar.e()) {
            this.f28210c.f(fVar, pVar);
        } else {
            this.f28212e.a(pVar, false);
        }
    }

    public final void g(@NonNull v<?> vVar) {
        this.f28212e.a(vVar, true);
    }
}
