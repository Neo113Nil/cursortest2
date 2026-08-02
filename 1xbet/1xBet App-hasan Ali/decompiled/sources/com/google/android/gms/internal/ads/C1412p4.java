package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.p4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1412p4 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f14939a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f14940b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f14941c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f14942d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f14943e;
    public byte[] f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f14944g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f14945h;
    public Integer i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f14946j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f14947k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f14948l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f14949m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f14950n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f14951o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f14952p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f14953q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f14954r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f14955s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f14956t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f14957u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f14958v;

    /* renamed from: w, reason: collision with root package name */
    public Integer f14959w;

    /* renamed from: x, reason: collision with root package name */
    public final C1761wv f14960x;

    public /* synthetic */ C1412p4(P4 p42) {
        this.f14939a = p42.f11041a;
        this.f14940b = p42.f11042b;
        this.f14941c = p42.f11043c;
        this.f14942d = p42.f11044d;
        this.f14943e = p42.f11045e;
        this.f = p42.f;
        this.f14944g = p42.f11046g;
        this.f14945h = p42.f11047h;
        this.i = p42.i;
        this.f14946j = p42.f11048j;
        this.f14947k = p42.f11049k;
        this.f14948l = p42.f11051m;
        this.f14949m = p42.f11052n;
        this.f14950n = p42.f11053o;
        this.f14951o = p42.f11054p;
        this.f14952p = p42.f11055q;
        this.f14953q = p42.f11056r;
        this.f14954r = p42.f11057s;
        this.f14955s = p42.f11058t;
        this.f14956t = p42.f11059u;
        this.f14957u = p42.f11060v;
        this.f14958v = p42.f11061w;
        this.f14959w = p42.f11062x;
        this.f14960x = p42.f11063y;
    }

    public final void a(int i, byte[] bArr) {
        if (this.f == null || Integer.valueOf(i).equals(3) || !Objects.equals(this.f14944g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.f14944g = Integer.valueOf(i);
        }
    }

    public C1412p4() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        this.f14960x = C1761wv.f16184o;
    }
}
