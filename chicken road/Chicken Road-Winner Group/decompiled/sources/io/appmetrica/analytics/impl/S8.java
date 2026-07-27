package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class S8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6567a;

    /* renamed from: b, reason: collision with root package name */
    public String f6568b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f6569c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f6570d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f6571e;
    public final Long f;

    /* renamed from: g, reason: collision with root package name */
    public final C0772q7 f6572g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0569ib f6573h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f6574i;

    /* renamed from: j, reason: collision with root package name */
    public final String f6575j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f6576k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f6577l;

    /* renamed from: m, reason: collision with root package name */
    public final String f6578m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6579n;

    /* renamed from: o, reason: collision with root package name */
    public final N8 f6580o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0619ka f6581p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC0851t9 f6582q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f6583r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f6584s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f6585t;

    /* JADX WARN: Multi-variable type inference failed */
    public S8(ContentValues contentValues) {
        C0668m7 model = new C0694n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f6567a = model.a().j();
        this.f6568b = model.a().p();
        this.f6569c = model.c();
        this.f6570d = model.b();
        this.f6571e = model.a().k();
        this.f = model.d();
        this.f6572g = model.a().i();
        this.f6573h = model.e();
        this.f6574i = model.a().d();
        this.f6575j = model.a().f();
        this.f6576k = model.a().o();
        this.f6577l = model.a().c();
        this.f6578m = model.a().b();
        this.f6579n = model.a().m();
        N8 e3 = model.a().e();
        this.f6580o = e3 == null ? N8.a(null) : e3;
        EnumC0619ka h3 = model.a().h();
        this.f6581p = h3 == null ? EnumC0619ka.a(null) : h3;
        this.f6582q = model.a().n();
        this.f6583r = model.a().a();
        this.f6584s = model.a().l();
        this.f6585t = model.a().g();
    }
}
