package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Am {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bm f4072a;

    /* renamed from: b, reason: collision with root package name */
    public volatile io.appmetrica.analytics.networktasks.internal.NetworkTask f4073b;

    public Am(io.appmetrica.analytics.impl.Bm bm) {
        this.f4072a = bm;
    }

    public final android.content.Context b() {
        return this.f4072a.f4134a;
    }

    public final synchronized io.appmetrica.analytics.networktasks.internal.NetworkTask c() {
        io.appmetrica.analytics.networktasks.internal.NetworkTask networkTask;
        try {
            if (g()) {
                networkTask = this.f4073b;
                if (networkTask != null) {
                    if (networkTask.isRemoved()) {
                    }
                }
                io.appmetrica.analytics.impl.C0262bm d2 = d();
                io.appmetrica.analytics.impl.Vd vd = io.appmetrica.analytics.impl.Vd.f5140a;
                io.appmetrica.analytics.impl.Xl xl = new io.appmetrica.analytics.impl.Xl(new io.appmetrica.analytics.impl.C0383ge(), io.appmetrica.analytics.impl.C0560na.f6484I.p());
                io.appmetrica.analytics.networktasks.internal.FinalConfigProvider finalConfigProvider = new io.appmetrica.analytics.networktasks.internal.FinalConfigProvider(d2);
                networkTask = new io.appmetrica.analytics.networktasks.internal.NetworkTask(new io.appmetrica.analytics.coreutils.internal.executors.SynchronizedBlockingExecutor(), new io.appmetrica.analytics.impl.C0607p5(this.f4072a.f4134a), new io.appmetrica.analytics.networktasks.internal.AllHostsExponentialBackoffPolicy(io.appmetrica.analytics.impl.Vd.f5140a.a(io.appmetrica.analytics.impl.Td.STARTUP)), new io.appmetrica.analytics.impl.C0857ym(this, new io.appmetrica.analytics.impl.Rl(), new io.appmetrica.analytics.networktasks.internal.FullUrlFormer(xl, finalConfigProvider), new io.appmetrica.analytics.networktasks.internal.RequestDataHolder(), new io.appmetrica.analytics.networktasks.internal.ResponseDataHolder(new io.appmetrica.analytics.networktasks.internal.DefaultResponseValidityChecker()), finalConfigProvider), i1.C0199r.f3325a, io.appmetrica.analytics.impl.Vd.f5142c);
                this.f4073b = networkTask;
            } else {
                networkTask = null;
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return networkTask;
    }

    public final io.appmetrica.analytics.impl.C0262bm d() {
        return (io.appmetrica.analytics.impl.C0262bm) this.f4072a.f4145l.a();
    }

    public final io.appmetrica.analytics.impl.C0365fm e() {
        io.appmetrica.analytics.impl.C0365fm c0365fm;
        io.appmetrica.analytics.impl.Il il = this.f4072a.f4145l;
        synchronized (il) {
            c0365fm = il.f6570c.f4580a;
        }
        return c0365fm;
    }

    public final void f() {
        io.appmetrica.analytics.impl.C0365fm c0365fm;
        io.appmetrica.analytics.impl.Il il = this.f4072a.f4145l;
        synchronized (il) {
            c0365fm = il.f6570c.f4580a;
        }
        io.appmetrica.analytics.impl.C0468jm c0468jm = c0365fm.f5913c;
        io.appmetrica.analytics.impl.C0442im a2 = c0468jm.a(c0468jm.f6227m);
        java.lang.String str = c0365fm.f5911a;
        java.lang.String str2 = c0365fm.f5912b;
        io.appmetrica.analytics.impl.C0626po c0626po = this.f4072a.f4147n;
        java.lang.String str3 = c0365fm.f5914d;
        c0626po.getClass();
        if (!io.appmetrica.analytics.impl.C0626po.a(str3)) {
            a2.f6112a = this.f4072a.f4146m.a().id;
        }
        java.lang.String str4 = c0365fm.f5911a;
        if (str4 == null || str4.length() == 0) {
            str = this.f4072a.f4141h.a();
            str2 = "";
        }
        java.util.List<java.lang.String> list = this.f4072a.f4136c.f5440e;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        a2.f6118g = list;
        io.appmetrica.analytics.impl.C0365fm c0365fm2 = new io.appmetrica.analytics.impl.C0365fm(str, str2, new io.appmetrica.analytics.impl.C0468jm(a2));
        b(c0365fm2);
        a(c0365fm2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
    
        if (r1 == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x0002, B:10:0x0011, B:12:0x001b, B:17:0x0035, B:19:0x003d, B:21:0x0045, B:24:0x004e), top: B:3:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean g() {
        boolean z2;
        boolean z3 = true;
        synchronized (this) {
            try {
                boolean z4 = false;
                if (io.appmetrica.analytics.impl.C0560na.f6484I.h().isRestrictedForSdk()) {
                    return false;
                }
                io.appmetrica.analytics.impl.C0365fm e2 = e();
                java.util.Set set = io.appmetrica.analytics.impl.AbstractC0288cm.f5676a;
                if (!e2.f5932w) {
                    if (io.appmetrica.analytics.impl.AbstractC0288cm.f5677b.currentTimeSeconds() <= e2.f5925o + e2.f5935z.f4184a) {
                        z2 = false;
                        if (!z2) {
                            if (io.appmetrica.analytics.impl.AbstractC0288cm.a(e2.f5914d) && io.appmetrica.analytics.impl.AbstractC0288cm.a(e2.f5911a) && io.appmetrica.analytics.impl.AbstractC0288cm.a(e2.f5912b)) {
                                z4 = true;
                            }
                            z2 = !z4;
                            io.appmetrica.analytics.impl.C3 c3 = this.f4072a.f4144k;
                            java.util.Map map = d().f5600h;
                            io.appmetrica.analytics.impl.C0864z3 c0864z3 = this.f4072a.f4143j;
                            c3.getClass();
                            boolean a2 = io.appmetrica.analytics.impl.C3.a(map, e2, c0864z3);
                            if (z4) {
                            }
                        }
                        z3 = z2;
                        return z3;
                    }
                }
                z2 = true;
                if (!z2) {
                }
                z3 = z2;
                return z3;
            } finally {
            }
        }
    }

    public final synchronized void h() {
        this.f4073b = null;
    }

    public final io.appmetrica.analytics.impl.Q4 a() {
        return this.f4072a.f4139f;
    }

    public final synchronized void b(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        this.f4072a.f4145l.a(c0365fm);
        io.appmetrica.analytics.impl.C0339em c0339em = this.f4072a.f4140g;
        c0339em.f5863b.a(c0365fm.f5911a);
        c0339em.f5863b.b(c0365fm.f5912b);
        c0339em.f5862a.save(c0365fm.f5913c);
        this.f4072a.f4138e.a(c0365fm);
    }

    public final synchronized boolean a(java.util.List<java.lang.String> list, java.util.Map<java.lang.String, java.lang.String> map) {
        return !io.appmetrica.analytics.impl.AbstractC0288cm.a(e(), list, map, new io.appmetrica.analytics.impl.C0883zm(this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r5 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0365fm a(io.appmetrica.analytics.impl.C0314dm c0314dm, io.appmetrica.analytics.impl.C0262bm c0262bm, long j2) {
        java.lang.String str;
        boolean equals;
        java.lang.String a2 = io.appmetrica.analytics.impl.Fm.a(c0262bm.f5600h);
        java.util.Map map = c0262bm.f5601i.f6715a;
        java.lang.String str2 = c0314dm.f5742j;
        java.lang.String str3 = e().f5921k;
        if (!io.appmetrica.analytics.impl.Fm.a(io.appmetrica.analytics.impl.Fm.a(str2))) {
            str2 = io.appmetrica.analytics.impl.Fm.a(io.appmetrica.analytics.impl.Fm.a(str3)) ? str3 : null;
        }
        java.lang.String str4 = e().f5911a;
        if (str4 != null) {
            str = y1.g.T(str4) ? null : str4;
        }
        str = c0314dm.f5740h;
        io.appmetrica.analytics.impl.C0442im c0442im = new io.appmetrica.analytics.impl.C0442im(c0314dm.f5734b);
        java.lang.String str5 = c0314dm.f5741i;
        c0442im.f6126o = this.f4072a.f4142i.currentTimeSeconds();
        c0442im.f6112a = e().f5914d;
        c0442im.f6114c = c0314dm.f5736d;
        c0442im.f6117f = c0314dm.f5735c;
        c0442im.f6118g = c0262bm.f5597e;
        c0442im.f6113b = c0314dm.f5737e;
        c0442im.f6115d = c0314dm.f5738f;
        c0442im.f6116e = c0314dm.f5739g;
        c0442im.f6119h = c0314dm.f5746n;
        c0442im.f6120i = c0314dm.f5747o;
        c0442im.f6121j = str2;
        c0442im.f6122k = a2;
        this.f4072a.f4144k.getClass();
        java.util.HashMap a3 = io.appmetrica.analytics.impl.Fm.a(str2);
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a(map)) {
            equals = io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) a3);
        } else {
            equals = a3.equals(map);
        }
        c0442im.f6128q = equals;
        c0442im.f6123l = io.appmetrica.analytics.impl.Fm.a(map);
        c0442im.f6129r = c0314dm.f5745m;
        c0442im.f6125n = c0314dm.f5743k;
        c0442im.f6130s = c0314dm.f5748p;
        c0442im.f6127p = true;
        c0442im.t = j2;
        io.appmetrica.analytics.impl.C0262bm d2 = d();
        if (d2.f5606n == 0) {
            d2.f5606n = j2;
        }
        c0442im.f6131u = d2.f5606n;
        c0442im.f6132v = false;
        c0442im.f6133w = c0314dm.f5749q;
        c0442im.f6134x = c0314dm.f5750r;
        c0442im.f6135y = c0314dm.f5751s;
        c0442im.f6136z = c0314dm.t;
        c0442im.f6110A = c0314dm.f5752u;
        c0442im.f6111B = c0314dm.f5753v;
        return new io.appmetrica.analytics.impl.C0365fm(str, str5, new io.appmetrica.analytics.impl.C0468jm(c0442im));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0032, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:11:0x0037, B:12:0x003e), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(io.appmetrica.analytics.impl.C0314dm c0314dm, io.appmetrica.analytics.impl.C0262bm c0262bm, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> map) {
        java.lang.Long l2;
        io.appmetrica.analytics.impl.C0365fm a2;
        synchronized (this) {
            if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map)) {
                java.util.List list = (java.util.List) io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils.getFromMapIgnoreCase(map, "Date");
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list)) {
                    try {
                        l2 = java.lang.Long.valueOf(new java.text.SimpleDateFormat("E, d MMM yyyy HH:mm:ss z", java.util.Locale.US).parse((java.lang.String) list.get(0)).getTime());
                    } catch (java.lang.Throwable unused) {
                    }
                    long longValue = l2 == null ? l2.longValue() : 0L;
                    io.appmetrica.analytics.impl.Wj.f5222a.a(longValue, c0314dm.f5744l);
                    a2 = a(c0314dm, c0262bm, longValue);
                    h();
                    b(a2);
                }
            }
            l2 = null;
            if (l2 == null) {
            }
            io.appmetrica.analytics.impl.Wj.f5222a.a(longValue, c0314dm.f5744l);
            a2 = a(c0314dm, c0262bm, longValue);
            h();
            b(a2);
        }
        a(a2);
    }

    public final void a(io.appmetrica.analytics.impl.C0365fm c0365fm) {
        java.util.ArrayList arrayList;
        io.appmetrica.analytics.impl.Bm bm = this.f4072a;
        io.appmetrica.analytics.impl.Fl fl = bm.f4137d;
        java.lang.String str = bm.f4135b;
        synchronized (fl.f4306a.f4395b) {
            try {
                io.appmetrica.analytics.impl.Hl hl = fl.f4306a;
                hl.f4396c = c0365fm;
                java.util.Collection collection = (java.util.Collection) hl.f4394a.f6642a.get(str);
                if (collection == null) {
                    arrayList = new java.util.ArrayList();
                } else {
                    arrayList = new java.util.ArrayList(collection);
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((io.appmetrica.analytics.impl.Ql) it.next()).a(c0365fm);
        }
    }

    public final void a(io.appmetrica.analytics.impl.Jl jl) {
        synchronized (this) {
            this.f4073b = null;
        }
        io.appmetrica.analytics.impl.Bm bm = this.f4072a;
        bm.f4137d.a(bm.f4139f.f4859a, jl, e());
    }

    public final synchronized void a(io.appmetrica.analytics.impl.Zl zl) {
        try {
            this.f4072a.f4145l.a(zl);
            io.appmetrica.analytics.impl.C0262bm d2 = d();
            if (d2.f5603k) {
                java.util.List list = d2.f5602j;
                if (list != null && !list.isEmpty()) {
                    if (!io.appmetrica.analytics.impl.AbstractC0522lo.a(list, d2.f5597e)) {
                        io.appmetrica.analytics.impl.C0365fm e2 = e();
                        io.appmetrica.analytics.impl.C0468jm c0468jm = e2.f5913c;
                        io.appmetrica.analytics.impl.C0442im a2 = c0468jm.a(c0468jm.f6227m);
                        java.lang.String str = e2.f5911a;
                        java.lang.String str2 = e2.f5912b;
                        a2.f6118g = list;
                        io.appmetrica.analytics.impl.C0365fm c0365fm = new io.appmetrica.analytics.impl.C0365fm(str, str2, new io.appmetrica.analytics.impl.C0468jm(a2));
                        b(c0365fm);
                        a(c0365fm);
                    }
                }
                if (d2.f5597e != null && (!r5.isEmpty())) {
                    io.appmetrica.analytics.impl.C0365fm e3 = e();
                    io.appmetrica.analytics.impl.C0468jm c0468jm2 = e3.f5913c;
                    io.appmetrica.analytics.impl.C0442im a3 = c0468jm2.a(c0468jm2.f6227m);
                    java.lang.String str3 = e3.f5911a;
                    java.lang.String str4 = e3.f5912b;
                    a3.f6118g = null;
                    io.appmetrica.analytics.impl.C0365fm c0365fm2 = new io.appmetrica.analytics.impl.C0365fm(str3, str4, new io.appmetrica.analytics.impl.C0468jm(a3));
                    b(c0365fm2);
                    a(c0365fm2);
                }
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
    }
}
