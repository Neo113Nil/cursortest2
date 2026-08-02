package F3;

import F3.C3000e;
import F3.C3010o;
import F3.InterfaceC3018x;
import F3.P;
import F3.Z;
import N3.C3659j;
import N3.C3662m;
import N3.H;
import N3.InterfaceC3665p;
import android.content.Context;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import com.google.common.collect.AbstractC5880y;
import j3.C7272n;
import j3.C7275q;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import p3.InterfaceC8846f;
import p3.j;

/* renamed from: F3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3010o implements InterfaceC3018x.a {

    /* renamed from: a, reason: collision with root package name */
    private final a f8699a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC8846f.a f8700b;

    /* renamed from: c, reason: collision with root package name */
    private k4.e f8701c;

    /* renamed from: d, reason: collision with root package name */
    private long f8702d;

    /* renamed from: e, reason: collision with root package name */
    private long f8703e;

    /* renamed from: f, reason: collision with root package name */
    private long f8704f;

    /* renamed from: g, reason: collision with root package name */
    private float f8705g;

    /* renamed from: h, reason: collision with root package name */
    private float f8706h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8707i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F3.o$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final N3.u f8708a;

        /* renamed from: d, reason: collision with root package name */
        private InterfaceC8846f.a f8711d;

        /* renamed from: f, reason: collision with root package name */
        private k4.e f8713f;

        /* renamed from: b, reason: collision with root package name */
        private final HashMap f8709b = new HashMap();

        /* renamed from: c, reason: collision with root package name */
        private final HashMap f8710c = new HashMap();

        /* renamed from: e, reason: collision with root package name */
        private boolean f8712e = true;

        public a(N3.u uVar, k4.e eVar) {
            this.f8708a = uVar;
            this.f8713f = eVar;
        }

        public static /* synthetic */ P.b a(a aVar, InterfaceC8846f.a aVar2) {
            return new P.b(aVar2, aVar.f8708a);
        }

        public final InterfaceC3018x.a b(int i11) throws ClassNotFoundException {
            O7.p pVar;
            O7.p pVar2;
            HashMap hashMap = this.f8710c;
            InterfaceC3018x.a aVar = (InterfaceC3018x.a) hashMap.get(Integer.valueOf(i11));
            if (aVar != null) {
                return aVar;
            }
            HashMap hashMap2 = this.f8709b;
            O7.p pVar3 = (O7.p) hashMap2.get(Integer.valueOf(i11));
            if (pVar3 == null) {
                final InterfaceC8846f.a aVar2 = this.f8711d;
                aVar2.getClass();
                if (i11 == 0) {
                    final Class<? extends U> asSubclass = Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(InterfaceC3018x.a.class);
                    pVar = new O7.p() { // from class: F3.j
                        @Override // O7.p
                        public final Object get() {
                            return C3010o.e(asSubclass, aVar2);
                        }
                    };
                } else if (i11 == 1) {
                    final Class<? extends U> asSubclass2 = Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(InterfaceC3018x.a.class);
                    pVar = new O7.p() { // from class: F3.k
                        @Override // O7.p
                        public final Object get() {
                            return C3010o.e(asSubclass2, aVar2);
                        }
                    };
                } else if (i11 != 2) {
                    if (i11 == 3) {
                        final Class<? extends U> asSubclass3 = Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(InterfaceC3018x.a.class);
                        pVar2 = new O7.p() { // from class: F3.m
                            @Override // O7.p
                            public final Object get() {
                                try {
                                    return (InterfaceC3018x.a) asSubclass3.getConstructor(new Class[0]).newInstance(new Object[0]);
                                } catch (Exception e11) {
                                    throw new IllegalStateException(e11);
                                }
                            }
                        };
                    } else {
                        if (i11 != 4) {
                            throw new IllegalArgumentException(Ej.b.a(i11, "Unrecognized contentType: "));
                        }
                        pVar2 = new O7.p() { // from class: F3.n
                            @Override // O7.p
                            public final Object get() {
                                return C3010o.a.a(C3010o.a.this, aVar2);
                            }
                        };
                    }
                    pVar3 = pVar2;
                    hashMap2.put(Integer.valueOf(i11), pVar3);
                } else {
                    final Class asSubclass4 = HlsMediaSource.Factory.class.asSubclass(InterfaceC3018x.a.class);
                    pVar = new O7.p() { // from class: F3.l
                        @Override // O7.p
                        public final Object get() {
                            return C3010o.e(asSubclass4, aVar2);
                        }
                    };
                }
                pVar3 = pVar;
                hashMap2.put(Integer.valueOf(i11), pVar3);
            }
            InterfaceC3018x.a aVar3 = (InterfaceC3018x.a) pVar3.get();
            aVar3.a(this.f8713f);
            aVar3.c(this.f8712e);
            aVar3.b();
            hashMap.put(Integer.valueOf(i11), aVar3);
            return aVar3;
        }

        public final void c() {
            this.f8708a.b();
        }

        public final void d(InterfaceC8846f.a aVar) {
            if (aVar != this.f8711d) {
                this.f8711d = aVar;
                this.f8709b.clear();
                this.f8710c.clear();
            }
        }

        public final void e(D3.g gVar) {
            Iterator it = this.f8710c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC3018x.a) it.next()).setDrmSessionManagerProvider(gVar);
            }
        }

        public final void f() {
            N3.u uVar = this.f8708a;
            if (uVar instanceof C3662m) {
                ((C3662m) uVar).g();
            }
        }

        public final void g(boolean z11) {
            this.f8712e = z11;
            this.f8708a.c(z11);
            Iterator it = this.f8710c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC3018x.a) it.next()).c(z11);
            }
        }

        public final void h(k4.e eVar) {
            this.f8713f = eVar;
            this.f8708a.a(eVar);
            Iterator it = this.f8710c.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC3018x.a) it.next()).a(eVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F3.o$b */
    /* loaded from: classes8.dex */
    static final class b implements InterfaceC3665p {

        /* renamed from: a, reason: collision with root package name */
        private final C7272n f8714a;

        public b(C7272n c7272n) {
            this.f8714a = c7272n;
        }

        @Override // N3.InterfaceC3665p
        public final void a(long j11, long j12) {
        }

        @Override // N3.InterfaceC3665p
        public final void b(N3.r rVar) {
            N3.M track = rVar.track(0, 3);
            rVar.seekMap(new H.b(-9223372036854775807L));
            rVar.endTracks();
            C7272n c7272n = this.f8714a;
            C7272n.a a11 = c7272n.a();
            a11.y0("text/x-unknown");
            a11.U(c7272n.f69127o);
            track.a(a11.P());
        }

        @Override // N3.InterfaceC3665p
        public final boolean d(N3.q qVar) {
            return true;
        }

        @Override // N3.InterfaceC3665p
        public final int f(N3.q qVar, N3.G g10) throws IOException {
            return ((C3659j) qVar).c(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        @Override // N3.InterfaceC3665p
        public final void release() {
        }
    }

    public C3010o(Context context) {
        this(new j.a(context), new C3662m());
    }

    public static /* synthetic */ InterfaceC3665p[] d(C3010o c3010o, C7272n c7272n) {
        return new InterfaceC3665p[]{c3010o.f8701c.e(c7272n) ? new k4.l(c3010o.f8701c.b(c7272n)) : new b(c7272n)};
    }

    static InterfaceC3018x.a e(Class cls, InterfaceC8846f.a aVar) {
        try {
            return (InterfaceC3018x.a) cls.getConstructor(InterfaceC8846f.a.class).newInstance(aVar);
        } catch (Exception e11) {
            throw new IllegalStateException(e11);
        }
    }

    @Override // F3.InterfaceC3018x.a
    public final void a(k4.e eVar) {
        this.f8701c = eVar;
        this.f8699a.h(eVar);
    }

    @Override // F3.InterfaceC3018x.a
    public final void b() {
        this.f8699a.c();
    }

    @Override // F3.InterfaceC3018x.a
    @Deprecated
    public final void c(boolean z11) {
        this.f8707i = z11;
        this.f8699a.g(z11);
    }

    @Override // F3.InterfaceC3018x.a
    public final InterfaceC3018x createMediaSource(C7275q c7275q) {
        c7275q.f69184b.getClass();
        C7275q.f fVar = c7275q.f69184b;
        String scheme = fVar.f69240a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        String str = fVar.f69241b;
        if (Objects.equals(str, "application/x-image-uri")) {
            int i11 = m3.N.f74289a;
            throw null;
        }
        int J11 = m3.N.J(fVar.f69240a, str);
        long j11 = fVar.f69247h;
        a aVar = this.f8699a;
        if (j11 != -9223372036854775807L) {
            aVar.f();
        }
        try {
            InterfaceC3018x.a b11 = aVar.b(J11);
            C7275q.e eVar = c7275q.f69185c;
            C7275q.e.a a11 = eVar.a();
            if (eVar.f69230a == -9223372036854775807L) {
                a11.k(this.f8702d);
            }
            if (eVar.f69233d == -3.4028235E38f) {
                a11.j(this.f8705g);
            }
            if (eVar.f69234e == -3.4028235E38f) {
                a11.h(this.f8706h);
            }
            if (eVar.f69231b == -9223372036854775807L) {
                a11.i(this.f8703e);
            }
            if (eVar.f69232c == -9223372036854775807L) {
                a11.g(this.f8704f);
            }
            C7275q.e f7 = a11.f();
            if (!f7.equals(eVar)) {
                C7275q.a a12 = c7275q.a();
                a12.c(f7);
                c7275q = a12.a();
            }
            InterfaceC3018x createMediaSource = b11.createMediaSource(c7275q);
            AbstractC5880y<C7275q.i> abstractC5880y = c7275q.f69184b.f69245f;
            if (!abstractC5880y.isEmpty()) {
                InterfaceC3018x[] interfaceC3018xArr = new InterfaceC3018x[abstractC5880y.size() + 1];
                interfaceC3018xArr[0] = createMediaSource;
                for (int i12 = 0; i12 < abstractC5880y.size(); i12++) {
                    if (this.f8707i) {
                        C7272n.a aVar2 = new C7272n.a();
                        aVar2.y0(abstractC5880y.get(i12).f69250b);
                        aVar2.n0(abstractC5880y.get(i12).f69251c);
                        aVar2.A0(abstractC5880y.get(i12).f69252d);
                        aVar2.w0(abstractC5880y.get(i12).f69253e);
                        aVar2.l0(abstractC5880y.get(i12).f69254f);
                        aVar2.j0(abstractC5880y.get(i12).f69255g);
                        final C7272n P11 = aVar2.P();
                        P.b bVar = new P.b(this.f8700b, new N3.u() { // from class: F3.i
                            @Override // N3.u
                            public final InterfaceC3665p[] e() {
                                return C3010o.d(C3010o.this, P11);
                            }
                        });
                        if (this.f8701c.e(P11)) {
                            C7272n.a a13 = P11.a();
                            a13.y0("application/x-media3-cues");
                            a13.U(P11.f69127o);
                            a13.Y(this.f8701c.a(P11));
                            P11 = a13.P();
                        }
                        bVar.e(P11);
                        String uri = abstractC5880y.get(i12).f69249a.toString();
                        C7275q.a aVar3 = new C7275q.a();
                        aVar3.j(uri);
                        interfaceC3018xArr[i12 + 1] = bVar.createMediaSource(aVar3.a());
                    } else {
                        interfaceC3018xArr[i12 + 1] = new Z.a(this.f8700b).a(abstractC5880y.get(i12));
                    }
                }
                createMediaSource = new I(interfaceC3018xArr);
            }
            C7275q.c cVar = c7275q.f69187e;
            long j12 = cVar.f69202a;
            boolean z11 = cVar.f69205d;
            long j13 = cVar.f69203b;
            if (j12 == 0 && j13 == Long.MIN_VALUE && !z11) {
                return createMediaSource;
            }
            C3000e.a aVar4 = new C3000e.a(createMediaSource);
            aVar4.n(j12);
            aVar4.l(j13);
            aVar4.k(!cVar.f69206e);
            aVar4.i(cVar.f69204c);
            aVar4.m(z11);
            aVar4.j(cVar.f69207f);
            return aVar4.h();
        } catch (ClassNotFoundException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public final void f(InterfaceC8846f.a aVar) {
        this.f8700b = aVar;
        this.f8699a.d(aVar);
    }

    @Override // F3.InterfaceC3018x.a
    public final InterfaceC3018x.a setDrmSessionManagerProvider(w3.k kVar) {
        G10.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f8699a.e((D3.g) kVar);
        return this;
    }

    public C3010o(InterfaceC8846f.a aVar, N3.u uVar) {
        this.f8700b = aVar;
        k4.e eVar = new k4.e();
        this.f8701c = eVar;
        a aVar2 = new a(uVar, eVar);
        this.f8699a = aVar2;
        aVar2.d(aVar);
        this.f8702d = -9223372036854775807L;
        this.f8703e = -9223372036854775807L;
        this.f8704f = -9223372036854775807L;
        this.f8705g = -3.4028235E38f;
        this.f8706h = -3.4028235E38f;
        this.f8707i = true;
    }
}
