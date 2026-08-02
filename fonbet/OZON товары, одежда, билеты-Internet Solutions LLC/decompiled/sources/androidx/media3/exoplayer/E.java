package androidx.media3.exoplayer;

import F3.C3015u;
import F3.InterfaceC3018x;
import F3.W;
import M3.j;
import N3.C3660k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.exoplayer.C5441c;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.K;
import androidx.media3.exoplayer.f0;
import androidx.media3.exoplayer.h0;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import j3.AbstractC7265g;
import j3.C7255K;
import j3.C7256L;
import j3.C7263e;
import j3.C7269k;
import j3.C7271m;
import j3.C7272n;
import j3.C7273o;
import j3.C7275q;
import j3.s;
import j3.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import l3.C7855a;
import l3.C7856b;
import m3.C8052E;
import m3.C8053F;
import m3.C8062d;
import m3.C8067i;
import m3.InterfaceC8064f;
import m3.InterfaceC8073o;
import m3.r;
import t3.C9729A;
import t3.C9734F;
import t3.C9737c;
import t3.C9738d;
import u3.InterfaceC9927a;
import u3.InterfaceC9928b;

/* loaded from: classes.dex */
final class E extends AbstractC7265g implements ExoPlayer {

    /* renamed from: A, reason: collision with root package name */
    private final c f43472A;

    /* renamed from: B, reason: collision with root package name */
    private final C5441c f43473B;

    /* renamed from: C, reason: collision with root package name */
    private final m0 f43474C;

    /* renamed from: D, reason: collision with root package name */
    private final n0 f43475D;

    /* renamed from: E, reason: collision with root package name */
    private final long f43476E;

    /* renamed from: F, reason: collision with root package name */
    private final C8062d<Integer> f43477F;

    /* renamed from: G, reason: collision with root package name */
    private int f43478G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f43479H;

    /* renamed from: I, reason: collision with root package name */
    private int f43480I;

    /* renamed from: J, reason: collision with root package name */
    private int f43481J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f43482K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f43483L;

    /* renamed from: M, reason: collision with root package name */
    private com.google.common.collect.A<Integer> f43484M;

    /* renamed from: N, reason: collision with root package name */
    private t3.H f43485N;

    /* renamed from: O, reason: collision with root package name */
    private F3.W f43486O;

    /* renamed from: P, reason: collision with root package name */
    private y.a f43487P;

    /* renamed from: Q, reason: collision with root package name */
    private j3.s f43488Q;

    /* renamed from: R, reason: collision with root package name */
    private Object f43489R;

    /* renamed from: S, reason: collision with root package name */
    private Surface f43490S;

    /* renamed from: T, reason: collision with root package name */
    private SurfaceHolder f43491T;

    /* renamed from: U, reason: collision with root package name */
    private M3.j f43492U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f43493V;

    /* renamed from: W, reason: collision with root package name */
    private TextureView f43494W;

    /* renamed from: X, reason: collision with root package name */
    private int f43495X;

    /* renamed from: Y, reason: collision with root package name */
    private C8052E f43496Y;

    /* renamed from: Z, reason: collision with root package name */
    private C7263e f43497Z;

    /* renamed from: a0, reason: collision with root package name */
    private float f43498a0;

    /* renamed from: b, reason: collision with root package name */
    final I3.F f43499b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f43500b0;

    /* renamed from: c, reason: collision with root package name */
    final y.a f43501c;

    /* renamed from: c0, reason: collision with root package name */
    private C7856b f43502c0;

    /* renamed from: d, reason: collision with root package name */
    private final C8067i f43503d = new C8067i();

    /* renamed from: d0, reason: collision with root package name */
    private boolean f43504d0;

    /* renamed from: e, reason: collision with root package name */
    private final Context f43505e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f43506e0;

    /* renamed from: f, reason: collision with root package name */
    private final j3.y f43507f;

    /* renamed from: f0, reason: collision with root package name */
    private int f43508f0;

    /* renamed from: g, reason: collision with root package name */
    private final j0[] f43509g;

    /* renamed from: g0, reason: collision with root package name */
    private j3.Q f43510g0;

    /* renamed from: h, reason: collision with root package name */
    private final j0[] f43511h;

    /* renamed from: h0, reason: collision with root package name */
    private j3.s f43512h0;

    /* renamed from: i, reason: collision with root package name */
    private final I3.E f43513i;

    /* renamed from: i0, reason: collision with root package name */
    private g0 f43514i0;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC8073o f43515j;

    /* renamed from: j0, reason: collision with root package name */
    private int f43516j0;

    /* renamed from: k, reason: collision with root package name */
    private final r f43517k;

    /* renamed from: k0, reason: collision with root package name */
    private long f43518k0;

    /* renamed from: l, reason: collision with root package name */
    private final K f43519l;

    /* renamed from: m, reason: collision with root package name */
    private final m3.r<y.c> f43520m;

    /* renamed from: n, reason: collision with root package name */
    private final CopyOnWriteArraySet<ExoPlayer.a> f43521n;

    /* renamed from: o, reason: collision with root package name */
    private final AbstractC7252H.b f43522o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList f43523p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f43524q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3018x.a f43525r;

    /* renamed from: s, reason: collision with root package name */
    private final InterfaceC9927a f43526s;

    /* renamed from: t, reason: collision with root package name */
    private final Looper f43527t;

    /* renamed from: u, reason: collision with root package name */
    private final J3.d f43528u;

    /* renamed from: v, reason: collision with root package name */
    private final long f43529v;

    /* renamed from: w, reason: collision with root package name */
    private final long f43530w;

    /* renamed from: x, reason: collision with root package name */
    private final long f43531x;

    /* renamed from: y, reason: collision with root package name */
    private final C8053F f43532y;

    /* renamed from: z, reason: collision with root package name */
    private final b f43533z;

