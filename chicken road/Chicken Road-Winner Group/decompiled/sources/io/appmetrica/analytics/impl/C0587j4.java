package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.j4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587j4 {

    /* renamed from: u, reason: collision with root package name */
    public static volatile C0587j4 f7569u;

    /* renamed from: a, reason: collision with root package name */
    public final C0977y6 f7570a;

    /* renamed from: b, reason: collision with root package name */
    public final L7 f7571b;

    /* renamed from: c, reason: collision with root package name */
    public final Z3 f7572c;

    /* renamed from: d, reason: collision with root package name */
    public final Q1 f7573d;

    /* renamed from: e, reason: collision with root package name */
    public final C0712o f7574e;
    public final C0398bl f;

    /* renamed from: g, reason: collision with root package name */
    public final L5 f7575g;

    /* renamed from: h, reason: collision with root package name */
    public final C0660m f7576h;

    /* renamed from: i, reason: collision with root package name */
    public final C0762pn f7577i;

    /* renamed from: j, reason: collision with root package name */
    public Cd f7578j;

    /* renamed from: k, reason: collision with root package name */
    public final C0790r0 f7579k;

    /* renamed from: l, reason: collision with root package name */
    public volatile C0510g4 f7580l;

    /* renamed from: m, reason: collision with root package name */
    public final Zc f7581m;

    /* renamed from: n, reason: collision with root package name */
    public volatile C0366af f7582n;

    /* renamed from: o, reason: collision with root package name */
    public C0525gj f7583o;

    /* renamed from: p, reason: collision with root package name */
    public final C0946x0 f7584p;

    /* renamed from: q, reason: collision with root package name */
    public final U1 f7585q;

    /* renamed from: r, reason: collision with root package name */
    public final C0593ja f7586r;

    /* renamed from: s, reason: collision with root package name */
    public volatile C0377b0 f7587s;

    /* renamed from: t, reason: collision with root package name */
    public volatile T9 f7588t;

    public C0587j4(C0977y6 c0977y6, C0712o c0712o, Z3 z3) {
        this(c0977y6, c0712o, z3, new C0660m(c0712o));
    }

    public static C0587j4 l() {
        if (f7569u == null) {
            synchronized (C0587j4.class) {
                try {
                    if (f7569u == null) {
                        f7569u = new C0587j4(new C0977y6(), new C0712o(), new Z3());
                    }
                } finally {
                }
            }
        }
        return f7569u;
    }

    public final C0712o a() {
        return this.f7574e;
    }

    public final C0366af b(Context context) {
        C0366af c0366af;
        C0366af c0366af2 = this.f7582n;
        if (c0366af2 != null) {
            return c0366af2;
        }
        synchronized (this) {
            try {
                c0366af = this.f7582n;
                if (c0366af == null) {
                    c0366af = new C0366af(C0513g7.a(context).a());
                    this.f7582n = c0366af;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0366af;
    }

    public final C0790r0 c() {
        return this.f7579k;
    }

    public final C0946x0 d() {
        return this.f7584p;
    }

    public final Q1 e() {
        return this.f7573d;
    }

    public final U1 f() {
        return this.f7585q;
    }

    public final Z3 g() {
        return this.f7572c;
    }

    public final L5 h() {
        return this.f7575g;
    }

    public final C0977y6 i() {
        return this.f7570a;
    }

    public final L7 j() {
        return this.f7571b;
    }

    public final C0593ja k() {
        return this.f7586r;
    }

    public final C0510g4 m() {
        C0510g4 c0510g4;
        C0510g4 c0510g42 = this.f7580l;
        if (c0510g42 != null) {
            return c0510g42;
        }
        synchronized (this) {
            try {
                c0510g4 = this.f7580l;
                if (c0510g4 == null) {
                    c0510g4 = new C0510g4();
                    this.f7580l = c0510g4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0510g4;
    }

    public final C0977y6 n() {
        return this.f7570a;
    }

    public final C0398bl o() {
        return this.f;
    }

    public C0587j4(C0977y6 c0977y6, C0712o c0712o, Z3 z3, C0660m c0660m) {
        this(c0977y6, new L7(), z3, c0660m, new Q1(), c0712o, new C0398bl(c0712o, c0660m), new L5(c0712o), new C0762pn(), new C0790r0());
    }

    public final synchronized Cd a(Context context) {
        try {
            if (this.f7578j == null) {
                this.f7578j = new Cd(context, new C0737oo());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f7578j;
    }

    public C0587j4(C0977y6 c0977y6, L7 l7, Z3 z3, C0660m c0660m, Q1 q12, C0712o c0712o, C0398bl c0398bl, L5 l5, C0762pn c0762pn, C0790r0 c0790r0) {
        this.f7581m = new Zc();
        this.f7584p = new C0946x0();
        this.f7585q = new U1();
        this.f7586r = new C0593ja();
        new K7();
        this.f7570a = c0977y6;
        this.f7571b = l7;
        this.f7572c = z3;
        this.f7576h = c0660m;
        this.f7573d = q12;
        this.f7574e = c0712o;
        this.f = c0398bl;
        this.f7575g = l5;
        this.f7577i = c0762pn;
        this.f7579k = c0790r0;
    }

    public final C0377b0 b() {
        C0377b0 c0377b0;
        C0377b0 c0377b02 = this.f7587s;
        if (c0377b02 != null) {
            return c0377b02;
        }
        synchronized (this) {
            try {
                c0377b0 = this.f7587s;
                if (c0377b0 == null) {
                    c0377b0 = new C0377b0(this.f7584p, this.f, this.f7572c);
                    this.f7587s = c0377b0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0377b0;
    }
}
