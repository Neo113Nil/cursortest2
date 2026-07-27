package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0736j4 {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C0736j4 f8481u;

    /* renamed from: a, reason: collision with root package name */
    public final C1126y6 f8482a;

    /* renamed from: b, reason: collision with root package name */
    public final L7 f8483b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f8484c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1 f8485d;

    /* renamed from: e, reason: collision with root package name */
    public final C0861o f8486e;

    /* renamed from: f, reason: collision with root package name */
    public final C0547bl f8487f;

    /* renamed from: g, reason: collision with root package name */
    public final L5 f8488g;

    /* renamed from: h, reason: collision with root package name */
    public final C0809m f8489h;

    /* renamed from: i, reason: collision with root package name */
    public final C0911pn f8490i;

    /* renamed from: j, reason: collision with root package name */
    public Cd f8491j;

    /* renamed from: k, reason: collision with root package name */
    public final C0939r0 f8492k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0659g4 f8493l;

    /* renamed from: m, reason: collision with root package name */
    public final Zc f8494m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0515af f8495n;

    /* renamed from: o, reason: collision with root package name */
    public C0674gj f8496o;

    /* renamed from: p, reason: collision with root package name */
    public final C1095x0 f8497p;

    /* renamed from: q, reason: collision with root package name */
    public final U1 f8498q;

    /* renamed from: r, reason: collision with root package name */
    public final C0742ja f8499r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0526b0 f8500s;

    /* renamed from: t, reason: collision with root package name */
    public volatile T9 f8501t;

    public C0736j4(C1126y6 c1126y6, C0861o c0861o, Z3 z32) {
        this(c1126y6, c0861o, z32, new C0809m(c0861o));
    }

    public static C0736j4 l() {
        if (f8481u == null) {
            synchronized (C0736j4.class) {
                try {
                    if (f8481u == null) {
                        f8481u = new C0736j4(new C1126y6(), new C0861o(), new Z3());
                    }
                } finally {
                }
            }
        }
        return f8481u;
    }

    public final C0861o a() {
        return this.f8486e;
    }

    public final C0515af b(Context context) {
        C0515af c0515af = this.f8495n;
        if (c0515af == null) {
            synchronized (this) {
                try {
                    c0515af = this.f8495n;
                    if (c0515af == null) {
                        c0515af = new C0515af(C0662g7.a(context).a());
                        this.f8495n = c0515af;
                    }
                } finally {
                }
            }
        }
        return c0515af;
    }

    public final C0939r0 c() {
        return this.f8492k;
    }

    public final C1095x0 d() {
        return this.f8497p;
    }

    public final Q1 e() {
        return this.f8485d;
    }

    public final U1 f() {
        return this.f8498q;
    }

    public final Z3 g() {
        return this.f8484c;
    }

    public final L5 h() {
        return this.f8488g;
    }

    public final C1126y6 i() {
        return this.f8482a;
    }

    public final L7 j() {
        return this.f8483b;
    }

    public final C0742ja k() {
        return this.f8499r;
    }

    public final C0659g4 m() {
        C0659g4 c0659g4 = this.f8493l;
        if (c0659g4 == null) {
            synchronized (this) {
                try {
                    c0659g4 = this.f8493l;
                    if (c0659g4 == null) {
                        c0659g4 = new C0659g4();
                        this.f8493l = c0659g4;
                    }
                } finally {
                }
            }
        }
        return c0659g4;
    }

    public final C1126y6 n() {
        return this.f8482a;
    }

    public final C0547bl o() {
        return this.f8487f;
    }

    public C0736j4(C1126y6 c1126y6, C0861o c0861o, Z3 z32, C0809m c0809m) {
        this(c1126y6, new L7(), z32, c0809m, new Q1(), c0861o, new C0547bl(c0861o, c0809m), new L5(c0861o), new C0911pn(), new C0939r0());
    }

    public final synchronized Cd a(Context context) {
        try {
            if (this.f8491j == null) {
                this.f8491j = new Cd(context, new C0886oo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f8491j;
    }

    public C0736j4(C1126y6 c1126y6, L7 l7, Z3 z32, C0809m c0809m, Q1 q12, C0861o c0861o, C0547bl c0547bl, L5 l52, C0911pn c0911pn, C0939r0 c0939r0) {
        this.f8494m = new Zc();
        this.f8497p = new C1095x0();
        this.f8498q = new U1();
        this.f8499r = new C0742ja();
        new K7();
        this.f8482a = c1126y6;
        this.f8483b = l7;
        this.f8484c = z32;
        this.f8489h = c0809m;
        this.f8485d = q12;
        this.f8486e = c0861o;
        this.f8487f = c0547bl;
        this.f8488g = l52;
        this.f8490i = c0911pn;
        this.f8492k = c0939r0;
    }

    public final C0526b0 b() {
        C0526b0 c0526b0 = this.f8500s;
        if (c0526b0 == null) {
            synchronized (this) {
                try {
                    c0526b0 = this.f8500s;
                    if (c0526b0 == null) {
                        c0526b0 = new C0526b0(this.f8497p, this.f8487f, this.f8484c);
                        this.f8500s = c0526b0;
                    }
                } finally {
                }
            }
        }
        return c0526b0;
    }
}
