package L3;

import L3.C3571k;
import L3.L;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import com.google.common.collect.AbstractC5880y;
import j3.C7267i;
import j3.C7272n;
import j3.O;
import j3.P;
import j3.Q;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import m3.C8052E;
import m3.C8055H;
import m3.C8072n;
import m3.InterfaceC8064f;
import m3.InterfaceC8073o;
import m3.N;

/* loaded from: classes8.dex */
public final class o {

    /* renamed from: t, reason: collision with root package name */
    private static final ExecutorC3561a f16380t = new ExecutorC3561a();

    /* renamed from: a, reason: collision with root package name */
    private final Context f16381a;

    /* renamed from: b, reason: collision with root package name */
    private final P.a f16382b;

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<c> f16383c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f16384d;

    /* renamed from: e, reason: collision with root package name */
    private final L f16385e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC8064f f16386f;

    /* renamed from: g, reason: collision with root package name */
    private final CopyOnWriteArraySet<d> f16387g;

    /* renamed from: h, reason: collision with root package name */
    private C8055H<g> f16388h = new C8055H<>();

    /* renamed from: i, reason: collision with root package name */
    private C7272n f16389i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC8073o f16390j;

    /* renamed from: k, reason: collision with root package name */
    private u f16391k;

    /* renamed from: l, reason: collision with root package name */
    private Pair<Surface, C8052E> f16392l;

    /* renamed from: m, reason: collision with root package name */
    private int f16393m;

    /* renamed from: n, reason: collision with root package name */
    private int f16394n;

    /* renamed from: o, reason: collision with root package name */
    private long f16395o;

    /* renamed from: p, reason: collision with root package name */
    private long f16396p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16397q;

    /* renamed from: r, reason: collision with root package name */
    private int f16398r;

    /* renamed from: s, reason: collision with root package name */
    private int f16399s;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f16400a;

        /* renamed from: b, reason: collision with root package name */
        private final v f16401b;

        /* renamed from: c, reason: collision with root package name */
        private P.a f16402c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f16403d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC8064f f16404e = InterfaceC8064f.f74315a;

        /* renamed from: f, reason: collision with root package name */
        private boolean f16405f;

        public a(Context context, v vVar) {
            this.f16400a = context.getApplicationContext();
            this.f16401b = vVar;
        }

        public final o f() {
            G10.a.h(!this.f16405f);
            if (this.f16402c == null) {
                this.f16402c = new f();
            }
            o oVar = new o(this);
            this.f16405f = true;
            return oVar;
        }

        public final void g(InterfaceC8064f interfaceC8064f) {
            this.f16404e = interfaceC8064f;
        }

