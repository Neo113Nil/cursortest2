package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.ph, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756ph extends U5 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f8071d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8072e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f8073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8074h;

    /* renamed from: i, reason: collision with root package name */
    public int f8075i;

    /* renamed from: j, reason: collision with root package name */
    public Boolean f8076j;

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC0678mh f8077k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC0730oh f8078l;

    /* renamed from: m, reason: collision with root package name */
    public String f8079m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8080n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8081o;

    /* renamed from: p, reason: collision with root package name */
    public String f8082p;

    /* renamed from: q, reason: collision with root package name */
    public List f8083q;

    /* renamed from: r, reason: collision with root package name */
    public int f8084r;

    /* renamed from: s, reason: collision with root package name */
    public long f8085s;

    /* renamed from: t, reason: collision with root package name */
    public long f8086t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f8087u;

    /* renamed from: v, reason: collision with root package name */
    public long f8088v;

    /* renamed from: w, reason: collision with root package name */
    public List f8089w;

    /* renamed from: x, reason: collision with root package name */
    public Set f8090x = new HashSet();

    public C0756ph(C0459e5 c0459e5) {
        this.f8078l = c0459e5;
    }

    public final void a(int i3) {
        this.f8084r = i3;
    }

    public final void b(List<String> list) {
        this.f8083q = list;
    }

    public final String c() {
        return this.f8079m;
    }

    public final void d(boolean z3) {
        this.f8071d = z3;
    }

    public final void e(boolean z3) {
        this.f8074h = z3;
    }

    public final void f(boolean z3) {
        this.f8080n = z3;
    }

    public final boolean g() {
        return this.f8087u;
    }

    public final String h() {
        return (String) WrapUtils.getOrDefault(this.f8082p, "");
    }

    public final boolean i() {
        return this.f8077k.a(this.f8076j);
    }

    public final int j() {
        return this.f8073g;
    }

    public final long k() {
        return this.f8088v;
    }

    public final int l() {
        return this.f8075i;
    }

    public final long m() {
        return this.f8085s;
    }

    public final long n() {
        return this.f8086t;
    }

    public final List<String> o() {
        return this.f8083q;
    }

    public final int p() {
        return this.f;
    }

    public final boolean q() {
        return this.f8081o;
    }

    public final boolean r() {
        return this.f8072e;
    }

    public final boolean s() {
        return this.f8071d;
    }

    public final boolean t() {
        return this.f8080n;
    }

    @Override // io.appmetrica.analytics.impl.U5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.f8071d + ", mFirstActivationAsUpdate=" + this.f8072e + ", mSessionTimeout=" + this.f + ", mDispatchPeriod=" + this.f8073g + ", mLogEnabled=" + this.f8074h + ", mMaxReportsCount=" + this.f8075i + ", dataSendingEnabledFromArguments=" + this.f8076j + ", dataSendingStrategy=" + this.f8077k + ", mPreloadInfoSendingStrategy=" + this.f8078l + ", mApiKey='" + this.f8079m + "', mPermissionsCollectingEnabled=" + this.f8080n + ", mFeaturesCollectingEnabled=" + this.f8081o + ", mClidsFromStartupResponse='" + this.f8082p + "', mReportHosts=" + this.f8083q + ", mAttributionId=" + this.f8084r + ", mPermissionsCollectingIntervalSeconds=" + this.f8085s + ", mPermissionsForceSendIntervalSeconds=" + this.f8086t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.f8087u + ", mMaxReportsInDbCount=" + this.f8088v + ", mCertificates=" + this.f8089w + "} " + super.toString();
    }

    public final boolean u() {
        return isIdentifiersValid() && !AbstractC0711no.a((Collection) this.f8083q) && this.f8087u;
    }

    public final boolean v() {
        return ((C0459e5) this.f8078l).B();
    }

    public final void a(long j3) {
        this.f8088v = j3;
    }

    public final void b(long j3) {
        this.f8085s = j3;
    }

    public final void c(long j3) {
        this.f8086t = j3;
    }

    public final void d(int i3) {
        this.f = i3;
    }

    public final Set<String> e() {
        return this.f8090x;
    }

    public final List<String> f() {
        return this.f8089w;
    }

    public final void a(List<String> list) {
        this.f8089w = list;
    }

    public final void b(boolean z3) {
        this.f8081o = z3;
    }

    public final void c(boolean z3) {
        this.f8072e = z3;
    }

    public final int d() {
        return this.f8084r;
    }

    public final void a(Boolean bool, InterfaceC0678mh interfaceC0678mh) {
        this.f8076j = bool;
        this.f8077k = interfaceC0678mh;
    }

    public final void b(int i3) {
        this.f8073g = i3;
    }

    public final void c(int i3) {
        this.f8075i = i3;
    }

    public final void a(boolean z3) {
        this.f8087u = z3;
    }

    public final void a(Set<String> set) {
        this.f8090x = set;
    }
}
