package io.appmetrica.analytics.impl;

import android.content.ContentValues;

/* loaded from: classes.dex */
public final class S8 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7434a;

    /* renamed from: b, reason: collision with root package name */
    public String f7435b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f7436c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f7437d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f7438e;

    /* renamed from: f, reason: collision with root package name */
    public final Long f7439f;

    /* renamed from: g, reason: collision with root package name */
    public final C0921q7 f7440g;

    /* renamed from: h, reason: collision with root package name */
    public final EnumC0718ib f7441h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f7442i;

    /* renamed from: j, reason: collision with root package name */
    public final String f7443j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f7444k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f7445l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7446m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7447n;

    /* renamed from: o, reason: collision with root package name */
    public final N8 f7448o;

    /* renamed from: p, reason: collision with root package name */
    public final EnumC0768ka f7449p;

    /* renamed from: q, reason: collision with root package name */
    public final EnumC1000t9 f7450q;

    /* renamed from: r, reason: collision with root package name */
    public final Boolean f7451r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f7452s;

    /* renamed from: t, reason: collision with root package name */
    public final byte[] f7453t;

    /* JADX WARN: Multi-variable type inference failed */
    public S8(ContentValues contentValues) {
        C0817m7 model = new C0843n7(null, 1, 0 == true ? 1 : 0).toModel(contentValues);
        this.f7434a = model.a().j();
        this.f7435b = model.a().p();
        this.f7436c = model.c();
        this.f7437d = model.b();
        this.f7438e = model.a().k();
        this.f7439f = model.d();
        this.f7440g = model.a().i();
        this.f7441h = model.e();
        this.f7442i = model.a().d();
        this.f7443j = model.a().f();
        this.f7444k = model.a().o();
        this.f7445l = model.a().c();
        this.f7446m = model.a().b();
        this.f7447n = model.a().m();
        N8 e3 = model.a().e();
        this.f7448o = e3 == null ? N8.a(null) : e3;
        EnumC0768ka h3 = model.a().h();
        this.f7449p = h3 == null ? EnumC0768ka.a(null) : h3;
        this.f7450q = model.a().n();
        this.f7451r = model.a().a();
        this.f7452s = model.a().l();
        this.f7453t = model.a().g();
    }
}