        public final void h() {
            this.f16403d = true;
        }
    }

    private final class b implements L.a {
        b() {
        }

        @Override // L3.L.a
        public final void d() {
            Iterator it = o.this.f16387g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).d();
            }
        }

        @Override // L3.L.a
        public final void e() {
            Iterator it = o.this.f16387g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).e();
            }
        }

        @Override // L3.L.a
        public final void onVideoSizeChanged(Q q11) {
            Iterator it = o.this.f16387g.iterator();
            while (it.hasNext()) {
                ((d) it.next()).onVideoSizeChanged(q11);
            }
        }
    }

    private final class c implements L, d {

        /* renamed from: a, reason: collision with root package name */
        private final int f16407a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5880y<Object> f16408b;

        /* renamed from: c, reason: collision with root package name */
        private C7272n f16409c;

        /* renamed from: d, reason: collision with root package name */
        private long f16410d;

        /* renamed from: e, reason: collision with root package name */
        private long f16411e;

        /* renamed from: f, reason: collision with root package name */
        private L.a f16412f;

        /* renamed from: g, reason: collision with root package name */
        private Executor f16413g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16414h;

        public c(Context context) {
            this.f16407a = N.N(context) ? 1 : 5;
            this.f16408b = AbstractC5880y.v();
            this.f16411e = -9223372036854775807L;
            this.f16412f = L.a.f16273a;
            this.f16413g = o.f16380t;
        }

        private void x(C7272n c7272n) {
            C7272n.a a11 = c7272n.a();
            o oVar = o.this;
            oVar.getClass();
            C7267i c7267i = c7272n.f69100E;
            if (c7267i == null || !c7267i.e()) {
                c7267i = C7267i.f69066h;
            }
            a11.V(c7267i);
            a11.P();
            P v11 = o.v(oVar);
            v11.getClass();
            v11.c();
        }

        @Override // L3.L
        public final boolean a() {
            return this.f16414h && o.j(o.this);
        }

        @Override // L3.L
        public final Surface b() {
            G10.a.h(this.f16414h);
            P v11 = o.v(o.this);
            v11.getClass();
            return v11.b();
        }

        @Override // L3.L
        public final void c(long j11, long j12) throws L.c {
            o.s(o.this, j11 + this.f16410d, j12);
        }

        @Override // L3.o.d
        public final void d() {
            L.a aVar = this.f16412f;
            Executor executor = this.f16413g;
            Objects.requireNonNull(aVar);
            executor.execute(new B50.l(aVar, 1));
        }

        @Override // L3.o.d
        public final void e() {
            L.a aVar = this.f16412f;
            Executor executor = this.f16413g;
            Objects.requireNonNull(aVar);
            executor.execute(new p(aVar, 0));
        }

        @Override // L3.L
        public final void f() {
            long j11 = this.f16411e;
            o oVar = o.this;
            oVar.f16396p = j11;
            if (oVar.f16395o >= oVar.f16396p) {
                o.i(oVar);
            }
        }

        @Override // L3.L
        public final boolean g(long j11, L.b bVar) {
            G10.a.h(this.f16414h);
            o oVar = o.this;
            if (!o.r(oVar)) {
                return false;
            }
            P v11 = o.v(oVar);
            v11.getClass();
            if (v11.g() >= this.f16407a) {
                return false;
            }
            P v12 = o.v(oVar);
            v12.getClass();
            if (!v12.f()) {
                return false;
            }
            long j12 = j11 + this.f16410d;
            this.f16411e = j12;
            ((C3571k.a) bVar).b(j12 * 1000);
            return true;
        }

        @Override // L3.L
        public final void h(u uVar) {
            o.o(o.this, uVar);
        }

        @Override // L3.L
        public final void i(L.a aVar, Executor executor) {
            this.f16412f = aVar;
            this.f16413g = executor;
        }

        @Override // L3.L
        public final boolean isInitialized() {
            return this.f16414h;
        }

        @Override // L3.L
        public final void j() {
            o oVar = o.this;
            if (oVar.f16388h.i() == 0) {
                o.n(oVar);
                return;
            }
            C8055H c8055h = new C8055H();
            boolean z11 = true;
            while (oVar.f16388h.i() > 0) {
                g gVar = (g) oVar.f16388h.f();
                gVar.getClass();
                if (z11) {
                    int i11 = gVar.f16419b;
                    if (i11 == 0 || i11 == 1) {
                        gVar = new g(0, gVar.f16418a, gVar.f16420c);
                    } else {
                        o.n(oVar);
                    }
                    z11 = false;
                }
                c8055h.a(gVar.f16420c, gVar);
            }
            oVar.f16388h = c8055h;
        }

        @Override // L3.L
        public final void k() {
            o oVar = o.this;
            if (oVar.f16384d) {
                oVar.F();
            }
        }

        @Override // L3.L
        public final void l() {
            o oVar = o.this;
            if (oVar.f16384d) {
                oVar.E();
            }
        }

        @Override // L3.L
        public final void m(Surface surface, C8052E c8052e) {
            o.this.C(surface, c8052e);
        }

        @Override // L3.L
        public final void n(int i11) {
            o.q(o.this, i11);
        }

        @Override // L3.L
        public final boolean o(C7272n c7272n) throws L.c {
            G10.a.h(!this.f16414h);
            o.b(o.this, c7272n);
            this.f16414h = true;
            return true;
        }

        @Override // L3.o.d
        public final void onVideoSizeChanged(Q q11) {
            this.f16413g.execute(new q(0, this.f16412f, q11));
        }

        @Override // L3.L
        public final void p(long j11) {
            this.f16410d = j11;
        }

        @Override // L3.L
        public final void q(List<Object> list) {
            if (this.f16408b.equals(list)) {
                return;
            }
            this.f16408b = AbstractC5880y.n(list);
            C7272n c7272n = this.f16409c;
            if (c7272n != null) {
                x(c7272n);
            }
        }

        @Override // L3.L
        public final boolean r(boolean z11) {
            return o.f(o.this, z11 && this.f16414h);
        }

        @Override // L3.L
        public final void redraw() {
            if (this.f16414h) {
                o oVar = o.this;
                long j11 = oVar.f16395o;
                o.e(oVar, false);
                P v11 = o.v(oVar);
                v11.getClass();
                v11.redraw();
                oVar.f16395o = j11;
            }
        }

        @Override // L3.L
        public final void release() {
            o.this.B();
        }

        @Override // L3.L
        public final void s(C7272n c7272n, long j11, int i11, List list) {
            G10.a.h(this.f16414h);
            this.f16408b = AbstractC5880y.n(list);
            this.f16409c = c7272n;
            o oVar = o.this;
            oVar.f16396p = -9223372036854775807L;
            oVar.f16397q = false;
            x(c7272n);
            boolean z11 = this.f16411e == -9223372036854775807L;
            if (oVar.f16384d || z11) {
                long j12 = z11 ? -4611686018427387904L : this.f16411e + 1;
                oVar.f16388h.a(j12, new g(i11, j11 + this.f16410d, j12));
            }
        }

        @Override // L3.L
        public final void t(float f7) {
            o.p(o.this, f7);
        }

        @Override // L3.L
        public final void u() {
            o.this.y();
        }

        @Override // L3.L
        public final void v(boolean z11) {
            boolean z12 = this.f16414h;
            o oVar = o.this;
            if (z12) {
                P v11 = o.v(oVar);
                v11.getClass();
                v11.flush();
            }
            this.f16411e = -9223372036854775807L;
            o.e(oVar, z11);
        }

        @Override // L3.L
        public final void w(boolean z11) {
            o oVar = o.this;
            if (oVar.f16384d) {
                o.t(oVar, z11);
            }
        }
    }

    public interface d {
        default void d() {
        }

        default void e() {
        }

        default void onVideoSizeChanged(Q q11) {
        }
    }

    private static final class e implements O.b {

        /* renamed from: a, reason: collision with root package name */
        private static final O7.p<Class<?>> f16416a = O7.q.a(new r());
    }

    private static final class f implements P.a {

        /* renamed from: a, reason: collision with root package name */
        private final O.b f16417a = new e();

        @Override // j3.P.a
        public final P a(Context context, C7267i c7267i, o oVar, n nVar) {
            try {
                return ((P.a) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(O.b.class).newInstance(this.f16417a)).a(context, c7267i, oVar, nVar);
            } catch (Exception e11) {
                throw new IllegalStateException(e11);
            }
        }
    }

    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final long f16418a;

        /* renamed from: b, reason: collision with root package name */
        public final int f16419b;

        /* renamed from: c, reason: collision with root package name */
        public final long f16420c;

        public g(int i11, long j11, long j12) {
            this.f16418a = j11;
            this.f16419b = i11;
            this.f16420c = j12;
        }
    }

    o(a aVar) {
        this.f16381a = aVar.f16400a;
        P.a aVar2 = aVar.f16402c;
        G10.a.i(aVar2);
        this.f16382b = aVar2;
        this.f16383c = new SparseArray<>();
        AbstractC5880y.v();
        this.f16384d = aVar.f16403d;
        InterfaceC8064f interfaceC8064f = aVar.f16404e;
        this.f16386f = interfaceC8064f;
        this.f16385e = new C3567g(aVar.f16401b, interfaceC8064f);
        this.f16387g = new CopyOnWriteArraySet<>();
        this.f16389i = new C7272n.a().P();
        this.f16395o = -9223372036854775807L;
        this.f16396p = -9223372036854775807L;
        this.f16398r = -1;
        this.f16394n = 0;
    }

    private void A(Surface surface, int i11, int i12) {
    }

    public static /* synthetic */ void a(o oVar) {
        oVar.f16393m--;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [L3.n] */
    static boolean b(o oVar, C7272n c7272n) throws L.c {
        G10.a.h(oVar.f16394n == 0);
        C7267i c7267i = c7272n.f69100E;
        if (c7267i == null || !c7267i.e()) {
            c7267i = C7267i.f69066h;
        }
        try {
            int i11 = c7267i.f69069c;
            if (i11 == 7 && Build.VERSION.SDK_INT < 34 && C8072n.e()) {
                C7267i.a a11 = c7267i.a();
                a11.e(6);
                c7267i = a11.a();
                Looper myLooper = Looper.myLooper();
                G10.a.i(myLooper);
                final InterfaceC8073o a12 = oVar.f16386f.a(myLooper, null);
                oVar.f16390j = a12;
                oVar.f16382b.a(oVar.f16381a, c7267i, oVar, new Executor() { // from class: L3.n
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        InterfaceC8073o.this.i(runnable);
                    }
                }).a();
                throw null;
            }
            if (!C8072n.f(i11) && Build.VERSION.SDK_INT >= 29) {
                Locale locale = Locale.US;
                m3.s.f("PlaybackVidGraphWrapper", "Color transfer " + i11 + " is not supported. Falling back to OpenGl tone mapping.");
                c7267i = C7267i.f69066h;
            }
            Looper myLooper2 = Looper.myLooper();
            G10.a.i(myLooper2);
            final InterfaceC8073o a122 = oVar.f16386f.a(myLooper2, null);
            oVar.f16390j = a122;
            oVar.f16382b.a(oVar.f16381a, c7267i, oVar, new Executor() { // from class: L3.n
                @Override // java.util.concurrent.Executor
                public final void execute(Runnable runnable) {
                    InterfaceC8073o.this.i(runnable);
                }
            }).a();
            throw null;
        } catch (C8072n.a e11) {
            throw new L.c(e11, c7272n);
        }
    }

    static void e(o oVar, boolean z11) {
        if (oVar.f16394n == 1) {
            oVar.f16393m++;
            C3567g c3567g = (C3567g) oVar.f16385e;
            c3567g.v(z11);
            while (oVar.f16388h.i() > 1) {
                oVar.f16388h.f();
            }
            if (oVar.f16388h.i() == 1) {
                g f7 = oVar.f16388h.f();
                f7.getClass();
                c3567g.s(oVar.f16389i, f7.f16418a, f7.f16419b, AbstractC5880y.v());
            }
            oVar.f16395o = -9223372036854775807L;
            oVar.f16396p = -9223372036854775807L;
            oVar.f16397q = false;
            InterfaceC8073o interfaceC8073o = oVar.f16390j;
            G10.a.i(interfaceC8073o);
            interfaceC8073o.i(new m(oVar, 0));
        }
    }

    static boolean f(o oVar, boolean z11) {
        return ((C3567g) oVar.f16385e).r(z11 && oVar.f16393m == 0);
    }

    static void i(o oVar) {
        ((C3567g) oVar.f16385e).f();
        oVar.f16397q = true;
    }

    static boolean j(o oVar) {
        return oVar.f16393m == 0 && oVar.f16397q && ((C3567g) oVar.f16385e).a();
    }

    static void n(o oVar) {
        ((C3567g) oVar.f16385e).j();
    }

    static void o(o oVar, u uVar) {
        oVar.f16391k = uVar;
        ((C3567g) oVar.f16385e).h(uVar);
    }

    static void p(o oVar, float f7) {
        ((C3567g) oVar.f16385e).t(f7);
    }

    static void q(o oVar, int i11) {
        ((C3567g) oVar.f16385e).n(i11);
    }

    static boolean r(o oVar) {
        int i11 = oVar.f16398r;
        return i11 != -1 && i11 == oVar.f16399s;
    }

    static void s(o oVar, long j11, long j12) throws L.c {
        ((C3567g) oVar.f16385e).c(j11, j12);
    }

    static void t(o oVar, boolean z11) {
        ((C3567g) oVar.f16385e).w(z11);
    }

    static /* synthetic */ P v(o oVar) {
        oVar.getClass();
        return null;
    }

    public final void B() {
        if (this.f16394n == 2) {
            return;
        }
        InterfaceC8073o interfaceC8073o = this.f16390j;
        if (interfaceC8073o != null) {
            interfaceC8073o.c();
        }
        this.f16392l = null;
        this.f16394n = 2;
    }

    public final void C(Surface surface, C8052E c8052e) {
        Pair<Surface, C8052E> pair = this.f16392l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((C8052E) this.f16392l.second).equals(c8052e)) {
            return;
        }
        this.f16392l = Pair.create(surface, c8052e);
        A(surface, c8052e.b(), c8052e.a());
    }

    public final void D() {
        this.f16398r = 1;
    }

    public final void E() {
        ((C3567g) this.f16385e).l();
    }

    public final void F() {
        ((C3567g) this.f16385e).k();
    }

    public final void y() {
        C8052E c8052e = C8052E.f74274c;
        A(null, c8052e.b(), c8052e.a());
        this.f16392l = null;
    }

    public final L z() {
        SparseArray<c> sparseArray = this.f16383c;
        if (N.k(sparseArray, 0)) {
            return sparseArray.get(0);
        }
        c cVar = new c(this.f16381a);
        this.f16387g.add(cVar);
        sparseArray.put(0, cVar);
        return cVar;
    }
}
