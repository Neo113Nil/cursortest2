package androidx.media3.exoplayer.hls;

import B0.d2;
import E0.C2946s0;
import F3.AbstractC2996a;
import F3.F;
import F3.InterfaceC3017w;
import F3.InterfaceC3018x;
import F3.X;
import android.os.Looper;
import android.os.SystemClock;
import com.google.common.collect.AbstractC5880y;
import j3.C7251G;
import j3.C7275q;
import j3.r;
import java.io.IOException;
import java.util.List;
import m3.N;
import p3.InterfaceC8846f;
import p3.z;
import u3.P;
import w3.i;
import x3.C10652a;
import z3.C10977a;
import z3.C10978b;
import z3.e;

/* loaded from: classes8.dex */
public final class HlsMediaSource extends AbstractC2996a {

    /* renamed from: a, reason: collision with root package name */
    private final c f43871a;

    /* renamed from: b, reason: collision with root package name */
    private final C10652a f43872b;

    /* renamed from: c, reason: collision with root package name */
    private final C2946s0 f43873c;

    /* renamed from: d, reason: collision with root package name */
    private final w3.j f43874d;

    /* renamed from: e, reason: collision with root package name */
    private final J3.h f43875e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f43876f;

    /* renamed from: g, reason: collision with root package name */
    private final int f43877g;

    /* renamed from: h, reason: collision with root package name */
    private final C10978b f43878h;

    /* renamed from: i, reason: collision with root package name */
    private final long f43879i;

    /* renamed from: j, reason: collision with root package name */
    private C7275q.e f43880j;

    /* renamed from: k, reason: collision with root package name */
    private z f43881k;

    /* renamed from: l, reason: collision with root package name */
    private C7275q f43882l;

    public static final class Factory implements InterfaceC3018x.a {

        /* renamed from: a, reason: collision with root package name */
        private final C10652a f43883a;

        /* renamed from: b, reason: collision with root package name */
        private c f43884b;

        /* renamed from: c, reason: collision with root package name */
        private k4.e f43885c;

        /* renamed from: h, reason: collision with root package name */
        private w3.k f43890h = new w3.f();

        /* renamed from: e, reason: collision with root package name */
        private C10977a f43887e = new C10977a();

        /* renamed from: f, reason: collision with root package name */
        private Ej.b f43888f = C10978b.f106990o;

        /* renamed from: i, reason: collision with root package name */
        private J3.h f43891i = new J3.h();

        /* renamed from: g, reason: collision with root package name */
        private C2946s0 f43889g = new C2946s0();

        /* renamed from: k, reason: collision with root package name */
        private int f43893k = 1;

        /* renamed from: l, reason: collision with root package name */
        private long f43894l = -9223372036854775807L;

        /* renamed from: j, reason: collision with root package name */
        private boolean f43892j = true;

        /* renamed from: d, reason: collision with root package name */
        private boolean f43886d = true;

        public Factory(InterfaceC8846f.a aVar) {
            this.f43883a = new C10652a(aVar);
        }

        @Override // F3.InterfaceC3018x.a
        public final void a(k4.e eVar) {
            this.f43885c = eVar;
        }

        @Override // F3.InterfaceC3018x.a
        public final void b() {
        }

        @Override // F3.InterfaceC3018x.a
        @Deprecated
        public final void c(boolean z11) {
            this.f43886d = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v4, types: [z3.d] */
        @Override // F3.InterfaceC3018x.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final HlsMediaSource createMediaSource(C7275q c7275q) {
            c7275q.f69184b.getClass();
            if (this.f43884b == null) {
                this.f43884b = new c();
            }
            k4.e eVar = this.f43885c;
            if (eVar != null) {
                this.f43884b.e(eVar);
            }
            this.f43884b.c(this.f43886d);
            this.f43884b.getClass();
            c cVar = this.f43884b;
            C10977a c10977a = this.f43887e;
            List<C7251G> list = c7275q.f69184b.f69243d;
            if (!list.isEmpty()) {
                c10977a = new z3.d(c10977a, list);
            }
            w3.j a11 = this.f43890h.a(c7275q);
            J3.h hVar = this.f43891i;
            this.f43888f.getClass();
            C10652a c10652a = this.f43883a;
            return new HlsMediaSource(c7275q, c10652a, cVar, this.f43889g, a11, hVar, new C10978b(c10652a, hVar, c10977a), this.f43894l, this.f43892j, this.f43893k);
        }

