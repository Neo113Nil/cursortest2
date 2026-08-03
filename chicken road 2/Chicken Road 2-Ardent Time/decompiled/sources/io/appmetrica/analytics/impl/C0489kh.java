package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0489kh extends io.appmetrica.analytics.impl.N5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f6284d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6285e;

    /* renamed from: f, reason: collision with root package name */
    public int f6286f;

    /* renamed from: g, reason: collision with root package name */
    public int f6287g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6288h;

    /* renamed from: i, reason: collision with root package name */
    public int f6289i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Boolean f6290j;

    /* renamed from: k, reason: collision with root package name */
    public io.appmetrica.analytics.impl.InterfaceC0412hh f6291k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.InterfaceC0463jh f6292l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f6293m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f6294n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f6295o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f6296p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f6297q;

    /* renamed from: r, reason: collision with root package name */
    public int f6298r;

    /* renamed from: s, reason: collision with root package name */
    public long f6299s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f6300u;

    /* renamed from: v, reason: collision with root package name */
    public long f6301v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f6302w;

    /* renamed from: x, reason: collision with root package name */
    public java.util.Set f6303x = new java.util.HashSet();

    public C0489kh(io.appmetrica.analytics.impl.X4 x4) {
        this.f6292l = x4;
    }

    public final void a(int i2) {
        this.f6298r = i2;
    }

    public final void b(java.util.List<java.lang.String> list) {
        this.f6297q = list;
    }

    public final java.lang.String c() {
        return this.f6293m;
    }

    public final void d(boolean z2) {
        this.f6284d = z2;
    }

    public final void e(boolean z2) {
        this.f6288h = z2;
    }

    public final void f(boolean z2) {
        this.f6294n = z2;
    }

    public final boolean g() {
        return this.f6300u;
    }

    public final java.lang.String h() {
        return (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(this.f6296p, "");
    }

    public final boolean i() {
        return this.f6291k.a(this.f6290j);
    }

    public final int j() {
        return this.f6287g;
    }

    public final long k() {
        return this.f6301v;
    }

    public final int l() {
        return this.f6289i;
    }

    public final long m() {
        return this.f6299s;
    }

    public final long n() {
        return this.t;
    }

    public final java.util.List<java.lang.String> o() {
        return this.f6297q;
    }

    public final int p() {
        return this.f6286f;
    }

    public final boolean q() {
        return this.f6295o;
    }

    public final boolean r() {
        return this.f6285e;
    }

    public final boolean s() {
        return this.f6284d;
    }

    public final boolean t() {
        return this.f6294n;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final java.lang.String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f6284d + ", mFirstActivationAsUpdate=" + this.f6285e + ", mSessionTimeout=" + this.f6286f + ", mDispatchPeriod=" + this.f6287g + ", mLogEnabled=" + this.f6288h + ", mMaxReportsCount=" + this.f6289i + ", dataSendingEnabledFromArguments=" + this.f6290j + ", dataSendingStrategy=" + this.f6291k + ", mPreloadInfoSendingStrategy=" + this.f6292l + ", mApiKey='" + this.f6293m + "', mPermissionsCollectingEnabled=" + this.f6294n + ", mFeaturesCollectingEnabled=" + this.f6295o + ", mClidsFromStartupResponse='" + this.f6296p + "', mReportHosts=" + this.f6297q + ", mAttributionId=" + this.f6298r + ", mPermissionsCollectingIntervalSeconds=" + this.f6299s + ", mPermissionsForceSendIntervalSeconds=" + this.t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f6300u + ", mMaxReportsInDbCount=" + this.f6301v + ", mCertificates=" + this.f6302w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) this.f6297q) && this.f6300u;
    }

    public final boolean v() {
        return ((io.appmetrica.analytics.impl.X4) this.f6292l).B();
    }

    public final void a(long j2) {
        this.f6301v = j2;
    }

    public final void b(long j2) {
        this.f6299s = j2;
    }

    public final void c(long j2) {
        this.t = j2;
    }

    public final void d(int i2) {
        this.f6286f = i2;
    }

    public final java.util.Set<java.lang.String> e() {
        return this.f6303x;
    }

    public final java.util.List<java.lang.String> f() {
        return this.f6302w;
    }

    public final void a(java.util.List<java.lang.String> list) {
        this.f6302w = list;
    }

    public final void b(boolean z2) {
        this.f6295o = z2;
    }

    public final void c(boolean z2) {
        this.f6285e = z2;
    }

    public final int d() {
        return this.f6298r;
    }

    public final void a(java.lang.Boolean bool, io.appmetrica.analytics.impl.InterfaceC0412hh interfaceC0412hh) {
        this.f6290j = bool;
        this.f6291k = interfaceC0412hh;
    }

    public final void b(int i2) {
        this.f6287g = i2;
    }

    public final void c(int i2) {
        this.f6289i = i2;
    }

    public final void a(boolean z2) {
        this.f6300u = z2;
    }

    public final void a(java.util.Set<java.lang.String> set) {
        this.f6303x = set;
    }
}
