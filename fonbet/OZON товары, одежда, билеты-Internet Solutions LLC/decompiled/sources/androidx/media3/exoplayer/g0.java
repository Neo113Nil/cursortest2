package androidx.media3.exoplayer;

import F3.InterfaceC3018x;
import android.os.SystemClock;
import com.google.common.collect.AbstractC5880y;
import j3.AbstractC7252H;
import java.util.List;

/* loaded from: classes.dex */
final class g0 {

    /* renamed from: u, reason: collision with root package name */
    private static final InterfaceC3018x.b f43824u = new InterfaceC3018x.b(new Object());

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC7252H f43825a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC3018x.b f43826b;

    /* renamed from: c, reason: collision with root package name */
    public final long f43827c;

    /* renamed from: d, reason: collision with root package name */
    public final long f43828d;

    /* renamed from: e, reason: collision with root package name */
    public final int f43829e;

    /* renamed from: f, reason: collision with root package name */
    public final C5449k f43830f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f43831g;

    /* renamed from: h, reason: collision with root package name */
    public final F3.d0 f43832h;

    /* renamed from: i, reason: collision with root package name */
    public final I3.F f43833i;

    /* renamed from: j, reason: collision with root package name */
    public final List<j3.t> f43834j;

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC3018x.b f43835k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f43836l;

    /* renamed from: m, reason: collision with root package name */
    public final int f43837m;

    /* renamed from: n, reason: collision with root package name */
    public final int f43838n;

    /* renamed from: o, reason: collision with root package name */
    public final j3.x f43839o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f43840p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f43841q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f43842r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f43843s;

    /* renamed from: t, reason: collision with root package name */
    public volatile long f43844t;

    public g0(AbstractC7252H abstractC7252H, InterfaceC3018x.b bVar, long j11, long j12, int i11, C5449k c5449k, boolean z11, F3.d0 d0Var, I3.F f7, List<j3.t> list, InterfaceC3018x.b bVar2, boolean z12, int i12, int i13, j3.x xVar, long j13, long j14, long j15, long j16, boolean z13) {
        this.f43825a = abstractC7252H;
        this.f43826b = bVar;
        this.f43827c = j11;
        this.f43828d = j12;
        this.f43829e = i11;
        this.f43830f = c5449k;
        this.f43831g = z11;
        this.f43832h = d0Var;
        this.f43833i = f7;
        this.f43834j = list;
        this.f43835k = bVar2;
        this.f43836l = z12;
        this.f43837m = i12;
        this.f43838n = i13;
        this.f43839o = xVar;
        this.f43841q = j13;
        this.f43842r = j14;
        this.f43843s = j15;
        this.f43844t = j16;
        this.f43840p = z13;
    }

    public static g0 k(I3.F f7) {
        AbstractC7252H abstractC7252H = AbstractC7252H.EMPTY;
        InterfaceC3018x.b bVar = f43824u;
        return new g0(abstractC7252H, bVar, -9223372036854775807L, 0L, 1, null, false, F3.d0.f8643d, f7, AbstractC5880y.v(), bVar, false, 1, 0, j3.x.f69344d, 0L, 0L, 0L, 0L, false);
    }

    public static InterfaceC3018x.b l() {
        return f43824u;
    }

    public final g0 a() {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, m(), SystemClock.elapsedRealtime(), this.f43840p);
    }

    public final g0 b(boolean z11) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, z11, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 c(InterfaceC3018x.b bVar) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, bVar, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 d(InterfaceC3018x.b bVar, long j11, long j12, long j13, long j14, F3.d0 d0Var, I3.F f7, List<j3.t> list) {
        return new g0(this.f43825a, bVar, j12, j13, this.f43829e, this.f43830f, this.f43831g, d0Var, f7, list, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, j14, j11, SystemClock.elapsedRealtime(), this.f43840p);
    }

    public final g0 e(int i11, int i12, boolean z11) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, z11, i11, i12, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 f(C5449k c5449k) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, c5449k, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 g(j3.x xVar) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, xVar, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 h(int i11) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, i11, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final g0 i(boolean z11) {
        return new g0(this.f43825a, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, z11);
    }

    public final g0 j(AbstractC7252H abstractC7252H) {
        return new g0(abstractC7252H, this.f43826b, this.f43827c, this.f43828d, this.f43829e, this.f43830f, this.f43831g, this.f43832h, this.f43833i, this.f43834j, this.f43835k, this.f43836l, this.f43837m, this.f43838n, this.f43839o, this.f43841q, this.f43842r, this.f43843s, this.f43844t, this.f43840p);
    }

    public final long m() {
        long j11;
        long j12;
        if (!n()) {
            return this.f43843s;
        }
        do {
            j11 = this.f43844t;
            j12 = this.f43843s;
        } while (j11 != this.f43844t);
        return m3.N.Q(m3.N.g0(j12) + ((long) ((SystemClock.elapsedRealtime() - j11) * this.f43839o.f69345a)));
    }

    public final boolean n() {
        return this.f43829e == 3 && this.f43836l && this.f43838n == 0;
    }
}