        @Override // F3.InterfaceC3018x.a
        public final InterfaceC3018x.a setDrmSessionManagerProvider(w3.k kVar) {
            G10.a.f(kVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
            this.f43890h = kVar;
            return this;
        }
    }

    static {
        r.a("media3.exoplayer.hls");
    }

    HlsMediaSource(C7275q c7275q, C10652a c10652a, c cVar, C2946s0 c2946s0, w3.j jVar, J3.h hVar, C10978b c10978b, long j11, boolean z11, int i11) {
        this.f43882l = c7275q;
        this.f43880j = c7275q.f69185c;
        this.f43872b = c10652a;
        this.f43871a = cVar;
        this.f43873c = c2946s0;
        this.f43874d = jVar;
        this.f43875e = hVar;
        this.f43878h = c10978b;
        this.f43879i = j11;
        this.f43876f = z11;
        this.f43877g = i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static e.c c(AbstractC5880y abstractC5880y, long j11) {
        e.c cVar = null;
        for (int i11 = 0; i11 < abstractC5880y.size(); i11++) {
            e.c cVar2 = (e.c) abstractC5880y.get(i11);
            long j12 = cVar2.f107091e;
            if (j12 > j11 || !cVar2.f107080l) {
                if (j12 > j11) {
                    break;
                }
            } else {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    @Override // F3.InterfaceC3018x
    public final InterfaceC3017w createPeriod(InterfaceC3018x.b bVar, J3.b bVar2, long j11) {
        F.a createEventDispatcher = createEventDispatcher(bVar);
        i.a createDrmEventDispatcher = createDrmEventDispatcher(bVar);
        z zVar = this.f43881k;
        P playerId = getPlayerId();
        return new i(this.f43871a, this.f43878h, this.f43872b, zVar, this.f43874d, createDrmEventDispatcher, this.f43875e, createEventDispatcher, bVar2, this.f43873c, this.f43876f, this.f43877g, playerId);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(z3.e eVar) {
        X x11;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z11;
        boolean z12 = eVar.f107034p;
        long j16 = eVar.f107026h;
        long g02 = z12 ? N.g0(j16) : -9223372036854775807L;
        int i11 = eVar.f107022d;
        long j17 = (i11 == 2 || i11 == 1) ? g02 : -9223372036854775807L;
        C10978b c10978b = this.f43878h;
        c10978b.s().getClass();
        d2 d2Var = new d2();
        boolean v11 = c10978b.v();
        long j18 = eVar.f107039u;
        long j19 = 0;
        AbstractC5880y abstractC5880y = eVar.f107036r;
        boolean z13 = eVar.f107025g;
        long j21 = eVar.f107023e;
        if (v11) {
            long r11 = j16 - c10978b.r();
            boolean z14 = eVar.f107033o;
            long j22 = z14 ? r11 + j18 : -9223372036854775807L;
            if (eVar.f107034p) {
                int i12 = N.f74289a;
                j11 = j21;
                long j23 = this.f43879i;
                j12 = N.Q(j23 == -9223372036854775807L ? System.currentTimeMillis() : SystemClock.elapsedRealtime() + j23) - (j16 + j18);
            } else {
                j11 = j21;
                j12 = 0;
            }
            long j24 = this.f43880j.f69230a;
            e.g gVar = eVar.f107040v;
            if (j24 != -9223372036854775807L) {
                j14 = N.Q(j24);
            } else {
                if (j11 != -9223372036854775807L) {
                    j13 = j18 - j11;
                } else {
                    long j25 = gVar.f107101d;
                    if (j25 == -9223372036854775807L || eVar.f107032n == -9223372036854775807L) {
                        j13 = gVar.f107100c;
                        if (j13 == -9223372036854775807L) {
                            j13 = eVar.f107031m * 3;
                        }
                    } else {
                        j13 = j25;
                    }
                }
                j14 = j13 + j12;
            }
            long j26 = j18 + j12;
            long j27 = N.j(j14, j12, j26);
            C7275q.e eVar2 = getMediaItem().f69185c;
            if (eVar2.f69233d == -3.4028235E38f && eVar2.f69234e == -3.4028235E38f) {
                j15 = j27;
                if (gVar.f107100c == -9223372036854775807L && gVar.f107101d == -9223372036854775807L) {
                    z11 = true;
                    C7275q.e.a aVar = new C7275q.e.a();
                    aVar.k(N.g0(j15));
                    aVar.j(!z11 ? 1.0f : this.f43880j.f69233d);
                    aVar.h(z11 ? 1.0f : this.f43880j.f69234e);
                    C7275q.e f7 = aVar.f();
                    this.f43880j = f7;
                    long Q11 = j11 == -9223372036854775807L ? j11 : j26 - N.Q(f7.f69230a);
                    if (!z13) {
                        e.c c11 = c(eVar.f107037s, Q11);
                        if (c11 != null) {
                            Q11 = c11.f107091e;
                        } else {
                            if (!abstractC5880y.isEmpty()) {
                                e.C2323e c2323e = (e.C2323e) abstractC5880y.get(N.b(abstractC5880y, Long.valueOf(Q11), true));
                                e.c c12 = c(c2323e.f107086m, Q11);
                                Q11 = c12 != null ? c12.f107091e : c2323e.f107091e;
                            }
                            x11 = new X(j17, g02, j22, eVar.f107039u, r11, j19, true, !z14, i11 != 2 && eVar.f107024f, d2Var, getMediaItem(), this.f43880j);
                        }
                    }
                    j19 = Q11;
                    x11 = new X(j17, g02, j22, eVar.f107039u, r11, j19, true, !z14, i11 != 2 && eVar.f107024f, d2Var, getMediaItem(), this.f43880j);
                }
            } else {
                j15 = j27;
            }
            z11 = false;
            C7275q.e.a aVar2 = new C7275q.e.a();
            aVar2.k(N.g0(j15));
            aVar2.j(!z11 ? 1.0f : this.f43880j.f69233d);
            aVar2.h(z11 ? 1.0f : this.f43880j.f69234e);
            C7275q.e f72 = aVar2.f();
            this.f43880j = f72;
            if (j11 == -9223372036854775807L) {
            }
            if (!z13) {
            }
            j19 = Q11;
            x11 = new X(j17, g02, j22, eVar.f107039u, r11, j19, true, !z14, i11 != 2 && eVar.f107024f, d2Var, getMediaItem(), this.f43880j);
        } else {
            long j28 = (j21 == -9223372036854775807L || abstractC5880y.isEmpty()) ? 0L : (z13 || j21 == j18) ? j21 : ((e.C2323e) abstractC5880y.get(N.b(abstractC5880y, Long.valueOf(j21), true))).f107091e;
            C7275q mediaItem = getMediaItem();
            long j29 = eVar.f107039u;
            x11 = new X(j17, g02, j29, j29, 0L, j28, true, false, true, d2Var, mediaItem, null);
        }
        refreshSourceInfo(x11);
    }

    @Override // F3.InterfaceC3018x
    public final synchronized C7275q getMediaItem() {
        return this.f43882l;
    }

    @Override // F3.InterfaceC3018x
    public final void maybeThrowSourceInfoRefreshError() throws IOException {
        this.f43878h.y();
    }

    @Override // F3.AbstractC2996a
    protected final void prepareSourceInternal(z zVar) {
        this.f43881k = zVar;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        P playerId = getPlayerId();
        w3.j jVar = this.f43874d;
        jVar.c(myLooper, playerId);
        jVar.prepare();
        F.a createEventDispatcher = createEventDispatcher(null);
        C7275q.f fVar = getMediaItem().f69184b;
        fVar.getClass();
        this.f43878h.B(fVar.f69240a, createEventDispatcher, this);
    }

    @Override // F3.InterfaceC3018x
    public final void releasePeriod(InterfaceC3017w interfaceC3017w) {
        ((i) interfaceC3017w).k();
    }

    @Override // F3.AbstractC2996a
    protected final void releaseSourceInternal() {
        this.f43878h.C();
        this.f43874d.release();
    }

    @Override // F3.InterfaceC3018x
    public final synchronized void updateMediaItem(C7275q c7275q) {
        this.f43882l = c7275q;
    }
}
