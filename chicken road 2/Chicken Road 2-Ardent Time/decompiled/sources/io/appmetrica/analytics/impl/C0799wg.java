package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0799wg {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7018a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.services.SafePackageManager f7019b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Ra f7020c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Dc f7021d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7022e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f7023f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f7024g;

    public C0799wg(android.content.Context context, io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager, io.appmetrica.analytics.impl.Ra ra) {
        this.f7018a = context;
        this.f7019b = safePackageManager;
        this.f7020c = ra;
        io.appmetrica.analytics.impl.Dc dc = new io.appmetrica.analytics.impl.Dc(0);
        dc.a(io.appmetrica.analytics.impl.EnumC0540mg.f6430d, 1);
        dc.a(io.appmetrica.analytics.impl.EnumC0540mg.f6429c, 2);
        this.f7021d = dc;
        this.f7022e = java.util.concurrent.TimeUnit.DAYS.toSeconds(1L);
        this.f7023f = "com.android.vending";
        this.f7024g = "com.huawei.appmarket";
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008b, code lost:
    
        if (((java.lang.Number) r7).longValue() < r13.f7022e) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.C0566ng a(java.util.List list) {
        io.appmetrica.analytics.impl.C0566ng c0566ng;
        if (list.isEmpty()) {
            return null;
        }
        if (list.size() == 1) {
            return (io.appmetrica.analytics.impl.C0566ng) list.get(0);
        }
        io.appmetrica.analytics.coreutils.internal.services.SafePackageManager safePackageManager = this.f7019b;
        android.content.Context context = this.f7018a;
        android.content.pm.PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 0);
        if (packageInfo != null) {
            long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(packageInfo.firstInstallTime);
            java.util.Iterator it = list.iterator();
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            io.appmetrica.analytics.impl.C0566ng c0566ng2 = (io.appmetrica.analytics.impl.C0566ng) it.next();
            h1.C0172d c0172d = new h1.C0172d(c0566ng2, java.lang.Long.valueOf(java.lang.Math.abs(c0566ng2.f6535c - seconds)));
            while (true) {
                boolean hasNext = it.hasNext();
                java.lang.Object obj = c0172d.f3296b;
                if (!hasNext) {
                    break;
                }
                io.appmetrica.analytics.impl.C0566ng c0566ng3 = (io.appmetrica.analytics.impl.C0566ng) it.next();
                java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Math.abs(c0566ng3.f6535c - seconds));
                h1.C0172d c0172d2 = new h1.C0172d(c0566ng3, valueOf);
                java.lang.Comparable comparable = (java.lang.Comparable) obj;
                if ((comparable == valueOf ? 0 : comparable == null ? -1 : comparable.compareTo(valueOf)) > 0) {
                    c0172d = c0172d2;
                }
            }
            c0566ng = (io.appmetrica.analytics.impl.C0566ng) c0172d.f3295a;
        }
        c0566ng = null;
        if (c0566ng == null) {
            java.util.Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            io.appmetrica.analytics.impl.C0566ng c0566ng4 = (io.appmetrica.analytics.impl.C0566ng) it2.next();
            while (it2.hasNext()) {
                io.appmetrica.analytics.impl.C0566ng c0566ng5 = (io.appmetrica.analytics.impl.C0566ng) it2.next();
                if (a(this, c0566ng4, c0566ng5) < 0) {
                    c0566ng4 = c0566ng5;
                }
            }
            c0566ng = c0566ng4;
        }
        io.appmetrica.analytics.impl.Ra ra = this.f7020c;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.util.ArrayList arrayList = new java.util.ArrayList(i1.AbstractC0192k.K(list));
        java.util.Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            io.appmetrica.analytics.impl.C0566ng c0566ng6 = (io.appmetrica.analytics.impl.C0566ng) it3.next();
            arrayList.add(new org.json.JSONObject().put("referrer", c0566ng6.f6533a).put("install_timestamp_seconds", c0566ng6.f6535c).put("click_timestamp_seconds", c0566ng6.f6534b).put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, c0566ng6.f6536d.f6432a));
        }
        ra.reportEvent("several_filled_referrers", jSONObject.put("candidates", io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) arrayList) ? null : new org.json.JSONArray((java.util.Collection) arrayList)).put("chosen", new org.json.JSONObject().put("referrer", c0566ng.f6533a).put("install_timestamp_seconds", c0566ng.f6535c).put("click_timestamp_seconds", c0566ng.f6534b).put(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY, c0566ng.f6536d.f6432a)).putOpt("install_time", packageInfo != null ? java.lang.Long.valueOf(packageInfo.firstInstallTime) : null).toString());
        return c0566ng;
    }

    public /* synthetic */ C0799wg(android.content.Context context) {
        this(context, new io.appmetrica.analytics.coreutils.internal.services.SafePackageManager(), io.appmetrica.analytics.impl.AbstractC0810x1.a());
    }

    public static final int a(io.appmetrica.analytics.impl.C0799wg c0799wg, io.appmetrica.analytics.impl.C0566ng c0566ng, io.appmetrica.analytics.impl.C0566ng c0566ng2) {
        int signum = java.lang.Long.signum(c0566ng.f6535c - c0566ng2.f6535c);
        return signum == 0 ? ((java.lang.Number) c0799wg.f7021d.a(c0566ng.f6536d)).intValue() - ((java.lang.Number) c0799wg.f7021d.a(c0566ng2.f6536d)).intValue() : signum;
    }
}
