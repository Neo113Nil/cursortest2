package A1;

import C1.C0101g;
import android.content.Context;
import android.os.Looper;

/* JADX INFO: renamed from: A1.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0047v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p151v2.p f569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D3.q f570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0044t f571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0044t f572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public D3.q f573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0044t f574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Looper f575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0101g f576i;
    public final int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f577k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H0 f578l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C0031m f579m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f580n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f581o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f582p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f583q;

    public C0047v(Context context) {
        C0044t c0044t = new C0044t(context, 0);
        C0044t c0044t2 = new C0044t(context, 1);
        C0044t c0044t3 = new C0044t(context, 2);
        C0046u c0046u = new C0046u(0);
        C0044t c0044t4 = new C0044t(context, 3);
        this.f568a = context;
        this.f570c = c0044t;
        this.f571d = c0044t2;
        this.f572e = c0044t3;
        this.f573f = c0046u;
        this.f574g = c0044t4;
        int i7 = p151v2.t.f17159a;
        Looper looperMyLooper = Looper.myLooper();
        this.f575h = looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper;
        this.f576i = C0101g.f1484x;
        this.j = 1;
        this.f577k = true;
        this.f578l = H0.f100c;
        this.f579m = new C0031m(0.97f, 1.03f, 1000L, 1.0E-7f, p151v2.t.E(20L), p151v2.t.E(500L), 0.999f);
        this.f569b = p151v2.p.f17151a;
        this.f580n = 500L;
        this.f581o = 2000L;
        this.f582p = true;
    }
}
