package I5;

import android.graphics.PointF;

/* loaded from: classes.dex */
public final class l implements J5.c {

    /* renamed from: a, reason: collision with root package name */
    private final e f11980a;

    /* renamed from: b, reason: collision with root package name */
    private final m<PointF, PointF> f11981b;

    /* renamed from: c, reason: collision with root package name */
    private final g f11982c;

    /* renamed from: d, reason: collision with root package name */
    private final b f11983d;

    /* renamed from: e, reason: collision with root package name */
    private final d f11984e;

    /* renamed from: f, reason: collision with root package name */
    private final b f11985f;

    /* renamed from: g, reason: collision with root package name */
    private final b f11986g;

    /* renamed from: h, reason: collision with root package name */
    private final b f11987h;

    /* renamed from: i, reason: collision with root package name */
    private final b f11988i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f11989j;

    public l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // J5.c
    public final D5.c a(com.airbnb.lottie.g gVar, B5.g gVar2, K5.b bVar) {
        return null;
    }

    public final e b() {
        return this.f11980a;
    }

    public final b c() {
        return this.f11988i;
    }

    public final d d() {
        return this.f11984e;
    }

    public final m<PointF, PointF> e() {
        return this.f11981b;
    }

    public final b f() {
        return this.f11983d;
    }

    public final g g() {
        return this.f11982c;
    }

    public final b h() {
        return this.f11985f;
    }

    public final b i() {
        return this.f11986g;
    }

    public final b j() {
        return this.f11987h;
    }

    public final boolean k() {
        return this.f11989j;
    }

    public final void l(boolean z11) {
        this.f11989j = z11;
    }

    public l(e eVar, m<PointF, PointF> mVar, g gVar, b bVar, d dVar, b bVar2, b bVar3, b bVar4, b bVar5) {
        this.f11989j = false;
        this.f11980a = eVar;
        this.f11981b = mVar;
        this.f11982c = gVar;
        this.f11983d = bVar;
        this.f11984e = dVar;
        this.f11987h = bVar2;
        this.f11988i = bVar3;
        this.f11985f = bVar4;
        this.f11986g = bVar5;
    }
}
