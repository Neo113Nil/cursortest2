package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    public final yi f5088a;
    public final va b;
    public final j4 c;
    public final o4 d;
    public final a5 e;
    public final fa f;
    public final zd g;
    public final p1 h;
    public final v6 i;
    public final m3 j;
    public final x9 k;
    public final d0 l;
    public final c0 m;
    public final String n;
    public final ea o;
    public final r9 p;
    public final r0 q;
    public final i7 r;

    public y9(yi urlResolver, va intentResolver, j4 clickRequest, o4 clickTracking, a5 completeRequest, fa mediaType, zd openMeasurementImpressionCallback, p1 appRequest, v6 downloader, m3 viewProtocol, x9 impressionCounter, d0 adUnit, c0 adTypeTraits, String location, ea impressionCallback, r9 impressionClickCallback, r0 adUnitRendererImpressionCallback, i7 eventTracker) {
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(completeRequest, "completeRequest");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(downloader, "downloader");
        Intrinsics.checkNotNullParameter(viewProtocol, "viewProtocol");
        Intrinsics.checkNotNullParameter(impressionCounter, "impressionCounter");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(adTypeTraits, "adTypeTraits");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(impressionClickCallback, "impressionClickCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f5088a = urlResolver;
        this.b = intentResolver;
        this.c = clickRequest;
        this.d = clickTracking;
        this.e = completeRequest;
        this.f = mediaType;
        this.g = openMeasurementImpressionCallback;
        this.h = appRequest;
        this.i = downloader;
        this.j = viewProtocol;
        this.k = impressionCounter;
        this.l = adUnit;
        this.m = adTypeTraits;
        this.n = location;
        this.o = impressionCallback;
        this.p = impressionClickCallback;
        this.q = adUnitRendererImpressionCallback;
        this.r = eventTracker;
    }

    public final c0 a() {
        return this.m;
    }

    public final d0 b() {
        return this.l;
    }

    public final r0 c() {
        return this.q;
    }

    public final p1 d() {
        return this.h;
    }

    public final j4 e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return Intrinsics.areEqual(this.f5088a, y9Var.f5088a) && Intrinsics.areEqual(this.b, y9Var.b) && Intrinsics.areEqual(this.c, y9Var.c) && Intrinsics.areEqual(this.d, y9Var.d) && Intrinsics.areEqual(this.e, y9Var.e) && this.f == y9Var.f && Intrinsics.areEqual(this.g, y9Var.g) && Intrinsics.areEqual(this.h, y9Var.h) && Intrinsics.areEqual(this.i, y9Var.i) && Intrinsics.areEqual(this.j, y9Var.j) && Intrinsics.areEqual(this.k, y9Var.k) && Intrinsics.areEqual(this.l, y9Var.l) && Intrinsics.areEqual(this.m, y9Var.m) && Intrinsics.areEqual(this.n, y9Var.n) && Intrinsics.areEqual(this.o, y9Var.o) && Intrinsics.areEqual(this.p, y9Var.p) && Intrinsics.areEqual(this.q, y9Var.q) && Intrinsics.areEqual(this.r, y9Var.r);
    }

    public final o4 f() {
        return this.d;
    }

    public final a5 g() {
        return this.e;
    }

    public final v6 h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.f5088a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + this.p.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final i7 i() {
        return this.r;
    }

    public final ea j() {
        return this.o;
    }

    public final r9 k() {
        return this.p;
    }

    public final x9 l() {
        return this.k;
    }

    public final va m() {
        return this.b;
    }

    public final String n() {
        return this.n;
    }

    public final fa o() {
        return this.f;
    }

    public final zd p() {
        return this.g;
    }

    public final yi q() {
        return this.f5088a;
    }

    public final m3 r() {
        return this.j;
    }

    public String toString() {
        return "ImpressionDependency(urlResolver=" + this.f5088a + ", intentResolver=" + this.b + ", clickRequest=" + this.c + ", clickTracking=" + this.d + ", completeRequest=" + this.e + ", mediaType=" + this.f + ", openMeasurementImpressionCallback=" + this.g + ", appRequest=" + this.h + ", downloader=" + this.i + ", viewProtocol=" + this.j + ", impressionCounter=" + this.k + ", adUnit=" + this.l + ", adTypeTraits=" + this.m + ", location=" + this.n + ", impressionCallback=" + this.o + ", impressionClickCallback=" + this.p + ", adUnitRendererImpressionCallback=" + this.q + ", eventTracker=" + this.r + ")";
    }
}
