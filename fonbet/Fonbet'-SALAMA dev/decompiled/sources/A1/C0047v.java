package A1;

import C1.C0101g;
import android.content.Context;
import android.os.Looper;

/* renamed from: A1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0047v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f568a;

    /* renamed from: b, reason: collision with root package name */
    public final v2.p f569b;

    /* renamed from: c, reason: collision with root package name */
    public D3.q f570c;

    /* renamed from: d, reason: collision with root package name */
    public final C0044t f571d;

    /* renamed from: e, reason: collision with root package name */
    public final C0044t f572e;

    /* renamed from: f, reason: collision with root package name */
    public D3.q f573f;

    /* renamed from: g, reason: collision with root package name */
    public final C0044t f574g;

    /* renamed from: h, reason: collision with root package name */
    public final Looper f575h;

    /* renamed from: i, reason: collision with root package name */
    public final C0101g f576i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f577k;

    /* renamed from: l, reason: collision with root package name */
    public final H0 f578l;

    /* renamed from: m, reason: collision with root package name */
    public C0031m f579m;

    /* renamed from: n, reason: collision with root package name */
    public final long f580n;

    /* renamed from: o, reason: collision with root package name */
    public final long f581o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f582p;

    /* renamed from: q, reason: collision with root package name */
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
        int i7 = v2.t.f17153a;
        Looper myLooper = Looper.myLooper();
        this.f575h = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f576i = C0101g.f1484x;
        this.j = 1;
        this.f577k = true;
        this.f578l = H0.f100c;
        this.f579m = new C0031m(0.97f, 1.03f, 1000L, 1.0E-7f, v2.t.E(20L), v2.t.E(500L), 0.999f);
        this.f569b = v2.p.f17145a;
        this.f580n = 500L;
        this.f581o = 2000L;
        this.f582p = true;
    }
}
