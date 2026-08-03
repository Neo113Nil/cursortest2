package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Wl {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashSet f5230a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f5231b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Tl f5232c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f5233d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.HashMap f5234e;

    /* renamed from: f, reason: collision with root package name */
    public long f5235f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5236g;

    /* renamed from: h, reason: collision with root package name */
    public long f5237h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ve f5238i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.P f5239j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C3 f5240k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0815x6 f5241l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.T9 f5242m;

    /* renamed from: n, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.S9 f5243n;

    /* renamed from: o, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0626po f5244o;

    public Wl(android.content.Context context, io.appmetrica.analytics.impl.Ve ve) {
        this(ve, new io.appmetrica.analytics.impl.P(), new io.appmetrica.analytics.impl.C3(), io.appmetrica.analytics.impl.C0244b4.l().a(context), new io.appmetrica.analytics.impl.C0815x6(), new io.appmetrica.analytics.impl.T9(), new io.appmetrica.analytics.impl.S9(), new io.appmetrica.analytics.impl.C0626po());
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r8.f5236g != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(java.util.List list) {
        boolean z2;
        boolean z3;
        try {
            java.util.Set other = io.appmetrica.analytics.impl.AbstractC0288cm.f5676a;
            kotlin.jvm.internal.i.e(list, "<this>");
            kotlin.jvm.internal.i.e(other, "other");
            java.util.Set a02 = i1.AbstractC0190i.a0(list);
            a02.retainAll(other);
            boolean a2 = a(a02);
            java.util.Iterator it = list.iterator();
            while (true) {
                z2 = false;
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                if (this.f5230a.contains((java.lang.String) it.next())) {
                    z3 = true;
                    break;
                }
            }
            boolean z4 = io.appmetrica.analytics.impl.AbstractC0288cm.f5677b.currentTimeSeconds() > this.f5237h;
            if (a2 && !z3 && !z4) {
            }
            z2 = true;
        } finally {
        }
        return z2;
    }

    public final void b(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        if (a(identifiersResult)) {
            return;
        }
        this.f5231b.put("appmetrica_clids", identifiersResult);
    }

    public final void c(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        if (identifiersResult != null) {
            io.appmetrica.analytics.impl.C0626po c0626po = this.f5244o;
            java.lang.String str = identifiersResult.id;
            c0626po.getClass();
            if (io.appmetrica.analytics.impl.C0626po.a(str)) {
                this.f5231b.put(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID, identifiersResult);
            }
        }
    }

    public final synchronized boolean b() {
        return a(java.util.Arrays.asList("appmetrica_clids", io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID));
    }

    public final void c() {
        io.appmetrica.analytics.impl.V9 v9;
        io.appmetrica.analytics.impl.Ve d2 = this.f5238i.i((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_UUID)).e((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID)).d((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)).a((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_get_ad_url")).b((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_report_ad_url")).e(this.f5235f).h((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_clids")).j(io.appmetrica.analytics.impl.Fm.a((java.util.Map) this.f5234e)).f((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_google_adv_id")).g((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_huawei_oaid")).j((io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_yandex_adv_id")).b(this.f5236g).c(this.f5241l.f7100d).d(this.f5237h);
        io.appmetrica.analytics.impl.T9 t9 = this.f5242m;
        synchronized (t9) {
            v9 = t9.f5011b;
        }
        d2.a(v9).b();
    }

    public Wl(io.appmetrica.analytics.impl.Ve ve, io.appmetrica.analytics.impl.P p2, io.appmetrica.analytics.impl.C3 c3, io.appmetrica.analytics.impl.C0770vd c0770vd, io.appmetrica.analytics.impl.C0815x6 c0815x6, io.appmetrica.analytics.impl.T9 t9, io.appmetrica.analytics.impl.S9 s9, io.appmetrica.analytics.impl.C0626po c0626po) {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f5230a = hashSet;
        this.f5231b = new java.util.HashMap();
        this.f5232c = new io.appmetrica.analytics.impl.Tl();
        hashSet.add("appmetrica_google_adv_id");
        hashSet.add("appmetrica_huawei_oaid");
        hashSet.add("appmetrica_yandex_adv_id");
        this.f5238i = ve;
        this.f5239j = p2;
        this.f5240k = c3;
        this.f5241l = c0815x6;
        this.f5242m = t9;
        this.f5243n = s9;
        this.f5244o = c0626po;
        c(c0770vd.a());
        a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID, ve.j());
        a(io.appmetrica.analytics.StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, ve.i());
        a("appmetrica_get_ad_url", ve.d());
        a("appmetrica_report_ad_url", ve.e());
        b(ve.o());
        a("appmetrica_google_adv_id", ve.l());
        a("appmetrica_huawei_oaid", ve.m());
        a("appmetrica_yandex_adv_id", ve.r());
        c0815x6.a(ve.h());
        t9.a(ve.k());
        this.f5233d = ve.g();
        java.lang.String i2 = ve.i((java.lang.String) null);
        this.f5234e = i2 != null ? io.appmetrica.analytics.impl.Fm.a(i2) : null;
        this.f5236g = ve.a(true);
        this.f5235f = ve.b(0L);
        this.f5237h = ve.n();
        c();
    }

    public final boolean a() {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get("appmetrica_clids");
        if (!a(identifiersResult) && identifiersResult.id.isEmpty()) {
            return io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) this.f5234e);
        }
        return true;
    }

    public static boolean a(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return identifiersResult == null || identifiersResult.id == null;
    }

    public final void a(java.lang.String str, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        if (identifiersResult == null || android.text.TextUtils.isEmpty(identifiersResult.id)) {
            return;
        }
        this.f5231b.put(str, identifiersResult);
    }

    public final synchronized boolean a(java.util.Collection collection) {
        java.lang.Boolean bool;
        java.lang.String str;
        try {
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                io.appmetrica.analytics.internal.IdentifiersResult identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f5231b.get(str2);
                if (identifiersResult == null) {
                    identifiersResult = (io.appmetrica.analytics.internal.IdentifiersResult) this.f5241l.f7099c.get(str2);
                }
                if (identifiersResult == null) {
                    io.appmetrica.analytics.impl.V9 v9 = this.f5242m.f5011b;
                    if (!kotlin.jvm.internal.i.a(str2, "appmetrica_lib_ssl_enabled") || (bool = v9.f5134a) == null) {
                        identifiersResult = null;
                    } else {
                        boolean booleanValue = bool.booleanValue();
                        io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus identifierStatus = v9.f5135b;
                        java.lang.String str3 = v9.f5136c;
                        if (booleanValue) {
                            str = "true";
                        } else if (!booleanValue) {
                            str = "false";
                        } else {
                            throw new E1.A();
                        }
                        identifiersResult = new io.appmetrica.analytics.internal.IdentifiersResult(str, identifierStatus, str3);
                    }
                }
                if ("appmetrica_clids".equals(str2)) {
                    if (this.f5236g || a(identifiersResult) || (identifiersResult.id.isEmpty() && !io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) this.f5234e))) {
                        return false;
                    }
                } else if ("appmetrica_lib_ssl_enabled".equals(str2)) {
                    if (identifiersResult == null) {
                        return false;
                    }
                } else if (identifiersResult == null || android.text.TextUtils.isEmpty(identifiersResult.id)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
