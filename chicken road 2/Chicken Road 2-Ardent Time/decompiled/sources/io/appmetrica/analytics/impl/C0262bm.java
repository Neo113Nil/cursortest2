package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0262bm extends io.appmetrica.analytics.impl.N5 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f5596d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f5597e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f5598f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f5599g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.Map f5600h;

    /* renamed from: i, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0656r3 f5601i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.List f5602j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5603k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5604l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f5605m;

    /* renamed from: n, reason: collision with root package name */
    public long f5606n;

    /* renamed from: o, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0514lg f5607o;

    /* renamed from: p, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.H7 f5608p;

    public C0262bm() {
        this(io.appmetrica.analytics.impl.C0560na.k().u(), new io.appmetrica.analytics.impl.H7());
    }

    public final long a(long j2) {
        if (this.f5606n == 0) {
            this.f5606n = j2;
        }
        return this.f5606n;
    }

    public final io.appmetrica.analytics.impl.C0656r3 c() {
        return this.f5601i;
    }

    public final java.util.Map<java.lang.String, java.lang.String> d() {
        return this.f5600h;
    }

    public final java.lang.String e() {
        return this.f5605m;
    }

    public final java.lang.String f() {
        return this.f5598f;
    }

    public final long g() {
        return this.f5606n;
    }

    public final java.lang.String h() {
        return this.f5599g;
    }

    public final java.util.List<java.lang.String> i() {
        return this.f5602j;
    }

    public final io.appmetrica.analytics.impl.C0514lg j() {
        return this.f5607o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r4 != null) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.util.List<java.lang.String> k() {
        java.util.ArrayList arrayList;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) this.f5596d)) {
            linkedHashSet.addAll(this.f5596d);
        }
        if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) this.f5597e)) {
            linkedHashSet.addAll(this.f5597e);
        }
        java.lang.String[] strArr = (java.lang.String[]) this.f5608p.f4372a.a();
        if (strArr != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.String str : strArr) {
                if (str == null || y1.g.T(str)) {
                    str = null;
                }
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
        }
        java.lang.String[] strArr2 = io.appmetrica.analytics.BuildConfig.DEFAULT_HOSTS;
        arrayList = new java.util.ArrayList();
        for (java.lang.String str2 : strArr2) {
            if (str2 == null || y1.g.T(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        linkedHashSet.addAll(arrayList);
        return new java.util.ArrayList(linkedHashSet);
    }

    public final java.util.List<java.lang.String> l() {
        return this.f5597e;
    }

    public final java.util.List<java.lang.String> m() {
        return this.f5596d;
    }

    public final boolean n() {
        return this.f5603k;
    }

    public final boolean o() {
        return this.f5604l;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final java.lang.String toString() {
        return "StartupRequestConfig{mStartupHostsFromStartup=" + this.f5596d + ", mStartupHostsFromClient=" + this.f5597e + ", mDistributionReferrer='" + this.f5598f + "', mInstallReferrerSource='" + this.f5599g + "', mClidsFromClient=" + this.f5600h + ", mNewCustomHosts=" + this.f5602j + ", mHasNewCustomHosts=" + this.f5603k + ", mSuccessfulStartup=" + this.f5604l + ", mCountryInit='" + this.f5605m + "', mFirstStartupTime=" + this.f5606n + "} " + super.toString();
    }

    public C0262bm(io.appmetrica.analytics.impl.C0514lg c0514lg, io.appmetrica.analytics.impl.H7 h7) {
        this.f5601i = new io.appmetrica.analytics.impl.C0656r3(null, io.appmetrica.analytics.impl.S7.f4954c);
        this.f5606n = 0L;
        this.f5607o = c0514lg;
        this.f5608p = h7;
    }

    public final void a(java.util.List<java.lang.String> list) {
        this.f5602j = list;
    }

    public final void a(boolean z2) {
        this.f5603k = z2;
    }

    public final void a(java.lang.String str) {
        this.f5605m = str;
    }
}
