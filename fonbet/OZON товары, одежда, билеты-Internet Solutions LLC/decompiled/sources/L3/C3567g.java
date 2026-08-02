package L3;

import L3.L;
import android.view.Surface;
import androidx.media3.exoplayer.C5449k;
import j3.C7272n;
import j3.Q;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import m3.C8052E;
import m3.InterfaceC8064f;

/* renamed from: L3.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C3567g implements L {

    /* renamed from: a, reason: collision with root package name */
    private final v f16280a;

    /* renamed from: b, reason: collision with root package name */
    private final z f16281b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayDeque f16282c;

    /* renamed from: d, reason: collision with root package name */
    private Surface f16283d;

    /* renamed from: e, reason: collision with root package name */
    private C7272n f16284e;

    /* renamed from: f, reason: collision with root package name */
    private long f16285f;

    /* renamed from: g, reason: collision with root package name */
    private L.a f16286g;

    /* renamed from: h, reason: collision with root package name */
    private Executor f16287h;

    /* renamed from: i, reason: collision with root package name */
    private u f16288i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L3.g$a */
    final class a {

        /* renamed from: a, reason: collision with root package name */
        private C7272n f16289a;

        a() {
        }

        public final void a(final Q q11) {
            C7272n.a aVar = new C7272n.a();
            aVar.F0(q11.f69043a);
            aVar.h0(q11.f69044b);
            aVar.y0("video/raw");
            this.f16289a = aVar.P();
            C3567g.this.f16287h.execute(new Runnable() { // from class: L3.f
                @Override // java.lang.Runnable
                public final void run() {
                    L.a aVar2;
                    aVar2 = C3567g.this.f16286g;
                    aVar2.onVideoSizeChanged(q11);
                }
            });
        }

        public final void b(long j11, long j12, boolean z11) {
            C3567g c3567g = C3567g.this;
            if (z11 && c3567g.f16283d != null) {
                c3567g.f16287h.execute(new Runnable() { // from class: L3.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        L.a aVar;
                        aVar = C3567g.this.f16286g;
                        aVar.d();
                    }
                });
            }
            C7272n c7272n = this.f16289a;
            if (c7272n == null) {
                c7272n = new C7272n.a().P();
            }
            c3567g.f16288i.b(j12, j11, c7272n, null);
            ((L.b) c3567g.f16282c.remove()).b(j11);
        }
    }

    public C3567g(v vVar, InterfaceC8064f interfaceC8064f) {
        this.f16280a = vVar;
        vVar.k(interfaceC8064f);
        this.f16281b = new z(new a(), vVar);
        this.f16282c = new ArrayDeque();
        this.f16284e = new C7272n.a().P();
        this.f16285f = -9223372036854775807L;
        this.f16286g = L.a.f16273a;
        this.f16287h = new ExecutorC3561a();
        this.f16288i = new C3562b();
    }

    @Override // L3.L
    public final boolean a() {
        return this.f16281b.b();
    }

    @Override // L3.L
    public final Surface b() {
        Surface surface = this.f16283d;
        G10.a.i(surface);
        return surface;
    }

    @Override // L3.L
    public final void c(long j11, long j12) throws L.c {
        try {
            this.f16281b.f(j11, j12);
        } catch (C5449k e11) {
            throw new L.c(e11, this.f16284e);
        }
    }

    @Override // L3.L
    public final void f() {
        this.f16281b.g();
    }

    @Override // L3.L
    public final boolean g(long j11, L.b bVar) {
        this.f16282c.add(bVar);
        this.f16281b.c(j11);
        this.f16287h.execute(new Runnable() { // from class: L3.c
            @Override // java.lang.Runnable
            public final void run() {
                C3567g.this.f16286g.a();
            }
        });
        return true;
    }

    @Override // L3.L
    public final void h(u uVar) {
        this.f16288i = uVar;
    }

    @Override // L3.L
    public final void i(L.a aVar, Executor executor) {
        this.f16286g = aVar;
        this.f16287h = executor;
    }

    @Override // L3.L
    public final boolean isInitialized() {
        return true;
    }

    @Override // L3.L
    public final void j() {
        this.f16280a.a();
    }

    @Override // L3.L
    public final void k() {
        this.f16280a.g();
    }

    @Override // L3.L
    public final void l() {
        this.f16280a.f();
    }

    @Override // L3.L
    public final void m(Surface surface, C8052E c8052e) {
        this.f16283d = surface;
        this.f16280a.m(surface);
    }

    @Override // L3.L
    public final void n(int i11) {
        this.f16280a.j(i11);
    }

    @Override // L3.L
    public final boolean o(C7272n c7272n) {
        return true;
    }

    @Override // L3.L
    public final void p(long j11) {
        throw new UnsupportedOperationException();
    }

    @Override // L3.L
    public final void q(List<Object> list) {
        throw new UnsupportedOperationException();
    }

    @Override // L3.L
    public final boolean r(boolean z11) {
        return this.f16280a.c(z11);
    }

    @Override // L3.L
    public final void redraw() {
        throw new UnsupportedOperationException();
    }

    @Override // L3.L
    public final void release() {
    }

    @Override // L3.L
    public final void s(C7272n c7272n, long j11, int i11, List list) {
        G10.a.h(list.isEmpty());
        int i12 = c7272n.f69134v;
        C7272n c7272n2 = this.f16284e;
        int i13 = c7272n2.f69134v;
        z zVar = this.f16281b;
        int i14 = c7272n.f69135w;
        if (i12 != i13 || i14 != c7272n2.f69135w) {
            zVar.e(i12, i14);
        }
        float f7 = this.f16284e.f69138z;
        float f11 = c7272n.f69138z;
        if (f11 != f7) {
            this.f16280a.l(f11);
        }
        this.f16284e = c7272n;
        if (j11 != this.f16285f) {
            zVar.d(i11, j11);
            this.f16285f = j11;
        }
    }

    @Override // L3.L
    public final void t(float f7) {
        this.f16280a.n(f7);
    }

    @Override // L3.L
    public final void u() {
        this.f16283d = null;
        this.f16280a.m(null);
    }

    @Override // L3.L
    public final void v(boolean z11) {
        if (z11) {
            this.f16280a.i();
        }
        this.f16281b.a();
        this.f16282c.clear();
    }

    @Override // L3.L
    public final void w(boolean z11) {
        this.f16280a.d(z11);
    }
}