    /* loaded from: classes8.dex */
    private static final class a {
        public static void a(final Context context, final E e11, final u3.P p11, final boolean z11) {
            ((C8053F) e11.I0()).a(e11.M0(), null).i(new Runnable() { // from class: androidx.media3.exoplayer.D
                @Override // java.lang.Runnable
                public final void run() {
                    u3.N h11 = u3.N.h(context);
                    if (h11 == null) {
                        m3.s.f("ExoPlayerImpl", "MediaMetricsService unavailable.");
                        return;
                    }
                    if (z11) {
                        e11.c(h11);
                    }
                    p11.b(h11.j());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b implements L3.K, v3.o, H3.g, C3.b, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, j.b, C5441c.b, ExoPlayer.a {
        b() {
        }

        @Override // M3.j.b
        public final void A(Surface surface) {
            E.this.X0(surface);
        }

        @Override // M3.j.b
        public final void B() {
            E.this.X0(null);
        }

        @Override // L3.K
        public final void a(C9737c c9737c) {
            E.this.f43526s.a(c9737c);
        }

        @Override // L3.K
        public final void b(String str) {
            E.this.f43526s.b(str);
        }

        @Override // v3.o
        public final void c(int i11) {
            E.this.f43477F.f(new t3.y(i11), new t3.z(i11));
        }

        @Override // v3.o
        public final void d(String str) {
            E.this.f43526s.d(str);
        }

        @Override // v3.o
        public final void e(String str, long j11, long j12) {
            E.this.f43526s.e(str, j11, j12);
        }

        @Override // L3.K
        public final void f(C9737c c9737c) {
            E e11 = E.this;
            e11.getClass();
            e11.f43526s.f(c9737c);
        }

        @Override // L3.K
        public final void g(C7272n c7272n, C9738d c9738d) {
            E e11 = E.this;
            e11.getClass();
            e11.f43526s.g(c7272n, c9738d);
        }

        @Override // v3.o
        public final void h(C9737c c9737c) {
            E e11 = E.this;
            e11.getClass();
            e11.f43526s.h(c9737c);
        }

        @Override // L3.K
        public final void i(long j11, Object obj) {
            E e11 = E.this;
            e11.f43526s.i(j11, obj);
            if (e11.f43489R == obj) {
                e11.f43520m.h(26, new Pk0.a(6));
            }
        }

        @Override // L3.K
        public final void j(int i11, long j11) {
            E.this.f43526s.j(i11, j11);
        }

        @Override // L3.K
        public final void k(int i11, long j11) {
            E.this.f43526s.k(i11, j11);
        }

        @Override // v3.o
        public final void l(v3.p pVar) {
            E.this.f43526s.l(pVar);
        }

        @Override // C3.b
        public final void m(j3.t tVar) {
            E e11 = E.this;
            s.a a11 = e11.f43512h0.a();
            for (int i11 = 0; i11 < tVar.e(); i11++) {
                tVar.d(i11).a(a11);
            }
            e11.f43512h0 = a11.H();
            j3.s G02 = e11.G0();
            if (!G02.equals(e11.f43488Q)) {
                e11.f43488Q = G02;
                e11.f43520m.e(14, new r.a() { // from class: androidx.media3.exoplayer.F
                    @Override // m3.r.a
                    public final void invoke(Object obj) {
                        ((y.c) obj).e0(E.this.f43488Q);
                    }
                });
            }
            e11.f43520m.e(28, new AW.d(tVar));
            e11.f43520m.d();
        }

        @Override // v3.o
        public final void n(Exception exc) {
            E.this.f43526s.n(exc);
        }

        @Override // v3.o
        public final void o(C7272n c7272n, C9738d c9738d) {
            E e11 = E.this;
            e11.getClass();
            e11.f43526s.o(c7272n, c9738d);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i11, int i12) {
            E e11 = E.this;
            E.z0(e11, surfaceTexture);
            e11.S0(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            E e11 = E.this;
            e11.X0(null);
            e11.S0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i11, int i12) {
            E.this.S0(i11, i12);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // L3.K
        public final void onVideoSizeChanged(j3.Q q11) {
            E e11 = E.this;
            e11.f43510g0 = q11;
            e11.f43520m.h(25, new AY.a(q11));
        }

        @Override // L3.K
        public final void p(String str, long j11, long j12) {
            E.this.f43526s.p(str, j11, j12);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.a
        public final void q() {
            E.this.c1();
        }

        @Override // v3.o
        public final void r(final boolean z11) {
            E e11 = E.this;
            if (e11.f43500b0 == z11) {
                return;
            }
            e11.f43500b0 = z11;
            e11.f43520m.h(23, new r.a() { // from class: t3.x
                @Override // m3.r.a
                public final void invoke(Object obj) {
                    ((y.c) obj).r(z11);
                }
            });
        }

        @Override // v3.o
        public final void s(Exception exc) {
            E.this.f43526s.s(exc);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            E.this.S0(i12, i13);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            E e11 = E.this;
            if (e11.f43493V) {
                e11.X0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            E e11 = E.this;
            if (e11.f43493V) {
                e11.X0(null);
            }
            e11.S0(0, 0);
        }

        @Override // H3.g
        public final void t(List<C7855a> list) {
            E.this.f43520m.h(27, new B90.J(list));
        }

        @Override // v3.o
        public final void u(long j11) {
            E.this.f43526s.u(j11);
        }

        @Override // L3.K
        public final void v(Exception exc) {
            E.this.f43526s.v(exc);
        }

        @Override // v3.o
        public final void w(v3.p pVar) {
            E.this.f43526s.w(pVar);
        }

        @Override // H3.g
        public final void x(C7856b c7856b) {
            E e11 = E.this;
            e11.f43502c0 = c7856b;
            e11.f43520m.h(27, new AW.c(c7856b));
        }

        @Override // v3.o
        public final void y(C9737c c9737c) {
            E.this.f43526s.y(c9737c);
        }

        @Override // v3.o
        public final void z(int i11, long j11, long j12) {
            E.this.f43526s.z(i11, j11, j12);
        }
    }

    private static final class c implements L3.u, M3.a, h0.b {

        /* renamed from: a, reason: collision with root package name */
        private L3.u f43535a;

        /* renamed from: b, reason: collision with root package name */
        private M3.a f43536b;

        /* renamed from: c, reason: collision with root package name */
        private L3.u f43537c;

        /* renamed from: d, reason: collision with root package name */
        private M3.a f43538d;

        @Override // L3.u
        public final void b(long j11, long j12, C7272n c7272n, MediaFormat mediaFormat) {
            long j13;
            long j14;
            C7272n c7272n2;
            MediaFormat mediaFormat2;
            L3.u uVar = this.f43537c;
            if (uVar != null) {
                uVar.b(j11, j12, c7272n, mediaFormat);
                mediaFormat2 = mediaFormat;
                c7272n2 = c7272n;
                j14 = j12;
                j13 = j11;
            } else {
                j13 = j11;
                j14 = j12;
                c7272n2 = c7272n;
                mediaFormat2 = mediaFormat;
            }
            L3.u uVar2 = this.f43535a;
            if (uVar2 != null) {
                uVar2.b(j13, j14, c7272n2, mediaFormat2);
            }
        }

        @Override // M3.a
        public final void d(long j11, float[] fArr) {
            M3.a aVar = this.f43538d;
            if (aVar != null) {
                aVar.d(j11, fArr);
            }
            M3.a aVar2 = this.f43536b;
            if (aVar2 != null) {
                aVar2.d(j11, fArr);
            }
        }

        @Override // M3.a
        public final void e() {
            M3.a aVar = this.f43538d;
            if (aVar != null) {
                aVar.e();
            }
            M3.a aVar2 = this.f43536b;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // androidx.media3.exoplayer.h0.b
        public final void j(int i11, Object obj) {
            if (i11 == 7) {
                this.f43535a = (L3.u) obj;
                return;
            }
            if (i11 == 8) {
                this.f43536b = (M3.a) obj;
                return;
            }
            if (i11 != 10000) {
                return;
            }
            M3.j jVar = (M3.j) obj;
            if (jVar == null) {
                this.f43537c = null;
                this.f43538d = null;
            } else {
                this.f43537c = jVar.f();
                this.f43538d = jVar.e();
            }
        }
    }

    private static final class d implements S {

        /* renamed from: a, reason: collision with root package name */
        private final Object f43539a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC7252H f43540b;

        public d(Object obj, C3015u c3015u) {
            this.f43539a = obj;
            this.f43540b = c3015u.l();
        }

        @Override // androidx.media3.exoplayer.S
        public final AbstractC7252H a() {
            return this.f43540b;
        }

        public final void b(AbstractC7252H abstractC7252H) {
            this.f43540b = abstractC7252H;
        }

        @Override // androidx.media3.exoplayer.S
        public final Object getUid() {
            return this.f43539a;
        }
    }

    static {
        j3.r.a("media3.exoplayer");
    }

    @SuppressLint({"HandlerLeak"})
    public E(ExoPlayer.b bVar) {
        try {
            m3.s.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + m3.N.f74290b + "]");
            Context context = bVar.f43541a;
            this.f43505e = context.getApplicationContext();
            C3660k c3660k = bVar.f43548h;
            C8053F c8053f = bVar.f43542b;
            c3660k.getClass();
            this.f43526s = new u3.t(c8053f);
            this.f43508f0 = bVar.f43550j;
            this.f43497Z = bVar.f43551k;
            this.f43495X = bVar.f43552l;
            this.f43500b0 = false;
            this.f43476E = bVar.f43561u;
            b bVar2 = new b();
            this.f43533z = bVar2;
            this.f43472A = new c();
            Handler handler = new Handler(bVar.f43549i);
            t3.G g10 = bVar.f43543c.get();
            j0[] a11 = g10.a(handler, bVar2, bVar2, bVar2, bVar2);
            this.f43509g = a11;
            G10.a.h(a11.length > 0);
            this.f43511h = new j0[a11.length];
            int i11 = 0;
            while (true) {
                j0[] j0VarArr = this.f43511h;
                if (i11 >= j0VarArr.length) {
                    break;
                }
                g10.b(this.f43509g[i11]);
                j0VarArr[i11] = null;
                i11++;
            }
            I3.E e11 = (I3.E) bVar.f43545e.get();
            this.f43513i = e11;
            this.f43525r = bVar.f43544d.get();
            J3.d dVar = bVar.f43547g.get();
            this.f43528u = dVar;
            this.f43524q = bVar.f43553m;
            t3.I i12 = bVar.f43554n;
            this.f43529v = bVar.f43556p;
            this.f43530w = bVar.f43557q;
            this.f43531x = bVar.f43558r;
            this.f43485N = bVar.f43555o;
            Looper looper = bVar.f43549i;
            this.f43527t = looper;
            this.f43532y = c8053f;
            this.f43507f = this;
            this.f43520m = new m3.r<>(looper, c8053f, new r.b() { // from class: androidx.media3.exoplayer.q
                @Override // m3.r.b
                public final void d(Object obj, C7271m c7271m) {
                    E.i0(E.this, (y.c) obj, c7271m);
                }
            });
            CopyOnWriteArraySet<ExoPlayer.a> copyOnWriteArraySet = new CopyOnWriteArraySet<>();
            this.f43521n = copyOnWriteArraySet;
            this.f43523p = new ArrayList();
            this.f43486O = new W.a();
            j0[] j0VarArr2 = this.f43509g;
            I3.F f7 = new I3.F(new C9734F[j0VarArr2.length], new I3.y[j0VarArr2.length], C7256L.f69033b, null);
            this.f43499b = f7;
            this.f43522o = new AbstractC7252H.b();
            y.a.C1130a c1130a = new y.a.C1130a();
            c1130a.c(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32);
            c1130a.d(29, e11 instanceof I3.n);
            c1130a.d(23, false);
            c1130a.d(25, false);
            c1130a.d(33, false);
            c1130a.d(26, false);
            c1130a.d(34, false);
            y.a e12 = c1130a.e();
            this.f43501c = e12;
            y.a.C1130a c1130a2 = new y.a.C1130a();
            c1130a2.b(e12);
            c1130a2.a(4);
            c1130a2.a(10);
            this.f43487P = c1130a2.e();
            this.f43515j = c8053f.a(looper, null);
            r rVar = new r(this);
            this.f43517k = rVar;
            this.f43514i0 = g0.k(f7);
            this.f43526s.B(this, looper);
            u3.P p11 = new u3.P(bVar.f43564x);
            K k11 = new K(this.f43505e, this.f43509g, this.f43511h, e11, f7, bVar.f43546f.get(), dVar, this.f43478G, this.f43479H, this.f43526s, i12, bVar.f43559s, bVar.f43560t, looper, c8053f, rVar, p11, this.f43472A);
            this.f43519l = k11;
            Looper y11 = k11.y();
            this.f43498a0 = 1.0f;
            this.f43478G = 0;
            j3.s sVar = j3.s.f69265I;
            this.f43488Q = sVar;
            this.f43512h0 = sVar;
            this.f43516j0 = -1;
            this.f43502c0 = C7856b.f72636c;
            this.f43504d0 = true;
            t(this.f43526s);
            dVar.b(new Handler(looper), this.f43526s);
            copyOnWriteArraySet.add(this.f43533z);
            if (Build.VERSION.SDK_INT >= 31) {
                a.a(this.f43505e, this, p11, bVar.f43562v);
            }
            C8062d<Integer> c8062d = new C8062d<>(0, y11, looper, c8053f, new C8062d.a() { // from class: androidx.media3.exoplayer.t
                @Override // m3.C8062d.a
                public final void a(Object obj, Object obj2) {
                    ((Integer) obj).getClass();
                    E.m0(E.this, ((Integer) obj2).intValue());
                }
            });
            this.f43477F = c8062d;
            c8062d.d(new Runnable() { // from class: androidx.media3.exoplayer.u
                @Override // java.lang.Runnable
                public final void run() {
                    E.h0(E.this);
                }
            });
            C5441c c5441c = new C5441c(bVar.f43541a, y11, bVar.f43549i, this.f43533z, c8053f);
            this.f43473B = c5441c;
            c5441c.c();
            m0 m0Var = new m0();
            context.getApplicationContext();
            c8053f.a(y11, null);
            this.f43474C = m0Var;
            n0 n0Var = new n0();
            context.getApplicationContext();
            c8053f.a(y11, null);
            this.f43475D = n0Var;
            C7269k c7269k = C7269k.f69080d;
            this.f43510g0 = j3.Q.f69042d;
            this.f43496Y = C8052E.f74274c;
            k11.D0(this.f43485N);
            k11.p0(this.f43497Z);
            U0(1, 3, this.f43497Z);
            U0(2, 4, Integer.valueOf(this.f43495X));
            U0(2, 5, 0);
            U0(1, 9, Boolean.valueOf(this.f43500b0));
            U0(6, 8, this.f43472A);
            U0(-1, 16, Integer.valueOf(this.f43508f0));
            this.f43503d.g();
        } catch (Throwable th2) {
            this.f43503d.g();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j3.s G0() {
        AbstractC7252H G11 = G();
        if (G11.isEmpty()) {
            return this.f43512h0;
        }
        C7275q c7275q = G11.getWindow(R(), this.f69060a).f68948c;
        s.a a11 = this.f43512h0.a();
        a11.J(c7275q.f69186d);
        return a11.H();
    }

    private h0 H0(h0.b bVar) {
        int L02 = L0(this.f43514i0);
        AbstractC7252H abstractC7252H = this.f43514i0.f43825a;
        if (L02 == -1) {
            L02 = 0;
        }
        K k11 = this.f43519l;
        return new h0(k11, bVar, abstractC7252H, L02, this.f43532y, k11.y());
    }

    private long J0(g0 g0Var) {
        if (!g0Var.f43826b.b()) {
            return m3.N.g0(K0(g0Var));
        }
        Object obj = g0Var.f43826b.f8751a;
        AbstractC7252H abstractC7252H = g0Var.f43825a;
        AbstractC7252H.b bVar = this.f43522o;
        abstractC7252H.getPeriodByUid(obj, bVar);
        long j11 = g0Var.f43827c;
        if (j11 == -9223372036854775807L) {
            return m3.N.g0(abstractC7252H.getWindow(L0(g0Var), this.f69060a).f68957l);
        }
        return m3.N.g0(j11) + m3.N.g0(bVar.f68941e);
    }

    private long K0(g0 g0Var) {
        if (g0Var.f43825a.isEmpty()) {
            return m3.N.Q(this.f43518k0);
        }
        long m11 = g0Var.f43840p ? g0Var.m() : g0Var.f43843s;
        if (g0Var.f43826b.b()) {
            return m11;
        }
        AbstractC7252H abstractC7252H = g0Var.f43825a;
        Object obj = g0Var.f43826b.f8751a;
        AbstractC7252H.b bVar = this.f43522o;
        abstractC7252H.getPeriodByUid(obj, bVar);
        return m11 + bVar.f68941e;
    }

    private int L0(g0 g0Var) {
        if (g0Var.f43825a.isEmpty()) {
            return this.f43516j0;
        }
        return g0Var.f43825a.getPeriodByUid(g0Var.f43826b.f8751a, this.f43522o).f68939c;
    }

    private y.d N0(int i11, g0 g0Var, int i12) {
        int i13;
        Object obj;
        C7275q c7275q;
        Object obj2;
        int i14;
        long j11;
        long O02;
        AbstractC7252H.b bVar = new AbstractC7252H.b();
        if (g0Var.f43825a.isEmpty()) {
            i13 = i12;
            obj = null;
            c7275q = null;
            obj2 = null;
            i14 = -1;
        } else {
            Object obj3 = g0Var.f43826b.f8751a;
            g0Var.f43825a.getPeriodByUid(obj3, bVar);
            int i15 = bVar.f68939c;
            int indexOfPeriod = g0Var.f43825a.getIndexOfPeriod(obj3);
            Object obj4 = g0Var.f43825a.getWindow(i15, this.f69060a).f68946a;
            c7275q = this.f69060a.f68948c;
            obj2 = obj3;
            i14 = indexOfPeriod;
            obj = obj4;
            i13 = i15;
        }
        if (i11 == 0) {
            if (g0Var.f43826b.b()) {
                InterfaceC3018x.b bVar2 = g0Var.f43826b;
                j11 = bVar.a(bVar2.f8752b, bVar2.f8753c);
                O02 = O0(g0Var);
            } else {
                j11 = g0Var.f43826b.f8755e != -1 ? O0(this.f43514i0) : bVar.f68941e + bVar.f68940d;
                O02 = j11;
            }
        } else if (g0Var.f43826b.b()) {
            j11 = g0Var.f43843s;
            O02 = O0(g0Var);
        } else {
            j11 = bVar.f68941e + g0Var.f43843s;
            O02 = j11;
        }
        long g02 = m3.N.g0(j11);
        long g03 = m3.N.g0(O02);
        InterfaceC3018x.b bVar3 = g0Var.f43826b;
        return new y.d(obj, i13, c7275q, obj2, i14, g02, g03, bVar3.f8752b, bVar3.f8753c);
    }

    private static long O0(g0 g0Var) {
        AbstractC7252H.c cVar = new AbstractC7252H.c();
        AbstractC7252H.b bVar = new AbstractC7252H.b();
        g0Var.f43825a.getPeriodByUid(g0Var.f43826b.f8751a, bVar);
        long j11 = g0Var.f43827c;
        return j11 == -9223372036854775807L ? g0Var.f43825a.getWindow(bVar.f68939c, cVar).f68957l : bVar.f68941e + j11;
    }

    private static g0 P0(g0 g0Var, int i11) {
        g0 h11 = g0Var.h(i11);
        return (i11 == 1 || i11 == 4) ? h11.b(false) : h11;
    }

    private g0 Q0(g0 g0Var, AbstractC7252H abstractC7252H, Pair<Object, Long> pair) {
        G10.a.c(abstractC7252H.isEmpty() || pair != null);
        AbstractC7252H abstractC7252H2 = g0Var.f43825a;
        long J02 = J0(g0Var);
        g0 j11 = g0Var.j(abstractC7252H);
        if (abstractC7252H.isEmpty()) {
            InterfaceC3018x.b l11 = g0.l();
            long Q11 = m3.N.Q(this.f43518k0);
            g0 c11 = j11.d(l11, Q11, Q11, Q11, 0L, F3.d0.f8643d, this.f43499b, AbstractC5880y.v()).c(l11);
            c11.f43841q = c11.f43843s;
            return c11;
        }
        Object obj = j11.f43826b.f8751a;
        int i11 = m3.N.f74289a;
        boolean equals = obj.equals(pair.first);
        InterfaceC3018x.b bVar = !equals ? new InterfaceC3018x.b(pair.first) : j11.f43826b;
        long longValue = ((Long) pair.second).longValue();
        long Q12 = m3.N.Q(J02);
        if (!abstractC7252H2.isEmpty()) {
            Q12 -= abstractC7252H2.getPeriodByUid(obj, this.f43522o).f68941e;
        }
        if (!equals || longValue < Q12) {
            InterfaceC3018x.b bVar2 = bVar;
            G10.a.h(!bVar2.b());
            g0 c12 = j11.d(bVar2, longValue, longValue, longValue, 0L, !equals ? F3.d0.f8643d : j11.f43832h, !equals ? this.f43499b : j11.f43833i, !equals ? AbstractC5880y.v() : j11.f43834j).c(bVar2);
            c12.f43841q = longValue;
            return c12;
        }
        if (longValue != Q12) {
            InterfaceC3018x.b bVar3 = bVar;
            G10.a.h(!bVar3.b());
            long max = Math.max(0L, j11.f43842r - (longValue - Q12));
            long j12 = j11.f43841q;
            if (j11.f43835k.equals(j11.f43826b)) {
                j12 = longValue + max;
            }
            g0 d11 = j11.d(bVar3, longValue, longValue, longValue, max, j11.f43832h, j11.f43833i, j11.f43834j);
            d11.f43841q = j12;
            return d11;
        }
        int indexOfPeriod = abstractC7252H.getIndexOfPeriod(j11.f43835k.f8751a);
        if (indexOfPeriod != -1 && abstractC7252H.getPeriod(indexOfPeriod, this.f43522o).f68939c == abstractC7252H.getPeriodByUid(bVar.f8751a, this.f43522o).f68939c) {
            return j11;
        }
        abstractC7252H.getPeriodByUid(bVar.f8751a, this.f43522o);
        long a11 = bVar.b() ? this.f43522o.a(bVar.f8752b, bVar.f8753c) : this.f43522o.f68940d;
        InterfaceC3018x.b bVar4 = bVar;
        g0 c13 = j11.d(bVar4, j11.f43843s, j11.f43843s, j11.f43828d, a11 - j11.f43843s, j11.f43832h, j11.f43833i, j11.f43834j).c(bVar4);
        c13.f43841q = a11;
        return c13;
    }

    private Pair<Object, Long> R0(AbstractC7252H abstractC7252H, int i11, long j11) {
        if (abstractC7252H.isEmpty()) {
            this.f43516j0 = i11;
            if (j11 == -9223372036854775807L) {
                j11 = 0;
            }
            this.f43518k0 = j11;
            return null;
        }
        if (i11 == -1 || i11 >= abstractC7252H.getWindowCount()) {
            i11 = abstractC7252H.getFirstWindowIndex(this.f43479H);
            j11 = m3.N.g0(abstractC7252H.getWindow(i11, this.f69060a).f68957l);
        }
        return abstractC7252H.getPeriodPositionUs(this.f69060a, this.f43522o, i11, m3.N.Q(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S0(final int i11, final int i12) {
        if (i11 == this.f43496Y.b() && i12 == this.f43496Y.a()) {
            return;
        }
        this.f43496Y = new C8052E(i11, i12);
        this.f43520m.h(24, new r.a() { // from class: t3.q
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((y.c) obj).W(i11, i12);
            }
        });
        U0(2, 14, new C8052E(i11, i12));
    }

    private void T0() {
        M3.j jVar = this.f43492U;
        b bVar = this.f43533z;
        if (jVar != null) {
            h0 H02 = H0(this.f43472A);
            H02.h(10000);
            H02.g(null);
            H02.f();
            this.f43492U.h(bVar);
            this.f43492U = null;
        }
        TextureView textureView = this.f43494W;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != bVar) {
                m3.s.f("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f43494W.setSurfaceTextureListener(null);
            }
            this.f43494W = null;
        }
        SurfaceHolder surfaceHolder = this.f43491T;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(bVar);
            this.f43491T = null;
        }
    }

    private void U0(int i11, int i12, Object obj) {
        for (j0 j0Var : this.f43509g) {
            if (i11 == -1 || j0Var.v() == i11) {
                h0 H02 = H0(j0Var);
                H02.h(i12);
                H02.g(obj);
                H02.f();
            }
        }
        for (j0 j0Var2 : this.f43511h) {
            if (j0Var2 != null && (i11 == -1 || j0Var2.v() == i11)) {
                h0 H03 = H0(j0Var2);
                H03.h(i12);
                H03.g(obj);
                H03.f();
            }
        }
    }

    private void V0(long j11, List list, int i11, boolean z11) {
        long j12;
        int i12;
        int i13;
        int i14 = i11;
        int L02 = L0(this.f43514i0);
        long currentPosition = getCurrentPosition();
        this.f43480I++;
        ArrayList arrayList = this.f43523p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i15 = size - 1; i15 >= 0; i15--) {
                arrayList.remove(i15);
            }
            this.f43486O = this.f43486O.f(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i16 = 0; i16 < list.size(); i16++) {
            f0.c cVar = new f0.c((InterfaceC3018x) list.get(i16), this.f43524q);
            arrayList2.add(cVar);
            arrayList.add(i16, new d(cVar.f43802b, cVar.f43801a));
        }
        this.f43486O = this.f43486O.g(arrayList2.size());
        i0 i0Var = new i0(arrayList, this.f43486O);
        if (!i0Var.isEmpty() && i14 >= i0Var.getWindowCount()) {
            throw new C7273o();
        }
        if (z11) {
            i14 = i0Var.getFirstWindowIndex(this.f43479H);
            j12 = -9223372036854775807L;
        } else {
            if (i14 == -1) {
                i12 = L02;
                j12 = currentPosition;
                g0 Q02 = Q0(this.f43514i0, i0Var, R0(i0Var, i12, j12));
                i13 = Q02.f43829e;
                if (i12 != -1 && i13 != 1) {
                    i13 = (!i0Var.isEmpty() || i12 >= i0Var.getWindowCount()) ? 4 : 2;
                }
                g0 P02 = P0(Q02, i13);
                this.f43519l.t0(i12, m3.N.Q(j12), this.f43486O, arrayList2);
                b1(P02, 0, this.f43514i0.f43826b.f8751a.equals(P02.f43826b.f8751a) && !this.f43514i0.f43825a.isEmpty(), 4, K0(P02), -1, false);
            }
            j12 = j11;
        }
        i12 = i14;
        g0 Q022 = Q0(this.f43514i0, i0Var, R0(i0Var, i12, j12));
        i13 = Q022.f43829e;
        if (i12 != -1) {
            if (i0Var.isEmpty()) {
            }
        }
        g0 P022 = P0(Q022, i13);
        this.f43519l.t0(i12, m3.N.Q(j12), this.f43486O, arrayList2);
        b1(P022, 0, this.f43514i0.f43826b.f8751a.equals(P022.f43826b.f8751a) && !this.f43514i0.f43825a.isEmpty(), 4, K0(P022), -1, false);
    }

    private void W0(SurfaceHolder surfaceHolder) {
        this.f43493V = false;
        this.f43491T = surfaceHolder;
        surfaceHolder.addCallback(this.f43533z);
        Surface surface = this.f43491T.getSurface();
        if (surface == null || !surface.isValid()) {
            S0(0, 0);
        } else {
            Rect surfaceFrame = this.f43491T.getSurfaceFrame();
            S0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(Object obj) {
        Object obj2 = this.f43489R;
        boolean z11 = (obj2 == null || obj2 == obj) ? false : true;
        boolean L02 = this.f43519l.L0(z11 ? this.f43476E : -9223372036854775807L, obj);
        if (z11) {
            Object obj3 = this.f43489R;
            Surface surface = this.f43490S;
            if (obj3 == surface) {
                surface.release();
                this.f43490S = null;
            }
        }
        this.f43489R = obj;
        if (L02) {
            return;
        }
        Y0(C5449k.f(new C9729A(3), 1003));
    }

    private void Y0(C5449k c5449k) {
        g0 g0Var = this.f43514i0;
        g0 c11 = g0Var.c(g0Var.f43826b);
        c11.f43841q = c11.f43843s;
        c11.f43842r = 0L;
        g0 P02 = P0(c11, 1);
        if (c5449k != null) {
            P02 = P02.f(c5449k);
        }
        this.f43480I++;
        this.f43519l.S0();
        b1(P02, 0, false, 5, -9223372036854775807L, -1, false);
    }

    private void Z0() {
        y.a aVar = this.f43487P;
        int i11 = m3.N.f74289a;
        E e11 = (E) this.f43507f;
        boolean e12 = e11.e();
        boolean e02 = e11.e0();
        boolean a02 = e11.a0();
        boolean Z11 = e11.Z();
        boolean d02 = e11.d0();
        boolean c02 = e11.c0();
        boolean isEmpty = e11.G().isEmpty();
        y.a.C1130a c1130a = new y.a.C1130a();
        c1130a.b(this.f43501c);
        boolean z11 = !e12;
        c1130a.d(4, z11);
        c1130a.d(5, e02 && !e12);
        c1130a.d(6, a02 && !e12);
        c1130a.d(7, !isEmpty && (a02 || !d02 || e02) && !e12);
        c1130a.d(8, Z11 && !e12);
        c1130a.d(9, !isEmpty && (Z11 || (d02 && c02)) && !e12);
        c1130a.d(10, z11);
        c1130a.d(11, e02 && !e12);
        c1130a.d(12, e02 && !e12);
        y.a e13 = c1130a.e();
        this.f43487P = e13;
        if (e13.equals(aVar)) {
            return;
        }
        this.f43520m.e(13, new r.a() { // from class: androidx.media3.exoplayer.w
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((y.c) obj).T(E.this.f43487P);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(int i11, boolean z11) {
        int i12 = this.f43483L ? 4 : (this.f43514i0.f43838n != 1 || z11) ? 0 : 1;
        g0 g0Var = this.f43514i0;
        if (g0Var.f43836l == z11 && g0Var.f43838n == i12 && g0Var.f43837m == i11) {
            return;
        }
        this.f43480I++;
        if (g0Var.f43840p) {
            g0Var = g0Var.a();
        }
        g0 e11 = g0Var.e(i11, i12, z11);
        this.f43519l.v0(i11, i12, z11);
        b1(e11, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02db A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void b1(final g0 g0Var, final int i11, boolean z11, final int i12, long j11, int i13, boolean z12) {
        int i14;
        int i15;
        Pair pair;
        int i16;
        boolean booleanValue;
        C7275q c7275q;
        List<j3.t> list;
        int i17;
        boolean equals;
        boolean z13;
        boolean z14;
        m3.r<y.c> rVar;
        boolean z15;
        boolean z16;
        C5449k c5449k;
        C5449k c5449k2;
        I3.F f7;
        I3.F f11;
        Object obj;
        C7275q c7275q2;
        Object obj2;
        int i18;
        g0 g0Var2 = this.f43514i0;
        this.f43514i0 = g0Var;
        boolean equals2 = g0Var2.f43825a.equals(g0Var.f43825a);
        AbstractC7252H abstractC7252H = g0Var.f43825a;
        boolean isEmpty = abstractC7252H.isEmpty();
        AbstractC7252H.c cVar = this.f69060a;
        AbstractC7252H.b bVar = this.f43522o;
        int i19 = 0;
        InterfaceC3018x.b bVar2 = g0Var.f43826b;
        AbstractC7252H abstractC7252H2 = g0Var2.f43825a;
        if (isEmpty && abstractC7252H2.isEmpty()) {
            pair = new Pair(Boolean.FALSE, -1);
            i14 = 3;
        } else {
            i14 = 3;
            if (abstractC7252H.isEmpty() != abstractC7252H2.isEmpty()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                InterfaceC3018x.b bVar3 = g0Var2.f43826b;
                if (abstractC7252H2.getWindow(abstractC7252H2.getPeriodByUid(bVar3.f8751a, bVar).f68939c, cVar).f68946a.equals(abstractC7252H.getWindow(abstractC7252H.getPeriodByUid(bVar2.f8751a, bVar).f68939c, cVar).f68946a)) {
                    if (z11 && i12 == 0) {
                        i15 = 2;
                        if (bVar3.f8754d < bVar2.f8754d) {
                            pair = new Pair(Boolean.TRUE, 0);
                            booleanValue = ((Boolean) pair.first).booleanValue();
                            int intValue = ((Integer) pair.second).intValue();
                            if (booleanValue) {
                                c7275q = !abstractC7252H.isEmpty() ? abstractC7252H.getWindow(abstractC7252H.getPeriodByUid(bVar2.f8751a, bVar).f68939c, cVar).f68948c : null;
                                this.f43512h0 = j3.s.f69265I;
                            } else {
                                c7275q = null;
                            }
                            list = g0Var.f43834j;
                            if (!booleanValue || !g0Var2.f43834j.equals(list)) {
                                s.a a11 = this.f43512h0.a();
                                i17 = 0;
                                while (i17 < list.size()) {
                                    j3.t tVar = list.get(i17);
                                    for (int i21 = i19; i21 < tVar.e(); i21++) {
                                        tVar.d(i21).a(a11);
                                    }
                                    i17++;
                                    i19 = 0;
                                }
                                this.f43512h0 = a11.H();
                            }
                            j3.s G02 = G0();
                            equals = G02.equals(this.f43488Q);
                            this.f43488Q = G02;
                            boolean z17 = g0Var2.f43836l != g0Var.f43836l;
                            z13 = g0Var2.f43829e != g0Var.f43829e;
                            if (!z13 || z17) {
                                c1();
                            }
                            z14 = g0Var2.f43831g != g0Var.f43831g;
                            rVar = this.f43520m;
                            if (!equals2) {
                                rVar.e(0, new r.a() { // from class: androidx.media3.exoplayer.m
                                    @Override // m3.r.a
                                    public final void invoke(Object obj3) {
                                        AbstractC7252H abstractC7252H3 = g0.this.f43825a;
                                        ((y.c) obj3).E(i11);
                                    }
                                });
                            }
                            if (z11) {
                                final y.d N02 = N0(i12, g0Var2, i13);
                                int R11 = R();
                                z15 = booleanValue;
                                if (this.f43514i0.f43825a.isEmpty()) {
                                    z16 = z17;
                                    obj = null;
                                    c7275q2 = null;
                                    obj2 = null;
                                    i18 = -1;
                                } else {
                                    g0 g0Var3 = this.f43514i0;
                                    z16 = z17;
                                    Object obj3 = g0Var3.f43826b.f8751a;
                                    g0Var3.f43825a.getPeriodByUid(obj3, bVar);
                                    int indexOfPeriod = this.f43514i0.f43825a.getIndexOfPeriod(obj3);
                                    Object obj4 = this.f43514i0.f43825a.getWindow(R11, cVar).f68946a;
                                    i18 = indexOfPeriod;
                                    obj2 = obj3;
                                    c7275q2 = cVar.f68948c;
                                    obj = obj4;
                                }
                                long g02 = m3.N.g0(j11);
                                long g03 = this.f43514i0.f43826b.b() ? m3.N.g0(O0(this.f43514i0)) : g02;
                                InterfaceC3018x.b bVar4 = this.f43514i0.f43826b;
                                final y.d dVar = new y.d(obj, R11, c7275q2, obj2, i18, g02, g03, bVar4.f8752b, bVar4.f8753c);
                                rVar.e(11, new r.a() { // from class: t3.v
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        y.c cVar2 = (y.c) obj5;
                                        cVar2.getClass();
                                        cVar2.a0(i12, N02, dVar);
                                    }
                                });
                            } else {
                                z15 = booleanValue;
                                z16 = z17;
                            }
                            if (z15) {
                                rVar.e(1, new t3.w(intValue, 0, c7275q));
                            }
                            c5449k = g0Var2.f43830f;
                            c5449k2 = g0Var.f43830f;
                            if (c5449k != c5449k2) {
                                rVar.e(10, new r.a() { // from class: androidx.media3.exoplayer.A
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).Y(g0.this.f43830f);
                                    }
                                });
                                if (c5449k2 != null) {
                                    rVar.e(10, new r.a() { // from class: androidx.media3.exoplayer.B
                                        @Override // m3.r.a
                                        public final void invoke(Object obj5) {
                                            ((y.c) obj5).onPlayerError(g0.this.f43830f);
                                        }
                                    });
                                }
                            }
                            f7 = g0Var2.f43833i;
                            f11 = g0Var.f43833i;
                            if (f7 != f11) {
                                this.f43513i.g(f11.f11826e);
                                rVar.e(i15, new r.a() { // from class: androidx.media3.exoplayer.C
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).onTracksChanged(g0.this.f43833i.f11825d);
                                    }
                                });
                            }
                            if (!equals) {
                                rVar.e(14, new com.google.firebase.messaging.b0(this.f43488Q));
                            }
                            if (z14) {
                                rVar.e(i14, new r.a() { // from class: androidx.media3.exoplayer.n
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        y.c cVar2 = (y.c) obj5;
                                        g0 g0Var4 = g0.this;
                                        boolean z18 = g0Var4.f43831g;
                                        cVar2.getClass();
                                        cVar2.Z(g0Var4.f43831g);
                                    }
                                });
                            }
                            if (!z13 || z16) {
                                rVar.e(-1, new r.a() { // from class: androidx.media3.exoplayer.o
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        g0 g0Var4 = g0.this;
                                        ((y.c) obj5).L(g0Var4.f43829e, g0Var4.f43836l);
                                    }
                                });
                            }
                            if (z13) {
                                rVar.e(4, new r.a() { // from class: androidx.media3.exoplayer.p
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).onPlaybackStateChanged(g0.this.f43829e);
                                    }
                                });
                            }
                            if (!z16 || g0Var2.f43837m != g0Var.f43837m) {
                                rVar.e(5, new r.a() { // from class: androidx.media3.exoplayer.s
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        g0 g0Var4 = g0.this;
                                        ((y.c) obj5).onPlayWhenReadyChanged(g0Var4.f43836l, g0Var4.f43837m);
                                    }
                                });
                            }
                            if (g0Var2.f43838n != g0Var.f43838n) {
                                rVar.e(6, new r.a() { // from class: androidx.media3.exoplayer.x
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).O(g0.this.f43838n);
                                    }
                                });
                            }
                            if (g0Var2.n() != g0Var.n()) {
                                rVar.e(7, new r.a() { // from class: androidx.media3.exoplayer.y
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).N(g0.this.n());
                                    }
                                });
                            }
                            if (!g0Var2.f43839o.equals(g0Var.f43839o)) {
                                rVar.e(12, new r.a() { // from class: androidx.media3.exoplayer.z
                                    @Override // m3.r.a
                                    public final void invoke(Object obj5) {
                                        ((y.c) obj5).R(g0.this.f43839o);
                                    }
                                });
                            }
                            Z0();
                            rVar.d();
                            if (g0Var2.f43840p != g0Var.f43840p) {
                                Iterator<ExoPlayer.a> it = this.f43521n.iterator();
                                while (it.hasNext()) {
                                    it.next().q();
                                }
                                return;
                            }
                            return;
                        }
                    } else {
                        i15 = 2;
                    }
                    pair = (z11 && i12 == 1 && z12) ? new Pair(Boolean.TRUE, Integer.valueOf(i15)) : new Pair(Boolean.FALSE, -1);
                    booleanValue = ((Boolean) pair.first).booleanValue();
                    int intValue2 = ((Integer) pair.second).intValue();
                    if (booleanValue) {
                    }
                    list = g0Var.f43834j;
                    if (!booleanValue) {
                    }
                    s.a a112 = this.f43512h0.a();
                    i17 = 0;
                    while (i17 < list.size()) {
                    }
                    this.f43512h0 = a112.H();
                    j3.s G022 = G0();
                    equals = G022.equals(this.f43488Q);
                    this.f43488Q = G022;
                    if (g0Var2.f43836l != g0Var.f43836l) {
                    }
                    if (g0Var2.f43829e != g0Var.f43829e) {
                    }
                    if (!z13) {
                    }
                    c1();
                    if (g0Var2.f43831g != g0Var.f43831g) {
                    }
                    rVar = this.f43520m;
                    if (!equals2) {
                    }
                    if (z11) {
                    }
                    if (z15) {
                    }
                    c5449k = g0Var2.f43830f;
                    c5449k2 = g0Var.f43830f;
                    if (c5449k != c5449k2) {
                    }
                    f7 = g0Var2.f43833i;
                    f11 = g0Var.f43833i;
                    if (f7 != f11) {
                    }
                    if (!equals) {
                    }
                    if (z14) {
                    }
                    if (!z13) {
                    }
                    rVar.e(-1, new r.a() { // from class: androidx.media3.exoplayer.o
                        @Override // m3.r.a
                        public final void invoke(Object obj5) {
                            g0 g0Var4 = g0.this;
                            ((y.c) obj5).L(g0Var4.f43829e, g0Var4.f43836l);
                        }
                    });
                    if (z13) {
                    }
                    if (!z16) {
                    }
                    rVar.e(5, new r.a() { // from class: androidx.media3.exoplayer.s
                        @Override // m3.r.a
                        public final void invoke(Object obj5) {
                            g0 g0Var4 = g0.this;
                            ((y.c) obj5).onPlayWhenReadyChanged(g0Var4.f43836l, g0Var4.f43837m);
                        }
                    });
                    if (g0Var2.f43838n != g0Var.f43838n) {
                    }
                    if (g0Var2.n() != g0Var.n()) {
                    }
                    if (!g0Var2.f43839o.equals(g0Var.f43839o)) {
                    }
                    Z0();
                    rVar.d();
                    if (g0Var2.f43840p != g0Var.f43840p) {
                    }
                } else {
                    if (z11 && i12 == 0) {
                        i16 = 1;
                    } else if (z11 && i12 == 1) {
                        i16 = 2;
                    } else {
                        if (equals2) {
                            throw new IllegalStateException();
                        }
                        i16 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i16));
                }
            }
        }
        i15 = 2;
        booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue22 = ((Integer) pair.second).intValue();
        if (booleanValue) {
        }
        list = g0Var.f43834j;
        if (!booleanValue) {
        }
        s.a a1122 = this.f43512h0.a();
        i17 = 0;
        while (i17 < list.size()) {
        }
        this.f43512h0 = a1122.H();
        j3.s G0222 = G0();
        equals = G0222.equals(this.f43488Q);
        this.f43488Q = G0222;
        if (g0Var2.f43836l != g0Var.f43836l) {
        }
        if (g0Var2.f43829e != g0Var.f43829e) {
        }
        if (!z13) {
        }
        c1();
        if (g0Var2.f43831g != g0Var.f43831g) {
        }
        rVar = this.f43520m;
        if (!equals2) {
        }
        if (z11) {
        }
        if (z15) {
        }
        c5449k = g0Var2.f43830f;
        c5449k2 = g0Var.f43830f;
        if (c5449k != c5449k2) {
        }
        f7 = g0Var2.f43833i;
        f11 = g0Var.f43833i;
        if (f7 != f11) {
        }
        if (!equals) {
        }
        if (z14) {
        }
        if (!z13) {
        }
        rVar.e(-1, new r.a() { // from class: androidx.media3.exoplayer.o
            @Override // m3.r.a
            public final void invoke(Object obj5) {
                g0 g0Var4 = g0.this;
                ((y.c) obj5).L(g0Var4.f43829e, g0Var4.f43836l);
            }
        });
        if (z13) {
        }
        if (!z16) {
        }
        rVar.e(5, new r.a() { // from class: androidx.media3.exoplayer.s
            @Override // m3.r.a
            public final void invoke(Object obj5) {
                g0 g0Var4 = g0.this;
                ((y.c) obj5).onPlayWhenReadyChanged(g0Var4.f43836l, g0Var4.f43837m);
            }
        });
        if (g0Var2.f43838n != g0Var.f43838n) {
        }
        if (g0Var2.n() != g0Var.n()) {
        }
        if (!g0Var2.f43839o.equals(g0Var.f43839o)) {
        }
        Z0();
        rVar.d();
        if (g0Var2.f43840p != g0Var.f43840p) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1() {
        int P11 = P();
        n0 n0Var = this.f43475D;
        m0 m0Var = this.f43474C;
        if (P11 != 1) {
            if (P11 == 2 || P11 == 3) {
                d1();
                m0Var.a(n() && !this.f43514i0.f43840p);
                n0Var.a(n());
                return;
            } else if (P11 != 4) {
                throw new IllegalStateException();
            }
        }
        m0Var.a(false);
        n0Var.a(false);
    }

    private void d1() {
        this.f43503d.c();
        Thread currentThread = Thread.currentThread();
        Looper looper = this.f43527t;
        if (currentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i11 = m3.N.f74289a;
            Locale locale = Locale.US;
            String a11 = V.e.a("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f43504d0) {
                throw new IllegalStateException(a11);
            }
            m3.s.g("ExoPlayerImpl", a11, this.f43506e0 ? null : new IllegalStateException());
            this.f43506e0 = true;
        }
    }

    public static void h0(E e11) {
        e11.getClass();
        int i11 = m3.N.f74289a;
        e11.f43477F.e(Integer.valueOf(k3.c.c(e11.f43505e).generateAudioSessionId()));
    }

    public static /* synthetic */ void i0(E e11, y.c cVar, C7271m c7271m) {
        e11.getClass();
        cVar.Q(e11.f43507f, new y.b(c7271m));
    }

    public static void k0(E e11, K.e eVar) {
        boolean z11;
        int i11 = e11.f43480I - eVar.f43640c;
        e11.f43480I = i11;
        boolean z12 = true;
        if (eVar.f43641d) {
            e11.f43481J = eVar.f43642e;
            e11.f43482K = true;
        }
        if (i11 == 0) {
            AbstractC7252H abstractC7252H = eVar.f43639b.f43825a;
            if (!e11.f43514i0.f43825a.isEmpty() && abstractC7252H.isEmpty()) {
                e11.f43516j0 = -1;
                e11.f43518k0 = 0L;
            }
            if (!abstractC7252H.isEmpty()) {
                List<AbstractC7252H> j11 = ((i0) abstractC7252H).j();
                G10.a.h(j11.size() == e11.f43523p.size());
                for (int i12 = 0; i12 < j11.size(); i12++) {
                    ((d) e11.f43523p.get(i12)).b(j11.get(i12));
                }
            }
            long j12 = -9223372036854775807L;
            if (e11.f43482K) {
                if (eVar.f43639b.f43826b.equals(e11.f43514i0.f43826b) && eVar.f43639b.f43828d == e11.f43514i0.f43843s) {
                    z12 = false;
                }
                if (z12) {
                    if (abstractC7252H.isEmpty() || eVar.f43639b.f43826b.b()) {
                        j12 = eVar.f43639b.f43828d;
                    } else {
                        g0 g0Var = eVar.f43639b;
                        InterfaceC3018x.b bVar = g0Var.f43826b;
                        long j13 = g0Var.f43828d;
                        Object obj = bVar.f8751a;
                        AbstractC7252H.b bVar2 = e11.f43522o;
                        abstractC7252H.getPeriodByUid(obj, bVar2);
                        j12 = j13 + bVar2.f68941e;
                    }
                }
                z11 = z12;
            } else {
                z11 = false;
            }
            e11.f43482K = false;
            e11.b1(eVar.f43639b, 1, z11, e11.f43481J, j12, -1, false);
        }
    }

    public static /* synthetic */ void l0(final E e11, final K.e eVar) {
        e11.getClass();
        e11.f43515j.i(new Runnable() { // from class: androidx.media3.exoplayer.v
            @Override // java.lang.Runnable
            public final void run() {
                E.k0(E.this, eVar);
            }
        });
    }

    public static void m0(E e11, final int i11) {
        e11.d1();
        e11.U0(1, 10, Integer.valueOf(i11));
        e11.U0(2, 10, Integer.valueOf(i11));
        e11.f43520m.h(21, new r.a() { // from class: t3.t
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((y.c) obj).c(i11);
            }
        });
    }

    static void z0(E e11, SurfaceTexture surfaceTexture) {
        e11.getClass();
        Surface surface = new Surface(surfaceTexture);
        e11.X0(surface);
        e11.f43490S = surface;
    }

    @Override // j3.y
    public final void D(boolean z11) {
        d1();
        a1(1, z11);
    }

    @Override // j3.y
    public final C7856b E() {
        d1();
        return this.f43502c0;
    }

    @Override // j3.y
    public final int F() {
        d1();
        return this.f43514i0.f43838n;
    }

    @Override // j3.y
    public final AbstractC7252H G() {
        d1();
        return this.f43514i0.f43825a;
    }

    @Override // j3.y
    public final Looper H() {
        return this.f43527t;
    }

    public final InterfaceC8064f I0() {
        return this.f43532y;
    }

    @Override // j3.y
    public final void J(TextureView textureView) {
        d1();
        if (textureView == null) {
            N();
            return;
        }
        T0();
        this.f43494W = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            m3.s.f("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.f43533z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            X0(null);
            S0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            X0(surface);
            this.f43490S = surface;
            S0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // j3.y
    public final y.a L() {
        d1();
        return this.f43487P;
    }

    @Override // j3.y
    public final j3.Q M() {
        d1();
        return this.f43510g0;
    }

    public final Looper M0() {
        return this.f43519l.y();
    }

    @Override // j3.y
    public final void N() {
        d1();
        T0();
        X0(null);
        S0(0, 0);
    }

    @Override // j3.y
    public final long O() {
        d1();
        return J0(this.f43514i0);
    }

    @Override // j3.y
    public final int P() {
        d1();
        return this.f43514i0.f43829e;
    }

    @Override // j3.y, androidx.media3.exoplayer.ExoPlayer
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final C5449k a() {
        d1();
        return this.f43514i0.f43830f;
    }

    @Override // j3.y
    public final int R() {
        d1();
        int L02 = L0(this.f43514i0);
        if (L02 == -1) {
            return 0;
        }
        return L02;
    }

    @Override // j3.y
    public final void S(final int i11) {
        d1();
        if (this.f43478G != i11) {
            this.f43478G = i11;
            this.f43519l.z0(i11);
            r.a<y.c> aVar = new r.a() { // from class: t3.r
                @Override // m3.r.a
                public final void invoke(Object obj) {
                    ((y.c) obj).d0(i11);
                }
            };
            m3.r<y.c> rVar = this.f43520m;
            rVar.e(8, aVar);
            Z0();
            rVar.d();
        }
    }

    @Override // j3.y
    public final void T(SurfaceView surfaceView) {
        d1();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        d1();
        if (holder == null || holder != this.f43491T) {
            return;
        }
        N();
    }

    @Override // j3.y
    public final boolean U() {
        d1();
        return this.f43479H;
    }

    @Override // j3.y
    public final j3.s W() {
        d1();
        return this.f43488Q;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void X(InterfaceC3018x interfaceC3018x, long j11) {
        d1();
        List singletonList = Collections.singletonList(interfaceC3018x);
        d1();
        V0(j11, singletonList, 0, false);
    }

    @Override // j3.y
    public final long Y() {
        d1();
        return this.f43529v;
    }

    @Override // j3.y
    public final void b(j3.x xVar) {
        d1();
        if (this.f43514i0.f43839o.equals(xVar)) {
            return;
        }
        g0 g10 = this.f43514i0.g(xVar);
        this.f43480I++;
        this.f43519l.w0(xVar);
        b1(g10, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void c(InterfaceC9928b interfaceC9928b) {
        interfaceC9928b.getClass();
        this.f43526s.G(interfaceC9928b);
    }

    @Override // j3.y
    public final j3.x d() {
        d1();
        return this.f43514i0.f43839o;
    }

    @Override // j3.y
    public final boolean e() {
        d1();
        return this.f43514i0.f43826b.b();
    }

    @Override // j3.y
    public final long f() {
        d1();
        return m3.N.g0(this.f43514i0.f43842r);
    }

    @Override // j3.AbstractC7265g
    protected final void f0(long j11, int i11, boolean z11) {
        d1();
        if (i11 == -1) {
            return;
        }
        G10.a.c(i11 >= 0);
        AbstractC7252H abstractC7252H = this.f43514i0.f43825a;
        if (abstractC7252H.isEmpty() || i11 < abstractC7252H.getWindowCount()) {
            this.f43526s.S();
            this.f43480I++;
            if (e()) {
                m3.s.f("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                K.e eVar = new K.e(this.f43514i0);
                eVar.b(1);
                l0(this.f43517k.f44097a, eVar);
                return;
            }
            g0 g0Var = this.f43514i0;
            int i12 = g0Var.f43829e;
            if (i12 == 3 || (i12 == 4 && !abstractC7252H.isEmpty())) {
                g0Var = this.f43514i0.h(2);
            }
            int R11 = R();
            g0 Q02 = Q0(g0Var, abstractC7252H, R0(abstractC7252H, i11, j11));
            this.f43519l.i0(abstractC7252H, i11, m3.N.Q(j11));
            b1(Q02, 0, true, 1, K0(Q02), R11, z11);
        }
    }

    @Override // j3.y
    public final void g(SurfaceView surfaceView) {
        d1();
        if (surfaceView instanceof L3.t) {
            T0();
            X0(surfaceView);
            W0(surfaceView.getHolder());
            return;
        }
        boolean z11 = surfaceView instanceof M3.j;
        b bVar = this.f43533z;
        if (z11) {
            T0();
            this.f43492U = (M3.j) surfaceView;
            h0 H02 = H0(this.f43472A);
            H02.h(10000);
            H02.g(this.f43492U);
            H02.f();
            this.f43492U.d(bVar);
            X0(this.f43492U.g());
            W0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        d1();
        if (holder == null) {
            N();
            return;
        }
        T0();
        this.f43493V = true;
        this.f43491T = holder;
        holder.addCallback(bVar);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            X0(null);
            S0(0, 0);
        } else {
            X0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            S0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // j3.y
    public final long getCurrentPosition() {
        d1();
        return m3.N.g0(K0(this.f43514i0));
    }

    @Override // j3.y
    public final long getDuration() {
        d1();
        if (!e()) {
            return q();
        }
        g0 g0Var = this.f43514i0;
        InterfaceC3018x.b bVar = g0Var.f43826b;
        AbstractC7252H abstractC7252H = g0Var.f43825a;
        Object obj = bVar.f8751a;
        AbstractC7252H.b bVar2 = this.f43522o;
        abstractC7252H.getPeriodByUid(obj, bVar2);
        return m3.N.g0(bVar2.a(bVar.f8752b, bVar.f8753c));
    }

    @Override // j3.y
    public final float getVolume() {
        d1();
        return this.f43498a0;
    }

    @Override // j3.y
    public final void h(C7255K c7255k) {
        C7255K c7255k2;
        d1();
        I3.E e11 = this.f43513i;
        e11.getClass();
        if (e11 instanceof I3.n) {
            C7255K m11 = m();
            if (this.f43483L) {
                this.f43484M = c7255k.f68974E;
                com.google.common.collect.A<Integer> a11 = this.f43485N.f98989a;
                C7255K.b a12 = c7255k.a();
                com.google.common.collect.f0<Integer> it = a11.iterator();
                while (it.hasNext()) {
                    a12.Q(it.next().intValue(), true);
                }
                c7255k2 = a12.F();
            } else {
                c7255k2 = c7255k;
            }
            if (!c7255k2.equals(e11.b())) {
                e11.k(c7255k2);
            }
            if (m11.equals(c7255k)) {
                return;
            }
            this.f43520m.h(19, new B90.F(c7255k, 5));
        }
    }

    @Override // j3.y
    public final C7256L i() {
        d1();
        return this.f43514i0.f43833i.f11825d;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final boolean isScrubbingModeEnabled() {
        d1();
        return this.f43483L;
    }

    @Override // j3.y
    public final void j(y.c cVar) {
        d1();
        cVar.getClass();
        this.f43520m.g(cVar);
    }

    @Override // j3.y
    public final int k() {
        d1();
        if (e()) {
            return this.f43514i0.f43826b.f8752b;
        }
        return -1;
    }

    @Override // j3.y
    public final C7255K m() {
        d1();
        C7255K b11 = this.f43513i.b();
        return this.f43483L ? b11.a().J(this.f43484M).F() : b11;
    }

    @Override // j3.y
    public final boolean n() {
        d1();
        return this.f43514i0.f43836l;
    }

    @Override // j3.y
    public final void o(final boolean z11) {
        d1();
        if (this.f43479H != z11) {
            this.f43479H = z11;
            this.f43519l.G0(z11);
            r.a<y.c> aVar = new r.a() { // from class: t3.s
                @Override // m3.r.a
                public final void invoke(Object obj) {
                    ((y.c) obj).D(z11);
                }
            };
            m3.r<y.c> rVar = this.f43520m;
            rVar.e(9, aVar);
            Z0();
            rVar.d();
        }
    }

    @Override // j3.y
    public final long p() {
        d1();
        return this.f43531x;
    }

    @Override // j3.y
    public final void prepare() {
        d1();
        g0 g0Var = this.f43514i0;
        if (g0Var.f43829e != 1) {
            return;
        }
        g0 f7 = g0Var.f(null);
        g0 P02 = P0(f7, f7.f43825a.isEmpty() ? 4 : 2);
        this.f43480I++;
        this.f43519l.V();
        b1(P02, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // j3.y
    public final int r() {
        d1();
        if (this.f43514i0.f43825a.isEmpty()) {
            return 0;
        }
        g0 g0Var = this.f43514i0;
        return g0Var.f43825a.getIndexOfPeriod(g0Var.f43826b.f8751a);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        m3.s.e("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + m3.N.f74290b + "] [" + j3.r.b() + "]");
        d1();
        this.f43473B.c();
        this.f43474C.a(false);
        this.f43475D.a(false);
        if (!this.f43519l.X()) {
            this.f43520m.h(10, new Ns.b(5));
        }
        this.f43520m.f();
        this.f43515j.c();
        this.f43528u.d(this.f43526s);
        g0 g0Var = this.f43514i0;
        if (g0Var.f43840p) {
            this.f43514i0 = g0Var.a();
        }
        g0 P02 = P0(this.f43514i0, 1);
        this.f43514i0 = P02;
        g0 c11 = P02.c(P02.f43826b);
        this.f43514i0 = c11;
        c11.f43841q = c11.f43843s;
        this.f43514i0.f43842r = 0L;
        this.f43526s.release();
        T0();
        Surface surface = this.f43490S;
        if (surface != null) {
            surface.release();
            this.f43490S = null;
        }
        this.f43502c0 = C7856b.f72636c;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void removeAnalyticsListener(InterfaceC9928b interfaceC9928b) {
        d1();
        interfaceC9928b.getClass();
        this.f43526s.J(interfaceC9928b);
    }

    @Override // j3.y
    public final void s(TextureView textureView) {
        d1();
        if (textureView == null || textureView != this.f43494W) {
            return;
        }
        N();
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        d1();
        U0(4, 15, imageOutput);
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setScrubbingModeEnabled(boolean z11) {
        C7255K F11;
        d1();
        if (z11 == this.f43483L) {
            return;
        }
        this.f43483L = z11;
        t3.H h11 = this.f43485N;
        if (!h11.f98989a.isEmpty()) {
            I3.E e11 = this.f43513i;
            e11.getClass();
            if (e11 instanceof I3.n) {
                C7255K b11 = e11.b();
                if (z11) {
                    this.f43484M = b11.f68974E;
                    C7255K.b a11 = b11.a();
                    com.google.common.collect.f0<Integer> it = h11.f98989a.iterator();
                    while (it.hasNext()) {
                        a11.Q(it.next().intValue(), true);
                    }
                    F11 = a11.F();
                } else {
                    F11 = b11.a().J(this.f43484M).F();
                    this.f43484M = null;
                }
                if (!F11.equals(b11)) {
                    e11.k(F11);
                }
            }
        }
        this.f43519l.B0(z11);
        g0 g0Var = this.f43514i0;
        a1(g0Var.f43837m, g0Var.f43836l);
    }

    @Override // j3.y
    public final void setVolume(float f7) {
        d1();
        final float h11 = m3.N.h(f7, 0.0f, 1.0f);
        if (this.f43498a0 == h11) {
            return;
        }
        this.f43498a0 = h11;
        this.f43519l.N0(h11);
        this.f43520m.h(22, new r.a() { // from class: t3.u
            @Override // m3.r.a
            public final void invoke(Object obj) {
                ((y.c) obj).onVolumeChanged(h11);
            }
        });
    }

    @Override // j3.y
    public final void stop() {
        d1();
        Y0(null);
        AbstractC5880y v11 = AbstractC5880y.v();
        long j11 = this.f43514i0.f43843s;
        this.f43502c0 = new C7856b(v11);
    }

    @Override // j3.y
    public final void t(y.c cVar) {
        cVar.getClass();
        this.f43520m.b(cVar);
    }

    @Override // j3.y
    public final int u() {
        d1();
        if (e()) {
            return this.f43514i0.f43826b.f8753c;
        }
        return -1;
    }

    @Override // j3.y
    public final long v() {
        d1();
        return this.f43530w;
    }

    @Override // j3.y
    public final int w() {
        d1();
        return this.f43478G;
    }

    @Override // j3.y
    public final long x() {
        d1();
        if (this.f43514i0.f43825a.isEmpty()) {
            return this.f43518k0;
        }
        g0 g0Var = this.f43514i0;
        if (g0Var.f43835k.f8754d != g0Var.f43826b.f8754d) {
            return m3.N.g0(g0Var.f43825a.getWindow(R(), this.f69060a).f68958m);
        }
        long j11 = g0Var.f43841q;
        if (this.f43514i0.f43835k.b()) {
            g0 g0Var2 = this.f43514i0;
            g0Var2.f43825a.getPeriodByUid(g0Var2.f43835k.f8751a, this.f43522o).d(this.f43514i0.f43835k.f8752b);
            j11 = 0;
        }
        g0 g0Var3 = this.f43514i0;
        AbstractC7252H abstractC7252H = g0Var3.f43825a;
        Object obj = g0Var3.f43835k.f8751a;
        AbstractC7252H.b bVar = this.f43522o;
        abstractC7252H.getPeriodByUid(obj, bVar);
        return m3.N.g0(j11 + bVar.f68941e);
    }

    @Override // j3.y
    public final void z(List list) {
        d1();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            arrayList.add(this.f43525r.createMediaSource((C7275q) list.get(i11)));
        }
        d1();
        V0(-9223372036854775807L, arrayList, -1, true);
    }
}
